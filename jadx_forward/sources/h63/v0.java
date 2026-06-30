package h63;

@j95.b(m140513x1e06fd29 = {p60.x.class})
/* loaded from: classes7.dex */
public final class v0 extends i95.w implements h63.r1 {

    /* renamed from: d, reason: collision with root package name */
    public h63.q1 f360818d;

    /* renamed from: e, reason: collision with root package name */
    public j63.p f360819e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f360820f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f360821g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f360822h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a f360823i;

    /* renamed from: m, reason: collision with root package name */
    public h63.p1 f360824m;

    /* renamed from: n, reason: collision with root package name */
    public int f360825n;

    /* renamed from: o, reason: collision with root package name */
    public long f360826o;

    public static final void wi(h63.v0 v0Var, java.lang.String str, android.content.Context context, boolean z17) {
        v0Var.f360822h = true;
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = p60.u.f433732g;
        o4Var.putBoolean("onLivingStatusForCrashCheck", false);
        o4Var.putString("onLiveAppIdForCrashCheck", "");
        o4Var.putInt("onLiveVersionTypeForCrashCheck", 0);
        v0Var.Ui();
        h63.v[] vVarArr = h63.v.f360817d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f c16049x1ab5a75f = new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f(str, 0, 4, z17 ? 1 : 0, null, null, 0, 0L, 242, null);
        h63.s0 s0Var = h63.s0.f360812a;
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c16049x1ab5a75f, s0Var, null);
    }

    public void Ai(java.lang.String appId, int i17, android.content.Context context, int i18, h63.l1 l1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((ku5.t0) ku5.t0.f394148d).B(new h63.b0(appId, i17, context, this, i18, l1Var));
    }

    public void Bi(int i17) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.A, null, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16051x7a60cadc(i17, this.f360825n, this.f360826o), 6, null), p60.q.class, null);
    }

    public final void Di(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16060x33daecf c16060x33daecf) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var;
        j63.p pVar = this.f360819e;
        if (pVar == null || (o6Var = pVar.f379434a) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.s();
        sVar.u(o6Var.C0());
        sVar.t(kz5.c1.k(new jz5.l("event", java.lang.Integer.valueOf(i17)), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, java.lang.Integer.valueOf(i18))));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLiveAppbrandEventService", "zbql: send Event:" + i17 + ",reason:" + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u[] uVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u.f167525d;
        if (i17 == 1) {
            ((p60.u) i95.n0.c(p60.u.class)).getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = p60.u.f433732g;
            java.util.Map k17 = kz5.c1.k(new jz5.l("nickname", o4Var.getString("Game_Live_Nickname", "")), new jz5.l("headerUrl", o4Var.getString("Game_Live_anchorHeadUrl", "")), new jz5.l("joinLiveTips", o4Var.getString("Game_Live_joinLiveTips", "")), new jz5.l("liveId", java.lang.Long.valueOf(o4Var.getLong("Game_Live_liveId", 0L))), new jz5.l("finderUsername", o4Var.getString("Game_Live_finderUsrName", "")), new jz5.l("wxaGameExportId", o4Var.getString("Game_Live_finderGameExportId", "")));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLiveAppbrandEventService", "zbql: start Event,nickname:%s", o4Var.getString("Game_Live_Nickname", ""));
            sVar.s("extra", k17);
        }
        sVar.m();
    }

    public void Ni(java.lang.Boolean bool) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var;
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433714t, null, 0, null, 14, null), p60.q.class, null);
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433715u, null, 0, null, 14, null), p60.q.class, null);
        }
        j63.p pVar = this.f360819e;
        if (pVar != null && (o6Var = pVar.f379434a) != null) {
            j63.c cVar = new j63.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLiveAppbrandEventService", "send LiveMute event without volumn，mute:" + booleanValue);
            cVar.u(o6Var.C0());
            cVar.s("mute", java.lang.Boolean.valueOf(booleanValue ^ true));
            cVar.m();
        }
        this.f360821g = booleanValue;
        ((i63.b0) ((i63.k0) i95.n0.c(i63.k0.class))).wi(false, false);
    }

    public void Ri(java.lang.Boolean bool, int i17) {
        boolean booleanValue = bool.booleanValue();
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        p60.u.f433732g.putBoolean("disableLiveInfo", !booleanValue);
        if (booleanValue) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433716v, null, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16054xbab20ef0(i17), 6, null), p60.q.class, null);
        }
    }

    public final void Ui() {
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = p60.u.f433732g;
        if (!o4Var.getBoolean("isPushing", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandProcessService", "stopPushing: isNotPushing return");
            return;
        }
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        o4Var.putBoolean("isPushing", false);
        h63.q1 q1Var = this.f360818d;
        if (q1Var != null) {
            h63.u0 u0Var = h63.u0.f360816d;
            pa1.t tVar = (pa1.t) q1Var;
            tVar.f122219g.m34856x4a42b983().e();
            tVar.f122219g.e(false, 0, new pa1.r(tVar, u0Var));
        }
    }
}
