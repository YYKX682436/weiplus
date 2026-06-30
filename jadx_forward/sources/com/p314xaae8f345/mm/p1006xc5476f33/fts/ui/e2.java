package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class e2 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 implements t13.j {

    /* renamed from: q, reason: collision with root package name */
    public final j23.j f219576q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219577r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f219578s;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var, java.lang.String str, int i17) {
        super(w0Var);
        this.f219577r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        android.content.Context mo63597x76847179 = w0Var.mo63597x76847179();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(160);
        j23.j jVar = (j23.j) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Vi(hashSet, mo63597x76847179, this, i17).get(0);
        jVar.f378807q = str;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            jVar.f378808r = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        }
        this.f219576q = jVar;
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        n(kVar.j(0));
        notifyDataSetChanged();
        l(getCount(), true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public u13.g d(int i17) {
        u13.g b17 = this.f219576q.b(i17);
        if (b17 != null) {
            b17.f505299i = i17;
            b17.f505296f = 4;
        }
        return b17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void f() {
        this.f219578s = false;
        this.f219576q.f(this.f219583g, this.f219577r, new java.util.HashSet(), 0L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void g() {
        super.g();
        if (this.f219578s) {
            return;
        }
        this.f219578s = true;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.m(this.f219583g, false, this.f219576q.r(), -2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        j23.j jVar = this.f219576q;
        jVar.a(view, gVar, z17);
        if (!gVar.f505305o || this.f219578s) {
            return false;
        }
        this.f219578s = true;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.m(this.f219583g, true, jVar.r(), -2);
        return false;
    }
}
