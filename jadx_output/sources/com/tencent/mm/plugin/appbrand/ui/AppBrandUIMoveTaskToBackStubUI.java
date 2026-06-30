package com.tencent.mm.plugin.appbrand.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandUIMoveTaskToBackStubUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/appbrand/ui/y9", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public class AppBrandUIMoveTaskToBackStubUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.y9 f89437g = new com.tencent.mm.plugin.appbrand.ui.y9(null);

    /* renamed from: h, reason: collision with root package name */
    public static final android.util.SparseArray f89438h = new android.util.SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public static final android.util.SparseArray f89439i = new android.util.SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public static final android.util.ArraySet f89440m = new android.util.ArraySet();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.AppBrandUI f89442e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f89441d = new com.tencent.mm.plugin.appbrand.ui.z9(this);

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.x9 f89443f = com.tencent.mm.plugin.appbrand.ui.x9.f90335d;

    public final void T6() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "finishDirectly");
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI;
        if (isFinishing() || isDestroyed()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "finish");
        int ordinal = this.f89443f.ordinal();
        if (ordinal == 1) {
            com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI2 = this.f89442e;
            if (appBrandUI2 != null) {
                appBrandUI2.G7(false);
            }
        } else if (ordinal == 2 && (appBrandUI = this.f89442e) != null) {
            appBrandUI.f7();
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public void initActivityCloseAnimation() {
        overridePendingTransition((f89437g.a(this) || com.tencent.mm.plugin.appbrand.ui.u8.h()) ? com.tencent.mm.R.anim.f477745a6 : com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477746a7);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public void initActivityOpenAnimation(android.content.Intent intent) {
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean initNavigationSwipeBack() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean isSupportNavigationSwipeBack() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean needResetStatusBarColorOnActivityCreate() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean noActionBar() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r8.hasExtra("KEY_ACTIVITY_HASH_INT") == true) goto L8;
     */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.AppBrandUIMoveTaskToBackStubUI"
            java.lang.String r1 = "onCreate"
            com.tencent.mars.xlog.Log.i(r0, r1)
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
            kotlin.jvm.internal.o.d(r8)     // Catch: java.lang.Exception -> Le6
            int r8 = r8.getIntExtra(r0, r1)     // Catch: java.lang.Exception -> Le6
            android.util.SparseArray r0 = com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI.f89439i
            java.lang.Object r0 = com.tencent.mm.plugin.appbrand.utils.h1.a(r0, r8)
            com.tencent.mm.plugin.appbrand.ui.AppBrandUI r0 = (com.tencent.mm.plugin.appbrand.ui.AppBrandUI) r0
            if (r0 == 0) goto L38
            r7.f89442e = r0
            jz5.f0 r0 = jz5.f0.f302826a
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 != 0) goto L3f
            r7.finish()
            return
        L3f:
            android.util.SparseArray r0 = com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI.f89438h
            java.lang.Object r8 = com.tencent.mm.plugin.appbrand.utils.h1.a(r0, r8)
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto Le2
            boolean r0 = r8.isRecycled()
            if (r0 == 0) goto L51
            goto Le2
        L51:
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "KEY_WORKAROUND_SCENE"
            int r0 = com.tencent.mm.sdk.platformtools.c2.g(r0, r2, r1)
            com.tencent.mm.plugin.appbrand.ui.x9 r2 = com.tencent.mm.plugin.appbrand.ui.x9.f90335d
            r7.f89443f = r2
            com.tencent.mm.plugin.appbrand.ui.x9[] r2 = com.tencent.mm.plugin.appbrand.ui.x9.values()
            int r3 = r2.length
            r4 = r1
        L65:
            if (r4 >= r3) goto L74
            r5 = r2[r4]
            int r6 = r5.ordinal()
            if (r6 != r0) goto L71
            r7.f89443f = r5
        L71:
            int r4 = r4 + 1
            goto L65
        L74:
            com.tencent.mm.plugin.appbrand.ui.x9 r0 = com.tencent.mm.plugin.appbrand.ui.x9.f90335d
            com.tencent.mm.plugin.appbrand.ui.x9 r2 = r7.f89443f
            if (r0 != r2) goto L7e
            r7.finish()
            return
        L7e:
            android.content.Intent r0 = r7.getIntent()
            android.view.Window r2 = r7.getWindow()
            int r2 = r2.getNavigationBarColor()
            java.lang.String r3 = "KEY_NAVIGATION_BAR_COLOR_INT"
            int r0 = com.tencent.mm.sdk.platformtools.c2.g(r0, r3, r2)
            r7.setNavigationbarColor(r0)
            android.util.ArraySet r0 = com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI.f89440m
            r0.add(r7)
            r7.setMMOrientation()
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "KEY_FULLSCREEN_BOOL"
            boolean r0 = com.tencent.mm.sdk.platformtools.c2.c(r0, r2, r1)
            com.tencent.mm.plugin.appbrand.ui.na.g(r7, r0)
            android.view.View r0 = r7.getContentView()
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r3 = r0.getResources()
            r2.<init>(r3, r8)
            r0.setBackground(r2)
            r0.setWillNotDraw(r1)
            android.view.View r8 = r7.getContentView()
            java.lang.String r0 = "getContentView(...)"
            kotlin.jvm.internal.o.f(r8, r0)
            android.view.ViewTreeObserver r0 = r8.getViewTreeObserver()
            com.tencent.mm.plugin.appbrand.ui.aa r2 = new com.tencent.mm.plugin.appbrand.ui.aa
            r2.<init>(r8, r7)
            r0.addOnPreDrawListener(r2)
            android.view.View r8 = r7.getContentView()
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "KEY_LIGHT_STATUS_BAR_BOOL"
            boolean r0 = com.tencent.mm.sdk.platformtools.c2.c(r0, r2, r1)
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        android.view.WindowManager.LayoutParams attributes;
        android.view.Window window = getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        super.onCreateBeforeSetContentView();
        setTheme(com.tencent.mm.R.style.f493931w);
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(3);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onDestroy");
        super.onDestroy();
        f89440m.remove(this);
        getContentView().removeCallbacks(this.f89441d);
        android.graphics.drawable.Drawable background = getContentView().getBackground();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = background instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) background : null;
        android.graphics.Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        getContentView().setBackground(null);
        if (bitmap != null) {
            bitmap.recycle();
        }
        vj5.n c17 = vj5.n.c(this);
        if (c17 != null) {
            c17.a();
        }
        this.f89442e = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onEnterAnimationComplete");
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onPause");
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onResume");
        super.onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onStart");
        super.onStart();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onStop");
        super.onStop();
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View provideCustomActivityContentView() {
        return new vj5.h(this);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
        setRequestedOrientation(com.tencent.mm.sdk.platformtools.c2.g(getIntent(), "KEY_REQUESTED_ORIENTATION_INT", 1));
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean supportNavigationSwipeBack() {
        return false;
    }
}
