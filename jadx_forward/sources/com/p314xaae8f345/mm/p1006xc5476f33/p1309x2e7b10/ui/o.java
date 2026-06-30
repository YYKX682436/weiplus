package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class o implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5 f176626d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5 activityC13047x63b575f5) {
        this.f176626d = activityC13047x63b575f5;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5 activityC13047x63b575f5 = this.f176626d;
        if (activityC13047x63b575f5.M == -85.0f && activityC13047x63b575f5.N == -1000.0f) {
            activityC13047x63b575f5.M = f18;
            activityC13047x63b575f5.N = f17;
            wt1.g0 ij6 = xt1.t0.ij();
            float f19 = activityC13047x63b575f5.M;
            float f27 = activityC13047x63b575f5.N;
            ij6.f530813d = f19;
            ij6.f530814e = f27;
            ij6.f530815f = java.lang.System.currentTimeMillis() / 1000;
        }
        wt1.p pVar = activityC13047x63b575f5.Q;
        float f28 = activityC13047x63b575f5.N;
        float f29 = activityC13047x63b575f5.M;
        synchronized (pVar.f530857i) {
            pVar.f530860o = f29;
            pVar.f530861p = f28;
        }
        if (activityC13047x63b575f5.K) {
            activityC13047x63b575f5.T6();
            activityC13047x63b575f5.K = false;
        }
        i11.e eVar = activityC13047x63b575f5.L;
        if (eVar != null) {
            ((i11.h) eVar).m(activityC13047x63b575f5.R);
        }
        return false;
    }
}
