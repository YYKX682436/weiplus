package ah1;

/* loaded from: classes7.dex */
public final class a implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f86339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ah1.i f86340e;

    public a(android.view.View view, ah1.i iVar) {
        this.f86339d = view;
        this.f86340e = iVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f86339d.getViewTreeObserver().removeOnPreDrawListener(this);
        ah1.i iVar = this.f86340e;
        android.widget.RelativeLayout relativeLayout = iVar.f86368y;
        if (relativeLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("requestContainer");
            throw null;
        }
        android.view.ViewParent parent = relativeLayout.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            return true;
        }
        int measuredHeight = viewGroup.getMeasuredHeight();
        android.widget.RelativeLayout relativeLayout2 = iVar.f86368y;
        if (relativeLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("requestContainer");
            throw null;
        }
        if (measuredHeight <= relativeLayout2.getMeasuredHeight()) {
            return true;
        }
        android.widget.RelativeLayout relativeLayout3 = iVar.f86368y;
        if (relativeLayout3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("requestContainer");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout3.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = viewGroup.getMeasuredHeight();
        }
        android.widget.RelativeLayout relativeLayout4 = iVar.f86368y;
        if (relativeLayout4 != null) {
            relativeLayout4.requestLayout();
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("requestContainer");
        throw null;
    }
}
