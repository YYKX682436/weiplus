package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes11.dex */
public class i1 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f233680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff f233681e;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff activityC16726x80180cff, com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var) {
        this.f233681e = activityC16726x80180cff;
        this.f233680d = s6Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 < this.f233681e.f233645f.getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SayHiListUI", "on header view long click, ignore");
            return true;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var = this.f233680d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff activityC16726x80180cff = this.f233681e;
        s6Var.b(view, i17, j17, activityC16726x80180cff, activityC16726x80180cff.f233655s);
        return true;
    }
}
