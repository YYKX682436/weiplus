package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.AppCompatButton */
/* loaded from: classes15.dex */
public class C0080x3ada79f5 extends android.widget.Button implements p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 f90896d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 f90897e;

    public C0080x3ada79f5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559659be);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90896d;
        if (d0Var != null) {
            d0Var.a();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90897e;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0) {
            return super.getAutoSizeMaxTextSize();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90897e;
        if (t0Var != null) {
            return java.lang.Math.round(t0Var.f91242h.f91254e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0) {
            return super.getAutoSizeMinTextSize();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90897e;
        if (t0Var != null) {
            return java.lang.Math.round(t0Var.f91242h.f91253d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0) {
            return super.getAutoSizeStepGranularity();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90897e;
        if (t0Var != null) {
            return java.lang.Math.round(t0Var.f91242h.f91252c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90897e;
        return t0Var != null ? t0Var.f91242h.f91255f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90897e;
        if (t0Var != null) {
            return t0Var.f91242h.f91250a;
        }
        return 0;
    }

    /* renamed from: getSupportBackgroundTintList */
    public android.content.res.ColorStateList mo2648x6bcb5100() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90896d;
        if (d0Var != null) {
            return d0Var.b();
        }
        return null;
    }

    /* renamed from: getSupportBackgroundTintMode */
    public android.graphics.PorterDuff.Mode mo2649x6bcbda05() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90896d;
        if (d0Var != null) {
            return d0Var.c();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(android.widget.Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90897e;
        if (t0Var == null || p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0) {
            return;
        }
        t0Var.f91242h.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        super.onTextChanged(charSequence, i17, i18, i19);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90897e;
        if (t0Var == null || p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u0 u0Var = t0Var.f91242h;
        if (u0Var.h() && u0Var.f91250a != 0) {
            u0Var.a();
        }
    }

    @Override // android.widget.TextView, p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d
    public void setAutoSizeTextTypeUniformWithConfiguration(int i17, int i18, int i19, int i27) {
        if (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i17, i18, i19, i27);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90897e;
        if (t0Var != null) {
            t0Var.f(i17, i18, i19, i27);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i17) {
        if (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i17);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90897e;
        if (t0Var != null) {
            t0Var.g(iArr, i17);
        }
    }

    @Override // android.widget.TextView, p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d
    public void setAutoSizeTextTypeWithDefaults(int i17) {
        if (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0) {
            super.setAutoSizeTextTypeWithDefaults(i17);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90897e;
        if (t0Var != null) {
            t0Var.h(i17);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90896d;
        if (d0Var != null) {
            d0Var.e(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
        super.setBackgroundResource(i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90896d;
        if (d0Var != null) {
            d0Var.f(i17);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.g(this, callback));
    }

    /* renamed from: setSupportAllCaps */
    public void m2650xe2046655(boolean z17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90897e;
        if (t0Var != null) {
            t0Var.f91235a.setAllCaps(z17);
        }
    }

    /* renamed from: setSupportBackgroundTintList */
    public void mo2651xb597a974(android.content.res.ColorStateList colorStateList) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90896d;
        if (d0Var != null) {
            d0Var.h(colorStateList);
        }
    }

    /* renamed from: setSupportBackgroundTintMode */
    public void mo2652xb5983279(android.graphics.PorterDuff.Mode mode) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90896d;
        if (d0Var != null) {
            d0Var.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i17) {
        super.setTextAppearance(context, i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90897e;
        if (t0Var != null) {
            t0Var.e(context, i17);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i17, float f17) {
        boolean z17 = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0;
        if (z17) {
            super.setTextSize(i17, f17);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90897e;
        if (t0Var == null || z17) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u0 u0Var = t0Var.f91242h;
        if (u0Var.h() && u0Var.f91250a != 0) {
            return;
        }
        u0Var.e(i17, f17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0080x3ada79f5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.n2.a(context);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0(this);
        this.f90896d = d0Var;
        d0Var.d(attributeSet, i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0(this);
        this.f90897e = t0Var;
        t0Var.d(attributeSet, i17);
        t0Var.b();
    }
}
