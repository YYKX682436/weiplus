package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public class p2 extends com.p314xaae8f345.p3210x3857dc.s0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f269024b;

    /* renamed from: a, reason: collision with root package name */
    public int f269023a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0 f269025c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f269026d = new java.util.concurrent.ConcurrentSkipListSet(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.g2(this));

    public p2(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59) {
        this.f269024b = c22633x83752a59;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void g(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f269024b;
        android.app.Activity a17 = q75.a.a(c22633x83752a59.getContext());
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.MMWebChromeClient", "onGeolocationPermissionsShowPrompt with origin(%s) NULL activity, return denial", str);
            callback.invoke(str, false, false);
        } else {
            this.f269025c.g(a17, c22633x83752a59.mo120156xb5887639(), "", c22633x83752a59.f292906v, "", str, callback);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3210x3857dc.z zVar) {
        android.app.Activity a17 = q75.a.a(this.f269024b.getContext());
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.MMWebChromeClient", "onJsAlert with url(%s) message(%s), NULL activity, return cancel", str, str2);
            zVar.a();
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h2(this, zVar);
        int i17 = this.f269023a + 1;
        this.f269023a = i17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 B = i17 > 2 ? db5.e1.B(a17, str2, "", a17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lao), a17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.i2(this, h2Var), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.j2(this, h2Var), com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo) : db5.e1.y(a17, str2, "", a17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.k2(this, h2Var));
        if (B == null) {
            return false;
        }
        B.setCanceledOnTouchOutside(false);
        B.o(false);
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean j(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3210x3857dc.z zVar) {
        android.app.Activity a17 = q75.a.a(this.f269024b.getContext());
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.MMWebChromeClient", "onJsConfirm with url(%s) message(%s), NULL activity, return cancel", str, str2);
            zVar.a();
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h2(this, zVar);
        int i17 = this.f269023a + 1;
        this.f269023a = i17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 B = i17 > 2 ? db5.e1.B(a17, str2, "", a17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lao), a17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l2(this, h2Var), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m2(this, h2Var), com.p314xaae8f345.mm.R.C30859x5a72f63.f560282g4) : db5.e1.K(a17, false, str2, "", a17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), a17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n2(this, h2Var), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o2(this, h2Var));
        if (B == null) {
            return false;
        }
        B.setCancelable(false);
        B.setCanceledOnTouchOutside(false);
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean k(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p3210x3857dc.y yVar) {
        android.app.Activity a17 = q75.a.a(this.f269024b.getContext());
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.MMWebChromeClient", "onJsPrompt with url(%s) message(%s), NULL activity, return cancel", str, str2);
            yVar.a();
            return true;
        }
        new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h2(this, yVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 N = db5.e1.N(a17, str2, str3, "", Integer.MAX_VALUE, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.f2(this, yVar));
        if (N == null) {
            return false;
        }
        N.setCancelable(false);
        N.setCanceledOnTouchOutside(false);
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void l(android.webkit.PermissionRequest permissionRequest) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f269024b;
        android.app.Activity a17 = q75.a.a(c22633x83752a59.getContext());
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.MMWebChromeClient", "onPermissionRequest NULL activity");
        } else {
            this.f269025c.h(permissionRequest, a17, c22633x83752a59.mo120156xb5887639());
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
    }

    public void s() {
        android.app.Activity a17 = q75.a.a(this.f269024b.getContext());
        if (a17 == null) {
            return;
        }
        a17.finish();
    }
}
