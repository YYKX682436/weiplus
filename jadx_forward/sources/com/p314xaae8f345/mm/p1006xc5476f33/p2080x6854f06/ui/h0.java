package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class h0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f243808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17665xba0f5e4d f243809e;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17665xba0f5e4d activityC17665xba0f5e4d, com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var) {
        this.f243809e = activityC17665xba0f5e4d;
        this.f243808d = s6Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17665xba0f5e4d activityC17665xba0f5e4d = this.f243809e;
        if (i17 < activityC17665xba0f5e4d.f243637f.getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShakeMsgListUI", "on header view long click, ignore");
            return true;
        }
        this.f243808d.b(view, i17, j17, activityC17665xba0f5e4d.mo55332x76847179(), activityC17665xba0f5e4d.f243644p);
        return true;
    }
}
