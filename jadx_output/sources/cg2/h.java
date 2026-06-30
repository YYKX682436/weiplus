package cg2;

/* loaded from: classes3.dex */
public final class h implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f41105d;

    public h(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f41105d = onDismissListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        if (!cg2.i.f41108c) {
            this.f41105d.onDismiss();
        }
        cg2.i.f41107b = null;
    }
}
