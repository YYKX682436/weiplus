package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.AppCompatAutoCompleteTextView */
/* loaded from: classes15.dex */
public class C0079x7da3871d extends android.widget.AutoCompleteTextView {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f90893f = {android.R.attr.popupBackground};

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 f90894d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 f90895e;

    public C0079x7da3871d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559634ap);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90894d;
        if (d0Var != null) {
            d0Var.a();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90895e;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    /* renamed from: getSupportBackgroundTintList */
    public android.content.res.ColorStateList m2644x6bcb5100() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90894d;
        if (d0Var != null) {
            return d0Var.b();
        }
        return null;
    }

    /* renamed from: getSupportBackgroundTintMode */
    public android.graphics.PorterDuff.Mode m2645x6bcbda05() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90894d;
        if (d0Var != null) {
            return d0Var.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.i0.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90894d;
        if (d0Var != null) {
            d0Var.e(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
        super.setBackgroundResource(i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90894d;
        if (d0Var != null) {
            d0Var.f(i17);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.g(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i17) {
        setDropDownBackgroundDrawable(k.a.a(getContext(), i17));
    }

    /* renamed from: setSupportBackgroundTintList */
    public void m2646xb597a974(android.content.res.ColorStateList colorStateList) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90894d;
        if (d0Var != null) {
            d0Var.h(colorStateList);
        }
    }

    /* renamed from: setSupportBackgroundTintMode */
    public void m2647xb5983279(android.graphics.PorterDuff.Mode mode) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90894d;
        if (d0Var != null) {
            d0Var.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i17) {
        super.setTextAppearance(context, i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = this.f90895e;
        if (t0Var != null) {
            t0Var.e(context, i17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0079x7da3871d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.n2.a(context);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 l17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2.l(getContext(), attributeSet, f90893f, i17, 0);
        if (l17.k(0)) {
            setDropDownBackgroundDrawable(l17.e(0));
        }
        l17.m();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0(this);
        this.f90894d = d0Var;
        d0Var.d(attributeSet, i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0 t0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t0(this);
        this.f90895e = t0Var;
        t0Var.d(attributeSet, i17);
        t0Var.b();
    }
}
