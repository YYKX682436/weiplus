package bb2;

/* loaded from: classes10.dex */
public final class y implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f19076d;

    public y(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f19076d = onDismissListener;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        this.f19076d.onDismiss();
    }
}
