package com.google.android.search.verification.client;

/* loaded from: classes5.dex */
public abstract class SearchActionVerificationClientActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity {
    public abstract java.lang.Class K6();

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) K6());
        intent.putExtra("SearchActionVerificationClientExtraIntent", getIntent());
        startService(intent);
        finish();
    }
}
