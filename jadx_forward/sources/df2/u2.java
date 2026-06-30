package df2;

/* loaded from: classes3.dex */
public final class u2 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f313027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.a3 f313028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f313029f;

    public u2(int i17, df2.a3 a3Var, yz5.a aVar) {
        this.f313027d = i17;
        this.f313028e = a3Var;
        this.f313029f = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        view.removeOnLayoutChangeListener(this);
        df2.a3 a3Var = this.f313028e;
        if (this.f313027d == a3Var.f311201h) {
            a3Var.f311203j.a(a3Var.f311195b, a3Var.f311194a);
            a3Var.f311203j.f313452a = 0.0f;
            a3Var.f311194a.invalidateOutline();
            android.view.View view2 = a3Var.f311194a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterFadingAnimator$animateIn$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterFadingAnimator$animateIn$$inlined$doOnLayout$1", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a3Var.c(0.0f, 1.0f, new df2.v2(a3Var, this.f313029f));
        }
    }
}
