package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes11.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z f254120d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar) {
        this.f254120d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = this.f254120d;
        zVar.f254302m = com.p314xaae8f345.mm.ui.bl.a(zVar.f254295d) + com.p314xaae8f345.mm.ui.bl.h(zVar.f254295d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "[run] mScrollOffset:%d UIUtilsStatusBar:%d WeUIToolHelperStatusBar:%d", java.lang.Integer.valueOf(zVar.f254302m), java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.p(zVar.f254295d)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bl.h(zVar.f254295d)));
    }
}
