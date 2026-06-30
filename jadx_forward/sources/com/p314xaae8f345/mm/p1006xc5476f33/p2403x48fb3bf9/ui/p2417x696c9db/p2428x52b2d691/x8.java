package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class x8 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268192c;

    public x8(java.lang.String str, nw4.k kVar, nw4.y2 y2Var) {
        this.f268190a = str;
        this.f268191b = kVar;
        this.f268192c = y2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        nw4.y2 y2Var = this.f268192c;
        nw4.k kVar = this.f268191b;
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(this.f268190a));
            intent.addFlags(268435456);
            android.content.Context context = kVar.f422393a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenUrlByExtBrowser$handleMsg$3", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenUrlByExtBrowser$handleMsg$3", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            kVar.f422396d.e(y2Var.f422546c, "open_url_by_ext_browser:ok", null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenUrlByExtBrowser", e17, "openUrlByExtBrowser exception", new java.lang.Object[0]);
            kVar.f422396d.e(y2Var.f422546c, "open_url_by_ext_browser:fail", null);
        }
    }
}
