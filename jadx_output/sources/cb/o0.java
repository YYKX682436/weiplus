package cb;

/* loaded from: classes13.dex */
public final /* synthetic */ class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final cb.l0 f40162d;

    public o0(cb.l0 l0Var) {
        this.f40162d = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final cb.l0 l0Var = this.f40162d;
        while (true) {
            synchronized (l0Var) {
                if (l0Var.f40140d != 2) {
                    return;
                }
                if (((java.util.ArrayDeque) l0Var.f40143g).isEmpty()) {
                    l0Var.c();
                    return;
                }
                final cb.c cVar = (cb.c) ((java.util.ArrayDeque) l0Var.f40143g).poll();
                l0Var.f40144h.put(cVar.f40106a, cVar);
                l0Var.f40145i.f40133b.schedule(new java.lang.Runnable(l0Var, cVar) { // from class: cb.p0

                    /* renamed from: d, reason: collision with root package name */
                    public final cb.l0 f40167d;

                    /* renamed from: e, reason: collision with root package name */
                    public final cb.c f40168e;

                    {
                        this.f40167d = l0Var;
                        this.f40168e = cVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cb.l0 l0Var2 = this.f40167d;
                        int i17 = this.f40168e.f40106a;
                        synchronized (l0Var2) {
                            cb.c cVar2 = (cb.c) l0Var2.f40144h.get(i17);
                            if (cVar2 != null) {
                                l0Var2.f40144h.remove(i17);
                                cVar2.b(new cb.d(3, "Timed out waiting for response"));
                                l0Var2.c();
                            }
                        }
                    }
                }, 30L, java.util.concurrent.TimeUnit.SECONDS);
                if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(cVar).length() + 8);
                }
                android.content.Context context = l0Var.f40145i.f40132a;
                android.os.Messenger messenger = l0Var.f40141e;
                android.os.Message obtain = android.os.Message.obtain();
                obtain.what = cVar.f40108c;
                obtain.arg1 = cVar.f40106a;
                obtain.replyTo = messenger;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("oneWay", cVar.d());
                bundle.putString("pkg", context.getPackageName());
                bundle.putBundle(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, cVar.f40109d);
                obtain.setData(bundle);
                try {
                    cb.q0 q0Var = l0Var.f40142f;
                    android.os.Messenger messenger2 = q0Var.f40174a;
                    if (messenger2 == null) {
                        com.google.firebase.iid.zzi zziVar = q0Var.f40175b;
                        if (zziVar == null) {
                            throw new java.lang.IllegalStateException("Both messengers are null");
                            break;
                        } else {
                            android.os.Messenger messenger3 = zziVar.f44662d;
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
