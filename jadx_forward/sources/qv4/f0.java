package qv4;

/* loaded from: classes5.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f448503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qv4.k0 f448504e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(android.view.View view, qv4.k0 k0Var) {
        super(0);
        this.f448503d = view;
        this.f448504e = k0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f448503d;
        int right = view.getRight();
        qv4.k0 k0Var = this.f448504e;
        int width = right - k0Var.n().getWidth();
        int left = view.getLeft() - k0Var.n().getScrollX();
        if (k0Var.n().getScrollX() < width || left < 0) {
            android.widget.HorizontalScrollView n17 = k0Var.n();
            if (width < 0) {
                width = 0;
            }
            n17.smoothScrollTo(width, 0);
        }
        return jz5.f0.f384359a;
    }
}
