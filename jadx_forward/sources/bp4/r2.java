package bp4;

/* loaded from: classes10.dex */
public final class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.w2 f104899d;

    public r2(bp4.w2 w2Var) {
        this.f104899d = w2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bp4.w2 w2Var = this.f104899d;
        if (w2Var.f104943o) {
            return;
        }
        ((bp4.y) w2Var.f104935d).f104960a.f104744g.b();
    }
}
