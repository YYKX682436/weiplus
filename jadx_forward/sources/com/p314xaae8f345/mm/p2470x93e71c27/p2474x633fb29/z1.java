package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes9.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z1 f271040a = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z1();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f271041b;

    static {
        f271041b = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20248x9ad5dc65()) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r8, r45.gp0 r9) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z1.a(com.tencent.mm.storage.f9, r45.gp0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r8, r45.gp0 r9) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.z1.b(com.tencent.mm.storage.f9, r45.gp0):void");
    }

    public final void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r45.gp0 dataItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        if (f271041b && f9Var != null) {
            java.lang.String str = dataItem.V;
            if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FillFavMsgHelper", "fillFavVoice data not exist:" + str);
            }
            java.lang.String r17 = c01.w9.r(f9Var.S1());
            if (r17 == null) {
                return;
            }
            z15.b bVar = new z15.b();
            bVar.m126728xdc93280d(r17);
            dataItem.b0(bVar.n());
            dataItem.a0(bVar.m178310x10626226());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FillFavMsgHelper", "fillFavVoice, dataItem tpthumburl:" + dataItem.f456938d2 + ", tpdataurl:" + dataItem.f456944g2 + ", cdnDataUrl:" + dataItem.f456967s + ", cdnThumbUrl:" + dataItem.f456945h);
            java.lang.String str2 = dataItem.f456967s;
            if (str2 == null || r26.n0.N(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FillFavMsgHelper", "fillFavVoice, xml:" + r17 + ", msgInfo.dbContent:" + f9Var.S1());
            }
        }
    }
}
