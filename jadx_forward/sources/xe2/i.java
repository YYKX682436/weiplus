package xe2;

/* loaded from: classes3.dex */
public final class i extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535401c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535401c = "LiveAudioBgInfoInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.Z(msgList);
        r45.pk1 pk1Var = new r45.pk1();
        jz5.f0 f0Var = null;
        if (ch1Var != null) {
            if (!(ch1Var.m75934xbce7f2f(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
                pk1Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
            }
        }
        r45.ba4 ba4Var = (r45.ba4) pk1Var.m75936x14adae67(0);
        gk2.e eVar = this.f526800a;
        boolean z17 = ((mm2.c1) eVar.a(mm2.c1.class)).l7();
        boolean w17 = zl2.r4.f555483a.w1();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive audio bg info = ");
        sb6.append(ba4Var != null ? pm0.b0.g(ba4Var) : null);
        sb6.append(", isAudioModeNow = ");
        sb6.append(z17);
        sb6.append(", isAnchor = ");
        sb6.append(w17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535401c, sb6.toString());
        ((mm2.c1) eVar.a(mm2.c1.class)).A1 = ba4Var;
        ((mm2.c1) eVar.a(mm2.c1.class)).I4 = null;
        if (w17 || !z17) {
            return;
        }
        dk2.ef.f314905a.R();
        dt2.t tVar = ws2.k1.f530599r.a().f530607f;
        if (tVar != null) {
            tVar.n();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.f446899i4;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", true);
            k0Var.mo46557x60d69242(bVar, bundle);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            ((mm2.c1) eVar.a(mm2.c1.class)).B1.mo7808x76db6cb1(ba4Var);
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20071};
    }
}
