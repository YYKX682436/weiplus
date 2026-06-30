package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class mk implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f200612d;

    public mk(java.lang.ref.WeakReference rWidget) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rWidget, "rWidget");
        this.f200612d = rWidget;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rk rkVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rk) this.f200612d.get();
        if (rkVar != null) {
            if (motionEvent != null && motionEvent.getAction() == 0) {
                rkVar.f201186a.v1();
            }
        }
        return jz5.f0.f384359a;
    }
}
