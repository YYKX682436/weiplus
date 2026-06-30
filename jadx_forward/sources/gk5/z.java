package gk5;

/* loaded from: classes3.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.a0 f354262d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(gk5.a0 a0Var) {
        super(0);
        this.f354262d = a0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gk5.a0 a0Var = this.f354262d;
        if (!a0Var.m158354x19263085().isFinishing() && !a0Var.m158354x19263085().isDestroyed()) {
            a0Var.m158354x19263085().setResult(0);
            a0Var.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
