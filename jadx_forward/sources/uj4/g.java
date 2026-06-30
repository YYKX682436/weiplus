package uj4;

/* loaded from: classes11.dex */
public final class g extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 f509966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f509967e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 c18676x82a91782, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f509966d = c18676x82a91782;
        this.f509967e = activityC0065xcd7aa112;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        cj4.l1 l1Var;
        in5.s0 s0Var;
        in5.s0 s0Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 c18676x82a91782 = this.f509966d;
        java.lang.ref.WeakReference weakReference = c18676x82a91782.f255316q;
        android.view.View view = (weakReference == null || (s0Var2 = (in5.s0) weakReference.get()) == null) ? null : s0Var2.f3639x46306858;
        android.widget.RelativeLayout relativeLayout = view instanceof android.widget.RelativeLayout ? (android.widget.RelativeLayout) view : null;
        if (relativeLayout != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f509967e;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(activityC0065xcd7aa112);
            int dimension = (int) activityC0065xcd7aa112.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561216ci);
            relativeLayout.addView(c22789xd23e9a9b);
            int i17 = dimension / 2;
            c18676x82a91782.T6(relativeLayout, ((int) e17.getX()) - i17, ((int) e17.getY()) - i17, true);
            java.lang.ref.WeakReference weakReference2 = c18676x82a91782.f255316q;
            java.lang.Object obj = (weakReference2 == null || (s0Var = (in5.s0) weakReference2.get()) == null) ? null : s0Var.f374657h;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) obj : null;
            if (q3Var != null && (l1Var = q3Var.C) != null) {
                l1Var.k(true, true);
            }
        }
        boolean onDoubleTap = super.onDoubleTap(e17);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        in5.s0 s0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        super.onLongPress(e17);
        java.lang.ref.WeakReference weakReference = this.f509966d.f255316q;
        java.lang.Object obj = (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null) ? null : s0Var.f374657h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) obj : null;
        if (q3Var != null) {
            q3Var.A();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
