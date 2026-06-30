package z43;

/* loaded from: classes.dex */
public class f0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    public static void A(z43.f0 f0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 c13222x107de37) {
        java.lang.String str;
        f0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i17 = c13222x107de37.f178496f;
        if (i17 == -1) {
            str = "api_not_support";
        } else if (i17 == 1) {
            str = "downloading";
        } else if (i17 == 2) {
            str = "download_pause";
        } else if (i17 != 3) {
            if (i17 == 4) {
                str = "download_fail";
            }
            str = "default";
        } else {
            if (com.p314xaae8f345.mm.vfs.w6.j(c13222x107de37.f178497g)) {
                str = "download_succ";
            }
            str = "default";
        }
        try {
            jSONObject.put("download_id", c13222x107de37.f178494d);
            jSONObject.put("state", str);
            if (c13222x107de37.f178505r) {
                jSONObject.put("reserve_for_wifi", 1);
            }
            long j17 = c13222x107de37.f178501n;
            if (j17 != 0) {
                jSONObject.put("progress", (100 * c13222x107de37.f178500m) / j17);
                jSONObject.put("progress_float", (((float) r3) * 100.0f) / ((float) j17));
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(c13222x107de37.f178499i, jSONObject);
            f0Var.f224976f.c(jSONObject2, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiQueryDownloadTask", e17.getMessage());
        }
    }

    public final void B(org.json.JSONObject jSONObject, java.util.LinkedList linkedList) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("download_id", -1);
                jSONObject2.put("state", "default");
                jSONObject.put(str, jSONObject2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiQueryDownloadTask", e17.getMessage());
            }
        }
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        p95.a.a(new z43.e0(this, jSONObject));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
