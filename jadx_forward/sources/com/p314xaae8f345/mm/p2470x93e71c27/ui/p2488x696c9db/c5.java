package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class c5 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f273076a;

    public c5(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f273076a = new java.lang.ref.WeakReference(k0Var);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e5
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19732x78a3bb7f activityC19732x78a3bb7f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) this.f273076a.get();
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniQBReaderUI", "tryEnhanceBottomSheet#run, bottomSheet is null");
            return;
        }
        zh1.p pVar = (zh1.p) k5Var;
        if (!pVar.Zi(k0Var, c12473xe2bfc4b5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniQBReaderUI", "tryEnhanceBottomSheet#run, not need enhance");
            return;
        }
        zh1.z0 z0Var = activityC19732x78a3bb7f.N;
        if (z0Var != null) {
            z0Var.mo10668x2efc64();
        }
        activityC19732x78a3bb7f.N = pVar.Ai(bi1.g.ATTACH, activityC19732x78a3bb7f, k0Var, c12473xe2bfc4b5, null, null);
    }
}
