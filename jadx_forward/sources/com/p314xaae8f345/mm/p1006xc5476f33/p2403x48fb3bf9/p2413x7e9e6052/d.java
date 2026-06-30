package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes8.dex */
public class d implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 f264781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f264782b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264783c;

    public d(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 w1Var, android.content.Context context, java.lang.String str) {
        this.f264781a = w1Var;
        this.f264782b = context;
        this.f264783c = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 w1Var = this.f264781a;
        if (w1Var != null) {
            w1Var.a(z17, str);
        }
        android.content.Context context = this.f264782b;
        java.lang.String str2 = this.f264783c;
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str2));
        intent.addFlags(268435456);
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(context) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
                android.content.Intent a17 = hx4.r.a(context, intent, str2, false);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(a17);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "openBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "openBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            if (fp.h.c(29)) {
                android.app.PendingIntent.getActivity(context, 0, intent, fp.g0.a(134217728)).send(context, 1, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.e(), null);
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "openBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "openBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrowserChooserHelper", "open in browser failed : %s", e17.getMessage());
        }
    }
}
