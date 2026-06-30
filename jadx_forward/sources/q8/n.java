package q8;

/* loaded from: classes15.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f442175a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f442176b;

    /* renamed from: c, reason: collision with root package name */
    public final int f442177c;

    /* renamed from: d, reason: collision with root package name */
    public final int f442178d;

    public n(int i17, byte[] bArr, int i18, int i19) {
        this.f442175a = i17;
        this.f442176b = bArr;
        this.f442177c = i18;
        this.f442178d = i19;
    }

    /* renamed from: equals */
    public boolean m159590xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q8.n.class != obj.getClass()) {
            return false;
        }
        q8.n nVar = (q8.n) obj;
        return this.f442175a == nVar.f442175a && this.f442177c == nVar.f442177c && this.f442178d == nVar.f442178d && java.util.Arrays.equals(this.f442176b, nVar.f442176b);
    }

    /* renamed from: hashCode */
    public int m159591x8cdac1b() {
        return (((((this.f442175a * 31) + java.util.Arrays.hashCode(this.f442176b)) * 31) + this.f442177c) * 31) + this.f442178d;
    }
}
