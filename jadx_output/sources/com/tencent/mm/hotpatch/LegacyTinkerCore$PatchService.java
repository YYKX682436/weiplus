package com.tencent.mm.hotpatch;

/* loaded from: classes11.dex */
public class LegacyTinkerCore$PatchService extends com.tencent.tinker.lib.service.AbstractResultService {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f68287e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f68288d = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // com.tencent.tinker.lib.service.AbstractResultService
    public void a(com.tencent.tinker.lib.service.PatchResult patchResult) {
        java.lang.String a17;
        java.lang.String str;
        if (patchResult == null) {
            ak0.l.a("MicroMsg.HotPatch.LegacyCore", "TinkerPatchResultService received null result!!!!");
            return;
        }
        this.f68288d.postDelayed(new java.lang.Runnable() { // from class: ak0.w$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.hotpatch.LegacyTinkerCore$PatchService.f68287e;
                com.tencent.mm.hotpatch.LegacyTinkerCore$PatchService legacyTinkerCore$PatchService = com.tencent.mm.hotpatch.LegacyTinkerCore$PatchService.this;
                legacyTinkerCore$PatchService.getClass();
                ak0.k kVar = ak0.l.f5540a;
                if (kVar == null) {
                    throw new java.lang.IllegalStateException("Log engine is not set");
                }
                kVar.a(5, "MicroMsg.HotPatch.LegacyCore", "actually kill tinker patch service!");
                uv5.a.b(legacyTinkerCore$PatchService.getApplicationContext());
            }
        }, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        ak0.x xVar = ak0.s.f5546a;
        if (xVar == null) {
            throw new java.lang.IllegalStateException("Helper is not initialized.");
        }
        ak0.q qVar = new ak0.q(patchResult);
        java.util.Iterator it = xVar.f5559j.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService) ((ak0.c) it.next())).getClass();
            com.tencent.mars.xlog.Log.i("Tinker.TinkerPatchResultService", "TinkerPatchResultService receive result: %s", qVar.toString());
            com.tencent.mars.xlog.Log.i("Tinker.TinkerPatchResultService", "onPatchResult on service");
            com.tencent.tinker.lib.service.PatchResult patchResult2 = qVar.f5545a;
            ak0.e a18 = ak0.g.a(new java.io.File(patchResult2.rawPatchFilePath));
            if (a18 != null) {
                java.util.Properties properties = ((ak0.f) a18).f5537a;
                java.lang.String property = properties.getProperty("patch.client.ver");
                if (android.text.TextUtils.isEmpty(property)) {
                    com.tencent.mars.xlog.Log.e("Tinker.TinkerPatchResultService", "[-] Fail to get patch clientversion.");
                } else {
                    b83.e eVar = new b83.e(lp0.a.f320249c, property);
                    android.content.SharedPreferences b17 = eVar.b();
                    java.lang.String a19 = eVar.a(2);
                    if (b17.contains(a19)) {
                        eVar.c(2, java.lang.System.currentTimeMillis() - b17.getLong(a19, 0L));
                        b17.edit().remove(a19).remove(eVar.a(3)).commit();
                    }
                    y73.z.a(com.tencent.mm.sdk.platformtools.z.f193111g, property, properties.getProperty(com.tencent.tinker.loader.shareutil.ShareConstants.NEW_TINKER_ID), 0, patchResult2.isSuccess ? 1 : 0);
                }
            } else {
                com.tencent.mars.xlog.Log.i("Tinker.TinkerPatchResultService", "Diff package info is null.");
            }
            if (patchResult2.isSuccess) {
                if (!ak0.o.f() || (a17 = ak0.o.b().a()) == null || a17.isEmpty() || (str = patchResult2.patchVersion) == null || !str.equals(a17)) {
                    com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService.prepareSuicide();
                } else {
                    com.tencent.mars.xlog.Log.i("Tinker.TinkerPatchResultService", "I have already install the newly patch version!");
                }
            }
            b83.m mVar = com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService.f142404b;
            if (mVar != null) {
                wn4.g gVar = (wn4.g) mVar;
                com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService.f142404b = null;
                long j17 = patchResult2.totalCostTime;
                wn4.x xVar2 = wn4.x.f447571a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "patchResult costTime: %s, path: %s, isSuccess: %b", java.lang.Long.valueOf(j17), new java.io.File(patchResult2.rawPatchFilePath).getAbsolutePath(), java.lang.Boolean.valueOf(patchResult2.isSuccess));
                if (patchResult2.isSuccess) {
                    wn4.x.h(gVar.f447546a);
                } else {
                    jx3.f.INSTANCE.idkeyStat(1429L, 24L, 1L, false);
                    wn4.x.f447571a.j();
                }
            }
        }
    }
}
