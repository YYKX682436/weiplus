package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ld implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f74013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h11.e f74014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.qd f74015f;

    public ld(com.tencent.mm.plugin.account.ui.qd qdVar, com.tencent.mm.modelbase.m1 m1Var, h11.e eVar) {
        this.f74015f = qdVar;
        this.f74013d = m1Var;
        this.f74014e = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.account.ui.qd qdVar = this.f74015f;
        d17.a(701, qdVar);
        gm0.j1.d().a(252, qdVar);
        com.tencent.mm.plugin.account.ui.kd kdVar = new com.tencent.mm.plugin.account.ui.kd(this);
        java.lang.String Q = ((h11.e) this.f74013d).Q();
        java.lang.String P = this.f74014e.P();
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI = qdVar.f74139d;
        qdVar.f74141f = new com.tencent.mm.plugin.account.ui.fa(kdVar, Q, P, mobileVerifyUI.f73528h);
        qdVar.f74141f.b(mobileVerifyUI);
        com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct thirdAppRegisterStruct = qdVar.f74143h;
        thirdAppRegisterStruct.f61234d = qdVar.f74139d.A;
        thirdAppRegisterStruct.f61235e = 8L;
        thirdAppRegisterStruct.k();
    }
}
