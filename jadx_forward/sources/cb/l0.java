package cb;

/* loaded from: classes13.dex */
public final class l0 implements android.content.ServiceConnection {

    /* renamed from: f, reason: collision with root package name */
    public cb.q0 f121675f;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ cb.j0 f121678i;

    /* renamed from: d, reason: collision with root package name */
    public int f121673d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Messenger f121674e = new android.os.Messenger(new android.os.Handler(android.os.Looper.getMainLooper(), new android.os.Handler.Callback(this) { // from class: cb.m0

        /* renamed from: d, reason: collision with root package name */
        public final cb.l0 f121687d;

        {
            this.f121687d = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(android.os.Message message) {
            cb.l0 l0Var = this.f121687d;
            l0Var.getClass();
            int i17 = message.arg1;
            android.util.Log.isLoggable("MessengerIpcClient", 3);
            synchronized (l0Var) {
                cb.c cVar = (cb.c) l0Var.f121677h.get(i17);
                if (cVar == null) {
                    return true;
                }
                l0Var.f121677h.remove(i17);
                l0Var.c();
                android.os.Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    cVar.b(new cb.d(4, "Not supported by GmsCore"));
                    return true;
                }
                cVar.c(data);
                return true;
            }
        }
    }));

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Queue f121676g = new java.util.ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SparseArray f121677h = new android.util.SparseArray();

    public l0(cb.j0 j0Var, cb.k0 k0Var) {
        this.f121678i = j0Var;
    }

    public final synchronized void a(int i17, java.lang.String str) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            java.lang.String valueOf = java.lang.String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            }
        }
        int i18 = this.f121673d;
        if (i18 == 0) {
            throw new java.lang.IllegalStateException();
        }
        if (i18 != 1 && i18 != 2) {
            if (i18 == 3) {
                this.f121673d = 4;
                return;
            } else {
                if (i18 == 4) {
                    return;
                }
                int i19 = this.f121673d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(26);
                sb6.append("Unknown state: ");
                sb6.append(i19);
                throw new java.lang.IllegalStateException(sb6.toString());
            }
        }
        android.util.Log.isLoggable("MessengerIpcClient", 2);
        this.f121673d = 4;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a.m18493x9cf0d20b().m18495xa4bc737f(this.f121678i.f121665a, this);
        cb.d dVar = new cb.d(i17, str);
        java.util.Iterator it = ((java.util.ArrayDeque) this.f121676g).iterator();
        while (it.hasNext()) {
            ((cb.c) it.next()).b(dVar);
        }
        ((java.util.ArrayDeque) this.f121676g).clear();
        for (int i27 = 0; i27 < this.f121677h.size(); i27++) {
            ((cb.c) this.f121677h.valueAt(i27)).b(dVar);
        }
        this.f121677h.clear();
    }

    public final synchronized boolean b(cb.c cVar) {
        int i17 = this.f121673d;
        if (i17 == 0) {
            ((java.util.ArrayDeque) this.f121676g).add(cVar);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18220xe071d469(this.f121673d == 0);
            android.util.Log.isLoggable("MessengerIpcClient", 2);
            this.f121673d = 1;
            android.content.Intent intent = new android.content.Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a.m18493x9cf0d20b().m18494x54856bb8(this.f121678i.f121665a, intent, this, 1)) {
                this.f121678i.f121666b.schedule(new java.lang.Runnable(this) { // from class: cb.n0

                    /* renamed from: d, reason: collision with root package name */
                    public final cb.l0 f121689d;

                    {
                        this.f121689d = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cb.l0 l0Var = this.f121689d;
                        synchronized (l0Var) {
                            if (l0Var.f121673d == 1) {
                                l0Var.a(1, "Timed out while binding");
                            }
                        }
                    }
                }, 30L, java.util.concurrent.TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
            return true;
        }
        if (i17 == 1) {
            ((java.util.ArrayDeque) this.f121676g).add(cVar);
            return true;
        }
        if (i17 == 2) {
            ((java.util.ArrayDeque) this.f121676g).add(cVar);
            this.f121678i.f121666b.execute(new cb.o0(this));
            return true;
        }
        if (i17 != 3 && i17 != 4) {
            int i18 = this.f121673d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(26);
            sb6.append("Unknown state: ");
            sb6.append(i18);
            throw new java.lang.IllegalStateException(sb6.toString());
        }
        return false;
    }

    public final synchronized void c() {
        if (this.f121673d == 2 && ((java.util.ArrayDeque) this.f121676g).isEmpty() && this.f121677h.size() == 0) {
            android.util.Log.isLoggable("MessengerIpcClient", 2);
            this.f121673d = 3;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p217x68ac49f.C1980x61745a5a.m18493x9cf0d20b().m18495xa4bc737f(this.f121678i.f121665a, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        android.util.Log.isLoggable("MessengerIpcClient", 2);
        if (iBinder == null) {
            a(0, "Null service connection");
            return;
        }
        try {
            this.f121675f = new cb.q0(iBinder);
            this.f121673d = 2;
            this.f121678i.f121666b.execute(new cb.o0(this));
        } catch (android.os.RemoteException e17) {
            a(0, e17.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(android.content.ComponentName componentName) {
        android.util.Log.isLoggable("MessengerIpcClient", 2);
        a(2, "Service disconnected");
    }
}
