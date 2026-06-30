package com.tencent.liteav.extensions;

/* loaded from: classes12.dex */
public class AssetsUtils {
    public static boolean copyAssetFile(java.lang.String str, java.lang.String str2) {
        android.content.res.AssetManager applicationAssets = com.tencent.liteav.base.ContextUtils.getApplicationAssets();
        try {
            java.io.File file = new java.io.File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            byte[] bArr = new byte[1024];
            java.io.InputStream open = applicationAssets.open(str);
            java.io.File file2 = new java.io.File(str2 + java.io.File.separator + str + ".tmp");
            if (!file2.exists()) {
                file2.createNewFile();
            }
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
            while (true) {
                int read = open.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.flush();
            open.close();
            fileOutputStream.close();
            if (file2.renameTo(new java.io.File(str2 + java.io.File.separator + str))) {
                return true;
            }
            file2.delete();
            return false;
        } catch (java.io.IOException e17) {
            com.tencent.liteav.base.util.LiteavLog.i("virtual-background", "copyAssetFile error: " + e17.getMessage());
            return false;
        }
    }

    public static boolean hasAssetFile(java.lang.String str) {
        try {
            java.io.InputStream open = com.tencent.liteav.base.ContextUtils.getApplicationAssets().open(str);
            boolean z17 = open != null;
            open.close();
            return z17;
        } catch (java.io.IOException e17) {
            com.tencent.liteav.base.util.LiteavLog.i("virtual-background", "hasAssetFile error: " + e17.getMessage());
            return false;
        }
    }
}
