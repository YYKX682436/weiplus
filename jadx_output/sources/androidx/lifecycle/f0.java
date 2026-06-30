package androidx.lifecycle;

/* loaded from: classes13.dex */
public abstract class f0 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.k0 f11623d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11624e;

    /* renamed from: f, reason: collision with root package name */
    public int f11625f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.g0 f11626g;

    public f0(androidx.lifecycle.g0 g0Var, androidx.lifecycle.k0 k0Var) {
        this.f11626g = g0Var;
        this.f11623d = k0Var;
    }

    public void a(boolean z17) {
        if (z17 == this.f11624e) {
            return;
        }
        this.f11624e = z17;
        int i17 = z17 ? 1 : -1;
        androidx.lifecycle.g0 g0Var = this.f11626g;
        g0Var.changeActiveCounter(i17);
        if (this.f11624e) {
            g0Var.dispatchingValue(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(androidx.lifecycle.y yVar) {
        return false;
    }

    public abstract boolean d();
}
