package fn2;

/* loaded from: classes5.dex */
public final class r implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.s f345896d;

    public r(fn2.s sVar) {
        this.f345896d = sVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 3) {
            java.lang.String obj = textView.getText().toString();
            fn2.s sVar = this.f345896d;
            sVar.f345916v = obj;
            android.content.Context c17 = sVar.c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "access$getContext(...)");
            android.widget.EditText editText = sVar.f345906i;
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) c17.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar = sVar.f345912r;
            if (dvVar != null) {
                dvVar.b();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar2 = sVar.f345913s;
            if (dvVar2 != null) {
                dvVar2.e();
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var = sVar.f345902e;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new fn2.q(sVar, null), 2, null);
            }
        }
        return false;
    }
}
