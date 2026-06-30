package zu2;

/* loaded from: classes3.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f557274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f557275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jx2.j f557276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zu2.a0 f557277g;

    public s(android.view.View view, android.view.View view2, jx2.j jVar, zu2.a0 a0Var) {
        this.f557274d = view;
        this.f557275e = view2;
        this.f557276f = jVar;
        this.f557277g = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f557274d;
        int left = view.getLeft() + (view.getMeasuredWidth() / 2);
        android.view.View anchor = this.f557275e;
        int measuredWidth = left - (anchor.getMeasuredWidth() / 2);
        jx2.j jVar = this.f557276f;
        jVar.f383967d = measuredWidth;
        jVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        if (!jVar.f383968e) {
            jVar.getContentView().measure(0, 0);
            jVar.f383968e = true;
        }
        int measuredWidth2 = jVar.getContentView().getMeasuredWidth();
        int measuredHeight = jVar.getContentView().getMeasuredHeight();
        jVar.setWidth(measuredWidth2);
        jVar.setHeight(measuredHeight);
        int measuredHeight2 = jVar.getContentView().getMeasuredHeight();
        int[] iArr = new int[2];
        anchor.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = iArr[0];
        rect.left = i17;
        rect.top = iArr[1];
        rect.right = i17 + anchor.getMeasuredWidth();
        rect.bottom = rect.top + anchor.getMeasuredHeight();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        anchor.getWindowVisibleDisplayFrame(rect2);
        int i18 = rect.bottom + measuredHeight2 > rect2.height() ? -(measuredHeight2 + rect.height()) : 0;
        jVar.a(anchor, java.lang.Integer.valueOf(i18));
        jVar.setAnimationStyle(i18 < 0 ? com.p314xaae8f345.mm.R.C30868x68b1db1.f575995np : com.p314xaae8f345.mm.R.C30868x68b1db1.f575996nq);
        jVar.showAsDropDown(anchor, 0, i18, 8388613);
        float f17 = com.p314xaae8f345.mm.ui.bk.C() ? 0.1f : 0.5f;
        try {
            android.view.View contentView = jVar.getContentView();
            android.view.View rootView = contentView != null ? contentView.getRootView() : null;
            if (rootView != null) {
                java.lang.Object systemService = jVar.f383965b.getSystemService("window");
                android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
                if (windowManager != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
                    android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.flags |= 2;
                        layoutParams2.dimAmount = f17;
                        windowManager.updateViewLayout(rootView, layoutParams2);
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.lang.String.format("pw:%s, ph:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(measuredWidth2), java.lang.Integer.valueOf(measuredHeight)}, 2)), "format(...)");
        this.f557277g.f557229h = jVar;
    }
}
