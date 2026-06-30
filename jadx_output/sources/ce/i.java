package ce;

/* loaded from: classes7.dex */
public abstract class i implements com.tencent.mm.plugin.appbrand.page.r4 {
    @Override // com.tencent.mm.plugin.appbrand.page.r4
    public boolean b(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.i3 i3Var, com.tencent.mm.plugin.appbrand.page.u4 u4Var) {
        int ordinal = wdVar.ordinal();
        if (ordinal == 0) {
            u4Var.a();
            return true;
        }
        if (ordinal != 6) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = i3Var.getCurrentPage();
        com.tencent.mm.plugin.appbrand.page.wd wdVar2 = com.tencent.mm.plugin.appbrand.page.wd.AUTO_RE_LAUNCH;
        i3Var.G(null, currentPage, wdVar2, str, false);
        i3Var.getCurrentPage().C(0L, str, wdVar);
        i3Var.F(null, i3Var.getCurrentPage(), wdVar2);
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r4
    public boolean c(com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        return v5Var != null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r4
    public com.tencent.mm.plugin.appbrand.page.w2 d(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar, com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.util.concurrent.Callable callable) {
        return new ce.h(i3Var.getContext(), i3Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r4
    public boolean e(java.lang.String str) {
        return true;
    }
}
