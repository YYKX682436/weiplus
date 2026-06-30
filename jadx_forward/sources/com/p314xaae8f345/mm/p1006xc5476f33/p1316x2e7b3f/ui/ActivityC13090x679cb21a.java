package com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/cast/ui/ScreenCastActivity;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-cast_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.cast.ui.ScreenCastActivity */
/* loaded from: classes3.dex */
public final class ActivityC13090x679cb21a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f177020q = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f177021d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f177022e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f177023f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f177024g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f177025h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ProgressBar f177026i;

    /* renamed from: n, reason: collision with root package name */
    public int f177028n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f177029o;

    /* renamed from: m, reason: collision with root package name */
    public final int f177027m = 1000;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f177030p = jz5.h.b(new av1.u(this));

    public final qu1.a T6() {
        return (qu1.a) ((jz5.n) this.f177030p).mo141623x754a37bb();
    }

    public final void U6() {
        android.widget.Button button = this.f177021d;
        if (button != null) {
            button.setOnClickListener(new av1.m(this));
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mb6);
        if (findViewById != null) {
            findViewById.setOnClickListener(new av1.n(this));
        }
    }

    public final void V6() {
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.RECORD_AUDIO"}, 148, "", "")) {
            if (nu1.n.f421703e == null) {
                nu1.n.f421703e = new tu1.o();
            }
            tu1.o oVar = nu1.n.f421703e;
            if (oVar != null) {
                av1.q qVar = new av1.q(this);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastManager", "initScreenCastMgr");
                qVar.mo146xb9724478(xu1.c.f538724e);
                oVar.f503661s = qVar;
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("MicroMsg.ScreenCastManager_DataSender", 5);
                oVar.f503651i = handlerThread;
                handlerThread.start();
                android.os.HandlerThread handlerThread2 = oVar.f503651i;
                if (handlerThread2 != null) {
                    oVar.f503652j = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(handlerThread2.getLooper(), new tu1.h(oVar));
                }
                oVar.f503659q = new wu1.c();
                oVar.b();
            }
        }
    }

    public final void W6() {
        stopService(new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.p1318x7643c6b5.ServiceC13083xe7c89147.class));
        this.f177029o = false;
        if (nu1.n.f421703e == null) {
            nu1.n.f421703e = new tu1.o();
        }
        tu1.o oVar = nu1.n.f421703e;
        if (oVar != null) {
            oVar.d();
        }
    }

    public final void X6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastActivity", "switchIconStatus status is " + i17);
        ((ku5.t0) ku5.t0.f394148d).B(new av1.t(this, i17));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569910ro;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        pu1.b bVar;
        java.util.List list;
        super.mo43517x10010bd5();
        this.f177024g = T6().f448274d;
        this.f177025h = T6().f448275e;
        this.f177026i = T6().f448273c;
        this.f177021d = T6().f448276f;
        this.f177022e = T6().f448277g;
        android.widget.TextView textView = T6().f448272b;
        this.f177023f = T6().f448278h;
        U6();
        if (nu1.n.f421703e == null) {
            nu1.n.f421703e = new tu1.o();
        }
        tu1.o oVar = nu1.n.f421703e;
        xu1.c cVar = oVar != null ? oVar.f503660r : null;
        if (cVar == null) {
            if (nu1.n.f421703e == null) {
                nu1.n.f421703e = new tu1.o();
            }
            tu1.o oVar2 = nu1.n.f421703e;
            if ((oVar2 == null || (bVar = oVar2.f503643a) == null || (list = bVar.f439953q) == null || !(list.isEmpty() ^ true)) ? false : true) {
                X6(3);
                return;
            } else {
                X6(7);
                W6();
                return;
            }
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            X6(3);
            W6();
            return;
        }
        if (ordinal == 2) {
            X6(4);
            return;
        }
        if (ordinal == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastActivity", "trans to pc timeout");
            X6(2);
            return;
        }
        if (ordinal == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastActivity", "trans to pc ERROR");
            X6(5);
            return;
        }
        if (nu1.n.f421703e == null) {
            nu1.n.f421703e = new tu1.o();
        }
        tu1.o oVar3 = nu1.n.f421703e;
        if (!((oVar3 == null || oVar3.f503653k) ? false : true)) {
            X6(4);
            return;
        }
        android.widget.TextView textView2 = this.f177023f;
        if (textView2 != null) {
            textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibw));
        }
        X6(3);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == this.f177027m) {
            boolean z17 = false;
            if (i18 != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastActivity", "User cancelled");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markClickPermissionCancelReport");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 6L, 1L);
                if (nu1.n.f421703e == null) {
                    nu1.n.f421703e = new tu1.o();
                }
                tu1.o oVar = nu1.n.f421703e;
                if (oVar != null) {
                    oVar.f503653k = false;
                }
                if (nu1.n.f421703e == null) {
                    nu1.n.f421703e = new tu1.o();
                }
                tu1.o oVar2 = nu1.n.f421703e;
                if (oVar2 != null) {
                    oVar2.d();
                }
                mo43517x10010bd5();
                return;
            }
            if (intent != null) {
                this.f177029o = false;
                if (nu1.n.f421703e == null) {
                    nu1.n.f421703e = new tu1.o();
                }
                tu1.o oVar3 = nu1.n.f421703e;
                if (oVar3 != null) {
                    oVar3.f503653k = true;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.ScreenCastActivity", "bindScreenCastForegroundIfNeed", new java.lang.Object[0]);
                if (!this.f177029o) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("code", i18);
                    intent2.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, intent);
                    intent2.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.p1318x7643c6b5.ServiceC13083xe7c89147.class);
                    try {
                        if (fp.h.c(26)) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.startForegroundService(intent2);
                        } else {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.startService(intent2);
                        }
                        z17 = true;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScreenCastActivity", e17, "using start service to bindVoipForegroundIfNeed error: %s", e17.getMessage());
                        try {
                            if (fp.h.c(26)) {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.startForegroundService(intent2);
                            } else {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.startService(intent2);
                            }
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScreenCastActivity", e18, "using start foreground service to bindVoipForegroundIfNeed error: %s", e18.getMessage());
                        }
                    }
                    if (z17) {
                        this.f177029o = true;
                    }
                }
                mo43517x10010bd5();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastActivity", "Started screen recording");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(this).length() == 0) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293262s = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.awt);
            aVar.A = false;
            aVar.f293265v = of5.b.a(mo55332x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2a);
            aVar.E = new av1.o(this);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            j0Var.show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markScreenCastFailedCauseNotFinderUserReport");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 1L, 1L);
        } else {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screen_cast_pc_forbidden, false)) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                aVar2.f293262s = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.awr);
                aVar2.A = false;
                aVar2.f293265v = of5.b.a(mo55332x768471792).getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2a);
                aVar2.E = new av1.p(this);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x768471792, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                j0Var2.e(aVar2);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var2 = aVar2.f293256m;
                if (d0Var2 != null) {
                    d0Var2.a(j0Var2.f293370r);
                }
                j0Var2.show();
            } else {
                if (nu1.n.f421703e == null) {
                    nu1.n.f421703e = new tu1.o();
                }
                tu1.o oVar = nu1.n.f421703e;
                if ((oVar != null ? oVar.f503643a : null) == null) {
                    finish();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markEnterScreenCastReport");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 0L, 1L);
                    mo43517x10010bd5();
                }
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (nu1.n.f421703e == null) {
            nu1.n.f421703e = new tu1.o();
        }
        tu1.o oVar = nu1.n.f421703e;
        if ((oVar != null ? oVar.f503660r : null) != xu1.c.f538725f) {
            W6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        if (i17 == this.f177027m) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                V6();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }
}
