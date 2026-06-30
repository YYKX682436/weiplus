package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class aa implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f284821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9 f284822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f284823f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ga f284824g;

    public aa(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ga gaVar, yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9 q9Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f284824g = gaVar;
        this.f284821d = dVar;
        this.f284822e = q9Var;
        this.f284823f = f9Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f284821d.P(true);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9 q9Var = this.f284822e;
        rl5.r rVar = q9Var.f286865e;
        yb5.d dVar = this.f284821d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ga gaVar = this.f284824g;
        te5.v.f(rVar, dVar, gaVar.f285557w, gaVar.f285556v, 49, q9Var.f286866f.f528706r, this.f284823f.I0());
        q9Var.f286866f.f528706r = 1;
        gaVar.f285557w = -1;
        gaVar.f285556v = -1;
    }
}
