package zw1;

/* loaded from: classes5.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.q0 f558286d;

    public p0(zw1.q0 q0Var) {
        this.f558286d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        zw1.q0 q0Var = this.f558286d;
        q0Var.f558296a.mo48674x36654fab();
        ((android.view.inputmethod.InputMethodManager) q0Var.f558296a.getSystemService("input_method")).hideSoftInputFromWindow(q0Var.f558296a.Q1.getWindowToken(), 0);
    }
}
