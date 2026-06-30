package androidx.preference;

/* loaded from: classes13.dex */
public class l0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.preference.SwitchPreferenceCompat f11835a;

    public l0(androidx.preference.SwitchPreferenceCompat switchPreferenceCompat) {
        this.f11835a = switchPreferenceCompat;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        androidx.preference.SwitchPreferenceCompat switchPreferenceCompat = this.f11835a;
        if (switchPreferenceCompat.d(valueOf)) {
            switchPreferenceCompat.M(z17);
        } else {
            compoundButton.setChecked(!z17);
        }
    }
}
