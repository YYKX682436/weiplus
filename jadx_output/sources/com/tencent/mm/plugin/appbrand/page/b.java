package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class b implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.a f86418d;

    public b(com.tencent.mm.plugin.appbrand.page.a aVar) {
        this.f86418d = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        com.tencent.mm.plugin.appbrand.page.ia iaVar = this.f86418d.f86378p;
        iaVar.getClass();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setSource(4098);
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedDeque) iaVar.f86759c).iterator();
        while (it.hasNext()) {
            android.view.View view2 = (android.view.View) ((com.tencent.mm.plugin.appbrand.page.ha) it.next()).f86681a.get();
            if (view2 != null) {
                view2.dispatchTouchEvent(obtain);
            }
        }
        obtain.recycle();
    }
}
