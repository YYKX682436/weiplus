package androidx.appcompat.widget;

/* loaded from: classes15.dex */
class AppCompatPopupWindow extends android.widget.PopupWindow {
    public AppCompatPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context, attributeSet, i17, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        int resourceId;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f296192t, i17, i18);
        if (obtainStyledAttributes.hasValue(2)) {
            androidx.core.widget.r.c(this, obtainStyledAttributes.getBoolean(2, false));
        }
        setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : k.a.a(context, resourceId));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i17, int i18) {
        super.showAsDropDown(view, i17, i18);
    }

    @Override // android.widget.PopupWindow
    public void update(android.view.View view, int i17, int i18, int i19, int i27) {
        super.update(view, i17, i18, i19, i27);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i17, int i18, int i19) {
        super.showAsDropDown(view, i17, i18, i19);
    }

    public AppCompatPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        a(context, attributeSet, i17, i18);
    }
}
