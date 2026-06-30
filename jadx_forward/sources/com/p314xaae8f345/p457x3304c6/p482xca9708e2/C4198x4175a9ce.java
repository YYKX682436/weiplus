package com.p314xaae8f345.p457x3304c6.p482xca9708e2;

/* renamed from: com.tencent.maas.speech.MJSpeechManager */
/* loaded from: classes5.dex */
public class C4198x4175a9ce {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 f130093a;

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f16163x39e86013;

    public C4198x4175a9ce(android.os.Handler handler) {
        com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671 = new com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671(handler.getLooper());
        this.f130093a = c4099x76754671;
        this.f16163x39e86013 = m34679xfce9a72c(handler, c4099x76754671);
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m34679xfce9a72c(android.os.Handler handler, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671 c4099x76754671);

    /* renamed from: nativeCancelAll */
    private native void m34680x2ca8270();

    /* renamed from: nativeCancelTask */
    private native void m34681x568e4696(int i17);

    /* renamed from: nativeQueryAsyncSpeechRequest */
    private native int m34682x1641c702(java.lang.String str, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634, java.lang.String str2, java.nio.ByteBuffer byteBuffer, int i17);

    /* renamed from: nativeQueryAsyncTTSRequest */
    private native int m34683xe2134187(java.lang.String str, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634, java.lang.String str2, java.nio.ByteBuffer byteBuffer, int i17);

    /* renamed from: nativeRequestFullSpeechRecognition */
    private native int m34684xc9f2930e(java.nio.ByteBuffer byteBuffer, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634, java.lang.String str2, int i17);

    /* renamed from: nativeRequestSpeechRecognition */
    private native int m34685xce9d59dd(java.nio.ByteBuffer byteBuffer, java.util.Map<java.lang.String, java.lang.String> map, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634, java.lang.String str, int i17);

    /* renamed from: nativeRequestSpeechToSpeech */
    private native int m34686x6f76c2d7(java.nio.ByteBuffer byteBuffer, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634, java.lang.String str2, int i17);

    /* renamed from: nativeSubmitAsyncSpeechRequest */
    private native int m34687xf7f4bba0(java.nio.ByteBuffer byteBuffer, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634, java.lang.String str2, int i17, int i18);

    /* renamed from: nativeSubmitAsyncTTSRequest */
    private native int m34688x8f1fc1a9(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4196x49e12c71 c4196x49e12c71, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634, java.lang.String str, int i17);

    public void a() {
        m34680x2ca8270();
    }

    public void b(int i17) {
        m34681x568e4696(i17);
    }

    public int c(java.lang.String str, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634, java.lang.String str2, java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.p457x3304c6.p482xca9708e2.b bVar) {
        int i17;
        if (bVar != null) {
            i17 = this.f130093a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p482xca9708e2.e(this, bVar, true));
        } else {
            i17 = -1;
        }
        return m34682x1641c702(str, c4197x7df5f634, str2, byteBuffer, i17);
    }

    public int d(java.lang.String str, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634, java.lang.String str2, java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.p457x3304c6.p482xca9708e2.b bVar) {
        int i17;
        if (bVar != null) {
            i17 = this.f130093a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p482xca9708e2.e(this, bVar, true));
        } else {
            i17 = -1;
        }
        return m34683xe2134187(str, c4197x7df5f634, str2, byteBuffer, i17);
    }

    public void e() {
        this.f16163x39e86013.m16727xc85fe246();
    }

    public int f(java.nio.ByteBuffer byteBuffer, java.util.Map map, java.lang.String str, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634, java.lang.String str2, com.p314xaae8f345.p457x3304c6.p482xca9708e2.d dVar) {
        int i17;
        if (dVar != null) {
            i17 = this.f130093a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p482xca9708e2.g(this, dVar, true));
        } else {
            i17 = -1;
        }
        return m34684xc9f2930e(byteBuffer, map, str, c4197x7df5f634, str2, i17);
    }

    public int g(java.nio.ByteBuffer byteBuffer, java.util.Map map, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634, java.lang.String str, com.p314xaae8f345.p457x3304c6.p482xca9708e2.d dVar) {
        int i17;
        if (dVar != null) {
            i17 = this.f130093a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p482xca9708e2.g(this, dVar, true));
        } else {
            i17 = -1;
        }
        return m34685xce9d59dd(byteBuffer, map, c4197x7df5f634, str, i17);
    }

    public int h(java.nio.ByteBuffer byteBuffer, java.util.Map map, java.lang.String str, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634, java.lang.String str2, int i17, com.p314xaae8f345.p457x3304c6.p482xca9708e2.c cVar) {
        int i18;
        if (cVar != null) {
            i18 = this.f130093a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p482xca9708e2.f(this, cVar, true));
        } else {
            i18 = -1;
        }
        return m34687xf7f4bba0(byteBuffer, map, str, c4197x7df5f634, str2, i17, i18);
    }

    public int i(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4196x49e12c71 c4196x49e12c71, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634, java.lang.String str, com.p314xaae8f345.p457x3304c6.p482xca9708e2.c cVar) {
        int i17;
        if (cVar != null) {
            i17 = this.f130093a.m33784xe7f76008(new com.p314xaae8f345.p457x3304c6.p482xca9708e2.f(this, cVar, true));
        } else {
            i17 = -1;
        }
        return m34688x8f1fc1a9(c4196x49e12c71, c4197x7df5f634, str, i17);
    }
}
