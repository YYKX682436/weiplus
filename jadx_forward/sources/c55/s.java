package c55;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f120292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c55.u f120293e;

    public s(c55.u uVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f120293e = uVar;
        this.f120292d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        c55.u uVar = this.f120293e;
        com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509 activityC19822xa98ed509 = uVar.f120299d;
        java.lang.Thread thread = com.p314xaae8f345.mm.p2499xd05e7f95.ui.ActivityC19822xa98ed509.f273725s;
        activityC19822xa98ed509.getClass();
        try {
            d55.a0 a0Var = new d55.a0(activityC19822xa98ed509);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("crash count = ");
            com.p314xaae8f345.mm.p2500x32bcfcd1.C19823xc30d8063 c19823xc30d8063 = activityC19822xa98ed509.f273736p;
            sb6.append(c19823xc30d8063 == null ? 0 : c19823xc30d8063.f273739d);
            sb6.append(", recovery setting = ");
            sb6.append(a0Var.f308089b);
            d55.u.b("MicroMsg.recovery.ui", sb6.toString(), new java.lang.Object[0]);
            d55.u.b("MicroMsg.recovery.ui", "clean tinker path (if exists)", new java.lang.Object[0]);
            try {
                boolean z17 = ak0.x.f87081k;
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104669xea9e22e2(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104679xac1dbbfb(ak0.o.a()));
            } catch (java.lang.Throwable th6) {
                d55.u.c("MicroMsg.recovery.ui", "unable to clean patch", th6, new java.lang.Object[0]);
            }
            d55.u.b("MicroMsg.recovery.ui", "clean tinker path done", new java.lang.Object[0]);
            for (java.util.Map.Entry entry : ((java.util.HashMap) d55.r0.a().f308149c).entrySet()) {
                try {
                    y45.f fVar = (y45.f) ((d55.s) entry.getValue());
                    fVar.b(activityC19822xa98ed509.getApplicationContext());
                    d55.u.d("MicroMsg.recovery.ui", "on recovery fallback, operation: \n" + fVar.f308145b.toString(), new java.lang.Object[0]);
                    if (activityC19822xa98ed509.f273736p != null) {
                        d55.t.a(activityC19822xa98ed509.getApplicationContext(), (java.lang.String) entry.getKey(), activityC19822xa98ed509.f273736p, (d55.s) entry.getValue());
                    }
                } catch (java.lang.Throwable th7) {
                    d55.u.c("MicroMsg.recovery.ui", "on recovery fallback fail, key = " + ((java.lang.String) entry.getKey()), th7, new java.lang.Object[0]);
                }
            }
            y45.b.b(activityC19822xa98ed509);
        } catch (java.lang.Throwable unused) {
        }
        d55.j b17 = d55.j.b(uVar.f120299d.getApplication());
        b17.d();
        b17.e();
        this.f120292d.countDown();
    }
}
