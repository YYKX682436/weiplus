package db5;

/* loaded from: classes8.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f310100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.y0 f310101e;

    public x0(db5.y0 y0Var, int i17) {
        this.f310101e = y0Var;
        this.f310100d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.y0 y0Var = this.f310101e;
        ((android.app.Dialog) y0Var.f310109d.getTag()).dismiss();
        db5.z0 z0Var = y0Var.f310110e;
        if (z0Var != null) {
            z0Var.a(this.f310100d);
        }
    }
}
