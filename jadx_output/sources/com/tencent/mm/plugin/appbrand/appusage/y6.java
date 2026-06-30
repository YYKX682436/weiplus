package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes14.dex */
public final class y6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.b7 f76660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76661e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(com.tencent.mm.plugin.appbrand.appusage.b7 b7Var, java.lang.String str) {
        super(0);
        this.f76660d = b7Var;
        this.f76661e = str;
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
    public java.lang.Object invoke() {
        ?? r112;
        com.tencent.mm.plugin.appbrand.appusage.j6 j6Var;
        com.tencent.mm.plugin.appbrand.appusage.b7 b7Var = this.f76660d;
        java.lang.String msgContent = this.f76661e;
        kotlin.jvm.internal.o.f(msgContent, "$msgContent");
        b7Var.getClass();
        if (gm0.j1.a()) {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(msgContent, "sysmsg", null);
            if (!(d17 == null || d17.isEmpty())) {
                int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.UpdateWxaUsageListNotify.Type"), 0);
                ?? sb6 = new java.lang.StringBuilder("type:");
                com.tencent.mm.plugin.appbrand.appusage.j6.f76489e.getClass();
                ?? values = com.tencent.mm.plugin.appbrand.appusage.j6.values();
                int length = values.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        r112 = 0;
                        break;
                    }
                    r112 = values[i17];
                    if (r112.f76491d == P) {
                        break;
                    }
                    i17++;
                }
                if (r112 == 0) {
                    r112 = "NULL";
                }
                sb6.append(r112);
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaStarAndHistoryPushingReceiver", sb6.toString());
                if ((b7Var.f76393e || b7Var.f76395g.get()) && (P == 1 || P == 2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaStarAndHistoryPushingReceiver", "app is in background status or force pending fetching,pending execute history and star fetching");
                    b7Var.f76394f = true;
                    if (b7Var.f76395g.get()) {
                        pm0.v.V(1500L, new com.tencent.mm.plugin.appbrand.appusage.z6(b7Var));
                    }
                } else {
                    com.tencent.mm.plugin.appbrand.appusage.j6[] values2 = com.tencent.mm.plugin.appbrand.appusage.j6.values();
                    int length2 = values2.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= length2) {
                            j6Var = null;
                            break;
                        }
                        j6Var = values2[i18];
                        if (j6Var.f76491d == P) {
                            break;
                        }
                        i18++;
                    }
                    int i19 = j6Var == null ? -1 : com.tencent.mm.plugin.appbrand.appusage.x6.f76651a[j6Var.ordinal()];
                    if (i19 == 1) {
                        b7Var.b();
                    } else if (i19 == 2) {
                        b7Var.b();
                    } else if (i19 == 3) {
                        java.util.Iterator it = ((java.util.ArrayList) b7Var.c(d17, ".sysmsg.UpdateWxaUsageListNotify")).iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.plugin.appbrand.appusage.w6 w6Var = (com.tencent.mm.plugin.appbrand.appusage.w6) it.next();
                            com.tencent.mm.plugin.appbrand.appusage.o6.a(w6Var.f76623a, w6Var.f76624b, w6Var.f76625c, null);
                        }
                    } else if (i19 == 4) {
                        java.util.Iterator it6 = ((java.util.ArrayList) b7Var.c(d17, ".sysmsg.UpdateWxaUsageListNotify")).iterator();
                        while (it6.hasNext()) {
                            com.tencent.mm.plugin.appbrand.appusage.w6 w6Var2 = (com.tencent.mm.plugin.appbrand.appusage.w6) it6.next();
                            com.tencent.mm.plugin.appbrand.appusage.o6.a(w6Var2.f76623a, w6Var2.f76624b, w6Var2.f76625c, null);
                            com.tencent.mm.plugin.appbrand.app.r9.cj().D0(w6Var2.f76623a, w6Var2.f76625c, false);
                        }
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaStarAndHistoryPushingReceiver", "parseThenProcess, account not ready");
        }
        return jz5.f0.f302826a;
    }
}
