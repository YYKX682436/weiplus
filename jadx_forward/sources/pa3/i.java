package pa3;

/* loaded from: classes8.dex */
public final class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 {
    public static final pa3.g C = new pa3.g(null);
    public long A;
    public java.lang.String B;

    /* renamed from: v, reason: collision with root package name */
    public final dp1.x f434516v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f434517w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f434518x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f434519y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f434520z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(dp1.x pageAdapter) {
        super(pageAdapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageAdapter, "pageAdapter");
        this.f434516v = pageAdapter;
        this.f434517w = "";
        this.f434518x = "";
        this.f434519y = "";
        this.B = "liteapp";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void A(boolean z17, int i17) {
        t0();
        super.A(z17, i17);
        ((ku5.t0) ku5.t0.f394148d).g(new pa3.h(this));
    }

    public final void t0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d.G != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", this.f434517w);
            bundle.putString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, this.f434518x);
            bundle.putString("query", this.f434519y);
            bundle.putString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, this.f434520z);
            c12886x91aa2b6d.G = bundle;
        }
    }
}
