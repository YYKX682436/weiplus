package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes12.dex */
public class w9 implements en1.l {
    @Override // en1.l
    public void onAuthResponse(o45.ug ugVar, o45.vg vgVar, boolean z17) {
        if (vgVar != null && (vgVar instanceof o45.tg)) {
            com.tencent.mm.plugin.appbrand.appusage.c1 z07 = com.tencent.mm.plugin.appbrand.appusage.c1.z0();
            z07.getClass();
            ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.appusage.t0(z07));
            com.tencent.mm.plugin.appbrand.appcache.f8.a(true, null);
        }
        if (z17 && (ugVar instanceof o45.mg) && ugVar.getSceneStatus() == 12) {
            com.tencent.mm.plugin.appbrand.appcache.f8.a(true, null);
        }
        if (!((ugVar instanceof o45.sg) && ugVar.getSceneStatus() == 1) && (ugVar instanceof o45.mg)) {
            ugVar.getSceneStatus();
        }
    }

    @Override // en1.l
    public void onRegResponse(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
    }
}
