package hm3;

/* loaded from: classes8.dex */
public final class d extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f363767d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f363768e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f363769f;

    public d(s45.g musicInfo, int i17, int i18, java.lang.String cacheKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicInfo, "musicInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheKey, "cacheKey");
        this.f363767d = cacheKey;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 8167;
        lVar.f152199c = "/cgi-bin/mmlistenappsvr/listenitem";
        lVar.f152197a = new s45.e();
        lVar.f152198b = new s45.f();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f363769f = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenItemRequest");
        s45.e eVar = (s45.e) fVar;
        eVar.f484510f = musicInfo;
        eVar.f484509e = i17;
        eVar.f484511g = i18;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("[req_type:");
        stringBuffer.append(i17);
        stringBuffer.append(",scene:");
        stringBuffer.append(i18);
        stringBuffer.append("musicInfo:" + musicInfo);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.NetSceneMMListenItem", "request music info:%s", stringBuffer.substring(0, stringBuffer.length() + (-1)) + ']');
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f363768e = u0Var;
        return mo9409x10f9447a(sVar, this.f363769f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 8167;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.NetSceneMMListenItem", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f363768e;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f363769f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.mv.MMListenItemResponse");
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f363768e;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
