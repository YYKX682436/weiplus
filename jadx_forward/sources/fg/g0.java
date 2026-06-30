package fg;

/* loaded from: classes7.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.i0 f343296d;

    public g0(fg.i0 i0Var) {
        this.f343296d = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String message;
        fg.i0 i0Var = this.f343296d;
        fg.f fVar = i0Var.f343309g;
        i0Var.getClass();
        java.lang.String str = null;
        try {
            str = fg.j0.a(fVar, i0Var.f343303a, i0Var.f343306d);
            message = null;
        } catch (java.lang.IllegalStateException e17) {
            message = e17.getMessage();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewExtendSecureKeyboard", "dispatchKeyboardComplete, encryptErrorMsg: " + message);
        }
        android.text.Editable m17 = i0Var.m();
        int length = m17 != null ? m17.length() : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < length; i17++) {
            sb6.append('*');
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        int selectionEnd = android.text.Selection.getSelectionEnd(i0Var.m());
        yz5.r rVar = i0Var.f343304b;
        if (rVar != null) {
            rVar.C(sb7, java.lang.Integer.valueOf(selectionEnd), str, message);
        }
    }
}
