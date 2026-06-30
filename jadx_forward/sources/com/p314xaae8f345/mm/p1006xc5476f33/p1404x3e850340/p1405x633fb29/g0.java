package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* loaded from: classes.dex */
public class g0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public g0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5607x1be3864e c5607x1be3864e = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5607x1be3864e) abstractC20979x809547d1;
        boolean z17 = false;
        if (c5607x1be3864e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceGetIsSupportListener", "hy: event is null");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y yVar = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.INSTANCE;
        boolean hasSystemFeature = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().hasSystemFeature("android.hardware.camera.front");
        boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.c(true);
        am.bg bgVar = c5607x1be3864e.f135933g;
        if (!hasSystemFeature) {
            bgVar.f87785b = 10001;
            bgVar.f87786c = "No front camera";
            vz2.c.e(10001, "No front camera");
        } else if (c17) {
            if (!com.p314xaae8f345.mm.ui.bk.A() || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_flash_enable_pad, true)) {
                bgVar.f87786c = "ok";
                vz2.c.e(0, "ok");
            } else {
                bgVar.f87785b = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6;
                bgVar.f87786c = "Not support pad";
                vz2.c.e(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261, "Not support pad");
            }
        } else {
            bgVar.f87785b = 10002;
            bgVar.f87786c = "No necessary model found";
            vz2.c.e(10002, "No necessary model found");
        }
        bgVar.f87787d = 1;
        if (hasSystemFeature && c17) {
            z17 = true;
        }
        bgVar.f87784a = z17;
        return true;
    }
}
