package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f168430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f168431f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 f168432g;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var, java.lang.String str, int i17, long j17) {
        this.f168432g = i3Var;
        this.f168429d = str;
        this.f168430e = i17;
        this.f168431f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g4 g4Var;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var;
        synchronized (this.f168432g.f168242o) {
            this.f168432g.q();
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = this.f168432g.m52169xfdaa7672();
            if (m52169xfdaa7672 != null && this.f168432g.r(m52169xfdaa7672) != null) {
                int i17 = this.f168430e;
                java.util.Iterator h07 = this.f168432g.h0(false);
                do {
                    g4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g4) h07;
                    w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2) g4Var.next();
                    if (i17 <= 0) {
                        break;
                    } else {
                        i17--;
                    }
                } while (g4Var.hasNext());
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a5 E = this.f168432g.E(m52169xfdaa7672, w2Var);
                this.f168432g.i(m52169xfdaa7672, w2Var);
                final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var = this.f168432g;
                final long j17 = this.f168431f;
                final java.lang.String str = this.f168429d;
                i3Var.getClass();
                final li1.a aVar = m52169xfdaa7672.B() && w2Var.B() && m52169xfdaa7672.mo52213x2838138e() == w2Var.mo52213x2838138e() ? new li1.a() : null;
                final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = w2Var.mo14682x9dee9c37();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                w2Var.m52232xf9241792(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t4 n07 = i3Var.n0(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        long j18 = j17;
                        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3.this;
                        i3Var2.getClass();
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("MicroMsg.AppBrandPageContainer", "navigateBack, switchToImage cost[%dms]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                        mo14682x9dee9c37.b1();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2 = w2Var;
                        w2Var2.m52232xf9241792(false);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.jb jbVar = i3Var2.f168249v;
                        if (jbVar != null) {
                            int mo52213x2838138e = w2Var2.mo52213x2838138e();
                            int m52225xaa0531b5 = w2Var2.m52225xaa0531b5();
                            boolean equals = str.equals("scene_skyline_back");
                            boolean z19 = m52169xfdaa7672.mo52213x2838138e() == w2Var2.mo52213x2838138e();
                            final java.lang.Runnable[] runnableArr = r10;
                            ((com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe) jbVar).g(j18, mo52213x2838138e, m52225xaa0531b5, equals, z19, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3.this;
                                    i3Var3.getClass();
                                    i3Var3.c0(runnableArr[0]);
                                }
                            });
                        }
                    }
                });
                final java.lang.Runnable[] runnableArr = {i3Var.n0(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        li1.a aVar2 = li1.a.this;
                        if (aVar2 != null) {
                            aVar2.a();
                        }
                    }
                })};
                mo14682x9dee9c37.X0(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture, n07, 500L);
                this.f168432g.j0(this.f168431f, w2Var, m52169xfdaa7672, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.NAVIGATE_BACK, E, aVar);
                return;
            }
            if (u46.l.c("scene_jsapi_navigate_back", this.f168429d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPageContainer", "navigateBackImpl appId:%s, %s", this.f168432g.m52168x74292566(), jc1.h.f380476a);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.g(this.f168432g.f168236f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.BACK);
                this.f168432g.f168235e.S();
            }
        }
    }
}
