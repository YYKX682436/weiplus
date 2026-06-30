package ky2;

/* loaded from: classes.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f395095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ky2.w f395096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f395097f;

    public m(int i17, ky2.w wVar, android.widget.EditText editText) {
        this.f395095d = i17;
        this.f395096e = wVar;
        this.f395097f = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar;
        ky2.w wVar = this.f395096e;
        int size = wVar.f395118e.size() - 2;
        int i17 = this.f395095d;
        if (i17 == size && (lVar = wVar.f395127q) != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(i17 + 1));
        }
        android.widget.EditText editText = this.f395097f;
        java.lang.Object systemService = editText.getContext().getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(editText, 2);
    }
}
