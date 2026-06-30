package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class id implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.id f185192d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.id();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LikeIconAnimationHelper", "cancel runnable");
        android.animation.ValueAnimator valueAnimator = uw2.h0.f513208b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        uw2.h0.f513208b = null;
        uw2.h0.f513209c = null;
    }
}
