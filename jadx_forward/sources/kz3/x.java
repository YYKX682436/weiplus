package kz3;

/* loaded from: classes9.dex */
public final class x extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f395474d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f395475e;

    /* renamed from: f, reason: collision with root package name */
    public final long f395476f;

    public x(byte[] bArr, long j17, int i17, int i18, hz3.b bVar, hz3.a aVar, java.util.ArrayList arrayList, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        bArr = (i19 & 1) != 0 ? null : bArr;
        bVar = (i19 & 16) != 0 ? null : bVar;
        arrayList = (i19 & 64) != 0 ? null : arrayList;
        this.f395476f = j17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ml();
        lVar.f152198b = new r45.nl();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/imgretrieval/ocr_chat_image";
        lVar.f152200d = 5131;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f395475e = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizOcrChatImageRequest");
        r45.ml mlVar = (r45.ml) fVar;
        mlVar.f462153p = j17;
        mlVar.f462145e = i17;
        mlVar.f462154q = i18;
        if (bArr != null) {
            mlVar.f462144d = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        }
        if (bVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBizImageOCR", "NetSceneBizImageOCR decodeResult: %s, %s", java.lang.Integer.valueOf(bVar.f367847a), java.lang.Integer.valueOf(bVar.f367848b));
            mlVar.f462150m = bVar.f367847a;
            mlVar.f462151n = bVar.f367848b;
        }
        java.util.LinkedList linkedList = mlVar.f462152o;
        if (arrayList != null) {
            linkedList.addAll(arrayList);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NetSceneBizImageOCR imageSize: ");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        sb6.append(", sessionId: ");
        sb6.append(j17);
        sb6.append(", source: ");
        sb6.append(i17);
        sb6.append(", seqNum: ");
        sb6.append(i18);
        sb6.append(", cdn_image_list: ");
        sb6.append(linkedList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBizImageOCR", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f395474d = callback;
        return mo9409x10f9447a(dispatcher, this.f395475e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5131;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBizImageOCR", "onGYNetEnd errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f395474d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
