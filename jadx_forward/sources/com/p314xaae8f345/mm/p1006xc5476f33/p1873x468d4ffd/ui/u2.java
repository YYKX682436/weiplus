package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d f230964d;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d) {
        this.f230964d = activityC16554x70dcab5d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230964d;
        java.lang.String i17 = ai3.d.i(activityC16554x70dcab5d.f230768m.mo127744x5000ed37());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t2(this, ((i17 + "\n" + java.lang.String.format("FPS: %s", java.lang.Float.valueOf(activityC16554x70dcab5d.f230768m.c()))) + "\n" + java.lang.String.format("TIME_RECODER_2_PLAY: %s", java.lang.Long.valueOf(ai3.d.n("TIME_RECODER_2_PLAY")))) + "\n" + java.lang.String.format("CPU: cur %s max:%s", wo.r.d(), wo.r.e())));
    }
}
