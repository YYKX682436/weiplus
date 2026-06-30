package com.tencent.mm.feature.ecs.nirvana.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/feature/ecs/nirvana/ui/MagicEcsNirvanaUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "Lc00/h4;", "<init>", "()V", "plugin-nirvana_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public class MagicEcsNirvanaUI extends com.tencent.mm.ui.vas.VASActivity implements c00.h4 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f65834v = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f65836e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f65837f;

    /* renamed from: g, reason: collision with root package name */
    public p10.c0 f65838g;

    /* renamed from: h, reason: collision with root package name */
    public iq0.c f65839h;

    /* renamed from: n, reason: collision with root package name */
    public bw5.s7 f65842n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f65843o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f65844p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f65845q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f65846r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f65848t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView f65849u;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f65835d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f65840i = jz5.h.b(new p10.f0(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f65841m = jz5.h.b(new p10.m0(this));

    /* renamed from: s, reason: collision with root package name */
    public boolean f65847s = true;

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object U6(com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI.U6(com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.tencent.mm.feature.ecs.nirvana.mb.view.MagicEcsNirvanaCanvasViewContainer V6() {
        return (com.tencent.mm.feature.ecs.nirvana.mb.view.MagicEcsNirvanaCanvasViewContainer) ((jz5.n) this.f65840i).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI.W6():void");
    }

    public final void X6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaUI", "redrawCanvas");
        iq0.c cVar = this.f65839h;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ui(cVar, new com.tencent.mm.plugin.magicbrush.base.MBJsEventBase("redrawCanvas", ""));
        }
    }

    public final void Y6(boolean z17) {
        if (!fp.h.c(30)) {
            if (fp.h.c(21)) {
                if (!z17) {
                    getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-8193));
                    return;
                }
                getWindow().clearFlags(67108864);
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
                return;
            }
            return;
        }
        if (z17) {
            android.view.WindowInsetsController windowInsetsController = getWindow().getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.setSystemBarsAppearance(8, 8);
                return;
            }
            return;
        }
        android.view.WindowInsetsController windowInsetsController2 = getWindow().getDecorView().getWindowInsetsController();
        if (windowInsetsController2 != null) {
            windowInsetsController2.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return false;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish, enableEdgeSlideToClose:");
        bw5.s7 s7Var = this.f65842n;
        sb6.append(s7Var != null ? java.lang.Boolean.valueOf(s7Var.f32830i) : null);
        sb6.append(", launchAnimationType:");
        bw5.s7 s7Var2 = this.f65842n;
        sb6.append(s7Var2 != null ? java.lang.Integer.valueOf(s7Var2.f32829h) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaUI", sb6.toString());
        bw5.s7 s7Var3 = this.f65842n;
        int i17 = s7Var3 != null ? s7Var3.f32829h : 0;
        jz5.l lVar = i17 != 1 ? i17 != 2 ? new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.ui.uc.f211080c), java.lang.Integer.valueOf(com.tencent.mm.ui.uc.f211081d)) : new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.ui.uc.f211080c), java.lang.Integer.valueOf(com.tencent.mm.ui.uc.f211081d)) : new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.anim.f477728p), java.lang.Integer.valueOf(com.tencent.mm.R.anim.f477848d6));
        overridePendingTransition(((java.lang.Number) lVar.f302833d).intValue(), ((java.lang.Number) lVar.f302834e).intValue());
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isSupportNavigationSwipeBack, reason: from getter */
    public boolean getF65848t() {
        return this.f65848t;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean needResetStatusBarColorOnActivityCreate() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f65847s) {
            super.onBackPressed();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaUI", "onBackPressed, disable");
        iq0.c cVar = this.f65839h;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ui(cVar, new com.tencent.mm.plugin.magicbrush.base.MBJsEventBase("backPressed", ""));
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaUI", "onCreate");
        this.f65836e = java.lang.System.currentTimeMillis();
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("mbAppInfo");
        java.lang.String stringExtra = getIntent().getStringExtra("nativeExtraData");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f65845q = stringExtra;
        bw5.s7 s7Var = new bw5.s7();
        s7Var.parseFrom(byteArrayExtra);
        this.f65842n = s7Var;
        this.f65843o = java.lang.String.valueOf(s7Var.b());
        this.f65844p = java.lang.String.valueOf(s7Var.c());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initBizParams, bizName:");
        java.lang.String str = this.f65843o;
        if (str == null) {
            kotlin.jvm.internal.o.o("bizName");
            throw null;
        }
        sb6.append(str);
        sb6.append(", init params:");
        java.lang.String str2 = this.f65844p;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("initParams");
            throw null;
        }
        sb6.append(str2);
        sb6.append(", nativeExtraData:");
        java.lang.String str3 = this.f65845q;
        if (str3 == null) {
            kotlin.jvm.internal.o.o("nativeExtraData");
            throw null;
        }
        sb6.append(str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaUI", sb6.toString());
        bw5.s7 s7Var2 = this.f65842n;
        this.f65848t = s7Var2 != null ? s7Var2.f32830i : false;
        if (s7Var2 != null && s7Var2.f32837s) {
            int i18 = s7Var2 != null ? s7Var2.f32829h : 0;
            jz5.l lVar = i18 != 1 ? i18 != 2 ? new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.ui.uc.f211078a), java.lang.Integer.valueOf(com.tencent.mm.ui.uc.f211079b)) : new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.ui.uc.f211078a), java.lang.Integer.valueOf(com.tencent.mm.ui.uc.f211079b)) : new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.anim.f477843d1), java.lang.Integer.valueOf(com.tencent.mm.R.anim.f477728p));
            overridePendingTransition(((java.lang.Number) lVar.f302833d).intValue(), ((java.lang.Number) lVar.f302834e).intValue());
        } else {
            overridePendingTransition(0, 0);
        }
        super.onCreate(bundle);
        p10.c0 c0Var = new p10.c0(this, this.f65835d, new p10.l0(this));
        this.f65838g = c0Var;
        bw5.s7 s7Var3 = this.f65842n;
        long j17 = (s7Var3 == null || (i17 = s7Var3.f32838t) == 0) ? 500L : i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaLoadingComponent", "scheduleDelayedLoading, schedule loading with delay: " + j17 + "ms");
        p10.b0 b0Var = new p10.b0(c0Var);
        c0Var.f350936e = b0Var;
        com.tencent.mm.sdk.platformtools.n3 n3Var = c0Var.f350933b;
        if (j17 < 0) {
            n3Var.post(b0Var);
        } else {
            n3Var.postDelayed(b0Var, j17);
        }
        bw5.s7 s7Var4 = this.f65842n;
        if (s7Var4 != null && s7Var4.f32832n) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new p10.k0(this, null), 3, null);
        } else {
            W6();
        }
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(0);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setNavigationBarColor(0);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        int color = getResources().getColor(com.tencent.mm.R.color.f478489a);
        if (fp.h.c(21)) {
            getWindow().setNavigationBarColor(color);
        }
        boolean z17 = !com.tencent.mm.ui.bk.E(getResources());
        if (fp.h.c(30)) {
            if (z17) {
                android.view.WindowInsetsController windowInsetsController = getWindow().getDecorView().getWindowInsetsController();
                if (windowInsetsController != null) {
                    windowInsetsController.setSystemBarsAppearance(16, 16);
                }
            } else {
                android.view.WindowInsetsController windowInsetsController2 = getWindow().getDecorView().getWindowInsetsController();
                if (windowInsetsController2 != null) {
                    windowInsetsController2.setSystemBarsAppearance(0, 16);
                }
            }
        }
        Y6(!com.tencent.mm.ui.bk.E(getResources()));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaUI", "onDestroy");
        p10.c0 c0Var = this.f65838g;
        if (c0Var != null) {
            java.lang.Runnable runnable = c0Var.f350937f;
            com.tencent.mm.sdk.platformtools.n3 n3Var = c0Var.f350933b;
            n3Var.removeCallbacks(runnable);
            java.lang.Runnable runnable2 = c0Var.f350936e;
            if (runnable2 != null) {
                n3Var.removeCallbacks(runnable2);
            }
            c0Var.f350936e = null;
        }
        com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView = this.f65849u;
        if (magicDebugPanelView != null) {
            magicDebugPanelView.f65814d.removeCallbacksAndMessages(null);
            magicDebugPanelView.f65818h = null;
        }
        this.f65849u = null;
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaUI", "stopBiz");
        this.f65837f = false;
        iq0.c cVar = this.f65839h;
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaUI", "stopBiz, biz deactivate");
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ui(cVar, new com.tencent.mm.plugin.magicbrush.base.MBJsEventBase("pageExit", ""));
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Di(cVar);
            this.f65839h = null;
            com.tencent.mm.feature.ecs.nirvana.input.c0 textInputPlugin = V6().getTextInputPlugin();
            textInputPlugin.getClass();
            com.tencent.mars.xlog.Log.i("TextInputPlugin", "stopKeyboardHeightObserve");
            com.tencent.mm.ui.tools.f5 f5Var = textInputPlugin.f65744m;
            if (f5Var != null) {
                f5Var.d();
                textInputPlugin.f65744m.f210400e = null;
                textInputPlugin.f65744m = null;
            }
            com.tencent.mm.feature.ecs.nirvana.accessibility.l accessibilityChannel = V6().getAccessibilityChannel();
            accessibilityChannel.getClass();
            io.flutter.Log.i("AccessibilityChannel", "on detachMbBizHandle");
            accessibilityChannel.f65711b = null;
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaUI", "onResume");
        super.onResume();
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
        if (swipeBackLayout != null) {
            swipeBackLayout.setEnableGesture(this.f65848t);
        }
        X6();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View provideCustomActivityContentView() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaUI", "provideCustomActivityContentView");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        bw5.s7 s7Var = this.f65842n;
        if (s7Var != null && s7Var.f32837s) {
            frameLayout.setBackgroundColor(frameLayout.getResources().getColor(com.tencent.mm.R.color.f478489a));
        }
        frameLayout.addView(V6(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView((android.widget.FrameLayout) ((jz5.n) this.f65841m).getValue(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        int i17 = com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView.G;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mm.sdk.platformtools.s9.f192975c && ((qq.s) ((qq.c0) i95.n0.c(qq.c0.class))).Bi("EcsMBDebugPanel", 0) == 1) {
            com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView = new com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView(this, null, 0, 6, null);
            magicDebugPanelView.setParentView(V6());
            iq0.c cVar = this.f65839h;
            if (cVar != null) {
                java.lang.String str2 = this.f65843o;
                if (str2 == null) {
                    kotlin.jvm.internal.o.o("bizName");
                    throw null;
                }
                magicDebugPanelView.f65818h = cVar;
                magicDebugPanelView.f65819i = str2;
            }
            this.f65849u = magicDebugPanelView;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388629;
            frameLayout.addView(magicDebugPanelView, layoutParams);
        }
        return frameLayout;
    }
}
