package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes4.dex */
public class jf implements yn.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f285787d;

    @Override // yn.l
    public void E() {
    }

    @Override // yn.l
    public void J() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLifecycleChangedListener", "onChattingExitAnimEnd");
        java.lang.ref.WeakReference weakReference = this.f285787d;
        if (weakReference == null) {
            return;
        }
        yb5.d dVar = (yb5.d) weakReference.get();
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingLifecycleChangedListener", "onChattingExitAnimEnd ui is unull");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLifecycleChangedListener", "onChattingExitAnimEnd ui:%s", dVar);
        c01.n2.d().e(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mf.a(dVar));
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y4) ((yn.j) dVar.f542241c.a(yn.j.class))).c(this);
        k01.x0 x0Var = (k01.x0) i95.n0.c(k01.x0.class);
        java.lang.String a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mf.a(dVar);
        synchronized (((oh1.k2) x0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaUpdateableMsgService", "removeOnUpdatbleMsgInfoChange token:%s", a17);
            java.util.List<oh1.e2> list = (java.util.List) ((java.util.HashMap) oh1.k2.f426780e).get(a17);
            if (list == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaUpdateableMsgService", "[removeOnUpdatbleMsgInfoChange]getUpdatableMsgWorkers is null, err");
                return;
            }
            for (oh1.e2 e2Var : list) {
                e2Var.getClass();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) oh1.j2.INSTANCE.f426774d;
                concurrentHashMap.size();
                concurrentHashMap.remove(java.lang.Integer.valueOf(e2Var.f426738b.hashCode()));
            }
            ((java.util.HashMap) oh1.k2.f426780e).remove(a17);
        }
    }

    @Override // yn.l
    public void K() {
    }

    @Override // yn.l
    public void a() {
    }

    @Override // yn.l
    public void x() {
        ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaUpdateableMsgService", "startUpdatbleMsgInfoChange");
        oh1.j2 j2Var = oh1.j2.INSTANCE;
        synchronized (j2Var) {
            j2Var.f426775e.set(false);
            j2Var.h();
            j2Var.f426776f.set(0);
        }
    }

    @Override // yn.l
    public void y() {
        ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaUpdateableMsgService", "stopOnUpdatbleMsgInfoChange");
        oh1.j2 j2Var = oh1.j2.INSTANCE;
        synchronized (j2Var) {
            j2Var.f426775e.set(true);
        }
    }

    @Override // yn.l
    public void z() {
    }
}
