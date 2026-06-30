package p10;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 f432487d;

    public h(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3) {
        this.f432487d = c10541x905158a3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3 = this.f432487d;
        if (c10541x905158a3.f147348e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicDebugPanelView", "auto profile timeout (60000ms), force stop");
            c10541x905158a3.d();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicDebugPanelView", "auto profile timeout but already stopped, skip");
        }
        c10541x905158a3.f147350g = null;
    }
}
