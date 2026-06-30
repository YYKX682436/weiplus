package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f247330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f247331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z1 f247332f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f247333g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y1 f247334h;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y1 y1Var, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z1 z1Var, java.lang.Object obj) {
        this.f247334h = y1Var;
        this.f247330d = i17;
        this.f247331e = i18;
        this.f247332f = z1Var;
        this.f247333g = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9;
        java.lang.Object obj = this.f247333g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z1 z1Var = this.f247332f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback$1");
        try {
            boolean z17 = this.f247330d == 0 && this.f247331e == 0;
            z1Var.m0();
            java.lang.String str = "-1";
            if (obj instanceof java.lang.String) {
                org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) obj);
                java.lang.String optString = jSONObject.optString("status");
                int optInt = jSONObject.optInt("opType");
                str = optString;
                i17 = optInt;
            } else {
                i17 = -1;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCallback, status=");
            sb6.append(str);
            sb6.append(", opType=");
            sb6.append(i17);
            sb6.append(", appointmentId=");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y1 y1Var = this.f247334h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
            long j17 = y1Var.f247374c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback");
            sb6.append(j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ADAppointment.AdLandingPageAppointmentBtnComp", sb6.toString());
            if (z17) {
                if (i17 == 0 && "1".equals(str)) {
                    db4.a aVar = z1Var.B;
                    if (aVar == null || (c17702x544f64e9 = aVar.f84429p1) == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z1.i0(z1Var);
                    } else {
                        e54.a.a(z1Var.f246582d, c17702x544f64e9, z1Var.u(), z1Var.B.f84350d);
                    }
                } else if (i17 == 1 && "0".equals(str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z1.j0(z1Var, i17, true);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z1.l0(z1Var, str);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z1.j0(z1Var, i17, false);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ADAppointment.AdLandingPageAppointmentBtnComp", "onCallback exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$AppointmentCallback$1");
    }
}
