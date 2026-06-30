package xt5;

/* loaded from: classes15.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.security.Signature f538702a;

    /* renamed from: b, reason: collision with root package name */
    public final javax.crypto.Cipher f538703b;

    /* renamed from: c, reason: collision with root package name */
    public final javax.crypto.Mac f538704c;

    public k(java.security.Signature signature) {
        this.f538702a = signature;
        this.f538703b = null;
        this.f538704c = null;
    }

    public k(javax.crypto.Cipher cipher) {
        this.f538703b = cipher;
        this.f538702a = null;
        this.f538704c = null;
    }

    public k(javax.crypto.Mac mac) {
        this.f538704c = mac;
        this.f538703b = null;
        this.f538702a = null;
    }
}
