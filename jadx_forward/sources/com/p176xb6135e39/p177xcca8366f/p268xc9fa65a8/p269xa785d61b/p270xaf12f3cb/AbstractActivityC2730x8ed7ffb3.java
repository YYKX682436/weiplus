package com.p176xb6135e39.p177xcca8366f.p268xc9fa65a8.p269xa785d61b.p270xaf12f3cb;

/* renamed from: com.google.android.search.verification.client.SearchActionVerificationClientActivity */
/* loaded from: classes5.dex */
public abstract class AbstractActivityC2730x8ed7ffb3 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {
    public abstract java.lang.Class K6();

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) K6());
        intent.putExtra("SearchActionVerificationClientExtraIntent", getIntent());
        startService(intent);
        finish();
    }
}
