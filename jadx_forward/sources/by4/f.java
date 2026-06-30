package by4;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f117920a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d webviewUI) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webviewUI, "webviewUI");
        this.f117920a = webviewUI;
    }

    public final void a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 viewWV, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewWV, "viewWV");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f117920a;
        if (com.p314xaae8f345.mm.ui.b4.c(viewOnCreateContextMenuListenerC19337x37f3384d)) {
            android.view.KeyEvent.Callback mo120167xbfee89b7 = viewWV.mo120167xbfee89b7();
            com.p314xaae8f345.p3210x3857dc.i2 i2Var = mo120167xbfee89b7 instanceof com.p314xaae8f345.p3210x3857dc.i2 ? (com.p314xaae8f345.p3210x3857dc.i2) mo120167xbfee89b7 : null;
            if (i2Var != null) {
                i2Var.mo120265xefce9d29(new by4.e(z17, new java.lang.ref.WeakReference(viewOnCreateContextMenuListenerC19337x37f3384d), new java.lang.ref.WeakReference(viewWV)));
                i2Var.mo120261x31f622ee();
            }
        }
    }
}
