package ng;

/* loaded from: classes5.dex */
public final class d extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng.e f418418d;

    public d(ng.e eVar) {
        this.f418418d = eVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        ng.e eVar = this.f418418d;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae = eVar.f418421c;
        if (c3972x4b2f2ae != null && motionEvent != null) {
            float f17 = c3972x4b2f2ae.m32426x28f8d21c().f129332x;
            float f18 = c3972x4b2f2ae.m32426x28f8d21c().f129333y;
            float f19 = c3972x4b2f2ae.m32426x28f8d21c().f129332x + c3972x4b2f2ae.m32427xfb854877().f129332x;
            float f27 = c3972x4b2f2ae.m32426x28f8d21c().f129333y + c3972x4b2f2ae.m32427xfb854877().f129333y;
            if (motionEvent.getX() > f17 && motionEvent.getY() > f18 && motionEvent.getX() < f19 && motionEvent.getY() < f27) {
                mg.e.a("MJHandleBoxGestureDetector", "onDoubleTap, origin:[" + c3972x4b2f2ae.m32426x28f8d21c() + "]  size:[" + c3972x4b2f2ae.m32427xfb854877() + ']');
                ((mg.c) eVar.f418420b).f407729a.getClass();
            }
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        this.f418418d.getClass();
        mg.e.a("MJHandleBoxGestureDetector", "onScroll, distanceX:" + f17 + ", distanceY:" + f18 + ", touchCurRect:false");
        return super.onScroll(motionEvent, motionEvent2, f17, f18);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        ng.e eVar = this.f418418d;
        if (eVar.f418422d) {
            eVar.f418422d = false;
            return true;
        }
        if (motionEvent != null) {
            ng.f fVar = eVar.f418420b;
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e = new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(motionEvent.getX(), motionEvent.getY());
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e2 = eVar.f418419a;
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e3 = new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(c3974x289f3e2.f129332x, c3974x289f3e2.f129333y);
            mg.c cVar = (mg.c) fVar;
            cVar.getClass();
            cVar.f407729a.f407716a.m33416x12cac5bf(c3974x289f3e, new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(0.0f, 0.0f), c3974x289f3e3));
        }
        return true;
    }
}
