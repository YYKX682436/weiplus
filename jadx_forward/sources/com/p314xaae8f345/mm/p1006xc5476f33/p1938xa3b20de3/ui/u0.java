package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class u0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wo3.z f234259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 f234260b;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 a1Var, wo3.z zVar) {
        this.f234260b = a1Var;
        this.f234259a = zVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m8
    public void a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc178, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.a1 a1Var = this.f234260b;
        android.app.Activity activity = a1Var.f234110a;
        if (activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).mo48674x36654fab();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.e eVar = a1Var.f234111b;
        if (eVar != null) {
            wo3.z zVar = this.f234259a;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38) eVar).Y6(1, zVar.f529771f, str, zVar.f529773h);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineLogicMgr", "launchPwdDialog do pay");
    }
}
