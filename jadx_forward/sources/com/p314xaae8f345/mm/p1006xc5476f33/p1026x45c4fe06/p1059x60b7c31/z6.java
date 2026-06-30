package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes15.dex */
public class z6 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c7 f165485a;

    public z6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c7 c7Var) {
        this.f165485a = c7Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g7
    public void a(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplication", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c7 c7Var = this.f165485a;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d7 d7Var = c7Var.f161693g;
            d7Var.f162272a.a(d7Var.f162273b, d7Var.f162282k.o("ok"));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d7 d7Var2 = c7Var.f161693g;
            d7Var2.f162282k.D(d7Var2.f162274c, ya.b.f77504xbb80cbe3, "");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d7 d7Var3 = c7Var.f161693g;
        d7Var3.f162272a.a(d7Var3.f162273b, d7Var3.f162282k.o("fail:scheme launch fail"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d7 d7Var4 = c7Var.f161693g;
        d7Var4.f162282k.D(d7Var4.f162274c, "fail", "fail:scheme launch fail");
    }
}
