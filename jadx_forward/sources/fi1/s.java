package fi1;

/* loaded from: classes8.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f344329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12 f344330e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12 c12478x3e6e5e12, android.view.MotionEvent motionEvent) {
        this.f344330e = c12478x3e6e5e12;
        this.f344329d = motionEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.MotionEvent motionEvent = this.f344329d;
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        obtain.setAction(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12 c12478x3e6e5e12 = this.f344330e;
        c12478x3e6e5e12.dispatchTouchEvent(obtain);
        android.view.MotionEvent obtain2 = android.view.MotionEvent.obtain(motionEvent);
        obtain2.setAction(0);
        c12478x3e6e5e12.dispatchTouchEvent(obtain2);
    }
}
