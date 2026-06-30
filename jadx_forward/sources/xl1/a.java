package xl1;

/* loaded from: classes5.dex */
public class a implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12810x6cc39e95 f536635d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12810x6cc39e95 c12810x6cc39e95) {
        this.f536635d = c12810x6cc39e95;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable == null || editable.length() == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVerifyCodeView", "afterTextChanged:%s", editable.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12810x6cc39e95 c12810x6cc39e95 = this.f536635d;
        if (c12810x6cc39e95.f173637d.length() < 6) {
            c12810x6cc39e95.f173637d.append(editable.toString());
            java.lang.StringBuilder sb6 = c12810x6cc39e95.f173637d;
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVerifyCodeView", "mBuilder:" + ((java.lang.Object) sb6));
            int length = sb7.length();
            if (length > 0 && length <= 6) {
                int i17 = length - 1;
                android.widget.TextView[] textViewArr = c12810x6cc39e95.f173639f;
                textViewArr[i17].setVisibility(0);
                textViewArr[i17].setText(java.lang.String.valueOf(sb7.charAt(i17)));
                c12810x6cc39e95.f173638e[i17].setVisibility(4);
            }
        }
        editable.delete(0, editable.length());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
