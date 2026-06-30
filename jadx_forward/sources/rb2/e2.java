package rb2;

/* loaded from: classes10.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f475153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(rb2.z2 z2Var) {
        super(1);
        this.f475153d = z2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        boolean z17 = true;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            rb2.z2 z2Var = this.f475153d;
            if (z2Var.f475219e.l0()) {
                z2Var.f475219e.B0(false);
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
