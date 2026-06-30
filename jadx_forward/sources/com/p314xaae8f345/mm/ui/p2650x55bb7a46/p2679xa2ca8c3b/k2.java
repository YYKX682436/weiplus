package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class k2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f285829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l2 f285830e;

    public k2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l2 l2Var, android.graphics.Bitmap bitmap) {
        this.f285830e = l2Var;
        this.f285829d = bitmap;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.l2 l2Var = this.f285830e;
        l2Var.f285917a.f287300r.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = l2Var.f285917a.f287300r.getHeight();
        int width = l2Var.f285917a.f287300r.getWidth();
        if (height == 0) {
            height = i65.a.h(l2Var.f285918b.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561770s9);
        }
        if (width == 0) {
            width = i65.a.h(l2Var.f285918b.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.s_);
        }
        l2Var.f285917a.f287300r.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s(this.f285829d, com.p314xaae8f345.mm.R.C30861xcebc809e.bzr, width, height)));
        return true;
    }
}
