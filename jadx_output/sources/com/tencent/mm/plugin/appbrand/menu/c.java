package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public final class c extends nh1.a {
    public c() {
        super(35);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        if (!k01.j.f303039a.b(null, str) || g4Var == null) {
            return;
        }
        g4Var.g(this.f337084a, context.getString(com.tencent.mm.R.string.d4g), com.tencent.mm.R.raw.app_brand_menu_comment_feedback);
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        if (k01.j.f303039a.b(null, str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegateCommentFeedBack", "MenuDelegateCommentFeedBack perform click, send event");
            le1.a aVar = new le1.a();
            aVar.t(kz5.b1.e(new jz5.l("event", 35)));
            aVar.v(pageView.getRuntime().C0(), pageView.getComponentId());
            aVar.m();
        }
    }
}
