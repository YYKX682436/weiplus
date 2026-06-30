package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f234861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16818xbff037ef f234862e;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16818xbff037ef activityC16818xbff037ef, android.graphics.Bitmap bitmap) {
        this.f234862e = activityC16818xbff037ef;
        this.f234861d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f234862e.f234782g.setImageBitmap(this.f234861d);
    }
}
