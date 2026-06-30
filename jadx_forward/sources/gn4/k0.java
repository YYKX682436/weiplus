package gn4;

/* loaded from: classes15.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm4.j f355168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gn4.l0 f355169e;

    public k0(gn4.l0 l0Var, sm4.j jVar) {
        this.f355169e = l0Var;
        this.f355168d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gn4.c1 c1Var = this.f355169e.f355171d.f256689o;
        sm4.j jVar = this.f355168d;
        fn4.m E = c1Var.E(jVar.f491488g);
        if (E == null || !(E instanceof gn4.d0)) {
            return;
        }
        ((gn4.c0) E.i().mo129842x143e7d6c()).B(jVar.f491488g);
    }
}
