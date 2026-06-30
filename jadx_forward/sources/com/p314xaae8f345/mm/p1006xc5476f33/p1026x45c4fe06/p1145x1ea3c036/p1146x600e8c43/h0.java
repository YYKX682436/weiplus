package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43;

/* loaded from: classes7.dex */
public class h0 extends android.widget.FrameLayout implements gl1.a {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f167056d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 f167057e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f167058f;

    /* renamed from: g, reason: collision with root package name */
    public sd1.c f167059g;

    /* renamed from: h, reason: collision with root package name */
    public c01.l2 f167060h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.i0 r4, android.content.Context r5) {
        /*
            r3 = this;
            android.content.Context r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(r5)
            r5 = 0
            r0 = 0
            r3.<init>(r4, r0, r5)
            r3.f167059g = r0
            com.tencent.mm.plugin.gif.MMAnimateView r5 = new com.tencent.mm.plugin.gif.MMAnimateView
            r5.<init>(r4, r0)
            r3.f167057e = r5
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r3.addView(r5, r0)
            com.tencent.mm.plugin.gif.MMAnimateView r5 = r3.f167057e
            r0 = 8
            r5.setVisibility(r0)
            com.tencent.mm.plugin.gif.MMAnimateView r5 = r3.f167057e
            r2 = 1
            r5.m64934x756aa49b(r2)
            android.widget.ImageView r5 = new android.widget.ImageView
            r5.<init>(r4)
            r3.f167056d = r5
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r1, r1)
            r3.addView(r5, r4)
            android.widget.ImageView r4 = r3.f167056d
            r4.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.h0.<init>(com.tencent.mm.plugin.appbrand.luggage.customize.i0, android.content.Context):void");
    }

    @Override // gb1.j
    public boolean a() {
        return this.f167058f;
    }

    @Override // gl1.a
    /* renamed from: getKeyValueSet */
    public c01.l2 mo51882x3a8beb7a() {
        return this.f167060h;
    }

    @Override // sd1.b
    /* renamed from: getReferrerPolicy */
    public sd1.c mo51883x546d0727() {
        return this.f167059g;
    }

    @Override // gl1.a
    /* renamed from: getView */
    public android.view.View mo51884xfb86a31b() {
        return this;
    }

    @Override // gl1.d
    /* renamed from: setImageBitmap */
    public void mo51885xd44890a8(android.graphics.Bitmap bitmap) {
        this.f167057e.setVisibility(8);
        this.f167056d.setVisibility(0);
        this.f167056d.setImageBitmap(bitmap);
    }

    @Override // gl1.c
    /* renamed from: setImageByteArray */
    public void mo51886x17258818(byte[] bArr) {
        this.f167057e.setVisibility(0);
        this.f167056d.setVisibility(8);
        this.f167057e.u(bArr, "");
    }

    /* renamed from: setImageFilePath */
    public void m51887x75cc54fa(java.lang.String str) {
        this.f167057e.setVisibility(0);
        this.f167056d.setVisibility(8);
        this.f167057e.m64938x75cc54fa(str);
    }

    /* renamed from: setInterceptEvent */
    public void m51888x1b3dbffa(boolean z17) {
        this.f167058f = z17;
    }

    @Override // gl1.a
    /* renamed from: setKeyValueSet */
    public void mo51889xd0f15eee(c01.l2 l2Var) {
        this.f167060h = l2Var;
    }

    @Override // sd1.b
    /* renamed from: setReferrerPolicy */
    public void mo51890x1c636f33(sd1.c cVar) {
        this.f167059g = cVar;
    }

    @Override // gl1.d
    /* renamed from: setScaleType */
    public void mo51891xebd28962(android.widget.ImageView.ScaleType scaleType) {
        this.f167056d.setScaleType(scaleType);
        this.f167057e.setScaleType(scaleType);
    }
}
