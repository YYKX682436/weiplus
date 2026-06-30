package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes12.dex */
public class hc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ic f280693d;

    public hc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ic icVar) {
        this.f280693d = icVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ic icVar = this.f280693d;
        sb5.z zVar = icVar.f280755b;
        long m124847x74d37ac6 = icVar.f280756c.m124847x74d37ac6();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = icVar.f280756c;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar;
        java.util.HashMap hashMap = (java.util.HashMap) kVar.Q;
        if (hashMap.containsKey(java.lang.Long.valueOf(m124847x74d37ac6))) {
            if (((java.util.HashMap) kVar.R).containsKey(java.lang.Long.valueOf(m124847x74d37ac6))) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.get(java.lang.Long.valueOf(m124847x74d37ac6));
                android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
                if (view != null) {
                    java.lang.Object tag = view.getTag();
                    if (tag instanceof ze5.w6) {
                        ze5.w6 w6Var = (ze5.w6) tag;
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22081xf5de6b82 c22081xf5de6b82 = w6Var.f553817c;
                        android.app.Activity g17 = kVar.K.g();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
                        java.lang.String z07 = f9Var != null ? f9Var.z0() : null;
                        if (z07 == null) {
                            z07 = "";
                        }
                        int i17 = !w6Var.f39491xbb6bd679.M() ? 1 : 0;
                        c22081xf5de6b82.getClass();
                        j15.a ij6 = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).ij(f9Var);
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        m11.b1.Di().y4(f9Var, c22081xf5de6b82.m80095x1cddf0a2().b(), z07, i65.a.g(g17), ij6.q(), ij6.n(), true, com.p314xaae8f345.mm.R.C30861xcebc809e.bzt, c22081xf5de6b82.m80095x1cddf0a2().c(), com.p314xaae8f345.mm.R.C30861xcebc809e.f562680lw, i17, true, null);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterV3", "msg not display, " + m124847x74d37ac6);
    }
}
