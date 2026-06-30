package te2;

/* loaded from: classes10.dex */
public final class p9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.t9 f499869d;

    public p9(te2.t9 t9Var) {
        this.f499869d = t9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        te2.t9 t9Var = this.f499869d;
        int c17 = com.p314xaae8f345.mm.ui.bl.c(t9Var.f499976d.getContext());
        android.view.ViewGroup.LayoutParams layoutParams = t9Var.f499976d.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null || marginLayoutParams.bottomMargin >= c17) {
            return;
        }
        marginLayoutParams.bottomMargin = c17;
    }
}
