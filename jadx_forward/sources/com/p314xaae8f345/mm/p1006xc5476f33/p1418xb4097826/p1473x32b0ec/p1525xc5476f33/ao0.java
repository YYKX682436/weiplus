package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ao0 implements ke2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.C14274x56897b10 f193445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f193446b;

    public ao0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.C14274x56897b10 c14274x56897b10, int i17) {
        this.f193445a = c14274x56897b10;
        this.f193446b = i17;
    }

    @Override // ke2.l0
    public void a(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.C14274x56897b10 c14274x56897b10 = this.f193445a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14274x56897b10.getTAG(), "[CgiFinderLiveSwitchIdentity] failed");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xn0(c14274x56897b10));
    }

    @Override // ke2.l0
    public void b(r45.jb2 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.C14274x56897b10 c14274x56897b10 = this.f193445a;
        java.lang.String tag = c14274x56897b10.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[CgiFinderLiveSwitchIdentity] success USERINFO_FINDER_LIVE_VISITOR_ROLE_INT_SYNC ");
        int i17 = this.f193446b;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, sb6.toString());
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zn0(c14274x56897b10, i17));
    }
}
