package xt5;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.security.Signature f538697a;

    /* renamed from: b, reason: collision with root package name */
    public final javax.crypto.Cipher f538698b;

    /* renamed from: c, reason: collision with root package name */
    public final javax.crypto.Mac f538699c;

    public e(java.security.Signature signature) {
        this.f538697a = signature;
        this.f538698b = null;
        this.f538699c = null;
    }

    public e(javax.crypto.Cipher cipher) {
        this.f538698b = cipher;
        this.f538697a = null;
        this.f538699c = null;
    }

    public e(javax.crypto.Mac mac) {
        this.f538699c = mac;
        this.f538698b = null;
        this.f538697a = null;
    }
}
