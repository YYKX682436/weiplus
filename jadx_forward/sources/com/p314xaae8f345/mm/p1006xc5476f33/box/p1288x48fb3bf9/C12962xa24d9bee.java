package com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9;

/* renamed from: com.tencent.mm.plugin.box.webview.BoxWebView */
/* loaded from: classes8.dex */
public class C12962xa24d9bee extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 {
    public android.content.Context G;

    public C12962xa24d9bee(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = context;
        I0();
    }

    public final void I0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Flight.FlightWebView", "init FlightWebView");
        if (fp.h.c(19)) {
            return;
        }
        try {
            java.lang.Object a17 = new yo.b(new yo.b(new yo.b(new yo.b(new yo.b(new yo.b(this, "mSysWebView", null).a(), "mProvider", null).a(), "mWebViewCore", null).a(), "sWebCoreHandler", null).a(), "mLooper", null).a(), "mThread", null).a();
            if (a17 instanceof java.lang.Thread) {
                java.lang.Thread thread = (java.lang.Thread) a17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Flight.FlightWebView", "tryInterruptAwaitingWebCoreThread, webCoreThread.getState = %s", thread.getState());
                if (thread.getState() == java.lang.Thread.State.WAITING) {
                    thread.interrupt();
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Flight.FlightWebView", "tryInterruptAwaitingWebCoreThread, exception = %s", e17);
        }
    }

    public void J0(xq1.a aVar, xq1.c cVar) {
        mo120153xd15cf999().z(true);
        mo120153xd15cf999().E(true);
        mo120153xd15cf999().r(false);
        mo120153xd15cf999().I(true);
        mo120153xd15cf999().J(0);
        mo120153xd15cf999().Q(ik1.l0.a(getContext(), mo120153xd15cf999().g(), (ik1.k0) nd.f.a(ik1.k0.class)));
        mo120153xd15cf999().P(true);
        mo120153xd15cf999().G(true);
        mo120153xd15cf999().M(false);
        mo120153xd15cf999().L(false);
        mo120153xd15cf999().C(true);
        mo120153xd15cf999().D(true);
        mo120153xd15cf999().J(0);
        mo120153xd15cf999().l(10485760L);
        mo120153xd15cf999().m(this.G.getDir("webviewcache", 0).getAbsolutePath());
        mo120153xd15cf999().k(true);
        mo120153xd15cf999().t(true);
        mo120153xd15cf999().u(lp0.b.X() + "databases/");
        mo120153xd15cf999().h(true);
        com.p314xaae8f345.p3210x3857dc.d.g().d(true);
        com.p314xaae8f345.p3210x3857dc.d.g().f(this, true);
        mo120158xfb86a31b().setHorizontalScrollBarEnabled(false);
        mo120158xfb86a31b().setVerticalScrollBarEnabled(true);
        m54296xeed5daa9((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window"));
        if (aVar != null) {
            super.mo81410x6fd49b97(aVar);
        }
        if (cVar != null) {
            super.mo74800x23d27c02(cVar);
        }
        setBackgroundColor(-1);
        G0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: destroy */
    public void mo52095x5cd39ffa() {
        this.G = null;
        super.mo81410x6fd49b97(null);
        super.mo74800x23d27c02(null);
        super.mo52095x5cd39ffa();
    }

    /* renamed from: setConfigCallback */
    public void m54296xeed5daa9(android.view.WindowManager windowManager) {
        try {
            java.lang.reflect.Field declaredField = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.class.getDeclaredField("mWebViewCore").getType().getDeclaredField("mBrowserFrame").getType().getDeclaredField("sConfigCallback");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(null);
            if (obj == null) {
                return;
            }
            java.lang.reflect.Field declaredField2 = declaredField.getType().getDeclaredField("mWindowManager");
            declaredField2.setAccessible(true);
            declaredField2.set(obj, windowManager);
        } catch (java.lang.Exception unused) {
        }
    }

    public C12962xa24d9bee(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = context;
        I0();
    }

    public C12962xa24d9bee(android.content.Context context) {
        super(context, null);
        this.G = context;
        I0();
    }
}
