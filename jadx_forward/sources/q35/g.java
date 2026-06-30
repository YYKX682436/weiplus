package q35;

/* loaded from: classes5.dex */
public abstract class g {
    public static void a(android.graphics.Bitmap bitmap, int i17, android.graphics.Bitmap.CompressFormat compressFormat, java.lang.String str, boolean z17) {
        if (str == null || str.length() <= 0) {
            throw new java.io.IOException("saveBitmapToImage pathName null or nil");
        }
        try {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.o0(str, new q35.f(bitmap, compressFormat, i17));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoUtil", e17, "", new java.lang.Object[0]);
                if (!z17) {
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoUtil", "recycle bitmap:%s", bitmap.toString());
                }
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoUtil", "recycle bitmap:%s", bitmap.toString());
                bitmap.recycle();
            }
        } catch (java.lang.Throwable th6) {
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoUtil", "recycle bitmap:%s", bitmap.toString());
                bitmap.recycle();
            }
            throw th6;
        }
    }
}
