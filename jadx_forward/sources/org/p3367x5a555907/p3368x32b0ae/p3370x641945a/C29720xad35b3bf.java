package org.p3367x5a555907.p3368x32b0ae.p3370x641945a;

/* renamed from: org.tensorflow.lite.nnapi.NnApiDelegate */
/* loaded from: classes11.dex */
public class C29720xad35b3bf implements org.p3367x5a555907.p3368x32b0ae.b, java.lang.AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public long f429413d;

    /* renamed from: createDelegate */
    private static native long m155101x67d326a1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, boolean z17, boolean z18, boolean z19);

    /* renamed from: deleteDelegate */
    private static native void m155102xb677ec50(long j17);

    /* renamed from: getNnapiErrno */
    private static native int m155103xd371ada2(long j17);

    @Override // org.p3367x5a555907.p3368x32b0ae.b
    public long a() {
        return this.f429413d;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        long j17 = this.f429413d;
        if (j17 != 0) {
            m155102xb677ec50(j17);
            this.f429413d = 0L;
        }
    }
}
