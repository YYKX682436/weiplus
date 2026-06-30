package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class s2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f266145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f266146e;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v2 v2Var, java.util.List list, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f266145d = list;
        this.f266146e = k0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        int i17 = 0;
        while (true) {
            java.util.List list = this.f266145d;
            if (i17 >= list.size()) {
                return;
            }
            su4.i2 i2Var = (su4.i2) list.get(i17);
            g4Var.p(i17, i2Var.f494465b, i2Var.f494466c, 0);
            if (i2Var.f494467d) {
                this.f266146e.f293384a2 = i17;
            }
            i17++;
        }
    }
}
