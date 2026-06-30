package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class q2 implements cy3.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b3 f239998a;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b3 b3Var) {
        this.f239998a = b3Var;
    }

    @Override // cy3.v
    /* renamed from: onPageSelected */
    public void mo63123x510f45c9(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b3 b3Var = this.f239998a;
        int i18 = b3Var.f239896s;
        if (i18 != i17) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = b3Var.f239890m;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8148xed6e4d18(i18, java.lang.Boolean.FALSE);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = b3Var.f239890m;
            if (c22848x6ddd90cf2 != null) {
                c22848x6ddd90cf2.m8148xed6e4d18(i17, java.lang.Boolean.TRUE);
            }
        }
        b3Var.f239896s = i17;
    }
}
