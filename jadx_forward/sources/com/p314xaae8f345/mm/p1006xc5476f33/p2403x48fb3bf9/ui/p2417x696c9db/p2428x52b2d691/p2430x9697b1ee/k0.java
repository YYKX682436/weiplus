package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

/* loaded from: classes8.dex */
public final class k0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267724e;

    public k0(nw4.k kVar, nw4.y2 y2Var) {
        this.f267723d = kVar;
        this.f267724e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19470xbfb98b7 c19470xbfb98b7 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19470xbfb98b7) obj;
        boolean z17 = c19470xbfb98b7.f267687f;
        nw4.y2 y2Var = this.f267724e;
        nw4.k kVar = this.f267723d;
        java.lang.String str = c19470xbfb98b7.f267686e;
        if (!z17) {
            kVar.f422396d.e(y2Var.f422546c, "gamelifeManager fail" + str, null);
            return;
        }
        java.util.Map e17 = kz5.b1.e(new jz5.l(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, c19470xbfb98b7.f267685d));
        kVar.f422396d.e(y2Var.f422546c, "gamelifeManager success" + str, e17);
    }
}
