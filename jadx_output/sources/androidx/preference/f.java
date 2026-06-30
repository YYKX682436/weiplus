package androidx.preference;

/* loaded from: classes13.dex */
public class f implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.preference.DropDownPreference f11811d;

    public f(androidx.preference.DropDownPreference dropDownPreference) {
        this.f11811d = dropDownPreference;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 >= 0) {
            androidx.preference.DropDownPreference dropDownPreference = this.f11811d;
            java.lang.String charSequence = dropDownPreference.Y[i17].toString();
            if (charSequence.equals(dropDownPreference.Z) || !dropDownPreference.d(charSequence)) {
                return;
            }
            dropDownPreference.N(charSequence);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
    }
}
