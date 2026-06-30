package hc3;

/* loaded from: classes9.dex */
public final class b implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f361886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qg0.f0 f361887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qg7 f361888c;

    public b(java.util.Map map, qg0.f0 f0Var, r45.qg7 qg7Var) {
        this.f361886a = map;
        this.f361887b = f0Var;
        this.f361888c = qg7Var;
    }

    @Override // xj.l
    /* renamed from: onJumpAppCancel */
    public void mo25335x737e9bce() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HongbaoVsYuanBaoLogic", "[goToYuanbaoApp] onJumpAppCancel");
        this.f361886a.put("callback_event", "onJumpAppCancel");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("jump_yuanbao_callback", null, this.f361886a, 13, false);
        qg0.f0 f0Var = this.f361887b;
        if (f0Var != null) {
            ((v93.c) f0Var).a("user canceled");
        }
    }

    @Override // xj.l
    /* renamed from: onJumpAppCheckExpose */
    public void mo25336x6332c618() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HongbaoVsYuanBaoLogic", "[goToYuanbaoApp] onJumpAppCheckExpose");
        this.f361886a.put("callback_event", "onJumpAppCheckExpose");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("jump_yuanbao_callback", null, this.f361886a, 13, false);
    }

    @Override // xj.l
    /* renamed from: onJumpAppFail */
    public void mo25337x30578972() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HongbaoVsYuanBaoLogic", "[goToYuanbaoApp] onJumpAppFail");
        this.f361886a.put("callback_event", "onJumpAppFail");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("jump_yuanbao_callback", null, this.f361886a, 13, false);
        qg0.f0 f0Var = this.f361887b;
        if (f0Var != null) {
            ((v93.c) f0Var).a("jump app failed");
        }
    }

    @Override // xj.l
    /* renamed from: onJumpAppSuccess */
    public void mo25338x6c3e7d2f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HongbaoVsYuanBaoLogic", "[goToYuanbaoApp] onJumpAppSuccess");
        this.f361886a.put("callback_event", "onJumpAppSuccess");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("jump_yuanbao_callback", null, this.f361886a, 13, false);
        qg0.f0 f0Var = this.f361887b;
        if (f0Var != null) {
            java.lang.String str = this.f361888c.f465510d;
            v93.c cVar = (v93.c) f0Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsapiOpenYuanbaoGenImage", "open success, token: " + str);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("result", java.lang.Boolean.TRUE);
            hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56296xc5686afb, "ok");
            if (str == null) {
                str = "";
            }
            hashMap.put("token", str);
            cVar.f515694a.f224976f.b(hashMap);
        }
    }

    @Override // xj.l
    /* renamed from: onJumpDownloadPage */
    public void mo25339xfa564284() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HongbaoVsYuanBaoLogic", "[goToYuanbaoApp] onJumpDownloadPage");
        this.f361886a.put("callback_event", "onJumpDownloadPage");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("jump_yuanbao_callback", null, this.f361886a, 13, false);
        qg0.f0 f0Var = this.f361887b;
        if (f0Var != null) {
            java.lang.String str = this.f361888c.f465510d;
            v93.c cVar = (v93.c) f0Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsapiOpenYuanbaoGenImage", "open success DownloadPage, token: " + str);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            hashMap.put("result", bool);
            hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56296xc5686afb, "ok");
            if (str == null) {
                str = "";
            }
            hashMap.put("token", str);
            hashMap.put("downloadPage", bool);
            cVar.f515694a.f224976f.b(hashMap);
        }
    }
}
