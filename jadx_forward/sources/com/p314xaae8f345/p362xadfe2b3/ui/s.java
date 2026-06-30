package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class s implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 f127753d;

    public s(com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063) {
        this.f127753d = c3719xb0aa2063;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "content view attach to Window", new java.lang.Object[0]);
        int i17 = com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063.Q;
        com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063 = this.f127753d;
        if (c3719xb0aa2063.f127600t != null) {
            c3719xb0aa2063.f127600t.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.p362xadfe2b3.ui.t(c3719xb0aa2063, new java.lang.ref.WeakReference(c3719xb0aa2063)));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
