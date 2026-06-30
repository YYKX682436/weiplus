package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandUIMoveTaskToBackStubUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/appbrand/ui/y9", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI */
/* loaded from: classes7.dex */
public class ActivityC12683x695b32b4 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.y9 f170970g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.y9(null);

    /* renamed from: h, reason: collision with root package name */
    public static final android.util.SparseArray f170971h = new android.util.SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public static final android.util.SparseArray f170972i = new android.util.SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public static final android.util.ArraySet f170973m = new android.util.ArraySet();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a f170975e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f170974d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z9(this);

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.x9 f170976f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.x9.f171868d;

    public final void T6() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "finishDirectly");
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a;
        if (isFinishing() || isDestroyed()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "finish");
        int ordinal = this.f170976f.ordinal();
        if (ordinal == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a2 = this.f170975e;
            if (activityC12666xc288131a2 != null) {
                activityC12666xc288131a2.G7(false);
            }
        } else if (ordinal == 2 && (activityC12666xc288131a = this.f170975e) != null) {
            activityC12666xc288131a.f7();
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initActivityCloseAnimation */
    public void mo50392x5138328b() {
        overridePendingTransition((f170970g.a(this) || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.h()) ? com.p314xaae8f345.mm.R.C30854x2dc211.f559278a6 : com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559279a7);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initActivityOpenAnimation */
    public void mo51655xf502a5b(android.content.Intent intent) {
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initNavigationSwipeBack */
    public boolean mo52921x858d605d() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: isSupportNavigationSwipeBack */
    public boolean mo44291x4e2d2008() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: needResetStatusBarColorOnActivityCreate */
    public boolean mo44292x104fd6a5() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: noActionBar */
    public boolean mo44293x69604d3c() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r8.hasExtra("KEY_ACTIVITY_HASH_INT") == true) goto L8;
     */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.AppBrandUIMoveTaskToBackStubUI"
            java.lang.String r1 = "onCreate"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            super.onCreate(r8)
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = "KEY_ACTIVITY_HASH_INT"
            r1 = 0
            if (r8 == 0) goto L1b
            boolean r8 = r8.hasExtra(r0)
            r2 = 1
            if (r8 != r2) goto L1b
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto Lea
            android.content.Intent r8 = r7.getIntent()     // Catch: java.lang.Exception -> Le6
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)     // Catch: java.lang.Exception -> Le6
            int r8 = r8.getIntExtra(r0, r1)     // Catch: java.lang.Exception -> Le6
            android.util.SparseArray r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12683x695b32b4.f170972i
            java.lang.Object r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h1.a(r0, r8)
            com.tencent.mm.plugin.appbrand.ui.AppBrandUI r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) r0
            if (r0 == 0) goto L38
            r7.f170975e = r0
            jz5.f0 r0 = jz5.f0.f384359a
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 != 0) goto L3f
            r7.finish()
            return
        L3f:
            android.util.SparseArray r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12683x695b32b4.f170971h
            java.lang.Object r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h1.a(r0, r8)
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto Le2
            boolean r0 = r8.isRecycled()
            if (r0 == 0) goto L51
            goto Le2
        L51:
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "KEY_WORKAROUND_SCENE"
            int r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(r0, r2, r1)
            com.tencent.mm.plugin.appbrand.ui.x9 r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.x9.f171868d
            r7.f170976f = r2
            com.tencent.mm.plugin.appbrand.ui.x9[] r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.x9.m53068xcee59d22()
            int r3 = r2.length
            r4 = r1
        L65:
            if (r4 >= r3) goto L74
            r5 = r2[r4]
            int r6 = r5.ordinal()
            if (r6 != r0) goto L71
            r7.f170976f = r5
        L71:
            int r4 = r4 + 1
            goto L65
        L74:
            com.tencent.mm.plugin.appbrand.ui.x9 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.x9.f171868d
            com.tencent.mm.plugin.appbrand.ui.x9 r2 = r7.f170976f
            if (r0 != r2) goto L7e
            r7.finish()
            return
        L7e:
            android.content.Intent r0 = r7.getIntent()
            android.view.Window r2 = r7.getWindow()
            int r2 = r2.getNavigationBarColor()
            java.lang.String r3 = "KEY_NAVIGATION_BAR_COLOR_INT"
            int r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(r0, r3, r2)
            r7.mo78578x8b18f126(r0)
            android.util.ArraySet r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12683x695b32b4.f170973m
            r0.add(r7)
            r7.mo50393x3c0b42ee()
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "KEY_FULLSCREEN_BOOL"
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(r0, r2, r1)
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.g(r7, r0)
            android.view.View r0 = r7.m78513xc2a54588()
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r3 = r0.getResources()
            r2.<init>(r3, r8)
            r0.setBackground(r2)
            r0.setWillNotDraw(r1)
            android.view.View r8 = r7.m78513xc2a54588()
            java.lang.String r0 = "getContentView(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r0)
            android.view.ViewTreeObserver r0 = r8.getViewTreeObserver()
            com.tencent.mm.plugin.appbrand.ui.aa r2 = new com.tencent.mm.plugin.appbrand.ui.aa
            r2.<init>(r8, r7)
            r0.addOnPreDrawListener(r2)
            android.view.View r8 = r7.m78513xc2a54588()
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "KEY_LIGHT_STATUS_BAR_BOOL"
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(r0, r2, r1)
            vj5.a.a(r8, r1, r0)
            return
        Le2:
            r7.finish()
            return
        Le6:
            r7.finish()
            return
        Lea:
            r7.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12683x695b32b4.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        android.view.WindowManager.LayoutParams attributes;
        android.view.Window window = getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        super.mo48758x6c4bab6();
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575464w);
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(3);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onDestroy");
        super.onDestroy();
        f170973m.remove(this);
        m78513xc2a54588().removeCallbacks(this.f170974d);
        android.graphics.drawable.Drawable background = m78513xc2a54588().getBackground();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = background instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) background : null;
        android.graphics.Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        m78513xc2a54588().setBackground(null);
        if (bitmap != null) {
            bitmap.recycle();
        }
        vj5.n c17 = vj5.n.c(this);
        if (c17 != null) {
            c17.a();
        }
        this.f170975e = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onEnterAnimationComplete");
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onPause");
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onResume");
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onStart");
        super.onStart();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onStop");
        super.onStop();
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: provideCustomActivityContentView */
    public android.view.View mo44294xa334195d() {
        return new vj5.h(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMOrientation */
    public void mo50393x3c0b42ee() {
        setRequestedOrientation(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(getIntent(), "KEY_REQUESTED_ORIENTATION_INT", 1));
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo52922x430f73e() {
        return false;
    }
}
