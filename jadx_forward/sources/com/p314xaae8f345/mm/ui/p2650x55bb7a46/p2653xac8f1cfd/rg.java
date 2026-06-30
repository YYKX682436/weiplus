package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class rg implements android.view.GestureDetector.OnDoubleTapListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 f281388d;

    public rg(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f2) {
        this.f281388d = c21668xed8974f2;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/LoadableTextView$gestureDetector$2$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/component/LoadableTextView$gestureDetector$2$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f2 = this.f281388d;
        yz5.p pVar = c21668xed8974f2.f280090i;
        if (pVar != null) {
            return ((java.lang.Boolean) pVar.mo149xb9724478(c21668xed8974f2, e17)).booleanValue();
        }
        return false;
    }
}
