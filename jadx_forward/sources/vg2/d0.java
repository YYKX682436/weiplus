package vg2;

/* loaded from: classes.dex */
public final class d0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.e0 f518022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f518023e;

    public d0(vg2.e0 e0Var, android.view.ViewGroup viewGroup) {
        this.f518022d = e0Var;
        this.f518023e = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int width;
        vg2.e0 e0Var = this.f518022d;
        e0Var.f518032c.getViewTreeObserver().removeOnPreDrawListener(this);
        e0Var.getClass();
        int i17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        android.view.ViewGroup viewGroup = this.f518023e;
        int[] t17 = pm0.v.t(viewGroup);
        int i18 = t17[1];
        android.view.View view = e0Var.f518033d;
        int height = view.getHeight();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = e0Var.f518034e;
        int height2 = i18 - (height + c22699x3dcdb352.getHeight());
        int width2 = t17[0] + (viewGroup.getWidth() / 2);
        android.content.Context context = e0Var.f518030a;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        if (width2 - (view.getWidth() / 2) < dimensionPixelSize) {
            width = dimensionPixelSize;
        } else {
            int i19 = i17 - dimensionPixelSize;
            width = (view.getWidth() / 2) + width2 > i19 ? i19 - view.getWidth() : width2 - (view.getWidth() / 2);
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (width < dimensionPixelSize) {
                width = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = width;
            marginLayoutParams.topMargin = height2;
            marginLayoutParams.rightMargin = dimensionPixelSize;
        }
        c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560026e));
        android.view.ViewGroup.LayoutParams layoutParams2 = c22699x3dcdb352.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.leftMargin = width2 - (c22699x3dcdb352.getWidth() / 2);
        }
        android.view.View view2 = e0Var.f518032c;
        view2.requestLayout();
        view2.post(new vg2.c0(e0Var));
        return true;
    }
}
