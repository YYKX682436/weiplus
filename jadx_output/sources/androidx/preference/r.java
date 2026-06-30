package androidx.preference;

/* loaded from: classes13.dex */
public class r extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.preference.PreferenceFragmentCompat f11836a;

    public r(androidx.preference.PreferenceFragmentCompat preferenceFragmentCompat) {
        this.f11836a = preferenceFragmentCompat;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return;
        }
        androidx.preference.PreferenceFragmentCompat preferenceFragmentCompat = this.f11836a;
        androidx.preference.PreferenceScreen preferenceScreen = preferenceFragmentCompat.f11775d.f11800g;
        if (preferenceScreen != null) {
            preferenceFragmentCompat.f11776e.setAdapter(new androidx.preference.x(preferenceScreen));
            preferenceScreen.p();
        }
    }
}
