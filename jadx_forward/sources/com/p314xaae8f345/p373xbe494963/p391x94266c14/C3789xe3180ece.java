package com.p314xaae8f345.p373xbe494963.p391x94266c14;

/* renamed from: com.tencent.liteav.extensions.AssetsUtils */
/* loaded from: classes12.dex */
public class C3789xe3180ece {
    /* renamed from: copyAssetFile */
    public static boolean m29709xf3486097(java.lang.String str, java.lang.String str2) {
        android.content.res.AssetManager m29239x2168b03d = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29239x2168b03d();
        try {
            java.io.File file = new java.io.File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            byte[] bArr = new byte[1024];
            java.io.InputStream open = m29239x2168b03d.open(str);
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
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("virtual-background", "copyAssetFile error: " + e17.getMessage());
            return false;
        }
    }

    /* renamed from: hasAssetFile */
    public static boolean m29710xda23712(java.lang.String str) {
        try {
            java.io.InputStream open = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29239x2168b03d().open(str);
            boolean z17 = open != null;
            open.close();
            return z17;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("virtual-background", "hasAssetFile error: " + e17.getMessage());
            return false;
        }
    }
}
