package ut2;

/* loaded from: classes3.dex */
public final class z3 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.a4 f512707d;

    public z3(ut2.a4 a4Var) {
        this.f512707d = a4Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17;
        ut2.a4 a4Var = this.f512707d;
        a4Var.f512353b.h().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        java.lang.Object parent = a4Var.f512354c.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        int height = ((android.view.View) parent).getHeight();
        a4Var.f512354c.getLayoutParams().width = -1;
        a4Var.f512354c.getLayoutParams().height = height;
        int childCount = a4Var.f512353b.q().getChildCount();
        int i18 = 0;
        while (true) {
            if (i18 >= childCount) {
                i17 = 0;
                break;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = a4Var.f512353b.q().w0(a4Var.f512353b.q().getChildAt(i18));
            if ((w07 instanceof ut2.t0) && ((ut2.t0) w07).f512632i == ut2.p0.f512580e) {
                i17 = w07.f3639x46306858.getBottom();
                break;
            }
            i18++;
        }
        int f17 = i65.a.f(a4Var.f512352a.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561200c4);
        android.view.ViewGroup.LayoutParams layoutParams = a4Var.f512355d.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, i17 + (((height - i17) - f17) / 3), 0, 0);
            a4Var.f512355d.setLayoutParams(marginLayoutParams);
        }
    }
}
