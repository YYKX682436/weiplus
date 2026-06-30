package com.tencent.mm.console;

/* loaded from: classes11.dex */
public class o2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("fetch_base_id");
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "base id is empty, abort");
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "base id is empty, abort", 1).show();
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("use_https", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "#RECOVERY_FETCH_PATCH, baseId = %s, useHTTPS = %s", stringExtra, java.lang.Boolean.valueOf(booleanExtra));
        sc0.g gVar = (sc0.g) i95.n0.c(sc0.g.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        sc0.f fVar = sc0.f.TEST_SHELL_COMMAND;
        ((rc0.i) gVar).getClass();
        com.tencent.recovery.wx.service.WXRecoveryUploadService.fetchTinkerPatch(context, fVar, stringExtra, true, booleanExtra);
    }
}
