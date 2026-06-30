package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class k3 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 implements t13.j {

    /* renamed from: q, reason: collision with root package name */
    public final j23.b0 f219627q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219628r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f219629s;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var, java.lang.String str, int i17) {
        super(w0Var);
        this.f219628r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        j23.b0 b0Var = new j23.b0(w0Var.mo63597x76847179(), this, i17);
        this.f219627q = b0Var;
        b0Var.f378803q = str;
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        n(kVar.j(0));
        notifyDataSetChanged();
        l(getCount(), true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public u13.g d(int i17) {
        u13.g b17 = this.f219627q.b(i17);
        if (b17 != null) {
            b17.f505296f = 3;
        }
        return b17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void f() {
        this.f219629s = false;
        this.f219627q.f(this.f219583g, this.f219628r, new java.util.HashSet(), 0L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void g() {
        super.g();
        if (this.f219629s) {
            return;
        }
        this.f219629s = true;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.m(this.f219583g, false, this.f219627q.r(), -2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        j23.b0 b0Var = this.f219627q;
        b0Var.a(view, gVar, z17);
        if (gVar.f505305o && !this.f219629s) {
            this.f219629s = true;
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.m(this.f219583g, true, b0Var.r(), -2);
        }
        c();
        n(b0Var.j(0));
        notifyDataSetChanged();
        l(getCount(), true);
        return true;
    }
}
