package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class b1 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f243775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17680x54e9523e f243776e;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17680x54e9523e activityC17680x54e9523e, com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var) {
        this.f243776e = activityC17680x54e9523e;
        this.f243775d = s6Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17680x54e9523e activityC17680x54e9523e = this.f243776e;
        if (i17 < activityC17680x54e9523e.f243753e.getHeaderViewsCount()) {
            return true;
        }
        this.f243775d.b(view, i17, j17, activityC17680x54e9523e.mo55332x76847179(), activityC17680x54e9523e.f243755g);
        return true;
    }
}
