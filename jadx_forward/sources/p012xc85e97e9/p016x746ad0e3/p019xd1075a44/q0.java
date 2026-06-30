package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class q0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver.OnGlobalLayoutListener f91215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 f91216e;

    public q0(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r0 r0Var, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f91216e = r0Var;
        this.f91215d = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        android.view.ViewTreeObserver viewTreeObserver = this.f91216e.L.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f91215d);
        }
    }
}
