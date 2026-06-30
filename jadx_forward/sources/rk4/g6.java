package rk4;

/* loaded from: classes11.dex */
public final class g6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.p6 f478211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f478212e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f478213f;

    public g6(rk4.p6 p6Var, int i17, bw5.o50 o50Var) {
        this.f478211d = p6Var;
        this.f478212e = i17;
        this.f478213f = o50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f478211d.wi(this.f478212e, null, null, this.f478213f);
    }
}
