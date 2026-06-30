package ek2;

/* loaded from: classes5.dex */
public final class y extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final s40.u0 f335101t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f335102u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.dr1 f335103v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(long j17, long j18, com.p314xaae8f345.mm.p2495xc50a8b8b.g liveCookies, org.json.JSONObject jo6, r45.qt2 qt2Var, s40.u0 callback) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveCookies, "liveCookies");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jo6, "jo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f335101t = callback;
        this.f335102u = "Finder.GameLive.CgiFinderGameLivePlaygameSetTeamupConfig";
        r45.dr1 dr1Var = new r45.dr1();
        this.f335103v = dr1Var;
        dr1Var.set(1, db2.t4.f309704a.a(6917));
        dr1Var.set(2, java.lang.Long.valueOf(j17));
        dr1Var.set(3, java.lang.Long.valueOf(j18));
        dr1Var.set(4, liveCookies);
        dr1Var.set(5, xy2.c.f(qt2Var));
        dr1Var.set(6, 1);
        r45.w63 w63Var = new r45.w63();
        w63Var.set(0, 1);
        w63Var.set(1, java.lang.Integer.valueOf(jo6.optInt("join_team_mode")));
        r45.wd7 wd7Var = new r45.wd7();
        wd7Var.set(0, jo6.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
        wd7Var.set(1, jo6.optString("teamup_desc"));
        wd7Var.set(2, jo6.optString("member_desc"));
        wd7Var.set(4, jo6.optString("teamup_extra_data"));
        r45.i41 i41Var = new r45.i41();
        i41Var.set(0, jo6.optString("appid"));
        i41Var.set(2, java.lang.Integer.valueOf(jo6.optInt("versionType")));
        i41Var.set(1, jo6.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714));
        wd7Var.set(5, i41Var);
        w63Var.set(2, wd7Var);
        dr1Var.set(7, w63Var);
        r45.er1 er1Var = new r45.er1();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = dr1Var;
        lVar.f152198b = er1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegamesetteamupconfig";
        lVar.f152200d = 6917;
        p(lVar.a());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appid", jo6.optString("appid"));
        jSONObject.put("type", 2);
        jSONObject.put("gametype", 1);
        jSONObject.put("sourceid", jo6.optString("sourceid"));
        jSONObject.put("teamupsetting", jo6.optString("join_team_mode"));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.Y, jSONObject.toString(), null, 4, null);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.er1 resp = (r45.er1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335102u, "[onCgiBack] scene:" + this.f335103v.m75939xb282bd08(6) + ",errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + ' ');
        p60.n nVar = (p60.n) this.f335101t;
        nVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16054xbab20ef0 c16054xbab20ef0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16054xbab20ef0(i18);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = nVar.f433722a;
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433701d, null, 0, c16054xbab20ef0, 6, null));
        }
    }
}
