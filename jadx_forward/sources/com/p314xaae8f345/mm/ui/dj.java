package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class dj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21440xfcb6d020 f289876d;

    public dj(com.p314xaae8f345.mm.ui.C21440xfcb6d020 c21440xfcb6d020) {
        this.f289876d = c21440xfcb6d020;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.C21440xfcb6d020 c21440xfcb6d020 = this.f289876d;
        android.widget.ImageView imageView = new android.widget.ImageView(c21440xfcb6d020.getContext());
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(c21440xfcb6d020.f278627g);
        imageView.setAlpha(0.0f);
        c21440xfcb6d020.addView(imageView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1000L);
        duration.addUpdateListener(new com.p314xaae8f345.mm.ui.cj(this, imageView));
        duration.start();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SplashWelcomeView", "start play animation");
    }
}
