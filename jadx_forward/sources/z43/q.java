package z43;

/* loaded from: classes.dex */
public class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        long optLong = jSONObject.optLong("download_id");
        if (optLong <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiInstallDownloadTask", "data is null");
            this.f224976f.a("fail_invalid_data");
            return;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().p(optLong);
        int i17 = p17.f178496f;
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiInstallDownloadTask", "installDownloadTask fail, apilevel not supported");
            this.f224976f.a("fail");
            return;
        }
        if (i17 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiInstallDownloadTask", "installDownloadTask fail, invalid status = " + p17.f178496f);
            this.f224976f.a("fail");
            return;
        }
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(optLong);
        if (c17 != null) {
            int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
            int optInt2 = jSONObject.optInt("uiarea");
            int optInt3 = jSONObject.optInt("notice_id");
            int optInt4 = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f);
            c17.f68432x29cbf907 = optInt;
            c17.f68444x136fa406 = optInt2;
            c17.f68427x7c4053b8 = optInt3;
            c17.f68436x2261a7a0 = optInt4;
            ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
        }
        vz.f1 f1Var = (vz.f1) i95.n0.c(vz.f1.class);
        long j17 = p17.f178494d;
        z43.p pVar = new z43.p(this);
        ((uz.a) f1Var).getClass();
        k02.l.a(j17, false, pVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
