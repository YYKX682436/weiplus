package hc2;

/* loaded from: classes.dex */
public final class g implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f361854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f361855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f361856f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f361857g;

    public g(android.view.View view, android.app.Activity activity, android.view.View view2, android.view.View view3) {
        this.f361854d = view;
        this.f361855e = activity;
        this.f361856f = view2;
        this.f361857g = view3;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f361854d.getViewTreeObserver().removeOnPreDrawListener(this);
        android.app.Activity activity = this.f361855e;
        float dimension = activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
        int h17 = com.p314xaae8f345.mm.ui.bl.h(activity);
        int b17 = a06.d.b(dimension + h17);
        android.view.View view = this.f361856f;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = b17;
            view.setLayoutParams(layoutParams);
            view.setPadding(0, h17, 0, 0);
        }
        android.view.View view2 = this.f361857g;
        if (view2 == null) {
            return true;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        layoutParams2.height = b17;
        view2.setLayoutParams(layoutParams2);
        return true;
    }
}
