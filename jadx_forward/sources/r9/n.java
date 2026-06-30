package r9;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f474916a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f474917b;

    /* renamed from: c, reason: collision with root package name */
    public final long f474918c;

    /* renamed from: d, reason: collision with root package name */
    public final long f474919d;

    /* renamed from: e, reason: collision with root package name */
    public final long f474920e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f474921f;

    /* renamed from: g, reason: collision with root package name */
    public final int f474922g;

    public n(android.net.Uri uri, int i17) {
        this(uri, 0L, -1L, null, i17);
    }

    public r9.n a(long j17) {
        long j18 = this.f474920e;
        long j19 = j18 != -1 ? j18 - j17 : -1L;
        return (j17 == 0 && j18 == j19) ? this : new r9.n(this.f474916a, this.f474917b, this.f474918c + j17, this.f474919d + j17, j19, this.f474921f, this.f474922g);
    }

    /* renamed from: toString */
    public java.lang.String m162067x9616526c() {
        return "DataSpec[" + this.f474916a + ", " + java.util.Arrays.toString(this.f474917b) + ", " + this.f474918c + ", " + this.f474919d + ", " + this.f474920e + ", " + this.f474921f + ", " + this.f474922g + "]";
    }

    public n(android.net.Uri uri, long j17, long j18, java.lang.String str) {
        this(uri, j17, j17, j18, str, 0);
    }

    public n(android.net.Uri uri, long j17, long j18, java.lang.String str, int i17) {
        this(uri, j17, j17, j18, str, i17);
    }

    public n(android.net.Uri uri, long j17, long j18, long j19, java.lang.String str, int i17) {
        this(uri, null, j17, j18, j19, str, i17);
    }

    public n(android.net.Uri uri, byte[] bArr, long j17, long j18, long j19, java.lang.String str, int i17) {
        boolean z17 = true;
        t9.a.a(j17 >= 0);
        t9.a.a(j18 >= 0);
        if (j19 <= 0 && j19 != -1) {
            z17 = false;
        }
        t9.a.a(z17);
        this.f474916a = uri;
        this.f474917b = bArr;
        this.f474918c = j17;
        this.f474919d = j18;
        this.f474920e = j19;
        this.f474921f = str;
        this.f474922g = i17;
    }
}
