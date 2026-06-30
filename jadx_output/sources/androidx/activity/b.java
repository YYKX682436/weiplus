package androidx.activity;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.ComponentActivity f9027d;

    public b(androidx.activity.ComponentActivity componentActivity) {
        this.f9027d = componentActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (java.lang.IllegalStateException e17) {
            if (!android.text.TextUtils.equals(e17.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e17;
            }
        }
    }
}
