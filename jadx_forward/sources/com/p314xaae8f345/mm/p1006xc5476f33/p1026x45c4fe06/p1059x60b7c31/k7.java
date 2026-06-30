package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes15.dex */
public class k7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n7 f162880a;

    public k7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n7 n7Var) {
        this.f162880a = n7Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v7
    public void a(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n7 n7Var = this.f162880a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o7 o7Var = n7Var.f163913g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x7 x7Var = o7Var.f163993m;
        x7Var.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p7(x7Var, o7Var.f163981a));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o7 o7Var2 = n7Var.f163913g;
        if (z17) {
            o7Var2.f163981a.a(o7Var2.f163982b, o7Var2.f163993m.o("ok"));
            o7Var2.f163993m.E(o7Var2.f163990j, ya.b.f77504xbb80cbe3, "");
            return;
        }
        o7Var2.f163981a.a(o7Var2.f163982b, o7Var2.f163993m.o("fail:scheme launch fail"));
        o7Var2.f163993m.E(o7Var2.f163990j, "fail", "fail:scheme launch fail");
    }
}
