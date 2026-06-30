package androidx.lifecycle;

/* loaded from: classes13.dex */
public class h0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.g0 f11627d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.k0 f11628e;

    /* renamed from: f, reason: collision with root package name */
    public int f11629f = -1;

    public h0(androidx.lifecycle.g0 g0Var, androidx.lifecycle.k0 k0Var) {
        this.f11627d = g0Var;
        this.f11628e = k0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        int i17 = this.f11629f;
        androidx.lifecycle.g0 g0Var = this.f11627d;
        if (i17 != g0Var.getVersion()) {
            this.f11629f = g0Var.getVersion();
            this.f11628e.onChanged(obj);
        }
    }
}
