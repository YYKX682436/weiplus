package zk3;

/* loaded from: classes8.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c f554966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f554967e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, zk3.g0 g0Var) {
        super(0);
        this.f554966d = c16601x7ed0e40c;
        this.f554967e = g0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f554966d;
        if (c16601x7ed0e40c != null) {
            java.lang.String str = c16601x7ed0e40c.f66791xc8a07680;
            int i17 = c16601x7ed0e40c.f66793x2262335f;
            zk3.g0 g0Var = this.f554967e;
            int a76 = g0Var.a7(str, i17);
            if (a76 >= 0) {
                g0Var.f554985g.set(a76, new uk3.a(c16601x7ed0e40c));
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = g0Var.f554995t;
                int a07 = a76 + (c22848x6ddd90cf != null ? c22848x6ddd90cf.a0() : 1);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = g0Var.f554995t;
                if (c22848x6ddd90cf2 != null) {
                    c22848x6ddd90cf2.m8147xed6e4d18(a07);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
