package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public final class h3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f266320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f266321b;

    public h3(android.net.Uri uri, android.content.Context context) {
        this.f266320a = uri;
        this.f266321b = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO", this.f266320a);
            intent.addFlags(268435456);
            try {
                android.content.Context context = this.f266321b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SMSQueryHelper$Companion$showDialog$build$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/SMSQueryHelper$Companion$showDialog$build$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUI.SMSQueryHelper", "start sms app failed:[%s]", e17.getMessage());
            }
        }
    }
}
