package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.flutter.plugin.platform.SingleViewFakeWindowViewGroup */
/* loaded from: classes5.dex */
public class C28733xc74af448 extends android.view.ViewGroup {

    /* renamed from: childRect */
    private final android.graphics.Rect f71853xfa52d520;

    /* renamed from: viewBounds */
    private final android.graphics.Rect f71854x73bacdba;

    public C28733xc74af448(android.content.Context context) {
        super(context);
        this.f71854x73bacdba = new android.graphics.Rect();
        this.f71853xfa52d520 = new android.graphics.Rect();
    }

    /* renamed from: atMost */
    private static int m138803xac0d6a56(int i17) {
        return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i17), Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        for (int i28 = 0; i28 < getChildCount(); i28++) {
            android.view.View childAt = getChildAt(i28);
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f71854x73bacdba.set(i17, i18, i19, i27);
            android.view.Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f71854x73bacdba, layoutParams.x, layoutParams.y, this.f71853xfa52d520);
            android.graphics.Rect rect = this.f71853xfa52d520;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            getChildAt(i19).measure(m138803xac0d6a56(i17), m138803xac0d6a56(i18));
        }
        super.onMeasure(i17, i18);
    }
}
