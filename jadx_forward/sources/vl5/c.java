package vl5;

/* loaded from: classes4.dex */
public class c extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f519455d;

    public c(android.content.Context context) {
        super(context);
        this.f519455d = 48;
        setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
    }

    /* renamed from: getGravity */
    public int m172299x4e85ae18() {
        return this.f519455d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (this.f519455d == 48) {
            childAt.layout(0, 0, getMeasuredWidth(), childAt.getMeasuredHeight());
        } else {
            childAt.layout(0, getMeasuredHeight() - childAt.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int size = android.view.View.MeasureSpec.getSize(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i17);
        int mode = android.view.View.MeasureSpec.getMode(i18);
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            setMeasuredDimension(0, size2);
            return;
        }
        if (childAt.isLayoutRequested()) {
            measureChild(childAt, i17, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        if (mode == 0 && (size = getLayoutParams().height) <= 0) {
            size = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(size2, size);
    }

    /* renamed from: setGravity */
    public void m172300xc1f6fb8c(int i17) {
        this.f519455d = i17;
    }
}
