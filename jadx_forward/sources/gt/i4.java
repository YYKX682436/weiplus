package gt;

/* loaded from: classes7.dex */
public class i4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public i4() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5170x9489e038 c5170x9489e038 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5170x9489e038) abstractC20979x809547d1;
        if (gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAppBrand", "callback AppBrandVoipCheckIsDeviceUsingEvent true");
            if (i95.n0.h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0.class)) {
                java.util.Iterator it = ((java.util.ArrayList) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0.class))).Bi()).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11735xd37b16d6 c11735xd37b16d6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11735xd37b16d6) it.next();
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.w.b(c11735xd37b16d6.f158456f, 16)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAppBrand", "checkVoIPDeviceOccupy, already exist wxa using VOIP 1v1, appId:%s", c11735xd37b16d6.f158454d);
                        c5170x9489e038.f135519g.f90030b = true;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("" + c11735xd37b16d6.f158454d + "_wxa_voip").getBoolean("isCameraStart", false)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAppBrand", "isCameraStart true");
                            c5170x9489e038.f135519g.f90029a = true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
