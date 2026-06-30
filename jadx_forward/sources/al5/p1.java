package al5;

/* loaded from: classes.dex */
public class p1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.EditText f87515d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f87516e;

    /* renamed from: f, reason: collision with root package name */
    public final int f87517f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f87518g = false;

    public p1(android.widget.EditText editText, android.widget.TextView textView, int i17) {
        this.f87515d = editText;
        this.f87516e = textView;
        this.f87517f = i17;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17;
        android.widget.EditText editText = this.f87515d;
        java.lang.String obj = editable.toString();
        int i18 = 0;
        int i19 = 0;
        java.lang.String str = "";
        while (true) {
            int length = obj.length();
            i17 = this.f87517f;
            if (i18 < length) {
                i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z0(obj.charAt(i18)) ? i19 + 2 : i19 + 1;
                if (i19 > i17) {
                    break;
                }
                str = str + obj.charAt(i18);
                i18++;
            } else {
                break;
            }
        }
        if (i19 > i17) {
            try {
                editText.setText(str);
                if (this.f87518g) {
                    editText.setSelection(0);
                } else {
                    editText.setSelection(editText.getText().toString().length());
                }
                this.f87518g = false;
            } catch (java.lang.Exception e17) {
                this.f87518g = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMEditText", "error " + e17.getMessage());
                editText.setText(str);
                editText.setSelection(0);
            }
        }
        int i27 = i17 - i19;
        int i28 = i27 >= 0 ? i27 : 0;
        android.widget.TextView textView = this.f87516e;
        if (textView != null) {
            textView.setText("" + (i28 / 2));
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
