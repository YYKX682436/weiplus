package z2;

/* loaded from: classes13.dex */
public abstract class a {
    public static void a(android.app.Activity activity) {
        activity.finishAffinity();
    }

    public static void b(android.app.Activity activity, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        activity.startActivityForResult(intent, i17, bundle);
    }

    public static void c(android.app.Activity activity, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i17, intent, i18, i19, i27, bundle);
    }
}
