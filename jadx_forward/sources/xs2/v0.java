package xs2;

/* loaded from: classes3.dex */
public final class v0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f537924d;

    public v0(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f537924d = onDismissListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f537924d.onDismiss();
        xs2.w0.f537925a = null;
    }
}
