package sx5;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f495297d;

    public x(sx5.a1 a1Var) {
        this.f495297d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx5.a1 a1Var = this.f495297d;
        if (a1Var.f495211n != null) {
            a1Var.f495221v.setVisibility(4);
            a1Var.f495220u.setVisibility(4);
        }
    }
}
