package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes8.dex */
public class dh implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ah f280472d;

    public dh(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ah ahVar) {
        this.f280472d = ahVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Looper.myQueue().removeIdleHandler(this);
        if (this.f280472d.f280113d == null) {
            return false;
        }
        ((os.a) ((ps.e) i95.n0.c(ps.e.class))).getClass();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1022xc56d9687.a.f156187d.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.MessBoxComponent", "now try to activity the tools process");
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        }
        return false;
    }
}
