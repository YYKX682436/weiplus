package cy4;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final cy4.b f306392a = new cy4.b();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f306393b = jz5.h.b(cy4.a.f306391d);

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 f306394c;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.MPVideoPreviewDataMgr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        f306394c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.v3(M, 600L);
    }

    public final boolean a() {
        return ((java.lang.Boolean) ((jz5.n) f306393b).mo141623x754a37bb()).booleanValue();
    }

    public final java.util.Map b(java.lang.String str) {
        java.util.HashMap hashMap = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPVideoPreviewDataMgr", "getVideo vid null");
            return null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = f306394c;
        int o17 = v3Var.o("MicroMsg.MPVideoPreviewDataMgr_" + str + "_playTime", 0);
        int o18 = v3Var.o("MicroMsg.MPVideoPreviewDataMgr_" + str + "_expire", 0);
        boolean z17 = java.lang.System.currentTimeMillis() / ((long) 1000) > ((long) o18);
        if (o17 != 0 && o18 != 0 && !z17) {
            hashMap = new java.util.HashMap();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(java.lang.Integer.valueOf(o17), "null cannot be cast to non-null type java.lang.Object");
            hashMap.put("videoInitialTime", java.lang.Integer.valueOf(o17));
            java.lang.String s17 = v3Var.s("MicroMsg.MPVideoPreviewDataMgr_" + str + "_bitmap", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(s17, "null cannot be cast to non-null type java.lang.Object");
            hashMap.put("videoInitialSnapshot", s17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getVideo vid = ");
        sb6.append(str);
        sb6.append(", map size = ");
        sb6.append(hashMap != null ? hashMap.size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPVideoPreviewDataMgr", sb6.toString());
        return hashMap;
    }

    public final void c(java.lang.String str) {
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("video_data");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPVideoPreviewDataMgr", "reportByLeaveForMPGateway video_data null");
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(optString);
            java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54503x6397ab9d);
            int L = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("lastPlayedTime"), 0.0f);
            int L2 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("lastPlayedTimeExpiredTime"), 0.0f);
            if (a()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = f306394c;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) v3Var.i();
                o4Var.A("MicroMsg.MPVideoPreviewDataMgr_" + optString2 + "_playTime", L);
                o4Var.A("MicroMsg.MPVideoPreviewDataMgr_" + optString2 + "_expire", L2);
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) v3Var.i()).D("MicroMsg.MPVideoPreviewDataMgr_" + optString2 + "_bitmap", "");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPVideoPreviewDataMgr", "reportByLeaveForMPGateway, ex = %s", e17.getMessage());
        }
    }

    public final void d(java.lang.String str) {
        if (a()) {
            java.util.Map b17 = b(str);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = f306394c;
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPVideoPreviewDataMgr", "prepareOnReceivePageData vid not found");
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) v3Var.i()).D("MicroMsg.MPVideoPreviewDataMgr_prepareOnReceivePageData_vid", "");
                return;
            }
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) v3Var.i()).D("MicroMsg.MPVideoPreviewDataMgr_prepareOnReceivePageData_vid", str);
            java.lang.Object obj = b17.get("videoInitialSnapshot");
            if (obj instanceof java.lang.String) {
            }
        }
    }
}
