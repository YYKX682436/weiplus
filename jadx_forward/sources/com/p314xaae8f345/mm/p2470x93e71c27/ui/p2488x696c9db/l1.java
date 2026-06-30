package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n1 f273289d;

    public l1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n1 n1Var) {
        this.f273289d = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n1 n1Var = this.f273289d;
        boolean z17 = n1Var.f273420h;
        if (z17) {
            n1Var.d();
        } else {
            n1Var.f273420h = true;
            if (n1Var.f273314p != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(n1Var.f273314p);
            }
            p13.u uVar = new p13.u();
            uVar.f432674c = "query_app_msg_file";
            uVar.f432675d = null;
            uVar.f432679h = new int[]{42};
            uVar.f432684m = n1Var;
            uVar.f432685n = n1Var.f273313o;
            uVar.f432673b = 256;
            n1Var.f273314p = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorUI", "do search %s", "query_app_msg_file");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorUI", "[isInit:" + z17 + "] chatting load data end:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", startIndex:" + n1Var.f273421i);
    }
}
