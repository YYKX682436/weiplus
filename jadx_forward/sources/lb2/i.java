package lb2;

/* loaded from: classes5.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f399270d;

    public i(android.widget.EditText editText) {
        this.f399270d = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.EditText editText = this.f399270d;
        editText.requestFocus();
        editText.selectAll();
    }
}
