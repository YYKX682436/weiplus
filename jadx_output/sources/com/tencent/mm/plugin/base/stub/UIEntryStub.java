package com.tencent.mm.plugin.base.stub;

@db5.a(7)
/* loaded from: classes9.dex */
public class UIEntryStub extends com.tencent.mm.hellhoundlib.activities.HellActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f93598d;

    /* renamed from: e, reason: collision with root package name */
    public int f93599e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Intent f93600f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93601g;

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.UIEntryStub", "onCreate");
        super.onCreate(bundle);
        com.tencent.mm.booter.NotifyReceiver.d();
        this.f93601g = false;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.UIEntryStub", "onDestroy");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f93600f = intent;
        com.tencent.mars.xlog.Log.i("MicroMsg.UIEntryStub", "onNewIntent mHasHandled: %b", java.lang.Boolean.valueOf(this.f93601g));
        this.f93601g = false;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.UIEntryStub", "onPause");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.UIEntryStub", "onResume");
        if (this.f93600f == null) {
            this.f93600f = getIntent();
        }
        c01.d9.e().g(new c01.ra(new com.tencent.mm.plugin.base.stub.m(this), null));
    }
}
