package rb2;

/* loaded from: classes10.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.m0 f475350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(rb2.m0 m0Var) {
        super(1);
        this.f475350d = m0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        boolean z17 = true;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            rb2.m0 m0Var = this.f475350d;
            if (m0Var.f475219e.l0()) {
                m0Var.f475219e.B0(false);
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
