package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f262441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f262442e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l lVar, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f262441d = imageView;
        this.f262442e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f262441d.setImageBitmap(this.f262442e);
    }
}
