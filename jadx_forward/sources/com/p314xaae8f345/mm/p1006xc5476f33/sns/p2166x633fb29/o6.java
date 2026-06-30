package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public final class o6 implements n55.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z f246083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f246084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f246085c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f246086d;

    public o6(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z zVar, int i17, int i18, boolean z17) {
        this.f246083a = zVar;
        this.f246084b = i17;
        this.f246085c = i18;
        this.f246086d = z17;
    }

    @Override // n55.e
    public void a(o55.a aVar) {
        byte[] bArr;
        ec4.j b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler$checkFakeVideoIsError$getBackgroundVideoCallback$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z zVar = this.f246083a;
        if (aVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("info workType >> ");
            sb6.append(aVar.f424695a);
            sb6.append(", confirmRemuxTime: ");
            long j17 = aVar.f424697c;
            sb6.append(j17);
            sb6.append(", muxCode: ");
            int i17 = aVar.f424700f;
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", sb6.toString());
            boolean z17 = j17 > 0 && java.lang.System.currentTimeMillis() - j17 > 180000;
            boolean z18 = j17 > 0 && java.lang.System.currentTimeMillis() - j17 > 600000;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", "time check: " + z17 + ", timeOut: " + z18);
            int i18 = this.f246084b;
            if (i17 == 0 && z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", "checkFakeVideoIsError >> remux success");
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.C17893x66003bc) zVar).a(false);
                ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).Ai(aVar.f424696b, aVar.f424697c, aVar.f424701g, aVar.f424700f);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$checkToCommit", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkToCommit", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", "checkToCommit");
                java.lang.String str = aVar.f424698d;
                if (com.p314xaae8f345.mm.vfs.w6.j(str) && (bArr = aVar.f424703i) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", "go to commit");
                    ec4.j d17 = new ec4.j().d(i18, bArr);
                    if (d17 != null && (b17 = d17.b(str, aVar.f424699e)) != null) {
                        b17.c();
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkToCommit", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$checkToCommit", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler$checkFakeVideoIsError$getBackgroundVideoCallback$1");
                return;
            }
            if (i17 == 1002 && z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", "checkFakeVideoIsError >> remux error");
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.C17893x66003bc) zVar).a(true);
                ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).Ai(aVar.f424696b, aVar.f424697c, aVar.f424701g, aVar.f424700f);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler$checkFakeVideoIsError$getBackgroundVideoCallback$1");
                return;
            }
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", "checkFakeVideoIsError >> isTimeOut");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateWorkTimeOut", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
                int i19 = this.f246085c;
                if (this.f246086d) {
                    yy0.g8 g8Var = (yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class));
                    g8Var.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g8Var.f549645d, "updateWorkTimeOut >> snsLocalId: " + i18 + ", createTime: " + i19);
                    p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new yy0.c8(i18, i19, g8Var, null), 2, null);
                } else {
                    wp4.x xVar = (wp4.x) ((n55.f) i95.n0.c(n55.f.class));
                    xVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f529986d, "updateWorkTimeOut >> snsLocalId: " + i18 + ", createTime: " + i19);
                    p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new wp4.t(i18, i19, xVar, null), 2, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateWorkTimeOut", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.C17893x66003bc) zVar).a(z18);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", "checkFakeVideoIsError >> is null");
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.C17893x66003bc) zVar).a(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler$checkFakeVideoIsError$getBackgroundVideoCallback$1");
    }
}
