package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class oc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm.a f291000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f291001e;

    public oc(tm.a aVar, android.content.Context context) {
        this.f291000d = aVar;
        this.f291001e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(this.f291000d.f501931a);
        sb6.append("&wechat_real_lang=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
        intent.putExtra("rawUrl", sb6.toString());
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        j45.l.j(this.f291001e, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
