package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class vf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f211491d;

    public vf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949) {
        this.f211491d = activityC15059x3e98c949;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f211491d;
        android.view.View view = activityC15059x3e98c949.f210210t;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentLayout");
            throw null;
        }
        int measuredHeight = (view.getMeasuredHeight() - activityC15059x3e98c949.F1) / 2;
        android.view.View view2 = activityC15059x3e98c949.C;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cropTopView");
            throw null;
        }
        view2.getLayoutParams().height = measuredHeight;
        android.view.View view3 = activityC15059x3e98c949.D;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cropBottomView");
            throw null;
        }
        view3.getLayoutParams().height = measuredHeight;
        android.view.View view4 = activityC15059x3e98c949.f210210t;
        if (view4 != null) {
            view4.requestLayout();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentLayout");
            throw null;
        }
    }
}
