package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class b8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f183566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183567f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(java.lang.String str, android.content.Intent intent, android.content.Context context) {
        super(1);
        this.f183565d = str;
        this.f183566e = intent;
        this.f183567f = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String url = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f183565d, "click ".concat(url));
        android.content.Intent intent = this.f183566e;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("rawUrl", url);
        j45.l.j(this.f183567f, "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f384359a;
    }
}
