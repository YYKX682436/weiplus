package i51;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f369993a;

    /* renamed from: b, reason: collision with root package name */
    public final long f369994b;

    /* renamed from: c, reason: collision with root package name */
    public final long f369995c;

    /* renamed from: d, reason: collision with root package name */
    public final long f369996d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f369997e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f369998f;

    /* renamed from: g, reason: collision with root package name */
    public final long f369999g;

    /* renamed from: h, reason: collision with root package name */
    public long f370000h = -1;

    public a(int i17, long j17, long j18, long j19, java.lang.String str, boolean z17, long j27) {
        this.f369993a = i17;
        this.f369994b = j17;
        this.f369995c = j18;
        this.f369996d = j19;
        this.f369997e = str;
        this.f369998f = z17;
        this.f369999g = j27;
    }

    public static java.lang.String a(byte[] bArr, boolean z17) {
        if (bArr == null) {
            return null;
        }
        java.lang.String str = z17 ? "UTF8" : "Cp437";
        try {
            return new java.lang.String(bArr, str);
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.lang.RuntimeException("System doesn't support ".concat(str), e17);
        }
    }

    /* renamed from: equals */
    public boolean m134732xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i51.a.class != obj.getClass()) {
            return false;
        }
        i51.a aVar = (i51.a) obj;
        return this.f369995c == aVar.f369995c && this.f369993a == aVar.f369993a && this.f369994b == aVar.f369994b && android.text.TextUtils.equals(this.f369997e, aVar.f369997e) && this.f370000h == aVar.f370000h && this.f369999g == aVar.f369999g && this.f369998f == aVar.f369998f && this.f369996d == aVar.f369996d;
    }

    /* renamed from: hashCode */
    public int m134733x8cdac1b() {
        long j17 = this.f369995c;
        int i17 = (((((int) (j17 ^ (j17 >>> 32))) + 31) * 31) + this.f369993a) * 31;
        long j18 = this.f369994b;
        int i18 = i17 + ((int) (j18 ^ (j18 >>> 32)));
        java.lang.String str = this.f369997e;
        if (str != null) {
            i18 = (i18 * 31) + str.hashCode();
        }
        long j19 = this.f370000h;
        int i19 = ((i18 * 31) + ((int) (j19 ^ (j19 >>> 32)))) * 31;
        long j27 = this.f369999g;
        int i27 = (((i19 + ((int) (j27 ^ (j27 >>> 32)))) * 31) + (this.f369998f ? 1231 : 1237)) * 31;
        long j28 = this.f369996d;
        return i27 + ((int) ((j28 >>> 32) ^ j28));
    }
}
