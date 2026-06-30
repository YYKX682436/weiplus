package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class dc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f289865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f289866f;

    public dc(java.lang.String str, android.app.Activity activity, android.content.Intent intent) {
        this.f289864d = str;
        this.f289865e = activity;
        this.f289866f = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(322L, 23L, 1L, true);
        java.lang.String str = this.f289864d;
        g0Var.d(11098, 4023, java.lang.String.format("%b|%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)), str));
        gm0.m.o();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        android.app.Activity activity = this.f289865e;
        if (K0) {
            android.app.Activity activity2 = this.f289865e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.content.Intent intent = this.f289866f;
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/ui/MMErrorProcessor$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity2, "com/tencent/mm/ui/MMErrorProcessor$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            db5.f.a(activity, intent);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", str);
        intent2.putExtra("showShare", false);
        intent2.putExtra("show_bottom", false);
        intent2.putExtra("needRedirect", false);
        intent2.putExtra("neverGetA8Key", true);
        intent2.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent2.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent2, null);
    }
}
