package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f260041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.u1 f260042e;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.u1 u1Var, android.graphics.Bitmap bitmap) {
        this.f260042e = u1Var;
        this.f260041d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.u1 u1Var = this.f260042e;
        if (u1Var.f260049e.f259366f == null || (imageView = u1Var.f260048d) == null || imageView.getTag() == null || !u1Var.f260048d.getTag().equals(u1Var.f260049e.f259366f.f69225xed6d60f6)) {
            return;
        }
        u1Var.f260048d.setImageBitmap(this.f260041d);
    }
}
