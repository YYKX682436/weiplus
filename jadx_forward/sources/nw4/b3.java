package nw4;

/* loaded from: classes8.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public nw4.n f422337a;

    @android.webkit.JavascriptInterface
    /* renamed from: getContentFromWebpage */
    public final void m150187x7ace5096(java.lang.String str) {
        nw4.n nVar = this.f422337a;
        if ((nVar != null ? nVar.s() : null) != null) {
            nw4.n nVar2 = this.f422337a;
            android.content.Context s17 = nVar2 != null ? nVar2.s() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s17);
            java.lang.Object obj = (android.content.Context) new java.lang.ref.WeakReference(s17).get();
            if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.w0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebTransApi", "getContentFromWebpage");
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.w0 w0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.w0) obj;
                if (str == null) {
                    str = "";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) w0Var;
                viewOnCreateContextMenuListenerC19337x37f3384d.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "getTransText");
                viewOnCreateContextMenuListenerC19337x37f3384d.f265399w2.f267189g.b(str);
            }
        }
    }
}
