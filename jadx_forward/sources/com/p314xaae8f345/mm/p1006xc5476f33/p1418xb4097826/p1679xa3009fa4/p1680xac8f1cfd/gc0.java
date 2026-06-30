package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class gc0 implements cy3.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 f216032a;

    public gc0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 nc0Var) {
        this.f216032a = nc0Var;
    }

    @Override // cy3.v
    /* renamed from: onPageSelected */
    public void mo63123x510f45c9(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 nc0Var = this.f216032a;
        int i18 = nc0Var.f216854s;
        if (i18 != i17) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = nc0Var.f216850o;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8148xed6e4d18(i18, java.lang.Boolean.FALSE);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = nc0Var.f216850o;
            if (c22848x6ddd90cf2 != null) {
                c22848x6ddd90cf2.m8148xed6e4d18(i17, java.lang.Boolean.TRUE);
            }
        }
        nc0Var.f216854s = i17;
    }
}
