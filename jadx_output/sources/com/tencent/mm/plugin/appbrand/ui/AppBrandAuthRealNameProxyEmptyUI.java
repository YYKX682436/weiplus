package com.tencent.mm.plugin.appbrand.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandAuthRealNameProxyEmptyUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandAuthRealNameProxyEmptyUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f89283d = 0;

    public final void T6() {
        com.tencent.mm.ui.v9.e(getWindow());
        com.tencent.mm.ui.v9.c(getWindow(), false);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        db5.f.c(this, null);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        boolean z17 = false;
        overridePendingTransition(0, 0);
        T6();
        android.content.Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("key_process_is_end", false)) {
            z17 = true;
        }
        if (z17) {
            finish();
            return;
        }
        android.content.Intent intent2 = getIntent();
        if (intent2 == null || (str = intent2.getStringExtra("action")) == null) {
            str = "";
        }
        if (!kotlin.jvm.internal.o.b("startRealNameVerify", str)) {
            finish();
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("realname_verify_process_jump_activity", ".ui.AppBrandAuthRealNameProxyEmptyUI");
        bundle2.putString("realname_verify_process_jump_plugin", "appbrand");
        bundle2.putInt("real_name_verify_mode", 4);
        bundle2.putInt("entry_scene", 1);
        ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).Bi(getContext(), bundle2);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        T6();
    }
}
