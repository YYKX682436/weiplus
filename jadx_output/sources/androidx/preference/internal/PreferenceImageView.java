package androidx.preference.internal;

/* loaded from: classes4.dex */
public class PreferenceImageView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public int f11830d;

    /* renamed from: e, reason: collision with root package name */
    public int f11831e;

    public PreferenceImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f11831e;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f11830d;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = android.view.View.MeasureSpec.getSize(i17);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i17 = android.view.View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = android.view.View.MeasureSpec.getSize(i18);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i17) {
        this.f11831e = i17;
        super.setMaxHeight(i17);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i17) {
        this.f11830d = i17;
        super.setMaxWidth(i17);
    }

    public PreferenceImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f11830d = Integer.MAX_VALUE;
        this.f11831e = Integer.MAX_VALUE;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.g0.f11823i, i17, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }
}
