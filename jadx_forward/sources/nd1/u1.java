package nd1;

/* loaded from: classes7.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f417931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417934g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417935h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417936i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ nd1.v1 f417937m;

    public u1(nd1.v1 v1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f417937m = v1Var;
        this.f417931d = e9Var;
        this.f417932e = i17;
        this.f417933f = str;
        this.f417934g = str2;
        this.f417935h = str3;
        this.f417936i = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f417931d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = e9Var.mo32091x9a3f0ba2().x0().m52169xfdaa7672();
        boolean z17 = m52169xfdaa7672 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1;
        nd1.v1 v1Var = this.f417937m;
        int i17 = this.f417932e;
        if (!z17) {
            e9Var.a(i17, v1Var.o("fail:not TabBar page"));
            return;
        }
        zl1.t m52251x308dc334 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1) m52169xfdaa7672).m52251x308dc334();
        java.lang.String str = this.f417935h;
        java.lang.String str2 = this.f417936i;
        java.lang.String str3 = this.f417933f;
        java.lang.String str4 = this.f417934g;
        m52251x308dc334.getClass();
        m52251x308dc334.e(new zl1.g(m52251x308dc334, str3, str4, str, str2));
        e9Var.a(i17, v1Var.o("ok"));
    }
}
