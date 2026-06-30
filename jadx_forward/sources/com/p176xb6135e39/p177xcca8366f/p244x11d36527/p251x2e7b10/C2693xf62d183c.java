package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p251x2e7b10;

/* renamed from: com.google.android.material.card.MaterialCardView */
/* loaded from: classes13.dex */
public class C2693xf62d183c extends p012xc85e97e9.p062xff91adb5.p063xd1075a44.C1055x35d85f5 {

    /* renamed from: n, reason: collision with root package name */
    public final aa.a f125996n;

    public C2693xf62d183c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559878hc);
    }

    /* renamed from: getStrokeColor */
    public int m20130x4b6e32d5() {
        return this.f125996n.f84009b;
    }

    /* renamed from: getStrokeWidth */
    public int m20131x4c853138() {
        return this.f125996n.f84010c;
    }

    @Override // p012xc85e97e9.p062xff91adb5.p063xd1075a44.C1055x35d85f5
    /* renamed from: setRadius */
    public void mo6995x205ac394(float f17) {
        super.mo6995x205ac394(f17);
        this.f125996n.b();
    }

    /* renamed from: setStrokeColor */
    public void m20132xe1d3a649(int i17) {
        aa.a aVar = this.f125996n;
        aVar.f84009b = i17;
        aVar.b();
    }

    /* renamed from: setStrokeWidth */
    public void m20133xe2eaa4ac(int i17) {
        aa.a aVar = this.f125996n;
        aVar.f84010c = i17;
        aVar.b();
        aVar.a();
    }

    public C2693xf62d183c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f515658o, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576286vb, new int[0]);
        aa.a aVar = new aa.a(this);
        this.f125996n = aVar;
        aVar.f84009b = d17.getColor(0, -1);
        aVar.f84010c = d17.getDimensionPixelSize(1, 0);
        aVar.b();
        aVar.a();
        d17.recycle();
    }
}
