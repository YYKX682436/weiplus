package aw2;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aw2.n f96302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, aw2.n nVar) {
        super(0);
        this.f96301d = str;
        this.f96302e = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f96301d);
        j45.l.j(this.f96302e.f96309d, "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f384359a;
    }
}
