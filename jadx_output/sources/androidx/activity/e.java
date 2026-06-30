package androidx.activity;

/* loaded from: classes13.dex */
public class e extends androidx.activity.result.h {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.ComponentActivity f9034i;

    public e(androidx.activity.ComponentActivity componentActivity) {
        this.f9034i = componentActivity;
    }

    @Override // androidx.activity.result.h
    public void b(int i17, h.b bVar, java.lang.Object obj, z2.m mVar) {
        android.os.Bundle a17;
        androidx.activity.ComponentActivity componentActivity = this.f9034i;
        h.a b17 = bVar.b(componentActivity, obj);
        if (b17 != null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new androidx.activity.c(this, i17, b17));
            return;
        }
        android.content.Intent a18 = bVar.a(componentActivity, obj);
        if (a18.getExtras() != null && a18.getExtras().getClassLoader() == null) {
            a18.setExtrasClassLoader(componentActivity.getClassLoader());
        }
        if (a18.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            android.os.Bundle bundleExtra = a18.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a18.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a17 = bundleExtra;
        } else {
            a17 = mVar != null ? mVar.a() : null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a18.getAction())) {
            java.lang.String[] stringArrayExtra = a18.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new java.lang.String[0];
            }
            z2.h.a(componentActivity, stringArrayExtra, i17);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a18.getAction())) {
            int i18 = z2.h.f469448a;
            z2.a.b(componentActivity, a18, i17, a17);
            return;
        }
        androidx.activity.result.IntentSenderRequest intentSenderRequest = (androidx.activity.result.IntentSenderRequest) a18.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            android.content.IntentSender intentSender = intentSenderRequest.f9048d;
            android.content.Intent intent = intentSenderRequest.f9049e;
            int i19 = intentSenderRequest.f9050f;
            int i27 = intentSenderRequest.f9051g;
            int i28 = z2.h.f469448a;
            z2.a.c(componentActivity, intentSender, i17, intent, i19, i27, 0, a17);
        } catch (android.content.IntentSender.SendIntentException e17) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new androidx.activity.d(this, i17, e17));
        }
    }
}
