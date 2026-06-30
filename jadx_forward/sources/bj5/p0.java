package bj5;

/* loaded from: classes.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.r0 f102748d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(bj5.r0 r0Var) {
        super(0);
        this.f102748d = r0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f102748d.m158359x1e885992().getStringExtra("INTENT_KEY_PAGE_SESSION_ID");
        return stringExtra == null ? "" : stringExtra;
    }
}
