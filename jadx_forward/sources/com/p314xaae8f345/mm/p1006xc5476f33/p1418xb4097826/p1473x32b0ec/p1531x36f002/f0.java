package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14289xc04495d2 f197033d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14289xc04495d2 c14289xc04495d2) {
        this.f197033d = c14289xc04495d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14289xc04495d2 c14289xc04495d2 = this.f197033d;
        if (c14289xc04495d2.getChildCount() > 1) {
            c14289xc04495d2.removeViewAt(0);
        }
    }
}
