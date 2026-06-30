package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class k5 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f285840d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f285841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f285842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l5 f285843g;

    public k5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l5 l5Var, android.content.Context context, android.graphics.Bitmap bitmap) {
        this.f285843g = l5Var;
        this.f285841e = context;
        this.f285842f = bitmap;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean z17 = this.f285840d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l5 l5Var = this.f285843g;
        if (z17) {
            l5Var.f285928f.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        l5Var.f285928f.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f285840d = true;
        android.content.Context context = this.f285841e;
        int b17 = i65.a.b(context, 24);
        android.graphics.Bitmap bitmap = this.f285842f;
        if (bitmap == null || bitmap.isRecycled()) {
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.q(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560339hr), b17, b17);
        }
        int height = bitmap.getHeight();
        if (b17 > height) {
            b17 = height;
        }
        android.graphics.Bitmap X = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.X(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.I0(android.graphics.Bitmap.createScaledBitmap(bitmap, b17, b17, true), 0.9f), 20);
        int height2 = l5Var.f285928f.getHeight();
        int width = l5Var.f285928f.getWidth();
        if (height2 == 0) {
            height2 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561770s9);
        }
        if (width == 0) {
            width = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.s_);
        }
        l5Var.f285928f.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(l5Var.f285929g ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s(X, com.p314xaae8f345.mm.R.C30861xcebc809e.bzr, width, height2) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s(X, com.p314xaae8f345.mm.R.C30861xcebc809e.bzx, width, height2)));
        return true;
    }
}
