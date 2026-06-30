package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f230569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f230570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f230571f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a f230572g;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a c16543xabefc23a, int i17, int i18, int i19) {
        this.f230572g = c16543xabefc23a;
        this.f230569d = i17;
        this.f230570e = i18;
        this.f230571f = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a c16543xabefc23a = this.f230572g;
        int i17 = c16543xabefc23a.f230481p * 2;
        int i18 = this.f230569d;
        if (i18 <= i17) {
            throw new java.lang.IllegalStateException("MaxExtent can not less than sliderWidth * 2");
        }
        c16543xabefc23a.f230473e = true;
        int i19 = this.f230570e;
        c16543xabefc23a.f230491z = i19;
        c16543xabefc23a.f230475g = java.lang.Math.min(i18, c16543xabefc23a.getWidth() - (i19 * 2));
        c16543xabefc23a.f230476h = java.lang.Math.max(this.f230571f, 0);
        c16543xabefc23a.e();
        if (c16543xabefc23a.B == null && c16543xabefc23a.C == null) {
            c16543xabefc23a.B = new android.graphics.Rect(c16543xabefc23a.f230479n.getBounds().left, c16543xabefc23a.f230479n.getBounds().top, c16543xabefc23a.f230479n.getBounds().right, c16543xabefc23a.f230479n.getBounds().bottom);
            c16543xabefc23a.C = new android.graphics.Rect(c16543xabefc23a.f230480o.getBounds().left, c16543xabefc23a.f230480o.getBounds().top, c16543xabefc23a.f230480o.getBounds().right, c16543xabefc23a.f230480o.getBounds().bottom);
        }
        c16543xabefc23a.invalidate();
    }
}
