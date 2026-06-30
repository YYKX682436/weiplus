package l41;

/* loaded from: classes4.dex */
public final class t extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397457d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397458e;

    /* renamed from: f, reason: collision with root package name */
    public r45.jk0 f397459f;

    public t(java.util.List list) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 9146;
        lVar.f152199c = "/cgi-bin/micromsg-bin/encryptforwardwxworkmsg";
        lVar.f152197a = new r45.ik0();
        lVar.f152198b = new r45.jk0();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397458e = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.EncryptForwardWxworkMsgReq");
        r45.ik0 ik0Var = (r45.ik0) fVar;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list != null) {
            linkedList.addAll(list);
        }
        ik0Var.f458639d = linkedList;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f397457d = callback;
        return mo9409x10f9447a(dispatcher, this.f397458e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 9146;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 rr6, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetForwardWeWorkMsg", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f397458e.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.EncryptForwardWxworkMsgResp");
            this.f397459f = (r45.jk0) fVar;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f397457d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
