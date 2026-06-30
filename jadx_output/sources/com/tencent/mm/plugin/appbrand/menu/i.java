package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class i extends nh1.a {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.menu.h f85971b;

    public i() {
        super(30);
        this.f85971b = new com.tencent.mm.plugin.appbrand.menu.h(null);
    }

    public static com.tencent.mm.plugin.appbrand.menu.v0 d(com.tencent.mm.plugin.appbrand.page.n7 n7Var, android.content.Context context) {
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = n7Var.getRuntime().E0();
        int a17 = E0 != null ? k91.a.f305522f.a(E0) : 0;
        int i17 = kj1.z.f308383a;
        if (!((java.lang.Boolean) kj1.y.f308382d.invoke()).booleanValue() || a17 == 1) {
            return com.tencent.mm.plugin.appbrand.menu.v0.HIDDEN;
        }
        if (com.tencent.mm.plugin.appbrand.menu.l0.e(n7Var) && a17 == 0 && !wa1.b.a(n7Var.getRuntime())) {
            java.util.Map map = i81.j.f289592a;
            if (!(context instanceof com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI)) {
                return com.tencent.mm.plugin.appbrand.menu.v0.SHOW_CLICKABLE;
            }
        }
        return com.tencent.mm.plugin.appbrand.menu.v0.SHOW_UNCLICKABLE;
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        int ordinal = d((com.tencent.mm.plugin.appbrand.page.n7) v5Var, context).ordinal();
        int i17 = this.f337084a;
        if (ordinal == 1) {
            g4Var.g(i17, context.getString(com.tencent.mm.R.string.f490087kj), com.tencent.mm.R.raw.app_brand_menu_copy_shortlink);
        } else {
            if (ordinal != 2) {
                return;
            }
            g4Var.l(i17, context.getString(com.tencent.mm.R.string.f490087kj), com.tencent.mm.R.raw.app_brand_menu_copy_shortlink, true);
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        com.tencent.mm.plugin.appbrand.menu.h hVar = this.f85971b;
        hVar.f85953a = str;
        hVar.f85954b = n7Var.X1();
        hVar.f85955c = n7Var;
        com.tencent.mm.plugin.appbrand.jsapi.vf.f83519a.b(com.tencent.mm.plugin.appbrand.jsapi.d1.f80731d, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, hVar);
        new com.tencent.mm.plugin.appbrand.jsapi.t0(true).x(n7Var.getComponentId(), n7Var.U1());
    }
}
