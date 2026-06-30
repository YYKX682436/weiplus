package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class AppCompatEditText extends android.widget.EditText {
    private final androidx.appcompat.widget.d0 mBackgroundTintHelper;
    private final androidx.appcompat.widget.t0 mTextHelper;

    public AppCompatEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478237ee);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.d0 d0Var = this.mBackgroundTintHelper;
        if (d0Var != null) {
            d0Var.a();
        }
        androidx.appcompat.widget.t0 t0Var = this.mTextHelper;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.d0 d0Var = this.mBackgroundTintHelper;
        if (d0Var != null) {
            return d0Var.b();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.d0 d0Var = this.mBackgroundTintHelper;
        if (d0Var != null) {
            return d0Var.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        androidx.appcompat.widget.i0.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.d0 d0Var = this.mBackgroundTintHelper;
        if (d0Var != null) {
            d0Var.e(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
        super.setBackgroundResource(i17);
        androidx.appcompat.widget.d0 d0Var = this.mBackgroundTintHelper;
        if (d0Var != null) {
            d0Var.f(i17);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.a0.g(this, callback));
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.d0 d0Var = this.mBackgroundTintHelper;
        if (d0Var != null) {
            d0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.d0 d0Var = this.mBackgroundTintHelper;
        if (d0Var != null) {
            d0Var.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i17) {
        super.setTextAppearance(context, i17);
        androidx.appcompat.widget.t0 t0Var = this.mTextHelper;
        if (t0Var != null) {
            t0Var.e(context, i17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        androidx.appcompat.widget.n2.a(context);
        androidx.appcompat.widget.d0 d0Var = new androidx.appcompat.widget.d0(this);
        this.mBackgroundTintHelper = d0Var;
        d0Var.d(attributeSet, i17);
        androidx.appcompat.widget.t0 t0Var = new androidx.appcompat.widget.t0(this);
        this.mTextHelper = t0Var;
        t0Var.d(attributeSet, i17);
        t0Var.b();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
