package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class id implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.convert.id f103659d = new com.tencent.mm.plugin.finder.convert.id();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("LikeIconAnimationHelper", "cancel runnable");
        android.animation.ValueAnimator valueAnimator = uw2.h0.f431675b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        uw2.h0.f431675b = null;
        uw2.h0.f431676c = null;
    }
}
