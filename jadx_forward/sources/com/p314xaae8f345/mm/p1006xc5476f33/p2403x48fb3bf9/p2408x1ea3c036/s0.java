package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class s0 extends com.p314xaae8f345.p3210x3857dc.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 f264149a;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var) {
        this.f264149a = e0Var;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public android.view.View a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "getVideoLoadingProgressView");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f264149a;
        if (e0Var.I == null) {
            e0Var.I = new android.widget.ProgressBar(e0Var.f488143d);
            e0Var.I.setIndeterminate(true);
        }
        return e0Var.I;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        this.f264149a.getClass();
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "onHideCustomView, sdk int = " + android.os.Build.VERSION.SDK_INT);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f264149a;
        if (e0Var.H == null) {
            return;
        }
        try {
            e0Var.f263716q.setVisibility(0);
            android.webkit.WebChromeClient.CustomViewCallback customViewCallback = e0Var.G;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
            e0Var.f263719t.setVisibility(0);
            android.widget.FrameLayout frameLayout = e0Var.H;
            if (frameLayout != null) {
                e0Var.f263717r.removeView(frameLayout);
            }
            e0Var.H.removeAllViews();
            e0Var.H = null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageMMWebPage", "onHideCustomView error " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "onReceivedTitle, title = %s", str);
        boolean d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.d(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f264149a;
        if (!d17) {
            if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equalsIgnoreCase("about:blank"))) {
                e0Var.I(str, 0);
            }
        }
        e0Var.f488188i.i();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void p(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f264149a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "onShowCustomView, sdk int = " + android.os.Build.VERSION.SDK_INT);
        try {
            if (e0Var.H != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            e0Var.H = new android.widget.FrameLayout(e0Var.f488143d);
            e0Var.H.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.aak);
            e0Var.H.addView(view);
            e0Var.G = customViewCallback;
            e0Var.f263716q.setVisibility(8);
            e0Var.f263719t.setVisibility(8);
            e0Var.f263717r.addView(e0Var.H);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageMMWebPage", "onShowCustomView error " + e17.getMessage());
        }
    }
}
