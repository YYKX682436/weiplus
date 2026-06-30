package ul1;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul1.d f510095d;

    public a(ul1.d dVar) {
        this.f510095d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ul1.d dVar = this.f510095d;
        if (dVar.getAlpha() == 0.0f || dVar.f510102h != null) {
            return;
        }
        dVar.animate().cancel();
        android.view.ViewPropertyAnimator animate = dVar.animate();
        dVar.f510102h = animate;
        animate.alpha(0.0f).setListener(new ul1.c(dVar)).start();
    }
}
