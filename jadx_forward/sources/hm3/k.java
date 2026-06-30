package hm3;

/* loaded from: classes.dex */
public final class k extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f363790i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f363791m;

    /* renamed from: n, reason: collision with root package name */
    public r45.es4 f363792n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(0, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6860;
        lVar.f152199c = "/cgi-bin/micromsg-bin/musiclivegetrelatedlist";
        lVar.f152197a = new r45.ds4();
        lVar.f152198b = new r45.es4();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f363791m = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetRelatedListReq");
        r45.ds4 ds4Var = (r45.ds4) fVar;
        ds4Var.f454253o = 101;
        ds4Var.f454258t = db2.t4.f309704a.n();
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 c3Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("bgmid", c3Var.f232608e.m75945x2fec8307(5));
        jSONObject.put("songname", c3Var.f232608e.m75945x2fec8307(0));
        jSONObject.put("singername", c3Var.f232608e.m75945x2fec8307(1));
        jSONObject.put("songdesc", "");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", 1);
        jSONObject2.put("bgmquery", jSONObject);
        r45.hf2 songInfo = c3Var.f232608e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        byte[] encode = android.util.Base64.encode(songInfo.mo14344x5f01b1f6(), 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
        jSONObject2.put("songinfobufferbase64", new java.lang.String(encode, r26.c.f450398a));
        ds4Var.f454254p = jSONObject2.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.NetSceneMusicMvGetMVRecommendList", "create NetSceneMusicMvGetFeedRecommendList songId:" + c3Var.f232608e.m75945x2fec8307(5));
        r45.kv0 kv0Var = new r45.kv0();
        ds4Var.f454245d = kv0Var;
        kv0Var.set(1, 93);
        r45.kv0 kv0Var2 = ds4Var.f454245d;
        if (kv0Var2 != null) {
            kv0Var2.set(5, java.lang.Long.valueOf(c01.id.c()));
        }
        ds4Var.f454246e = gVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f363790i = callback;
        return mo9409x10f9447a(dispatcher, this.f363791m, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6860;
    }

    @Override // hm3.a, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        super.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.NetSceneMusicMvGetMVRecommendList", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f363790i;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f363791m.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetRelatedListResp");
        this.f363792n = (r45.es4) fVar;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f363790i;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
