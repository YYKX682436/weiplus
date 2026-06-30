package com.tencent.mm.plugin.account.ui;

/* loaded from: classes13.dex */
public class CustomTabMainActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity {

    /* renamed from: d, reason: collision with root package name */
    public boolean f73275d = true;

    /* renamed from: e, reason: collision with root package name */
    public android.content.BroadcastReceiver f73276e;

    public final void K6(int i17, android.content.Intent intent) {
        android.os.Bundle bundle;
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.fb.CustomTabMainActivity", "sendResult = " + intent, null);
        b4.d.a(this).d(this.f73276e);
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra(com.tencent.mm.ui.mmfb.sdk.l.f209202f);
            com.tencent.mars.xlog.Log.i("MicroMsg.fb.CustomTabMainActivity", "sendResult, responseURL = " + stringExtra, null);
            if (stringExtra != null) {
                android.net.Uri parse = android.net.Uri.parse(stringExtra);
                bundle = com.tencent.mm.ui.mmfb.sdk.l.e(parse.getQuery());
                bundle.putAll(com.tencent.mm.ui.mmfb.sdk.l.e(parse.getFragment()));
            } else {
                bundle = new android.os.Bundle();
            }
            android.content.Intent a17 = com.tencent.mm.ui.mmfb.sdk.z.a(getIntent(), bundle, null);
            if (a17 != null) {
                intent = a17;
            }
            setResult(i17, intent);
        } else {
            setResult(i17, com.tencent.mm.ui.mmfb.sdk.z.a(getIntent(), null, null));
        }
        finish();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        super.onCreate(bundle);
        java.lang.String str = "onCreate, getIntent().getAction() = " + getIntent().getAction();
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.fb.CustomTabMainActivity", str, null);
        if (com.tencent.mm.plugin.account.ui.CustomTabActivity.f73272e.equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle == null) {
            java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.mm.ui.mmfb.sdk.l.f209203g);
            android.os.Bundle bundleExtra = getIntent().getBundleExtra(com.tencent.mm.ui.mmfb.sdk.l.f209204h);
            java.lang.String stringExtra2 = getIntent().getStringExtra(com.tencent.mm.ui.mmfb.sdk.l.f209205i);
            if (bundleExtra == null) {
                bundleExtra = new android.os.Bundle();
            }
            android.net.Uri.Builder builder = new android.net.Uri.Builder();
            builder.scheme("https");
            builder.authority("m.facebook.com");
            builder.path("v8.0/dialog/" + stringExtra);
            for (java.lang.String str2 : bundleExtra.keySet()) {
                java.lang.Object obj = bundleExtra.get(str2);
                if (obj instanceof java.lang.String) {
                    builder.appendQueryParameter(str2, (java.lang.String) obj);
                }
            }
            android.net.Uri build = builder.build();
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            android.os.Bundle bundle2 = new android.os.Bundle();
            j3.e.b(bundle2, "android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle2);
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent.setPackage(stringExtra2);
            intent.addFlags(1073741824);
            try {
                intent.setData(build);
                b3.l.startActivity(this, intent, null);
                z17 = true;
            } catch (android.content.ActivityNotFoundException unused) {
                z17 = false;
            }
            this.f73275d = false;
            if (z17) {
                this.f73276e = new com.tencent.mm.plugin.account.ui.f1(this);
                b4.d.a(this).b(this.f73276e, new android.content.IntentFilter(com.tencent.mm.plugin.account.ui.CustomTabActivity.f73272e));
            } else {
                setResult(0, getIntent().putExtra(com.tencent.mm.ui.mmfb.sdk.l.f209207k, true));
                finish();
            }
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b4.d.a(this).d(this.f73276e);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        java.lang.String str = "CustomTabMainActivity, intent.getAction() = " + intent.getAction();
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.fb.CustomTabMainActivity", str, null);
        if (com.tencent.mm.ui.mmfb.sdk.l.f209206j.equals(intent.getAction())) {
            b4.d.a(this).c(new android.content.Intent(com.tencent.mm.plugin.account.ui.CustomTabActivity.f73273f));
            K6(-1, intent);
        } else if (com.tencent.mm.plugin.account.ui.CustomTabActivity.f73272e.equals(intent.getAction())) {
            K6(-1, intent);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f73275d) {
            K6(0, null);
        }
        this.f73275d = true;
    }
}
