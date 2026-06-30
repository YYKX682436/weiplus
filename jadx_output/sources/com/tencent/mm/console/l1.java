package com.tencent.mm.console;

/* loaded from: classes5.dex */
public class l1 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            try {
                java.lang.String stringExtra = intent.getStringExtra("packageId");
                com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "packageId = " + stringExtra);
                com.tencent.wechat.aff.affroam.l0 h17 = com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().h(java.lang.Long.parseLong(stringExtra));
                if (h17 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "packageInfo.getFirstBackupStartTime = " + h17.f215889f);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "packageInfo.getLastBackupStopOrErrorTime = " + h17.f215888e);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "packageInfo.getIsDeleted = " + h17.f215891h);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "packageInfo is null");
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "packageInfo error = " + th6.getMessage());
            }
        }
    }
}
