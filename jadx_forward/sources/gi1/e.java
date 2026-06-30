package gi1;

/* loaded from: classes9.dex */
public final class e implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o5 f353772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f353774f;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o5 o5Var, java.lang.String str, int i17) {
        this.f353772d = o5Var;
        this.f353773e = str;
        this.f353774f = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2 = this.f353773e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o5 o5Var = this.f353772d;
        int i19 = this.f353774f;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiWxaRuntimeSetVoipCallSubIdStatus", "onResp, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            if (o5Var != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wi) o5Var).a(str2, i19, false);
            }
            return 0;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WxaRuntimeSetVoipCallSubIdStatusReq");
        r45.ve7 ve7Var = (r45.ve7) fVar;
        if (o5Var != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wi) o5Var).a(ve7Var.f469712d, i19, true);
        }
        gi1.n.a(str2, i19);
        return 0;
    }
}
