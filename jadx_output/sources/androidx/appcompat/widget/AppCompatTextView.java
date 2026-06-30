package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class AppCompatTextView extends android.widget.TextView implements androidx.core.widget.d {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.widget.d0 f9387d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.appcompat.widget.t0 f9388e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.concurrent.Future f9389f;

    public AppCompatTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.d0 d0Var = this.f9387d;
        if (d0Var != null) {
            d0Var.a();
        }
        androidx.appcompat.widget.t0 t0Var = this.f9388e;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.d.f11101d0) {
            return super.getAutoSizeMaxTextSize();
        }
        androidx.appcompat.widget.t0 t0Var = this.f9388e;
        if (t0Var != null) {
            return java.lang.Math.round(t0Var.f9709h.f9721e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.d.f11101d0) {
            return super.getAutoSizeMinTextSize();
        }
        androidx.appcompat.widget.t0 t0Var = this.f9388e;
        if (t0Var != null) {
            return java.lang.Math.round(t0Var.f9709h.f9720d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.d.f11101d0) {
            return super.getAutoSizeStepGranularity();
        }
        androidx.appcompat.widget.t0 t0Var = this.f9388e;
        if (t0Var != null) {
            return java.lang.Math.round(t0Var.f9709h.f9719c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.d.f11101d0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        androidx.appcompat.widget.t0 t0Var = this.f9388e;
        return t0Var != null ? t0Var.f9709h.f9722f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (androidx.core.widget.d.f11101d0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        androidx.appcompat.widget.t0 t0Var = this.f9388e;
        if (t0Var != null) {
            return t0Var.f9709h.f9717a;
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

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.d0 d0Var = this.f9387d;
        if (d0Var != null) {
            return d0Var.b();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.d0 d0Var = this.f9387d;
        if (d0Var != null) {
            return d0Var.c();
        }
        return null;
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
        java.util.concurrent.Future future = this.f9389f;
        if (future != null) {
            try {
                this.f9389f = null;
                android.support.v4.media.f.a(future.get());
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                androidx.core.widget.a0.a(this);
                throw null;
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public l3.d getTextMetricsParamsCompat() {
        return androidx.core.widget.a0.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        androidx.appcompat.widget.i0.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        androidx.appcompat.widget.t0 t0Var = this.f9388e;
        if (t0Var == null || androidx.core.widget.d.f11101d0) {
            return;
        }
        t0Var.f9709h.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        java.util.concurrent.Future future = this.f9389f;
        if (future != null) {
            try {
                this.f9389f = null;
                android.support.v4.media.f.a(future.get());
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                androidx.core.widget.a0.a(this);
                throw null;
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            }
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        super.onTextChanged(charSequence, i17, i18, i19);
        androidx.appcompat.widget.t0 t0Var = this.f9388e;
        if (t0Var == null || androidx.core.widget.d.f11101d0) {
            return;
        }
        androidx.appcompat.widget.u0 u0Var = t0Var.f9709h;
        if (u0Var.h() && u0Var.f9717a != 0) {
            u0Var.a();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.d
    public void setAutoSizeTextTypeUniformWithConfiguration(int i17, int i18, int i19, int i27) {
        if (androidx.core.widget.d.f11101d0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i17, i18, i19, i27);
            return;
        }
        androidx.appcompat.widget.t0 t0Var = this.f9388e;
        if (t0Var != null) {
            t0Var.f(i17, i18, i19, i27);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i17) {
        if (androidx.core.widget.d.f11101d0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i17);
            return;
        }
        androidx.appcompat.widget.t0 t0Var = this.f9388e;
        if (t0Var != null) {
            t0Var.g(iArr, i17);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.d
    public void setAutoSizeTextTypeWithDefaults(int i17) {
        if (androidx.core.widget.d.f11101d0) {
            super.setAutoSizeTextTypeWithDefaults(i17);
            return;
        }
        androidx.appcompat.widget.t0 t0Var = this.f9388e;
        if (t0Var != null) {
            t0Var.h(i17);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.d0 d0Var = this.f9387d;
        if (d0Var != null) {
            d0Var.e(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
        super.setBackgroundResource(i17);
        androidx.appcompat.widget.d0 d0Var = this.f9387d;
        if (d0Var != null) {
            d0Var.f(i17);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.a0.g(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i17);
        } else {
            androidx.core.widget.a0.d(this, i17);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i17);
        } else {
            androidx.core.widget.a0.e(this, i17);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i17) {
        androidx.core.widget.a0.f(this, i17);
    }

    public void setPrecomputedText(l3.e eVar) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        androidx.core.widget.a0.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.d0 d0Var = this.f9387d;
        if (d0Var != null) {
            d0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.d0 d0Var = this.f9387d;
        if (d0Var != null) {
            d0Var.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i17) {
        super.setTextAppearance(context, i17);
        androidx.appcompat.widget.t0 t0Var = this.f9388e;
        if (t0Var != null) {
            t0Var.e(context, i17);
        }
    }

    public void setTextFuture(java.util.concurrent.Future<l3.e> future) {
        this.f9389f = future;
        requestLayout();
    }

    public void setTextMetricsParamsCompat(l3.d dVar) {
        int i17;
        android.text.TextDirectionHeuristic textDirectionHeuristic = dVar.f315296b;
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
            androidx.core.widget.u.h(this, i17);
            getPaint().set(dVar.f315295a);
            androidx.core.widget.v.e(this, dVar.f315297c);
            androidx.core.widget.v.h(this, dVar.f315298d);
        }
        i17 = 1;
        androidx.core.widget.u.h(this, i17);
        getPaint().set(dVar.f315295a);
        androidx.core.widget.v.e(this, dVar.f315297c);
        androidx.core.widget.v.h(this, dVar.f315298d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i17, float f17) {
        boolean z17 = androidx.core.widget.d.f11101d0;
        if (z17) {
            super.setTextSize(i17, f17);
            return;
        }
        androidx.appcompat.widget.t0 t0Var = this.f9388e;
        if (t0Var == null || z17) {
            return;
        }
        androidx.appcompat.widget.u0 u0Var = t0Var.f9709h;
        if (u0Var.h() && u0Var.f9717a != 0) {
            return;
        }
        u0Var.e(i17, f17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        androidx.appcompat.widget.n2.a(context);
        androidx.appcompat.widget.d0 d0Var = new androidx.appcompat.widget.d0(this);
        this.f9387d = d0Var;
        d0Var.d(attributeSet, i17);
        androidx.appcompat.widget.t0 t0Var = new androidx.appcompat.widget.t0(this);
        this.f9388e = t0Var;
        t0Var.d(attributeSet, i17);
        t0Var.b();
    }
}
