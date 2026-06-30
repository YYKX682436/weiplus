package wl5;

/* loaded from: classes15.dex */
public class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl5.x f528638d;

    public b(wl5.x xVar) {
        this.f528638d = xVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        wl5.x xVar = this.f528638d;
        xVar.f528698j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (xVar.f528699k != null) {
            xVar.f528698j.getLocationInWindow(xVar.R);
        }
    }
}
