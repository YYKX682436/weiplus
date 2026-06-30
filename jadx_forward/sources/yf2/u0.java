package yf2;

/* loaded from: classes3.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ze2 f543326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf2.z0 f543327e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(r45.ze2 ze2Var, yf2.z0 z0Var) {
        super(0);
        this.f543326d = ze2Var;
        this.f543327e = z0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f543326d == null) {
            pf5.u uVar = pf5.u.f435469a;
            if (((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
                jz5.l P6 = ((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).P6();
                r45.d64 d64Var = new r45.d64();
                d64Var.f453707d = ((java.lang.Number) P6.f384366d).floatValue();
                d64Var.f453708e = ((java.lang.Number) P6.f384367e).floatValue();
                d64Var.f453712i = 0;
                d64Var.f453709f = 1;
                yf2.z0 z0Var = this.f543327e;
                yf2.z0.Z6(z0Var, d64Var, z0Var);
                ((ku5.t0) ku5.t0.f394148d).B(new yf2.t0(this.f543327e));
                return jz5.f0.f384359a;
            }
        }
        r45.ze2 ze2Var = this.f543326d;
        if (ze2Var != null) {
            ya2.p1 p1Var = this.f543327e.f543357m;
            if (p1Var != null) {
                ((yv2.b) p1Var).f547735h = ze2Var;
            }
            if (p1Var != null) {
                ((yv2.b) p1Var).d(true);
            }
        }
        return jz5.f0.f384359a;
    }
}
