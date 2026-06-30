package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes15.dex */
public class b implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00 f257766d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00 abstractActivityC18835xbdcc0e00) {
        this.f257766d = abstractActivityC18835xbdcc0e00;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00 abstractActivityC18835xbdcc0e00 = this.f257766d;
        fq4.d0 d0Var = abstractActivityC18835xbdcc0e00.f257702i;
        if (d0Var == null) {
            return true;
        }
        w21.k0 k0Var = d0Var.f347113a;
        if (k0Var != null) {
            int d17 = k0Var.d();
            if (d17 > fq4.d0.f347112h) {
                fq4.d0.f347112h = d17;
            }
            i17 = (d17 * 100) / fq4.d0.f347112h;
        } else {
            i17 = 0;
        }
        float f17 = i17;
        abstractActivityC18835xbdcc0e00.getClass();
        if (f17 < 10.0f) {
            f17 = 10.0f;
        }
        if (f17 > 100.0f) {
            f17 = 100.0f;
        }
        abstractActivityC18835xbdcc0e00.f257700g.m72724x27f73e1c(f17 / 100.0f);
        return true;
    }
}
