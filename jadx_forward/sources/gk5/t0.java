package gk5;

/* loaded from: classes9.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.v0 f354252d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(gk5.v0 v0Var) {
        super(0);
        this.f354252d = v0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f354252d.m158359x1e885992().getStringExtra("received_card_name");
        return stringExtra == null ? "" : stringExtra;
    }
}
