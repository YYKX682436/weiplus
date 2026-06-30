package a12;

/* loaded from: classes7.dex */
public final class q extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a12.s f82052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82053e;

    public q(a12.s sVar, java.lang.String str) {
        this.f82052d = sVar;
        this.f82053e = str;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ecskfcard/api/MagicEcsKFDynamicCardServiceFeatureService$setFrameSetView$1$1$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/ecskfcard/api/MagicEcsKFDynamicCardServiceFeatureService$setFrameSetView$1$1$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ecskfcard/api/MagicEcsKFDynamicCardServiceFeatureService$setFrameSetView$1$1$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/ecskfcard/api/MagicEcsKFDynamicCardServiceFeatureService$setFrameSetView$1$1$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        a12.j jVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ecskfcard/api/MagicEcsKFDynamicCardServiceFeatureService$setFrameSetView$1$1$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.ref.WeakReference weakReference = this.f82052d.f82058f;
        if (weakReference != null && (jVar = (a12.j) weakReference.get()) != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w9 w9Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w9) jVar;
            java.lang.String frameSetName = this.f82053e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKFComponent", "showPopupMenu framesetname:".concat(frameSetName));
            java.lang.Object obj = w9Var.f281694e.get(frameSetName);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d6 d6Var = obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d6 ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d6) obj : null;
            if (d6Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKFComponent", "showPopupMenu framesetname:" + frameSetName + " holder is null");
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 m80051xdfe7150c = d6Var.m80051xdfe7150c(w9Var.f280113d);
                rl5.r rVar = new rl5.r(w9Var.f280113d.g(), d6Var.f285305b);
                rVar.C = true;
                rVar.W = true;
                rVar.f478888y = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.t9(1, w9Var);
                rVar.f478887x = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v9(1, frameSetName, m80051xdfe7150c, w9Var);
                android.view.View c17 = w9Var.f280113d.c(com.p314xaae8f345.mm.R.id.f565216bp0);
                if (c17 != null) {
                    pm0.v.s(c17);
                    rVar.S = false;
                    rVar.m();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EcsKFComponent", "chatting list view is null");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ecskfcard/api/MagicEcsKFDynamicCardServiceFeatureService$setFrameSetView$1$1$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        a12.j jVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.ref.WeakReference weakReference = this.f82052d.f82058f;
        if (weakReference != null && (jVar = (a12.j) weakReference.get()) != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w9 w9Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w9) jVar;
            java.lang.String frameSetName = this.f82053e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
            java.lang.Object obj = w9Var.f281694e.get(frameSetName);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d6 d6Var = obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d6 ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d6) obj : null;
            if (d6Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKFComponent", "onItemClick framesetname:" + frameSetName + " holder is null");
            } else {
                ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", d6Var.m80051xdfe7150c(w9Var.f280113d), "ecs_kf_card_dynamic");
            }
        }
        return super.onSingleTapConfirmed(e17);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ecskfcard/api/MagicEcsKFDynamicCardServiceFeatureService$setFrameSetView$1$1$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/ecskfcard/api/MagicEcsKFDynamicCardServiceFeatureService$setFrameSetView$1$1$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
