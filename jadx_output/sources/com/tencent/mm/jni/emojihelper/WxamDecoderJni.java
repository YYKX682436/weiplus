package com.tencent.mm.jni.emojihelper;

/* loaded from: classes14.dex */
public class WxamDecoderJni {

    /* renamed from: a, reason: collision with root package name */
    public long f68477a = -1;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("emojihelper");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/jni/emojihelper/WxamDecoderJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/jni/emojihelper/WxamDecoderJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private native long nCreate(byte[] bArr, int i17);

    private native long nCreateWithCache(byte[] bArr, int i17, java.lang.String str, boolean z17);

    private native int nDecodeNextFrame(long j17);

    private native int nGetFrame(long j17, android.graphics.Bitmap bitmap);

    private native int nGetFrameContentLoop(long j17);

    private native int nGetFrameCount(long j17);

    private native int nGetFrameNextDuration(long j17);

    private native int nGetFrameTime(long j17);

    private native int nGetHeight(long j17);

    private native int nGetWidth(long j17);

    private native int nIsWxGf(long j17);

    private native int nRelease(long j17);

    private native int nRewindBuffer(long j17);

    public java.lang.Boolean a(byte[] bArr, int i17) {
        long nCreate = nCreate(bArr, i17);
        this.f68477a = nCreate;
        return java.lang.Boolean.valueOf(nCreate >= 0);
    }

    public java.lang.Boolean b(byte[] bArr, int i17, java.lang.String str, boolean z17) {
        long nCreateWithCache = nCreateWithCache(bArr, i17, str, z17);
        this.f68477a = nCreateWithCache;
        return java.lang.Boolean.valueOf(nCreateWithCache >= 0);
    }

    public int c() {
        return nDecodeNextFrame(this.f68477a);
    }

    public int d(android.graphics.Bitmap bitmap) {
        return nGetFrame(this.f68477a, bitmap);
    }

    public int e() {
        return nGetFrameCount(this.f68477a);
    }

    public int f() {
        return nGetFrameTime(this.f68477a);
    }

    public int g() {
        return nGetHeight(this.f68477a);
    }

    public int h() {
        return nGetWidth(this.f68477a);
    }

    public int i() {
        return nRelease(this.f68477a);
    }
}
