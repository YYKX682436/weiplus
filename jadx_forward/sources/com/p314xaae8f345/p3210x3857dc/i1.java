package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public class i1 extends android.content.MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public tx5.f f301833a;

    @Override // android.content.MutableContextWrapper
    public void setBaseContext(android.content.Context context) {
        tx5.i c17;
        tx5.h g17;
        java.lang.Object m120341x12c9c67f;
        super.setBaseContext(context);
        by5.c4.f("WebViewContextWrapper", "setBaseContext, context:" + context + ", webViewType:" + com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de());
        tx5.f fVar = this.f301833a;
        if (!(fVar instanceof vx5.i0) || (c17 = tx5.j.c(com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS)) == null || (g17 = c17.g()) == null) {
            return;
        }
        vx5.h0 h0Var = ((vx5.i0) fVar).f522888f;
        if (h0Var == null) {
            by5.c4.c("PinusWebView", "getPinusBridge, mWebview is null");
            m120341x12c9c67f = null;
        } else {
            m120341x12c9c67f = h0Var.m120341x12c9c67f();
        }
        g17.mo120205xb04520a3(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54070x4810c209, new java.lang.Object[]{m120341x12c9c67f});
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unbindService(android.content.ServiceConnection serviceConnection) {
        try {
            super.unbindService(serviceConnection);
        } catch (java.lang.IllegalArgumentException e17) {
            by5.c4.c("WebViewContextWrapper", "XWebContextWrapper unbindService IllegalArgumentException:" + e17);
        }
    }
}
