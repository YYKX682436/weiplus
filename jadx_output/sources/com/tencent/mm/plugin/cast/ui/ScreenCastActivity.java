package com.tencent.mm.plugin.cast.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/cast/ui/ScreenCastActivity;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-cast_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ScreenCastActivity extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f95487q = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f95488d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f95489e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f95490f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f95491g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f95492h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ProgressBar f95493i;

    /* renamed from: n, reason: collision with root package name */
    public int f95495n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f95496o;

    /* renamed from: m, reason: collision with root package name */
    public final int f95494m = 1000;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f95497p = jz5.h.b(new av1.u(this));

    public final qu1.a T6() {
        return (qu1.a) ((jz5.n) this.f95497p).getValue();
    }

    public final void U6() {
        android.widget.Button button = this.f95488d;
        if (button != null) {
            button.setOnClickListener(new av1.m(this));
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mb6);
        if (findViewById != null) {
            findViewById.setOnClickListener(new av1.n(this));
        }
    }

    public final void V6() {
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.RECORD_AUDIO"}, 148, "", "")) {
            if (nu1.n.f340170e == null) {
                nu1.n.f340170e = new tu1.o();
            }
            tu1.o oVar = nu1.n.f340170e;
            if (oVar != null) {
                av1.q qVar = new av1.q(this);
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastManager", "initScreenCastMgr");
                qVar.invoke(xu1.c.f457191e);
                oVar.f422128s = qVar;
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("MicroMsg.ScreenCastManager_DataSender", 5);
                oVar.f422118i = handlerThread;
                handlerThread.start();
                android.os.HandlerThread handlerThread2 = oVar.f422118i;
                if (handlerThread2 != null) {
                    oVar.f422119j = new com.tencent.mm.sdk.platformtools.n3(handlerThread2.getLooper(), new tu1.h(oVar));
                }
                oVar.f422126q = new wu1.c();
                oVar.b();
            }
        }
    }

    public final void W6() {
        stopService(new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.cast.service.ScreenCastForegroundService.class));
        this.f95496o = false;
        if (nu1.n.f340170e == null) {
            nu1.n.f340170e = new tu1.o();
        }
        tu1.o oVar = nu1.n.f340170e;
        if (oVar != null) {
            oVar.d();
        }
    }

    public final void X6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastActivity", "switchIconStatus status is " + i17);
        ((ku5.t0) ku5.t0.f312615d).B(new av1.t(this, i17));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488377ro;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        pu1.b bVar;
        java.util.List list;
        super.initView();
        this.f95491g = T6().f366741d;
        this.f95492h = T6().f366742e;
        this.f95493i = T6().f366740c;
        this.f95488d = T6().f366743f;
        this.f95489e = T6().f366744g;
        android.widget.TextView textView = T6().f366739b;
        this.f95490f = T6().f366745h;
        U6();
        if (nu1.n.f340170e == null) {
            nu1.n.f340170e = new tu1.o();
        }
        tu1.o oVar = nu1.n.f340170e;
        xu1.c cVar = oVar != null ? oVar.f422127r : null;
        if (cVar == null) {
            if (nu1.n.f340170e == null) {
                nu1.n.f340170e = new tu1.o();
            }
            tu1.o oVar2 = nu1.n.f340170e;
            if ((oVar2 == null || (bVar = oVar2.f422110a) == null || (list = bVar.f358420q) == null || !(list.isEmpty() ^ true)) ? false : true) {
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
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastActivity", "trans to pc timeout");
            X6(2);
            return;
        }
        if (ordinal == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastActivity", "trans to pc ERROR");
            X6(5);
            return;
        }
        if (nu1.n.f340170e == null) {
            nu1.n.f340170e = new tu1.o();
        }
        tu1.o oVar3 = nu1.n.f340170e;
        if (!((oVar3 == null || oVar3.f422120k) ? false : true)) {
            X6(4);
            return;
        }
        android.widget.TextView textView2 = this.f95490f;
        if (textView2 != null) {
            textView2.setText(getString(com.tencent.mm.R.string.ibw));
        }
        X6(3);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == this.f95494m) {
            boolean z17 = false;
            if (i18 != -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastActivity", "User cancelled");
                com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markClickPermissionCancelReport");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 6L, 1L);
                if (nu1.n.f340170e == null) {
                    nu1.n.f340170e = new tu1.o();
                }
                tu1.o oVar = nu1.n.f340170e;
                if (oVar != null) {
                    oVar.f422120k = false;
                }
                if (nu1.n.f340170e == null) {
                    nu1.n.f340170e = new tu1.o();
                }
                tu1.o oVar2 = nu1.n.f340170e;
                if (oVar2 != null) {
                    oVar2.d();
                }
                initView();
                return;
            }
            if (intent != null) {
                this.f95496o = false;
                if (nu1.n.f340170e == null) {
                    nu1.n.f340170e = new tu1.o();
                }
                tu1.o oVar3 = nu1.n.f340170e;
                if (oVar3 != null) {
                    oVar3.f422120k = true;
                }
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.ScreenCastActivity", "bindScreenCastForegroundIfNeed", new java.lang.Object[0]);
                if (!this.f95496o) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("code", i18);
                    intent2.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, intent);
                    intent2.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.cast.service.ScreenCastForegroundService.class);
                    try {
                        if (fp.h.c(26)) {
                            com.tencent.mm.sdk.platformtools.x2.f193071a.startForegroundService(intent2);
                        } else {
                            com.tencent.mm.sdk.platformtools.x2.f193071a.startService(intent2);
                        }
                        z17 = true;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScreenCastActivity", e17, "using start service to bindVoipForegroundIfNeed error: %s", e17.getMessage());
                        try {
                            if (fp.h.c(26)) {
                                com.tencent.mm.sdk.platformtools.x2.f193071a.startForegroundService(intent2);
                            } else {
                                com.tencent.mm.sdk.platformtools.x2.f193071a.startService(intent2);
                            }
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScreenCastActivity", e18, "using start foreground service to bindVoipForegroundIfNeed error: %s", e18.getMessage());
                        }
                    }
                    if (z17) {
                        this.f95496o = true;
                    }
                }
                initView();
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastActivity", "Started screen recording");
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(this).length() == 0) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211729s = getContext().getString(com.tencent.mm.R.string.awt);
            aVar.A = false;
            aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.i2a);
            aVar.E = new av1.o(this);
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            j0Var.show();
            com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markScreenCastFailedCauseNotFinderUserReport");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 1L, 1L);
        } else {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screen_cast_pc_forbidden, false)) {
                androidx.appcompat.app.AppCompatActivity context2 = getContext();
                com.tencent.mm.ui.widget.dialog.a aVar2 = new com.tencent.mm.ui.widget.dialog.a();
                aVar2.f211729s = getContext().getString(com.tencent.mm.R.string.awr);
                aVar2.A = false;
                aVar2.f211732v = of5.b.a(context2).getString(com.tencent.mm.R.string.i2a);
                aVar2.E = new av1.p(this);
                com.tencent.mm.ui.widget.dialog.j0 j0Var2 = new com.tencent.mm.ui.widget.dialog.j0(context2, com.tencent.mm.R.style.f494791wd);
                j0Var2.e(aVar2);
                com.tencent.mm.ui.widget.dialog.d0 d0Var2 = aVar2.f211723m;
                if (d0Var2 != null) {
                    d0Var2.a(j0Var2.f211837r);
                }
                j0Var2.show();
            } else {
                if (nu1.n.f340170e == null) {
                    nu1.n.f340170e = new tu1.o();
                }
                tu1.o oVar = nu1.n.f340170e;
                if ((oVar != null ? oVar.f422110a : null) == null) {
                    finish();
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CastReportHelper", "markEnterScreenCastReport");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1634L, 0L, 1L);
                    initView();
                }
            }
        }
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (nu1.n.f340170e == null) {
            nu1.n.f340170e = new tu1.o();
        }
        tu1.o oVar = nu1.n.f340170e;
        if ((oVar != null ? oVar.f422127r : null) != xu1.c.f457192f) {
            W6();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        if (i17 == this.f95494m) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                V6();
            }
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
