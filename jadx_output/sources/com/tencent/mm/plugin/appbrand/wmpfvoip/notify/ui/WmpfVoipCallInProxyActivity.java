package com.tencent.mm.plugin.appbrand.wmpfvoip.notify.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WmpfVoipCallInProxyActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class WmpfVoipCallInProxyActivity extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        com.tencent.mm.ui.bk.j0(this);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        if (getIntent() == null) {
            finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WmpfVoipCallInProxyActivity", "onCreate");
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WmpfVoipWindowFlags", "add, activity: " + this);
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(6815744);
        }
        android.content.Intent intent = getIntent();
        java.lang.String appId = intent != null ? intent.getStringExtra("extra_appid") : null;
        android.content.Intent intent2 = getIntent();
        java.lang.String stringExtra = intent2 != null ? intent2.getStringExtra("extra_enter_path") : null;
        android.content.Intent intent3 = getIntent();
        java.lang.Integer valueOf = intent3 != null ? java.lang.Integer.valueOf(intent3.getIntExtra("version_type", 0)) : null;
        kotlin.jvm.internal.o.d(valueOf);
        int intValue = valueOf.intValue();
        android.content.Intent intent4 = getIntent();
        java.lang.Long valueOf2 = intent4 != null ? java.lang.Long.valueOf(intent4.getLongExtra("calling_instance_id", -1L)) : null;
        kotlin.jvm.internal.o.d(valueOf2);
        long longValue = valueOf2.longValue();
        android.content.Intent intent5 = getIntent();
        java.lang.Integer valueOf3 = intent5 != null ? java.lang.Integer.valueOf(intent5.getIntExtra("extra_enter_scene", 2)) : null;
        kotlin.jvm.internal.o.d(valueOf3);
        valueOf3.intValue();
        android.content.Intent intent6 = getIntent();
        if (intent6 == null || (str = intent6.getStringExtra("extra_roomid")) == null) {
            str = "";
        }
        android.content.Intent intent7 = getIntent();
        long longExtra = intent7 != null ? intent7.getLongExtra("extra_msg_id", -1L) : -1L;
        android.content.Intent intent8 = getIntent();
        int intExtra = intent8 != null ? intent8.getIntExtra("extra_create_time", -1) : -1;
        if (!(appId == null || appId.length() == 0)) {
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                kotlin.jvm.internal.o.g(appId, "appId");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28142, str, 6, appId, java.lang.Long.valueOf(longExtra), java.lang.Long.valueOf(intExtra));
                cm1.t.f43316a.a(this, appId, stringExtra, intValue, longValue, new dm1.o(appId, longValue, this));
                if (((uf0.e) i95.n0.c(uf0.e.class)) != null) {
                    ((com.tencent.mm.booter.notification.x) mo3.f.f330406a).f(41);
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WmpfVoipCallInProxyActivity", "appId or enterPath is null");
        finish();
    }
}
