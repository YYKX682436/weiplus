package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes9.dex */
public final class x extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f240624d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f240625e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f240626f;

    public x(byte[] imageData, int i17, int i18, int i19, int i27, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 scanProductInfo, r45.ti tiVar, r45.ui uiVar, r45.vi viVar, r45.sk6 sk6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanProductInfo, "scanProductInfo");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f240626f = arrayList;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ev5();
        lVar.f152198b = new r45.fv5();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mmbizscan_v2_upload";
        lVar.f152200d = 5105;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
        lVar.f152205i = o4Var != null ? o4Var.getInt("scan_config_upload_timeout", 5000) : 5000;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f240625e = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ScanV2UploadRequest");
        r45.ev5 ev5Var = (r45.ev5) fVar;
        ev5Var.f455277e = i19;
        ev5Var.f455276d = j17;
        ev5Var.f455278f = java.lang.System.currentTimeMillis() / 1000;
        ev5Var.f455279g = i27;
        ev5Var.f455280h = false;
        java.util.LinkedList linkedList = ev5Var.f455281i;
        r45.dv5 dv5Var = new r45.dv5();
        dv5Var.f454306f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(imageData);
        java.util.LinkedList linkedList2 = dv5Var.f454305e;
        r45.qi qiVar = new r45.qi();
        arrayList.add(java.lang.Integer.valueOf(scanProductInfo.getId()));
        qiVar.f465539d = scanProductInfo.getId();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615 c19798x64b97615 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615();
        c19798x64b97615.f38935x7e02c1f9 = scanProductInfo.getX1();
        c19798x64b97615.f38936x7e02c1fa = scanProductInfo.getY1();
        c19798x64b97615.f38933x7e02a527 = scanProductInfo.getX2();
        c19798x64b97615.f38934x7e02a528 = scanProductInfo.getY2();
        qiVar.f465540e = c19798x64b97615;
        qiVar.f465541f = scanProductInfo.getProb();
        linkedList2.add(qiVar);
        dv5Var.f454307g = sk6Var;
        linkedList.add(dv5Var);
        ev5Var.f455283n = tiVar;
        ev5Var.f455284o = uiVar;
        ev5Var.f455282m = viVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NetSceneAiScanImageV2-mixed imageSize: ");
        sb6.append(imageData.length);
        sb6.append(", mode; ");
        sb6.append(i19);
        sb6.append(", scanType: ");
        sb6.append(i27);
        sb6.append(", prob: ");
        sb6.append(scanProductInfo.getProb());
        sb6.append(", trackId: ");
        sb6.append(scanProductInfo.getId());
        sb6.append(", isPreload: ");
        sb6.append(ev5Var.f455280h);
        sb6.append(", sessionId: ");
        sb6.append(j17);
        sb6.append(", mode: ");
        sb6.append(ev5Var.f455277e);
        sb6.append(", imageWidth: ");
        sb6.append(i17);
        sb6.append(", imageHeight: ");
        sb6.append(i18);
        sb6.append(", send_srv_time: ");
        sb6.append(ev5Var.f455278f);
        sb6.append(", touchPoint: ");
        sb6.append(sk6Var != null ? java.lang.Float.valueOf(sk6Var.f467351d) : null);
        sb6.append(", ");
        sb6.append(sk6Var != null ? java.lang.Float.valueOf(sk6Var.f467352e) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAiScanImageV2", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f240624d = callback;
        return mo9409x10f9447a(dispatcher, this.f240625e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5105;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.util.LinkedList linkedList;
        r45.qi qiVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAiScanImageV2", "onGYNetEnd errType: " + i18 + ", errCode: " + i19 + ", errMsg: " + str + ", type: 5105");
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f240624d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f240625e.f152244b.f152233a;
        java.lang.String str2 = null;
        r45.fv5 fv5Var = fVar != null ? (r45.fv5) fVar : null;
        if (fv5Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGYNetEnd reqKey: ");
            java.util.LinkedList mark_results = fv5Var.f456158d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mark_results, "mark_results");
            r45.ri riVar = (r45.ri) kz5.n0.Z(mark_results);
            if (riVar != null && (linkedList = riVar.f466418h) != null && (qiVar = (r45.qi) kz5.n0.Z(linkedList)) != null) {
                str2 = qiVar.f465542g;
            }
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAiScanImageV2", sb6.toString());
        }
    }
}
