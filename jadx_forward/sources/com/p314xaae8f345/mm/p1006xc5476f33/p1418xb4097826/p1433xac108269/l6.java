package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class l6 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f183891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183892e;

    public l6(ya2.b2 b2Var, int i17) {
        this.f183891d = b2Var;
        this.f183892e = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share namecard ");
            ya2.b2 b2Var = this.f183891d;
            sb6.append(b2Var.w0());
            sb6.append('(');
            sb6.append(b2Var.D0());
            sb6.append(") to ");
            sb6.append(stringArrayListExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", sb6.toString());
            if (!stringArrayListExtra.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                java.lang.String D0 = b2Var.D0();
                java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(stringArrayListExtra, ",");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "listToString(...)");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = b2Var.f69300x731cac1b;
                int m76027x1cbb0791 = c19780xceb4c4dc != null ? c19780xceb4c4dc.m76027x1cbb0791() : 0;
                o3Var.getClass();
                java.lang.String str = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ',' + D0 + ',' + c17 + ",0," + m76027x1cbb0791 + ',' + this.f183892e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderReportLogic", "18949 " + str);
                jx3.f.INSTANCE.mo68478xbd3cda5f(18949, str);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).Ai().h(stringArrayListExtra);
        }
    }
}
