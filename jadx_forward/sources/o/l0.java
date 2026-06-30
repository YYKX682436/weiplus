package o;

/* loaded from: classes15.dex */
public class l0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o.n0 f423277d;

    public l0(o.n0 n0Var) {
        this.f423277d = n0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        o.n0 n0Var = this.f423277d;
        if (!n0Var.mo2734x58a9c73b() || n0Var.f423294o.D) {
            return;
        }
        android.view.View view = n0Var.f423299t;
        if (view == null || !view.isShown()) {
            n0Var.mo2732x63a3b28a();
        } else {
            n0Var.f423294o.mo2735x35dafd();
        }
    }
}
