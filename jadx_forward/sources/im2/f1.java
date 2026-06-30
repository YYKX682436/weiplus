package im2;

/* loaded from: classes3.dex */
public final class f1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f373846d;

    public f1(im2.z3 z3Var) {
        this.f373846d = z3Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        im2.z3 z3Var = this.f373846d;
        z3Var.f374185m2 = true;
        z3Var.R6();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 e76 = z3Var.e7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e76, "access$getMNewTitleEditText(...)");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) z3Var.f374191q).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "access$getMNewTitleLimitText(...)");
        ck5.f b17 = ck5.f.b(e76);
        b17.f124094f = 0;
        int i17 = z3Var.N1;
        b17.f124093e = i17;
        b17.f124095g = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;
        b17.f124089a = true;
        b17.d(new im2.d0(textView, i17, 5));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
