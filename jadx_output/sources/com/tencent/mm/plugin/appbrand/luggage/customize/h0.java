package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes7.dex */
public class h0 extends android.widget.FrameLayout implements gl1.a {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f85523d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.gif.MMAnimateView f85524e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f85525f;

    /* renamed from: g, reason: collision with root package name */
    public sd1.c f85526g;

    /* renamed from: h, reason: collision with root package name */
    public c01.l2 f85527h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h0(com.tencent.mm.plugin.appbrand.luggage.customize.i0 r4, android.content.Context r5) {
        /*
            r3 = this;
            android.content.Context r4 = com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(r5)
            r5 = 0
            r0 = 0
            r3.<init>(r4, r0, r5)
            r3.f85526g = r0
            com.tencent.mm.plugin.gif.MMAnimateView r5 = new com.tencent.mm.plugin.gif.MMAnimateView
            r5.<init>(r4, r0)
            r3.f85524e = r5
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r3.addView(r5, r0)
            com.tencent.mm.plugin.gif.MMAnimateView r5 = r3.f85524e
            r0 = 8
            r5.setVisibility(r0)
            com.tencent.mm.plugin.gif.MMAnimateView r5 = r3.f85524e
            r2 = 1
            r5.setBoundaryCheckInvalid(r2)
            android.widget.ImageView r5 = new android.widget.ImageView
            r5.<init>(r4)
            r3.f85523d = r5
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r1, r1)
            r3.addView(r5, r4)
            android.widget.ImageView r4 = r3.f85523d
            r4.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.luggage.customize.h0.<init>(com.tencent.mm.plugin.appbrand.luggage.customize.i0, android.content.Context):void");
    }

    @Override // gb1.j
    public boolean a() {
        return this.f85525f;
    }

    @Override // gl1.a
    public c01.l2 getKeyValueSet() {
        return this.f85527h;
    }

    @Override // sd1.b
    public sd1.c getReferrerPolicy() {
        return this.f85526g;
    }

    @Override // gl1.a
    public android.view.View getView() {
        return this;
    }

    @Override // gl1.d
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        this.f85524e.setVisibility(8);
        this.f85523d.setVisibility(0);
        this.f85523d.setImageBitmap(bitmap);
    }

    @Override // gl1.c
    public void setImageByteArray(byte[] bArr) {
        this.f85524e.setVisibility(0);
        this.f85523d.setVisibility(8);
        this.f85524e.u(bArr, "");
    }

    public void setImageFilePath(java.lang.String str) {
        this.f85524e.setVisibility(0);
        this.f85523d.setVisibility(8);
        this.f85524e.setImageFilePath(str);
    }

    public void setInterceptEvent(boolean z17) {
        this.f85525f = z17;
    }

    @Override // gl1.a
    public void setKeyValueSet(c01.l2 l2Var) {
        this.f85527h = l2Var;
    }

    @Override // sd1.b
    public void setReferrerPolicy(sd1.c cVar) {
        this.f85526g = cVar;
    }

    @Override // gl1.d
    public void setScaleType(android.widget.ImageView.ScaleType scaleType) {
        this.f85523d.setScaleType(scaleType);
        this.f85524e.setScaleType(scaleType);
    }
}
