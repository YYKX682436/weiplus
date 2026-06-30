package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class i4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.w4 f89775e;

    public i4(com.tencent.mm.plugin.appbrand.ui.w4 w4Var, java.lang.String str) {
        this.f89775e = w4Var;
        this.f89774d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandGameUILoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j45.l.j(this.f89775e.f90295x.r0(), "webview", ".ui.tools.WebViewUI", new android.content.Intent().putExtra("rawUrl", this.f89774d).putExtra("forceHideShare", true), null);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandGameUILoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
