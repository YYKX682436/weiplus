package com.p314xaae8f345.mm.jni.p801x7810c374;

/* renamed from: com.tencent.mm.jni.emojihelper.WxamDecoderJni */
/* loaded from: classes14.dex */
public class C10774xe4d138e {

    /* renamed from: a, reason: collision with root package name */
    public long f150010a = -1;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("emojihelper");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/jni/emojihelper/WxamDecoderJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/jni/emojihelper/WxamDecoderJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: nCreate */
    private native long m46270x33b8030a(byte[] bArr, int i17);

    /* renamed from: nCreateWithCache */
    private native long m46271x8ebf8272(byte[] bArr, int i17, java.lang.String str, boolean z17);

    /* renamed from: nDecodeNextFrame */
    private native int m46272xc315f59e(long j17);

    /* renamed from: nGetFrame */
    private native int m46273x2db26645(long j17, android.graphics.Bitmap bitmap);

    /* renamed from: nGetFrameContentLoop */
    private native int m46274xd6079f38(long j17);

    /* renamed from: nGetFrameCount */
    private native int m46275x19801dca(long j17);

    /* renamed from: nGetFrameNextDuration */
    private native int m46276x583148c(long j17);

    /* renamed from: nGetFrameTime */
    private native int m46277xa60382b2(long j17);

    /* renamed from: nGetHeight */
    private native int m46278x8b506f4f(long j17);

    /* renamed from: nGetWidth */
    private native int m46279x2e9dea9e(long j17);

    /* renamed from: nIsWxGf */
    private native int m46280x3dfd21f8(long j17);

    /* renamed from: nRelease */
    private native int m46281x46fb07b9(long j17);

    /* renamed from: nRewindBuffer */
    private native int m46282xd3945469(long j17);

    public java.lang.Boolean a(byte[] bArr, int i17) {
        long m46270x33b8030a = m46270x33b8030a(bArr, i17);
        this.f150010a = m46270x33b8030a;
        return java.lang.Boolean.valueOf(m46270x33b8030a >= 0);
    }

    public java.lang.Boolean b(byte[] bArr, int i17, java.lang.String str, boolean z17) {
        long m46271x8ebf8272 = m46271x8ebf8272(bArr, i17, str, z17);
        this.f150010a = m46271x8ebf8272;
        return java.lang.Boolean.valueOf(m46271x8ebf8272 >= 0);
    }

    public int c() {
        return m46272xc315f59e(this.f150010a);
    }

    public int d(android.graphics.Bitmap bitmap) {
        return m46273x2db26645(this.f150010a, bitmap);
    }

    public int e() {
        return m46275x19801dca(this.f150010a);
    }

    public int f() {
        return m46277xa60382b2(this.f150010a);
    }

    public int g() {
        return m46278x8b506f4f(this.f150010a);
    }

    public int h() {
        return m46279x2e9dea9e(this.f150010a);
    }

    public int i() {
        return m46281x46fb07b9(this.f150010a);
    }
}
