package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class t0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f243866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17679x4e14a258 f243867e;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17679x4e14a258 activityC17679x4e14a258, com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var) {
        this.f243867e = activityC17679x4e14a258;
        this.f243866d = s6Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 < this.f243867e.f243747f.getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SayHiListUI", "on header view long click, ignore");
            return true;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var = this.f243866d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17679x4e14a258 activityC17679x4e14a258 = this.f243867e;
        s6Var.b(view, i17, j17, activityC17679x4e14a258, activityC17679x4e14a258.f243751m);
        return true;
    }
}
