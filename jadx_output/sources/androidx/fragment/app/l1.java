package androidx.fragment.app;

/* loaded from: classes13.dex */
public class l1 extends h.b {
    @Override // h.b
    public android.content.Intent a(android.content.Context context, java.lang.Object obj) {
        android.os.Bundle bundleExtra;
        androidx.activity.result.IntentSenderRequest intentSenderRequest = (androidx.activity.result.IntentSenderRequest) obj;
        android.content.Intent intent = new android.content.Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        android.content.Intent intent2 = intentSenderRequest.f9049e;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                intentSenderRequest = new androidx.activity.result.IntentSenderRequest(intentSenderRequest.f9048d, null, intentSenderRequest.f9050f, intentSenderRequest.f9051g);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            intent.toString();
        }
        return intent;
    }

    @Override // h.b
    public java.lang.Object c(int i17, android.content.Intent intent) {
        return new androidx.activity.result.ActivityResult(i17, intent);
    }
}
