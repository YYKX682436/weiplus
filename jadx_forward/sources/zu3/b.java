package zu3;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu3.c f557303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f557304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(zu3.c cVar, android.view.MotionEvent motionEvent) {
        super(2);
        this.f557303d = cVar;
        this.f557304e = motionEvent;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Matrix m17 = (android.graphics.Matrix) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m17, "m");
        zu3.c cVar = this.f557303d;
        cVar.m179509xbfb64d6f().h(m17);
        cVar.postInvalidate();
        if (booleanValue) {
            bw3.e m179509xbfb64d6f = cVar.m179509xbfb64d6f();
            android.view.MotionEvent motionEvent = this.f557304e;
            m179509xbfb64d6f.a(motionEvent);
            cVar.bringToFront();
            zu3.f fVar = cVar.f557306e;
            if (fVar != null) {
                fVar.a(cVar, motionEvent);
            }
            if (!cVar.m179507x8e0fd6aa()) {
                cVar.performClick();
            }
        }
        return jz5.f0.f384359a;
    }
}
