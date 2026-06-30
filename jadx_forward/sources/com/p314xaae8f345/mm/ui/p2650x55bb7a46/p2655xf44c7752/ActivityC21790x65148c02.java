package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.ui.chatting.gallery.MediaHistoryListUI */
/* loaded from: classes9.dex */
public class ActivityC21790x65148c02 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements zb5.i {

    /* renamed from: d, reason: collision with root package name */
    public zb5.h f282296d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f282297e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f282298f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f282299g;

    /* renamed from: h, reason: collision with root package name */
    public android.app.ProgressDialog f282300h;

    /* renamed from: i, reason: collision with root package name */
    public a31.v f282301i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f282302m = false;

    @Override // zb5.i
    public void A(boolean z17, int i17) {
        U6(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryListUI", "[onDataLoaded] isFirst:%s addCount:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            this.f282298f.setVisibility(0);
            this.f282299g.setVisibility(8);
            this.f282298f.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5e));
        } else {
            this.f282298f.setVisibility(8);
            this.f282299g.setVisibility(0);
            this.f282299g.mo7946xf939df19().m8146xced61ae5();
        }
    }

    @Override // zb5.i
    public void P(boolean z17) {
        U6(true);
    }

    public final int T6(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("key_media_type", -1);
        if (intExtra == 2) {
            return 1;
        }
        int i17 = 3;
        if (intExtra == 3) {
            return 2;
        }
        if (intExtra != 4) {
            i17 = 5;
            if (intExtra == 5) {
                return 4;
            }
            if (intExtra != 6) {
                switch (intExtra) {
                    case 102:
                        return 11;
                    case 103:
                        return 12;
                    case 104:
                        return 8;
                    case 105:
                        return 9;
                    case 106:
                        return 10;
                    default:
                        return 0;
                }
            }
        }
        return i17;
    }

    public final void U6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryListUI", "[setProgress] isVisible:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f282300h = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, 0, null);
            return;
        }
        android.app.ProgressDialog progressDialog = this.f282300h;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f282300h.dismiss();
        this.f282300h = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bxc;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f282302m = getIntent().getBooleanExtra("detail_user_dismiss", false);
        a31.v vVar = new a31.v();
        this.f282301i = vVar;
        vVar.c(false);
        a31.v vVar2 = this.f282301i;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y) this.f282296d;
        yVar.getClass();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.t tVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.t(yVar);
        vVar2.f82532u = tVar;
        vVar2.f291857i = tVar;
        this.f282301i.f82529r = false;
        this.f282298f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mf6);
        this.f282299g = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.h0u);
        findViewById(com.p314xaae8f345.mm.R.id.ch8).setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        this.f282299g.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f282299g;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y) this.f282296d;
        if (yVar2.f284078h == null) {
            yVar2.f284078h = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
        }
        c1163xf1deaba4.mo7967x900dcbe1(yVar2.f284078h);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f282299g;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar3 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y) this.f282296d;
        yVar3.getClass();
        c1163xf1deaba42.N(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p(yVar3));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f282299g;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar4 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y) this.f282296d;
        yVar4.f284075e = this.f282297e;
        yVar4.f284077g = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k0(yVar4.f284074d, yVar4);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k0.f279963f = yVar4.i();
        c1163xf1deaba43.mo7960x6cab2c8d(yVar4.f284077g);
        this.f282299g.m7963x830bc99d(true);
        mo54450xbf7c1df6(this.f282296d.g());
    }

    @Override // zb5.i
    public void j0(java.lang.String str, boolean z17, int i17) {
        if (z17) {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5g, str);
            this.f282298f.setVisibility(0);
            this.f282299g.setVisibility(8);
            android.widget.TextView textView = this.f282298f;
            textView.setText(o13.q.c(textView.getContext(), string, str));
        } else {
            this.f282298f.setVisibility(8);
            this.f282299g.setVisibility(0);
        }
        de5.a aVar = de5.a.f310929a;
        aVar.l(str);
        aVar.j(4, T6(getIntent()));
        int T6 = T6(getIntent());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "reportVerticalResultExpose  >> resultCnt: " + i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370 a17 = aVar.a();
        a17.f141819f = 7L;
        a17.f141817d = a17.b("sessionid", de5.a.f310930b, true);
        a17.f141834u = T6;
        a17.f141827n = i17;
        a17.p(de5.a.f310934f);
        a17.k();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.b
    public void l2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z zVar) {
        this.f282296d = (zb5.h) zVar;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y z0Var;
        super.onCreate(bundle);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.f563968ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        this.f282297e = getIntent().getStringExtra("kintent_talker");
        int intExtra = getIntent().getIntExtra("key_media_type", -1);
        if (intExtra == 2) {
            z0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0(this);
        } else if (intExtra == 3) {
            z0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c6(this);
        } else if (intExtra == 4) {
            z0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3(this);
        } else if (intExtra == 5) {
            z0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y4(this);
        } else if (intExtra != 6) {
            switch (intExtra) {
                case 102:
                    z0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6(this);
                    break;
                case 103:
                    z0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1(this);
                    break;
                case 104:
                    z0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5(this);
                    break;
                case 105:
                    z0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l2(this);
                    break;
                case 106:
                    z0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m4(this);
                    break;
                default:
                    z0Var = null;
                    break;
            }
        } else {
            z0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n(this);
        }
        if (z0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaHistoryListUI", "[onCreate] presenter is null!");
            return;
        }
        z0Var.f284076f = this;
        l2(z0Var);
        mo64405x4dab7448(b3.l.m9702x7444d5ad(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        mo78530x8b45058f();
        mo43517x10010bd5();
        this.f282296d.a(true);
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f282297e);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 W0 = ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).W0(this.f282297e);
        if (R4) {
            if (ez.v0.f339310a.j(java.lang.Integer.valueOf(this.f282296d.mo79812xfb85f7b0()))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[9];
                objArr[0] = 0;
                objArr[1] = 0;
                objArr[2] = 0;
                objArr[3] = 0;
                objArr[4] = 1;
                objArr[5] = 0;
                objArr[6] = 0;
                objArr[7] = java.lang.Integer.valueOf(W0.A0().size());
                objArr[8] = java.lang.Integer.valueOf(this.f282302m ? 2 : 1);
                g0Var.d(14569, objArr);
                return;
            }
            if (this.f282296d.mo79812xfb85f7b0() == -1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr2 = new java.lang.Object[9];
                objArr2[0] = 0;
                objArr2[1] = 0;
                objArr2[2] = 0;
                objArr2[3] = 0;
                objArr2[4] = 0;
                objArr2[5] = 1;
                objArr2[6] = 0;
                objArr2[7] = java.lang.Integer.valueOf(W0.A0().size());
                objArr2[8] = java.lang.Integer.valueOf(this.f282302m ? 2 : 1);
                g0Var2.d(14569, objArr2);
                return;
            }
            if (this.f282296d.mo79812xfb85f7b0() == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr3 = new java.lang.Object[9];
                objArr3[0] = 0;
                objArr3[1] = 0;
                objArr3[2] = 0;
                objArr3[3] = 0;
                objArr3[4] = 0;
                objArr3[5] = 0;
                objArr3[6] = 1;
                objArr3[7] = java.lang.Integer.valueOf(W0.A0().size());
                objArr3[8] = java.lang.Integer.valueOf(this.f282302m ? 2 : 1);
                g0Var3.d(14569, objArr3);
                return;
            }
            if (this.f282296d.mo79812xfb85f7b0() == 5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr4 = new java.lang.Object[10];
                objArr4[0] = 0;
                objArr4[1] = 0;
                objArr4[2] = 0;
                objArr4[3] = 0;
                objArr4[4] = 0;
                objArr4[5] = 0;
                objArr4[6] = 0;
                objArr4[7] = java.lang.Integer.valueOf(W0.A0().size());
                objArr4[8] = java.lang.Integer.valueOf(this.f282302m ? 2 : 1);
                objArr4[9] = 1;
                g0Var4.d(14569, objArr4);
                return;
            }
            if (this.f282296d.mo79812xfb85f7b0() == 33) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var5 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr5 = new java.lang.Object[11];
                objArr5[0] = 0;
                objArr5[1] = 0;
                objArr5[2] = 0;
                objArr5[3] = 0;
                objArr5[4] = 0;
                objArr5[5] = 0;
                objArr5[6] = 0;
                objArr5[7] = java.lang.Integer.valueOf(W0.A0().size());
                objArr5[8] = java.lang.Integer.valueOf(this.f282302m ? 2 : 1);
                objArr5[9] = 0;
                objArr5[10] = 8;
                g0Var5.d(14569, objArr5);
                return;
            }
            return;
        }
        if (ez.v0.f339310a.j(java.lang.Integer.valueOf(this.f282296d.mo79812xfb85f7b0()))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var6 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr6 = new java.lang.Object[9];
            objArr6[0] = 0;
            objArr6[1] = 0;
            objArr6[2] = 0;
            objArr6[3] = 0;
            objArr6[4] = 1;
            objArr6[5] = 0;
            objArr6[6] = 0;
            objArr6[7] = 0;
            objArr6[8] = java.lang.Integer.valueOf(this.f282302m ? 2 : 0);
            g0Var6.d(14569, objArr6);
            return;
        }
        if (this.f282296d.mo79812xfb85f7b0() == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var7 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr7 = new java.lang.Object[9];
            objArr7[0] = 0;
            objArr7[1] = 0;
            objArr7[2] = 0;
            objArr7[3] = 0;
            objArr7[4] = 0;
            objArr7[5] = 1;
            objArr7[6] = 0;
            objArr7[7] = 0;
            objArr7[8] = java.lang.Integer.valueOf(this.f282302m ? 2 : 0);
            g0Var7.d(14569, objArr7);
            return;
        }
        if (this.f282296d.mo79812xfb85f7b0() == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var8 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr8 = new java.lang.Object[9];
            objArr8[0] = 0;
            objArr8[1] = 0;
            objArr8[2] = 0;
            objArr8[3] = 0;
            objArr8[4] = 0;
            objArr8[5] = 0;
            objArr8[6] = 1;
            objArr8[7] = 0;
            objArr8[8] = java.lang.Integer.valueOf(this.f282302m ? 2 : 0);
            g0Var8.d(14569, objArr8);
            return;
        }
        if (this.f282296d.mo79812xfb85f7b0() == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var9 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr9 = new java.lang.Object[10];
            objArr9[0] = 0;
            objArr9[1] = 0;
            objArr9[2] = 0;
            objArr9[3] = 0;
            objArr9[4] = 0;
            objArr9[5] = 0;
            objArr9[6] = 0;
            objArr9[7] = 0;
            objArr9[8] = java.lang.Integer.valueOf(this.f282302m ? 2 : 0);
            objArr9[9] = 1;
            g0Var9.d(14569, objArr9);
            return;
        }
        if (this.f282296d.mo79812xfb85f7b0() == 33) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var10 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr10 = new java.lang.Object[11];
            objArr10[0] = 0;
            objArr10[1] = 0;
            objArr10[2] = 0;
            objArr10[3] = 0;
            objArr10[4] = 0;
            objArr10[5] = 0;
            objArr10[6] = 0;
            objArr10[7] = 0;
            objArr10[8] = java.lang.Integer.valueOf(this.f282302m ? 2 : 0);
            objArr10[9] = 0;
            objArr10[10] = 8;
            g0Var10.d(14569, objArr10);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        a31.v vVar = this.f282301i;
        if (vVar == null) {
            return false;
        }
        vVar.j(this, menu);
        a31.v vVar2 = this.f282301i;
        java.lang.String b17 = this.f282296d.b();
        if (vVar2.f291856h != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            vVar2.f291856h.mo81062x7d60453d(b17);
        }
        m78513xc2a54588().postDelayed(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.bb(this), 200L);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f282296d.mo79813x3f5eee52();
        de5.a aVar = de5.a.f310929a;
        aVar.l("");
        aVar.j(21, T6(getIntent()));
    }

    @Override // zb5.i
    /* renamed from: onFinish */
    public void mo79578x42fe6352() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryListUI", "[onRefreshed]");
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        finish();
        overridePendingTransition(0, 0);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onKeyboardStateChanged */
    public void mo54561x62d1e2e9() {
        super.mo54561x62d1e2e9();
        if (mo70705x8200b8ea() == 2) {
            this.f282301i.a();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        this.f282301i.m(this, menu);
        return true;
    }
}
