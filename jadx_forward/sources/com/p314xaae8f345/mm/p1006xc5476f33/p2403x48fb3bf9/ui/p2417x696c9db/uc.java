package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public final class uc extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.wc f268483a;

    public uc(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.wc wcVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.AnonymousClass1 anonymousClass1) {
        this.f268483a = wcVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void c(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.wc wcVar = this.f268483a;
        wcVar.f268556d.f265337a3.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = wcVar.f268556d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265407y2 != null && com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
            viewOnCreateContextMenuListenerC19337x37f3384d.f265407y2.c0("rawUrl", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.w wVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265407y2;
            wVar.t().f174620g = str;
            wVar.g();
        }
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265410z2 != null && com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
            viewOnCreateContextMenuListenerC19337x37f3384d.f265410z2.c0("rawUrl", str);
        }
        if (viewOnCreateContextMenuListenerC19337x37f3384d.F2 != null && com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
            viewOnCreateContextMenuListenerC19337x37f3384d.F2.C.set(1, str);
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.d9(str);
        viewOnCreateContextMenuListenerC19337x37f3384d.K8(viewOnCreateContextMenuListenerC19337x37f3384d.t8());
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = viewOnCreateContextMenuListenerC19337x37f3384d.f265382q2;
        if (c6Var != null) {
            java.lang.String str2 = wcVar.f263384a.I;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str2.equals(str)) {
                return;
            }
            java.util.HashMap hashMap = (java.util.HashMap) c6Var.f265578b;
            android.util.SparseBooleanArray sparseBooleanArray = (android.util.SparseBooleanArray) hashMap.get(str2);
            if (sparseBooleanArray != null) {
                java.lang.String host = android.net.Uri.parse(str2).getHost();
                java.lang.String host2 = android.net.Uri.parse(str).getHost();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(host) || !host.equals(host2) || !com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(str2).equals(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(str)) || hashMap.containsKey(str)) {
                    return;
                }
                android.util.SparseBooleanArray sparseBooleanArray2 = new android.util.SparseBooleanArray(sparseBooleanArray.size());
                for (int i17 = 0; i17 < sparseBooleanArray.size(); i17++) {
                    sparseBooleanArray2.put(sparseBooleanArray.keyAt(i17), sparseBooleanArray.valueAt(i17));
                }
                hashMap.put(str, sparseBooleanArray2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewMenuHelper", "inheritMenuStateOnSpaNavigation: inherit menu state from [%s] to [%s]", str2, str);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void f(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        android.view.View j17;
        android.content.Intent intent;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.wc wcVar = this.f268483a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar = wcVar.f268556d.f265399w2;
        ldVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIStyleHelper", "onWebViewPageCommitVisible, url:%s", str);
        ph0.i iVar = (ph0.i) i95.n0.c(ph0.i.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = ldVar.f267187e;
        ((nh0.i) iVar).getClass();
        java.lang.Integer valueOf = (viewOnCreateContextMenuListenerC19337x37f3384d == null || (intent = viewOnCreateContextMenuListenerC19337x37f3384d.getIntent()) == null) ? null : java.lang.Integer.valueOf(intent.getIntExtra("pay_report_scene", 0));
        if (valueOf != null && valueOf.intValue() == 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(viewOnCreateContextMenuListenerC19337x37f3384d, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = viewOnCreateContextMenuListenerC19337x37f3384d.mo2533x106ab264();
            if (mo2533x106ab264 != null && (j17 = mo2533x106ab264.j()) != null) {
                j17.findViewById(com.p314xaae8f345.mm.R.id.f564015fq);
            }
        }
        ldVar.f267190h = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.Y6(wcVar.f268556d, c27816xac2547f9, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d2 = wcVar.f268556d;
        viewOnCreateContextMenuListenerC19337x37f3384d2.f265337a3.f(viewOnCreateContextMenuListenerC19337x37f3384d2.x7());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void g(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.wc wcVar = this.f268483a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.w wVar = wcVar.f268556d.f265407y2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = wcVar.f268556d;
        if (wVar != null && com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
            viewOnCreateContextMenuListenerC19337x37f3384d.f265407y2.c0("rawUrl", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.w wVar2 = viewOnCreateContextMenuListenerC19337x37f3384d.f265407y2;
            wVar2.t().f174620g = str;
            wVar2.g();
        }
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265410z2 != null && com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
            viewOnCreateContextMenuListenerC19337x37f3384d.f265410z2.c0("rawUrl", str);
        }
        if (viewOnCreateContextMenuListenerC19337x37f3384d.F2 != null && com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && str != null && !str.startsWith("data:text/html;charset=utf-8")) {
            viewOnCreateContextMenuListenerC19337x37f3384d.F2.C.set(1, str);
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.d9(str);
        if (!viewOnCreateContextMenuListenerC19337x37f3384d.W1) {
            viewOnCreateContextMenuListenerC19337x37f3384d.W1 = true;
            viewOnCreateContextMenuListenerC19337x37f3384d.f265368m2.b().f264611a = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onPageFinished, old title = %s, new title = %s, fixedTitle = %b, showTitle = %b, loadUrl = %s", viewOnCreateContextMenuListenerC19337x37f3384d.m78518x4c0ad082(), viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.mo64579x7531c8a2(), java.lang.Boolean.valueOf(viewOnCreateContextMenuListenerC19337x37f3384d.f265342d), java.lang.Boolean.valueOf(viewOnCreateContextMenuListenerC19337x37f3384d.S), viewOnCreateContextMenuListenerC19337x37f3384d.L1.f263497y);
        viewOnCreateContextMenuListenerC19337x37f3384d.f265337a3.f(viewOnCreateContextMenuListenerC19337x37f3384d.x7());
        viewOnCreateContextMenuListenerC19337x37f3384d.setProgressBarIndeterminateVisibility(false);
        viewOnCreateContextMenuListenerC19337x37f3384d.f265367m.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265399w2;
        if (ldVar != null && !ldVar.f267183a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIStyleHelper", "onWebViewPageFinished, url:%s", str);
            ldVar.f267190h = str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x3 x3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x3.f263545a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(str), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(viewOnCreateContextMenuListenerC19337x37f3384d.f265363k3))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onPageFinished  checkWeixinReady:" + str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.Y6(viewOnCreateContextMenuListenerC19337x37f3384d, c27816xac2547f9, str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onPageFinished no need checkWeixinReady again:" + str);
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.x8(c27816xac2547f9, str);
        by4.k kVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265374o2;
        if (kVar == null || !kVar.a()) {
            return;
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.f265374o2.f117933a = true;
        java.lang.String x76 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnCreateContextMenuListenerC19337x37f3384d.L1.f263497y) ? viewOnCreateContextMenuListenerC19337x37f3384d.x7() : viewOnCreateContextMenuListenerC19337x37f3384d.L1.f263497y;
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) viewOnCreateContextMenuListenerC19337x37f3384d.f265374o2.f117937e).get(x76);
        java.lang.String X6 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.X6(viewOnCreateContextMenuListenerC19337x37f3384d, viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.mo64579x7531c8a2());
        if (str2 != null) {
            viewOnCreateContextMenuListenerC19337x37f3384d.f265374o2.b(viewOnCreateContextMenuListenerC19337x37f3384d, x76, viewOnCreateContextMenuListenerC19337x37f3384d.F7(), str2);
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X6) || ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(x76)) {
                return;
            }
            viewOnCreateContextMenuListenerC19337x37f3384d.f265374o2.b(viewOnCreateContextMenuListenerC19337x37f3384d, x76, viewOnCreateContextMenuListenerC19337x37f3384d.F7(), X6);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void h(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.wc wcVar = this.f268483a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = wcVar.f268556d;
        if (!viewOnCreateContextMenuListenerC19337x37f3384d.f265353g3) {
            viewOnCreateContextMenuListenerC19337x37f3384d.f265382q2.y();
        }
        wcVar.f268556d.f265337a3.a();
        wcVar.f268556d.f265337a3.f(str);
        wcVar.f268556d.setProgressBarIndeterminateVisibility(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d2 = wcVar.f268556d;
        viewOnCreateContextMenuListenerC19337x37f3384d2.f265382q2.B(str, viewOnCreateContextMenuListenerC19337x37f3384d2.getIntent());
        wcVar.f268556d.R8(true, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar = wcVar.f268556d.f265399w2;
        if (ldVar != null && !ldVar.f267183a) {
            ldVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIStyleHelper", "onWebViewPageStart, url:%s", str);
            ldVar.f267190h = str;
            ldVar.l();
            ldVar.n();
        }
        wcVar.f268556d.G8(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d3 = wcVar.f268556d;
        viewOnCreateContextMenuListenerC19337x37f3384d3.f265343d2 = 0;
        viewOnCreateContextMenuListenerC19337x37f3384d3.C = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17, java.lang.String str, java.lang.String str2) {
        this.f268483a.f268556d.f265382q2.G = false;
    }
}
