package yt5;

/* loaded from: classes7.dex */
public class b extends yt5.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.security.keystore.KeyGenParameterSpec.Builder f547285a;

    public b(java.lang.String str, int i17) {
        super(str, i17);
        this.f547285a = null;
        this.f547285a = new android.security.keystore.KeyGenParameterSpec.Builder(str, i17);
    }

    @Override // yt5.c
    public java.security.spec.AlgorithmParameterSpec a() {
        return this.f547285a.build();
    }

    @Override // yt5.c
    public yt5.c c(java.lang.String... strArr) {
        this.f547285a.setDigests(strArr);
        return this;
    }

    @Override // yt5.c
    public yt5.c d(java.lang.String... strArr) {
        this.f547285a.setSignaturePaddings(strArr);
        return this;
    }

    @Override // yt5.c
    public yt5.c e(boolean z17) {
        this.f547285a.setUserAuthenticationRequired(z17);
        return this;
    }
}
