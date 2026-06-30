package ah1;

/* loaded from: classes7.dex */
public final class c implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ah1.i f86344d;

    public c(ah1.i iVar) {
        this.f86344d = iVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        view.removeOnLayoutChangeListener(this);
        ah1.i iVar = this.f86344d;
        android.widget.RelativeLayout relativeLayout = iVar.f86368y;
        if (relativeLayout != null) {
            relativeLayout.getViewTreeObserver().addOnPreDrawListener(new ah1.a(relativeLayout, iVar));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("requestContainer");
            throw null;
        }
    }
}
