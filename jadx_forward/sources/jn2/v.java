package jn2;

/* loaded from: classes5.dex */
public final class v implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.w f382250d;

    public v(jn2.w wVar) {
        this.f382250d = wVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 3) {
            jn2.w wVar = this.f382250d;
            android.content.Context d17 = wVar.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "access$getContext(...)");
            android.widget.EditText editText = wVar.f382258i;
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) d17.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
            }
            jn2.w.c(wVar);
            te2.a9.f499416a.a(wVar.f382255f.h7(), 3, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = wVar.f382254e;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new jn2.u(wVar, textView, null), 3, null);
            }
        }
        return false;
    }
}
