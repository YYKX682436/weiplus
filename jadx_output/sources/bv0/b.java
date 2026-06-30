package bv0;

/* loaded from: classes5.dex */
public final class b extends db5.w5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bv0.e f24684d;

    public b(bv0.e eVar) {
        this.f24684d = eVar;
    }

    @Override // db5.w5, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        float x17 = e17.getX();
        float y17 = e17.getY();
        bv0.e eVar = this.f24684d;
        java.util.Iterator it = eVar.f24694e.iterator();
        while (it.hasNext()) {
            ((bv0.a) it.next()).onDoubleTap(x17, y17);
        }
        return eVar.f24692c;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return this.f24684d.f24692c;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        if (motionEvent2 == null) {
            return false;
        }
        int pointerCount = motionEvent2.getPointerCount();
        bv0.e eVar = this.f24684d;
        if (eVar.f24693d == bv0.d.f24687e || pointerCount > 1) {
            return false;
        }
        motionEvent2.getPointerCount();
        java.util.Iterator it = eVar.f24694e.iterator();
        while (it.hasNext()) {
            ((bv0.a) it.next()).a(f17, f18);
        }
        return eVar.f24692c;
    }

    @Override // db5.w5, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return false;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        float x17 = e17.getX();
        float y17 = e17.getY();
        java.util.Iterator it = this.f24684d.f24694e.iterator();
        while (it.hasNext()) {
            ((bv0.a) it.next()).onSingleTap(x17, y17);
        }
        return true;
    }
}
