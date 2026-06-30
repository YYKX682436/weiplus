package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class d3 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 implements t13.j {

    /* renamed from: q, reason: collision with root package name */
    public j23.a0 f219573q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219574r;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var, java.lang.String str, int i17) {
        super(w0Var);
        this.f219574r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        j23.a0 a0Var = new j23.a0(w0Var.mo63597x76847179(), this, i17);
        this.f219573q = a0Var;
        a0Var.f378801q = str;
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSsg.FTS.FTSServiceNotifyAdapter", "on data ready, is success: %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            n(kVar.j(0));
        } else {
            n(0);
        }
        notifyDataSetChanged();
        l(getCount(), true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public u13.g d(int i17) {
        u13.g b17 = this.f219573q.b(i17);
        if (b17 != null) {
            b17.f505296f = 7;
        }
        return b17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void f() {
        this.f219573q.f(this.f219583g, this.f219574r, new java.util.HashSet(), 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSsg.FTS.FTSServiceNotifyAdapter", "do search %s", this.f219583g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        return false;
    }
}
