package va5;

/* loaded from: classes11.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va5.p f515952d;

    public n(va5.p pVar) {
        this.f515952d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va5.p pVar = this.f515952d;
        if (pVar.B == null) {
            return;
        }
        android.widget.OverScroller overScroller = pVar.A;
        if (overScroller != null) {
            va5.v vVar = pVar.f515959h;
            overScroller.springBack(-((int) vVar.getTranslationX()), 0, 0, vVar.m171393xc082385a(), 0, 0);
        }
        pVar.invalidate();
        if (pVar.f515954J) {
            java.lang.Runnable runnable = pVar.K;
            if (runnable != null) {
                pVar.removeCallbacks(runnable);
                pVar.K = null;
            }
            va5.o oVar = new va5.o(pVar);
            pVar.K = oVar;
            pVar.postDelayed(oVar, 150L);
        }
    }
}
