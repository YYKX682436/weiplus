package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public final class s5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "updateClientReport";
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
        long j17;
        if (bVar == null) {
            return;
        }
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("updateClientReport", "data is null");
            bVar.c("null_data", null);
            return;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("clientReportDict");
        if (optJSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("updateClientReport", "clientReportDict is null");
            bVar.c("clientReportDict is null", null);
            return;
        }
        java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
            if (optJSONObject2 != null) {
                int optInt = optJSONObject2.optInt("logId", 27792);
                com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(optInt), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.r5.class);
                boolean z17 = true;
                if (c10750x9556b48c == null ? true : c10750x9556b48c.f149933d) {
                    boolean optBoolean = optJSONObject2.optBoolean("reportOnExit", false);
                    java.lang.String optString = optJSONObject2.optString("reportStr", "");
                    java.lang.String optString2 = optJSONObject2.optString("timePlaceHolderKey", "");
                    long optLong = optJSONObject2.optLong("reportDuration", 0L);
                    boolean optBoolean2 = optJSONObject2.optBoolean("isTimeMillSecond", false);
                    boolean optBoolean3 = optJSONObject2.optBoolean("markTimeStart", false);
                    boolean optBoolean4 = optJSONObject2.optBoolean("isReportNow", false);
                    boolean optBoolean5 = optJSONObject2.optBoolean("recordOpenOtherPage", false);
                    if (optString == null || optString.length() == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("updateClientReport", "gamelog.jsapi, updateClientReport , reportStr is null");
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                        if (optBoolean3) {
                            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            j17 = android.os.SystemClock.elapsedRealtime();
                        } else {
                            j17 = 0;
                        }
                        org.json.JSONObject jSONObject2 = optJSONObject;
                        java.util.Iterator<java.lang.String> it = keys;
                        e53.c cVar = new e53.c(next, optInt, optBoolean, optString, optString2, optBoolean3, optBoolean4, optLong, optBoolean2, j17, optBoolean5);
                        java.lang.String str = cVar.f331151d;
                        int i17 = cVar.f331149b;
                        if (optBoolean) {
                            e53.b bVar2 = e53.b.f331145a;
                            int hashCode = bVar.f488129a.hashCode();
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap = e53.b.f331146b;
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Integer.valueOf(hashCode));
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap();
                            }
                            concurrentHashMap2.put(cVar.f331148a, cVar);
                            concurrentHashMap.put(java.lang.Integer.valueOf(hashCode), concurrentHashMap2);
                            e53.b.f331147c.m43071x58998cd();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePageTimeReport", "gamelog.report, logId = " + i17 + ", recordReportData, reportContent = " + str);
                        } else {
                            e53.b bVar3 = e53.b.f331145a;
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = (java.util.concurrent.ConcurrentHashMap) e53.b.f331146b.get(java.lang.Integer.valueOf(bVar.f488129a.hashCode()));
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new java.util.concurrent.ConcurrentHashMap();
                            }
                            if (concurrentHashMap3.containsKey(next)) {
                                concurrentHashMap3.remove(next);
                                java.lang.String str2 = cVar.f331152e;
                                if (str2 != null && str2.length() != 0) {
                                    z17 = false;
                                }
                                if (!z17) {
                                    str = r26.i0.v(cVar.f331151d, cVar.f331152e, java.lang.String.valueOf(cVar.f331155h), false, 4, null);
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePageTimeReport", "gamelog.report, logId = " + i17 + ", reportNow, reportDuration:" + cVar.f331155h + ", reportContent = " + str);
                                jx3.f.INSTANCE.f(i17, str, cVar.f331154g, false);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePageTimeReport", "gamelog.report, logId = " + i17 + ", reportNow fail: recordData is null");
                            }
                        }
                        optJSONObject = jSONObject2;
                        keys = it;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("updateClientReport", "gamelog.jsapi, updateClientReport , logId = " + optInt + "  not exist in globalConfig FrontEndReport");
                }
            }
        }
        bVar.a();
    }
}
