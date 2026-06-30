package com.tencent.mm.console;

/* loaded from: classes5.dex */
public class m1 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            try {
                java.lang.String stringExtra = intent.getStringExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "path = " + stringExtra);
                if (stringExtra != null && !stringExtra.isEmpty()) {
                    java.lang.reflect.Field declaredField = android.os.storage.StorageVolume.class.getDeclaredField("mPath");
                    declaredField.setAccessible(true);
                    for (android.os.storage.StorageVolume storageVolume : ((android.os.storage.StorageManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("storage")).getStorageVolumes()) {
                        java.lang.String absolutePath = android.os.Build.VERSION.SDK_INT < 30 ? storageVolume.getDirectory().getAbsolutePath() : ((java.io.File) declaredField.get(storageVolume)).getAbsolutePath();
                        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "volPath=" + absolutePath + ", uuid=" + storageVolume.getUuid() + ", desc=" + storageVolume.getDescription(com.tencent.mm.sdk.platformtools.x2.f193071a));
                        if (!absolutePath.isEmpty()) {
                            java.io.File file = new java.io.File(absolutePath, stringExtra);
                            try {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "targetPath=" + file.getAbsolutePath() + ", result=" + file.mkdirs());
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "error: " + e17.getMessage());
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "packageInfo error = " + th6.getMessage());
            }
        }
    }
}
