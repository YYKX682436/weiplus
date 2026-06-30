package on2;

/* loaded from: classes.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f428392d;

    public c3(android.view.View view) {
        this.f428392d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context;
        android.widget.EditText editText = (android.widget.EditText) this.f428392d.findViewById(com.p314xaae8f345.mm.R.id.f565272bx0);
        if (editText != null) {
            editText.requestFocus();
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
    }
}
