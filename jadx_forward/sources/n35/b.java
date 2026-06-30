package n35;

/* loaded from: classes4.dex */
public final class b extends java.io.IOException {

    /* renamed from: d, reason: collision with root package name */
    public final long f416338d;

    /* renamed from: e, reason: collision with root package name */
    public final long f416339e;

    public b(long j17, long j18) {
        super(java.lang.String.format("contentLength: %d, requestRange:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18)));
        this.f416338d = j17;
        this.f416339e = j18;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "FileSizeOutOfRangeException{contentLength=" + this.f416338d + ", requestRange=" + this.f416339e + '}';
    }
}
