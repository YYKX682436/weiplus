package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f226917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l1 f226919f;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l1 l1Var, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f226919f = l1Var;
        this.f226917d = bitmap;
        this.f226918e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l1 l1Var = this.f226919f;
        int i18 = l1Var.f226938b;
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.j1(this, (i18 <= 0 || (i17 = l1Var.f226939c) <= 0) ? this.f226917d : android.graphics.Bitmap.createScaledBitmap(this.f226917d, i18, i17, true)));
    }
}
