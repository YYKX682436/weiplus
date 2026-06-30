package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes5.dex */
public final class j0 extends com.tencent.mm.plugin.appbrand.jsapi.auth.l0 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f79593b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f79594c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.content.Context context, java.lang.String url) {
        super(null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(url, "url");
        this.f79593b = context;
        this.f79594c = url;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.l0
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f79594c);
        j45.l.j(this.f79593b, "webview", ".ui.tools.WebViewUI", intent.putExtra("forceHideShare", true), null);
    }
}
