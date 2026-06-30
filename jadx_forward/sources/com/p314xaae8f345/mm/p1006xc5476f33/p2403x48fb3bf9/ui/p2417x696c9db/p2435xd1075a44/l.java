package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class l extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f268905b;

    public l(java.lang.ref.WeakReference commWebView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commWebView, "commWebView");
        this.f268905b = commWebView;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void b(int i17, java.lang.String reqUrl, int i18, int i19, java.lang.String errMsg) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o1 o1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        if (i17 != 0 && i17 != 2) {
            switch (i17) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    return;
            }
        }
        java.lang.ref.WeakReference weakReference = this.f268905b;
        if (weakReference == null || (o1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o1) weakReference.get()) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4) o1Var).o();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void m() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o1 o1Var;
        java.lang.ref.WeakReference weakReference = this.f268905b;
        if (weakReference == null || (o1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o1) weakReference.get()) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4) o1Var).h();
    }
}
