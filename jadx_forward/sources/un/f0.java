package un;

/* loaded from: classes.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.k0 f510785d;

    public f0(un.k0 k0Var) {
        this.f510785d = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        un.k0 k0Var = this.f510785d;
        un.k0.V6(k0Var).b().m75362x652b8d61();
        k0Var.P6();
        android.widget.EditText m75362x652b8d61 = un.k0.V6(k0Var).b().m75362x652b8d61();
        if (m75362x652b8d61 != null) {
            m75362x652b8d61.requestFocus();
            m75362x652b8d61.postDelayed(new un.e0(k0Var), 128L);
        }
    }
}
