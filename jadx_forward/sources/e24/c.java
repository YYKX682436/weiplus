package e24;

/* loaded from: classes.dex */
public final class c implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2065x55bb7a46.C17545x166f85df f328543a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2065x55bb7a46.C17545x166f85df c17545x166f85df) {
        this.f328543a = c17545x166f85df;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2065x55bb7a46.C17545x166f85df c17545x166f85df = this.f328543a;
        c17545x166f85df.f243438h = z17;
        c17545x166f85df.t7(c17545x166f85df.m158354x19263085().getIntent());
        gm0.j1.u().c().w(66832, java.lang.Boolean.valueOf(!z17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, java.lang.Boolean.valueOf(z17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("independent_send_msg_setting_btn", "view_clk", hashMap, 30529);
    }
}
