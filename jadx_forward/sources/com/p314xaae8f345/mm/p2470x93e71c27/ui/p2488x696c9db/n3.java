package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes5.dex */
public final class n3 implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f273322d;

    public n3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f) {
        this.f273322d = activityC19730xa7b9756f;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
        java.lang.Object obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorUI", "onTabReselected() called with: tab = " + iVar);
        if (iVar == null || (obj = iVar.f425311a) == null || !(obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j7)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorUI", "onTabReselected " + obj);
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        java.lang.Object obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorUI", "onTabUnselected() called with: tab = " + iVar);
        if (iVar == null || (obj = iVar.f425311a) == null || !(obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j7)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorUI", "onTabUnselected " + obj);
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j7) obj).a(false);
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        java.lang.Object obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorUI", "onTabSelected() called with: tab = " + iVar);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o1 o1Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f.I;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = this.f273322d;
        activityC19730xa7b9756f.getClass();
        if (iVar == null || (obj = iVar.f425311a) == null || !(obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j7)) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleTabSelected item ");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j7 j7Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j7) obj;
        int i17 = j7Var.f273271c;
        sb6.append(i17);
        sb6.append(" selected");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorUI", sb6.toString());
        j7Var.a(false);
        if (i17 == 4) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Zi(145, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s2(obj, iVar, activityC19730xa7b9756f, i17), "android.permission.READ_EXTERNAL_STORAGE");
            return;
        }
        j7Var.a(true);
        iVar.b();
        activityC19730xa7b9756f.j7(i17);
    }
}
