package androidx.preference;

/* loaded from: classes13.dex */
public class a implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.preference.CheckBoxPreference f11791a;

    public a(androidx.preference.CheckBoxPreference checkBoxPreference) {
        this.f11791a = checkBoxPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        androidx.preference.CheckBoxPreference checkBoxPreference = this.f11791a;
        if (checkBoxPreference.d(valueOf)) {
            checkBoxPreference.M(z17);
        } else {
            compoundButton.setChecked(!z17);
        }
    }
}
