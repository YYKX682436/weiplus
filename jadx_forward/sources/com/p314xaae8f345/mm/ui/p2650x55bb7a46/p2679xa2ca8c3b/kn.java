package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class kn implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao f285895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gn f285897f;

    public kn(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gn gnVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f285897f = gnVar;
        this.f285895d = aoVar;
        this.f285896e = f9Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gn gnVar = this.f285897f;
        gnVar.f285588s.P(true);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar = this.f285895d;
        te5.v.f(aoVar.f284918h, gnVar.f285588s, gnVar.f285592w, gnVar.f285591v, 1, aoVar.f284919i.f528706r, this.f285896e.I0());
        aoVar.f284919i.f528706r = 1;
        gnVar.f285592w = -1;
        gnVar.f285591v = -1;
    }
}
