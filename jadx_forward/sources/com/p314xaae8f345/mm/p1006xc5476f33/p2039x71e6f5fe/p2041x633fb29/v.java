package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes9.dex */
public final class v extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f240608d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f240609e;

    /* renamed from: f, reason: collision with root package name */
    public final long f240610f;

    public v(byte[] bArr, long j17, int i17, int i18, int i19, r45.cj cjVar, r45.vi viVar, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17266x8cecd44e c17266x8cecd44e, hz3.b bVar, hz3.a aVar, java.util.ArrayList arrayList, java.lang.String chatUUID) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatUUID, "chatUUID");
        this.f240610f = j17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.aj();
        lVar.f152198b = new r45.bj();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/usrmsg/aiscan_image_scene";
        lVar.f152200d = 1100;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f240609e = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizAiScanImageSceneRequest");
        r45.aj ajVar = (r45.aj) fVar;
        ajVar.f451563e = i17;
        ajVar.f451564f = i18;
        ajVar.f451567i = i19;
        if (bArr != null) {
            ajVar.f451562d = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        }
        ajVar.f451565g = j17;
        ajVar.f451568m = cjVar;
        ajVar.f451569n = viVar;
        java.lang.String str3 = "";
        ajVar.f451571p = (c17266x8cecd44e == null || (str2 = c17266x8cecd44e.f37914x64c7d9e) == null) ? "" : str2;
        if (c17266x8cecd44e != null && (str = c17266x8cecd44e.f37915x1444495a) != null) {
            str3 = str;
        }
        ajVar.f451572q = str3;
        if (bVar != null) {
            ajVar.f451576u = bVar.f367847a;
            ajVar.f451577v = bVar.f367848b;
        }
        ajVar.f451579x = chatUUID;
        if (arrayList != null) {
            ajVar.f451578w.addAll(arrayList);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NetSceneAiScanImageScene imageSize: ");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        sb6.append(", type: ");
        sb6.append(i17);
        sb6.append(", mode: ");
        sb6.append(i18);
        sb6.append(", sessionId: ");
        sb6.append(j17);
        sb6.append(", seqNum: ");
        sb6.append(i19);
        sb6.append(", cdnUploadResult: ");
        sb6.append(aVar);
        sb6.append(", cdnInfoList: ");
        sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        sb6.append(", chat_uuid=");
        sb6.append(chatUUID);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAiScanImageScene", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f240608d = callback;
        return mo9409x10f9447a(dispatcher, this.f240609e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1100;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAiScanImageScene", "onGYNetEnd errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f240608d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
