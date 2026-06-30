package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class b implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a f167951d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a aVar) {
        this.f167951d = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar = this.f167951d.f167911p;
        iaVar.getClass();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setSource(4098);
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedDeque) iaVar.f168292c).iterator();
        while (it.hasNext()) {
            android.view.View view2 = (android.view.View) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha) it.next()).f168214a.get();
            if (view2 != null) {
                view2.dispatchTouchEvent(obtain);
            }
        }
        obtain.recycle();
    }
}
