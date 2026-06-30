package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class y2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f287557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.z2 f287558e;

    public y2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.z2 z2Var, android.graphics.Bitmap bitmap) {
        this.f287558e = z2Var;
        this.f287557d = bitmap;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.z2 z2Var = this.f287558e;
        z2Var.f287642a.f287300r.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = z2Var.f287642a.f287300r.getHeight();
        int width = z2Var.f287642a.f287300r.getWidth();
        if (height == 0) {
            height = i65.a.h(z2Var.f287643b.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561770s9);
        }
        if (width == 0) {
            width = i65.a.h(z2Var.f287643b.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.s_);
        }
        z2Var.f287642a.f287300r.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s(this.f287557d, com.p314xaae8f345.mm.R.C30861xcebc809e.bzx, width, height)));
        return true;
    }
}
