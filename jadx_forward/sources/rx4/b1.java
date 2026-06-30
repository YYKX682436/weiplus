package rx4;

/* loaded from: classes.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f482638d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(rx4.h2 h2Var) {
        super(0);
        this.f482638d = h2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById;
        android.view.View findViewById2;
        rx4.h2 h2Var = this.f482638d;
        int color = h2Var.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        float f17 = h2Var.m158354x19263085().getResources().getDisplayMetrics().density;
        android.widget.ScrollView scrollView = h2Var.f482707p;
        if (scrollView != null) {
            scrollView.setBackgroundColor(color);
        }
        android.widget.ScrollView scrollView2 = h2Var.f482707p;
        android.view.View childAt = scrollView2 != null ? scrollView2.getChildAt(0) : null;
        android.view.ViewGroup viewGroup = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(color);
            viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), (int) (40 * f17));
        }
        android.view.View findViewById3 = h2Var.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.che);
        if (findViewById3 != null) {
            findViewById3.setBackgroundColor(color);
        }
        android.view.View findViewById4 = h2Var.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f568870oc1);
        if (findViewById4 != null) {
            findViewById4.setBackgroundColor(color);
        }
        android.view.View findViewById5 = h2Var.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.ggf);
        if (findViewById5 != null) {
            findViewById5.setBackgroundColor(color);
        }
        android.view.View findViewById6 = h2Var.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.phj);
        if (findViewById6 != null) {
            findViewById6.setBackgroundColor(color);
        }
        int i17 = (int) (56 * f17);
        android.view.View findViewById7 = h2Var.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.che);
        if (findViewById7 == null) {
            findViewById7 = h2Var.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.ggf);
        }
        if (findViewById7 != null && (findViewById2 = findViewById7.findViewById(com.p314xaae8f345.mm.R.id.f568869oc0)) != null && findViewById2.getLayoutParams().height != i17) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            layoutParams.height = i17;
            findViewById2.setLayoutParams(layoutParams);
        }
        if (findViewById7 != null && (findViewById = findViewById7.findViewById(com.p314xaae8f345.mm.R.id.pil)) != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null && marginLayoutParams.topMargin != i17) {
                marginLayoutParams.topMargin = i17;
                findViewById.setLayoutParams(marginLayoutParams);
            }
        }
        return jz5.f0.f384359a;
    }
}
