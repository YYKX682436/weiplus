package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class q implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f243856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17664x1adcec2b f243857e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17664x1adcec2b activityC17664x1adcec2b, com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var) {
        this.f243857e = activityC17664x1adcec2b;
        this.f243856d = s6Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 < this.f243857e.f243629g.getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShakeItemListUI", "on header view long click, ignore");
            return true;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var = this.f243856d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17664x1adcec2b activityC17664x1adcec2b = this.f243857e;
        s6Var.b(view, i17, j17, activityC17664x1adcec2b, activityC17664x1adcec2b.f243634o);
        return true;
    }
}
