package bj5;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.r0 f21213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(bj5.r0 r0Var) {
        super(0);
        this.f21213d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f21213d.getIntent().getIntExtra("INTENT_KEY_SELECT_CONTACT_FROM_SCENE_SUB_TYPE", 0));
    }
}
