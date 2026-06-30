package com.tencent.mm.plugin.appbrand.message;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/message/WxaSubscribeMsgTipsUI;", "Lcom/tencent/mm/ui/base/BaseLuggageActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class WxaSubscribeMsgTipsUI extends com.tencent.mm.ui.base.BaseLuggageActivity {
    public fl1.c0 B;
    public m31.c0 C;

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.tencent.mm.ui.base.BaseLuggageActivity, com.tencent.mm.ui.BaseActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        super.finish();
    }

    @Override // com.tencent.mm.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.a9e));
        this.B = new fl1.c0(this, null);
        addContentView(this.B, new android.view.ViewGroup.LayoutParams(-1, -2));
        m31.c0 c0Var = new m31.c0(this);
        this.C = c0Var;
        fl1.c0 c0Var2 = this.B;
        if (c0Var2 != null) {
            c0Var2.c(c0Var);
        }
        m31.c0 c0Var3 = this.C;
        if (c0Var3 != null) {
            c0Var3.f323128g = new oh1.s1(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        overridePendingTransition(0, 0);
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
