package aw2;

/* loaded from: classes10.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.x0 f14802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(aw2.x0 x0Var) {
        super(0);
        this.f14802d = x0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f14802d.f14807d.getIntent().getStringExtra("KEY_FINDER_TARGET_TEMPLATE_ID");
        return stringExtra == null ? "" : stringExtra;
    }
}
