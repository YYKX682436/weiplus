package ga2;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f351368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f351370f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, java.lang.String str, in5.s0 s0Var) {
        super(0);
        this.f351368d = abstractC15633xee433078;
        this.f351369e = str;
        this.f351370f = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap B0;
        int mo63659xfb85f7b0 = this.f351368d.mo63659xfb85f7b0();
        in5.s0 s0Var = this.f351370f;
        java.lang.String str = this.f351369e;
        if (mo63659xfb85f7b0 == 2) {
            ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
            B0 = ai3.d.p(str);
        } else {
            int dimensionPixelSize = s0Var.f374654e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
            B0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.B0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L(str, dimensionPixelSize, dimensionPixelSize), com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str));
        }
        d75.b.g(new ga2.f(s0Var, B0));
        return jz5.f0.f384359a;
    }
}
