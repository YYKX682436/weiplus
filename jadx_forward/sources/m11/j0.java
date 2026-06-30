package m11;

/* loaded from: classes12.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f404252a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f404253b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String[] f404254c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f404255d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f404256e;

    public j0(java.lang.String str, java.lang.String str2, java.lang.String[] strArr, long j17, long j18) {
        this.f404255d = r0;
        java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f404256e = atomicLong;
        this.f404252a = str2;
        this.f404253b = str;
        this.f404254c = strArr;
        long[] jArr = {j17, j18};
        atomicLong.set(j17);
    }
}
