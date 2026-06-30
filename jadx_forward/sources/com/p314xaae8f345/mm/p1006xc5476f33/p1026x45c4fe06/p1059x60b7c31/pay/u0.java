package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f164212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x0 f164214f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x0 x0Var) {
        super(0);
        this.f164212d = d0Var;
        this.f164213e = str;
        this.f164214f = x0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f164212d;
        if (d0Var.mo48798x74292566() != null && ((d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(d0Var.mo48798x74292566())) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.CLOSE || d17 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.BACK)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str = this.f164213e;
            sb6.append(str);
            sb6.append(" onBackground stopListen");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReportCrossPlatformPay", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.x0.C(this.f164214f, d0Var, str);
        }
        return jz5.f0.f384359a;
    }
}
