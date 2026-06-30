package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class eb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f267596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267599g;

    public eb(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, java.lang.String str, nw4.k kVar, nw4.y2 y2Var) {
        this.f267596d = z2Var;
        this.f267597e = str;
        this.f267598f = kVar;
        this.f267599g = y2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber$showRequestPhoneNumDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f267596d.B();
        java.lang.String str = this.f267597e;
        boolean z17 = str == null || str.length() == 0;
        nw4.y2 y2Var = this.f267599g;
        nw4.k kVar = this.f267598f;
        if (z17) {
            kVar.f422396d.e(y2Var.f422546c, "requestBindPhoneNumber:fail not bind phone", null);
        } else {
            kVar.f422396d.e(y2Var.f422546c, "requestBindPhoneNumber:ok", kz5.b1.e(new jz5.l("phoneNumber", str)));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiRequestBindPhoneNumber$showRequestPhoneNumDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
