package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.RtcCertificatePem */
/* loaded from: classes6.dex */
public class C29848xe9b584a2 {

    /* renamed from: DEFAULT_EXPIRY */
    private static final long f75875x83a11511 = 2592000;

    /* renamed from: certificate */
    public final java.lang.String f75876x745f4197;

    /* renamed from: privateKey */
    public final java.lang.String f75877x902d6ddc;

    public C29848xe9b584a2(java.lang.String str, java.lang.String str2) {
        this.f75877x902d6ddc = str;
        this.f75876x745f4197 = str2;
    }

    /* renamed from: generateCertificate */
    public static org.p3371xd0ce3e8d.C29848xe9b584a2 m156242x81a248e2() {
        return m156246x125c034b(org.p3371xd0ce3e8d.C29834x4e84c600.KeyType.ECDSA, f75875x83a11511);
    }

    /* renamed from: nativeGenerateCertificate */
    private static native org.p3371xd0ce3e8d.C29848xe9b584a2 m156246x125c034b(org.p3371xd0ce3e8d.C29834x4e84c600.KeyType keyType, long j17);

    /* renamed from: getCertificate */
    public java.lang.String m156247x4e358861() {
        return this.f75876x745f4197;
    }

    /* renamed from: getPrivateKey */
    public java.lang.String m156248x7e6e25d2() {
        return this.f75877x902d6ddc;
    }

    /* renamed from: generateCertificate */
    public static org.p3371xd0ce3e8d.C29848xe9b584a2 m156244x81a248e2(org.p3371xd0ce3e8d.C29834x4e84c600.KeyType keyType) {
        return m156246x125c034b(keyType, f75875x83a11511);
    }

    /* renamed from: generateCertificate */
    public static org.p3371xd0ce3e8d.C29848xe9b584a2 m156243x81a248e2(long j17) {
        return m156246x125c034b(org.p3371xd0ce3e8d.C29834x4e84c600.KeyType.ECDSA, j17);
    }

    /* renamed from: generateCertificate */
    public static org.p3371xd0ce3e8d.C29848xe9b584a2 m156245x81a248e2(org.p3371xd0ce3e8d.C29834x4e84c600.KeyType keyType, long j17) {
        return m156246x125c034b(keyType, j17);
    }
}
