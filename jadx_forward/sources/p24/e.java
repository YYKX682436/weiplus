package p24;

/* loaded from: classes.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f432968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f432969e;

    public e(android.view.View view, int i17) {
        this.f432968d = view;
        this.f432969e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        android.view.View view = this.f432968d;
        android.view.ViewParent parent = view.getParent();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = parent instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) parent : null;
        if (c1163xf1deaba4 == null || (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) == null) {
            return;
        }
        if (this.f432969e == mo7946xf939df19.mo1894x7e414b06() - 1) {
            int childCount = c1163xf1deaba4.getChildCount();
            int i17 = 0;
            for (int i18 = 0; i18 < childCount; i18++) {
                i17 += c1163xf1deaba4.getChildAt(i18).getHeight();
            }
            int height = c1163xf1deaba4.getHeight();
            if (i17 < height) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int height2 = view.getHeight() + (height - i17);
                if (layoutParams.height != height2) {
                    layoutParams.height = height2;
                    view.setLayoutParams(layoutParams);
                }
            }
        }
    }
}
