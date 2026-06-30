package cw1;

/* loaded from: classes5.dex */
public final class v3 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f304902a;

    /* renamed from: b, reason: collision with root package name */
    public final int f304903b;

    /* renamed from: c, reason: collision with root package name */
    public final int f304904c;

    public v3(byte[] hash, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hash, "hash");
        this.f304902a = hash;
        this.f304903b = i17;
        this.f304904c = (hash[3] & 255) | (((i17 + 31) * 31) + ((hash[0] & 255) << 24)) | ((hash[1] & 255) << 16) | ((hash[2] & 255) << 8);
    }

    /* renamed from: equals */
    public boolean m122841xb2c87fbf(java.lang.Object obj) {
        cw1.v3 v3Var = obj instanceof cw1.v3 ? (cw1.v3) obj : null;
        return v3Var != null && this.f304903b == v3Var.f304903b && java.util.Arrays.equals(this.f304902a, v3Var.f304902a);
    }

    /* renamed from: hashCode */
    public int m122842x8cdac1b() {
        return this.f304904c;
    }
}
