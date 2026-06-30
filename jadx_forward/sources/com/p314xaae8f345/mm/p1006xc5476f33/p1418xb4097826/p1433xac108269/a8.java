package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class a8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(java.lang.String str, android.content.Context context) {
        super(1);
        this.f183547d = str;
        this.f183548e = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String url = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f183547d, "click ".concat(url));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        j45.l.j(this.f183548e, "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f384359a;
    }
}
