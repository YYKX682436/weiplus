package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class l50 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50 f216556d;

    public l50(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50 m50Var) {
        this.f216556d = m50Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50 m50Var = this.f216556d;
        long j17 = currentTimeMillis - m50Var.f216658e;
        int i17 = (int) (j17 / 30000);
        m50Var.f216657d = i17;
        if (i17 < m50Var.f216662i || j17 < m50Var.f216661h) {
            return true;
        }
        p3325xe03a0797.p3326xc267989b.l.d(m50Var.m158345xefc66565(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k50(m50Var, null), 3, null);
        return false;
    }
}
