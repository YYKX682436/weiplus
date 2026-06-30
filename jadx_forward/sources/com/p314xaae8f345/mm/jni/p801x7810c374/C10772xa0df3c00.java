package com.p314xaae8f345.mm.jni.p801x7810c374;

/* renamed from: com.tencent.mm.jni.emojihelper.EmojiRgbaCacheManagerJni */
/* loaded from: classes12.dex */
public class C10772xa0df3c00 {
    public C10772xa0df3c00(zk0.a aVar) {
    }

    /* renamed from: nCheckCache */
    private native int m46258x509e6a68(java.lang.String str);

    /* renamed from: nCheckEmojiCache */
    private native int m46259x241f9fb6(java.lang.String str, boolean z17);

    /* renamed from: nClearAllCache */
    private native int m46260x7a877200();

    /* renamed from: nClearCache */
    private native int m46261x43d59c43(boolean z17);

    /* renamed from: nGetCacheFrame */
    private native int m46262x2b86f533(java.lang.String str, boolean z17, android.graphics.Bitmap bitmap);

    /* renamed from: nGetCacheFrameHeight */
    private native int m46263x5036803a(java.lang.String str, boolean z17);

    /* renamed from: nGetCacheFrameTotalLength */
    private native int m46264x3b2d0417(java.lang.String str, boolean z17);

    /* renamed from: nGetCacheFrameWidth */
    private native int m46265x878c9053(java.lang.String str, boolean z17);

    /* renamed from: nGetCacheSize */
    private native int m46266x6486037b(boolean z17);

    /* renamed from: nPutCacheFrame */
    private native int m46267x93c85ac(java.lang.String str, boolean z17, android.graphics.Bitmap bitmap, int i17, int i18);

    public boolean a(boolean z17) {
        return m46261x43d59c43(z17) > 0;
    }

    public int b(boolean z17) {
        return m46266x6486037b(z17);
    }
}
