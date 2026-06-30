package ea1;

/* loaded from: classes12.dex */
public class k extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f332063q;

    /* renamed from: r, reason: collision with root package name */
    public p13.y f332064r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 f332065s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f332066t;

    /* renamed from: u, reason: collision with root package name */
    public int f332067u;

    /* renamed from: v, reason: collision with root package name */
    public int f332068v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f332069w;

    /* renamed from: x, reason: collision with root package name */
    public int f332070x;

    /* renamed from: y, reason: collision with root package name */
    public final ea1.j f332071y;

    /* renamed from: z, reason: collision with root package name */
    public final ea1.i f332072z;

    public k(int i17) {
        super(9, i17);
        this.f332071y = new ea1.j(this);
        this.f332072z = new ea1.i(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 wi6 = ((et.i2) ((ft.l4) i95.n0.c(ft.l4.class))).wi(this.f332064r.f432720e);
        this.f332065s = wi6;
        if (wi6 == null) {
            return;
        }
        int i17 = this.f332064r.f432718c;
        boolean z17 = true;
        boolean z18 = false;
        if (i17 != 2) {
            if (i17 != 3) {
                z17 = false;
            } else {
                z18 = true;
            }
        }
        this.f332066t = o13.q.e(p13.i.d(wi6.f157889x, this.f505295e, z17, z18)).f432638a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef4 = this.f332065s;
        this.f505304n = c11712x63ef1ef4.f157888w;
        this.f332067u = c11712x63ef1ef4.D;
        this.f332068v = c11712x63ef1ef4.E;
        this.f332069w = c11712x63ef1ef4.G;
        this.f332070x = c11712x63ef1ef4.F;
    }

    @Override // u13.g
    public java.lang.String c() {
        return this.f332065s.f157888w;
    }

    @Override // u13.g
    public java.lang.String f() {
        return this.f332065s.f157889x;
    }

    @Override // u13.g
    public int j() {
        return this.f332064r.f432733r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f332071y;
    }

    @Override // u13.g
    public java.lang.String l() {
        return this.f332063q;
    }
}
