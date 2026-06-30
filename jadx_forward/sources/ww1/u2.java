package ww1;

/* loaded from: classes15.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f531840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f531841e;

    public u2(ww1.b3 b3Var, ww1.a3 a3Var) {
        this.f531840d = b3Var;
        this.f531841e = a3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ww1.b3 b3Var = this.f531840d;
        android.view.ViewGroup.LayoutParams layoutParams = b3Var.V.getLayoutParams();
        if (b3Var.f531672k.getHeight() != 0) {
            layoutParams.height = b3Var.f531672k.getHeight();
        } else {
            layoutParams.height = (int) this.f531841e.f531648y;
        }
        b3Var.V.setLayoutParams(layoutParams);
    }
}
