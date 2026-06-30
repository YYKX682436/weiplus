package cw4;

/* loaded from: classes8.dex */
public final class i1 implements cw4.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld f305762a;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld webViewUIHelper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webViewUIHelper, "webViewUIHelper");
        this.f305762a = webViewUIHelper;
    }

    @Override // cw4.n
    public void a(cw4.c0 c0Var, cw4.d0 d0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar = this.f305762a;
        if (ldVar.f267187e == null) {
            return;
        }
        if (ldVar.f267189g.f263276f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUIStyleHelper", "switchTransHelpEntry not show title and ignore");
            return;
        }
        cw4.c0 c0Var2 = cw4.c0.f305736f;
        if (c0Var == c0Var2 && d0Var == cw4.d0.f305739d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIStyleHelper", "change trans help button Status and Action");
            d0Var = cw4.d0.f305740e;
            c0Var = cw4.c0.f305735e;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIStyleHelper", "trans help button Action: %s, Status: %s", c0Var.name(), d0Var.name());
        if (ldVar.f267187e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUIStyleHelper", "showTopBar not ready %s", ldVar.f267190h);
        } else if (ldVar.f267197o == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIStyleHelper", "init transHelpEntryLayout");
            android.view.View inflate = ldVar.f267187e.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_5, (android.view.ViewGroup) null);
            ldVar.f267197o = inflate;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld.p(inflate, ldVar.f267187e.mo78514x143f1b92());
            ((android.widget.Button) ldVar.f267197o.findViewById(com.p314xaae8f345.mm.R.id.oin)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.cd(ldVar));
        }
        android.widget.TextView textView = (android.widget.TextView) ldVar.f267197o.findViewById(com.p314xaae8f345.mm.R.id.mv8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ldVar.f267197o.findViewById(com.p314xaae8f345.mm.R.id.mv7);
        if (d0Var == cw4.d0.f305739d) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l6u);
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80336x9bb432f6);
        } else if (d0Var == cw4.d0.f305740e) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l6w);
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80319x9810f934);
        }
        if (c0Var == cw4.c0.f305734d) {
            return;
        }
        if (c0Var == c0Var2) {
            ldVar.f267198p = true;
            if (ldVar.j()) {
                ldVar.g();
            }
            ldVar.f267187e.mo78514x143f1b92().D0(8);
            ldVar.f267187e.mo78514x143f1b92().N.setVisibility(8);
            android.view.View view = ldVar.f267197o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "switchTransHelpEntry", "(Lcom/tencent/mm/plugin/webview/WebTransHelpButtonAction;Lcom/tencent/mm/plugin/webview/WebTransHelpButtonStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "switchTransHelpEntry", "(Lcom/tencent/mm/plugin/webview/WebTransHelpButtonAction;Lcom/tencent/mm/plugin/webview/WebTransHelpButtonStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (c0Var == cw4.c0.f305735e) {
            ldVar.f267198p = false;
            android.view.View view2 = ldVar.f267197o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "switchTransHelpEntry", "(Lcom/tencent/mm/plugin/webview/WebTransHelpButtonAction;Lcom/tencent/mm/plugin/webview/WebTransHelpButtonStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "switchTransHelpEntry", "(Lcom/tencent/mm/plugin/webview/WebTransHelpButtonAction;Lcom/tencent/mm/plugin/webview/WebTransHelpButtonStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ldVar.f267187e.mo78514x143f1b92().D0(0);
            ldVar.o();
            if (ldVar.j()) {
                ldVar.n();
            }
        }
    }

    @Override // cw4.n
    public void b(java.lang.String str, java.util.Map values) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var;
        nw4.n g07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f305762a.f267187e;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || (e3Var = viewOnCreateContextMenuListenerC19337x37f3384d.L1) == null || (g07 = e3Var.g0()) == null) {
            return;
        }
        g07.o(str, values);
    }

    @Override // cw4.n
    public java.lang.Boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f305762a.f267187e;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || (e3Var = viewOnCreateContextMenuListenerC19337x37f3384d.L1) == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(e3Var.B0.contains(java.lang.Integer.valueOf(e3Var.f263476n0)));
    }

    @Override // cw4.n
    public void d(cw4.q0 q0Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar = this.f305762a;
        if (ldVar.f267187e == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIStyleHelper", "trans tips status is %s, brand:%s", q0Var.name(), str);
        android.view.View findViewById = ldVar.f267187e.findViewById(com.p314xaae8f345.mm.R.id.qri);
        if (findViewById == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUIStyleHelper", "setTransTipsBarText fail, tipsView is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd = ldVar.f267189g;
        if (c19231x33dc2abd.f263276f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUIStyleHelper", "setTransTipsBarText not show transView and ignore");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = ldVar.f267187e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = viewOnCreateContextMenuListenerC19337x37f3384d.L1;
        if (e3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) {
            float f17 = e3Var.f263471l.f440247c;
            if (c19231x33dc2abd.f263283p) {
                if (findViewById.getParent() instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) findViewById.getParent()).removeView(findViewById);
                }
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ldVar.f267187e.findViewById(com.p314xaae8f345.mm.R.id.f569240vp2);
                frameLayout.addView(findViewById);
                frameLayout.setPadding(0, java.lang.Float.valueOf(ldVar.f267186d.m81401x1f106092() * f17).intValue(), 0, 0);
                findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fd(ldVar, findViewById, f17));
            } else {
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) viewOnCreateContextMenuListenerC19337x37f3384d.findViewById(com.p314xaae8f345.mm.R.id.f569241vp3);
                if ((findViewById.getParent() instanceof android.view.ViewGroup) && findViewById.getParent() != frameLayout2) {
                    ((android.view.ViewGroup) findViewById.getParent()).removeView(findViewById);
                    frameLayout2.addView(findViewById);
                    ldVar.s(f17);
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setBackgroundColor(ldVar.d());
        android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.qqq);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById.findViewById(com.p314xaae8f345.mm.R.id.qqr);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.qqo);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById.findViewById(com.p314xaae8f345.mm.R.id.qqp);
        int b17 = i65.a.b(ldVar.f267187e, 12);
        fq1.e.f347040a.b(textView2.getParent(), textView2, b17, b17);
        textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.dd(ldVar));
        c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ed(ldVar, findViewById, e3Var));
        if (q0Var == cw4.q0.f305802d) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "setTransTipsBarText", "(Lcom/tencent/mm/plugin/webview/WebTransTipsStatus;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ldVar.f267187e.mo78530x8b45058f();
        int ordinal = q0Var.ordinal();
        if (ordinal == 1) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575201l72);
            progressBar.setVisibility(0);
            c22699x3dcdb352.setVisibility(8);
        } else if (ordinal == 2) {
            textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? ldVar.f267187e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575199l70) : str);
            progressBar.setVisibility(8);
            c22699x3dcdb352.setVisibility(0);
        } else {
            if (ordinal != 3) {
                return;
            }
            textView.setText(ldVar.f267187e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575200l71));
            progressBar.setVisibility(8);
            c22699x3dcdb352.setVisibility(0);
        }
    }

    @Override // cw4.n
    public void e(cw4.n0 action, cw4.o0 scene) {
        java.lang.String str;
        java.lang.String mo120156xb5887639;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar = this.f305762a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = ldVar.f267186d;
        if (c22633x83752a59 == null || (mo120156xb5887639 = c22633x83752a59.mo120156xb5887639()) == null) {
            str = null;
        } else {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.a.f269270a;
            str = fp.s0.b(mo120156xb5887639, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        }
        boolean j17 = ldVar.j();
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getActualTranslateLanguageIso(...)");
        java.lang.String str2 = action.ordinal() + ',' + scene.ordinal() + ',' + str + ',' + (j17 ? 1 : 0) + ',' + c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "webTrans reportStr:" + str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(21129, str2);
    }

    @Override // cw4.n
    public java.lang.Boolean f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f305762a.f267187e;
        if (viewOnCreateContextMenuListenerC19337x37f3384d != null) {
            return java.lang.Boolean.valueOf(viewOnCreateContextMenuListenerC19337x37f3384d.m78537xfe91cc5b(i17));
        }
        return null;
    }

    @Override // cw4.n
    /* renamed from: getContext */
    public android.content.Context mo122967x76847179() {
        return this.f305762a.f267187e.mo55332x76847179();
    }

    @Override // cw4.n
    /* renamed from: getLifecycleOwner */
    public p012xc85e97e9.p093xedfae76a.y mo122968x95c7fa5f() {
        return this.f305762a.f267187e;
    }

    @Override // cw4.n
    /* renamed from: getWebView */
    public com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 mo122969x86b9ebe3() {
        return this.f305762a.f267186d;
    }
}
