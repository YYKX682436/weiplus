package qk5;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f445982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f445983e;

    public a(android.view.View view, android.view.View view2) {
        this.f445982d = view;
        this.f445983e = view2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        android.view.ViewGroup.LayoutParams layoutParams = this.f445982d.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.View view2 = this.f445983e;
            android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                int i39 = marginLayoutParams.bottomMargin;
                int i47 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                if (i39 != i47) {
                    marginLayoutParams.bottomMargin = i47;
                    view2.setLayoutParams(layoutParams2);
                }
            }
        }
    }
}
