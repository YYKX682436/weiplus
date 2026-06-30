package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class ad implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15310x1d9feb31 f213165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f213166e;

    public ad(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15310x1d9feb31 c15310x1d9feb31, int i17) {
        this.f213165d = c15310x1d9feb31;
        this.f213166e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15310x1d9feb31 c15310x1d9feb31 = this.f213165d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15310x1d9feb31.d(c15310x1d9feb31);
        if (this.f213166e == 1) {
            c15310x1d9feb31.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zc(c15310x1d9feb31), 0L);
        }
    }
}
