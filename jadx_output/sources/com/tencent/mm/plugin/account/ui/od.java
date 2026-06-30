package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class od implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f74095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.qd f74096e;

    public od(com.tencent.mm.plugin.account.ui.qd qdVar, com.tencent.mm.modelbase.m1 m1Var) {
        this.f74096e = qdVar;
        this.f74095d = m1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.account.ui.qd qdVar = this.f74096e;
        d17.a(701, qdVar);
        gm0.j1.d().a(252, qdVar);
        com.tencent.mm.plugin.account.ui.nd ndVar = new com.tencent.mm.plugin.account.ui.nd(this);
        com.tencent.mm.modelbase.m1 m1Var = this.f74095d;
        java.lang.String Q = ((h11.e) m1Var).Q();
        java.lang.String P = ((h11.e) m1Var).P();
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI = qdVar.f74139d;
        qdVar.f74141f = new com.tencent.mm.plugin.account.ui.fa(ndVar, Q, P, mobileVerifyUI.f73528h);
        qdVar.f74141f.b(mobileVerifyUI);
        com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct thirdAppRegisterStruct = qdVar.f74143h;
        thirdAppRegisterStruct.f61234d = qdVar.f74139d.A;
        thirdAppRegisterStruct.f61235e = 8L;
        thirdAppRegisterStruct.k();
    }
}
