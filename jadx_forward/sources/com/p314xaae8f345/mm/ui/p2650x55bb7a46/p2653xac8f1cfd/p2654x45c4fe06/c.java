package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06;

/* loaded from: classes9.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.d f280199d;

    public c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.d dVar) {
        this.f280199d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.d dVar = this.f280199d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.f fVar = dVar.f280200e;
        fVar.f280215t.f84522e = fVar.f280218d.x();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.f fVar2 = dVar.f280200e;
        ab5.z zVar = fVar2.f280215t;
        zVar.f84526i = false;
        int i17 = fVar2.f280203e;
        zVar.f84525h = i17;
        zVar.f84524g = fVar2.f280206h;
        zVar.f84521d = fVar2.f280205g;
        if (i17 == 2 || i17 == 3) {
            if (fVar2.f280212q) {
                zVar.e(1);
                return;
            } else {
                zVar.e(2);
                return;
            }
        }
        zVar.f84523f = fVar2.b();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p2654x45c4fe06.f fVar3 = dVar.f280200e;
        if (fVar3.f280212q) {
            fVar3.f280215t.e(5);
        } else {
            fVar3.f280215t.e(6);
        }
    }
}
