package vi1;

/* loaded from: classes7.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f518980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f518981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yz5 f518982f;

    public s2(boolean z17, vi1.k3 k3Var, r45.yz5 yz5Var) {
        this.f518980d = z17;
        this.f518981e = k3Var;
        this.f518982f = yz5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f518980d;
        vi1.k3 k3Var = this.f518981e;
        if (z17) {
            vi1.k3.d(k3Var);
        }
        vi1.k3.c(k3Var, this.f518982f.f473071d);
    }
}
