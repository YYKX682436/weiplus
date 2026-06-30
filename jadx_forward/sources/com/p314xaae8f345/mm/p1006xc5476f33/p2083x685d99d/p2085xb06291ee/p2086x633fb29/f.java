package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h f243958d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h hVar) {
        this.f243958d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        m34.g gVar = (m34.g) this.f243958d.f243962f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f c17689x58a87b4f = (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f) gVar.I.get();
        if (c17689x58a87b4f != null) {
            c17689x58a87b4f.mo69290xd44890a8(null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightPlayImageView", "onGetFrameBmp, imageView is null, do clear");
            gVar.c();
        }
    }
}
