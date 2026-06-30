package ha0;

/* loaded from: classes8.dex */
public final class k implements com.p314xaae8f345.mm.app.a3 {
    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: getHandler */
    public android.os.Handler mo14497x67189314() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppBackground */
    public void mo510x3be51a90(java.lang.String activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class);
        i1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i1Var.f231978d, "onAppBackground, activity:%s", activity);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.w0 w0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.f231976w;
        if (w0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) w0Var).e7(com.p314xaae8f345.mm.app.w.INSTANCE.f135422n);
        }
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppForeground */
    public void mo511x1952ea5(java.lang.String activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class);
        i1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i1Var.f231978d, "onAppForeground, activity:%s", activity);
        if (com.p314xaae8f345.mm.app.w.INSTANCE.f135422n && gm0.j1.a()) {
            boolean V0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i1Var.f231978d, "onAppForeground isTopApplication: %b", java.lang.Boolean.valueOf(V0));
            if (V0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.w0 w0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.f231976w;
                if (w0Var != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) w0Var).e7(true);
                }
                i1Var.oj();
            }
        }
    }
}
