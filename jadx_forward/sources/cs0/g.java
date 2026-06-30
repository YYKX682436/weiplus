package cs0;

/* loaded from: classes14.dex */
public final class g extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 f303581d;

    public g(com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 c10899x89fee862) {
        this.f303581d = c10899x89fee862;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDoubleTap enable:[");
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 c10899x89fee862 = this.f303581d;
        sb6.append(c10899x89fee862.f150432y.f537687e);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraFocusAndMeteringView", sb6.toString());
        if (java.lang.System.currentTimeMillis() - c10899x89fee862.f150415e > 1000 && c10899x89fee862.f150432y.f537687e) {
            cs0.b bVar = c10899x89fee862.f150414d;
            if (bVar != null) {
                com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396 c10897xb8eb1396 = (com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396) bVar;
                bs0.e eVar = c10897xb8eb1396.f150411i;
                if (eVar != null) {
                    eVar.e();
                }
                c10897xb8eb1396.mo9387x2db92f79();
            }
            c10899x89fee862.f150415e = java.lang.System.currentTimeMillis();
        }
        yj0.a.i(false, this, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraFocusAndMeteringView", "onSingleTapConfirmed");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSingleTapUp ");
        sb6.append(e17.getX());
        sb6.append(", ");
        sb6.append(e17.getY());
        sb6.append(' ');
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 c10899x89fee862 = this.f303581d;
        sb6.append(c10899x89fee862.f150432y.f537686d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraFocusAndMeteringView", sb6.toString());
        if (!c10899x89fee862.f150432y.f537686d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraFocusAndMeteringView", "no to use focus on");
            yj0.a.i(false, this, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
        float x17 = e17.getX();
        float y17 = e17.getY();
        pm0.v.X(new cs0.d(c10899x89fee862));
        if (c10899x89fee862.f150432y.f537685c && c10899x89fee862.f150423p == null) {
            c10899x89fee862.f150430w = p3325xe03a0797.p3326xc267989b.l.d(c10899x89fee862.f150429v, null, null, new cs0.f(c10899x89fee862, x17, y17, null), 3, null);
        } else {
            cs0.i iVar = c10899x89fee862.f150418h;
            if (iVar != null) {
                iVar.a(x17, y17, c10899x89fee862.a());
            }
            cs0.b bVar = c10899x89fee862.f150414d;
            if (bVar != null) {
                ((com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396) bVar).m(x17, y17);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
