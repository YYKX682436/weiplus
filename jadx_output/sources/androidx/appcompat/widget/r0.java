package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class r0 extends androidx.appcompat.widget.ListPopupWindow {
    public java.lang.CharSequence I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ListAdapter f9695J;
    public final android.graphics.Rect K;
    public final /* synthetic */ androidx.appcompat.widget.AppCompatSpinner L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.appcompat.widget.AppCompatSpinner appCompatSpinner, android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = appCompatSpinner;
        this.K = new android.graphics.Rect();
        this.f9431u = appCompatSpinner;
        this.D = true;
        this.E.setFocusable(true);
        this.f9432v = new androidx.appcompat.widget.o0(this, appCompatSpinner);
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    public void d(android.widget.ListAdapter listAdapter) {
        super.d(listAdapter);
        this.f9695J = listAdapter;
    }

    public void g() {
        int i17;
        android.widget.PopupWindow popupWindow = this.E;
        android.graphics.drawable.Drawable background = popupWindow.getBackground();
        androidx.appcompat.widget.AppCompatSpinner appCompatSpinner = this.L;
        if (background != null) {
            background.getPadding(appCompatSpinner.f9386n);
            boolean a17 = androidx.appcompat.widget.h3.a(appCompatSpinner);
            android.graphics.Rect rect = appCompatSpinner.f9386n;
            i17 = a17 ? rect.right : -rect.left;
        } else {
            android.graphics.Rect rect2 = appCompatSpinner.f9386n;
            rect2.right = 0;
            rect2.left = 0;
            i17 = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i18 = appCompatSpinner.f9385m;
        if (i18 == -2) {
            int a18 = appCompatSpinner.a((android.widget.SpinnerAdapter) this.f9695J, popupWindow.getBackground());
            int i19 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
            android.graphics.Rect rect3 = appCompatSpinner.f9386n;
            int i27 = (i19 - rect3.left) - rect3.right;
            if (a18 > i27) {
                a18 = i27;
            }
            e(java.lang.Math.max(a18, (width - paddingLeft) - paddingRight));
        } else if (i18 == -1) {
            e((width - paddingLeft) - paddingRight);
        } else {
            e(i18);
        }
        this.f9422i = androidx.appcompat.widget.h3.a(appCompatSpinner) ? i17 + ((width - paddingRight) - this.f9421h) : i17 + paddingLeft;
    }

    @Override // androidx.appcompat.widget.ListPopupWindow, o.k0
    public void show() {
        android.view.ViewTreeObserver viewTreeObserver;
        boolean isShowing = isShowing();
        g();
        android.widget.PopupWindow popupWindow = this.E;
        popupWindow.setInputMethodMode(2);
        super.show();
        this.f9419f.setChoiceMode(1);
        androidx.appcompat.widget.AppCompatSpinner appCompatSpinner = this.L;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        androidx.appcompat.widget.b1 b1Var = this.f9419f;
        if (isShowing() && b1Var != null) {
            b1Var.setListSelectionHidden(false);
            b1Var.setSelection(selectedItemPosition);
            if (b1Var.getChoiceMode() != 0) {
                b1Var.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        androidx.appcompat.widget.p0 p0Var = new androidx.appcompat.widget.p0(this);
        viewTreeObserver.addOnGlobalLayoutListener(p0Var);
        popupWindow.setOnDismissListener(new androidx.appcompat.widget.q0(this, p0Var));
    }
}
