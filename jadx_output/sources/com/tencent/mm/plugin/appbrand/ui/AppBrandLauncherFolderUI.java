package com.tencent.mm.plugin.appbrand.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lzj1/a;", "<init>", "()V", "com/tencent/mm/plugin/appbrand/ui/c5", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* loaded from: classes7.dex */
public final class AppBrandLauncherFolderUI extends com.tencent.mm.ui.MMActivity implements zj1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.c5 f89355f = new com.tencent.mm.plugin.appbrand.ui.c5(null);

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.launcher.FolderActivityContextWithLifecycle f89356d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f89357e;

    @Override // zj1.a
    public void H3(boolean z17) {
        com.tencent.mm.plugin.appbrand.ui.launcher.FolderActivityContextWithLifecycle folderActivityContextWithLifecycle = this.f89356d;
        if (folderActivityContextWithLifecycle != null) {
            folderActivityContextWithLifecycle.H3(z17);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (isFinishing()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.appbrand.ui.launcher.FolderActivityContextWithLifecycle recentsFolderActivityContext;
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        overridePendingTransition(0, 0);
        if (((db5.f.e(com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI.class) & 2) == 0) && !com.tencent.mm.ui.bk.v0()) {
            overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
        }
        this.f89357e = getIntent().getBooleanExtra("extra_is_from_widget", false);
        int intExtra = getIntent().getIntExtra("KEY_MODE", 0);
        if (intExtra == 1) {
            recentsFolderActivityContext = new com.tencent.mm.plugin.appbrand.ui.recents.RecentsFolderActivityContext(this);
        } else {
            if (intExtra != 2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLauncherFolderUI", "onCreate with invalid mode(" + intExtra + ')');
                finish();
                setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a07));
                getContentView().setBackgroundColor(getActionbarColor());
                setBackBtn(new com.tencent.mm.plugin.appbrand.ui.d5(this));
                setTitleBarDoubleClickListener(new com.tencent.mm.plugin.appbrand.ui.e5(this));
                androidx.lifecycle.o mo133getLifecycle = mo133getLifecycle();
                com.tencent.mm.plugin.appbrand.ui.launcher.FolderActivityContextWithLifecycle folderActivityContextWithLifecycle = this.f89356d;
                kotlin.jvm.internal.o.d(folderActivityContextWithLifecycle);
                mo133getLifecycle.a(folderActivityContextWithLifecycle);
            }
            recentsFolderActivityContext = new com.tencent.mm.plugin.appbrand.ui.collection.CollectionFolderActivityContext(this);
        }
        this.f89356d = recentsFolderActivityContext;
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a07));
        getContentView().setBackgroundColor(getActionbarColor());
        setBackBtn(new com.tencent.mm.plugin.appbrand.ui.d5(this));
        setTitleBarDoubleClickListener(new com.tencent.mm.plugin.appbrand.ui.e5(this));
        androidx.lifecycle.o mo133getLifecycle2 = mo133getLifecycle();
        com.tencent.mm.plugin.appbrand.ui.launcher.FolderActivityContextWithLifecycle folderActivityContextWithLifecycle2 = this.f89356d;
        kotlin.jvm.internal.o.d(folderActivityContextWithLifecycle2);
        mo133getLifecycle2.a(folderActivityContextWithLifecycle2);
    }
}
