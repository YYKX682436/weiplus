package oc2;

/* loaded from: classes.dex */
public final class d implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f425695d;

    public d(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f425695d = f0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable == null || editable.length() == 0) {
            return;
        }
        this.f425695d.f391649d = java.lang.Integer.parseInt(editable.toString());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
