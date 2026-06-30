package bp2;

/* loaded from: classes2.dex */
public final class k implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp2.m f104603d;

    public k(bp2.m mVar) {
        this.f104603d = mVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", "onDown");
        bp2.m mVar = this.f104603d;
        if (bp2.m.c(mVar, e17)) {
            return false;
        }
        if (bp2.m.a(mVar, e17)) {
            return true;
        }
        bp2.m.b(mVar, e17);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFling e1:");
        sb6.append(motionEvent != null ? java.lang.Float.valueOf(motionEvent.getX()) : null);
        sb6.append(" e2:");
        sb6.append(java.lang.Float.valueOf(e27.getX()));
        sb6.append(" velocityX:");
        sb6.append(f17);
        sb6.append(" velocityY:");
        sb6.append(f18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", sb6.toString());
        bp2.m mVar = this.f104603d;
        if (bp2.m.c(mVar, motionEvent)) {
            return false;
        }
        if (bp2.m.a(mVar, motionEvent)) {
            return true;
        }
        bp2.m.b(mVar, motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$gestureDetectorListener$1", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", if1.m.f69928x24728b);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$gestureDetectorListener$1", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onScroll e1:");
        sb6.append(motionEvent != null ? java.lang.Float.valueOf(motionEvent.getX()) : null);
        sb6.append(" e2:");
        sb6.append(java.lang.Float.valueOf(e27.getX()));
        sb6.append(" distanceX:");
        sb6.append(f17);
        sb6.append(" distanceY:");
        sb6.append(f18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", sb6.toString());
        bp2.m mVar = this.f104603d;
        if (bp2.m.c(mVar, motionEvent)) {
            return false;
        }
        if (bp2.m.a(mVar, motionEvent)) {
            if (f17 > 10.0f) {
                mVar.e();
                bp2.m.d(mVar);
            } else {
                mVar.e();
            }
            return true;
        }
        if (bp2.m.b(mVar, motionEvent)) {
            if (f17 > 10.0f) {
                mVar.e();
                bp2.m.d(mVar);
            } else {
                mVar.e();
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$gestureDetectorListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", "onSingleTapUp");
        bp2.m mVar = this.f104603d;
        if (bp2.m.c(mVar, e17)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$gestureDetectorListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (bp2.m.a(mVar, e17)) {
            mVar.e();
            yj0.a.i(true, this, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$gestureDetectorListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (!bp2.m.b(mVar, e17)) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$gestureDetectorListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return true;
        }
        mVar.e();
        bp2.m.d(mVar);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$gestureDetectorListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }
}
