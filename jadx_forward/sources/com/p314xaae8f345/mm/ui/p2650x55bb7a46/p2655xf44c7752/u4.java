package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class u4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f283009d;

    public u4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f283009d = viewOnClickListenerC21748xb3d38e6b;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.f282121p4;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f283009d;
        if (!viewOnClickListenerC21748xb3d38e6b.o8() || viewOnClickListenerC21748xb3d38e6b.isFinishing() || viewOnClickListenerC21748xb3d38e6b.isDestroyed() || !viewOnClickListenerC21748xb3d38e6b.z8()) {
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (viewOnClickListenerC21748xb3d38e6b.S1 && motionEvent.getAction() == 0 && viewOnClickListenerC21748xb3d38e6b.o8()) {
            motionEvent.offsetLocation(view.getScrollX() - viewOnClickListenerC21748xb3d38e6b.L1.getLeft(), view.getScrollY() - viewOnClickListenerC21748xb3d38e6b.L1.getTop());
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee) viewOnClickListenerC21748xb3d38e6b.L1).B(motionEvent);
            yj0.a.i(true, this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (!(viewOnClickListenerC21748xb3d38e6b.S1 && viewOnClickListenerC21748xb3d38e6b.o8()) && motionEvent.getAction() == 2) {
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        motionEvent.offsetLocation(view.getScrollX() - viewOnClickListenerC21748xb3d38e6b.L1.getLeft(), view.getScrollY() - viewOnClickListenerC21748xb3d38e6b.L1.getTop());
        boolean B = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee) viewOnClickListenerC21748xb3d38e6b.L1).B(motionEvent);
        if (motionEvent.getAction() == 1) {
            if (!B) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(viewOnClickListenerC21748xb3d38e6b.R1, "panel_status", java.lang.Integer.valueOf(viewOnClickListenerC21748xb3d38e6b.f282147g4 ? 2 : 1));
            }
            if (!viewOnClickListenerC21748xb3d38e6b.f282147g4 || B) {
                viewOnClickListenerC21748xb3d38e6b.o9(false);
            } else {
                viewOnClickListenerC21748xb3d38e6b.k8();
            }
        } else if (motionEvent.getAction() == 2 && B) {
            viewOnClickListenerC21748xb3d38e6b.o9(false);
            viewOnClickListenerC21748xb3d38e6b.t9();
        }
        yj0.a.i(B, this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return B;
    }
}
