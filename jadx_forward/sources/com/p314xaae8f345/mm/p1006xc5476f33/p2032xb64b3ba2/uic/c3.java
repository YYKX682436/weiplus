package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class c3 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements ed0.z0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f239905d;

    /* renamed from: e, reason: collision with root package name */
    public long f239906e;

    /* renamed from: f, reason: collision with root package name */
    public int f239907f;

    /* renamed from: g, reason: collision with root package name */
    public int f239908g;

    /* renamed from: h, reason: collision with root package name */
    public final long f239909h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f239905d = "";
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f239909h = java.lang.System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (r4 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O6(long r20, int r22, ox3.f r23, long r24) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3.O6(long, int, ox3.f, long):void");
    }

    public void P6(long j17, int i17) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d2 d2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d2) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d2.class);
        java.lang.String R6 = d2Var != null ? d2Var.R6() : "";
        long j18 = this.f239906e;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7170x1da20682 c7170x1da20682 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7170x1da20682();
        c7170x1da20682.f144691d = j17;
        c7170x1da20682.f144694g = i17 + 1;
        c7170x1da20682.f144692e = c7170x1da20682.b("sessionid", java.lang.String.valueOf(j18), true);
        c7170x1da20682.f144693f = c7170x1da20682.b("search_request_id", R6, true);
        c7170x1da20682.k();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        m158359x1e885992().getIntExtra("ringtone_caller", 1);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("exclusvie_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f239905d = stringExtra;
        if (stringExtra.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneKVReportUIC", "not pass exclusive ringtone name, default my username");
            java.lang.String r17 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
            this.f239905d = r17;
        }
        if (qx3.b.a(this.f239905d.hashCode()) == null) {
            mx3.i0.d(this.f239905d);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        m158359x1e885992().getIntExtra("ringtone_caller", 1);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("exclusvie_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f239905d = stringExtra;
        this.f239908g = m158359x1e885992().getIntExtra("ringtone_channel", 0);
        if (this.f239907f == 0) {
            this.f239907f = m158359x1e885992().getIntExtra("ringtone_scene", 0);
        }
        if (this.f239905d.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneKVReportUIC", "not pass exclusive ringtone name, default my username");
            java.lang.String r17 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
            this.f239905d = r17;
        }
        long longExtra = m158359x1e885992().getLongExtra("ringtone_session_id", 0L);
        this.f239906e = longExtra;
        if (longExtra == 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f239906e = java.lang.System.currentTimeMillis();
        }
        if (qx3.b.a(this.f239905d.hashCode()) == null) {
            mx3.i0.d(this.f239905d);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
    }
}
