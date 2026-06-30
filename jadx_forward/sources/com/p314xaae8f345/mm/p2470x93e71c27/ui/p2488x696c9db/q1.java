package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public final class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r1 f273382d;

    public q1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r1 r1Var) {
        this.f273382d = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r1 r1Var = this.f273382d;
        boolean z17 = r1Var.f273420h;
        if (z17) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r1.d(r1Var);
        } else {
            r1Var.f273420h = true;
            while (true) {
                if (r1Var.f273418f.size() >= 10) {
                    break;
                }
                if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r1.d(r1Var) <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorUI", "has no data to load，chatting init sync end:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                    break;
                }
            }
        }
        pm0.v.X(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p1(r1Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorUI", "[isInit:" + z17 + "] fav load data end:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", startIndex:" + r1Var.f273421i);
    }
}
