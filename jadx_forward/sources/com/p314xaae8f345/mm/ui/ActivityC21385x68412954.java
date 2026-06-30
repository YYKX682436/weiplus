package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.JSAPIUploadLogHelperUI */
/* loaded from: classes5.dex */
public class ActivityC21385x68412954 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f278352e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f278353f = new byte[0];

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JSAPIUploadLogHelperUI", "onCreate called, isRunning:%b", java.lang.Boolean.valueOf(f278352e));
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569701j3);
        synchronized (f278353f) {
            if (f278352e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JSAPIUploadLogHelperUI", "reentered while last one is running, finish myself.");
                finish();
            }
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_user");
        int intExtra = getIntent().getIntExtra("key_time", 0);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(stringExtra != null && stringExtra.equals(c01.z1.r()));
        objArr[1] = java.lang.Integer.valueOf(intExtra);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JSAPIUploadLogHelperUI", "upload log from jsapi, in upload activity, username-recv-well:%b, time:%d", objArr);
        if (stringExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JSAPIUploadLogHelperUI", "doUpload: userName is null.");
            finish();
        } else if (intExtra >= 0) {
            c01.d9.e().g(new c01.ra(new com.p314xaae8f345.mm.ui.c8(this, intExtra, db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.lbc), true, false, null)), null));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JSAPIUploadLogHelperUI", "doUpload: illegal time value: %d", java.lang.Integer.valueOf(intExtra));
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JSAPIUploadLogHelperUI", "onDestroy called, isRunning:%b", java.lang.Boolean.valueOf(f278352e));
        super.onDestroy();
    }
}
