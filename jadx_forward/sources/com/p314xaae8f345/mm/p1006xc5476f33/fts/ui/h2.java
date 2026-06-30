package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class h2 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 implements t13.j {

    /* renamed from: q, reason: collision with root package name */
    public final j23.k f219601q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219602r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f219603s;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        super(w0Var);
        this.f219602r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        j23.k kVar = new j23.k(w0Var.mo63597x76847179(), this, i17);
        this.f219601q = kVar;
        kVar.f378803q = str2;
        kVar.f378809r = str;
        kVar.f378810s = str3;
        kVar.f378811t = i18;
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        n(kVar.j(0));
        notifyDataSetChanged();
        l(getCount(), true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public u13.g d(int i17) {
        u13.g b17 = this.f219601q.b(i17);
        if (b17 != null) {
            b17.f505296f = 5;
        }
        return b17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void f() {
        this.f219603s = false;
        this.f219601q.f(this.f219583g, this.f219602r, new java.util.HashSet(), 0L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void g() {
        super.g();
        if (this.f219603s) {
            return;
        }
        this.f219603s = true;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.m(this.f219583g, false, this.f219601q.r(), -2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        j23.k kVar = this.f219601q;
        kVar.a(view, gVar, z17);
        if (gVar.f505305o && !this.f219603s) {
            this.f219603s = true;
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.m(this.f219583g, true, kVar.r(), -2);
        }
        c();
        n(kVar.j(0));
        notifyDataSetChanged();
        l(getCount(), true);
        return true;
    }
}
