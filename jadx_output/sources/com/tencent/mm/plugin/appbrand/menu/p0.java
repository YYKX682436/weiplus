package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class p0 extends nh1.a {
    public p0() {
        super(39);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        rh1.c V2 = ((com.tencent.mm.plugin.appbrand.page.n7) v5Var).getRuntime().V2();
        if (V2 != null) {
            if (!V2.f395627x.u0().f77292e2) {
                com.tencent.mm.plugin.multitask.i1 i1Var = (com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class));
                if (!i1Var.Di()) {
                    java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.a2p);
                    java.util.Map map = i81.j.f289592a;
                    g4Var.l(this.f337084a, string, com.tencent.mm.R.raw.icons_outlined_multitask, context instanceof com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI);
                    return;
                }
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = V2.f300077a;
                if (multiTaskInfo != null && i1Var.cj(multiTaskInfo)) {
                    int i17 = this.f337084a;
                    java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.f490646n46);
                    int color = context.getResources().getColor(com.tencent.mm.R.color.agw);
                    java.util.Map map2 = i81.j.f289592a;
                    g4Var.j(i17, string2, com.tencent.mm.R.raw.star_filled, color, context instanceof com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI);
                    return;
                }
                int i18 = this.f337084a;
                java.lang.String string3 = context.getResources().getString(com.tencent.mm.R.string.f490645n45);
                int color2 = context.getResources().getColor(com.tencent.mm.R.color.agw);
                java.util.Map map3 = i81.j.f289592a;
                g4Var.j(i18, string3, com.tencent.mm.R.raw.star_heavy, color2, context instanceof com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI);
            }
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        com.tencent.mm.plugin.appbrand.menu.o0 o0Var = new com.tencent.mm.plugin.appbrand.menu.o0(this, n7Var.getRuntime(), n7Var);
        if (n7Var.getRuntime().J2.a(n7Var.getRuntime(), true, o0Var)) {
            return;
        }
        o0Var.run();
    }
}
