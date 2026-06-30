package r02;

/* loaded from: classes8.dex */
public class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13240x9c8ab066 f449816d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13240x9c8ab066 c13240x9c8ab066) {
        this.f449816d = c13240x9c8ab066;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13240x9c8ab066.f178889i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13240x9c8ab066 c13240x9c8ab066 = this.f449816d;
        if (c13240x9c8ab066.getVisibility() == 8) {
            return;
        }
        for (android.view.ViewParent parent = c13240x9c8ab066.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928) {
                int computeVerticalScrollRange = ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13250xfa9a7928) parent).computeVerticalScrollRange();
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) c13240x9c8ab066.getLayoutParams();
                int i18 = c13240x9c8ab066.f178894h;
                if (computeVerticalScrollRange < i18) {
                    layoutParams.topMargin += i18 - computeVerticalScrollRange;
                    c13240x9c8ab066.setLayoutParams(layoutParams);
                } else if (computeVerticalScrollRange > i18) {
                    int i19 = layoutParams.topMargin;
                    int i27 = c13240x9c8ab066.f178893g;
                    if (i19 > i27) {
                        layoutParams.topMargin = i19 - (computeVerticalScrollRange - i18);
                        c13240x9c8ab066.setLayoutParams(layoutParams);
                    } else if (i19 < i27) {
                        layoutParams.topMargin = i27;
                        c13240x9c8ab066.setLayoutParams(layoutParams);
                    }
                }
                int i28 = layoutParams.topMargin;
                return;
            }
        }
    }
}
