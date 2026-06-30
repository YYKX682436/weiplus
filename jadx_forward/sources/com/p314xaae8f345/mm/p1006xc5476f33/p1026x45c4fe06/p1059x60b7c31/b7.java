package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes15.dex */
public class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11921xb466dbaa f161365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c7 f161366e;

    public b7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c7 c7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11921xb466dbaa c11921xb466dbaa) {
        this.f161366e = c7Var;
        this.f161365d = c11921xb466dbaa;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11921xb466dbaa c11921xb466dbaa = this.f161365d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplication", "callback task.success:%b", java.lang.Boolean.valueOf(c11921xb466dbaa.f160069q));
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176.f159896h).remove(c11921xb466dbaa);
        boolean z17 = c11921xb466dbaa.f160069q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c7 c7Var = this.f161366e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d7 d7Var = c7Var.f161693g;
            d7Var.f162272a.a(d7Var.f162273b, d7Var.f162282k.o("ok"));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d7 d7Var2 = c7Var.f161693g;
            d7Var2.f162282k.D(d7Var2.f162274c, ya.b.f77504xbb80cbe3, "");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d7 d7Var3 = c7Var.f161693g;
        d7Var3.f162272a.a(d7Var3.f162273b, d7Var3.f162282k.o("fail:sdk launch fail"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d7 d7Var4 = c7Var.f161693g;
        d7Var4.f162282k.D(d7Var4.f162274c, "fail", "fail:sdk launch fail");
    }
}
