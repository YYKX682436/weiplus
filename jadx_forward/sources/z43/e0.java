package z43;

/* loaded from: classes.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f551647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z43.f0 f551648e;

    public e0(z43.f0 f0Var, org.json.JSONObject jSONObject) {
        this.f551648e = f0Var;
        this.f551647d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        org.json.JSONObject jSONObject = this.f551647d;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("appIdArray");
        long j17 = 0;
        z43.f0 f0Var = this.f551648e;
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            long optLong = jSONObject.optLong("download_id", -1L);
            java.lang.String optString = jSONObject.optString("appid");
            if (optLong > 0) {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().p(optLong);
                if (p17 == null) {
                    p17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37();
                }
                p17.f178499i = optString;
                z43.f0.A(f0Var, p17);
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                f0Var.f224976f.a("fail");
                return;
            }
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().q(optString);
            if (q17 == null) {
                q17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37();
            }
            q17.f178499i = optString;
            z43.f0.A(f0Var, q17);
            return;
        }
        f0Var.getClass();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
            linkedList.add(optJSONArray.optString(i17));
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        java.util.LinkedList e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().e(linkedList);
        java.lang.String str2 = "LiteAppJsApiQueryDownloadTask";
        if (e17.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiQueryDownloadTask", "taskInfos is null");
            f0Var.B(jSONObject2, linkedList);
            f0Var.f224976f.c(jSONObject2, false);
            return;
        }
        java.util.Iterator it = e17.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 c13222x107de37 = (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37) it.next();
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            int i18 = c13222x107de37.f178496f;
            if (i18 == -1) {
                str = "api_not_support";
            } else if (i18 == 1) {
                str = "downloading";
            } else if (i18 == 2) {
                str = "download_pause";
            } else if (i18 != 3) {
                if (i18 == 4) {
                    str = "download_fail";
                }
                str = "default";
            } else {
                if (com.p314xaae8f345.mm.vfs.w6.j(c13222x107de37.f178497g)) {
                    str = "download_succ";
                }
                str = "default";
            }
            java.lang.String str3 = str2;
            try {
                jSONObject3.put("download_id", c13222x107de37.f178494d);
                jSONObject3.put("state", str);
                if (c13222x107de37.f178505r) {
                    jSONObject3.put("reserve_for_wifi", 1);
                }
                long j18 = c13222x107de37.f178501n;
                if (j18 != j17) {
                    jSONObject3.put("progress", (100 * c13222x107de37.f178500m) / j18);
                    jSONObject3.put("progress_float", (((float) r13) * 100.0f) / ((float) j18));
                }
                jSONObject2.put(c13222x107de37.f178499i, jSONObject3);
                linkedList.remove(c13222x107de37.f178499i);
                str2 = str3;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, e18.getMessage());
                str2 = str3;
            }
            j17 = 0;
        }
        f0Var.B(jSONObject2, linkedList);
        new org.json.JSONObject();
        f0Var.f224976f.c(jSONObject2, false);
    }
}
