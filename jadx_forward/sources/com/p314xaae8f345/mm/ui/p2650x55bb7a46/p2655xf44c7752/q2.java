package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1 f282824d;

    public q2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1 viewTreeObserverOnPreDrawListenerC21747x53cf88d1) {
        this.f282824d = viewTreeObserverOnPreDrawListenerC21747x53cf88d1;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1 viewTreeObserverOnPreDrawListenerC21747x53cf88d1 = this.f282824d;
        android.view.View view = viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282116w;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282116w = null;
        }
    }
}
