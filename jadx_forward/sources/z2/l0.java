package z2;

/* loaded from: classes11.dex */
public abstract class l0 {
    public static android.app.RemoteInput.Builder a(android.app.RemoteInput.Builder builder, android.os.Bundle bundle) {
        return builder.addExtras(bundle);
    }

    public static android.app.RemoteInput b(android.app.RemoteInput.Builder builder) {
        return builder.build();
    }

    public static android.os.Parcelable c(android.app.RemoteInput remoteInput) {
        return remoteInput;
    }

    public static android.app.RemoteInput.Builder d(java.lang.String str) {
        return new android.app.RemoteInput.Builder(str);
    }

    public static boolean e(android.app.RemoteInput remoteInput) {
        return remoteInput.getAllowFreeFormInput();
    }

    public static java.lang.CharSequence[] f(android.app.RemoteInput remoteInput) {
        return remoteInput.getChoices();
    }

    public static android.os.Bundle g(android.app.RemoteInput remoteInput) {
        return remoteInput.getExtras();
    }

    public static java.lang.CharSequence h(android.app.RemoteInput remoteInput) {
        return remoteInput.getLabel();
    }

    public static java.lang.String i(android.app.RemoteInput remoteInput) {
        return remoteInput.getResultKey();
    }

    public static android.app.RemoteInput.Builder j(android.app.RemoteInput.Builder builder, boolean z17) {
        return builder.setAllowFreeFormInput(z17);
    }

    public static android.app.RemoteInput.Builder k(android.app.RemoteInput.Builder builder, java.lang.CharSequence[] charSequenceArr) {
        return builder.setChoices(charSequenceArr);
    }

    public static android.app.RemoteInput.Builder l(android.app.RemoteInput.Builder builder, java.lang.CharSequence charSequence) {
        return builder.setLabel(charSequence);
    }
}
