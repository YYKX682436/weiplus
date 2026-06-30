package nl5;

/* loaded from: classes15.dex */
public final class k0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl5.s0 f419849d;

    public k0(nl5.s0 s0Var) {
        this.f419849d = s0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
        nl5.s0 s0Var = this.f419849d;
        java.lang.CharSequence text = s0Var.f419890h.getText();
        s0Var.f419891i = text instanceof android.text.Spannable ? (android.text.Spannable) text : null;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
        nl5.s0 s0Var = this.f419849d;
        if (!s0Var.f419906x) {
            s0Var.l();
            s0Var.k();
        }
        s0Var.d();
        s0Var.f419890h.setCursorVisible(true);
        s0Var.R = s0Var.f419890h.getSelectionStart();
    }
}
