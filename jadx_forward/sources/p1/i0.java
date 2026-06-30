package p1;

/* loaded from: classes14.dex */
public abstract class i0 {
    public static final void a(p1.l lVar, long j17, yz5.l lVar2, boolean z17) {
        p1.g gVar = lVar.f432376b;
        android.view.MotionEvent motionEvent = gVar != null ? gVar.f432351b.f432437b : null;
        if (motionEvent == null) {
            throw new java.lang.IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
        }
        int action = motionEvent.getAction();
        if (z17) {
            motionEvent.setAction(3);
        }
        motionEvent.offsetLocation(-d1.e.c(j17), -d1.e.d(j17));
        lVar2.mo146xb9724478(motionEvent);
        motionEvent.offsetLocation(d1.e.c(j17), d1.e.d(j17));
        motionEvent.setAction(action);
    }
}
