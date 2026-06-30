package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class a8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102015e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(java.lang.String str, android.content.Context context) {
        super(1);
        this.f102014d = str;
        this.f102015e = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String url = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i(this.f102014d, "click ".concat(url));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        j45.l.j(this.f102015e, "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f302826a;
    }
}
