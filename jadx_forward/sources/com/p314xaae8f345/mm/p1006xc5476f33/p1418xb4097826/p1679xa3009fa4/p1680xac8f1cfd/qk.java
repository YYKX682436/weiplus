package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class qk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f217250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.HorizontalScrollView f217251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f217252f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15275x4b820d74 f217253g;

    public qk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar, android.widget.HorizontalScrollView horizontalScrollView, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15275x4b820d74 c15275x4b820d74) {
        this.f217250d = blVar;
        this.f217251e = horizontalScrollView;
        this.f217252f = i17;
        this.f217253g = c15275x4b820d74;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int m20352xe06bcb0d;
        oa.i k17;
        zx2.u i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = this.f217250d;
        boolean z17 = blVar.f215428h;
        android.widget.HorizontalScrollView horizontalScrollView = this.f217251e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = horizontalScrollView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79) horizontalScrollView : null;
            if (c15436x4c00d79 == null) {
                return;
            }
            m20352xe06bcb0d = c15436x4c00d79.m62977xe06bcb0d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d792 = horizontalScrollView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79) horizontalScrollView : null;
            if (c15436x4c00d792 != null && (i17 = c15436x4c00d792.i(m20352xe06bcb0d)) != null) {
                i17.b();
            }
        } else {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = horizontalScrollView instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff ? (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) horizontalScrollView : null;
            if (c2718xca2902ff == null) {
                return;
            }
            m20352xe06bcb0d = c2718xca2902ff.m20352xe06bcb0d();
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff2 = horizontalScrollView instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff ? (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) horizontalScrollView : null;
            if (c2718xca2902ff2 != null && (k17 = c2718xca2902ff2.k(m20352xe06bcb0d)) != null) {
                k17.b();
            }
        }
        int i18 = this.f217252f;
        if ((m20352xe06bcb0d >= 0 && m20352xe06bcb0d < i18) != false) {
            horizontalScrollView.scrollTo((int) (((m20352xe06bcb0d + 1) / i18) * horizontalScrollView.getMeasuredWidth()), 0);
        }
        horizontalScrollView.setOnScrollChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pk(blVar, this.f217253g, horizontalScrollView));
    }
}
