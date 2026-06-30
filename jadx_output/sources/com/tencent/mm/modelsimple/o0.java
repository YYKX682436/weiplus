package com.tencent.mm.modelsimple;

/* loaded from: classes4.dex */
public class o0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f71382h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static java.util.Map f71383i;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71384d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71385e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f71386f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f71387g;

    public o0(int i17, boolean z17) {
        java.lang.String[] split;
        this.f71386f = false;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.fe3();
        lVar.f70665b = new r45.ge3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getdisasterinfo";
        lVar.f70667d = 775;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71384d = a17;
        a17.f70714e = 1;
        ((r45.fe3) a17.f70710a.f70684a).f374252d = i17;
        this.f71386f = z17;
        synchronized (this) {
            if (f71383i == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap");
                f71383i = new java.util.HashMap();
                android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("disaster_pref", 4);
                java.lang.String string = sharedPreferences.getString("disaster_new_noticeid_list_key", "");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && (split = string.split(";")) != null && split.length > 0) {
                    java.lang.String str = "";
                    android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                    for (java.lang.String str2 : split) {
                        java.lang.String[] split2 = str2.split(",");
                        try {
                            if (com.tencent.mm.sdk.platformtools.t8.V(split2[0], 0L) > 0) {
                                if (com.tencent.mm.sdk.platformtools.t8.H1(com.tencent.mm.sdk.platformtools.t8.V(split2[1], 0L)) < 86400) {
                                    java.lang.String string2 = sharedPreferences.getString(split2[0], "");
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                                        str = str + split2[0] + "," + split2[1] + ";";
                                        ((java.util.HashMap) f71383i).put(split2[0], string2);
                                    }
                                } else {
                                    edit.remove(split2[0]).commit();
                                }
                            }
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap error:%s", e17.getMessage());
                        }
                    }
                    edit.putString("disaster_new_noticeid_list_key", str).commit();
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap newNoticeIdList[%s], noticeidTickMap[%s]", str, f71382h);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap done noticeContentMap[%s]", f71383i);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo noticeid[%d], manualauthSucc[%b], stack[%s]", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f71386f), new com.tencent.mm.sdk.platformtools.z3());
    }

    public static void H(com.tencent.mm.modelsimple.o0 o0Var, java.lang.String str, java.lang.String str2) {
        o0Var.getClass();
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("disaster_pref", 4);
        java.lang.String string = sharedPreferences.getString("disaster_new_noticeid_list_key", "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            string = string + ";";
        }
        java.lang.String str3 = string + str + "," + com.tencent.mm.sdk.platformtools.t8.i1();
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        edit.putString("disaster_new_noticeid_list_key", str3);
        edit.commit();
        ((java.util.HashMap) f71383i).put(str, str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz saveDisasterNotice newNoticeIdList[%s], noticeId[%s], content[%s]", sharedPreferences.getString("disaster_new_noticeid_list_key", ""), str, sharedPreferences.getString(str, ""));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.modelbase.o oVar = this.f71384d;
        r45.fe3 fe3Var = (r45.fe3) oVar.f70710a.f70684a;
        java.util.Map map = f71382h;
        long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) ((java.util.HashMap) map).get("" + fe3Var.f374252d), 0L);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene noticeid[%d], tick[%d], noticeidTickMap[%s]", java.lang.Integer.valueOf(fe3Var.f374252d), java.lang.Long.valueOf(k17), map);
        if (k17 != 0 && android.os.SystemClock.elapsedRealtime() - k17 < 1800000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene disasterTick within half an hour, drop it [%s]", java.lang.Integer.valueOf(fe3Var.f374252d));
            return -1;
        }
        java.lang.String str = (java.lang.String) ((java.util.HashMap) f71383i).get("" + fe3Var.f374252d);
        java.lang.String str2 = str != null ? str : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            this.f71385e = u0Var;
            return dispatch(sVar, oVar, this);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene found cache[%d, %s]", java.lang.Integer.valueOf(fe3Var.f374252d), str2);
        gm0.j1.e().j(new com.tencent.mm.modelsimple.n0(this, str2, false));
        return -1;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 775;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            gm0.j1.e().j(new com.tencent.mm.modelsimple.n0(this, ((r45.ge3) this.f71384d.f70711b.f70700a).f375166d, true));
        }
        this.f71385e.onSceneEnd(i18, i19, str, this);
    }
}
