package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f226840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i1 f226841e;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i1 i1Var, android.graphics.Bitmap bitmap) {
        this.f226841e = i1Var;
        this.f226840d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f226841e.f226863a.setImageBitmap(this.f226840d);
    }
}
