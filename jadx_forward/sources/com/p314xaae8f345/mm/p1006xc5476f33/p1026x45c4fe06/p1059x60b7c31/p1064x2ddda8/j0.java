package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes5.dex */
public final class j0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l0 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f161126b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f161127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.content.Context context, java.lang.String url) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f161126b = context;
        this.f161127c = url;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l0
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f161127c);
        j45.l.j(this.f161126b, "webview", ".ui.tools.WebViewUI", intent.putExtra("forceHideShare", true), null);
    }
}
