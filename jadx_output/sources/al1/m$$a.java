package al1;

/* loaded from: classes5.dex */
public final /* synthetic */ class m$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout f5789d;

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout.f91025e;
        com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout appBrandActionBarNavButtonContainerLayout = this.f5789d;
        int childCount = appBrandActionBarNavButtonContainerLayout.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                appBrandActionBarNavButtonContainerLayout.setTouchDelegate(null);
                return;
            }
            android.view.View childAt = appBrandActionBarNavButtonContainerLayout.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.isClickable()) {
                android.graphics.Rect rect = new android.graphics.Rect();
                childAt.getHitRect(rect);
                rect.left = java.lang.Math.max(0, rect.left - 100);
                rect.right = java.lang.Math.min(appBrandActionBarNavButtonContainerLayout.getWidth(), rect.right + 100);
                rect.top = java.lang.Math.max(0, rect.top - 100);
                rect.bottom = java.lang.Math.min(appBrandActionBarNavButtonContainerLayout.getHeight(), rect.bottom + 100);
                appBrandActionBarNavButtonContainerLayout.setTouchDelegate(new android.view.TouchDelegate(rect, childAt));
                return;
            }
        }
    }
}
