package com.tencent.mm.plugin.appbrand.ui;

@db5.a(19)
/* loaded from: classes.dex */
public final class AppBrand404PageUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f89282d = 0;

    public static void T6(int i17) {
        U6(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(i17), null, null);
    }

    public static void U6(java.lang.String str, java.lang.String str2, com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate activityStarterIpcDelegate) {
        android.content.Intent putExtra = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI.class).putExtra("key_wording", str).putExtra("key_icon_url", str2);
        if (activityStarterIpcDelegate == null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.a(putExtra));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityStarterIpcDelegate, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrand404PageUI", "show", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityStarterIpcDelegate.b((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityStarterIpcDelegate, "com/tencent/mm/plugin/appbrand/ui/AppBrand404PageUI", "show", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487998e0;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f490116ld);
        setBackBtn(new com.tencent.mm.plugin.appbrand.ui.b(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483111wv);
        java.lang.String stringExtra = getIntent().getStringExtra("key_wording");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (textView != null) {
            textView.setText(stringExtra);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
