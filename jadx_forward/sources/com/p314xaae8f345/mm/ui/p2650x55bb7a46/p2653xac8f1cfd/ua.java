package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.q0.class)
/* loaded from: classes9.dex */
public class ua extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.q0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f281594e = false;

    /* renamed from: f, reason: collision with root package name */
    public long[] f281595f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.g4 f281596g = null;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.g4 g4Var = this.f281596g;
        if (g4Var != null) {
            yb5.d dVar = g4Var.f282055a;
            sb5.z zVar = (sb5.z) dVar.f542241c.a(sb5.z.class);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar.f542241c;
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) cVar.a(sb5.u1.class))).p0();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar;
            kVar.V = true;
            kVar.B1 = null;
            kVar.D1 = null;
            kVar.F1 = null;
            kVar.H1 = null;
            kVar.J1 = null;
            kVar.W.clear();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) cVar.a(sb5.s0.class))).f280796e;
            if (c19666xfd6e2f33 != null) {
                c19666xfd6e2f33.setVisibility(8);
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 viewOnClickListenerC21613xfaa83484 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) cVar.a(sb5.s0.class))).f280798g;
            if (viewOnClickListenerC21613xfaa83484 != null) {
                viewOnClickListenerC21613xfaa83484.setVisibility(8);
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.r9) ((sb5.l0) cVar.a(sb5.l0.class))).n0();
            dVar.y();
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) cVar.a(sb5.q2.class))).y0();
            dVar.X(2, true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        this.f281594e = this.f280113d.f542250l.m78383x21a1233e("expose_edit_mode", false).booleanValue();
        this.f281595f = this.f280113d.f542250l.m7436x8619eaa0().getLongArray("expose_selected_ids");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        if (this.f281594e && this.f281596g == null) {
            this.f281596g = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.g4(this.f280113d, this.f281595f);
        }
    }
}
