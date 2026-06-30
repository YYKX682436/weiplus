package sm4;

/* loaded from: classes15.dex */
public class j extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f491485d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f491486e;

    /* renamed from: f, reason: collision with root package name */
    public final long f491487f = java.lang.System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public final r45.xn6 f491488g;

    public j(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 2802;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/topstorypluginsetcomment";
        lVar.f152197a = new r45.mn6();
        lVar.f152198b = new r45.nn6();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f491486e = a17;
        r45.mn6 mn6Var = (r45.mn6) a17.f152243a.f152217a;
        mn6Var.f462230d = jSONObject.optString("docId", "");
        mn6Var.f462231e = jSONObject.optString("commentId", "");
        mn6Var.f462232f = jSONObject.optInt("opType", 0);
        mn6Var.f462233g = jSONObject.optString("requestId", "");
        mn6Var.f462234h = jSONObject.optString("content", "");
        mn6Var.f462235i = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        mn6Var.f462236m = jSONObject.optString("searchId", "");
        mn6Var.f462237n = jSONObject.optInt("subScene", 0);
        mn6Var.f462238o = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54503x6397ab9d, "");
        mn6Var.f462239p = jSONObject.optString("byPass", "");
        mn6Var.f462240q = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStorySetComment", "TopStoryPluginSetCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", mn6Var.f462230d, mn6Var.f462231e, java.lang.Integer.valueOf(mn6Var.f462232f), mn6Var.f462233g, mn6Var.f462234h, java.lang.Integer.valueOf(mn6Var.f462235i), mn6Var.f462236m, java.lang.Integer.valueOf(mn6Var.f462237n), mn6Var.f462238o, mn6Var.f462239p);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f491485d = u0Var;
        return mo9409x10f9447a(sVar, this.f491486e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2802;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStorySetComment", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f491487f));
        this.f491485d.mo815x76e0bfae(i18, i19, str, this);
    }

    public j(r45.xn6 xn6Var, java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, int i19, java.lang.String str4, java.lang.String str5, int i27) {
        this.f491488g = xn6Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 2802;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/topstorypluginsetcomment";
        lVar.f152197a = new r45.mn6();
        lVar.f152198b = new r45.nn6();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f491486e = a17;
        r45.mn6 mn6Var = (r45.mn6) a17.f152243a.f152217a;
        mn6Var.f462230d = str;
        mn6Var.f462231e = "";
        mn6Var.f462232f = i17;
        mn6Var.f462233g = str2;
        mn6Var.f462234h = "";
        mn6Var.f462235i = i18;
        mn6Var.f462236m = str3;
        mn6Var.f462237n = i19;
        mn6Var.f462238o = str4;
        mn6Var.f462239p = str5;
        mn6Var.f462240q = i27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStorySetComment", "TopStoryPluginSetCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", str, "", java.lang.Integer.valueOf(i17), mn6Var.f462233g, mn6Var.f462234h, java.lang.Integer.valueOf(mn6Var.f462235i), mn6Var.f462236m, java.lang.Integer.valueOf(mn6Var.f462237n), mn6Var.f462238o, mn6Var.f462239p);
    }
}
