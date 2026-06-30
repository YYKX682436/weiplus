package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class d8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282402d;

    public d8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f282402d = viewOnClickListenerC21748xb3d38e6b;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.f282121p4;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282402d;
        android.view.animation.Animation B7 = viewOnClickListenerC21748xb3d38e6b.B7(1000);
        B7.setAnimationListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c8(this));
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja.H()) {
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
        } else {
            android.view.Display display = viewOnClickListenerC21748xb3d38e6b.m78513xc2a54588().getDisplay();
            if (display != null && display.getRotation() != 0 && display.getRotation() != 2) {
                ((c35.m) i95.n0.c(c35.m.class)).getClass();
            }
        }
        viewOnClickListenerC21748xb3d38e6b.h9(viewOnClickListenerC21748xb3d38e6b.P, 8);
        viewOnClickListenerC21748xb3d38e6b.Q.setVisibility(8);
        android.view.View view = viewOnClickListenerC21748xb3d38e6b.S;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$79", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$79", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = viewOnClickListenerC21748xb3d38e6b.U;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$79", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$79", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewOnClickListenerC21748xb3d38e6b.U.startAnimation(B7);
        viewOnClickListenerC21748xb3d38e6b.R8(viewOnClickListenerC21748xb3d38e6b.I7());
        viewOnClickListenerC21748xb3d38e6b.o9(false);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = viewOnClickListenerC21748xb3d38e6b.f282144g;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 y17 = k1Var == null ? null : k1Var.y(viewOnClickListenerC21748xb3d38e6b.O3);
        if (y17 != null && viewOnClickListenerC21748xb3d38e6b.o8()) {
            g90.s sVar = (g90.s) ((h90.v) i95.n0.c(h90.v.class));
            sVar.getClass();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_msg_witch_to_original", sVar.Ni(y17), 32337);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3.c(viewOnClickListenerC21748xb3d38e6b.f282138e3, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21754x69515198(), 100, java.lang.Boolean.TRUE);
    }
}
