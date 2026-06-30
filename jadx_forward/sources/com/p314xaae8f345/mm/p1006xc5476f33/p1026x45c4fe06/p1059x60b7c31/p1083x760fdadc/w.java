package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes15.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12075x8f3ab8b2 f162252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f162253e;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12075x8f3ab8b2 c12075x8f3ab8b2, int i17) {
        this.f162252d = c12075x8f3ab8b2;
        this.f162253e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12075x8f3ab8b2 c12075x8f3ab8b2 = this.f162252d;
        c12075x8f3ab8b2.scrollTo(c12075x8f3ab8b2.getScrollX(), this.f162253e);
    }
}
