package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes5.dex */
public final class l3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f206646a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f206647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f206648c;

    public l3(long j17, int i17, int i18) {
        this.f206646a = j17;
        this.f206647b = i17;
        this.f206648c = i18;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        long j17 = this.f206646a;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6458x7de9e873 c6458x7de9e873 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6458x7de9e873();
            c6458x7de9e873.f138010d = c6458x7de9e873.b("object_id", pm0.v.u(j17), true);
            c6458x7de9e873.f138011e = this.f206647b;
            c6458x7de9e873.f138012f = this.f206648c;
            c6458x7de9e873.f138013g = fVar.f152148a;
            c6458x7de9e873.f138014h = fVar.f152149b;
            c6458x7de9e873.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderReportLogic", "reportHardAdvertisement end, feedId=" + pm0.v.u(j17) + ", errType=" + fVar.f152148a + ", errCode=" + fVar.f152149b + ", errMsg=" + fVar.f152150c);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        return p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
    }
}
