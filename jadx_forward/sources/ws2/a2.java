package ws2;

/* loaded from: classes15.dex */
public final class a2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public long f530535d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f530536e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 f530537f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cw2.wa f530538g;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9, cw2.wa waVar) {
        this.f530537f = c14932xfc4acec9;
        this.f530538g = waVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f530537f;
        long mo56685x3d7f3f1d = c14932xfc4acec9.mo56685x3d7f3f1d();
        long mo56695x7723e6ff = c14932xfc4acec9.mo56695x7723e6ff();
        if (this.f530536e != mo56685x3d7f3f1d) {
            cw2.fb lifecycle = c14932xfc4acec9.getLifecycle();
            cw2.wa waVar = this.f530538g;
            if (lifecycle != null) {
                lifecycle.v(waVar.f305630d, mo56685x3d7f3f1d, mo56695x7723e6ff);
            }
            long j17 = this.f530535d;
            if (j17 == -1 || mo56685x3d7f3f1d - j17 > 1000 || mo56685x3d7f3f1d < j17) {
                cw2.fb lifecycle2 = c14932xfc4acec9.getLifecycle();
                if (lifecycle2 != null) {
                    cw2.fb.w(lifecycle2, waVar.f305630d, ((int) mo56685x3d7f3f1d) / 1000, ((int) mo56695x7723e6ff) / 1000, null, 8, null);
                }
                java.lang.String m58777xe56ce956 = c14932xfc4acec9.m58777xe56ce956();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(mo56685x3d7f3f1d);
                sb6.append('/');
                sb6.append(mo56695x7723e6ff);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m58777xe56ce956, sb6.toString());
                this.f530535d = mo56685x3d7f3f1d;
            }
            this.f530536e = mo56685x3d7f3f1d;
        }
        nk4.a aVar = c14932xfc4acec9.F;
        if (aVar == null) {
            return true;
        }
        aVar.i(mo56685x3d7f3f1d, mo56695x7723e6ff);
        return true;
    }
}
