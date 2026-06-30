package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class i extends com.p314xaae8f345.p362xadfe2b3.ui.a {

    /* renamed from: b, reason: collision with root package name */
    public volatile com.p314xaae8f345.p362xadfe2b3.ui.f f127702b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f127703c;

    /* renamed from: f, reason: collision with root package name */
    public volatile android.view.View f127706f;

    /* renamed from: g, reason: collision with root package name */
    public volatile android.app.Activity f127707g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f127708h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f127709i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f127711k;

    /* renamed from: l, reason: collision with root package name */
    public int f127712l;

    /* renamed from: m, reason: collision with root package name */
    public int f127713m;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f127714n;

    /* renamed from: o, reason: collision with root package name */
    public volatile int f127715o;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f127704d = new android.graphics.Rect();

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f127705e = new android.graphics.Rect();

    /* renamed from: j, reason: collision with root package name */
    public boolean f127710j = false;

    /* JADX WARN: Multi-variable type inference failed */
    public i(android.app.Activity activity) {
        this.f127711k = true;
        this.f127707g = activity;
        this.f127658a = activity;
        kd.c.c("LiteApp.KeyBoardHeightChangeObs", "setActivity: activity:%s", activity);
        if (activity instanceof p012xc85e97e9.p093xedfae76a.y) {
            ((p012xc85e97e9.p093xedfae76a.y) activity).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.liteapp.ui.KeyboardHeightProvider$1
                @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                /* renamed from: onDestroy */
                public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y yVar) {
                    kd.c.c("LiteApp.KeyboardHeightProvider", "onDestroy: addObserver ", new java.lang.Object[0]);
                    com.p314xaae8f345.p362xadfe2b3.ui.i.this.c();
                    com.p314xaae8f345.p362xadfe2b3.ui.i.this.f127707g = null;
                }
            });
        } else {
            kd.c.e("LiteApp.KeyboardHeightProvider", "KeyboardHeightProvider: activity is not MMFragmentActivity:%s", activity);
        }
        if ((activity.getWindow().getAttributes().softInputMode & 240) != 48) {
            kd.c.e("LiteApp.KeyboardHeightProvider", "activity soft input should be adjust nothing", new java.lang.Object[0]);
            this.f127711k = false;
        }
        this.f127706f = activity.findViewById(android.R.id.content);
        this.f127708h = new com.p314xaae8f345.p362xadfe2b3.ui.g(this);
        this.f127709i = new com.p314xaae8f345.p362xadfe2b3.ui.h(this);
        int identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        if (identifier > 0) {
            this.f127714n = android.content.res.Resources.getSystem().getDimensionPixelSize(identifier);
        }
        this.f127715o = java.lang.Math.round(activity.getResources().getDisplayMetrics().density * 96.0f);
    }

    public static void b(com.p314xaae8f345.p362xadfe2b3.ui.i iVar) {
        int i17;
        int i18;
        boolean z17;
        int i19;
        android.view.DisplayCutout displayCutout;
        int safeInsetBottom;
        iVar.f127703c.getWindowVisibleDisplayFrame(iVar.f127704d);
        iVar.f127706f.getWindowVisibleDisplayFrame(iVar.f127705e);
        int i27 = iVar.f127704d.bottom;
        if (i27 > iVar.f127712l) {
            iVar.f127712l = i27;
        }
        int i28 = iVar.f127705e.bottom;
        if (i28 > iVar.f127713m) {
            iVar.f127713m = i28;
        }
        int i29 = iVar.f127713m;
        int i37 = iVar.f127712l;
        int i38 = i29 - i37;
        if (iVar.f127711k) {
            kd.c.c("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: activityInputIsAdjustNothing == true, %s, %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(iVar.f127704d.bottom));
            i19 = iVar.f127705e.bottom - iVar.f127704d.bottom;
            if (android.os.Build.VERSION.SDK_INT >= 28 && iVar.f127706f.getRootWindowInsets() != null && (displayCutout = iVar.f127706f.getRootWindowInsets().getDisplayCutout()) != null && (safeInsetBottom = displayCutout.getSafeInsetBottom()) == i19) {
                kd.c.c("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: has cutout bottom, %s", java.lang.Integer.valueOf(safeInsetBottom));
                i19 -= safeInsetBottom;
            }
            if (i19 == iVar.f127714n && iVar.f127714n != 0) {
                kd.c.c("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: navigationHeight %d, %d, %d", java.lang.Integer.valueOf(iVar.f127712l), java.lang.Integer.valueOf(iVar.f127713m), java.lang.Integer.valueOf(iVar.f127714n));
                i19 -= iVar.f127714n;
            }
            if (i19 == i38 && i38 > 0 && i38 < iVar.f127715o) {
                kd.c.c("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: max bottom diff %d, %d, %d", java.lang.Integer.valueOf(iVar.f127712l), java.lang.Integer.valueOf(iVar.f127713m), java.lang.Integer.valueOf(i38));
                i19 -= i38;
            }
            z17 = false;
            if (i19 == 0 && iVar.f127713m - iVar.f127705e.bottom > iVar.f127715o) {
                kd.c.e("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: adjust nothing not work!", new java.lang.Object[0]);
                i17 = iVar.f127713m;
                i18 = iVar.f127705e.bottom;
            }
            kd.c.c("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: %s, %s", iVar.f127704d.toShortString(), iVar.f127705e.toShortString());
            iVar.d(i19, z17);
        }
        kd.c.c("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: activityInputIsAdjustNothing == false, %s, %s", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(iVar.f127704d.bottom));
        i17 = iVar.f127712l;
        i18 = iVar.f127704d.bottom;
        i19 = i17 - i18;
        z17 = true;
        kd.c.c("LiteApp.KeyboardHeightProvider", "handleOnGlobalLayout: %s, %s", iVar.f127704d.toShortString(), iVar.f127705e.toShortString());
        iVar.d(i19, z17);
    }

    public void c() {
        android.view.View view;
        android.view.Window window;
        kd.c.c("LiteApp.KeyboardHeightProvider", "close: ", new java.lang.Object[0]);
        if (this.f127707g == null) {
            kd.c.e("LiteApp.KeyboardHeightProvider", "close: activity is null", new java.lang.Object[0]);
            return;
        }
        kd.c.c("LiteApp.KeyboardHeightProvider", "close: version:%s", 31);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 < 31) {
            if (this.f127706f != null) {
                this.f127706f.getViewTreeObserver().removeOnGlobalLayoutListener(this.f127709i);
            }
            if (this.f127710j && (view = this.f127703c) != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f127708h);
                try {
                    this.f127707g.getWindowManager().removeView(this.f127703c);
                } catch (java.lang.Exception e17) {
                    kd.c.b("LiteApp.KeyboardHeightProvider", e17.toString(), new java.lang.Object[0]);
                }
                this.f127703c = null;
            }
            this.f127710j = false;
            return;
        }
        if (i17 >= 30) {
            java.util.Set set = com.p314xaae8f345.p362xadfe2b3.ui.e.f127680a;
            kd.c.c("LiteApp.KeyBoardHeightProviderUtil", "unRegister: activity:%s observer:%s ", a(), this);
            com.p314xaae8f345.p362xadfe2b3.ui.e.f127680a.remove(this);
            android.app.Activity a17 = a();
            if (a17 == null || (window = a17.getWindow()) == null) {
                return;
            }
            android.view.View decorView = window.getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
            decorView.post(new com.p314xaae8f345.p362xadfe2b3.ui.d(window));
        }
    }

    public final void d(int i17, boolean z17) {
        if (this.f127702b != null) {
            com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238 = (com.p314xaae8f345.p362xadfe2b3.C3646xcf902238) this.f127702b;
            c3646xcf902238.getClass();
            boolean z18 = i17 > 0;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("shown", java.lang.Boolean.valueOf(z18));
            hashMap.put("height", java.lang.Integer.valueOf(i17));
            kx5.n.h().j(c3646xcf902238.f127500f, "notifyKeyboardChanged", hashMap);
        }
    }
}
