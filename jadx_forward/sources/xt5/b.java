package xt5;

/* loaded from: classes15.dex */
public class b implements xt5.f {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    @Override // xt5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r14, xt5.e r15, int r16, android.os.CancellationSignal r17, xt5.c r18, android.os.Handler r19) {
        /*
            r13 = this;
            r0 = r14
            r1 = r15
            r2 = 0
            if (r1 != 0) goto L6
            goto L25
        L6:
            javax.crypto.Cipher r3 = r1.f538698b
            if (r3 == 0) goto L10
            xt5.k r1 = new xt5.k
            r1.<init>(r3)
            goto L26
        L10:
            java.security.Signature r3 = r1.f538697a
            if (r3 == 0) goto L1a
            xt5.k r1 = new xt5.k
            r1.<init>(r3)
            goto L26
        L1a:
            javax.crypto.Mac r1 = r1.f538699c
            if (r1 == 0) goto L25
            xt5.k r3 = new xt5.k
            r3.<init>(r1)
            r1 = r3
            goto L26
        L25:
            r1 = r2
        L26:
            xt5.a r3 = new xt5.a
            r4 = r18
            r3.<init>(r4, r14)
            java.lang.String r4 = "android.permission.USE_FINGERPRINT"
            int r4 = xt5.l.a(r14, r4)
            r5 = 0
            java.lang.String r6 = "Soter.FingerprintManagerCompatApi23"
            if (r4 == 0) goto L40
            java.lang.String r0 = "soter: permission check failed: authenticate"
            java.lang.Object[] r1 = new java.lang.Object[r5]
            zt5.h.b(r6, r0, r1)
            goto L8a
        L40:
            java.lang.String r4 = "fingerprint"
            java.lang.Object r0 = r14.getSystemService(r4)     // Catch: java.lang.SecurityException -> L83
            r7 = r0
            android.hardware.fingerprint.FingerprintManager r7 = (android.hardware.fingerprint.FingerprintManager) r7     // Catch: java.lang.SecurityException -> L83
            if (r7 == 0) goto L7b
            if (r1 != 0) goto L4e
            goto L6b
        L4e:
            javax.crypto.Cipher r0 = r1.f538703b     // Catch: java.lang.SecurityException -> L83
            if (r0 == 0) goto L58
            android.hardware.fingerprint.FingerprintManager$CryptoObject r2 = new android.hardware.fingerprint.FingerprintManager$CryptoObject     // Catch: java.lang.SecurityException -> L83
            r2.<init>(r0)     // Catch: java.lang.SecurityException -> L83
            goto L6b
        L58:
            java.security.Signature r0 = r1.f538702a     // Catch: java.lang.SecurityException -> L83
            if (r0 == 0) goto L62
            android.hardware.fingerprint.FingerprintManager$CryptoObject r2 = new android.hardware.fingerprint.FingerprintManager$CryptoObject     // Catch: java.lang.SecurityException -> L83
            r2.<init>(r0)     // Catch: java.lang.SecurityException -> L83
            goto L6b
        L62:
            javax.crypto.Mac r0 = r1.f538704c     // Catch: java.lang.SecurityException -> L83
            if (r0 == 0) goto L6b
            android.hardware.fingerprint.FingerprintManager$CryptoObject r2 = new android.hardware.fingerprint.FingerprintManager$CryptoObject     // Catch: java.lang.SecurityException -> L83
            r2.<init>(r0)     // Catch: java.lang.SecurityException -> L83
        L6b:
            r8 = r2
            xt5.i r11 = new xt5.i     // Catch: java.lang.SecurityException -> L83
            r11.<init>(r3)     // Catch: java.lang.SecurityException -> L83
            r9 = r17
            r10 = r16
            r12 = r19
            r7.authenticate(r8, r9, r10, r11, r12)     // Catch: java.lang.SecurityException -> L83
            goto L8a
        L7b:
            java.lang.String r0 = "soter: fingerprint manager is null in authenticate! Should never happen"
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.SecurityException -> L83
            zt5.h.b(r6, r0, r1)     // Catch: java.lang.SecurityException -> L83
            goto L8a
        L83:
            java.lang.String r0 = "soter: triggered SecurityException in authenticate! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml"
            java.lang.Object[] r1 = new java.lang.Object[r5]
            zt5.h.b(r6, r0, r1)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xt5.b.a(android.content.Context, xt5.e, int, android.os.CancellationSignal, xt5.c, android.os.Handler):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // xt5.f
    public boolean b(android.content.Context context) {
        int i17 = 0;
        i17 = 0;
        i17 = 0;
        if (xt5.l.a(context, "android.permission.USE_FINGERPRINT") != 0) {
            zt5.h.b("Soter.FingerprintManagerCompatApi23", "soter: permission check failed: hasEnrolledFingerprints", new java.lang.Object[0]);
        } else {
            try {
                android.hardware.fingerprint.FingerprintManager fingerprintManager = (android.hardware.fingerprint.FingerprintManager) context.getSystemService(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.f47003xb618721a);
                if (fingerprintManager != null) {
                    i17 = fingerprintManager.hasEnrolledFingerprints();
                } else {
                    zt5.h.b("Soter.FingerprintManagerCompatApi23", "soter: fingerprint manager is null in hasEnrolledFingerprints! Should never happen", new java.lang.Object[0]);
                }
            } catch (java.lang.SecurityException unused) {
                zt5.h.b("Soter.FingerprintManagerCompatApi23", "soter: triggered SecurityException in hasEnrolledFingerprints! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new java.lang.Object[i17]);
            }
        }
        return i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // xt5.f
    /* renamed from: isHardwareDetected */
    public boolean mo175965xa185b5d4(android.content.Context context) {
        int i17 = 0;
        i17 = 0;
        i17 = 0;
        if (xt5.l.a(context, "android.permission.USE_FINGERPRINT") != 0) {
            zt5.h.b("Soter.FingerprintManagerCompatApi23", "soter: permission check failed: isHardwareDetected", new java.lang.Object[0]);
        } else {
            try {
                android.hardware.fingerprint.FingerprintManager fingerprintManager = (android.hardware.fingerprint.FingerprintManager) context.getSystemService(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.f47003xb618721a);
                if (fingerprintManager != null) {
                    i17 = fingerprintManager.isHardwareDetected();
                } else {
                    zt5.h.b("Soter.FingerprintManagerCompatApi23", "soter: fingerprint manager is null in isHardwareDetected! Should never happen", new java.lang.Object[0]);
                }
            } catch (java.lang.SecurityException unused) {
                zt5.h.b("Soter.FingerprintManagerCompatApi23", "soter: triggered SecurityException in isHardwareDetected! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new java.lang.Object[i17]);
            }
        }
        return i17;
    }
}
