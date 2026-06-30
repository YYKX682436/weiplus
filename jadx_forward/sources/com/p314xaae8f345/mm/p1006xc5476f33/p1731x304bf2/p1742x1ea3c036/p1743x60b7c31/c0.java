package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public final class c0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getAppDownloadStatus";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        if (q5Var == null || context == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        org.json.JSONArray jSONArray3 = new org.json.JSONArray();
        org.json.JSONArray jSONArray4 = new org.json.JSONArray();
        java.util.LinkedList Ai = ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ai();
        if (Ai != null) {
            java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.api.C13236xb15ab0ff> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : Ai) {
                java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.api.C13236xb15ab0ff) obj).f178760d;
                if (!(str2 == null || str2.length() == 0)) {
                    arrayList.add(obj);
                }
            }
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.api.C13236xb15ab0ff c13236xb15ab0ff : arrayList) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c13236xb15ab0ff);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("appId", c13236xb15ab0ff.f178760d);
                java.lang.String str3 = c13236xb15ab0ff.f178762f;
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case -1211129254:
                            if (str3.equals("downloading")) {
                                jSONArray4.put(jSONObject2);
                                break;
                            } else {
                                break;
                            }
                        case 31448181:
                            if (str3.equals("download_fail")) {
                                jSONArray3.put(jSONObject2);
                                break;
                            } else {
                                break;
                            }
                        case 31854489:
                            if (str3.equals("download_succ")) {
                                jSONArray2.put(jSONObject2);
                                break;
                            } else {
                                break;
                            }
                        case 984140671:
                            if (str3.equals("download_pause")) {
                                jSONArray.put(jSONObject2);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        }
        jSONObject.put("DownloadedTaskList", jSONArray2);
        jSONObject.put("PausedTaskList", jSONArray);
        jSONObject.put("RunningTaskList", jSONArray4);
        jSONObject.put("FailedTaskList", jSONArray3);
        q5Var.a(null, jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
