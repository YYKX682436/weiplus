package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 f239995d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 v0Var) {
        this.f239995d = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<ox3.a> m82898xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 v0Var = this.f239995d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = v0Var.f240051m;
        if (c22848x6ddd90cf == null || (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) == null) {
            return;
        }
        for (ox3.a aVar : m82898xfb7e5820) {
            aVar.f431255e = false;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = v0Var.f240051m;
            if (c22848x6ddd90cf2 != null) {
                c22848x6ddd90cf2.d0(aVar.mo2128x1ed62e84(), java.lang.Boolean.FALSE);
            }
        }
    }
}
