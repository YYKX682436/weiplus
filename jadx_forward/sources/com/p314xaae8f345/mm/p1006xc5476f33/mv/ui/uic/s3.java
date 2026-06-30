package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes2.dex */
public final class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f232969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f232970e;

    public s3(android.widget.ImageView imageView, yz5.l lVar) {
        this.f232969d = imageView;
        this.f232970e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView = this.f232969d;
        imageView.animate().alpha(1.0f).setDuration(200L).withEndAction(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.r3(imageView, this.f232970e)).start();
    }
}
