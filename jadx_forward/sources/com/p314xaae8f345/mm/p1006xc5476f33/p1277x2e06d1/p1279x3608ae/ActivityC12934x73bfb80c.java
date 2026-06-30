package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.base.stub.UIEntryStub */
/* loaded from: classes9.dex */
public class ActivityC12934x73bfb80c extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f175131d;

    /* renamed from: e, reason: collision with root package name */
    public int f175132e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Intent f175133f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f175134g;

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIEntryStub", "onCreate");
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.d();
        this.f175134g = false;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIEntryStub", "onDestroy");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f175133f = intent;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIEntryStub", "onNewIntent mHasHandled: %b", java.lang.Boolean.valueOf(this.f175134g));
        this.f175134g = false;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIEntryStub", "onPause");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIEntryStub", "onResume");
        if (this.f175133f == null) {
            this.f175133f = getIntent();
        }
        c01.d9.e().g(new c01.ra(new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.m(this), null));
    }
}
