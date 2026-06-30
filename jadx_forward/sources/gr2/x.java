package gr2;

/* loaded from: classes10.dex */
public final class x implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 f356367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f356368b;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 c14572x50388393, long j17) {
        this.f356367a = c14572x50388393;
        this.f356368b = j17;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        nn0.c m58466x2a55bdd7;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryToNotifyLiveEnd liveStatus:");
        sb6.append(i17);
        sb6.append(", local liveId:");
        long j18 = this.f356368b;
        sb6.append(j18);
        sb6.append(" resp live id ");
        sb6.append(j17);
        sb6.append('!');
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 c14572x50388393 = this.f356367a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393.s(c14572x50388393, sb7, 0, 2, null);
        if (j18 == j17 && i17 == 2) {
            m58466x2a55bdd7 = c14572x50388393.m58466x2a55bdd7();
            if (m58466x2a55bdd7 != null) {
                mn0.b0.C(m58466x2a55bdd7, true, false, false, 6, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393.i(c14572x50388393);
        }
    }
}
