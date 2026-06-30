package zu3;

/* loaded from: classes10.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu3.x f557387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f557388e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(zu3.x xVar, android.view.MotionEvent motionEvent) {
        super(2);
        this.f557387d = xVar;
        this.f557388e = motionEvent;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Matrix m17 = (android.graphics.Matrix) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m17, "m");
        zu3.x xVar = this.f557387d;
        if (xVar.f557396n) {
            xVar.m179590xbfb64d6f().h(m17);
            zu3.y yVar = xVar.f557395m;
            if (yVar != null) {
                yVar.p(xVar.m179590xbfb64d6f().f106450g);
            }
            xVar.postInvalidate();
            if (booleanValue) {
                bw3.e m179590xbfb64d6f = xVar.m179590xbfb64d6f();
                android.view.MotionEvent motionEvent = this.f557388e;
                m179590xbfb64d6f.a(motionEvent);
                xVar.bringToFront();
                zu3.f fVar = xVar.f557390e;
                if (fVar != null) {
                    fVar.a(xVar, motionEvent);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
