package androidx.lifecycle;

/* loaded from: classes13.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.b0 f11670a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f11671b = new android.os.Handler();

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.y0 f11672c;

    public z0(androidx.lifecycle.y yVar) {
        this.f11670a = new androidx.lifecycle.b0(yVar, true);
    }

    public final void a(androidx.lifecycle.m mVar) {
        androidx.lifecycle.y0 y0Var = this.f11672c;
        if (y0Var != null) {
            y0Var.run();
        }
        androidx.lifecycle.y0 y0Var2 = new androidx.lifecycle.y0(this.f11670a, mVar);
        this.f11672c = y0Var2;
        this.f11671b.postAtFrontOfQueue(y0Var2);
    }
}
