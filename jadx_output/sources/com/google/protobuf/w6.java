package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class w6 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f45648a = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);

    /* renamed from: b, reason: collision with root package name */
    public static final java.nio.charset.Charset f45649b = java.nio.charset.Charset.forName(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f45650c;

    static {
        byte[] bArr = new byte[0];
        f45650c = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        com.google.protobuf.d0.i(bArr, 0, 0, false);
    }

    public static int a(boolean z17) {
        return z17 ? 1231 : 1237;
    }

    public static int b(long j17) {
        return (int) (j17 ^ (j17 >>> 32));
    }

    public static java.lang.Object c(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.protobuf.o8) obj).toBuilder().mergeFrom((com.google.protobuf.o8) obj2).buildPartial();
    }
}
