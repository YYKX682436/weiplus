package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes5.dex */
public final class f6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302 f197825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f197826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f197827f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f197828g;

    public f6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302 c14334xd566b302, int i17, int i18, int i19) {
        this.f197825d = c14334xd566b302;
        this.f197826e = i17;
        this.f197827f = i18;
        this.f197828g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302 c14334xd566b302 = this.f197825d;
        android.widget.Scroller scroller = c14334xd566b302.f197556d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(scroller);
        scroller.startScroll(this.f197826e, 0, this.f197827f, 0, this.f197828g);
        c14334xd566b302.invalidate();
        c14334xd566b302.f197559g = false;
    }
}
