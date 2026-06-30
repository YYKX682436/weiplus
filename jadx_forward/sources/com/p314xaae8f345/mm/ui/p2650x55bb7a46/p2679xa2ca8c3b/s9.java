package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class s9 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f287032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9 f287033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f287034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y9 f287035g;

    public s9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y9 y9Var, yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9 q9Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f287035g = y9Var;
        this.f287032d = dVar;
        this.f287033e = q9Var;
        this.f287034f = f9Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f287032d.P(true);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q9 q9Var = this.f287033e;
        rl5.r rVar = q9Var.f286865e;
        yb5.d dVar = this.f287032d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y9 y9Var = this.f287035g;
        te5.v.f(rVar, dVar, y9Var.f287583w, y9Var.f287582v, 49, q9Var.f286866f.f528706r, this.f287034f.I0());
        q9Var.f286866f.f528706r = 1;
        y9Var.f287583w = -1;
        y9Var.f287582v = -1;
    }
}
