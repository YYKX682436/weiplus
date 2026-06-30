package org.p3367x5a555907.p3368x32b0ae.p3369x2ffff9;

/* renamed from: org.tensorflow.lite.flex.FlexDelegate */
/* loaded from: classes11.dex */
public class C29719xcc8cbe implements org.p3367x5a555907.p3368x32b0ae.b, java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public long f429412d = m155098x35c6ce98();

    /* renamed from: nativeCreateDelegate */
    private static native long m155098x35c6ce98();

    /* renamed from: nativeDeleteDelegate */
    private static native void m155099x846b9447(long j17);

    /* renamed from: nativeInitTensorFlow */
    private static native long m155100x5ecea24e();

    @Override // org.p3367x5a555907.p3368x32b0ae.b
    public long a() {
        return this.f429412d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j17 = this.f429412d;
        if (j17 != 0) {
            m155099x846b9447(j17);
            this.f429412d = 0L;
        }
    }
}
