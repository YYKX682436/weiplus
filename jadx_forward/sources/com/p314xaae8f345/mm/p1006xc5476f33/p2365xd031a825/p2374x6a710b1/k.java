package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f262444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f262445e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l lVar, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f262444d = imageView;
        this.f262445e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f262444d.setImageBitmap(this.f262445e);
    }
}
