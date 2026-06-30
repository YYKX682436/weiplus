package gl5;

/* loaded from: classes15.dex */
public class l implements android.view.ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gl5.e0 f354567a;

    public l(gl5.e0 e0Var) {
        this.f354567a = e0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        gl5.e0 e0Var = this.f354567a;
        if (e0Var.f354481f != null) {
            e0Var.U.post(e0Var.f354482g);
        }
    }
}
