package bb2;

/* loaded from: classes10.dex */
public final class t implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f18996d;

    public t(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f18996d = onDismissListener;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        this.f18996d.onDismiss();
    }
}
