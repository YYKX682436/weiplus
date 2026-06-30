package mo0;

/* loaded from: classes3.dex */
public final class c extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10848x88167aeb f411790d;

    public c(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10848x88167aeb c10848x88167aeb) {
        this.f411790d = c10848x88167aeb;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCameraOptionView", "onDoubleTap");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10848x88167aeb c10848x88167aeb = this.f411790d;
        if (currentTimeMillis - c10848x88167aeb.f150133e > 1000) {
            mo0.b bVar = c10848x88167aeb.f150132d;
            if (bVar != null) {
                bVar.e(e17.getX(), e17.getY());
            }
            c10848x88167aeb.f150133e = java.lang.System.currentTimeMillis();
        }
        yj0.a.i(false, this, "com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCameraOptionView", "onSingleTapConfirmed");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCameraOptionView", "onSingleTapUp");
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10848x88167aeb c10848x88167aeb = this.f411790d;
        mo0.b bVar = c10848x88167aeb.f150132d;
        if (bVar != null) {
            bVar.c(e17.getX(), e17.getY(), c10848x88167aeb.getWidth(), c10848x88167aeb.getHeight(), 400L);
        }
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10847x41cb474c c10847x41cb474c = c10848x88167aeb.f150136h;
        float x17 = e17.getX();
        float y17 = e17.getY();
        android.view.ViewGroup.LayoutParams layoutParams = c10847x41cb474c.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = ((int) x17) - (c10847x41cb474c.f150127q / 2);
            marginLayoutParams.topMargin = ((int) y17) - (c10847x41cb474c.f150128r / 2);
            c10847x41cb474c.setLayoutParams(marginLayoutParams);
            c10847x41cb474c.setVisibility(0);
            c10847x41cb474c.f150118e = true;
            c10847x41cb474c.f150119f = false;
            c10847x41cb474c.f150120g = false;
            c10847x41cb474c.f150121h = java.lang.System.currentTimeMillis();
            c10847x41cb474c.invalidate();
        }
        yj0.a.i(false, this, "com/tencent/mm/live/core/view/LiveCameraOptionView$initGestureDetecotr$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
