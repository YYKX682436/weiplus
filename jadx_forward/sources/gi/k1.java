package gi;

/* loaded from: classes12.dex */
public class k1 extends gi.d1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353598b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(qh.f0 f0Var, java.lang.String str, java.lang.String str2) {
        super(f0Var, str);
        this.f353598b = str2;
    }

    @Override // gi.d1
    public void a() {
        java.lang.String str = this.f353598b;
        f(str);
        b(true, true);
        c();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || ("AppBrand".equals(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j())) {
            e();
        }
        g(60000L);
        d();
        h(java.lang.Math.max(gi.d.f353538m, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d));
        if (mm.o.f()) {
            rh.c1 c1Var = this.f353554a;
            c1Var.F(gi.j.class);
            c1Var.H(rh.r1.class, 5000L);
            c1Var.H(rh.w1.class, 5000L);
            c1Var.H(rh.l3.class, 5000L);
        }
    }
}
