package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 f158294d;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var) {
        this.f158294d = j3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f158294d.f159985d) {
            return;
        }
        if (this.f158294d.f159988g == null) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.a(this.f158294d.f159983b).E = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.CreateOnRuntimeInit;
            } catch (java.lang.Exception unused) {
            }
        }
        this.f158294d.h("countDown == 0, notify process ready", new java.lang.Object[0]);
        this.f158294d.d();
    }
}
