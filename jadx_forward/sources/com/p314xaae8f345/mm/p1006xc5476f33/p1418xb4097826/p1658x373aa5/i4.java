package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b f213818d;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b) {
        this.f213818d = c15260x406bbe1b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b.H;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b = this.f213818d;
        c15260x406bbe1b.getClass();
        int f17 = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        int width = c15260x406bbe1b.c().getWidth();
        int min = ((width - java.lang.Math.min(width, (int) (r2.getHeight() * 0.5625f))) / 2) - com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x.f214844d;
        if (min >= f17) {
            f17 = min;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea m61759x4905e9fa = c15260x406bbe1b.m61759x4905e9fa();
        m61759x4905e9fa.setPadding(f17, m61759x4905e9fa.getPaddingTop(), f17, m61759x4905e9fa.getPaddingBottom());
        c15260x406bbe1b.m61759x4905e9fa().setClipToPadding(false);
    }
}
