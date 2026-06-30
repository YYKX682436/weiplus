package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class h6 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d f171286d;

    public h6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d activityC12650x33e7e92d) {
        this.f171286d = activityC12650x33e7e92d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f368;
        super.onAnimationEnd(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d activityC12650x33e7e92d = this.f171286d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 o76 = activityC12650x33e7e92d.o7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = o76 == null ? null : o76.L1;
        if (c11816x5915d2c1 != null && (c11820x84c5f368 = c11816x5915d2c1.f158899p) != null) {
            c11820x84c5f368.b(false);
        }
        super/*com.tencent.mm.plugin.appbrand.ui.AppBrandUI*/.finish();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f368;
        super.onAnimationStart(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 o76 = this.f171286d.o7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = o76 == null ? null : o76.L1;
        if (c11816x5915d2c1 == null || (c11820x84c5f368 = c11816x5915d2c1.f158899p) == null) {
            return;
        }
        c11820x84c5f368.b(true);
    }
}
