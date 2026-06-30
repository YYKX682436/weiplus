package yw2;

/* loaded from: classes10.dex */
public final class r implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f548200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f548201e;

    public r(yw2.a0 a0Var, android.view.View view) {
        this.f548200d = a0Var;
        this.f548201e = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        yw2.a0 a0Var = this.f548200d;
        a0Var.k().m82794x2d5b4f1b().removeOnLayoutChangeListener(this);
        android.view.View view2 = this.f548201e;
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), a0Var.n().m61852x987216ea().getHeight());
        view2.requestLayout();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineDrawerBuilder", "bottomMargin=" + a0Var.n().m61852x987216ea().getHeight() + " paddingBottom=" + view2.getPaddingBottom());
    }
}
