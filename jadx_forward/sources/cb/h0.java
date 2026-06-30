package cb;

/* loaded from: classes13.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.security.KeyPair f121660a;

    /* renamed from: b, reason: collision with root package name */
    public final long f121661b;

    public h0(java.security.KeyPair keyPair, long j17) {
        this.f121660a = keyPair;
        this.f121661b = j17;
    }

    /* renamed from: equals */
    public final boolean m14588xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof cb.h0)) {
            return false;
        }
        cb.h0 h0Var = (cb.h0) obj;
        if (this.f121661b == h0Var.f121661b) {
            java.security.KeyPair keyPair = this.f121660a;
            java.security.PublicKey publicKey = keyPair.getPublic();
            java.security.KeyPair keyPair2 = h0Var.f121660a;
            if (publicKey.equals(keyPair2.getPublic()) && keyPair.getPrivate().equals(keyPair2.getPrivate())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public final int m14589x8cdac1b() {
        java.security.KeyPair keyPair = this.f121660a;
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(keyPair.getPublic(), keyPair.getPrivate(), java.lang.Long.valueOf(this.f121661b));
    }
}
