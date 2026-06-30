package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class AppCompatCheckedTextView extends android.widget.CheckedTextView {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f9366e = {android.R.attr.checkMark};

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.widget.t0 f9367d;

    public AppCompatCheckedTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.checkedTextViewStyle);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.t0 t0Var = this.f9367d;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        androidx.appcompat.widget.i0.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i17) {
        setCheckMarkDrawable(k.a.a(getContext(), i17));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.a0.g(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i17) {
        super.setTextAppearance(context, i17);
        androidx.appcompat.widget.t0 t0Var = this.f9367d;
        if (t0Var != null) {
            t0Var.e(context, i17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        androidx.appcompat.widget.n2.a(context);
        androidx.appcompat.widget.t0 t0Var = new androidx.appcompat.widget.t0(this);
        this.f9367d = t0Var;
        t0Var.d(attributeSet, i17);
        t0Var.b();
        androidx.appcompat.widget.q2 l17 = androidx.appcompat.widget.q2.l(getContext(), attributeSet, f9366e, i17, 0);
        setCheckMarkDrawable(l17.e(0));
        l17.m();
    }
}
