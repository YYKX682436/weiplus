package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.SnsUploadInputPanelLinearLayout */
/* loaded from: classes4.dex */
public abstract class AbstractC22647xb041ad02 extends android.widget.LinearLayout implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public al5.f0 f292954d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f292955e;

    public AbstractC22647xb041ad02(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void J2(boolean z17, int i17) {
        int i18 = 0;
        while (true) {
            java.util.List list = this.f292955e;
            if (i18 >= ((java.util.LinkedList) list).size()) {
                return;
            }
            al5.e0 e0Var = (al5.e0) ((java.util.LinkedList) list).get(i18);
            if (e0Var != null) {
                e0Var.J2(z17, i17);
            }
            i18++;
        }
    }

    /* renamed from: getInputPanelHelper */
    public al5.f0 m81438xb2a7481e() {
        return this.f292954d;
    }

    /* renamed from: getSoftInputMode */
    public abstract int mo70813x19d607cd();

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f292954d.c();
        ((java.util.LinkedList) this.f292955e).clear();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        this.f292954d.d(i18);
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            this.f292954d.g();
        } else {
            this.f292954d.c();
            ((java.util.LinkedList) this.f292955e).clear();
        }
    }

    public AbstractC22647xb041ad02(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292955e = new java.util.LinkedList();
    }
}
