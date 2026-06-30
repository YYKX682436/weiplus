package uj4;

/* loaded from: classes11.dex */
public final class j extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 f509971d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 c18676x82a91782) {
        this.f509971d = c18676x82a91782;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$withoutDoubleTapGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$withoutDoubleTapGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$withoutDoubleTapGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$withoutDoubleTapGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        in5.s0 s0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$withoutDoubleTapGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        super.onLongPress(e17);
        java.lang.ref.WeakReference weakReference = this.f509971d.f255316q;
        java.lang.Object obj = (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null) ? null : s0Var.f374657h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) obj : null;
        if (q3Var != null) {
            q3Var.A();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$withoutDoubleTapGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$withoutDoubleTapGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardFeedUIC$withoutDoubleTapGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
