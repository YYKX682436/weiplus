package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class b90 implements com.p314xaae8f345.p3210x3857dc.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 f193526a;

    public b90(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 g90Var) {
        this.f193526a = g90Var;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShareWidget", "xfile on user cancel finish");
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void b(java.lang.String str, java.util.HashMap hashMap) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void c() {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void d(int i17, android.graphics.Bitmap thumbnail) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbnail, "thumbnail");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShareWidget", "xfile onThumbnailLoad " + i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShareWidget", "xfile onPageCountUpdate " + i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void f(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShareWidget", "xfile onPageChange " + i17 + " and pageWidth " + i18 + " and pageHeight " + i19);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 g90Var = this.f193526a;
        com.p314xaae8f345.p3210x3857dc.r1.b(g90Var.f194192i, g90Var.f194193j);
        g90Var.getClass();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void g(int i17, float f17, int i18, int i19, int i27, int i28) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenShareWidget", "xfile onViewStatusChange " + i17 + " and pageWidth " + i18 + " and pageHeight " + i19 + " and scale " + f17 + " and transX " + i27 + " and " + i28);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void h(android.view.MotionEvent motionEvent) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    public void i() {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.o1
    /* renamed from: onDoubleTap */
    public void mo56908xce1d2af3(android.view.MotionEvent motionEvent) {
    }
}
