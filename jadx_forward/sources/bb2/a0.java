package bb2;

/* loaded from: classes10.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f100332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        super(0);
        this.f100332d = onDismissListener;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f100332d.onDismiss();
        return jz5.f0.f384359a;
    }
}
