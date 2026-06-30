package nd1;

/* loaded from: classes7.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f417922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f417925g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417926h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417927i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ nd1.t1 f417928m;

    public s1(nd1.t1 t1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3) {
        this.f417928m = t1Var;
        this.f417922d = e9Var;
        this.f417923e = i17;
        this.f417924f = str;
        this.f417925g = i18;
        this.f417926h = str2;
        this.f417927i = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f417922d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = e9Var.t3().x0().m52169xfdaa7672();
        boolean z17 = m52169xfdaa7672 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1;
        nd1.t1 t1Var = this.f417928m;
        int i17 = this.f417923e;
        if (!z17) {
            e9Var.a(i17, t1Var.o("fail:not TabBar page"));
            return;
        }
        zl1.t m52251x308dc334 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1) m52169xfdaa7672).m52251x308dc334();
        zl1.b0 b0Var = m52251x308dc334.f555148d;
        nd1.q1 q1Var = new nd1.q1(this, m52251x308dc334);
        java.lang.String str = this.f417924f;
        int i18 = this.f417925g;
        m52251x308dc334.h(this.f417925g, this.f417926h, b0Var.a(str, q1Var, e9Var, i18), m52251x308dc334.f555148d.a(this.f417927i, new nd1.r1(this, m52251x308dc334), e9Var, i18), false);
        e9Var.a(i17, t1Var.o("ok"));
    }
}
