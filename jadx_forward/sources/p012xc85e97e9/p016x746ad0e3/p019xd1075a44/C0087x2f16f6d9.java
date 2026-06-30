package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.AppCompatPopupWindow */
/* loaded from: classes15.dex */
class C0087x2f16f6d9 extends android.widget.PopupWindow {
    public C0087x2f16f6d9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context, attributeSet, i17, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        int resourceId;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f377725t, i17, i18);
        if (obtainStyledAttributes.hasValue(2)) {
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.r.c(this, obtainStyledAttributes.getBoolean(2, false));
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

    public C0087x2f16f6d9(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        a(context, attributeSet, i17, i18);
    }
}
