package com.tencent.mm.console;

/* loaded from: classes10.dex */
public final /* synthetic */ class p0$$e implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public final void a(android.content.Intent intent) {
        if (z65.c.a()) {
            ak0.a aVar = ak0.o.f5542a;
            java.lang.String stringExtra = intent.getStringExtra("lib_path");
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = ak0.j.f5538a;
            boolean z17 = ak0.x.f5548k;
            java.io.File patchDirectory = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(ak0.o.a());
            if (patchDirectory == null) {
                return;
            }
            java.lang.String str = patchDirectory.getAbsolutePath() + "/debug_lib";
            if (stringExtra == null || stringExtra.isEmpty()) {
                return;
            }
            com.tencent.mm.vfs.w6.c(stringExtra, str + "/" + stringExtra.substring(stringExtra.lastIndexOf("/") + 1));
        }
    }
}
