package ej2;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej2.j f334827d;

    public f(ej2.j jVar) {
        this.f334827d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.EditText editText = this.f334827d.f334835e;
        if (editText != null) {
            editText.requestFocus();
        }
    }
}
