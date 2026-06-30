package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t4 f287018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f287019g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f287020h;

    public s4(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.t4 t4Var, boolean z17, android.view.View view) {
        this.f287016d = str;
        this.f287017e = str2;
        this.f287018f = t4Var;
        this.f287019g = z17;
        this.f287020h = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f287016d, "get background url: %s", this.f287017e);
        int height = this.f287018f.f39493x8ad70635.getHeight();
        int width = this.f287018f.f39493x8ad70635.getWidth();
        android.graphics.Bitmap e17 = n11.a.b().e(this.f287017e);
        if (e17 != null) {
            this.f287020h.setBackground(new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e, com.p314xaae8f345.mm.sdk.p2603x2137b148.x.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(e17, width, height, false), true ^ this.f287019g ? com.p314xaae8f345.mm.R.C30861xcebc809e.bgs : com.p314xaae8f345.mm.R.C30861xcebc809e.bzy)));
            return;
        }
        o11.f fVar = new o11.f();
        fVar.f423616g = g83.a.b();
        fVar.f423611b = true;
        fVar.f423610a = true;
        fVar.f423628s = false;
        fVar.f423619j = width;
        fVar.f423620k = height;
        o11.g a17 = fVar.a();
        this.f287020h.setTag(com.p314xaae8f345.mm.R.id.nvv, this.f287017e);
        n11.a.b().k(this.f287017e, null, a17, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.r4(this, height, width));
    }
}
