package vz0;

/* loaded from: classes14.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz0.d0 f523111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(vz0.d0 d0Var) {
        super(0);
        this.f523111d = d0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vz0.d0 d0Var = this.f523111d;
        e0.n d17 = d0Var.d();
        float f17 = 0.0f;
        if (d17 != null) {
            float f18 = ((e0.q0) d17).f327212b;
            e0.n d18 = d0Var.d();
            if (d18 != null) {
                e0.q0 q0Var = (e0.q0) d18;
                f17 = e06.p.e((-q0Var.f327211a) / q0Var.f327214d, 0.0f, 1.0f);
            }
            f17 = (f18 + f17) - d0Var.e();
        }
        return java.lang.Float.valueOf(f17);
    }
}
