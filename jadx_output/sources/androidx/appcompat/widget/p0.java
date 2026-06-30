package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class p0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.r0 f9670d;

    public p0(androidx.appcompat.widget.r0 r0Var) {
        this.f9670d = r0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        androidx.appcompat.widget.r0 r0Var = this.f9670d;
        androidx.appcompat.widget.AppCompatSpinner appCompatSpinner = r0Var.L;
        r0Var.getClass();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!(n3.x0.b(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(r0Var.K))) {
            r0Var.dismiss();
        } else {
            r0Var.g();
            super/*androidx.appcompat.widget.ListPopupWindow*/.show();
        }
    }
}
