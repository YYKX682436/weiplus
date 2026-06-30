package x92;

/* loaded from: classes2.dex */
public final class b implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f534203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x92.e f534204e;

    public b(android.view.View view, x92.e eVar) {
        this.f534203d = view;
        this.f534204e = eVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.widget.FrameLayout frameLayout;
        this.f534203d.getViewTreeObserver().removeOnPreDrawListener(this);
        x92.e eVar = this.f534204e;
        float dimension = eVar.m158354x19263085().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
        int h17 = com.p314xaae8f345.mm.ui.bl.h(eVar.m158354x19263085());
        if (!eVar.f534221x && !eVar.f534222y) {
            int b17 = a06.d.b(dimension + h17);
            android.view.View view = eVar.f534209i;
            if (view != null) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = b17;
                view.setLayoutParams(layoutParams);
                view.setPadding(0, h17, 0, 0);
            }
            android.widget.FrameLayout frameLayout2 = eVar.f534207g;
            if (frameLayout2 != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
                layoutParams2.height = b17;
                frameLayout2.setLayoutParams(layoutParams2);
                android.widget.FrameLayout frameLayout3 = eVar.f534253e;
                if (frameLayout3 != null) {
                    frameLayout3.setMinimumHeight(b17);
                }
            }
        }
        if (!eVar.f534222y || (frameLayout = eVar.f534207g) == null) {
            return true;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
        layoutParams3.height = 0;
        frameLayout.setLayoutParams(layoutParams3);
        android.widget.FrameLayout frameLayout4 = eVar.f534253e;
        if (frameLayout4 == null) {
            return true;
        }
        frameLayout4.setMinimumHeight(0);
        return true;
    }
}
