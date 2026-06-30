package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.o0 f158346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f158347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158348g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158349h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158350i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158351m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158352n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f158353o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.u1 f158354p;

    public e(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.o0 o0Var, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.u1 u1Var) {
        this.f158345d = str;
        this.f158346e = o0Var;
        this.f158347f = j17;
        this.f158348g = str2;
        this.f158349h = str3;
        this.f158350i = str4;
        this.f158351m = str5;
        this.f158352n = str6;
        this.f158353o = i17;
        this.f158354p = u1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.h.f158370b.a(2, this.f158345d, 5000L);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f158347f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.o0 o0Var = this.f158346e;
        o0Var.f158410m = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation, auth info resp:" + a17 + ", cost:" + o0Var.f158410m);
        if (a17 != null) {
            java.lang.String str = a17.f165869d;
            if (!str.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.fb a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.fb.f166145b.a(str);
                if (a18 != null) {
                    boolean z17 = false;
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.cb cbVar : a18.f166146a) {
                        if (cbVar.f166086b.equals("jsapi_location") && cbVar.f166087c == 1) {
                            z17 = true;
                        }
                    }
                    if (z17) {
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                        i11.h e17 = i11.h.e();
                        if (e17 != null) {
                            e17.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.d(this, currentTimeMillis2, e17), true, false, true);
                            return;
                        } else {
                            o0Var.f158408k = 4;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation fail, getLocation is null");
                        }
                    } else {
                        o0Var.f158408k = 3;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation fail, location no auth");
                    }
                } else {
                    o0Var.f158408k = 4;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation fail, parse auth info error");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.h.e(this.f158348g, this.f158349h, this.f158350i, this.f158351m, this.f158352n, this.f158353o, null, this.f158346e, this.f158354p);
            }
        }
        o0Var.f158408k = 4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation fail, get auth info error");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.h.e(this.f158348g, this.f158349h, this.f158350i, this.f158351m, this.f158352n, this.f158353o, null, this.f158346e, this.f158354p);
    }
}
