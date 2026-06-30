package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public final class k4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.l4 f225168a;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.l4 l4Var) {
        this.f225168a = l4Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.l4 l4Var = this.f225168a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = l4Var.f225189g;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        if (fVar == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiOpenWeRun", "invoke() called errType:" + fVar.f152148a + " errCode:" + fVar.f152149b);
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            l4Var.f224976f.d(false);
            return fVar;
        }
        l4Var.f224976f.a("fail");
        return fVar;
    }
}
