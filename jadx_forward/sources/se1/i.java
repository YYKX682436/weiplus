package se1;

/* loaded from: classes13.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f488305a;

    /* renamed from: b, reason: collision with root package name */
    public final long f488306b;

    /* renamed from: c, reason: collision with root package name */
    public final long f488307c;

    /* renamed from: d, reason: collision with root package name */
    public final long f488308d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f488309e;

    /* renamed from: f, reason: collision with root package name */
    public final int f488310f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f488311g;

    /* renamed from: h, reason: collision with root package name */
    public final int f488312h;

    public i(android.net.Uri uri, long j17, long j18, long j19, java.lang.String str, int i17, java.lang.String str2) {
        this(uri, j17, j17, j19, str, i17, str2, -1);
    }

    /* renamed from: toString */
    public java.lang.String m164337x9616526c() {
        return "DataSpec[uri=" + this.f488305a + ", absPos=" + this.f488306b + ", pos=" + this.f488307c + ", len=" + this.f488308d + ", key=" + this.f488309e + ", flags=" + this.f488310f + ", uuid=" + this.f488311g + "]";
    }

    public i(android.net.Uri uri, long j17, long j18, long j19, java.lang.String str, int i17, java.lang.String str2, int i18) {
        boolean z17 = true;
        try {
            if (!(j17 >= 0)) {
                throw new java.lang.IllegalArgumentException();
            }
            if (!(j18 >= 0)) {
                throw new java.lang.IllegalArgumentException();
            }
            if (j19 <= 0 && j19 != -1) {
                z17 = false;
            }
            if (z17) {
                this.f488305a = uri;
                this.f488306b = j17;
                this.f488307c = j18;
                this.f488308d = j19;
                this.f488309e = str;
                this.f488310f = i17;
                this.f488311g = str2;
                this.f488312h = i18;
                return;
            }
            throw new java.lang.IllegalArgumentException();
        } catch (java.lang.IllegalArgumentException e17) {
            throw new se1.z(e17);
        }
    }
}
