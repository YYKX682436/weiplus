package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class fk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk f280591d;

    public fk(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk jkVar) {
        this.f280591d = jkVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk jkVar = this.f280591d;
        if (jkVar.f280841v) {
            return;
        }
        jkVar.f280841v = true;
        jkVar.f280832m = -1L;
        yb5.d dVar = jkVar.f280113d;
        if (dVar != null) {
            dVar.J();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SearchComponent", "dismiss fts highlight");
    }
}
