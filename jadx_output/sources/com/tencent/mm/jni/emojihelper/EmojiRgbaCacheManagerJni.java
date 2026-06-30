package com.tencent.mm.jni.emojihelper;

/* loaded from: classes12.dex */
public class EmojiRgbaCacheManagerJni {
    public EmojiRgbaCacheManagerJni(zk0.a aVar) {
    }

    private native int nCheckCache(java.lang.String str);

    private native int nCheckEmojiCache(java.lang.String str, boolean z17);

    private native int nClearAllCache();

    private native int nClearCache(boolean z17);

    private native int nGetCacheFrame(java.lang.String str, boolean z17, android.graphics.Bitmap bitmap);

    private native int nGetCacheFrameHeight(java.lang.String str, boolean z17);

    private native int nGetCacheFrameTotalLength(java.lang.String str, boolean z17);

    private native int nGetCacheFrameWidth(java.lang.String str, boolean z17);

    private native int nGetCacheSize(boolean z17);

    private native int nPutCacheFrame(java.lang.String str, boolean z17, android.graphics.Bitmap bitmap, int i17, int i18);

    public boolean a(boolean z17) {
        return nClearCache(z17) > 0;
    }

    public int b(boolean z17) {
        return nGetCacheSize(z17);
    }
}
