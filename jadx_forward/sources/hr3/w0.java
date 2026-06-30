package hr3;

/* loaded from: classes11.dex */
public class w0 extends com.p314xaae8f345.mm.ui.p2690x38b72420.o4 {

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365657m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f365658n;

    /* renamed from: o, reason: collision with root package name */
    public p13.c f365659o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f365660p;

    /* renamed from: q, reason: collision with root package name */
    public final o13.x f365661q;

    public w0(com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        super(l4Var, false, i17);
        this.f365658n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f365661q = new hr3.v0(this);
        this.f365657m = z3Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f365660p;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.r rVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.r(i17, this.f365657m);
        rVar.f(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(((p13.y) this.f365660p.get(i17)).f432720e, true));
        return rVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void r() {
        if (this.f365659o != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f365659o);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        p13.u uVar = new p13.u();
        uVar.f432674c = str;
        uVar.f432685n = this.f365658n;
        uVar.f432684m = this.f365661q;
        uVar.f432675d = this.f365657m.d1();
        uVar.f432673b = 7;
        this.f365659o = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }
}
