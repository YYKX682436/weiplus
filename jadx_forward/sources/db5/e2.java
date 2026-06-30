package db5;

/* loaded from: classes.dex */
public class e2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21491x5f1c5be9 f309856d;

    public e2(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21491x5f1c5be9 c21491x5f1c5be9) {
        this.f309856d = c21491x5f1c5be9;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21491x5f1c5be9 c21491x5f1c5be9 = this.f309856d;
        java.lang.String obj = c21491x5f1c5be9.f278895d.getText().toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            c21491x5f1c5be9.f278895d.setText("+");
            android.widget.EditText editText = c21491x5f1c5be9.f278895d;
            editText.setSelection(editText.getText().toString().length());
        } else if (!obj.contains("+")) {
            c21491x5f1c5be9.f278895d.setText("+".concat(obj));
            android.widget.EditText editText2 = c21491x5f1c5be9.f278895d;
            editText2.setSelection(editText2.getText().toString().length());
        } else if (obj.length() > 1) {
            java.lang.String substring = obj.substring(1);
            if (substring.length() > 4) {
                c21491x5f1c5be9.f278895d.setText(substring.substring(0, 4));
                return;
            }
        }
        c21491x5f1c5be9.getClass();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
