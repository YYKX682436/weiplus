package wj2;

/* loaded from: classes10.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.g0 f528207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f528208e;

    public f0(wj2.g0 g0Var, float f17) {
        this.f528207d = g0Var;
        this.f528208e = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wj2.g0 g0Var = this.f528207d;
        float b17 = i65.a.b(g0Var.getContext(), 24);
        float f17 = this.f528208e;
        g0Var.v((int) (b17 * f17), 14 * f17);
    }
}
