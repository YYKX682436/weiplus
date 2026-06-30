package com.p314xaae8f345.mm.app;

/* loaded from: classes7.dex */
public class l7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f135041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.d9 f135042f;

    public l7(java.lang.String str, android.content.Context context, com.p314xaae8f345.mm.sdk.p2603x2137b148.d9 d9Var) {
        this.f135040d = str;
        this.f135041e = context;
        this.f135042f = d9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f135040d);
        j45.l.j(this.f135041e, "webview", ".ui.tools.WebViewUI", intent, null);
        m3.a aVar = this.f135042f.f274077h;
        if (aVar != null) {
            aVar.mo3938xab27b508(0);
        }
    }
}
