package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.a f254088d = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.a();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "received CommonUsedWeAppOnStorageChangeListener");
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_comm_use_new, 0) == 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "not support load common used data");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "ljd begin reloadData");
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b.f254094d;
        if (weakReference != null && (o2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2) weakReference.get()) != null) {
            o2Var.d(true, 7);
        }
        java.lang.ref.WeakReference weakReference2 = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b.f254094d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var2 = weakReference2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2) weakReference2.get() : null;
        if (o2Var2 != null) {
            o2Var2.f254197j = java.lang.System.currentTimeMillis();
        }
        java.lang.ref.WeakReference weakReference3 = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b.f254094d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var3 = weakReference3 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2) weakReference3.get() : null;
        if (o2Var3 != null) {
            o2Var3.f254200m = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "ljd end reloadData");
    }
}
