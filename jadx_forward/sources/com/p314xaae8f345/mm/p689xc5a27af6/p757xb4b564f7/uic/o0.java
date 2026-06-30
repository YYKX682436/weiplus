package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class o0 extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgAppBrandPreProcessForOpenMaterialUIC", "dispatch collection:" + c12473xe2bfc4b5);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eb0.b(c12473xe2bfc4b5, null, null, true));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        hb0.a aVar;
        j75.f Q6 = Q6();
        if (Q6 == null || (aVar = (hb0.a) Q6.mo140437x75286adb()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5 = null;
        if (aVar.f361550m == null) {
            T6(null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5.class);
        if (k5Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622 = aVar.f361550m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12476xea20f622);
            c12473xe2bfc4b5 = ((zh1.p) k5Var).Ri(c12476xea20f622);
        }
        T6(c12473xe2bfc4b5);
    }
}
