package al5;

/* loaded from: classes.dex */
public class p1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.EditText f5982d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f5983e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5984f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5985g = false;

    public p1(android.widget.EditText editText, android.widget.TextView textView, int i17) {
        this.f5982d = editText;
        this.f5983e = textView;
        this.f5984f = i17;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17;
        android.widget.EditText editText = this.f5982d;
        java.lang.String obj = editable.toString();
        int i18 = 0;
        int i19 = 0;
        java.lang.String str = "";
        while (true) {
            int length = obj.length();
            i17 = this.f5984f;
            if (i18 < length) {
                i19 = com.tencent.mm.sdk.platformtools.t8.z0(obj.charAt(i18)) ? i19 + 2 : i19 + 1;
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
                if (this.f5985g) {
                    editText.setSelection(0);
                } else {
                    editText.setSelection(editText.getText().toString().length());
                }
                this.f5985g = false;
            } catch (java.lang.Exception e17) {
                this.f5985g = true;
                com.tencent.mars.xlog.Log.e("MicroMsg.MMEditText", "error " + e17.getMessage());
                editText.setText(str);
                editText.setSelection(0);
            }
        }
        int i27 = i17 - i19;
        int i28 = i27 >= 0 ? i27 : 0;
        android.widget.TextView textView = this.f5983e;
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
