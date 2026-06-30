package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class u2 extends z26.h {

    /* renamed from: a, reason: collision with root package name */
    public int f168666a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 f168667b;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var) {
        this.f168667b = w2Var;
    }

    @Override // z26.e
    public void a(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.tc h17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = this.f168667b;
        if (w2Var.m52223xe6eebdcb() == null || w2Var.m52223xe6eebdcb().mo52154x9a3f0ba2() == null || (h17 = h()) == null) {
            return;
        }
        h17.a(motionEvent);
    }

    @Override // z26.e
    public int b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.tc h17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = this.f168667b;
        w2Var.m147197xd1d239e0(w2Var.L);
        if (w2Var.m52223xe6eebdcb() == null || w2Var.m52223xe6eebdcb().mo52154x9a3f0ba2() == null || (h17 = h()) == null) {
            return 0;
        }
        return h17.b(z17);
    }

    @Override // z26.e
    public void c(android.view.View view, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.tc h17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = this.f168667b;
        if (w2Var.m52223xe6eebdcb() == null || w2Var.m52223xe6eebdcb().mo52154x9a3f0ba2() == null || (h17 = h()) == null) {
            return;
        }
        h17.c(view, i17, i18);
    }

    @Override // z26.e
    public void d(int i17, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = this.f168667b;
        if (w2Var.m52223xe6eebdcb() == null || w2Var.m52223xe6eebdcb().m52169xfdaa7672() != w2Var) {
            w2Var.m147199x8e764904(false);
            return;
        }
        if (w2Var.G.m0("scene_swipe_back", null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPage", "[onScrollStateChange] navigate back be intercepted");
            w2Var.e();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 m52223xe6eebdcb = w2Var.m52223xe6eebdcb();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 r17 = w2Var.G.r(w2Var);
        if (m52223xe6eebdcb == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPage", "onScrollStateChange, null == pageContainer");
        } else {
            float f18 = 100.0f * f17;
            int ceil = (int) java.lang.Math.ceil(f18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.NAVIGATE_BACK;
            if (ceil == 0 || -1 == this.f168666a) {
                if (w2Var.R) {
                    m52223xe6eebdcb.k(wdVar, w2Var, r17);
                } else {
                    m52223xe6eebdcb.n(wdVar, w2Var, r17);
                }
            } else if (100 > ceil) {
                m52223xe6eebdcb.m(wdVar, w2Var, r17, f18);
            }
            this.f168666a = ceil;
        }
        if (i17 != 0) {
            w2Var.R = true;
            w2Var.getClass();
        } else {
            w2Var.R = false;
            this.f168666a = -1;
        }
        if (java.lang.Float.compare(1.0f, f17) <= 0) {
            if (!w2Var.S[0]) {
                if (r17 != null) {
                    android.view.View m52224xc2a54588 = r17.m52224xc2a54588();
                    w2Var.getClass();
                    m52224xc2a54588.clearAnimation();
                    m52224xc2a54588.setTranslationX(0.0f);
                }
                w2Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPage", "onSwipeBack %s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
                w2Var.R = true;
                w2Var.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v2(w2Var));
                w2Var.S[0] = true;
            }
        } else if (r17 != null) {
            r17.H(f17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPage", "scrollPercent %f", java.lang.Float.valueOf(f17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.tc h17 = h();
        if (h17 != null) {
            h17.d(i17, f17);
        }
    }

    @Override // z26.e
    public void e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.tc h17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = this.f168667b;
        if (w2Var.m52223xe6eebdcb() == null || w2Var.m52223xe6eebdcb().mo52154x9a3f0ba2() == null || (h17 = h()) == null) {
            return;
        }
        h17.e(i17);
    }

    @Override // z26.e
    public boolean g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.tc h17;
        boolean f17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = this.f168667b;
        if (w2Var.m52223xe6eebdcb() == null || w2Var.m52223xe6eebdcb().mo52154x9a3f0ba2() == null || (h17 = h()) == null || !(f17 = h17.f())) {
            return false;
        }
        return f17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.tc h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = this.f168667b;
        if (w2Var.m52223xe6eebdcb().mo52154x9a3f0ba2().V1()) {
            if (w2Var.m52223xe6eebdcb().mo52154x9a3f0ba2().f156334l1 != null) {
                return w2Var.m52223xe6eebdcb().mo52154x9a3f0ba2().f156334l1;
            }
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo52154x9a3f0ba2 = w2Var.m52223xe6eebdcb().mo52154x9a3f0ba2();
        if (mo52154x9a3f0ba2.V1()) {
            throw new java.lang.RuntimeException("Stub!");
        }
        if (!(mo52154x9a3f0ba2.f156340p1 && !mo52154x9a3f0ba2.f156353y1) || w2Var.m52223xe6eebdcb().mo52154x9a3f0ba2().f156334l1 == null) {
            return null;
        }
        return w2Var.m52223xe6eebdcb().mo52154x9a3f0ba2().f156334l1;
    }
}
