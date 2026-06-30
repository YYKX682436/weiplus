package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class z1 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 implements o13.x {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f219922q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.a3 f219923r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219924s;

    /* renamed from: t, reason: collision with root package name */
    public p13.c f219925t;

    /* renamed from: u, reason: collision with root package name */
    public p13.v f219926u;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var, java.lang.String str) {
        super(w0Var);
        this.f219924s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f219922q = str;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            this.f219923r = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        }
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17 = vVar.f432691c;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            n(0);
            notifyDataSetChanged();
            l(getCount(), true);
        } else {
            if (i17 != 0) {
                return;
            }
            this.f219926u = vVar;
            n(vVar.f432693e.size());
            notifyDataSetChanged();
            l(getCount(), true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public u13.g d(int i17) {
        e23.k kVar = new e23.k(i17);
        kVar.f328458q = (p13.y) this.f219926u.f432693e.get(i17);
        kVar.f505295e = this.f219926u.f432692d;
        kVar.f505297g = -14;
        kVar.B = this.f219923r;
        kVar.f505299i = i17;
        kVar.f505296f = 6;
        if (i17 == getCount() - 1) {
            kVar.f505294d = true;
        }
        return kVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void f() {
        c();
        if (this.f219925t != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f219925t);
        }
        p13.u uVar = new p13.u();
        uVar.f432674c = this.f219583g;
        uVar.f432675d = this.f219922q;
        uVar.f432683l = r13.e.f450138d;
        uVar.f432681j.add("create_talker_message\u200b");
        uVar.f432684m = this;
        uVar.f432685n = this.f219924s;
        uVar.f432673b = 3;
        this.f219925t = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSsg.FTS.FTSChattingConvAdapter", "do search %s", this.f219583g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void g() {
        super.g();
        if (this.f219925t != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f219925t);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        return false;
    }
}
