package androidx.preference;

/* loaded from: classes13.dex */
public class k0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.preference.SwitchPreference f11833a;

    public k0(androidx.preference.SwitchPreference switchPreference) {
        this.f11833a = switchPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        androidx.preference.SwitchPreference switchPreference = this.f11833a;
        if (switchPreference.d(valueOf)) {
            switchPreference.M(z17);
        } else {
            compoundButton.setChecked(!z17);
        }
    }
}
