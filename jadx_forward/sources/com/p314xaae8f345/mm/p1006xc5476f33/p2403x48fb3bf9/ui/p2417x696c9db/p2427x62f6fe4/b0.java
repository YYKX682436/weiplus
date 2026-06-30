package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes8.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c f267277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f267278e;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c, android.view.ViewGroup.LayoutParams layoutParams) {
        this.f267277d = viewOnClickListenerC19428xb021cc2c;
        this.f267278e = layoutParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267277d;
        android.content.Context context = viewOnClickListenerC19428xb021cc2c.getContext();
        if ((context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) && ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).f265348f != null) {
            android.content.Context context2 = viewOnClickListenerC19428xb021cc2c.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context2).f265348f.m();
        }
        viewOnClickListenerC19428xb021cc2c.f267241e.setLayoutParams(this.f267278e);
    }
}
