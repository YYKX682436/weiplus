package qf1;

/* loaded from: classes13.dex */
public class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f76473x366c91de = 316;

    /* renamed from: NAME */
    public static final java.lang.String f76474x24728b = "connectWifi";

    public static android.util.Pair C(qf1.e eVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.util.Map map) {
        eVar.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
            map.put("errCode", 12006);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiConnectWifi", "fixErrInfo, may be not open GPS");
            return new android.util.Pair("fail:may be not open GPS", jc1.c.f380432w);
        }
        boolean b17 = nf.t.b((android.app.Activity) context, lVar, "android.permission.ACCESS_FINE_LOCATION");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiConnectWifi", "fixErrInfo, checkLocation:%b", java.lang.Boolean.valueOf(b17));
        if (b17) {
            map.put("errCode", 12010);
            return null;
        }
        map.put("errCode", 12012);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiConnectWifi", "fixErrInfo, may be not obtain GPS Perrmission");
        return new android.util.Pair("fail:may be not obtain GPS Perrmission", jc1.c.f380433x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x080f  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r34, org.json.JSONObject r35, int r36) {
        /*
            Method dump skipped, instructions count: 2118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf1.e.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }
}
