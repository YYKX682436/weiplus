package fn4;

/* loaded from: classes15.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f346158d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f346159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn4.z0 f346160f;

    public y0(fn4.z0 z0Var, fn4.t0 t0Var) {
        this.f346160f = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.z0 z0Var = this.f346160f;
        try {
            fn4.z0.a(z0Var, new org.json.JSONObject(this.f346158d), this.f346159e);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            z0Var.f346165b = false;
            throw th6;
        }
        z0Var.f346165b = false;
    }
}
