package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/w;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class w extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String str2;
        boolean z18;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("src", "") : null;
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(optString)) {
            str2 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f224975e.f380557a, optString);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getFilePathByBothLocalId(...)");
        } else {
            str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().y(str, null).f14369x346425 + "/pkg" + optString;
        }
        if (lj.f.f(str2) || !com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiCheckVideoIsHDR", "invalid path", null);
            this.f224975e.b("invalid path");
            return;
        }
        gp.c cVar = new gp.c();
        cVar.k(str2);
        int d17 = cVar.d();
        int i18 = 0;
        while (true) {
            if (i18 >= d17) {
                z18 = false;
                break;
            }
            android.media.MediaFormat e17 = cVar.e(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getTrackFormat(...)");
            java.lang.String string = e17.getString("mime");
            if (string != null && r26.i0.y(string, "video/", false)) {
                z18 = true;
                if (e17.containsKey("color-transfer")) {
                    int integer = e17.getInteger("color-transfer");
                    if (integer == 6) {
                        break;
                    } else if (integer == 7) {
                        break;
                    }
                }
                if (e17.containsKey("color-standard") && e17.getInteger("color-standard") == 6) {
                    break;
                }
            }
            i18++;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("isHDR", z18);
        this.f224975e.f(jSONObject2, false);
    }
}
