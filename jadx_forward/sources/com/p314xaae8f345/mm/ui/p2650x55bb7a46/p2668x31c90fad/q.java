package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad;

/* loaded from: classes.dex */
public final class q implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f283511e;

    public q(java.lang.String str, android.content.Context context) {
        this.f283510d = str;
        this.f283511e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f283510d;
        intent.putExtra("rawUrl", str);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        j45.l.j(this.f283511e, "webview", ".ui.tools.WebViewUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17509, 1, str);
    }
}
