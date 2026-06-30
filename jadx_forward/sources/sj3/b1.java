package sj3;

/* loaded from: classes11.dex */
public class b1 implements android.view.ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sj3.f1 f489972a;

    public b1(sj3.f1 f1Var) {
        this.f489972a = f1Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        sj3.f1 f1Var = this.f489972a;
        if (f1Var.f490043g) {
            return;
        }
        f1Var.f490043g = true;
        zj3.d.c(zj3.c.i(), 0, 0, 0, 0, 0, 0, 0, 1, "", 0);
    }
}
