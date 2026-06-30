package bj5;

/* loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.r0 f21215d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(bj5.r0 r0Var) {
        super(0);
        this.f21215d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f21215d.getIntent().getStringExtra("INTENT_KEY_PAGE_SESSION_ID");
        return stringExtra == null ? "" : stringExtra;
    }
}
