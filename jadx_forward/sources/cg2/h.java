package cg2;

/* loaded from: classes3.dex */
public final class h implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f122638d;

    public h(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f122638d = onDismissListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        if (!cg2.i.f122641c) {
            this.f122638d.onDismiss();
        }
        cg2.i.f122640b = null;
    }
}
