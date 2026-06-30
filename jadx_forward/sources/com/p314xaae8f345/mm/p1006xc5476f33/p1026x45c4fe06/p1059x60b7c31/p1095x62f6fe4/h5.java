package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class h5 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f163367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i5 f163368c;

    public h5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i5 i5Var) {
        this.f163366a = lVar;
        this.f163367b = i17;
        this.f163368c = i5Var;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        boolean z17 = obj instanceof java.lang.Exception;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i5 i5Var = this.f163368c;
        int i17 = this.f163367b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f163366a;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiChooseVideoNew", "choose pipeline onInterrupt(" + obj + ')');
            lVar.a(i17, i5Var.o("fail:internal error"));
            return;
        }
        java.lang.String message = ((java.lang.Exception) obj).getMessage();
        if (message == null) {
            message = "";
        }
        if (!r26.i0.y(message, "fail", false)) {
            message = "fail ".concat(message);
        }
        lVar.a(i17, i5Var.o(message));
    }
}
