package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f227089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f227090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227091f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r1 f227092g;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r1 r1Var, android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        this.f227092g = r1Var;
        this.f227089d = bitmap;
        this.f227090e = i17;
        this.f227091f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r1 r1Var = this.f227092g;
        int i18 = r1Var.f227103b;
        android.graphics.Bitmap createScaledBitmap = (i18 <= 0 || (i17 = r1Var.f227104c) <= 0) ? this.f227089d : android.graphics.Bitmap.createScaledBitmap(this.f227089d, i18, i17, true);
        int i19 = this.f227092g.f227103b;
        int i27 = this.f227092g.f227104c;
        this.f227089d.getWidth();
        this.f227089d.getHeight();
        createScaledBitmap.getWidth();
        createScaledBitmap.getHeight();
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.p1(this, createScaledBitmap));
    }
}
