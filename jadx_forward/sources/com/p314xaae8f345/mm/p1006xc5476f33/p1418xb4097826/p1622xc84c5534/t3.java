package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class t3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t3 f206897a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t3();

    public final void a(java.lang.String requestId, java.lang.String str, int i17, java.util.HashMap exposeItemMap, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposeItemMap, "exposeItemMap");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String t17 = r26.i0.t(str, ",", " ", false);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        long j17 = 0;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.e0 e0Var : exposeItemMap.values()) {
            if (!e0Var.f207202e) {
                e0Var.f207202e = true;
                stringBuffer.append(e0Var.f207198a);
                stringBuffer.append("#");
                stringBuffer.append(e0Var.f207200c);
                stringBuffer.append("#");
                stringBuffer.append(e0Var.f207199b);
                stringBuffer.append("#");
                stringBuffer.append(e0Var.f207201d);
                stringBuffer.append(";");
                long j18 = e0Var.f207201d;
                if (j18 < j17) {
                    j17 = j18;
                }
            }
        }
        if (stringBuffer.length() == 0) {
            return;
        }
        java.lang.String str2 = requestId + ',' + t17 + ',' + i17 + ',' + ((java.lang.Object) stringBuffer) + ',' + i18 + ',' + (java.lang.System.currentTimeMillis() - j17) + ',' + (!exposeItemMap.isEmpty() ? 1 : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSearchReportLogic", "report18691 " + str2);
        jx3.f.INSTANCE.mo68478xbd3cda5f(18691, str2);
    }
}
