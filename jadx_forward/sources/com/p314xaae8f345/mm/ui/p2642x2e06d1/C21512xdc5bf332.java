package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMRadioImageButton */
/* loaded from: classes15.dex */
public class C21512xdc5bf332 extends android.widget.ImageButton implements android.widget.Checkable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f279083d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f279084e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f279085f;

    /* renamed from: g, reason: collision with root package name */
    public db5.u5 f279086g;

    /* renamed from: h, reason: collision with root package name */
    public db5.u5 f279087h;

    public C21512xdc5bf332(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f279085f;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return false;
    }

    /* renamed from: setCheckable */
    public void m79107x7388e820(boolean z17) {
        this.f279084e = z17;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z17) {
        android.view.View findViewById;
        android.view.View findViewById2;
        if (this.f279085f != z17) {
            this.f279085f = z17;
            setSelected(z17);
            refreshDrawableState();
            if (this.f279083d) {
                return;
            }
            this.f279083d = true;
            db5.u5 u5Var = this.f279086g;
            if (u5Var != null) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21511xb6a721c9 c21511xb6a721c9 = ((db5.q5) u5Var).f310011a;
                int i17 = c21511xb6a721c9.f279079d;
                if (i17 != -1 && (findViewById2 = c21511xb6a721c9.findViewById(i17)) != null && (findViewById2 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332)) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332) findViewById2).setChecked(false);
                }
                int id6 = getId();
                c21511xb6a721c9.m79099xf9556c77(this);
                c21511xb6a721c9.m79100x738abce0(id6);
            }
            db5.u5 u5Var2 = this.f279087h;
            if (u5Var2 != null) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21511xb6a721c9 c21511xb6a721c92 = ((db5.q5) u5Var2).f310011a;
                int i18 = c21511xb6a721c92.f279079d;
                if (i18 != -1 && (findViewById = c21511xb6a721c92.findViewById(i18)) != null && (findViewById instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332)) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21512xdc5bf332) findViewById).setChecked(false);
                }
                int id7 = getId();
                c21511xb6a721c92.m79099xf9556c77(this);
                c21511xb6a721c92.m79100x738abce0(id7);
            }
            this.f279083d = false;
        }
    }

    /* renamed from: setOnMMRadioButtonCheckedChangeListener */
    public void m79108x219e6e5f(db5.u5 u5Var) {
        this.f279086g = u5Var;
    }

    /* renamed from: setOnOtherMMRadioButtonCheckedChangeListener */
    public void m79109x6f71a2ad(db5.u5 u5Var) {
        this.f279087h = u5Var;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (this.f279084e) {
            if (isChecked()) {
                return;
            }
            setChecked(!this.f279085f);
            return;
        }
        db5.u5 u5Var = this.f279086g;
        if (u5Var != null) {
            ((db5.q5) u5Var).f310011a.m79101xe6a85d60(getId());
        }
        db5.u5 u5Var2 = this.f279087h;
        if (u5Var2 != null) {
            ((db5.q5) u5Var2).f310011a.m79101xe6a85d60(getId());
        }
    }

    public C21512xdc5bf332(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f279084e = true;
    }
}
