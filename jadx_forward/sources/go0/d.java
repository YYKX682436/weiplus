package go0;

/* loaded from: classes14.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f355278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f355279e;

    public d(go0.f0 f0Var, boolean z17) {
        this.f355278d = f0Var;
        this.f355279e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kn0.f fVar;
        rs0.h n17 = rs0.g.n(rs0.i.f480829a, null, null, 1, 1, null, 16, null);
        go0.f0 f0Var = this.f355278d;
        f0Var.f355296i = n17;
        kn0.i iVar = f0Var.f355301q;
        boolean z17 = (iVar == null || (fVar = iVar.f391093d) == null) ? false : fVar.f391064c;
        f0Var.f355300p = f0Var.f(z17, this.f355279e, f0Var.f355291d);
        go0.f1 f1Var = f0Var.f355300p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f1Var);
        f0Var.m(f1Var, z17);
    }
}
