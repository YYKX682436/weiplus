package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* loaded from: classes15.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11970x4f4ad5f2 f160512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.z0 f160513e;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.z0 z0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11970x4f4ad5f2 c11970x4f4ad5f2) {
        this.f160513e = z0Var;
        this.f160512d = c11970x4f4ad5f2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11970x4f4ad5f2 c11970x4f4ad5f2 = this.f160512d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "callback task.success:%b", java.lang.Boolean.valueOf(c11970x4f4ad5f2.f160417q));
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176.f159896h).remove(c11970x4f4ad5f2);
        boolean z17 = c11970x4f4ad5f2.f160417q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.z0 z0Var = this.f160513e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.a1 a1Var = z0Var.f160517g;
            a1Var.f160463a.a(a1Var.f160464b, a1Var.f160472j.o("ok"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.a1 a1Var2 = z0Var.f160517g;
        a1Var2.f160463a.a(a1Var2.f160464b, a1Var2.f160472j.o("fail:sdk launch fail"));
    }
}
