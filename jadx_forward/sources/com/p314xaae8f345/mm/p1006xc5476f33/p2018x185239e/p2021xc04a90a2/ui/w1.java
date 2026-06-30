package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes9.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f238271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.x1 f238272e;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.x1 x1Var, android.graphics.Bitmap bitmap) {
        this.f238272e = x1Var;
        this.f238271d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.x1 x1Var = this.f238272e;
        android.graphics.Bitmap bitmap = this.f238271d;
        if (bitmap != null) {
            x1Var.f238274a.D.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bitmap, false, bitmap.getWidth() * 0.1f));
        } else {
            x1Var.f238274a.D.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        }
    }
}
