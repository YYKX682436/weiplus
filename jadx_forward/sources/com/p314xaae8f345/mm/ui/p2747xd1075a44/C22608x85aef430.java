package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.InputPanelRelativeLayout */
/* loaded from: classes5.dex */
public class C22608x85aef430 extends android.widget.RelativeLayout implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public al5.f0 f292802d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f292803e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f292804f;

    public C22608x85aef430(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void J2(boolean z17, int i17) {
        int i18 = 0;
        while (true) {
            java.util.List list = this.f292803e;
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
    public al5.f0 m81274xb2a7481e() {
        return this.f292802d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f292802d.c();
        ((java.util.LinkedList) this.f292803e).clear();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        this.f292802d.d(i18);
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (!z17) {
            this.f292802d.c();
            ((java.util.LinkedList) this.f292803e).clear();
            this.f292804f = false;
        } else {
            if (this.f292804f) {
                return;
            }
            this.f292802d.g();
            this.f292804f = true;
        }
    }

    public C22608x85aef430(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292803e = new java.util.LinkedList();
        this.f292804f = false;
        this.f292802d = new al5.f0(this, this, false);
    }
}
