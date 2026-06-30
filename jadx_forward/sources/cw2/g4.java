package cw2;

/* loaded from: classes2.dex */
public final class g4 implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 f305260d;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 c15183xcf23ff21) {
        this.f305260d = c15183xcf23ff21;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent p17, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent p07) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(p07);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$setVideoLongPressStateChangeListener$1", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15183xcf23ff21 c15183xcf23ff21 = this.f305260d;
        c15183xcf23ff21.N = true;
        yz5.l lVar = c15183xcf23ff21.L;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$setVideoLongPressStateChangeListener$1", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent p17, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent p07) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(p07);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$setVideoLongPressStateChangeListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$setVideoLongPressStateChangeListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
