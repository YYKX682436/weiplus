package gc0;

/* loaded from: classes5.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gc0.e1 f351656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(gc0.e1 e1Var) {
        super(0);
        this.f351656d = e1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f351656d.f351675a.getIntent().getStringExtra("Contact_User");
        return stringExtra == null ? "" : stringExtra;
    }
}
