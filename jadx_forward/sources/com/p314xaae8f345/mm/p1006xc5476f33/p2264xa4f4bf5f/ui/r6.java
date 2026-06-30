package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class r6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 f255775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255776e;

    public r6(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9, java.lang.String str) {
        this.f255775d = activityC18635xb8188ef9;
        this.f255776e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9 = this.f255775d;
        activityC18635xb8188ef9.d7().f554879h.f445447d.add(this.f255776e);
        android.widget.ImageView imageView = activityC18635xb8188ef9.F;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        bk4.f.V(activityC18635xb8188ef9.c7(), activityC18635xb8188ef9.F, activityC18635xb8188ef9.N, null, null, null, false, false, 124, null);
        activityC18635xb8188ef9.g7();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC18635xb8188ef9.C;
        if (c22621x7603e017 != null) {
            c22621x7603e017.requestFocus();
        }
        activityC18635xb8188ef9.mo26063x7b383410();
    }
}
