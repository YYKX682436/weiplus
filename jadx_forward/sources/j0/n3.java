package j0;

/* loaded from: classes14.dex */
public final class n3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.e f377992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.v f377993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f377994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f377995g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e1.r f377996h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(z.e eVar, g2.v vVar, g2.e0 e0Var, j0.c5 c5Var, e1.r rVar) {
        super(1);
        this.f377992d = eVar;
        this.f377993e = vVar;
        this.f377994f = e0Var;
        this.f377995g = c5Var;
        this.f377996h = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        a2.k1 k1Var;
        g1.f drawWithContent = (g1.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawWithContent, "$this$drawWithContent");
        u1.o0 o0Var = (u1.o0) drawWithContent;
        o0Var.b();
        float e17 = e06.p.e(((java.lang.Number) this.f377992d.d()).floatValue(), 0.0f, 1.0f);
        if (!(e17 == 0.0f)) {
            long j17 = this.f377994f.f349227b;
            int i17 = a2.m1.f82315c;
            int i18 = (int) (j17 >> 32);
            ((g2.t) this.f377993e).getClass();
            j0.d5 d5Var = this.f377995g.f377772g;
            d1.g gVar = (d5Var == null || (k1Var = d5Var.f377798a) == null) ? new d1.g(0.0f, 0.0f, 0.0f, 0.0f) : k1Var.c(i18);
            float R = o0Var.R(j0.q3.f378051a);
            float f17 = R / 2;
            float f18 = gVar.f307162a + f17;
            float d17 = d1.k.d(o0Var.a()) - f17;
            if (f18 > d17) {
                f18 = d17;
            }
            g1.h.e(drawWithContent, this.f377996h, d1.f.a(f18, gVar.f307163b), d1.f.a(f18, gVar.f307165d), R, 0, null, e17, null, 0, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60883xc58bd72e, null);
        }
        return jz5.f0.f384359a;
    }
}
