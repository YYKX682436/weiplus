package p012xc85e97e9.p013x9d4bf30f;

/* loaded from: classes13.dex */
public class e extends p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c f90567i;

    public e(p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c) {
        this.f90567i = activityC0053x3d3f670c;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h
    public void b(int i17, h.b bVar, java.lang.Object obj, z2.m mVar) {
        android.os.Bundle a17;
        p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c = this.f90567i;
        h.a b17 = bVar.b(activityC0053x3d3f670c, obj);
        if (b17 != null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new p012xc85e97e9.p013x9d4bf30f.c(this, i17, b17));
            return;
        }
        android.content.Intent a18 = bVar.a(activityC0053x3d3f670c, obj);
        if (a18.getExtras() != null && a18.getExtras().getClassLoader() == null) {
            a18.setExtrasClassLoader(activityC0053x3d3f670c.getClassLoader());
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
            z2.h.a(activityC0053x3d3f670c, stringArrayExtra, i17);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a18.getAction())) {
            int i18 = z2.h.f550981a;
            z2.a.b(activityC0053x3d3f670c, a18, i17, a17);
            return;
        }
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0061xc6e4d93e c0061xc6e4d93e = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0061xc6e4d93e) a18.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            android.content.IntentSender intentSender = c0061xc6e4d93e.f90581d;
            android.content.Intent intent = c0061xc6e4d93e.f90582e;
            int i19 = c0061xc6e4d93e.f90583f;
            int i27 = c0061xc6e4d93e.f90584g;
            int i28 = z2.h.f550981a;
            z2.a.c(activityC0053x3d3f670c, intentSender, i17, intent, i19, i27, 0, a17);
        } catch (android.content.IntentSender.SendIntentException e17) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new p012xc85e97e9.p013x9d4bf30f.d(this, i17, e17));
        }
    }
}
