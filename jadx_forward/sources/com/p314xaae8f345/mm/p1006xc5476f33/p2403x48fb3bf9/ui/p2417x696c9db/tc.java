package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class tc extends com.p314xaae8f345.p3210x3857dc.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0 f268444a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0();

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f268445b = null;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f268446c;

    public tc(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        this.f268446c = viewOnCreateContextMenuListenerC19337x37f3384d;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public android.view.View a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268446c;
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265406y1 == null) {
            viewOnCreateContextMenuListenerC19337x37f3384d.f265406y1 = new android.widget.ProgressBar(viewOnCreateContextMenuListenerC19337x37f3384d);
            viewOnCreateContextMenuListenerC19337x37f3384d.f265406y1.setIndeterminate(true);
        }
        return viewOnCreateContextMenuListenerC19337x37f3384d.f265406y1;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        cf.o.a(consoleMessage, "MicroMsg.WebViewUI", false);
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean c(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59;
        this.f268446c.I8(true);
        qp1.h0.a(true, true, false);
        if (this.f268446c.y7().f440243b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c I7 = this.f268446c.I7();
            android.content.Context context = I7.getContext();
            if ((context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) && (c22633x83752a59 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).f265348f) != null) {
                I7.f267260y = c22633x83752a59.m0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.r(I7));
            }
            if (I7.f267260y != null) {
                this.f268446c.f265369m3 = customViewCallback;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onEnterFullscreen view");
                if (view.getParent() == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c I72 = this.f268446c.I7();
                    synchronized (I72) {
                        I72.l();
                        I72.f267243g.removeAllViews();
                        android.content.Context context2 = I72.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context2).mo50393x3c0b42ee();
                        I72.i(true);
                        android.view.View view2 = I72.f267241e;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(java.lang.Float.valueOf(1.0f));
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "addVideoView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "addVideoView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        I72.f267241e.setBackgroundColor(-16777216);
                        I72.setVisibility(0);
                        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(I72.getContext());
                        frameLayout.addView(view, new android.view.ViewGroup.LayoutParams(-1, -2));
                        I72.f267244h = frameLayout;
                        android.view.ViewGroup viewGroup = I72.f267243g;
                        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                        layoutParams.addRule(15);
                        viewGroup.addView(frameLayout, layoutParams);
                        I72.h();
                        I72.T = false;
                        I72.P = true;
                        I72.e();
                    }
                }
                return true;
            }
        }
        if (this.f268446c.y7().f440243b) {
            this.f268446c.y7().a(false);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean d() {
        this.f268446c.I8(false);
        qp1.h0.a(false, true, false);
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void e(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268446c;
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265377p0 != null && viewOnCreateContextMenuListenerC19337x37f3384d.y7().f440243b && viewOnCreateContextMenuListenerC19337x37f3384d.I7().getVisibility() == 0) {
            android.webkit.WebChromeClient.CustomViewCallback customViewCallback = viewOnCreateContextMenuListenerC19337x37f3384d.f265369m3;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
            viewOnCreateContextMenuListenerC19337x37f3384d.y7().a(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c I7 = viewOnCreateContextMenuListenerC19337x37f3384d.I7();
            boolean z17 = I7.T;
            java.lang.String str = I7.f267240d;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "isRunningExitAnimation");
            } else if (I7.f267258x == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "runExitAnimation mpShareVideoInfo is null, just exit");
                I7.f();
            } else {
                I7.o();
                if (bitmap != null && !bitmap.isRecycled()) {
                    android.widget.ImageView imageView = new android.widget.ImageView(I7.getContext());
                    android.view.ViewGroup viewGroup = I7.f267244h;
                    if (viewGroup != null) {
                        viewGroup.addView(imageView, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    }
                    imageView.setImageBitmap(bitmap);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "runExitAnimation");
                I7.p();
                android.view.View view = I7.f267241e;
                int width = view.getWidth();
                int height = view.getHeight();
                com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var2 = I7.C;
                if (s4Var2 != null) {
                    s4Var2.f292232f = width;
                    s4Var2.f292233g = height;
                }
                if (s4Var2 != null) {
                    ot0.m1 m1Var = I7.f267258x;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var);
                    int i17 = m1Var.f430116u;
                    ot0.m1 m1Var2 = I7.f267258x;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var2);
                    int i18 = m1Var2.f430117v;
                    ot0.m1 m1Var3 = I7.f267258x;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var3);
                    int i19 = m1Var3.f430118w;
                    ot0.m1 m1Var4 = I7.f267258x;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var4);
                    s4Var2.e(i17, i18, i19, m1Var4.f430119x);
                }
                float f17 = I7.S;
                if (!(((double) f17) == 1.0d) && (s4Var = I7.C) != null) {
                    s4Var.f292240n = 1 / f17;
                }
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var3 = I7.C;
                if (s4Var3 != null) {
                    s4Var3.d(I7.f267244h, I7.f267241e, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.c0(I7, null, layoutParams), null);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265399w2;
            if (ldVar != null) {
                ldVar.n();
            }
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void g(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0 o0Var = this.f268444a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268446c;
        o0Var.g(viewOnCreateContextMenuListenerC19337x37f3384d, viewOnCreateContextMenuListenerC19337x37f3384d.x7(), viewOnCreateContextMenuListenerC19337x37f3384d.F7(), viewOnCreateContextMenuListenerC19337x37f3384d.L1.Q(), viewOnCreateContextMenuListenerC19337x37f3384d.getIntent().getStringExtra("geta8key_username"), str, callback);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onHideCustomView, sdk int = " + android.os.Build.VERSION.SDK_INT);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268446c;
        viewOnCreateContextMenuListenerC19337x37f3384d.mo55332x76847179().getWindow().clearFlags(128);
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265364l1 == null) {
            return;
        }
        try {
            viewOnCreateContextMenuListenerC19337x37f3384d.K8(viewOnCreateContextMenuListenerC19337x37f3384d.t8());
            if (viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.m120171x1f05d274()) {
                viewOnCreateContextMenuListenerC19337x37f3384d.m78505x1ef531b7(false);
                viewOnCreateContextMenuListenerC19337x37f3384d.P8(viewOnCreateContextMenuListenerC19337x37f3384d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561056a70));
                if (viewOnCreateContextMenuListenerC19337x37f3384d.W2 != null) {
                    viewOnCreateContextMenuListenerC19337x37f3384d.L8(viewOnCreateContextMenuListenerC19337x37f3384d.D7());
                }
            } else {
                viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.setVisibility(0);
                viewOnCreateContextMenuListenerC19337x37f3384d.m78596x71afbec8(0);
            }
            android.widget.FrameLayout frameLayout = viewOnCreateContextMenuListenerC19337x37f3384d.f265404y;
            if (frameLayout != null) {
                frameLayout.removeView(viewOnCreateContextMenuListenerC19337x37f3384d.f265364l1);
            }
            viewOnCreateContextMenuListenerC19337x37f3384d.f265364l1 = null;
            android.webkit.WebChromeClient.CustomViewCallback customViewCallback = viewOnCreateContextMenuListenerC19337x37f3384d.f265405y0;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
            viewOnCreateContextMenuListenerC19337x37f3384d.I8(false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUI", "onHideCustomView error " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3210x3857dc.z zVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onJsAlert");
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        c19762x487075a.f38859x6ac9171 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268446c;
        if (viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing() || viewOnCreateContextMenuListenerC19337x37f3384d.m78477x9d1e994e()) {
            zVar.a();
            return true;
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.f265343d2++;
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265343d2 > 2) {
            this.f268445b = db5.e1.B(viewOnCreateContextMenuListenerC19337x37f3384d, str2, "", viewOnCreateContextMenuListenerC19337x37f3384d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lao), viewOnCreateContextMenuListenerC19337x37f3384d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.pc(this, str, zVar), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.qc(this, c19762x487075a, zVar), com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo);
        } else {
            this.f268445b = db5.e1.y(viewOnCreateContextMenuListenerC19337x37f3384d, str2, "", viewOnCreateContextMenuListenerC19337x37f3384d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.rc(this, c19762x487075a, zVar));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f268445b;
        if (j0Var == null) {
            return false;
        }
        j0Var.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.sc(this, c19762x487075a, zVar));
        this.f268445b.setCanceledOnTouchOutside(false);
        this.f268445b.o(false);
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean j(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3210x3857dc.z zVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onJsConfirm");
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        c19762x487075a.f38859x6ac9171 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268446c;
        if (viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing() || viewOnCreateContextMenuListenerC19337x37f3384d.m78477x9d1e994e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onJsConfirm finish");
            zVar.a();
            return true;
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.f265343d2++;
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265343d2 > 2) {
            this.f268445b = db5.e1.B(viewOnCreateContextMenuListenerC19337x37f3384d, str2, "", viewOnCreateContextMenuListenerC19337x37f3384d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lao), viewOnCreateContextMenuListenerC19337x37f3384d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.kc(this, str, zVar), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.lc(this, c19762x487075a, zVar), com.p314xaae8f345.mm.R.C30859x5a72f63.f560282g4);
        } else {
            this.f268445b = db5.e1.K(viewOnCreateContextMenuListenerC19337x37f3384d.mo55332x76847179(), false, str2, "", viewOnCreateContextMenuListenerC19337x37f3384d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), viewOnCreateContextMenuListenerC19337x37f3384d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.mc(this, c19762x487075a, zVar), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.nc(this, zVar));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f268445b;
        if (j0Var == null) {
            return false;
        }
        j0Var.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.oc(this, c19762x487075a, zVar));
        this.f268445b.setCancelable(false);
        this.f268445b.setCanceledOnTouchOutside(false);
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean k(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p3210x3857dc.y yVar) {
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void l(android.webkit.PermissionRequest permissionRequest) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268446c;
        this.f268444a.h(permissionRequest, viewOnCreateContextMenuListenerC19337x37f3384d, viewOnCreateContextMenuListenerC19337x37f3384d.x7());
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268446c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onReceivedTitle#%s title = %s, loadurl = %s", java.lang.Integer.valueOf(viewOnCreateContextMenuListenerC19337x37f3384d.t7()), str, viewOnCreateContextMenuListenerC19337x37f3384d.L1.f263497y);
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265342d && !viewOnCreateContextMenuListenerC19337x37f3384d.f265345e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "fixed title, ignore received title: " + str);
            return;
        }
        if (viewOnCreateContextMenuListenerC19337x37f3384d.S) {
            by4.k kVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265374o2;
            if (kVar != null && kVar.a()) {
                java.lang.String X6 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.X6(viewOnCreateContextMenuListenerC19337x37f3384d, str);
                java.lang.String url = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnCreateContextMenuListenerC19337x37f3384d.L1.f263497y) ? viewOnCreateContextMenuListenerC19337x37f3384d.x7() : viewOnCreateContextMenuListenerC19337x37f3384d.L1.f263497y;
                by4.k kVar2 = viewOnCreateContextMenuListenerC19337x37f3384d.f265374o2;
                kVar2.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
                ((java.util.HashMap) kVar2.f117937e).put(url, X6);
                by4.k kVar3 = viewOnCreateContextMenuListenerC19337x37f3384d.f265374o2;
                if (kVar3.f117933a) {
                    kVar3.b(viewOnCreateContextMenuListenerC19337x37f3384d, url, viewOnCreateContextMenuListenerC19337x37f3384d.F7(), X6);
                    return;
                }
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                viewOnCreateContextMenuListenerC19337x37f3384d.mo54450xbf7c1df6("");
                return;
            }
            java.lang.String str2 = viewOnCreateContextMenuListenerC19337x37f3384d.L1.f263497y;
            if (str2 == null) {
                str2 = "";
            }
            if (!str2.endsWith(str)) {
                java.lang.String a17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(viewOnCreateContextMenuListenerC19337x37f3384d.L1.f263497y);
                if (a17 == null) {
                    a17 = "";
                }
                if (!a17.endsWith(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9.a(str))) {
                    java.lang.String c17 = xw4.b.c(viewOnCreateContextMenuListenerC19337x37f3384d.L1.f263497y);
                    if (c17 == null) {
                        c17 = "";
                    }
                    java.lang.String decode = java.net.URLDecoder.decode(c17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onReceivedTitle urlHost: %s, title: %s", decode, str);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(decode) || !str.startsWith(decode)) {
                        z17 = false;
                    } else {
                        viewOnCreateContextMenuListenerC19337x37f3384d.mo54450xbf7c1df6("");
                        z17 = true;
                    }
                    if (z17 || com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.d(str) || str.startsWith("about:blank")) {
                        return;
                    }
                    viewOnCreateContextMenuListenerC19337x37f3384d.mo54450xbf7c1df6(str);
                    return;
                }
            }
            viewOnCreateContextMenuListenerC19337x37f3384d.mo54450xbf7c1df6("");
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void p(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268446c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onShowCustomView, sdk int = " + android.os.Build.VERSION.SDK_INT);
        try {
            viewOnCreateContextMenuListenerC19337x37f3384d.mo55332x76847179().getWindow().addFlags(128);
            if (viewOnCreateContextMenuListenerC19337x37f3384d.f265364l1 != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            viewOnCreateContextMenuListenerC19337x37f3384d.K8(false);
            viewOnCreateContextMenuListenerC19337x37f3384d.f265364l1 = view;
            viewOnCreateContextMenuListenerC19337x37f3384d.f265405y0 = customViewCallback;
            if (viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.m120171x1f05d274()) {
                viewOnCreateContextMenuListenerC19337x37f3384d.f265404y.addView(view, 0);
                viewOnCreateContextMenuListenerC19337x37f3384d.m78505x1ef531b7(true);
                viewOnCreateContextMenuListenerC19337x37f3384d.P8(0);
                if (viewOnCreateContextMenuListenerC19337x37f3384d.W2 != null) {
                    viewOnCreateContextMenuListenerC19337x37f3384d.L8(0);
                }
            } else {
                viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.setVisibility(8);
                viewOnCreateContextMenuListenerC19337x37f3384d.f265404y.addView(view);
                viewOnCreateContextMenuListenerC19337x37f3384d.m78596x71afbec8(4);
            }
            viewOnCreateContextMenuListenerC19337x37f3384d.I8(true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUI", "onShowCustomView error " + e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public boolean q(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, android.webkit.ValueCallback valueCallback, com.p314xaae8f345.p3210x3857dc.r0 r0Var) {
        if (r0Var.c() != 0 && r0Var.c() != 1) {
            return false;
        }
        if (r0Var.b() == null || r0Var.b().length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
            return true;
        }
        java.lang.String[] b17 = r0Var.b();
        java.lang.String str = r0Var.d() ? "true" : "false";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onShowFileChooser mode: %d, catpure: %s", java.lang.Integer.valueOf(r0Var.c()), java.lang.Boolean.valueOf(r0Var.d()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268446c;
        viewOnCreateContextMenuListenerC19337x37f3384d.f265339b3.c(viewOnCreateContextMenuListenerC19337x37f3384d, viewOnCreateContextMenuListenerC19337x37f3384d.f265409z1, valueCallback, b17, str, r0Var.a(), r0Var.c());
        return true;
    }
}
