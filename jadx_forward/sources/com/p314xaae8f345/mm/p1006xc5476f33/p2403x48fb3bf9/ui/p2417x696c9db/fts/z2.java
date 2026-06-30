package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes15.dex */
public final class z2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 f266272d;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 j3Var) {
        this.f266272d = j3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 j3Var = this.f266272d;
        z21.e eVar = j3Var.A;
        if (eVar == null) {
            return true;
        }
        int mo48281x67ad3875 = eVar != null ? eVar.mo48281x67ad3875() : 0;
        com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d = j3Var.f265997n;
        if (c21330xc127fb4d != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21330xc127fb4d);
            if (c21330xc127fb4d.getVisibility() == 0) {
                com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d2 = j3Var.f265997n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21330xc127fb4d2);
                c21330xc127fb4d2.i(mo48281x67ad3875);
            }
        }
        return true;
    }
}
