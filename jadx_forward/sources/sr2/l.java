package sr2;

/* loaded from: classes.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.o f493149d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(sr2.o oVar) {
        super(1);
        this.f493149d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        sr2.o oVar = this.f493149d;
        oVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://ad.weixin.qq.com/pdf.html?post_id=U2FsdGVkX1+eLpg6lni/bsBHdEgonVf3L06aSrxhqhE=");
        j45.l.j(oVar.m80379x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f384359a;
    }
}
