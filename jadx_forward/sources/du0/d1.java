package du0;

/* loaded from: classes5.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du0.p1 f324873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(du0.p1 p1Var) {
        super(1);
        this.f324873d = p1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(motionEvent, "motionEvent");
        du0.p1 p1Var = this.f324873d;
        android.view.ViewGroup viewGroup = p1Var.f324943m;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicTipContainer");
            throw null;
        }
        int[] t17 = pm0.v.t(viewGroup);
        boolean z17 = false;
        int i17 = t17[0];
        int i18 = t17[1];
        if (i17 <= motionEvent.getRawX()) {
            float rawX = motionEvent.getRawX();
            if (p1Var.f324943m == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicTipContainer");
                throw null;
            }
            if (rawX <= i17 + r8.getWidth() && i18 <= motionEvent.getRawY()) {
                float rawY = motionEvent.getRawY();
                if (p1Var.f324943m == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicTipContainer");
                    throw null;
                }
                if (rawY <= i18 + r0.getHeight()) {
                    z17 = true;
                }
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
