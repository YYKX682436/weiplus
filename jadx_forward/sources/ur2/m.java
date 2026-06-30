package ur2;

/* loaded from: classes10.dex */
public final class m implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur2.o f511936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f511937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f511938f;

    public m(ur2.o oVar, java.lang.String str, int i17) {
        this.f511936d = oVar;
        this.f511937e = str;
        this.f511938f = i17;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        qd2.r rVar = qd2.x.f443382a;
        ur2.o oVar = this.f511936d;
        java.lang.String b17 = rVar.b(oVar.f511940d, java.lang.String.valueOf(editable), this.f511937e);
        boolean z17 = b17.length() > 0;
        android.view.View view = oVar.f511950q;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = oVar.f511940d;
        android.widget.TextView textView = oVar.f511951r;
        if (z17) {
            textView.setText(b17);
            textView.setClickable(false);
            textView.setTextColor(activityC0065xcd7aa112.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            view.setEnabled(false);
            return;
        }
        int length = editable != null ? editable.length() : 0;
        int i17 = this.f511938f;
        if (length > i17) {
            oVar.f511944h = length;
            textView.setText(activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ojz, java.lang.Integer.valueOf(i17)));
            textView.setClickable(false);
            textView.setTextColor(activityC0065xcd7aa112.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            java.lang.CharSequence subSequence = editable != null ? editable.subSequence(0, i17) : null;
            android.widget.EditText editText = oVar.f511948o;
            editText.setText(subSequence);
            editText.setSelection(i17);
        } else if (oVar.f511944h <= i17 || length != i17) {
            oVar.f511944h = length;
            textView.setClickable(true);
            textView.setText(activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ewz));
            textView.setTextColor(activityC0065xcd7aa112.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        } else {
            oVar.f511944h = length;
        }
        view.setEnabled(length > 0);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
