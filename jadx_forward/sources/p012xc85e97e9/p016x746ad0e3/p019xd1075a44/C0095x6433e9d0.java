package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.DialogTitle */
/* loaded from: classes13.dex */
public class C0095x6433e9d0 extends android.widget.TextView {
    public C0095x6433e9d0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        int lineCount;
        super.onMeasure(i17, i18);
        android.text.Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, j.a.f377730y, android.R.attr.textAppearanceMedium, android.R.style.TextAppearance.Medium);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
        super.onMeasure(i17, i18);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.g(this, callback));
    }

    public C0095x6433e9d0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
