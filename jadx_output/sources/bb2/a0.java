package bb2;

/* loaded from: classes10.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f18799d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        super(0);
        this.f18799d = onDismissListener;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f18799d.onDismiss();
        return jz5.f0.f302826a;
    }
}
