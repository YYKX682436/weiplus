package ah1;

/* loaded from: classes7.dex */
public final class c implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ah1.i f4811d;

    public c(ah1.i iVar) {
        this.f4811d = iVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        kotlin.jvm.internal.o.g(view, "view");
        view.removeOnLayoutChangeListener(this);
        ah1.i iVar = this.f4811d;
        android.widget.RelativeLayout relativeLayout = iVar.f4835y;
        if (relativeLayout != null) {
            relativeLayout.getViewTreeObserver().addOnPreDrawListener(new ah1.a(relativeLayout, iVar));
        } else {
            kotlin.jvm.internal.o.o("requestContainer");
            throw null;
        }
    }
}
