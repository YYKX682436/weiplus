package ep4;

/* loaded from: classes.dex */
public final class k extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f337291d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f337292e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f337293f;

    /* renamed from: g, reason: collision with root package name */
    public int f337294g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f337295h;

    /* renamed from: i, reason: collision with root package name */
    public long f337296i;

    public k(java.lang.String finderUserName, java.lang.String inputText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputText, "inputText");
        this.f337291d = inputText;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findertexttospeech";
        lVar.f152200d = 5207;
        r45.qz2 qz2Var = new r45.qz2();
        qz2Var.set(2, finderUserName);
        qz2Var.set(3, inputText);
        lVar.f152197a = qz2Var;
        lVar.f152198b = new r45.rz2();
        this.f337292e = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFinderTextToSpeech", "doScene");
        this.f337293f = u0Var;
        return mo9409x10f9447a(sVar, this.f337292e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5207;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFinderTextToSpeech", "onGYNetEnd, errType:" + i18 + ", errCode:" + i19);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneFinderTextToSpeech", "onGYNetEnd error");
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f337292e.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderTextToSpeechResp");
        r45.rz2 rz2Var = (r45.rz2) fVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = rz2Var.m75934xbce7f2f(1);
        this.f337295h = m75934xbce7f2f != null ? m75934xbce7f2f.f273689a : null;
        this.f337296i = rz2Var.m75942xfb822ef2(2);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f337293f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
