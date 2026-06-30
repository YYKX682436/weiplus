package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

@j95.b
/* loaded from: classes12.dex */
public final class d3 extends i95.w implements ct.w2 {
    public void Ai(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, java.lang.String fileExt, int i17, java.lang.String dataId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileExt, "fileExt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataId, "dataId");
        v05.b bVar = new v05.b();
        java.lang.String U1 = msgInfo.U1();
        if (U1 == null) {
            U1 = "";
        }
        bVar.m126728xdc93280d(U1);
        boolean z17 = !r26.n0.N(dataId);
        long j17 = 0;
        int i18 = bVar.f513848e;
        if (z17) {
            r45.gp0 n17 = bt3.g2.n(bVar.m75945x2fec8307(i18 + 44), dataId);
            if (n17 != null) {
                j17 = n17.R;
            }
        } else {
            v05.a aVar = (v05.a) bVar.m75936x14adae67(i18 + 8);
            if (aVar != null) {
                j17 = aVar.m75942xfb822ef2(aVar.f449897d + 0);
            }
        }
        com.p314xaae8f345.mm.ui.p2731xc84c5534.o oVar = new com.p314xaae8f345.mm.ui.p2731xc84c5534.o(msgInfo, fileExt, dataId, j17);
        com.p314xaae8f345.mm.ui.p2731xc84c5534.j.f291206e.getClass();
        com.p314xaae8f345.mm.ui.p2731xc84c5534.j jVar = (com.p314xaae8f345.mm.ui.p2731xc84c5534.j) ((java.util.LinkedHashMap) com.p314xaae8f345.mm.ui.p2731xc84c5534.j.f291207f).get(java.lang.Integer.valueOf(i17));
        if (jVar == null) {
            jVar = com.p314xaae8f345.mm.ui.p2731xc84c5534.j.f291208g;
        }
        oVar.f291249k = jVar;
        com.p314xaae8f345.mm.ui.p2731xc84c5534.d0.f291159a.d(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291255g, oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Bi(android.content.Context r14, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r15, java.lang.String r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d3.Bi(android.content.Context, com.tencent.mm.storage.f9, java.lang.String, java.lang.String):boolean");
    }

    public int wi(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = ");
        sb6.append(z17);
        sb6.append(", stack = ");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        return 101;
    }
}
