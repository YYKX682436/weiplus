package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.CustomTabActivity */
/* loaded from: classes13.dex */
public class ActivityC11400x69da2d73 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f154805e = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290741l;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f154806f = "CustomTabActivity.action_destroy";

    /* renamed from: d, reason: collision with root package name */
    public android.content.BroadcastReceiver f154807d;

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.fb.CustomTabActivity", "CustomTabActivity, onActivityResult， resultCode = " + i18);
        if (i18 == 0) {
            android.content.Intent intent2 = new android.content.Intent(f154805e);
            intent2.putExtra(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290735f, getIntent().getDataString());
            b4.d.a(this).c(intent2);
            this.f154807d = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.e1(this);
            b4.d.a(this).b(this.f154807d, new android.content.IntentFilter(f154806f));
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11401x465afc4c.class);
        intent.setAction(f154805e);
        intent.putExtra(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290735f, getIntent().getDataString());
        startActivityForResult(intent, 2);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.fb.CustomTabActivity", "CustomTabActivity, onDestroy.");
        b4.d.a(this).d(this.f154807d);
        super.onDestroy();
    }
}
