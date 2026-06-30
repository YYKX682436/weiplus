package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes7.dex */
public class u7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        dn.k kVar;
        if (jSONObject == null) {
            this.f224976f.a("fail:data is null");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiUploadToCommonCDN", "data is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiUploadToCommonCDN", "JsApiUploadToCommonCDN data=" + jSONObject);
        int optInt = jSONObject.optInt("appType");
        int optInt2 = jSONObject.optInt("fileType");
        int optInt3 = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.VodExKeys.f54574x75eee65f, 3);
        java.lang.String key = jSONObject.optString("fileKey");
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
        java.lang.String optString2 = jSONObject.optString("thumbFilePath");
        boolean optBoolean = jSONObject.optBoolean("isStorageMode");
        jSONObject.optInt("snsUploadVersion");
        java.lang.String optString3 = jSONObject.optString("action");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppJsApiUploadToCommonCDN", "filePath invalid");
            this.f224976f.a("fail:filePath invalid");
            return;
        }
        if (!android.text.TextUtils.isEmpty(optString)) {
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(optString)) {
                optString = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f224975e.f380557a, optString);
            } else {
                if (optString.startsWith("/")) {
                    optString = optString.substring(1);
                }
                optString = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(str).f14369x346425 + "/" + optString;
            }
            if (optString.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppJsApiUploadToCommonCDN", "get full file path fail: ".concat(optString));
                this.f224976f.a("fail:get full file path fail");
                return;
            }
        }
        if (!android.text.TextUtils.isEmpty(optString2)) {
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(optString2)) {
                optString2 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f224975e.f380557a, optString2);
            }
            if (optString2.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppJsApiUploadToCommonCDN", "get full thumb file path fail: " + optString);
                this.f224976f.a("fail:get full thumb file path fail");
                return;
            }
        }
        if (android.text.TextUtils.isEmpty(key)) {
            key = kk.k.g(optString.getBytes());
        }
        if (optString3.equals("cancel")) {
            if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37742xaa0a0de3(key, new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadResult()) == 0) {
                this.f224976f.a("fail:cancel succeed");
                java.util.HashMap hashMap = ra3.a.f475019a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
                java.util.HashMap hashMap2 = ra3.a.f475019a;
                dn.m mVar = (dn.m) hashMap2.get(key);
                if (mVar != null && (kVar = mVar.f323320f) != null) {
                    dn.g gVar = new dn.g();
                    gVar.f69496x83ec3dd = mVar.B1;
                    dn.h hVar = new dn.h();
                    hVar.f69553xb5f54fe9 = -10008;
                    kVar.r4(key, 0, gVar, hVar, false);
                }
                hashMap2.remove(key);
                return;
            }
            return;
        }
        dn.m mVar2 = new dn.m();
        mVar2.f323318d = "task_JsApiUploadToCommonCDN";
        mVar2.f69592xf1ebe47b = optInt2;
        mVar2.f69584x89a4c0cf = 2;
        mVar2.f323322h = optInt3;
        mVar2.f69580x454032b6 = optInt;
        mVar2.f69601xaca5bdda = key;
        mVar2.f69595x6d25b0d9 = optString;
        mVar2.f69619xe9ed65f6 = optString2;
        mVar2.f69606xccdbf540 = optBoolean;
        mVar2.f323320f = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.t7(this);
        if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar2)) {
            this.f224976f.a("fail:cdn com call error");
            return;
        }
        java.util.HashMap hashMap3 = ra3.a.f475019a;
        java.util.HashMap hashMap4 = ra3.a.f475019a;
        java.lang.String field_mediaId = mVar2.f69601xaca5bdda;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
        hashMap4.put(field_mediaId, mVar2);
    }
}
