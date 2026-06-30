package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class w3 implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final zy2.fa f187491d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f187492e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.C13733x191b1e95 f187493f;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotExpiredHandler$mainUiIndexChangeListener$1] */
    public w3(zy2.fa redDotManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotManager, "redDotManager");
        this.f187491d = redDotManager;
        this.f187492e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("FinderRedDotExpired");
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f187493f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8>(a0Var) { // from class: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotExpiredHandler$mainUiIndexChangeListener$1
            {
                this.f39173x3fe91575 = -1095690568;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8 c5643xca5254a8) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5643xca5254a8 event = c5643xca5254a8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                int i17 = event.f135971g.f88958a;
                if (i17 != 2) {
                    if (i17 != 3) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3.this, "otherTab", null, 0L, 6, null);
                        return false;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3.this, "mineTab", null, 0L, 6, null);
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3 w3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3.this;
                w3Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotExpiredHandler", "[checkDoSync] source=findMoreFriend delayed=0");
                w3Var.f187492e.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.q3(w3Var), 0L);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3.this, "findMoreFriend", null, 0L, 6, null);
                return false;
            }
        };
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3 w3Var, java.lang.String str, java.lang.String str2, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        if ((i17 & 4) != 0) {
            j17 = 0;
        }
        w3Var.f187492e.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.s3(str, j17, str3, w3Var));
    }

    public final java.lang.String b(r45.qw0 qw0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qw0Var, "<this>");
        return "check_expire_interval_sec=" + qw0Var.m75939xb282bd08(1) + ", check_expire_max_count=" + qw0Var.m75939xb282bd08(2) + ", check_expire_valid=" + qw0Var.m75939xb282bd08(0);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        a(this, "onAppBackground", "Discovery", 0L, 4, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2) this.f187491d).Y0(false, "onAppBackground");
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
    }
}
