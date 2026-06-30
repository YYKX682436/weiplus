package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class w5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f165241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11918x149daf43 f165242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f165243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f165244g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x5 f165245h;

    public w5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x5 x5Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11918x149daf43 c11918x149daf43, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i18) {
        this.f165245h = x5Var;
        this.f165241d = i17;
        this.f165242e = c11918x149daf43;
        this.f165243f = c0Var;
        this.f165244g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        int i17 = this.f165241d;
        sb6.append(i17);
        hashMap.put("type", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11918x149daf43 c11918x149daf43 = this.f165242e;
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, c11918x149daf43.f160052h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetAppConfig", "getAppConfig type:%d,data:\n%s", java.lang.Integer.valueOf(i17), c11918x149daf43.f160052h);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11918x149daf43.f160052h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x5 x5Var = this.f165245h;
        int i18 = this.f165244g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f165243f;
        if (K0) {
            c0Var.a(i18, x5Var.o("fail"));
        } else {
            c0Var.a(i18, x5Var.p("ok", hashMap));
        }
        c11918x149daf43.x();
    }
}
