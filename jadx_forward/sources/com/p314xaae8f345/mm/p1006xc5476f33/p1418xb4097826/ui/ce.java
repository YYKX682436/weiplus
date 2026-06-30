package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class ce implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f210521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f210522e;

    public ce(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949, android.graphics.Bitmap bitmap) {
        this.f210521d = activityC15059x3e98c949;
        this.f210522e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f210521d;
        activityC15059x3e98c949.f210218y0 = true;
        android.graphics.Bitmap imgBitmap = this.f210522e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imgBitmap, "$imgBitmap");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949.e7(activityC15059x3e98c949, imgBitmap);
    }
}
