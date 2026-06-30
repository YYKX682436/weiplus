package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class r3 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d3 {

    /* renamed from: s, reason: collision with root package name */
    public boolean f219701s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f219702t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f219703u;

    /* renamed from: v, reason: collision with root package name */
    public int f219704v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.LinkedList f219705w;

    public r3(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var, java.lang.String str, int i17) {
        super(w0Var, str, i17);
        this.f219701s = false;
        this.f219702t = false;
        this.f219703u = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSsg.FTS.FTSWXPayServiceNotifyAdapter", "init adapter");
        j23.d0 d0Var = new j23.d0(w0Var.mo63597x76847179(), this, i17);
        this.f219573q = d0Var;
        d0Var.f378801q = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d3, t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSsg.FTS.FTSWXPayServiceNotifyAdapter", "on data ready");
        this.f219702t = true;
        if (z17) {
            int j17 = kVar.j(0);
            if (this.f219705w.size() > 0) {
                if (j17 > 5) {
                    this.f219704v = j17;
                    n(6);
                    this.f219703u = true;
                } else {
                    this.f219703u = false;
                    n(j17 + 1);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSsg.FTS.FTSWXPayServiceNotifyAdapter", "add related");
            } else {
                n(j17);
            }
        } else {
            n(0);
        }
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wxpay_brand_search_related_function, false) || (this.f219702t && this.f219701s)) {
            c();
            notifyDataSetChanged();
            l(getCount(), true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d3, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public u13.g d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSsg.FTS.FTSWXPayServiceNotifyAdapter", "position: %s, has cgi result: %s, count: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f219701s), java.lang.Integer.valueOf(getCount()));
        if (i17 != getCount() - 1 || !this.f219701s || this.f219705w.size() <= 0) {
            return super.d(i17);
        }
        j23.d0 d0Var = (j23.d0) this.f219573q;
        java.util.LinkedList linkedList = this.f219705w;
        boolean z17 = this.f219703u;
        d0Var.getClass();
        e23.c2 c2Var = new e23.c2(i17);
        c2Var.f505297g = -21;
        c2Var.f505299i = i17;
        c2Var.f505296f = 7;
        c2Var.f328331q = linkedList;
        c2Var.f328332r = z17;
        return c2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d3, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSsg.FTS.FTSWXPayServiceNotifyAdapter", "do search");
        super.f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        u13.g item = getItem(i17);
        android.view.View c17 = item.k().c(h(), viewGroup, view);
        u13.e eVar = (u13.e) c17.getTag();
        if (!item.f505293c) {
            item.a(h(), eVar, new java.lang.Object[0]);
            m(h(), item);
            item.f505293c = true;
        }
        item.k().b(h(), eVar, item, new java.lang.Object[0]);
        return c17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d3, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        return false;
    }
}
