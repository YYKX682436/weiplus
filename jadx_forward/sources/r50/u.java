package r50;

/* loaded from: classes5.dex */
public final class u implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f474146a;

    public u(r50.j0 j0Var) {
        this.f474146a = j0Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        try {
            this.f474146a.W6().e().n(text);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ForwardMsgPreviewKeyboardUIC", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        r50.j0 j0Var = this.f474146a;
        android.view.inputmethod.InputConnection mo81352x6a67d012 = j0Var.W6().e().mo81352x6a67d012();
        if (mo81352x6a67d012 != null) {
            mo81352x6a67d012.sendKeyEvent(new android.view.KeyEvent(0, 67));
        }
        android.view.inputmethod.InputConnection mo81352x6a67d0122 = j0Var.W6().e().mo81352x6a67d012();
        if (mo81352x6a67d0122 != null) {
            mo81352x6a67d0122.sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
        r50.j0 j0Var = this.f474146a;
        j0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "setToSendTextColor: enable=%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            j0Var.W6().e().setTextColor(j0Var.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560944yi));
            return;
        }
        j0Var.W6().e().setTextColor(j0Var.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMsgPreviewKeyboardUIC", "focusEdt: %s, %s", java.lang.Boolean.FALSE, j0Var.W6().e());
        j0Var.W6().e().clearFocus();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
    }
}
