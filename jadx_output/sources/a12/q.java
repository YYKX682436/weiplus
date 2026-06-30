package a12;

/* loaded from: classes7.dex */
public final class q extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a12.s f519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520e;

    public q(a12.s sVar, java.lang.String str) {
        this.f519d = sVar;
        this.f520e = str;
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
        yj0.a.b("com/tencent/mm/plugin/ecskfcard/api/MagicEcsKFDynamicCardServiceFeatureService$setFrameSetView$1$1$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.ref.WeakReference weakReference = this.f519d.f525f;
        if (weakReference != null && (jVar = (a12.j) weakReference.get()) != null) {
            com.tencent.mm.ui.chatting.component.w9 w9Var = (com.tencent.mm.ui.chatting.component.w9) jVar;
            java.lang.String frameSetName = this.f520e;
            kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", "showPopupMenu framesetname:".concat(frameSetName));
            java.lang.Object obj = w9Var.f200161e.get(frameSetName);
            com.tencent.mm.ui.chatting.viewitems.d6 d6Var = obj instanceof com.tencent.mm.ui.chatting.viewitems.d6 ? (com.tencent.mm.ui.chatting.viewitems.d6) obj : null;
            if (d6Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", "showPopupMenu framesetname:" + frameSetName + " holder is null");
            } else {
                com.tencent.mm.storage.f9 currentMsgInfo = d6Var.getCurrentMsgInfo(w9Var.f198580d);
                rl5.r rVar = new rl5.r(w9Var.f198580d.g(), d6Var.f203772b);
                rVar.C = true;
                rVar.W = true;
                rVar.f397355y = new com.tencent.mm.ui.chatting.component.t9(1, w9Var);
                rVar.f397354x = new com.tencent.mm.ui.chatting.component.v9(1, frameSetName, currentMsgInfo, w9Var);
                android.view.View c17 = w9Var.f198580d.c(com.tencent.mm.R.id.f483683bp0);
                if (c17 != null) {
                    pm0.v.s(c17);
                    rVar.S = false;
                    rVar.m();
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EcsKFComponent", "chatting list view is null");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ecskfcard/api/MagicEcsKFDynamicCardServiceFeatureService$setFrameSetView$1$1$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        a12.j jVar;
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.ref.WeakReference weakReference = this.f519d.f525f;
        if (weakReference != null && (jVar = (a12.j) weakReference.get()) != null) {
            com.tencent.mm.ui.chatting.component.w9 w9Var = (com.tencent.mm.ui.chatting.component.w9) jVar;
            java.lang.String frameSetName = this.f520e;
            kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
            java.lang.Object obj = w9Var.f200161e.get(frameSetName);
            com.tencent.mm.ui.chatting.viewitems.d6 d6Var = obj instanceof com.tencent.mm.ui.chatting.viewitems.d6 ? (com.tencent.mm.ui.chatting.viewitems.d6) obj : null;
            if (d6Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", "onItemClick framesetname:" + frameSetName + " holder is null");
            } else {
                ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", d6Var.getCurrentMsgInfo(w9Var.f198580d), "ecs_kf_card_dynamic");
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
