package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public final class u0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getPageStatus";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        if (bVar == null) {
            return;
        }
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("getPageStatus", "data is null");
            bVar.c("null_data", null);
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("pageShow", ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a).G1);
        bVar.e(jSONObject2);
        if (jSONObject.optBoolean("needReport")) {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("clientReportDict");
            if (optJSONObject == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("getPageStatus", "clientReportDict is null");
                return;
            }
            int optInt = optJSONObject.optInt("logId", 27792);
            com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(optInt), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.t0.class);
            if (!(c10750x9556b48c == null ? true : c10750x9556b48c.f149933d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("getPageStatus", "gamelog.jsapi, getPageStatus , logId = " + optInt + "  not exist in globalConfig FrontEndReport");
                return;
            }
            java.lang.String optString = optJSONObject.optString("reportStr", "");
            java.lang.String optString2 = optJSONObject.optString("timePlaceHolderKey", "");
            boolean optBoolean = optJSONObject.optBoolean("isTimeMillSecond", false);
            if (!(optString == null || optString.length() == 0)) {
                if (!(optString2 == null || optString2.length() == 0)) {
                    sd.d dVar = bVar.f488129a;
                    long currentTimeMillis = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) dVar).G1 ? (((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) dVar).O1 + java.lang.System.currentTimeMillis()) - ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a).N1 : ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) dVar).O1;
                    if (!optBoolean) {
                        currentTimeMillis /= 1000;
                    }
                    e53.b bVar2 = e53.b.f331145a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                    if (optString2.length() == 0) {
                        return;
                    }
                    if (optString.length() == 0) {
                        return;
                    }
                    java.lang.String t17 = r26.i0.t(optString, optString2, java.lang.String.valueOf(currentTimeMillis), false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePageTimeReport", "gamelog.report, logId = " + optInt + ", reportNow, reportDuration:" + currentTimeMillis + ", reportContent = " + t17);
                    jx3.f.INSTANCE.f(optInt, t17, true, false);
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("getPageStatus", "gamelog.jsapi, getPageStatus , reportStr or timePlaceHolderKey is null");
        }
    }
}
