package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class vw extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f196358p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f196359q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196358p = statusMonitor;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        this.f196359q = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoReceivePlugin", "#unMount");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoReceivePlugin", "#startPollingBannerData");
        if (((mm2.w) P0(mm2.w.class)).P6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoReceivePlugin", "#startPollingBannerData return for playing adVideo");
            return;
        }
        r45.ty2 ty2Var = new r45.ty2();
        dk2.ef efVar = dk2.ef.f314905a;
        dk2.ef.f314925k.e(11, ty2Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uw(this, r45.uy2.class), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        r45.ce2 ce2Var;
        boolean a17;
        r45.nw1 m76794xd0557130;
        java.lang.Object obj;
        r45.nw1 m76794xd05571302;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoReceivePlugin", "#mount");
        this.f196359q = true;
        long c17 = c01.id.c();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) P0(mm2.c1.class)).f410379n;
        java.util.LinkedList m75941xfb821914 = (c19792x256d2725 == null || (m76794xd05571302 = c19792x256d2725.m76794xd0557130()) == null) ? null : m76794xd05571302.m75941xfb821914(51);
        if (m75941xfb821914 != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                r45.ce2 ce2Var2 = (r45.ce2) obj;
                if (ce2Var2.m75942xfb822ef2(1) <= c17 && c17 <= ce2Var2.m75942xfb822ef2(5)) {
                    break;
                }
            }
            ce2Var = (r45.ce2) obj;
        } else {
            ce2Var = null;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = ((mm2.c1) P0(mm2.c1.class)).f410379n;
        java.lang.Long valueOf = (c19792x256d27252 == null || (m76794xd0557130 = c19792x256d27252.m76794xd0557130()) == null) ? null : java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0));
        java.lang.String m75945x2fec8307 = ce2Var != null ? ce2Var.m75945x2fec8307(0) : null;
        if (ce2Var != null && ce2Var.m75933x41a8a7f2(6)) {
            a17 = mm2.w.f411028u.b(valueOf + '_' + m75945x2fec8307);
        } else {
            a17 = mm2.w.f411028u.a(java.lang.String.valueOf(valueOf));
        }
        if (ce2Var != null && !a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoReceivePlugin", "#mount has ad video, delay to start.");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoReceivePlugin", "#mount no ad video.");
            t1();
        }
    }
}
