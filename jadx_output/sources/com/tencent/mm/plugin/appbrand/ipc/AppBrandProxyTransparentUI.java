package com.tencent.mm.plugin.appbrand.ipc;

@db5.a(7)
/* loaded from: classes14.dex */
public class AppBrandProxyTransparentUI extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProxyTransparentUI", "onCreate");
        com.tencent.mm.ui.bk.k0(getWindow());
        try {
            getIntent().getExtras().setClassLoader(java.lang.Class.forName(getIntent().getStringExtra("task_class_name")).getClassLoader());
        } catch (java.lang.ClassNotFoundException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProxyTransparentUI", "ClassNotFoundException");
            setResult(1);
            finish();
        }
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask appBrandProxyTransparentUIProcessTask = (com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask) getIntent().getParcelableExtra("task_object");
        java.lang.String stringExtra = getIntent().getStringExtra("task_id");
        if (appBrandProxyTransparentUIProcessTask != null) {
            appBrandProxyTransparentUIProcessTask.d(this, new com.tencent.mm.plugin.appbrand.ipc.o(this, appBrandProxyTransparentUIProcessTask, stringExtra));
        } else {
            setResult(1);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProxyTransparentUI", "onDestroy");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
        int intExtra = getIntent().getIntExtra("orientation", -1);
        if (intExtra != -1) {
            setRequestedOrientation(intExtra);
        }
    }
}
