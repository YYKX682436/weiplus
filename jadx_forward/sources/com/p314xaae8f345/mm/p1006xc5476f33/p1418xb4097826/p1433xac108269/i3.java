package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 f183782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx2.q f183783e;

    public i3(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37, gx2.q qVar) {
        this.f183782d = abstractActivityC22579xbed01a37;
        this.f183783e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = this.f183782d;
        if (abstractActivityC22579xbed01a37.isFinishing() || abstractActivityC22579xbed01a37.isDestroyed()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.m(this.f183783e, false, 1, null);
    }
}
