package com.p314xaae8f345.p2936x80def495.jni;

/* renamed from: com.tencent.skyline.jni.ISkylineResourceLoader */
/* loaded from: classes7.dex */
public interface InterfaceC25597x90fd3ced {

    /* renamed from: com.tencent.skyline.jni.ISkylineResourceLoader$BitmapLoadCallback */
    /* loaded from: classes7.dex */
    public interface BitmapLoadCallback {
        /* renamed from: onBitmapLoaded */
        void mo95916x5481b993(android.graphics.Bitmap bitmap);
    }

    /* renamed from: com.tencent.skyline.jni.ISkylineResourceLoader$ResourceLoadCallback */
    /* loaded from: classes7.dex */
    public interface ResourceLoadCallback {
        /* renamed from: onResourceLoaded */
        void mo95917x2027c572(byte[] bArr);
    }

    /* renamed from: loadBitmap */
    android.graphics.Bitmap mo95912xd586ddb5(java.lang.String str);

    /* renamed from: loadBitmapAsync */
    void mo95913x5e27dc7(java.lang.String str, com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced.BitmapLoadCallback bitmapLoadCallback);

    /* renamed from: loadResource */
    byte[] mo95914x3830a714(java.lang.String str);

    /* renamed from: loadResourceAsync */
    void mo95915x850ab7c8(java.lang.String str, com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced.ResourceLoadCallback resourceLoadCallback);
}
