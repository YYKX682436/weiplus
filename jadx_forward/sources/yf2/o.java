package yf2;

/* loaded from: classes3.dex */
public final class o extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f543289m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f543290n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f543291o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public static final void Z6(yf2.o oVar, long j17, long j18) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        if (oVar.f543290n) {
            return;
        }
        oVar.f543290n = true;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = oVar.N6();
        if (N6 == null || N6.isFinishing() || N6.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.CoLiveController", "handleInviteeLiveStarted: activity unavailable, abort");
            return;
        }
        mm2.n0 n0Var = (mm2.n0) oVar.m56788xbba4bfc0(mm2.n0.class);
        r45.f50 f50Var = (r45.f50) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) n0Var.f410798g).mo144003x754a37bb();
        java.lang.String m76197x6c03c64c = (f50Var == null || (c19782x23db1cfa = f50Var.f455550h) == null) ? null : c19782x23db1cfa.m76197x6c03c64c();
        if (m76197x6c03c64c == null || m76197x6c03c64c.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.CoLiveController", "handleInviteeLiveStarted: no initiator username, abort");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = oVar.f543289m;
            if (u3Var != null) {
                if (!u3Var.isShowing()) {
                    u3Var = null;
                }
                if (u3Var != null) {
                    u3Var.dismiss();
                }
            }
            oVar.f543289m = null;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveController", "handleInviteeLiveStarted: objectId=" + j17 + ", liveId=" + j18 + ", initiator=" + m76197x6c03c64c);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = oVar.f543289m;
        if (u3Var2 != null) {
            if (!u3Var2.isShowing()) {
                u3Var2 = null;
            }
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        oVar.f543289m = null;
        n0Var.f410807s = true;
        re2.e0 e0Var = re2.j1.f475971b;
        if (e0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveTaskManager", "destroy: invitationId=" + e0Var.f475923c + ", phase=" + e0Var.f475922b);
            e0Var.a();
        }
        re2.j1.f475971b = null;
        n0Var.N6();
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Di(N6, new android.content.Intent(), m76197x6c03c64c, null, wk0Var, null);
        N6.finish();
    }

    public static final void a7(yf2.o oVar) {
        r45.q12 q12Var = (r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) oVar.m56788xbba4bfc0(mm2.g1.class)).f410601f).mo144003x754a37bb();
        if (zl2.r4.f555483a.G1(q12Var)) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchToCoLiveModeIfNeeded: currentMode=");
        sb6.append(q12Var != null ? java.lang.Integer.valueOf(q12Var.m75939xb282bd08(0)) : null);
        sb6.append(" → setLiveMode(CoLive)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveController", sb6.toString());
        r45.q12 q12Var2 = new r45.q12();
        q12Var2.set(0, 5);
        q12Var2.set(1, 1);
        yf2.m1 m1Var = (yf2.m1) oVar.getStore().m56798x25fe639c(yf2.m1.class);
        if (m1Var != null) {
            m1Var.e7(q12Var2);
        }
        mm2.c1 c1Var = (mm2.c1) oVar.m56788xbba4bfc0(mm2.c1.class);
        if (c1Var.l7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveController", "switchToCoLiveModeIfNeeded: clear residual FLAG_AUDIO_MODE for CoLive");
            int i17 = (int) c1Var.f410399q;
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            c1Var.p8(i17 & (-257));
            c1Var.D8(0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new yf2.h(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new yf2.n(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new yf2.e(this, null), 3, null);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f543291o;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f543291o = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new yf2.l(this, null), 3, null);
    }
}
