package j00;

/* loaded from: classes9.dex */
public final class n0 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f378373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f378374f;

    public n0(java.lang.String str, j00.k1 k1Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f378372d = str;
        this.f378373e = k1Var;
        this.f378374f = f9Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, cgi response, giftMsgId: " + this.f378372d + ", errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.MmecGetPresentOrderResp");
            ((ku5.t0) ku5.t0.f394148d).h(new j00.m0(this.f378373e, this.f378374f, (bw5.bf0) fVar), "MicroMsg.EcsGiftMsgService");
        }
        return 0;
    }
}
