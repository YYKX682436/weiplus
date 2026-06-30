package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public class v1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f164218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vd1.g f164220c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1 f164222e;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1 y1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17, vd1.g gVar, java.lang.String str) {
        this.f164222e = y1Var;
        this.f164218a = d0Var;
        this.f164219b = i17;
        this.f164220c = gVar;
        this.f164221d = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.h
    public void a(int i17, int i18, java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        vd1.g gVar;
        if (i17 == 1) {
            str2 = "ok";
        } else if (i17 != 2) {
            str2 = "fail cancel";
        } else {
            str2 = "fail:" + str;
        }
        java.lang.String p17 = this.f164222e.p(str2, map);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestPayment", "onPayResult result:%d, callbackStr:%s", java.lang.Integer.valueOf(i17), p17);
        int i19 = this.f164219b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f164218a;
        d0Var.a(i19, p17);
        if (i17 == 1 || (gVar = this.f164220c) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.u0.a(gVar, d0Var.mo48798x74292566(), p17);
    }
}
