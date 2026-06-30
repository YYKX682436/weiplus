package bb2;

/* loaded from: classes10.dex */
public final class e0 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f18846d;

    public e0(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.f18846d = onDismissListener;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        this.f18846d.onDismiss();
    }
}
