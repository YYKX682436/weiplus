package j23;

/* loaded from: classes12.dex */
public class k extends j23.b0 {

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f378809r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f378810s;

    /* renamed from: t, reason: collision with root package name */
    public int f378811t;

    @Override // j23.b0, j23.q, t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 192;
    }

    @Override // j23.b0, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public e23.g0 m(int i17, t13.i iVar) {
        e23.r rVar = new e23.r(i17);
        rVar.A = iVar.f496106i;
        rVar.f328485z = this.f378810s;
        return rVar;
    }

    @Override // j23.b0, j23.q, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        int i18 = iVar.f496099b ? (i17 - iVar.f496098a) - 1 : i17 - iVar.f496098a;
        if (i18 < 0 || i18 >= iVar.f496103f.size()) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f496103f.get(i18);
        if (yVar.f432720e.equals("no_result\u200b")) {
            return new e23.j0(i17);
        }
        e23.t tVar = new e23.t(i17);
        tVar.f328458q = yVar;
        tVar.f505295e = yVar.f432736u;
        tVar.n(yVar.f432717b, yVar.f432718c);
        return tVar;
    }

    @Override // j23.b0, j23.q, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        this.f378812p = false;
        p13.u uVar = new p13.u();
        uVar.f432674c = this.f219540i;
        uVar.f432683l = r13.e.f450138d;
        uVar.f432675d = this.f378810s;
        uVar.f432676e = this.f378803q;
        uVar.f432677f = this.f378809r;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        uVar.f432673b = 11;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar);
    }

    @Override // j23.b0, j23.q
    public int t() {
        return this.f378811t;
    }
}
