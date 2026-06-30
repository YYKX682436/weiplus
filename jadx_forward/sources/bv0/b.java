package bv0;

/* loaded from: classes5.dex */
public final class b extends db5.w5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bv0.e f106217d;

    public b(bv0.e eVar) {
        this.f106217d = eVar;
    }

    @Override // db5.w5, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        float x17 = e17.getX();
        float y17 = e17.getY();
        bv0.e eVar = this.f106217d;
        java.util.Iterator it = eVar.f106227e.iterator();
        while (it.hasNext()) {
            ((bv0.a) it.next()).mo9045xce1d2af3(x17, y17);
        }
        return eVar.f106225c;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        return this.f106217d.f106225c;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        if (motionEvent2 == null) {
            return false;
        }
        int pointerCount = motionEvent2.getPointerCount();
        bv0.e eVar = this.f106217d;
        if (eVar.f106226d == bv0.d.f106220e || pointerCount > 1) {
            return false;
        }
        motionEvent2.getPointerCount();
        java.util.Iterator it = eVar.f106227e.iterator();
        while (it.hasNext()) {
            ((bv0.a) it.next()).a(f17, f18);
        }
        return eVar.f106225c;
    }

    @Override // db5.w5, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        return false;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        float x17 = e17.getX();
        float y17 = e17.getY();
        java.util.Iterator it = this.f106217d.f106227e.iterator();
        while (it.hasNext()) {
            ((bv0.a) it.next()).mo9047xa5153b1c(x17, y17);
        }
        return true;
    }
}
