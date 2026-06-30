package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes5.dex */
public class m1 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            try {
                java.lang.String stringExtra = intent.getStringExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "path = " + stringExtra);
                if (stringExtra != null && !stringExtra.isEmpty()) {
                    java.lang.reflect.Field declaredField = android.os.storage.StorageVolume.class.getDeclaredField("mPath");
                    declaredField.setAccessible(true);
                    for (android.os.storage.StorageVolume storageVolume : ((android.os.storage.StorageManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("storage")).getStorageVolumes()) {
                        java.lang.String absolutePath = android.os.Build.VERSION.SDK_INT < 30 ? storageVolume.getDirectory().getAbsolutePath() : ((java.io.File) declaredField.get(storageVolume)).getAbsolutePath();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "volPath=" + absolutePath + ", uuid=" + storageVolume.getUuid() + ", desc=" + storageVolume.getDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                        if (!absolutePath.isEmpty()) {
                            java.io.File file = new java.io.File(absolutePath, stringExtra);
                            try {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "targetPath=" + file.getAbsolutePath() + ", result=" + file.mkdirs());
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "error: " + e17.getMessage());
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "packageInfo error = " + th6.getMessage());
            }
        }
    }
}
