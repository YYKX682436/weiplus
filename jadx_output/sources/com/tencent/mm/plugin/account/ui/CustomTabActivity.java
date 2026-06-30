package com.tencent.mm.plugin.account.ui;

/* loaded from: classes13.dex */
public class CustomTabActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f73272e = com.tencent.mm.ui.mmfb.sdk.l.f209208l;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f73273f = "CustomTabActivity.action_destroy";

    /* renamed from: d, reason: collision with root package name */
    public android.content.BroadcastReceiver f73274d;

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.fb.CustomTabActivity", "CustomTabActivity, onActivityResult， resultCode = " + i18);
        if (i18 == 0) {
            android.content.Intent intent2 = new android.content.Intent(f73272e);
            intent2.putExtra(com.tencent.mm.ui.mmfb.sdk.l.f209202f, getIntent().getDataString());
            b4.d.a(this).c(intent2);
            this.f73274d = new com.tencent.mm.plugin.account.ui.e1(this);
            b4.d.a(this).b(this.f73274d, new android.content.IntentFilter(f73273f));
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.CustomTabMainActivity.class);
        intent.setAction(f73272e);
        intent.putExtra(com.tencent.mm.ui.mmfb.sdk.l.f209202f, getIntent().getDataString());
        startActivityForResult(intent, 2);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.fb.CustomTabActivity", "CustomTabActivity, onDestroy.");
        b4.d.a(this).d(this.f73274d);
        super.onDestroy();
    }
}
