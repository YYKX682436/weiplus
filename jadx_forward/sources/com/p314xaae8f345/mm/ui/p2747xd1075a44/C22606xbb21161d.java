package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.InputPanelFrameLayout */
/* loaded from: classes5.dex */
public class C22606xbb21161d extends android.widget.FrameLayout implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public al5.f0 f292797d;

    /* renamed from: e, reason: collision with root package name */
    public al5.e0 f292798e;

    public C22606xbb21161d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void J2(boolean z17, int i17) {
        al5.e0 e0Var = this.f292798e;
        if (e0Var != null) {
            e0Var.J2(z17, i17);
        }
    }

    /* renamed from: getInputPanelHelper */
    public al5.f0 m81271xb2a7481e() {
        return this.f292797d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f292797d.c();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        this.f292797d.d(i18);
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            this.f292797d.g();
        } else {
            this.f292797d.c();
        }
    }

    /* renamed from: setExternalListener */
    public void m81272xb3968e21(al5.e0 e0Var) {
        this.f292798e = e0Var;
    }

    public C22606xbb21161d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292797d = new al5.f0(this, this, false);
    }
}
