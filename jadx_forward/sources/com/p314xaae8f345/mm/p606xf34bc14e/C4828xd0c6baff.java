package com.p314xaae8f345.mm.p606xf34bc14e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/accessibility/ReportDisplayManager;", "", "Lcom/tencent/mm/accessibility/feature/DisplayReportInfo;", "recordInfo", "Ljz5/f0;", "pushPutMMKVData", "onAppForeground", "", "hasData", "clearData", "", "getNeedReportInfo", "", "DISPLAY_EVENT_ADDED", "I", "DISPLAY_EVENT_REMOVED", "Lcom/tencent/mm/sdk/platformtools/o4;", "kotlin.jvm.PlatformType", "mmkv", "Lcom/tencent/mm/sdk/platformtools/o4;", "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.ReportDisplayManager */
/* loaded from: classes11.dex */
public final class C4828xd0c6baff {
    private static final int DISPLAY_EVENT_ADDED = 1;
    private static final int DISPLAY_EVENT_REMOVED = 2;

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.C4828xd0c6baff f20835x4fbc8495 = new com.p314xaae8f345.mm.p606xf34bc14e.C4828xd0c6baff();
    private static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 mmkv = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.ReportDisplayManager");

    private C4828xd0c6baff() {
    }

    /* renamed from: clearData */
    public final void m42184xb4382b97() {
        if (m42186x29831964()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDisplayManager", "hasData! clearAll");
            mmkv.d();
        }
    }

    /* renamed from: getNeedReportInfo */
    public final java.util.List<com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4950xf4261e44> m42185x31ed622e() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = mmkv;
        java.lang.String[] b17 = o4Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "allKeys(...)");
        if (b17.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDisplayManager", "[getNeedReportInfo] empty");
            return new java.util.ArrayList();
        }
        java.lang.String[] b18 = o4Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "allKeys(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : b18) {
            java.lang.String string = mmkv.getString(str, "");
            if (string != null) {
                arrayList.add(string);
            }
        }
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d((java.lang.String) obj);
            if (!r26.n0.N(r6)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        for (java.lang.String str2 : arrayList2) {
            com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4950xf4261e44 c4950xf4261e44 = new com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4950xf4261e44();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            c4950xf4261e44.m126728xdc93280d(str2);
            arrayList3.add(c4950xf4261e44);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList3) {
            java.lang.String m42769x40021d37 = ((com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4950xf4261e44) obj2).m42769x40021d37();
            if (!(m42769x40021d37 == null || r26.n0.N(m42769x40021d37))) {
                arrayList4.add(obj2);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDisplayManager", "[getNeedReportInfo] success: ".concat(kz5.n0.g0(arrayList4, null, null, null, 0, null, com.p314xaae8f345.mm.p606xf34bc14e.C4829x5f61fe16.f20837x4fbc8495, 31, null)));
        return arrayList4;
    }

    /* renamed from: hasData */
    public final boolean m42186x29831964() {
        return mmkv.g() > 0;
    }

    /* renamed from: onAppForeground */
    public final void m42187x1952ea5() {
        if (m42186x29831964()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDisplayManager", "hasData! onAppForeground");
            for (com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4950xf4261e44 c4950xf4261e44 : m42185x31ed622e()) {
                java.lang.String valueOf = java.lang.String.valueOf(c4950xf4261e44.m42768xe2f6ac7());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDisplayManager", "realReport[" + c4950xf4261e44.m126747x696739c() + ']');
                if (c4950xf4261e44.m42771x51e8b0a() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDisplayManager", "realReport[skip]");
                    if (java.lang.System.currentTimeMillis() >= c4950xf4261e44.m42772x6bb2831f()) {
                        long j17 = 60;
                        if (java.lang.System.currentTimeMillis() - c4950xf4261e44.m42772x6bb2831f() > 1 * 24 * j17 * 1000 * j17) {
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDisplayManager", "realReport[wrong timeMs], remove key");
                    mmkv.remove(valueOf);
                } else {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("screen_record_rpt", kz5.c1.k(new jz5.l("displayId", java.lang.Integer.valueOf(c4950xf4261e44.m42768xe2f6ac7())), new jz5.l("displayName", c4950xf4261e44.m42769x40021d37()), new jz5.l("displayOwnerPackage", c4950xf4261e44.m42770xf64f30bf()), new jz5.l("displayEventType", java.lang.Integer.valueOf(c4950xf4261e44.m42767x967c1c8())), new jz5.l("startTimeMs", java.lang.Long.valueOf(c4950xf4261e44.m42772x6bb2831f())), new jz5.l("duration", java.lang.Long.valueOf(c4950xf4261e44.m42771x51e8b0a()))), 33811);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDisplayManager", "realReport[" + valueOf + ']');
                    mmkv.remove(valueOf);
                }
            }
        }
    }

    /* renamed from: pushPutMMKVData */
    public final void m42188xd83fa9ea(com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4950xf4261e44 recordInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordInfo, "recordInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDisplayManager", "[pushPutMMKVData]");
        java.lang.String valueOf = java.lang.String.valueOf(recordInfo.m42768xe2f6ac7());
        boolean z17 = true;
        if (recordInfo.m42767x967c1c8() == 1) {
            java.lang.String m42769x40021d37 = recordInfo.m42769x40021d37();
            if (m42769x40021d37 != null && !r26.n0.N(m42769x40021d37)) {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDisplayManager", "[pushPutMMKVData] add skip");
                return;
            }
            recordInfo.m42778x217f693(java.lang.System.currentTimeMillis());
            mmkv.putString(valueOf, recordInfo.m126747x696739c());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDisplayManager", "[pushPutMMKVData] add success: " + recordInfo.m126747x696739c());
            return;
        }
        if (recordInfo.m42767x967c1c8() == 2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = mmkv;
            if (!o4Var.f(valueOf)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDisplayManager", "[pushPutMMKVData] remove skip");
                return;
            }
            com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4950xf4261e44 c4950xf4261e44 = new com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4950xf4261e44();
            java.lang.String string = o4Var.getString(valueOf, "");
            c4950xf4261e44.m126728xdc93280d(string != null ? string : "");
            c4950xf4261e44.m42777xffd6ec16(java.lang.System.currentTimeMillis() - c4950xf4261e44.m42772x6bb2831f());
            o4Var.putString(valueOf, c4950xf4261e44.m126747x696739c());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportDisplayManager", "[pushPutMMKVData] remove success: " + recordInfo.m126747x696739c());
        }
    }
}
