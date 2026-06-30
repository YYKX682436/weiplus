package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class f8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282455e;

    public f8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, java.lang.String str) {
        this.f282455e = viewOnClickListenerC21748xb3d38e6b;
        this.f282454d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282455e;
        viewOnClickListenerC21748xb3d38e6b.h9(viewOnClickListenerC21748xb3d38e6b.P, 8);
        viewOnClickListenerC21748xb3d38e6b.Q.setVisibility(8);
        android.view.View view = viewOnClickListenerC21748xb3d38e6b.S;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$80", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$80", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewOnClickListenerC21748xb3d38e6b.R8(viewOnClickListenerC21748xb3d38e6b.I7());
        viewOnClickListenerC21748xb3d38e6b.o9(false);
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(viewOnClickListenerC21748xb3d38e6b);
        e4Var.f293309c = this.f282454d;
        e4Var.c();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3.c(viewOnClickListenerC21748xb3d38e6b.f282138e3, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21754x69515198(), null, java.lang.Boolean.FALSE);
    }
}
