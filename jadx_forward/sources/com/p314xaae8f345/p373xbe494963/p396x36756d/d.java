package com.p314xaae8f345.p373xbe494963.p396x36756d;

/* loaded from: classes16.dex */
final /* synthetic */ class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCSnapshotListener f128154a;

    /* renamed from: b, reason: collision with root package name */
    private final android.graphics.Bitmap f128155b;

    private d(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCSnapshotListener tRTCSnapshotListener, android.graphics.Bitmap bitmap) {
        this.f128154a = tRTCSnapshotListener;
        this.f128155b = bitmap;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCSnapshotListener tRTCSnapshotListener, android.graphics.Bitmap bitmap) {
        return new com.p314xaae8f345.p373xbe494963.p396x36756d.d(tRTCSnapshotListener, bitmap);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p373xbe494963.p396x36756d.C3808x20f90ddd.m30507xd745ed67(this.f128154a, this.f128155b);
    }
}
