package mx0;

/* loaded from: classes5.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.k3 f413506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.q2 f413507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(mx0.k3 k3Var, mx0.q2 q2Var) {
        super(0);
        this.f413506d = k3Var;
        this.f413507e = q2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float m32617x34c20a10;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4013x695a957e z07;
        java.lang.Float f17 = this.f413506d.f303886c.f338416f;
        if (f17 != null) {
            m32617x34c20a10 = f17.floatValue();
        } else {
            pp0.p0 p0Var = this.f413507e.f413769g.K;
            m32617x34c20a10 = ((p0Var == null || (z07 = p0Var.z0()) == null) ? 1.0f : z07.m32617x34c20a10()) / 2.0f;
        }
        return new jz5.l(java.lang.Integer.valueOf(e06.p.f((int) (m32617x34c20a10 * 200), 0, 200)), 100);
    }
}
