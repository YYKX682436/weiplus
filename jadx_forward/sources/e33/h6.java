package e33;

/* loaded from: classes10.dex */
public class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f328808d;

    /* renamed from: e, reason: collision with root package name */
    public final t23.h2 f328809e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f328810f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f328811g;

    public h6(java.lang.ref.WeakReference weakReference, t23.h2 h2Var) {
        this.f328808d = weakReference;
        this.f328809e = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        t23.h2 h2Var;
        android.widget.EditText editText;
        android.app.ProgressDialog progressDialog;
        java.lang.ref.WeakReference weakReference = this.f328808d;
        if (weakReference == null || (h2Var = this.f328809e) == null) {
            return;
        }
        e33.y5 y5Var = (e33.y5) weakReference.get();
        if (y5Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmartGalleryUI", "show category.");
            y5Var.f329089e = h2Var;
            y5Var.m8146xced61ae5();
        }
        java.lang.ref.WeakReference weakReference2 = this.f328810f;
        if (weakReference2 != null && (progressDialog = (android.app.ProgressDialog) weakReference2.get()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmartGalleryUI", "tipDialog dismiss.");
            progressDialog.dismiss();
        }
        java.lang.ref.WeakReference weakReference3 = this.f328811g;
        if (weakReference3 == null || (editText = (android.widget.EditText) weakReference3.get()) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmartGalleryUI", "show keyboard.");
        editText.requestFocus();
        ((android.view.inputmethod.InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 0);
    }
}
