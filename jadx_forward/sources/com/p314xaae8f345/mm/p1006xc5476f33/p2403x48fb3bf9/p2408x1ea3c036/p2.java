package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class p2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f264128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f264129e;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.q2 q2Var, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        this.f264128d = imageView;
        this.f264129e = imageView2;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.lang.String str = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj).f149939d;
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.f265422a;
        final android.graphics.Bitmap s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(hy4.z.f367739a.a(str), true, r5.getWidth() * 0.1f);
        ku5.u0 u0Var = ku5.t0.f394148d;
        final android.widget.ImageView imageView = this.f264128d;
        final android.widget.ImageView imageView2 = this.f264129e;
        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.luggage.p2$$a
            @Override // java.lang.Runnable
            public final void run() {
                imageView.setVisibility(8);
                android.widget.ImageView imageView3 = imageView2;
                imageView3.setImageBitmap(s07);
                imageView3.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            }
        });
    }
}
