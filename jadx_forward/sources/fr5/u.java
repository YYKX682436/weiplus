package fr5;

/* loaded from: classes15.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f347557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fr5.f0 f347558e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.view.View view, fr5.f0 f0Var) {
        super(1);
        this.f347557d = view;
        this.f347558e = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        android.view.MotionEvent e17 = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        android.view.View view = this.f347557d;
        int scaledTouchSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        fr5.f0 f0Var = this.f347558e;
        float f17 = scaledTouchSlop;
        if (zq5.l.b(f0Var.f347475g) < f17 && zq5.l.c(f0Var.f347475g) < f17) {
            if (view.isLongClickable()) {
                view.performLongClick();
                z17 = true;
            } else {
                z17 = false;
            }
            f0Var.f347470b = z17;
        }
        return jz5.f0.f384359a;
    }
}
