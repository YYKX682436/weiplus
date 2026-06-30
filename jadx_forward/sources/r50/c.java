package r50;

/* loaded from: classes.dex */
public final class c implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r50.g f474103d;

    public c(r50.g gVar) {
        this.f474103d = gVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        r50.g gVar = this.f474103d;
        gVar.T6().c().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.view.ViewGroup.LayoutParams layoutParams = gVar.T6().c().getLayoutParams();
        if (layoutParams != null) {
            int height = gVar.T6().c().getHeight();
            jz5.g gVar2 = gVar.f474111e;
            if (height > ((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue()) {
                layoutParams.height = ((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue();
                gVar.T6().c().setLayoutParams(layoutParams);
                gVar.T6().c().postInvalidate();
            }
        }
    }
}
