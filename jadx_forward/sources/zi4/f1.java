package zi4;

/* loaded from: classes9.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.g1 f554744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.nb f554745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(zi4.g1 g1Var, bw5.nb nbVar) {
        super(0);
        this.f554744d = g1Var;
        this.f554745e = nbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zi4.g1 g1Var = this.f554744d;
        java.lang.ref.WeakReference weakReference = g1Var.f554714e;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        bw5.nb nbVar = this.f554745e;
        java.lang.String str = nbVar.f112130e[1] ? nbVar.f112129d : "";
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(g1Var.f554754g, "jumpPoiPage: failed");
        } else {
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", str);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 0);
            j45.l.n(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, 213);
        }
        return jz5.f0.f384359a;
    }
}
