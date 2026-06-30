package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.AppCompatTextView */
/* loaded from: classes15.dex */
public class C0092xf45d4375 extends android.widget.TextView implements p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 f90920d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 f90921e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.concurrent.Future f90922f;

    public C0092xf45d4375(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90920d;
        if (d0Var != null) {
            d0Var.a();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90921e;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0) {
            return super.getAutoSizeMaxTextSize();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90921e;
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
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90921e;
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
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90921e;
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
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90921e;
        return t0Var != null ? t0Var.f91242h.f91255f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90921e;
        if (t0Var != null) {
            return t0Var.f91242h.f91250a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: getSupportBackgroundTintList */
    public android.content.res.ColorStateList m2692x6bcb5100() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90920d;
        if (d0Var != null) {
            return d0Var.b();
        }
        return null;
    }

    /* renamed from: getSupportBackgroundTintMode */
    public android.graphics.PorterDuff.Mode m2693x6bcbda05() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90920d;
        if (d0Var != null) {
            return d0Var.c();
        }
        return null;
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
        java.util.concurrent.Future future = this.f90922f;
        if (future != null) {
            try {
                this.f90922f = null;
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(future.get());
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.a(this);
                throw null;
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            }
        }
        return super.getText();
    }

    /* renamed from: getTextMetricsParamsCompat */
    public l3.d m2694x605dde68() {
        return p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.i0.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90921e;
        if (t0Var == null || p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0) {
            return;
        }
        t0Var.f91242h.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        java.util.concurrent.Future future = this.f90922f;
        if (future != null) {
            try {
                this.f90922f = null;
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(future.get());
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.a(this);
                throw null;
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            }
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        super.onTextChanged(charSequence, i17, i18, i19);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90921e;
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
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90921e;
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
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90921e;
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
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90921e;
        if (t0Var != null) {
            t0Var.h(i17);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90920d;
        if (d0Var != null) {
            d0Var.e(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
        super.setBackgroundResource(i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90920d;
        if (d0Var != null) {
            d0Var.f(i17);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.g(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i17);
        } else {
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.d(this, i17);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i17);
        } else {
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.e(this, i17);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i17) {
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.f(this, i17);
    }

    /* renamed from: setPrecomputedText */
    public void m2695xa7fd2b3b(l3.e eVar) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.a(this);
        throw null;
    }

    /* renamed from: setSupportBackgroundTintList */
    public void m2696xb597a974(android.content.res.ColorStateList colorStateList) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90920d;
        if (d0Var != null) {
            d0Var.h(colorStateList);
        }
    }

    /* renamed from: setSupportBackgroundTintMode */
    public void m2697xb5983279(android.graphics.PorterDuff.Mode mode) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90920d;
        if (d0Var != null) {
            d0Var.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i17) {
        super.setTextAppearance(context, i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90921e;
        if (t0Var != null) {
            t0Var.e(context, i17);
        }
    }

    /* renamed from: setTextFuture */
    public void m2698x74a66f52(java.util.concurrent.Future<l3.e> future) {
        this.f90922f = future;
        requestLayout();
    }

    /* renamed from: setTextMetricsParamsCompat */
    public void m2699x768dc3dc(l3.d dVar) {
        int i17;
        android.text.TextDirectionHeuristic textDirectionHeuristic = dVar.f396829b;
        if (textDirectionHeuristic != android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == android.text.TextDirectionHeuristics.ANYRTL_LTR) {
                i17 = 2;
            } else if (textDirectionHeuristic == android.text.TextDirectionHeuristics.LTR) {
                i17 = 3;
            } else if (textDirectionHeuristic == android.text.TextDirectionHeuristics.RTL) {
                i17 = 4;
            } else if (textDirectionHeuristic == android.text.TextDirectionHeuristics.LOCALE) {
                i17 = 5;
            } else if (textDirectionHeuristic == android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i17 = 6;
            } else if (textDirectionHeuristic == android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i17 = 7;
            }
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.u.h(this, i17);
            getPaint().set(dVar.f396828a);
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.v.e(this, dVar.f396830c);
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.v.h(this, dVar.f396831d);
        }
        i17 = 1;
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.u.h(this, i17);
        getPaint().set(dVar.f396828a);
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.v.e(this, dVar.f396830c);
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.v.h(this, dVar.f396831d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i17, float f17) {
        boolean z17 = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0;
        if (z17) {
            super.setTextSize(i17, f17);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90921e;
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
    public C0092xf45d4375(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.n2.a(context);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0(this);
        this.f90920d = d0Var;
        d0Var.d(attributeSet, i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0(this);
        this.f90921e = t0Var;
        t0Var.d(attributeSet, i17);
        t0Var.b();
    }
}
