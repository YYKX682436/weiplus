package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class n1 implements qk.i6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 f230905d;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var) {
        this.f230905d = a2Var;
    }

    @Override // qk.i6
    public void m5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoEditor", "photoEditor onExit");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var = this.f230905d;
        a2Var.e();
        if (a2Var.f230813p != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a1(this));
        }
    }

    @Override // qk.i6
    /* renamed from: onFinish */
    public void mo60944x42fe6352() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoEditor", "photoEditor onFinish");
        this.f230905d.f230808k.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z0(this), true);
    }
}
