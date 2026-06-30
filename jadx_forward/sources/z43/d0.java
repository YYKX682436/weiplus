package z43;

/* loaded from: classes.dex */
public class d0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        long optLong = jSONObject.optLong("download_id");
        if (optLong <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiPauseDownloadTask", "fail, invalid downloadId = " + optLong);
            this.f224976f.a("invalid_downloadid");
            return;
        }
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(optLong);
        if (c17 == null) {
            this.f224976f.d(false);
            return;
        }
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1000);
        int optInt2 = jSONObject.optInt("uiarea");
        int optInt3 = jSONObject.optInt("notice_id");
        int optInt4 = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f);
        boolean z18 = jSONObject.optInt("ignoreNetwork", 0) == 1;
        boolean z19 = jSONObject.optInt("showDialog", 0) == 1;
        c17.f68432x29cbf907 = optInt;
        c17.f68444x136fa406 = optInt2;
        c17.f68427x7c4053b8 = optInt3;
        c17.f68436x2261a7a0 = optInt4;
        c17.f68409xc4f9be67 = false;
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
        ((uz.c2) ((vz.a2) i95.n0.c(vz.a2.class))).wi(c(), optLong, z18, z19, new z43.c0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
