package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class AppCompatCheckBox extends android.widget.CheckBox {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.widget.e0 f9365d;

    public AppCompatCheckBox(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478143br);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        androidx.appcompat.widget.e0 e0Var = this.f9365d;
        if (e0Var != null) {
            e0Var.getClass();
        }
        return compoundPaddingLeft;
    }

    public android.content.res.ColorStateList getSupportButtonTintList() {
        androidx.appcompat.widget.e0 e0Var = this.f9365d;
        if (e0Var != null) {
            return e0Var.f9562b;
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
        androidx.appcompat.widget.e0 e0Var = this.f9365d;
        if (e0Var != null) {
            return e0Var.f9563c;
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable drawable) {
        super.setButtonDrawable(drawable);
        androidx.appcompat.widget.e0 e0Var = this.f9365d;
        if (e0Var != null) {
            if (e0Var.f9566f) {
                e0Var.f9566f = false;
            } else {
                e0Var.f9566f = true;
                e0Var.a();
            }
        }
    }

    public void setSupportButtonTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.e0 e0Var = this.f9365d;
        if (e0Var != null) {
            e0Var.f9562b = colorStateList;
            e0Var.f9564d = true;
            e0Var.a();
        }
    }

    public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.e0 e0Var = this.f9365d;
        if (e0Var != null) {
            e0Var.f9563c = mode;
            e0Var.f9565e = true;
            e0Var.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        androidx.appcompat.widget.n2.a(context);
        androidx.appcompat.widget.e0 e0Var = new androidx.appcompat.widget.e0(this);
        this.f9365d = e0Var;
        e0Var.b(attributeSet, i17);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i17) {
        setButtonDrawable(k.a.a(getContext(), i17));
    }
}
