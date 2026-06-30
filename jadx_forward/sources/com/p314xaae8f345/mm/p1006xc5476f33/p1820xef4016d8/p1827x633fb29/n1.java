package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f226988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f226989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226990f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o1 f226991g;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o1 o1Var, android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        this.f226991g = o1Var;
        this.f226988d = bitmap;
        this.f226989e = i17;
        this.f226990f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o1 o1Var = this.f226991g;
        int i18 = o1Var.f227021b;
        android.graphics.Bitmap createScaledBitmap = (i18 <= 0 || (i17 = o1Var.f227022c) <= 0) ? this.f226988d : android.graphics.Bitmap.createScaledBitmap(this.f226988d, i18, i17, true);
        int i19 = this.f226991g.f227023d;
        android.graphics.Bitmap s07 = i19 > 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(createScaledBitmap, false, i19) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(createScaledBitmap, false, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8));
        int i27 = this.f226991g.f227021b;
        int i28 = this.f226991g.f227022c;
        this.f226988d.getWidth();
        this.f226988d.getHeight();
        s07.getWidth();
        s07.getHeight();
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m1(this, s07));
    }
}
