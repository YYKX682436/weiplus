package aw2;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aw2.n f14769e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, aw2.n nVar) {
        super(0);
        this.f14768d = str;
        this.f14769e = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f14768d);
        j45.l.j(this.f14769e.f14776d, "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f302826a;
    }
}
