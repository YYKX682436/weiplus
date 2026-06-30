package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC19389x16789445 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: c5, reason: collision with root package name */
    public static final /* synthetic */ int f265854c5 = 0;
    public boolean V4;
    public android.view.View W4;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 X4;

    /* renamed from: a5, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f265855a5;
    public int Y4 = 0;
    public android.animation.ObjectAnimator Z4 = null;

    /* renamed from: b5, reason: collision with root package name */
    public boolean f265856b5 = true;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357, tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        super.C3(str, str2, list, oVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public void E9() {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 mo81005xdc5215a6 = this.F4.mo81005xdc5215a6();
        if (mo81005xdc5215a6 != null) {
            mo81005xdc5215a6.e();
            mo81005xdc5215a6.m80966xdb574fcd().setEllipsize(null);
            mo81005xdc5215a6.m80966xdb574fcd().setKeyListener(new android.text.method.TextKeyListener(android.text.method.TextKeyListener.Capitalize.NONE, false));
            if (!mo81005xdc5215a6.k()) {
                mo81005xdc5215a6.m();
                mo26063x7b383410();
            }
            mo81005xdc5215a6.m80989x764b0e09(ha());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357, tj5.n
    public boolean G0() {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22484x63a3bec1 c22484x63a3bec1 = this.F4;
        if (c22484x63a3bec1 != null) {
            c22484x63a3bec1.mo81005xdc5215a6().d();
        }
        int intExtra = getIntent().getIntExtra(com.p314xaae8f345.mm.ui.w2.f292734n, 0);
        if (intExtra != 0 && (stringArrayListExtra = getIntent().getStringArrayListExtra(com.p314xaae8f345.mm.ui.w2.f292735o)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(intExtra, stringArrayListExtra);
        }
        super.G0();
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public void I9() {
        G0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public java.lang.String K9() {
        return this.F4.mo81005xdc5215a6().m80978xc3706fda();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public int L9() {
        return this.Y4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public android.graphics.drawable.Drawable M9(int i17) {
        return this.f265788l4 ? getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80357xc7839d17) : super.M9(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public void R9() {
        ma(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74
    public void da(java.lang.String str) {
        if (this.F4.mo81005xdc5215a6() != null) {
            this.F4.mo81005xdc5215a6().p(str, null, tj5.o.UserInput, false, true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceUIMode */
    public int mo48756xbf6603cc() {
        if (this.J4) {
            return 1;
        }
        return super.mo48756xbf6603cc();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00df  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String ha() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19389x16789445.ha():java.lang.String");
    }

    public void ma(int i17) {
        android.view.View view = this.W4;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSearchTabWebViewUI", "setFtsVoiceBtnsLayoutVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSearchTabWebViewUI", "setFtsVoiceBtnsLayoutVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357, tj5.y
    /* renamed from: onClickCancelBtn */
    public void mo74458x91b34899(android.view.View view) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265779c4);
        java.util.HashMap hashMap = this.f265794s4;
        if (K0) {
            hashMap.put("query", N9());
        } else {
            hashMap.put("query", this.f265779c4);
        }
        hashMap.put("exittype", "5");
        super.mo74458x91b34899(view);
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357, tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 j3Var;
        super.mo56570x81f2906b(view);
        if (!this.V4 || (j3Var = this.X4) == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = j3Var.B;
        n3Var.mo50303x856b99f0(1);
        n3Var.mo50307xb9e94560(1, 0L);
        j3Var.D = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        boolean z17 = false;
        if (fp.h.c(23)) {
            if (this.J4) {
                Q8(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u), false);
            } else {
                Q8(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), !com.p314xaae8f345.mm.ui.bk.C());
            }
        }
        if (this.J4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSSearchTabWebViewUI", "isforceShowNightMode.");
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22484x63a3bec1 c22484x63a3bec1 = this.F4;
            if (c22484x63a3bec1 != null && c22484x63a3bec1.mo81005xdc5215a6() != null) {
                this.F4.mo81005xdc5215a6().f291348f.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
        }
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20684x722a90ef()) == 1 && j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20672x8f1bd40b()) <= 0 && !com.p314xaae8f345.mm.ui.bk.U()) {
            z17 = true;
        }
        this.V4 = z17;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(this);
            this.f265855a5 = f5Var;
            f5Var.f291933e = this;
            this.W4 = findViewById(com.p314xaae8f345.mm.R.id.f566608rq1);
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                this.W4.setBackgroundColor(-13619152);
            } else {
                this.W4.setBackgroundColor(-855310);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 j3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3(mo55332x76847179(), new java.lang.ref.WeakReference(this));
            this.X4 = j3Var;
            j3Var.e(mo55332x76847179(), this.W4);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 j3Var;
        z21.e eVar;
        if (this.V4 && (j3Var = this.X4) != null && (eVar = j3Var.A) != null) {
            eVar.mo48278xae7a2e7a(true);
            j3Var.A = null;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f265855a5;
        if (f5Var != null) {
            f5Var.d();
            this.f265855a5.f291933e = null;
        }
        ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).hj(this.K4, this.B3, new org.json.JSONObject(this.f265794s4));
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        su4.k3.l();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f265855a5;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59;
        if (this.J4 && (c22633x83752a59 = this.f265348f) != null) {
            c22633x83752a59.mo120153xd15cf999().B(2);
        }
        super.onResume();
        su4.k3.f494512a.f494499c = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f265855a5;
        if (f5Var != null) {
            f5Var.f();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f265855a5;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void q8(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f265348f;
        if (c22633x83752a59 == null || c22633x83752a59.mo120153xd15cf999() == null) {
            return;
        }
        mo55332x76847179().getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
        float b17 = j65.c.b(mo55332x76847179());
        if (b17 >= i65.a.v(mo55332x76847179())) {
            this.f265348f.mo120153xd15cf999().O(140);
            return;
        }
        if (b17 >= i65.a.u(mo55332x76847179())) {
            this.f265348f.mo120153xd15cf999().O(140);
            return;
        }
        if (b17 >= i65.a.t(mo55332x76847179())) {
            this.f265348f.mo120153xd15cf999().O(140);
            return;
        }
        if (b17 >= i65.a.s(mo55332x76847179())) {
            this.f265348f.mo120153xd15cf999().O(130);
            return;
        }
        if (b17 >= i65.a.z(mo55332x76847179())) {
            this.f265348f.mo120153xd15cf999().O(120);
            return;
        }
        if (b17 >= i65.a.w(mo55332x76847179())) {
            this.f265348f.mo120153xd15cf999().O(110);
            return;
        }
        i65.a.x(mo55332x76847179());
        if (b17 >= 1.0f) {
            this.f265348f.mo120153xd15cf999().O(100);
        } else if (b17 >= i65.a.y(mo55332x76847179())) {
            this.f265348f.mo120153xd15cf999().O(90);
        } else {
            this.f265348f.mo120153xd15cf999().O(80);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        android.animation.ObjectAnimator objectAnimator = this.Z4;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.Z4.cancel();
        }
        android.view.View view = this.W4;
        if (view == null) {
            return;
        }
        this.Y4 = i17;
        if (i17 > 0) {
            if (view.getTranslationY() != 0.0f) {
                view.setTranslationY(0.0f);
            }
            this.Z4 = android.animation.ObjectAnimator.ofFloat(view, "translationY", 0.0f, -i17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F4.mo81005xdc5215a6().m80978xc3706fda())) {
                ma(0);
            }
        } else {
            this.Z4 = android.animation.ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), 0.0f);
            ma(8);
        }
        this.Z4.setDuration(200L);
        this.Z4.setInterpolator(new y3.b());
        this.Z4.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.C19390xf9eed57c());
        this.Z4.start();
    }
}
