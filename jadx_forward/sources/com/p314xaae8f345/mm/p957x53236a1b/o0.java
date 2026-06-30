package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes4.dex */
public class o0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f152915h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static java.util.Map f152916i;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f152917d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152918e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f152919f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f152920g;

    public o0(int i17, boolean z17) {
        java.lang.String[] split;
        this.f152919f = false;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.fe3();
        lVar.f152198b = new r45.ge3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getdisasterinfo";
        lVar.f152200d = 775;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f152917d = a17;
        a17.f152247e = 1;
        ((r45.fe3) a17.f152243a.f152217a).f455785d = i17;
        this.f152919f = z17;
        synchronized (this) {
            if (f152916i == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap");
                f152916i = new java.util.HashMap();
                android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("disaster_pref", 4);
                java.lang.String string = sharedPreferences.getString("disaster_new_noticeid_list_key", "");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) && (split = string.split(";")) != null && split.length > 0) {
                    java.lang.String str = "";
                    android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                    for (java.lang.String str2 : split) {
                        java.lang.String[] split2 = str2.split(",");
                        try {
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split2[0], 0L) > 0) {
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split2[1], 0L)) < 86400) {
                                    java.lang.String string2 = sharedPreferences.getString(split2[0], "");
                                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                                        str = str + split2[0] + "," + split2[1] + ";";
                                        ((java.util.HashMap) f152916i).put(split2[0], string2);
                                    }
                                } else {
                                    edit.remove(split2[0]).commit();
                                }
                            }
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap error:%s", e17.getMessage());
                        }
                    }
                    edit.putString("disaster_new_noticeid_list_key", str).commit();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap newNoticeIdList[%s], noticeidTickMap[%s]", str, f152915h);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap done noticeContentMap[%s]", f152916i);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo noticeid[%d], manualauthSucc[%b], stack[%s]", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f152919f), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    public static void H(com.p314xaae8f345.mm.p957x53236a1b.o0 o0Var, java.lang.String str, java.lang.String str2) {
        o0Var.getClass();
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("disaster_pref", 4);
        java.lang.String string = sharedPreferences.getString("disaster_new_noticeid_list_key", "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            string = string + ";";
        }
        java.lang.String str3 = string + str + "," + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        edit.putString("disaster_new_noticeid_list_key", str3);
        edit.commit();
        ((java.util.HashMap) f152916i).put(str, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz saveDisasterNotice newNoticeIdList[%s], noticeId[%s], content[%s]", sharedPreferences.getString("disaster_new_noticeid_list_key", ""), str, sharedPreferences.getString(str, ""));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f152917d;
        r45.fe3 fe3Var = (r45.fe3) oVar.f152243a.f152217a;
        java.util.Map map = f152915h;
        long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) ((java.util.HashMap) map).get("" + fe3Var.f455785d), 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene noticeid[%d], tick[%d], noticeidTickMap[%s]", java.lang.Integer.valueOf(fe3Var.f455785d), java.lang.Long.valueOf(k17), map);
        if (k17 != 0 && android.os.SystemClock.elapsedRealtime() - k17 < 1800000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene disasterTick within half an hour, drop it [%s]", java.lang.Integer.valueOf(fe3Var.f455785d));
            return -1;
        }
        java.lang.String str = (java.lang.String) ((java.util.HashMap) f152916i).get("" + fe3Var.f455785d);
        java.lang.String str2 = str != null ? str : "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            this.f152918e = u0Var;
            return mo9409x10f9447a(sVar, oVar, this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene found cache[%d, %s]", java.lang.Integer.valueOf(fe3Var.f455785d), str2);
        gm0.j1.e().j(new com.p314xaae8f345.mm.p957x53236a1b.n0(this, str2, false));
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 775;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            gm0.j1.e().j(new com.p314xaae8f345.mm.p957x53236a1b.n0(this, ((r45.ge3) this.f152917d.f152244b.f152233a).f456699d, true));
        }
        this.f152918e.mo815x76e0bfae(i18, i19, str, this);
    }
}
