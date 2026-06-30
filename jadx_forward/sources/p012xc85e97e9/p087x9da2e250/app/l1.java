package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes13.dex */
public class l1 extends h.b {
    @Override // h.b
    public android.content.Intent a(android.content.Context context, java.lang.Object obj) {
        android.os.Bundle bundleExtra;
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0061xc6e4d93e c0061xc6e4d93e = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0061xc6e4d93e) obj;
        android.content.Intent intent = new android.content.Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        android.content.Intent intent2 = c0061xc6e4d93e.f90582e;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                c0061xc6e4d93e = new p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0061xc6e4d93e(c0061xc6e4d93e.f90581d, null, c0061xc6e4d93e.f90583f, c0061xc6e4d93e.f90584g);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0061xc6e4d93e);
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
            intent.toString();
        }
        return intent;
    }

    @Override // h.b
    public java.lang.Object c(int i17, android.content.Intent intent) {
        return new p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c(i17, intent);
    }
}
