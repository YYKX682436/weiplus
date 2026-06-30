package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f282553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j3 f282555f;

    public i3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j3 j3Var, android.view.View view, java.lang.String str) {
        this.f282555f = j3Var;
        this.f282553d = view;
        this.f282554e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 uri;
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) this.f282553d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j3 j3Var = this.f282555f;
        java.lang.String str = j3Var.f282591f;
        int i17 = j3Var.f282592g;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 k3Var = j3Var.f282593h;
        if (k3Var.f282662m == null || c21537x5f41189f == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        boolean z17 = false;
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(k3Var.f282664o);
        objArr[2] = java.lang.Boolean.valueOf(k3Var.f282671v == null);
        android.graphics.Bitmap bitmap2 = k3Var.f282671v;
        if (bitmap2 != null && bitmap2.isRecycled()) {
            z17 = true;
        }
        objArr[3] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryLazyLoader", "loadWxImageView position: %d, mLastPosition: %d, previewBitmap == null: %b, recycle: %b", objArr);
        if (i17 != k3Var.f282664o || (bitmap = k3Var.f282671v) == null || bitmap.isRecycled()) {
            java.lang.String str2 = this.f282554e;
            uri = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536.uri(str2) : null;
        } else {
            uri = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536.m15526x34f23cf1(k3Var.f282671v);
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2) k3Var.f282662m).D(c21537x5f41189f, str, uri);
    }
}
