package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class h1 implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 f232689d;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var) {
        this.f232689d = s1Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        return false;
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
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        int rawY = (int) e17.getRawY();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var = this.f232689d;
        boolean z17 = rawY > s1Var.R6().getLastVisibleItemPos()[1] + i65.a.b(s1Var.m80379x76847179(), 20);
        boolean z18 = ((int) e17.getRawY()) < s1Var.R6().getFirstVisibleItemPos()[1] - i65.a.b(s1Var.m80379x76847179(), 20);
        boolean z19 = ((int) e17.getRawY()) >= s1Var.R6().getFirstVisibleItemPos()[1] - i65.a.b(s1Var.m80379x76847179(), 40) && ((int) e17.getRawY()) <= s1Var.R6().getFirstVisibleItemPos()[1] - i65.a.b(s1Var.m80379x76847179(), 8);
        if (!z17 && !z18 && !z19) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (s1Var.R6().isShowLyricPrelude && z19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s1Var.f232946d, "onSingleTapUp restartMusic");
            s1Var.getClass();
            b21.m.h(0);
            if (b21.m.c()) {
                b21.m.g();
            } else {
                b21.r b17 = b21.m.b();
                if (b17 != null) {
                    b17.D = 0;
                }
                kl3.t.g().d(b17);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s1Var.f232946d, "onSingleTapUp hideFullLyric");
            s1Var.S6();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$gestureDetector$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }
}
