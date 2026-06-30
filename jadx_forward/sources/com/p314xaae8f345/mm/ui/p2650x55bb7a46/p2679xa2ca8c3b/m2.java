package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class m2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f286079d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 f286080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286081f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f286082g;

    public m2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c2 c2Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 v1Var, yb5.d dVar, android.graphics.Bitmap bitmap) {
        this.f286080e = v1Var;
        this.f286081f = dVar;
        this.f286082g = bitmap;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean z17 = this.f286079d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v1 v1Var = this.f286080e;
        if (z17) {
            v1Var.f287300r.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        v1Var.f287300r.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f286079d = true;
        yb5.d dVar = this.f286081f;
        int b17 = i65.a.b(dVar.g(), 24);
        android.graphics.Bitmap bitmap = this.f286082g;
        if (bitmap == null || bitmap.isRecycled()) {
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.q(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560339hr), b17, b17);
        }
        int height = bitmap.getHeight();
        if (b17 > height) {
            b17 = height;
        }
        android.graphics.Bitmap X = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.X(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.I0(android.graphics.Bitmap.createScaledBitmap(bitmap, b17, b17, true), 0.9f), 20);
        int height2 = v1Var.f287300r.getHeight();
        int width = v1Var.f287300r.getWidth();
        if (height2 == 0) {
            height2 = i65.a.h(dVar.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561770s9);
        }
        if (width == 0) {
            width = i65.a.h(dVar.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.s_);
        }
        v1Var.f287300r.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s(X, com.p314xaae8f345.mm.R.C30861xcebc809e.bzr, width, height2)));
        return true;
    }
}
