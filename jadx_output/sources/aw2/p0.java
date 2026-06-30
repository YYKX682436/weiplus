package aw2;

/* loaded from: classes10.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.x0 f14789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(aw2.x0 x0Var) {
        super(0);
        this.f14789d = x0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f14789d.f14807d.getIntent().getIntExtra("KEY_FINDER_POST_TO_COMMENT_CHECK_STATUS", 1));
    }
}
