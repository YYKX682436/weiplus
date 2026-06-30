package gt4;

/* loaded from: classes.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f356935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f356936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f356937f;

    public c(boolean z17, android.widget.EditText editText, android.content.Context context) {
        this.f356935d = z17;
        this.f356936e = editText;
        this.f356937f = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.EditText editText;
        if (this.f356935d && (editText = this.f356936e) != null && fp.h.c(28)) {
            editText.requestFocus();
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f356937f.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(editText, 0);
            }
        }
    }
}
