package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class b5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.j5 f79419d;

    public b5(com.tencent.mm.plugin.appbrand.jsapi.auth.j5 j5Var) {
        this.f79419d = j5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/auth/WxaCarLicensePlateChooserViewController$initHalfScreenDialog$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.jsapi.auth.j5 j5Var = this.f79419d;
        j5Var.f79607h.f61922j = 2L;
        j5Var.i(j5Var.h(), new com.tencent.mm.plugin.appbrand.jsapi.auth.h5(j5Var));
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/auth/WxaCarLicensePlateChooserViewController$initHalfScreenDialog$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
