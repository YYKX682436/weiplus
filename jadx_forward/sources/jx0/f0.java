package jx0;

/* loaded from: classes5.dex */
public final class f0 extends db5.w5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10966x6b7a943f f383904d;

    public f0(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10966x6b7a943f c10966x6b7a943f) {
        this.f383904d = c10966x6b7a943f;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        return true;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        this.f383904d.K.d();
        return true;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10966x6b7a943f c10966x6b7a943f = this.f383904d;
        float f19 = c10966x6b7a943f.E;
        if (!c10966x6b7a943f.F) {
            return true;
        }
        float f27 = f19 - f17;
        if (f27 < 0.0f) {
            f27 = 0.0f;
        }
        float max = c10966x6b7a943f.A.getMax();
        if (f27 > max) {
            f27 = max;
        }
        c10966x6b7a943f.E = f27;
        c10966x6b7a943f.C(c10966x6b7a943f.E);
        c10966x6b7a943f.K.c(c10966x6b7a943f.m47261x1555a00f());
        return true;
    }
}
