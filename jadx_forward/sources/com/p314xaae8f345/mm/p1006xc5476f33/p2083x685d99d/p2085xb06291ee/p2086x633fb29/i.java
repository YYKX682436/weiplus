package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f243963d = false;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h f243964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s f243965f;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar) {
        this.f243965f = sVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayController", "make sure drawJob alive");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f243963d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop draw", java.lang.Integer.valueOf(this.f243965f.hashCode()), java.lang.Integer.valueOf(hashCode()));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar = this.f243965f;
        android.graphics.Bitmap bitmap = sVar.f243985h;
        m34.g gVar = (m34.g) sVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f c17689x58a87b4f = (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f) gVar.I.get();
        if (c17689x58a87b4f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightPlayImageView", "onGetFrameBmp, imageView is null, do clear");
            gVar.c();
        } else {
            c17689x58a87b4f.mo69290xd44890a8(bitmap);
        }
        if (this.f243965f.f243988k == 0) {
            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h hVar = this.f243964e;
            ((vf0.y1) k1Var).getClass();
            t21.o2.aj(hVar, 0L);
            return;
        }
        long currentTimeMillis = r0.f243984g - (java.lang.System.currentTimeMillis() - this.f243965f.f243988k);
        if (currentTimeMillis > 0) {
            wf0.k1 k1Var2 = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h hVar2 = this.f243964e;
            ((vf0.y1) k1Var2).getClass();
            t21.o2.aj(hVar2, currentTimeMillis);
            return;
        }
        wf0.k1 k1Var3 = (wf0.k1) i95.n0.c(wf0.k1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h hVar3 = this.f243964e;
        ((vf0.y1) k1Var3).getClass();
        t21.o2.aj(hVar3, 0L);
    }
}
