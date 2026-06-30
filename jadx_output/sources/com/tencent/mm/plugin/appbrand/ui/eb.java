package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class eb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.o f89688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI f89689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89690f;

    public eb(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.o oVar, com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI appBrandUserProfileAuthorizeUI, java.lang.String str) {
        this.f89688d = oVar;
        this.f89689e = appBrandUserProfileAuthorizeUI;
        this.f89690f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandUserProfileAuthorizeUI$onCreate$6$updateAddNewAvatarEntry$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        androidx.appcompat.app.AppCompatActivity context = this.f89689e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f89688d.a(context, this.f89690f);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandUserProfileAuthorizeUI$onCreate$6$updateAddNewAvatarEntry$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
