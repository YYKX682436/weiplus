package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class j extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 implements t13.j {

    /* renamed from: q, reason: collision with root package name */
    public final j23.a f219611q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219612r;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var) {
        super(w0Var);
        this.f219612r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f219611q = new j23.a(w0Var.mo63597x76847179(), this, 0);
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        int j17 = this.f219611q.j(0);
        n(j17);
        notifyDataSetChanged();
        l(j17, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public u13.g d(int i17) {
        return this.f219611q.b(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void f() {
        this.f219611q.f(this.f219583g, this.f219612r, new java.util.HashSet(), 0L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        return false;
    }
}
