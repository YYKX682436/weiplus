package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public final class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.l {

    /* renamed from: CTRL_INDEX */
    public static final int f34519x366c91de = 967;

    /* renamed from: NAME */
    public static final java.lang.String f34520x24728b = "launchDevMiniProgram";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.l
    public boolean C(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y service, org.json.JSONObject data, int i17) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0 c10757xa20383b0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("appId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.a(data.optString("envVersion"), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.RELEASE);
        java.lang.String optString2 = data.optString("downloadURL");
        java.lang.String optString3 = data.optString("checkSumMd5");
        java.lang.String optString4 = data.optString("extoptions");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.DEVELOP == a17) {
            if (!(optString3 == null || optString3.length() == 0)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.C12175x179bf414 c12175x179bf414 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.C12175x179bf414();
                c12175x179bf414.f163714d = optString;
                c12175x179bf414.f163715e = optString2;
                c12175x179bf414.f163716f = optString3;
                c12175x179bf414.f163717g = optString4;
                try {
                    c10757xa20383b0 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, c12175x179bf414, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.q.class);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiLaunchDevMiniProgram", "invoke IPCFlushDevPkg, parcel:" + c12175x179bf414 + ", exception:" + e17);
                    c10757xa20383b0 = null;
                }
                if (!(c10757xa20383b0 != null)) {
                    service.a(i17, "fail save packageInfo failed");
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return false;
    }
}
