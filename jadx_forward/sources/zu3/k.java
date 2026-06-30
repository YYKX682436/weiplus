package zu3;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu3.l f557345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f557346e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(zu3.l lVar, android.view.MotionEvent motionEvent) {
        super(2);
        this.f557345d = lVar;
        this.f557346e = motionEvent;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Matrix m17 = (android.graphics.Matrix) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m17, "m");
        zu3.l lVar = this.f557345d;
        lVar.m179533xbfb64d6f().h(m17);
        lVar.postInvalidate();
        if (booleanValue) {
            bw3.e m179533xbfb64d6f = lVar.m179533xbfb64d6f();
            android.view.MotionEvent motionEvent = this.f557346e;
            m179533xbfb64d6f.a(motionEvent);
            lVar.bringToFront();
            zu3.f fVar = lVar.f557349t;
            if (fVar != null) {
                fVar.a(lVar, motionEvent);
            }
        }
        return jz5.f0.f384359a;
    }
}
