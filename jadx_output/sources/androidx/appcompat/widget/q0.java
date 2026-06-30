package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class q0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver.OnGlobalLayoutListener f9682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.r0 f9683e;

    public q0(androidx.appcompat.widget.r0 r0Var, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f9683e = r0Var;
        this.f9682d = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        android.view.ViewTreeObserver viewTreeObserver = this.f9683e.L.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f9682d);
        }
    }
}
