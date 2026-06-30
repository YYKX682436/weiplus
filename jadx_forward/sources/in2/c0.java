package in2;

/* loaded from: classes10.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.t f374347d;

    public c0(in2.t tVar) {
        this.f374347d = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in2.t tVar = this.f374347d;
        tVar.f374435h.requestFocus();
        java.lang.Object systemService = tVar.f374435h.getContext().getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(tVar.f374435h, 0);
    }
}
