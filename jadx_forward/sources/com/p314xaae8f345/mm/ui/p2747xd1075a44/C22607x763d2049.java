package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.InputPanelLinearLayout */
/* loaded from: classes4.dex */
public class C22607x763d2049 extends android.widget.LinearLayout implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public al5.f0 f292799d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f292800e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f292801f;

    public C22607x763d2049(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void J2(boolean z17, int i17) {
        int i18 = 0;
        while (true) {
            java.util.List list = this.f292800e;
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

    public void e(al5.e0 e0Var) {
        java.util.List list = this.f292800e;
        if (((java.util.LinkedList) list).contains(e0Var)) {
            return;
        }
        ((java.util.LinkedList) list).add(e0Var);
    }

    /* renamed from: getInputPanelHelper */
    public al5.f0 m81273xb2a7481e() {
        return this.f292799d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f292801f) {
            this.f292799d.c();
            ((java.util.LinkedList) this.f292800e).clear();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        this.f292799d.d(i18);
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (this.f292801f) {
            if (z17) {
                this.f292799d.g();
            } else {
                this.f292799d.c();
                ((java.util.LinkedList) this.f292800e).clear();
            }
        }
    }

    public C22607x763d2049(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292800e = new java.util.LinkedList();
        this.f292801f = true;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528726k, i17, 0);
            try {
                this.f292801f = obtainStyledAttributes.getBoolean(0, true);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f292799d = new al5.f0(this, this, false);
    }
}
