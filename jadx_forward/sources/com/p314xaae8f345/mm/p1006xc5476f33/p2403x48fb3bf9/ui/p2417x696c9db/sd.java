package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes7.dex */
public final class sd {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f268409a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f268410b;

    public sd(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 webViewController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webViewController, "webViewController");
        this.f268409a = webViewController;
        int d17 = ((kz5.b) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.qd.f268319h).d();
        byte[] bArr = new byte[d17];
        for (int i17 = 0; i17 < d17; i17++) {
            bArr[i17] = 0;
        }
        this.f268410b = bArr;
    }

    public final void a(dy4.l lVar) {
        android.view.Window window;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.f268409a;
        android.app.Dialog dialog = e3Var.f263477o;
        if (dialog != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog);
            window = dialog.getWindow();
            if (window == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewWindowSecureHandler", "resetSecureFlagToWindow get null window from dialog:" + e3Var.f263477o);
            }
        } else {
            android.app.Activity a17 = q75.a.a(lVar != null ? lVar.f326214d : null);
            if (a17 == null) {
                android.content.Context m81400x569210f3 = e3Var.f263449a.m81400x569210f3();
                a17 = m81400x569210f3 instanceof android.app.Activity ? (android.app.Activity) m81400x569210f3 : null;
            }
            android.view.Window window2 = a17 != null ? a17.getWindow() : null;
            if (window2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewWindowSecureHandler", "resetSecureFlagToWindow get null window from activity:" + a17);
            }
            window = window2;
        }
        if (window == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.rd(this, window));
    }

    public final void b(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.qd reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewWindowSecureHandler", "setVisualEffect hidden:" + z17 + ", reason:" + reason + ", webviewId:" + this.f268409a.U());
        synchronized (this.f268410b) {
            this.f268410b[reason.ordinal()] = z17 ? (byte) 1 : (byte) 0;
        }
        a(this.f268409a.X0);
    }
}
