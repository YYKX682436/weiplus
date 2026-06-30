package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class r0 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e {
    public java.lang.CharSequence I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ListAdapter f91228J;
    public final android.graphics.Rect K;
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0091x9a98b7b6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0091x9a98b7b6 c0091x9a98b7b6, android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = c0091x9a98b7b6;
        this.K = new android.graphics.Rect();
        this.f90964u = c0091x9a98b7b6;
        this.D = true;
        this.E.setFocusable(true);
        this.f90965v = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o0(this, c0091x9a98b7b6);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e
    public void d(android.widget.ListAdapter listAdapter) {
        super.d(listAdapter);
        this.f91228J = listAdapter;
    }

    public void g() {
        int i17;
        android.widget.PopupWindow popupWindow = this.E;
        android.graphics.drawable.Drawable background = popupWindow.getBackground();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0091x9a98b7b6 c0091x9a98b7b6 = this.L;
        if (background != null) {
            background.getPadding(c0091x9a98b7b6.f90919n);
            boolean a17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h3.a(c0091x9a98b7b6);
            android.graphics.Rect rect = c0091x9a98b7b6.f90919n;
            i17 = a17 ? rect.right : -rect.left;
        } else {
            android.graphics.Rect rect2 = c0091x9a98b7b6.f90919n;
            rect2.right = 0;
            rect2.left = 0;
            i17 = 0;
        }
        int paddingLeft = c0091x9a98b7b6.getPaddingLeft();
        int paddingRight = c0091x9a98b7b6.getPaddingRight();
        int width = c0091x9a98b7b6.getWidth();
        int i18 = c0091x9a98b7b6.f90918m;
        if (i18 == -2) {
            int a18 = c0091x9a98b7b6.a((android.widget.SpinnerAdapter) this.f91228J, popupWindow.getBackground());
            int i19 = c0091x9a98b7b6.getContext().getResources().getDisplayMetrics().widthPixels;
            android.graphics.Rect rect3 = c0091x9a98b7b6.f90919n;
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
        this.f90955i = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h3.a(c0091x9a98b7b6) ? i17 + ((width - paddingRight) - this.f90954h) : i17 + paddingLeft;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e, o.k0
    /* renamed from: show */
    public void mo2735x35dafd() {
        android.view.ViewTreeObserver viewTreeObserver;
        boolean mo2734x58a9c73b = mo2734x58a9c73b();
        g();
        android.widget.PopupWindow popupWindow = this.E;
        popupWindow.setInputMethodMode(2);
        super.mo2735x35dafd();
        this.f90952f.setChoiceMode(1);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0091x9a98b7b6 c0091x9a98b7b6 = this.L;
        int selectedItemPosition = c0091x9a98b7b6.getSelectedItemPosition();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b1 b1Var = this.f90952f;
        if (mo2734x58a9c73b() && b1Var != null) {
            b1Var.m2863xbfc13616(false);
            b1Var.setSelection(selectedItemPosition);
            if (b1Var.getChoiceMode() != 0) {
                b1Var.setItemChecked(selectedItemPosition, true);
            }
        }
        if (mo2734x58a9c73b || (viewTreeObserver = c0091x9a98b7b6.getViewTreeObserver()) == null) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.p0 p0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.p0(this);
        viewTreeObserver.addOnGlobalLayoutListener(p0Var);
        popupWindow.setOnDismissListener(new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q0(this, p0Var));
    }
}
