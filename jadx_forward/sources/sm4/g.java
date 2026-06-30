package sm4;

/* loaded from: classes8.dex */
public class g extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f491473d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f491474e;

    /* renamed from: f, reason: collision with root package name */
    public final long f491475f;

    public g(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, dm.m0 m0Var, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStoryPostHaokan", "Create NetSceneTopStoryPostVideo ts:%s, extInfo:%s, comment:%s, requestId:%s, appVersion:%s", java.lang.Long.valueOf(j17), str, str2, str3, str4);
        this.f491475f = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 2534;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/colikepost";
        lVar.f152197a = new r45.p50();
        lVar.f152198b = new r45.q50();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f491474e = a17;
        r45.p50 p50Var = (r45.p50) a17.f152243a.f152217a;
        p50Var.f464289d = j17;
        p50Var.f464290e = str;
        p50Var.f464291f = str2;
        p50Var.f464292g = str3;
        r45.l50 l50Var = new r45.l50();
        p50Var.f464293h = l50Var;
        l50Var.f460678e = m0Var.f67372x453d1e07;
        l50Var.f460677d = m0Var.f67370x28d45f97;
        l50Var.f460679f = str4;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f491473d = u0Var;
        return mo9409x10f9447a(sVar, this.f491474e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2534;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStoryPostHaokan", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f491475f));
        this.f491473d.mo815x76e0bfae(i18, i19, str, this);
    }
}
