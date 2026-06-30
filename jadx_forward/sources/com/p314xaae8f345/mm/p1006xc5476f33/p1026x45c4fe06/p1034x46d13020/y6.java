package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes14.dex */
public final class y6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b7 f158193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158194e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b7 b7Var, java.lang.String str) {
        super(0);
        this.f158193d = b7Var;
        this.f158194e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.tencent.mm.plugin.appbrand.appusage.j6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.tencent.mm.plugin.appbrand.appusage.j6[]] */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ?? r112;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j6 j6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b7 b7Var = this.f158193d;
        java.lang.String msgContent = this.f158194e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msgContent, "$msgContent");
        b7Var.getClass();
        if (gm0.j1.a()) {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(msgContent, "sysmsg", null);
            if (!(d17 == null || d17.isEmpty())) {
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".sysmsg.UpdateWxaUsageListNotify.Type"), 0);
                ?? sb6 = new java.lang.StringBuilder("type:");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j6.f158022e.getClass();
                ?? m49781xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j6.m49781xcee59d22();
                int length = m49781xcee59d22.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        r112 = 0;
                        break;
                    }
                    r112 = m49781xcee59d22[i17];
                    if (r112.f158024d == P) {
                        break;
                    }
                    i17++;
                }
                if (r112 == 0) {
                    r112 = "NULL";
                }
                sb6.append(r112);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaStarAndHistoryPushingReceiver", sb6.toString());
                if ((b7Var.f157926e || b7Var.f157928g.get()) && (P == 1 || P == 2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaStarAndHistoryPushingReceiver", "app is in background status or force pending fetching,pending execute history and star fetching");
                    b7Var.f157927f = true;
                    if (b7Var.f157928g.get()) {
                        pm0.v.V(1500L, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z6(b7Var));
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j6[] m49781xcee59d222 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j6.m49781xcee59d22();
                    int length2 = m49781xcee59d222.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= length2) {
                            j6Var = null;
                            break;
                        }
                        j6Var = m49781xcee59d222[i18];
                        if (j6Var.f158024d == P) {
                            break;
                        }
                        i18++;
                    }
                    int i19 = j6Var == null ? -1 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.x6.f158184a[j6Var.ordinal()];
                    if (i19 == 1) {
                        b7Var.b();
                    } else if (i19 == 2) {
                        b7Var.b();
                    } else if (i19 == 3) {
                        java.util.Iterator it = ((java.util.ArrayList) b7Var.c(d17, ".sysmsg.UpdateWxaUsageListNotify")).iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w6 w6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w6) it.next();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o6.a(w6Var.f158156a, w6Var.f158157b, w6Var.f158158c, null);
                        }
                    } else if (i19 == 4) {
                        java.util.Iterator it6 = ((java.util.ArrayList) b7Var.c(d17, ".sysmsg.UpdateWxaUsageListNotify")).iterator();
                        while (it6.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w6 w6Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w6) it6.next();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o6.a(w6Var2.f158156a, w6Var2.f158157b, w6Var2.f158158c, null);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.cj().D0(w6Var2.f158156a, w6Var2.f158158c, false);
                        }
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaStarAndHistoryPushingReceiver", "parseThenProcess, account not ready");
        }
        return jz5.f0.f384359a;
    }
}
