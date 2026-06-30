package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class d5 implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f273106a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 f273107b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 f273108c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e5 f273109d;

    public d5(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19732x78a3bb7f activityC19732x78a3bb7f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e5 e5Var) {
        this.f273106a = new java.lang.ref.WeakReference(activityC19732x78a3bb7f);
        this.f273107b = c12476xea20f622;
        this.f273108c = k5Var;
        this.f273109d = e5Var;
    }

    @Override // zh1.a1
    public void a(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19732x78a3bb7f activityC19732x78a3bb7f = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19732x78a3bb7f) this.f273106a.get();
        if (activityC19732x78a3bb7f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniQBReaderUI", "doSomeOpenMaterialTask#onMyOpenMaterialsGo, ui is null");
        } else {
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniQBReaderUI", "doSomeOpenMaterialTask#onMyOpenMaterialsGot, fail");
                return;
            }
            activityC19732x78a3bb7f.K = this.f273107b.f167804f;
            activityC19732x78a3bb7f.L = c12473xe2bfc4b5;
            this.f273109d.a(activityC19732x78a3bb7f, this.f273108c, c12473xe2bfc4b5);
        }
    }
}
