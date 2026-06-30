package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.AppCompatCheckBox */
/* loaded from: classes15.dex */
public class C0081x8bc951a6 extends android.widget.CheckBox {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e0 f90898d;

    public C0081x8bc951a6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559676br);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e0 e0Var = this.f90898d;
        if (e0Var != null) {
            e0Var.getClass();
        }
        return compoundPaddingLeft;
    }

    /* renamed from: getSupportButtonTintList */
    public android.content.res.ColorStateList m2653xcbb8384() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e0 e0Var = this.f90898d;
        if (e0Var != null) {
            return e0Var.f91095b;
        }
        return null;
    }

    /* renamed from: getSupportButtonTintMode */
    public android.graphics.PorterDuff.Mode m2654xcbc0c89() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e0 e0Var = this.f90898d;
        if (e0Var != null) {
            return e0Var.f91096c;
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable drawable) {
        super.setButtonDrawable(drawable);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e0 e0Var = this.f90898d;
        if (e0Var != null) {
            if (e0Var.f91099f) {
                e0Var.f91099f = false;
            } else {
                e0Var.f91099f = true;
                e0Var.a();
            }
        }
    }

    /* renamed from: setSupportButtonTintList */
    public void m2655xdcce35f8(android.content.res.ColorStateList colorStateList) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e0 e0Var = this.f90898d;
        if (e0Var != null) {
            e0Var.f91095b = colorStateList;
            e0Var.f91097d = true;
            e0Var.a();
        }
    }

    /* renamed from: setSupportButtonTintMode */
    public void m2656xdccebefd(android.graphics.PorterDuff.Mode mode) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e0 e0Var = this.f90898d;
        if (e0Var != null) {
            e0Var.f91096c = mode;
            e0Var.f91098e = true;
            e0Var.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0081x8bc951a6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.n2.a(context);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e0 e0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e0(this);
        this.f90898d = e0Var;
        e0Var.b(attributeSet, i17);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i17) {
        setButtonDrawable(k.a.a(getContext(), i17));
    }
}
