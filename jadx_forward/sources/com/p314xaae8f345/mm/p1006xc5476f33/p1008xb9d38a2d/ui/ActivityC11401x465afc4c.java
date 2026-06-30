package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.CustomTabMainActivity */
/* loaded from: classes13.dex */
public class ActivityC11401x465afc4c extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {

    /* renamed from: d, reason: collision with root package name */
    public boolean f154808d = true;

    /* renamed from: e, reason: collision with root package name */
    public android.content.BroadcastReceiver f154809e;

    public final void K6(int i17, android.content.Intent intent) {
        android.os.Bundle bundle;
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.fb.CustomTabMainActivity", "sendResult = " + intent, null);
        b4.d.a(this).d(this.f154809e);
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290735f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.fb.CustomTabMainActivity", "sendResult, responseURL = " + stringExtra, null);
            if (stringExtra != null) {
                android.net.Uri parse = android.net.Uri.parse(stringExtra);
                bundle = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.e(parse.getQuery());
                bundle.putAll(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.e(parse.getFragment()));
            } else {
                bundle = new android.os.Bundle();
            }
            android.content.Intent a17 = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.z.a(getIntent(), bundle, null);
            if (a17 != null) {
                intent = a17;
            }
            setResult(i17, intent);
        } else {
            setResult(i17, com.p314xaae8f345.mm.ui.p2722x33325c.sdk.z.a(getIntent(), null, null));
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        super.onCreate(bundle);
        java.lang.String str = "onCreate, getIntent().getAction() = " + getIntent().getAction();
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.fb.CustomTabMainActivity", str, null);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11400x69da2d73.f154805e.equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle == null) {
            java.lang.String stringExtra = getIntent().getStringExtra(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290736g);
            android.os.Bundle bundleExtra = getIntent().getBundleExtra(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290737h);
            java.lang.String stringExtra2 = getIntent().getStringExtra(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290738i);
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
                b3.l.m9722xa4df9991(this, intent, null);
                z17 = true;
            } catch (android.content.ActivityNotFoundException unused) {
                z17 = false;
            }
            this.f154808d = false;
            if (z17) {
                this.f154809e = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f1(this);
                b4.d.a(this).b(this.f154809e, new android.content.IntentFilter(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11400x69da2d73.f154805e));
            } else {
                setResult(0, getIntent().putExtra(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290740k, true));
                finish();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b4.d.a(this).d(this.f154809e);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        java.lang.String str = "CustomTabMainActivity, intent.getAction() = " + intent.getAction();
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.fb.CustomTabMainActivity", str, null);
        if (com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290739j.equals(intent.getAction())) {
            b4.d.a(this).c(new android.content.Intent(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11400x69da2d73.f154806f));
            K6(-1, intent);
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11400x69da2d73.f154805e.equals(intent.getAction())) {
            K6(-1, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f154808d) {
            K6(0, null);
        }
        this.f154808d = true;
    }
}
