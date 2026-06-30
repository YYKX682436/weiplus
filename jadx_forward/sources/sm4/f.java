package sm4;

/* loaded from: classes8.dex */
public class f extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f491470d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f491471e;

    /* renamed from: f, reason: collision with root package name */
    public final long f491472f = java.lang.System.currentTimeMillis();

    public f(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 2906;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/topstorypluginpostcomment";
        lVar.f152197a = new r45.kn6();
        lVar.f152198b = new r45.ln6();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f491471e = a17;
        r45.kn6 kn6Var = (r45.kn6) a17.f152243a.f152217a;
        kn6Var.f460395d = jSONObject.optString("requestId", "");
        kn6Var.f460396e = jSONObject.optString("docId", "");
        kn6Var.f460397f = jSONObject.optString("content", "");
        kn6Var.f460398g = jSONObject.optString("replyId", "");
        kn6Var.f460399h = jSONObject.optString("subReplyId", "");
        kn6Var.f460400i = jSONObject.optString("docUrl", "");
        kn6Var.f460401m = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        kn6Var.f460402n = jSONObject.optString("searchId", "");
        kn6Var.f460403o = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        kn6Var.f460404p = jSONObject.optInt("subScene", 0);
        kn6Var.f460406r = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54503x6397ab9d, "");
        kn6Var.f460405q = jSONObject.optString("byPass", "");
        kn6Var.f460407s = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "TopStoryPluginPostCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", kn6Var.f460395d, kn6Var.f460396e, kn6Var.f460397f, kn6Var.f460398g, kn6Var.f460399h, kn6Var.f460400i, kn6Var.f460401m, kn6Var.f460402n, java.lang.Integer.valueOf(kn6Var.f460403o), java.lang.Integer.valueOf(kn6Var.f460404p));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f491470d = u0Var;
        return mo9409x10f9447a(sVar, this.f491471e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2906;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f491472f));
        this.f491470d.mo815x76e0bfae(i18, i19, str, this);
    }

    public f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17, int i18, java.lang.String str9, java.lang.String str10, int i19) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 2906;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/topstorypluginpostcomment";
        lVar.f152197a = new r45.kn6();
        lVar.f152198b = new r45.ln6();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f491471e = a17;
        r45.kn6 kn6Var = (r45.kn6) a17.f152243a.f152217a;
        kn6Var.f460395d = str;
        kn6Var.f460396e = str2;
        kn6Var.f460397f = str3;
        kn6Var.f460398g = str4;
        kn6Var.f460399h = str5;
        kn6Var.f460400i = str6;
        kn6Var.f460401m = str7;
        kn6Var.f460402n = str8;
        kn6Var.f460403o = i17;
        kn6Var.f460404p = i18;
        kn6Var.f460406r = str9;
        kn6Var.f460405q = str10;
        kn6Var.f460407s = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "TopStoryPluginPostCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", str, str2, str3, str4, str5, str6, str7, str8, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(kn6Var.f460404p));
    }

    public f(sm4.f fVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 2906;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/topstorypluginpostcomment";
        lVar.f152197a = new r45.kn6();
        lVar.f152198b = new r45.ln6();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f491471e = a17;
        r45.kn6 kn6Var = (r45.kn6) a17.f152243a.f152217a;
        r45.kn6 kn6Var2 = (r45.kn6) fVar.f491471e.f152243a.f152217a;
        java.lang.String str = kn6Var2.f460395d;
        kn6Var.f460395d = str;
        java.lang.String str2 = kn6Var2.f460396e;
        kn6Var.f460396e = str2;
        java.lang.String str3 = kn6Var2.f460397f;
        kn6Var.f460397f = str3;
        java.lang.String str4 = kn6Var2.f460398g;
        kn6Var.f460398g = str4;
        java.lang.String str5 = kn6Var2.f460399h;
        kn6Var.f460399h = str5;
        java.lang.String str6 = kn6Var2.f460400i;
        kn6Var.f460400i = str6;
        java.lang.String str7 = kn6Var2.f460401m;
        kn6Var.f460401m = str7;
        java.lang.String str8 = kn6Var2.f460402n;
        kn6Var.f460402n = str8;
        int i17 = kn6Var2.f460403o;
        kn6Var.f460403o = i17;
        kn6Var.f460404p = kn6Var2.f460404p;
        kn6Var.f460406r = kn6Var2.f460406r;
        kn6Var.f460405q = kn6Var2.f460405q;
        kn6Var.f460407s = kn6Var2.f460407s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStoryPostComment", "TopStoryPluginPostCommentRequest %s, %s, %s, %s, %s, %s, %s, %s, %s, %s", str, str2, str3, str4, str5, str6, str7, str8, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(kn6Var.f460404p));
    }
}
