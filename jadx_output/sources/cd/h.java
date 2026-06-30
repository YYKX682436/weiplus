package cd;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.kinda.framework.app.KindaHKFingerprintImpl f40510c = new com.tencent.kinda.framework.app.KindaHKFingerprintImpl();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.kinda.framework.app.KindaFingerprintImpl f40511a = new com.tencent.kinda.framework.app.KindaFingerprintImpl();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.wallet_core.g f40512b;

    public final void a(cd.j walletType) {
        kotlin.jvm.internal.o.g(walletType, "walletType");
        if (cd.j.f40515g == walletType) {
            f40510c.cancelBioAuth();
        } else {
            ((nz2.o) gm0.j1.s(nz2.o.class)).cancel();
        }
    }

    public final com.tencent.kinda.gen.BioType b(cd.j walletType) {
        kotlin.jvm.internal.o.g(walletType, "walletType");
        return cd.j.f40515g == walletType ? f40510c.supportBioType() : this.f40511a.supportBioType();
    }
}
