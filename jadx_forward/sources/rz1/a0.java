package rz1;

/* loaded from: classes2.dex */
public class a0 extends android.view.GestureDetector.SimpleOnGestureListener {
    public a0(com.tencent.mm.plugin.datareport.sample.ViewLayoutSampleUI viewLayoutSampleUI) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ViewLayoutSampleUI", "[onContextClick]");
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ViewLayoutSampleUI", "[onDoubleTap]");
        yj0.a.i(false, this, "com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI$2", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ViewLayoutSampleUI", "[onLongPress]");
        yj0.a.h(this, "com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI$2", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ViewLayoutSampleUI", "[onSingleTapUp]");
        yj0.a.i(false, this, "com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
