package i64;

/* loaded from: classes4.dex */
public class m0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f370768d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f370769e;

    /* renamed from: f, reason: collision with root package name */
    public final int f370770f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x028e A[Catch: all -> 0x044a, TryCatch #2 {all -> 0x044a, blocks: (B:43:0x0287, B:45:0x028e, B:46:0x029a, B:49:0x030f, B:52:0x0321, B:55:0x03b0, B:58:0x03c9, B:61:0x0410, B:72:0x040c, B:73:0x03c3, B:74:0x03aa, B:75:0x031e, B:76:0x030c, B:77:0x0294), top: B:42:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x040c A[Catch: all -> 0x044a, TryCatch #2 {all -> 0x044a, blocks: (B:43:0x0287, B:45:0x028e, B:46:0x029a, B:49:0x030f, B:52:0x0321, B:55:0x03b0, B:58:0x03c9, B:61:0x0410, B:72:0x040c, B:73:0x03c3, B:74:0x03aa, B:75:0x031e, B:76:0x030c, B:77:0x0294), top: B:42:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03c3 A[Catch: all -> 0x044a, TryCatch #2 {all -> 0x044a, blocks: (B:43:0x0287, B:45:0x028e, B:46:0x029a, B:49:0x030f, B:52:0x0321, B:55:0x03b0, B:58:0x03c9, B:61:0x0410, B:72:0x040c, B:73:0x03c3, B:74:0x03aa, B:75:0x031e, B:76:0x030c, B:77:0x0294), top: B:42:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03aa A[Catch: all -> 0x044a, TryCatch #2 {all -> 0x044a, blocks: (B:43:0x0287, B:45:0x028e, B:46:0x029a, B:49:0x030f, B:52:0x0321, B:55:0x03b0, B:58:0x03c9, B:61:0x0410, B:72:0x040c, B:73:0x03c3, B:74:0x03aa, B:75:0x031e, B:76:0x030c, B:77:0x0294), top: B:42:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x031e A[Catch: all -> 0x044a, TryCatch #2 {all -> 0x044a, blocks: (B:43:0x0287, B:45:0x028e, B:46:0x029a, B:49:0x030f, B:52:0x0321, B:55:0x03b0, B:58:0x03c9, B:61:0x0410, B:72:0x040c, B:73:0x03c3, B:74:0x03aa, B:75:0x031e, B:76:0x030c, B:77:0x0294), top: B:42:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x030c A[Catch: all -> 0x044a, TryCatch #2 {all -> 0x044a, blocks: (B:43:0x0287, B:45:0x028e, B:46:0x029a, B:49:0x030f, B:52:0x0321, B:55:0x03b0, B:58:0x03c9, B:61:0x0410, B:72:0x040c, B:73:0x03c3, B:74:0x03aa, B:75:0x031e, B:76:0x030c, B:77:0x0294), top: B:42:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0294 A[Catch: all -> 0x044a, TryCatch #2 {all -> 0x044a, blocks: (B:43:0x0287, B:45:0x028e, B:46:0x029a, B:49:0x030f, B:52:0x0321, B:55:0x03b0, B:58:0x03c9, B:61:0x0410, B:72:0x040c, B:73:0x03c3, B:74:0x03aa, B:75:0x031e, B:76:0x030c, B:77:0x0294), top: B:42:0x0287 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m0(java.lang.String r22, int r23, int r24, int r25, r45.e3 r26, r45.h3 r27, int r28, java.lang.String r29, int r30, int r31, int r32, int r33, int r34, com.p314xaae8f345.mm.p2495xc50a8b8b.g r35, com.p314xaae8f345.mm.p2495xc50a8b8b.g r36, java.lang.String r37, i64.w r38) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i64.m0.<init>(java.lang.String, int, int, int, r45.e3, r45.h3, int, java.lang.String, int, int, int, int, int, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, java.lang.String, i64.w):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
        this.f370769e = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f370768d, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
        return 1231;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
        int i27 = this.f370770f;
        if (i18 != 0 || i19 != 0) {
            if (i27 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2044, 2);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2044, 4);
            }
        }
        r45.g3 g3Var = (r45.g3) this.f370768d.f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAdExposure", "netId=" + i17 + ", errType=" + i18 + ", errCode=" + i19 + ", errMsg=" + str + ", reportExposureType=" + i27 + ", resp=" + g3Var.f456380d + ", msg=" + g3Var.f456381e);
        this.f370769e.mo815x76e0bfae(i18, i19, str, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneAdExposure");
    }
}
