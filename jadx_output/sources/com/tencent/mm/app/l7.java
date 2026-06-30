package com.tencent.mm.app;

/* loaded from: classes7.dex */
public class l7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f53508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.d9 f53509f;

    public l7(java.lang.String str, android.content.Context context, com.tencent.mm.sdk.platformtools.d9 d9Var) {
        this.f53507d = str;
        this.f53508e = context;
        this.f53509f = d9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f53507d);
        j45.l.j(this.f53508e, "webview", ".ui.tools.WebViewUI", intent, null);
        m3.a aVar = this.f53509f.f192544h;
        if (aVar != null) {
            aVar.accept(0);
        }
    }
}
