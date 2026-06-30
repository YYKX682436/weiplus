package bb2;

/* loaded from: classes10.dex */
public final class k0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f18903d;

    public k0(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f18903d = onDismissListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        if (!bb2.l0.f18910c) {
            this.f18903d.onDismiss();
        }
        bb2.l0.f18909b = null;
    }
}
