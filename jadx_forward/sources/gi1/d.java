package gi1;

/* loaded from: classes9.dex */
public final class d implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n5 f353770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353771e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n5 n5Var, java.lang.String str) {
        this.f353770d = n5Var;
        this.f353771e = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2 = this.f353771e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.n5 n5Var = this.f353770d;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiWxaRuntimeGetVoipCallSubIdStatus", "onResp, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            if (n5Var != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vi) n5Var).a(str2, -1, false);
            }
            return 0;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WxaRuntimeGetVoipCallSubIdStatusReq");
        r45.se7 se7Var = (r45.se7) fVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WxaRuntimeGetVoipCallSubIdStatusResp");
        r45.te7 te7Var = (r45.te7) fVar2;
        if (n5Var != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vi) n5Var).a(se7Var.f467194d, te7Var.f467897d, true);
        }
        gi1.n.a(str2, te7Var.f467897d);
        return 0;
    }
}
