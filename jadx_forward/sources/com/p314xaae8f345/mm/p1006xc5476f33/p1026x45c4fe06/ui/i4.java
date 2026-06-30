package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class i4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 f171308e;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 w4Var, java.lang.String str) {
        this.f171308e = w4Var;
        this.f171307d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandGameUILoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j45.l.j(this.f171308e.f171828x.r0(), "webview", ".ui.tools.WebViewUI", new android.content.Intent().putExtra("rawUrl", this.f171307d).putExtra("forceHideShare", true), null);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandGameUILoadingSplash$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
