package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class bf extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.d1 f184501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 f184502f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(in5.s0 s0Var, so2.d1 d1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90) {
        super(1);
        this.f184500d = s0Var;
        this.f184501e = d1Var;
        this.f184502f = c15178x4303ff90;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Context context = this.f184500d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50 m50Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50.class);
        long j17 = this.f184501e.getFeedObject().f66939xc8a07680;
        boolean z17 = !booleanValue;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 fullSeekBarLayout = this.f184502f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fullSeekBarLayout, "$fullSeekBarLayout");
        m50Var.getClass();
        m50Var.Q6("playImage." + z17 + " feedId=" + pm0.v.u(j17));
        if (m50Var.f216662i > 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = m50Var.f216669s;
            if (z17) {
                if (!m50Var.f216667q) {
                    m50Var.P6(0, true, j17, 0, 0, true);
                    m50Var.f216665o = -1L;
                    m50Var.f216670t = null;
                    b4Var.d();
                }
                m50Var.f216668r = true;
            } else {
                m50Var.f216666p = j17;
                m50Var.f216657d = 1;
                b4Var.c(1000L, 1000L);
                m50Var.f216670t = fullSeekBarLayout;
                m50Var.f216667q = false;
                if (m50Var.f216668r) {
                    m50Var.P6(m50Var.f216665o == j17 ? 1 : 0, true, j17, 0, 0, false);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
