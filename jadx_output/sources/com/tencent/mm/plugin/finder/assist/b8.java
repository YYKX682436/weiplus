package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class b8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f102033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102034f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(java.lang.String str, android.content.Intent intent, android.content.Context context) {
        super(1);
        this.f102032d = str;
        this.f102033e = intent;
        this.f102034f = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String url = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i(this.f102032d, "click ".concat(url));
        android.content.Intent intent = this.f102033e;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("rawUrl", url);
        j45.l.j(this.f102034f, "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f302826a;
    }
}
