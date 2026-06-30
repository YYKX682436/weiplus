package cb;

/* loaded from: classes13.dex */
public final /* synthetic */ class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final cb.l0 f121695d;

    public o0(cb.l0 l0Var) {
        this.f121695d = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final cb.l0 l0Var = this.f121695d;
        while (true) {
            synchronized (l0Var) {
                if (l0Var.f121673d != 2) {
                    return;
                }
                if (((java.util.ArrayDeque) l0Var.f121676g).isEmpty()) {
                    l0Var.c();
                    return;
                }
                final cb.c cVar = (cb.c) ((java.util.ArrayDeque) l0Var.f121676g).poll();
                l0Var.f121677h.put(cVar.f121639a, cVar);
                l0Var.f121678i.f121666b.schedule(new java.lang.Runnable(l0Var, cVar) { // from class: cb.p0

                    /* renamed from: d, reason: collision with root package name */
                    public final cb.l0 f121700d;

                    /* renamed from: e, reason: collision with root package name */
                    public final cb.c f121701e;

                    {
                        this.f121700d = l0Var;
                        this.f121701e = cVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cb.l0 l0Var2 = this.f121700d;
                        int i17 = this.f121701e.f121639a;
                        synchronized (l0Var2) {
                            cb.c cVar2 = (cb.c) l0Var2.f121677h.get(i17);
                            if (cVar2 != null) {
                                l0Var2.f121677h.remove(i17);
                                cVar2.b(new cb.d(3, "Timed out waiting for response"));
                                l0Var2.c();
                            }
                        }
                    }
                }, 30L, java.util.concurrent.TimeUnit.SECONDS);
                if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(cVar).length() + 8);
                }
                android.content.Context context = l0Var.f121678i.f121665a;
                android.os.Messenger messenger = l0Var.f121674e;
                android.os.Message obtain = android.os.Message.obtain();
                obtain.what = cVar.f121641c;
                obtain.arg1 = cVar.f121639a;
                obtain.replyTo = messenger;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("oneWay", cVar.d());
                bundle.putString("pkg", context.getPackageName());
                bundle.putBundle(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, cVar.f121642d);
                obtain.setData(bundle);
                try {
                    cb.q0 q0Var = l0Var.f121675f;
                    android.os.Messenger messenger2 = q0Var.f121707a;
                    if (messenger2 == null) {
                        com.p176xb6135e39.p271xde6bf207.iid.zzi zziVar = q0Var.f121708b;
                        if (zziVar == null) {
                            throw new java.lang.IllegalStateException("Both messengers are null");
                            break;
                        } else {
                            android.os.Messenger messenger3 = zziVar.f126195d;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } else {
                        messenger2.send(obtain);
                    }
                } catch (android.os.RemoteException e17) {
                    l0Var.a(2, e17.getMessage());
                }
            }
        }
    }
}
