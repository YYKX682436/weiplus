package gt4;

/* loaded from: classes3.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f356986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f356987e;

    public j(android.content.Context context, android.widget.EditText editText) {
        this.f356986d = context;
        this.f356987e = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((android.view.inputmethod.InputMethodManager) this.f356986d.getSystemService("input_method")).showSoftInput(this.f356987e, 2);
    }
}
