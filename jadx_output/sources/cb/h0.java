package cb;

/* loaded from: classes13.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.security.KeyPair f40127a;

    /* renamed from: b, reason: collision with root package name */
    public final long f40128b;

    public h0(java.security.KeyPair keyPair, long j17) {
        this.f40127a = keyPair;
        this.f40128b = j17;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof cb.h0)) {
            return false;
        }
        cb.h0 h0Var = (cb.h0) obj;
        if (this.f40128b == h0Var.f40128b) {
            java.security.KeyPair keyPair = this.f40127a;
            java.security.PublicKey publicKey = keyPair.getPublic();
            java.security.KeyPair keyPair2 = h0Var.f40127a;
            if (publicKey.equals(keyPair2.getPublic()) && keyPair.getPrivate().equals(keyPair2.getPrivate())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.security.KeyPair keyPair = this.f40127a;
        return com.google.android.gms.common.internal.Objects.hashCode(keyPair.getPublic(), keyPair.getPrivate(), java.lang.Long.valueOf(this.f40128b));
    }
}
