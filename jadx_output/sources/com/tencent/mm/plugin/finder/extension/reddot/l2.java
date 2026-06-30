package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {
    public l2(com.tencent.mm.plugin.finder.extension.reddot.m2 m2Var) {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var = jz5.f0.f302826a;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("FinderRedDotAvatarService", "notifyPreload, account not initialized!");
            return f0Var;
        }
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) c17)).nk();
        zy2.z9[] z9VarArr = zy2.z9.f477641d;
        com.tencent.mm.plugin.finder.extension.reddot.k2 k2Var = (com.tencent.mm.plugin.finder.extension.reddot.k2) ((jz5.n) ((com.tencent.mm.plugin.finder.extension.reddot.x2) nk6).f105978f).getValue();
        int i17 = com.tencent.mm.plugin.finder.extension.reddot.k2.f105623a;
        k2Var.d(1, null);
        m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderRedDotAvatarService", m524exceptionOrNullimpl, "notifyPreload crash!", new java.lang.Object[0]);
        }
        return f0Var;
    }
}
