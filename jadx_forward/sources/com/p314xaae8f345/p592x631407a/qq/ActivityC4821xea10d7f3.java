package com.p314xaae8f345.p592x631407a.qq;

/* renamed from: com.tencent.midas.qq.APMidasQQWalletActivity */
/* loaded from: classes13.dex */
public class ActivityC4821xea10d7f3 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {
    private static final java.lang.String TAG = "APMidasQQWalletActivity";

    /* renamed from: handleIntent */
    private void m42180xa1c752e4(android.content.Intent intent) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d(TAG, "handleIntent get called!");
        try {
            com.p314xaae8f345.p592x631407a.p604xc5476f33.C4809x3fd5c96.m42103x34971816(this, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20418xb441bfb2, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20421x9d792e54, com.p314xaae8f345.p592x631407a.p600x38b7655d.C4777x7a3dad2b.f20398x8486e20f, new java.lang.Object[]{this, intent});
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "handleIntent got exception = " + e17.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        try {
            getIntent().getStringExtra("wxpay");
            try {
                requestWindowFeature(1);
                m42180xa1c752e4(getIntent());
                finish();
            } catch (java.lang.Throwable unused) {
                finish();
            }
        } catch (java.lang.Exception unused2) {
            finish();
        }
    }
}
