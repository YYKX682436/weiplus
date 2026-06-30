package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class i5 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f285697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j5 f285698e;

    public i5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j5 j5Var, android.graphics.Bitmap bitmap) {
        this.f285698e = j5Var;
        this.f285697d = bitmap;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j5 j5Var = this.f285698e;
        j5Var.f285765b.f285928f.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = j5Var.f285765b.f285928f.getHeight();
        int width = j5Var.f285765b.f285928f.getWidth();
        if (height == 0) {
            height = i65.a.h(j5Var.f285764a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561770s9);
        }
        if (width == 0) {
            width = i65.a.h(j5Var.f285764a, com.p314xaae8f345.mm.R.C30860x5b28f31.s_);
        }
        boolean z17 = j5Var.f285765b.f285929g;
        android.graphics.Bitmap bitmap = this.f285697d;
        j5Var.f285765b.f285928f.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(z17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s(bitmap, com.p314xaae8f345.mm.R.C30861xcebc809e.bzr, width, height) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s(bitmap, com.p314xaae8f345.mm.R.C30861xcebc809e.bzx, width, height)));
        return true;
    }
}
