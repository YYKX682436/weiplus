package ej2;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej2.j f334830d;

    public i(ej2.j jVar) {
        this.f334830d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ej2.j jVar = this.f334830d;
        android.widget.EditText editText = jVar.f334835e;
        if (editText != null) {
            editText.requestFocus();
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) jVar.f334831a.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(jVar.f334835e, 0);
        }
    }
}
