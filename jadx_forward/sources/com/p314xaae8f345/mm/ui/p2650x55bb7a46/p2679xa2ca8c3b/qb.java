package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class qb implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya f286875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lb f286877g;

    public qb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lb lbVar, yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f286877g = lbVar;
        this.f286874d = dVar;
        this.f286875e = yaVar;
        this.f286876f = f9Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f286874d.P(true);
        rl5.r rVar = this.f286875e.f287591i;
        yb5.d dVar = this.f286874d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lb lbVar = this.f286877g;
        te5.v.d(rVar, dVar, lbVar.f285949w, lbVar.f285948v, 49, 0, 1, this.f286876f.I0(), 0);
        lbVar.f285949w = -1;
        lbVar.f285948v = -1;
    }
}
