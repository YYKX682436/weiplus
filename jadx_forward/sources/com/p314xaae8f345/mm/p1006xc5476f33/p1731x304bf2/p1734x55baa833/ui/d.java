package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui;

/* loaded from: classes12.dex */
public class d extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15845x2a5edf3 f220371d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15845x2a5edf3 activityC15845x2a5edf3) {
        this.f220371d = activityC15845x2a5edf3;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.ActivityC15845x2a5edf3 activityC15845x2a5edf3 = this.f220371d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC15845x2a5edf3.f220360o)) {
            if (activityC15845x2a5edf3.f220359n == null) {
                activityC15845x2a5edf3.f220359n = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC15845x2a5edf3.mo55332x76847179(), 1, false);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = activityC15845x2a5edf3.f220359n;
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.i(activityC15845x2a5edf3);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.j(activityC15845x2a5edf3);
            k0Var.p(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.k(activityC15845x2a5edf3));
            if (!activityC15845x2a5edf3.mo55332x76847179().isFinishing()) {
                activityC15845x2a5edf3.f220359n.v();
            }
        }
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        this.f220371d.finish();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
