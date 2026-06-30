package vp;

/* loaded from: classes16.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wp.a f520392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp.c0 f520393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp.d0 f520394f;

    public y(vp.d0 d0Var, wp.a aVar, vp.c0 c0Var) {
        this.f520394f = d0Var;
        this.f520392d = aVar;
        this.f520393e = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        xp.d dVar = this.f520394f.f520299d;
        wp.a aVar = this.f520392d;
        vp.d0.b(dVar, aVar);
        vp.c0 c0Var = this.f520393e;
        if (c0Var != null) {
            c0Var.a(aVar);
        }
    }
}
