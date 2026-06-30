package zw1;

/* loaded from: classes5.dex */
public class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.t4 f558326d;

    public s4(zw1.t4 t4Var) {
        this.f558326d = t4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        zw1.t4 t4Var = this.f558326d;
        t4Var.f558339c.mo48674x36654fab();
        ((android.view.inputmethod.InputMethodManager) t4Var.f558339c.getSystemService("input_method")).hideSoftInputFromWindow(t4Var.f558339c.F.getWindowToken(), 0);
    }
}
