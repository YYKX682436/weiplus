package hm3;

/* loaded from: classes.dex */
public final class p extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f363809i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f363810m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f363811n;

    /* renamed from: o, reason: collision with root package name */
    public r45.es4 f363812o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r45.bt4 bt4Var, r45.hf2 songInfo, java.lang.String songInfoBase64, int i17, boolean z17) {
        super(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfoBase64, "songInfoBase64");
        this.f363809i = songInfoBase64;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6860;
        lVar.f152199c = "/cgi-bin/micromsg-bin/musiclivegetrelatedlist";
        lVar.f152197a = new r45.ds4();
        lVar.f152198b = new r45.es4();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f363811n = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetRelatedListReq");
        r45.ds4 ds4Var = (r45.ds4) fVar;
        if (z17) {
            ds4Var.f454253o = 102;
        } else {
            ds4Var.f454253o = 103;
        }
        r45.kv0 kv0Var = new r45.kv0();
        if (bt4Var != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(bt4Var.f452571f));
        }
        kv0Var.set(5, java.lang.Long.valueOf(c01.id.c()));
        ds4Var.f454245d = kv0Var;
        ds4Var.f454258t = db2.t4.f309704a.n();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 2);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("songid", songInfo.m75945x2fec8307(5));
        jSONObject.put("mvquery", jSONObject2);
        jSONObject.put("songinfobufferbase64", songInfoBase64);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.NetSceneMusicMvGetMVRecommendList", "songId:%s", songInfo.m75945x2fec8307(5));
        ds4Var.f454254p = jSONObject.toString();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f363810m = callback;
        return mo9409x10f9447a(dispatcher, this.f363811n, this);
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
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f363810m;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f363811n.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetRelatedListResp");
        this.f363812o = (r45.es4) fVar;
        r45.es4 es4Var = new r45.es4();
        r45.es4 es4Var2 = this.f363812o;
        es4Var.mo11468x92b714fd(es4Var2 != null ? es4Var2.mo14344x5f01b1f6() : null);
        fm3.y yVar = fm3.y.f345694a;
        java.lang.String songInfoBase64 = this.f363809i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfoBase64, "songInfoBase64");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvCgiRetCache", "putMvRecommendList, songInfoBase64:" + songInfoBase64.hashCode() + ", response:" + es4Var.hashCode() + ", timestamp:" + elapsedRealtime);
        fm3.y.f345696c.put(new fm3.b0(songInfoBase64), new fm3.a0(es4Var, elapsedRealtime));
        yVar.a(elapsedRealtime);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f363810m;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
