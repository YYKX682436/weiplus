package androidx.preference;

/* loaded from: classes13.dex */
public class EditTextPreferenceDialogFragmentCompat extends androidx.preference.PreferenceDialogFragmentCompat {

    /* renamed from: o, reason: collision with root package name */
    public android.widget.EditText f11733o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.CharSequence f11734p;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void m0(android.view.View view) {
        super.m0(view);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(android.R.id.edit);
        this.f11733o = editText;
        editText.requestFocus();
        android.widget.EditText editText2 = this.f11733o;
        if (editText2 == null) {
            throw new java.lang.IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.f11734p);
        android.widget.EditText editText3 = this.f11733o;
        editText3.setSelection(editText3.getText().length());
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void n0(boolean z17) {
        if (z17) {
            java.lang.String obj = this.f11733o.getText().toString();
            if (((androidx.preference.EditTextPreference) l0()).d(obj)) {
                ((androidx.preference.EditTextPreference) l0()).M(obj);
            }
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f11734p = ((androidx.preference.EditTextPreference) l0()).X;
        } else {
            this.f11734p = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f11734p);
    }
}
