package v95;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f515702a;

    /* renamed from: b, reason: collision with root package name */
    public final long f515703b;

    /* renamed from: c, reason: collision with root package name */
    public final long f515704c;

    /* renamed from: d, reason: collision with root package name */
    public final long f515705d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f515706e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f515707f;

    /* renamed from: g, reason: collision with root package name */
    public final long f515708g;

    /* renamed from: h, reason: collision with root package name */
    public long f515709h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f515710i;

    public a(int i17, long j17, long j18, long j19, byte[] bArr, boolean z17, long j27, boolean z18) {
        this.f515702a = i17;
        this.f515703b = j17;
        this.f515704c = j18;
        this.f515705d = j19;
        byte[] bArr2 = bArr == null ? null : (byte[]) bArr.clone();
        this.f515706e = bArr2;
        this.f515707f = z17;
        this.f515708g = j27;
        java.lang.String str = z17 ? "UTF8" : "Cp437";
        try {
            this.f515710i = new java.lang.String(bArr2, str);
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.lang.RuntimeException("System doesn't support ".concat(str), e17);
        }
    }

    /* renamed from: equals */
    public boolean m171328xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v95.a.class != obj.getClass()) {
            return false;
        }
        v95.a aVar = (v95.a) obj;
        return this.f515704c == aVar.f515704c && this.f515702a == aVar.f515702a && this.f515703b == aVar.f515703b && java.util.Arrays.equals(this.f515706e, aVar.f515706e) && this.f515709h == aVar.f515709h && this.f515708g == aVar.f515708g && this.f515707f == aVar.f515707f && this.f515705d == aVar.f515705d;
    }

    /* renamed from: hashCode */
    public int m171329x8cdac1b() {
        long j17 = this.f515704c;
        int i17 = (((((int) (j17 ^ (j17 >>> 32))) + 31) * 31) + this.f515702a) * 31;
        long j18 = this.f515703b;
        int hashCode = (((i17 + ((int) (j18 ^ (j18 >>> 32)))) * 31) + java.util.Arrays.hashCode(this.f515706e)) * 31;
        long j19 = this.f515709h;
        int i18 = (hashCode + ((int) (j19 ^ (j19 >>> 32)))) * 31;
        long j27 = this.f515708g;
        int i19 = (((i18 + ((int) (j27 ^ (j27 >>> 32)))) * 31) + (this.f515707f ? 1231 : 1237)) * 31;
        long j28 = this.f515705d;
        return i19 + ((int) ((j28 >>> 32) ^ j28));
    }
}
