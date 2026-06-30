package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

/* loaded from: classes12.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.j f253314a;

    /* renamed from: b, reason: collision with root package name */
    public long f253315b;

    /* renamed from: c, reason: collision with root package name */
    public long f253316c;

    public f() {
        ((ve4.f) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(ve4.f.class)).N6(gm0.j1.b().f354778h, "UploadSportStepEventHandle", new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.e(this));
    }

    public long a() {
        if (this.f253316c == 0) {
            this.f253316c = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a.a("KEY_LAST_UPLOAD_EXT_API_STEP_COUNT_LONG", 0L);
        }
        return this.f253316c;
    }

    public long b() {
        long g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.g();
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a;
        long a17 = zVar.a("KEY_EXT_API_LAST_STEP_TIME_LONG", 0L);
        long a18 = zVar.a("KEY_EXT_API_TODAY_STEP_LONG", 0L);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(a17);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (g17 == calendar.getTimeInMillis()) {
            return a18;
        }
        return 0L;
    }

    public final boolean c(long j17) {
        if (j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExtApiStepManager", "invalid step %d", java.lang.Long.valueOf(j17));
            return false;
        }
        if (this.f253314a != null) {
            gm0.j1.d().d(this.f253314a);
        }
        long c17 = c01.id.c();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExtApiStepManager", "update Api Step time: %s stepCount: %s", com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.f(c17), java.lang.Long.valueOf(j17));
        this.f253314a = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.j("", "gh_43f2581f6fd6", (int) (calendar.getTimeInMillis() / 1000), (int) (c17 / 1000), (int) j17, com.p314xaae8f345.mm.p2621x8fb0427b.la.m0(), 2);
        gm0.j1.d().g(this.f253314a);
        this.f253315b = c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a;
        zVar.d("KEY_LAST_UPLOAD_EXT_API_STEP_TIME_LONG", c17);
        this.f253316c = j17;
        zVar.d("KEY_LAST_UPLOAD_EXT_API_STEP_COUNT_LONG", j17);
        return true;
    }
}
