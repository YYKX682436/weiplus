package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.EditTextPreferenceDialogFragmentCompat */
/* loaded from: classes13.dex */
public class C1141x49ca7f2c extends p012xc85e97e9.p100xa8fcbcdb.AbstractDialogInterfaceOnClickListenerC1148x143072f5 {

    /* renamed from: o, reason: collision with root package name */
    public android.widget.EditText f93266o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.CharSequence f93267p;

    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractDialogInterfaceOnClickListenerC1148x143072f5
    public void m0(android.view.View view) {
        super.m0(view);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(android.R.id.edit);
        this.f93266o = editText;
        editText.requestFocus();
        android.widget.EditText editText2 = this.f93266o;
        if (editText2 == null) {
            throw new java.lang.IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.f93267p);
        android.widget.EditText editText3 = this.f93266o;
        editText3.setSelection(editText3.getText().length());
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractDialogInterfaceOnClickListenerC1148x143072f5
    public void n0(boolean z17) {
        if (z17) {
            java.lang.String obj = this.f93266o.getText().toString();
            if (((p012xc85e97e9.p100xa8fcbcdb.C1140x2319a6b2) l0()).d(obj)) {
                ((p012xc85e97e9.p100xa8fcbcdb.C1140x2319a6b2) l0()).M(obj);
            }
        }
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractDialogInterfaceOnClickListenerC1148x143072f5, p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        if (bundle == null) {
            this.f93267p = ((p012xc85e97e9.p100xa8fcbcdb.C1140x2319a6b2) l0()).X;
        } else {
            this.f93267p = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractDialogInterfaceOnClickListenerC1148x143072f5, p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onSaveInstanceState */
    public void mo7404xa71a2260(android.os.Bundle bundle) {
        super.mo7404xa71a2260(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f93267p);
    }
}
