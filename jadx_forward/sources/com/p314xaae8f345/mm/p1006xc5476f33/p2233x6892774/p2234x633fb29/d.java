package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.h f253309a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.j f253310b;

    /* renamed from: c, reason: collision with root package name */
    public long f253311c;

    /* renamed from: d, reason: collision with root package name */
    public long f253312d;

    public d() {
        ((ve4.f) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(ve4.f.class)).N6(gm0.j1.b().f354778h, "UploadSportStepEventHandle", new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.a(this));
        this.f253309a = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.d.a():long");
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.h hVar = this.f253309a;
        if (hVar != null) {
            hVar.getClass();
            boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.e();
            hVar.f253322i = z17;
            if (z17) {
                hVar.b();
                hVar.a();
            } else {
                hVar.b();
            }
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, new android.os.Bundle(), com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.k.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c(this));
    }

    public void c(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("config", str);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.o.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.b(this));
    }

    public final boolean d(long j17) {
        if (j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.DeviceStepManager", "invalid step %d", java.lang.Long.valueOf(j17));
            return false;
        }
        if (this.f253310b != null) {
            gm0.j1.d().d(this.f253310b);
        }
        long g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.g();
        long c17 = c01.id.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.DeviceStepManager", "update device Step time: %s stepCount: %s", com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.f(c17), java.lang.Long.valueOf(j17));
        this.f253310b = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.j("", "gh_43f2581f6fd6", (int) (g17 / 1000), (int) (c17 / 1000), (int) j17, com.p314xaae8f345.mm.p2621x8fb0427b.la.m0(), 1);
        gm0.j1.d().g(this.f253310b);
        this.f253312d = c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a;
        zVar.d("KEY_LAST_UPLOAD_DEVICE_STEP_TIME_LONG", c17);
        this.f253311c = j17;
        zVar.d("KEY_LAST_UPLOAD_DEVICE_STEP_COUNT_LONG", j17);
        return true;
    }
}
