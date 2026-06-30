package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes4.dex */
public final class w extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f240614d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f240615e;

    /* renamed from: f, reason: collision with root package name */
    public final long f240616f;

    public w(long j17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17266x8cecd44e c17266x8cecd44e, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String str;
        java.lang.String str2;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        this.f240616f = j17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yi();
        lVar.f152198b = new r45.zi();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/imgretrieval/aiscan_image_scene_preview";
        lVar.f152200d = 5079;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f240615e = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizAiScanImageScenePreviewRequest");
        r45.yi yiVar = (r45.yi) fVar;
        yiVar.f472648g = j17;
        yiVar.f472649h = i17;
        java.lang.String str3 = "";
        yiVar.f472646e = (c17266x8cecd44e == null || (str2 = c17266x8cecd44e.f37914x64c7d9e) == null) ? "" : str2;
        if (c17266x8cecd44e != null && (str = c17266x8cecd44e.f37915x1444495a) != null) {
            str3 = str;
        }
        yiVar.f472647f = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAiScanImageScenePreview", "NetSceneAiScanImageScenePreview sessionId: %d, seqNum: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f240614d = callback;
        return mo9409x10f9447a(dispatcher, this.f240615e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5079;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAiScanImageScenePreview", "onGYNetEnd errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f240614d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
