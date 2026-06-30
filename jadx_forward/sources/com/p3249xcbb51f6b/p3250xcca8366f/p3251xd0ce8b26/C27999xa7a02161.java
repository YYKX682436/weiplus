package com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26;

/* renamed from: com.tenpay.android.wechat.TenPayRelativeLayout */
/* loaded from: classes8.dex */
public class C27999xa7a02161 extends android.widget.RelativeLayout {

    /* renamed from: accessibilityClassName */
    private java.lang.String f62911xd4991275;

    public C27999xa7a02161(android.content.Context context) {
        super(context);
        m121569x316510(context, null);
    }

    /* renamed from: init */
    private void m121569x316510(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p3249xcbb51f6b.R.C27987x6ba0728b.f62755xa7a02161);
            this.f62911xd4991275 = obtainStyledAttributes.getString(com.p3249xcbb51f6b.R.C27987x6ba0728b.f62756x228871de);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return android.text.TextUtils.isEmpty(this.f62911xd4991275) ? super.getAccessibilityClassName() : this.f62911xd4991275;
    }

    public C27999xa7a02161(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        m121569x316510(context, attributeSet);
    }

    public C27999xa7a02161(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        m121569x316510(context, attributeSet);
    }

    public C27999xa7a02161(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        m121569x316510(context, attributeSet);
    }
}
