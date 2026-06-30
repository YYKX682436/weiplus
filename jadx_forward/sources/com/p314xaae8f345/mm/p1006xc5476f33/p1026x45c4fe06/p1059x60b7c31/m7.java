package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes15.dex */
public class m7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11924x1ce6280 f163134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n7 f163135e;

    public m7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n7 n7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11924x1ce6280 c11924x1ce6280) {
        this.f163135e = n7Var;
        this.f163134d = c11924x1ce6280;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11924x1ce6280 c11924x1ce6280 = this.f163134d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "callback task.success:%b", java.lang.Boolean.valueOf(c11924x1ce6280.f160094q));
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176.f159896h).remove(c11924x1ce6280);
        boolean z17 = c11924x1ce6280.f160094q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n7 n7Var = this.f163135e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o7 o7Var = n7Var.f163913g;
            o7Var.f163981a.a(o7Var.f163982b, o7Var.f163993m.o("ok"));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o7 o7Var2 = n7Var.f163913g;
            o7Var2.f163993m.E(o7Var2.f163990j, ya.b.f77504xbb80cbe3, "");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o7 o7Var3 = n7Var.f163913g;
        o7Var3.f163981a.a(o7Var3.f163982b, o7Var3.f163993m.o("fail:sdk launch fail"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o7 o7Var4 = n7Var.f163913g;
        o7Var4.f163993m.E(o7Var4.f163990j, "fail", "fail:sdk launch fail");
    }
}
