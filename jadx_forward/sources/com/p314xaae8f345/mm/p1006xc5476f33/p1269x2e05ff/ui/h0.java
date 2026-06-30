package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f174830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 f174831e;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 q0Var, boolean z17) {
        this.f174831e = q0Var;
        this.f174830d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700;
        if (this.f174831e.f()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174831e.f174879d;
            boolean z17 = this.f174830d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = nVar.f174851c;
            if (c12929x567537a0 != null && nVar.f174858j) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallView", "markWechatInForeground, visibility:%s, inForeground:%s, otherContentViewNotShow: %s", java.lang.Integer.valueOf(c12929x567537a0.getVisibility()), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(c12929x567537a0.M));
                if (z17) {
                    c12929x567537a0.f175057d |= 32;
                    c12929x567537a0.setVisibility(0);
                    if (c12929x567537a0.M) {
                        c12929x567537a0.i0(true);
                    }
                } else {
                    int i17 = c12929x567537a0.f175057d & (-33);
                    c12929x567537a0.f175057d = i17;
                    if (c12929x567537a0.E(i17) || c12929x567537a0.D(c12929x567537a0.f175057d)) {
                        c12929x567537a0.l0(false, null);
                        if (((int) c12929x567537a0.getAlpha()) == 0) {
                            c12929x567537a0.setAlpha(1.0f);
                        }
                    }
                }
                c12929x567537a0.Q0(c12929x567537a0.f175068i2, c12929x567537a0.f175069j2, c12929x567537a0.f175066h2, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = nVar.f174853e;
            if (c12917x19ac03e7 != null && nVar.f174859k) {
                boolean s17 = c12917x19ac03e7.s();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewV2", "markWechatInForeground, visibility:%s, inForeground:%s, hasFloatBallShow: %s", java.lang.Integer.valueOf(c12917x19ac03e7.getVisibility()), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(s17));
                if (z17) {
                    c12917x19ac03e7.f174952d |= 32;
                    if (s17) {
                        if (c12917x19ac03e7.w()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.L(c12917x19ac03e7, true, c12917x19ac03e7.A, 0.0f, false, null, 28, null);
                        } else {
                            c12917x19ac03e7.J(false, false, null);
                        }
                    }
                } else {
                    c12917x19ac03e7.f174952d &= -33;
                    if (s17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.I(c12917x19ac03e7, false, c12917x19ac03e7.A, c12917x19ac03e7.F, false, null, false, null, 112, null);
                        c12917x19ac03e7.t(false, null);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f = c12917x19ac03e7.f174966u;
                    if (c12919x6cd8224f != null) {
                        c12919x6cd8224f.a(false);
                    }
                }
            }
            if (!z17 && (c12931xa4a39700 = nVar.f174852d) != null) {
                c12931xa4a39700.c(null);
            }
            if (this.f174830d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 q0Var = this.f174831e;
                if (q0Var.f174881f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallUIManager", "checkFloatBallViewWhenForeground forceHideAllFloatBall and hide");
                    if (q0Var.f()) {
                        q0Var.f174879d.h(false, null);
                    }
                }
            }
        }
    }
}
