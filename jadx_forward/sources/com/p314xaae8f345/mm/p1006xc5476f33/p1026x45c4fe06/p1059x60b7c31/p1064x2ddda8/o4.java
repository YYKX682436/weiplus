package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class o4 implements ui1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km5.b f161205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161206c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u4 f161207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161208e;

    public o4(int i17, km5.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u4 u4Var, java.lang.String str) {
        this.f161204a = i17;
        this.f161205b = bVar;
        this.f161206c = yVar;
        this.f161207d = u4Var;
        this.f161208e = str;
    }

    @Override // ui1.y
    public void a(int i17, java.util.ArrayList resultData, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultData, "resultData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.JsApiOperateWXDataLU", "dialog onMsg, resultCode[" + i17 + "], callbackId[" + this.f161204a + ']');
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.r.f161233a;
        java.lang.String str = this.f161208e;
        km5.b bVar = this.f161205b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u4 u4Var = this.f161207d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f161206c;
        if (i17 == 1) {
            r45.m24 J2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u4.J(yVar, u4Var, str);
            J2.f461625g = 1;
            J2.f461624f = (java.lang.String) kz5.n0.Z(resultData);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w.f161297q0;
            u4Var.i(bVar, rVar.b(yVar, "/cgi-bin/mmbiz-bin/js-operatewxdata", J2, r45.n24.class));
            return;
        }
        if (i17 != 2) {
            bVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p("fail:auth canceled"));
            return;
        }
        bVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p("fail:auth denied"));
        r45.m24 J3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u4.J(yVar, u4Var, str);
        J3.f461625g = 2;
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w.f161297q0;
        rVar.b(yVar, "/cgi-bin/mmbiz-bin/js-operatewxdata", J3, r45.n24.class);
    }
}
