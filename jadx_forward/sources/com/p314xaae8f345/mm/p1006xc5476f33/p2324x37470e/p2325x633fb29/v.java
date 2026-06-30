package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes14.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w f257283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f257284e;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w wVar, long j17) {
        this.f257283d = wVar;
        this.f257284e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w wVar = this.f257283d;
        java.lang.Object obj = wVar.f257307w;
        long j17 = this.f257284e;
        synchronized (obj) {
            if (wVar.f257300p != null && wVar.f257299o != null) {
                wVar.D.m97814x5d2a96d("MicroMsg.CompositionSoftwareEncoder", "render gpu rgb2yuv, timestamp:" + j17);
                os0.g gVar = wVar.f257299o;
                if (gVar != null) {
                    gVar.o();
                }
                rs0.h hVar = wVar.f257300p;
                android.opengl.EGLExt.eglPresentationTimeANDROID(hVar != null ? hVar.f480825a : null, hVar != null ? hVar.f480826b : null, j17 * 1000);
                rs0.g gVar2 = rs0.i.f480829a;
                rs0.h hVar2 = wVar.f257300p;
                gVar2.x(hVar2 != null ? hVar2.f480825a : null, hVar2 != null ? hVar2.f480826b : null);
                wVar.f257309y++;
            }
        }
    }
}
