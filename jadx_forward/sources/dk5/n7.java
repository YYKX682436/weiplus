package dk5;

/* loaded from: classes9.dex */
public class n7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.p7 f316301d;

    public n7(dk5.p7 p7Var) {
        this.f316301d = p7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        dk5.p7 p7Var = this.f316301d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = p7Var.f316347b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        dk5.o7 o7Var = p7Var.f316355j;
        if (o7Var != null) {
            o7Var.a(p7Var.f316350e, p7Var.f316351f, p7Var.f316353h, p7Var.f316352g);
        }
    }
}
