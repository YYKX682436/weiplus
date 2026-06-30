package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 f211037d;

    public m3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 activityC15025x361cfff2) {
        this.f211037d = activityC15025x361cfff2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 activityC15025x361cfff2 = this.f211037d;
        android.view.View view = activityC15025x361cfff2.f210076t;
        if (view != null) {
            activityC15025x361cfff2.X = view.getMeasuredHeight();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollContainer");
            throw null;
        }
    }
}
