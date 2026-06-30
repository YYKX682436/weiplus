package ah1;

/* loaded from: classes7.dex */
public final class j implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f4841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ah1.c0 f4842e;

    public j(android.view.View view, ah1.c0 c0Var) {
        this.f4841d = view;
        this.f4842e = c0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f4841d.getViewTreeObserver().removeOnPreDrawListener(this);
        ah1.c0 c0Var = this.f4842e;
        android.widget.RelativeLayout relativeLayout = c0Var.f4815x;
        if (relativeLayout == null) {
            kotlin.jvm.internal.o.o("mRootView");
            throw null;
        }
        android.view.ViewParent parent = relativeLayout.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            return true;
        }
        int measuredHeight = viewGroup.getMeasuredHeight();
        android.widget.RelativeLayout relativeLayout2 = c0Var.f4815x;
        if (relativeLayout2 == null) {
            kotlin.jvm.internal.o.o("mRootView");
            throw null;
        }
        if (measuredHeight <= relativeLayout2.getMeasuredHeight()) {
            return true;
        }
        android.widget.RelativeLayout relativeLayout3 = c0Var.f4815x;
        if (relativeLayout3 == null) {
            kotlin.jvm.internal.o.o("mRootView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout3.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = viewGroup.getMeasuredHeight();
        }
        android.widget.RelativeLayout relativeLayout4 = c0Var.f4815x;
        if (relativeLayout4 != null) {
            relativeLayout4.requestLayout();
            return true;
        }
        kotlin.jvm.internal.o.o("mRootView");
        throw null;
    }
}
