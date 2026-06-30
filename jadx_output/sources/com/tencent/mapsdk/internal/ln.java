package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ln {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f50334a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.lg<java.lang.String, java.lang.String> f50335b = new com.tencent.mapsdk.internal.lg<>(1000);

    /* renamed from: c, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.lk.g<com.tencent.mapsdk.internal.lk.i<java.security.MessageDigest>> f50336c = com.tencent.mapsdk.internal.lk.a(10, new com.tencent.mapsdk.internal.lk.e<com.tencent.mapsdk.internal.lk.i<java.security.MessageDigest>>() { // from class: com.tencent.mapsdk.internal.ln.1
        private static com.tencent.mapsdk.internal.lk.i<java.security.MessageDigest> b() {
            try {
                return new com.tencent.mapsdk.internal.lk.i<>(java.security.MessageDigest.getInstance("SHA-256"));
            } catch (java.security.NoSuchAlgorithmException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }

        @Override // com.tencent.mapsdk.internal.lk.e
        public final /* synthetic */ com.tencent.mapsdk.internal.lk.i<java.security.MessageDigest> a() {
            return b();
        }
    });

    public final java.lang.String a(java.lang.String str) {
        java.lang.String b17;
        synchronized (this.f50335b) {
            b17 = this.f50335b.b((com.tencent.mapsdk.internal.lg<java.lang.String, java.lang.String>) str);
        }
        if (b17 == null) {
            com.tencent.mapsdk.internal.lk.i<java.security.MessageDigest> a17 = this.f50336c.a();
            try {
                a17.f50323a.update(str.getBytes());
                byte[] digest = a17.f50323a.digest();
                if (digest == null || digest.length == 0) {
                    b17 = null;
                } else {
                    char[] cArr = new char[digest.length * 2];
                    for (int i17 = 0; i17 < digest.length; i17++) {
                        byte b18 = digest[i17];
                        int i18 = i17 * 2;
                        char[] cArr2 = f50334a;
                        cArr[i18 + 1] = cArr2[b18 & 15];
                        cArr[i18 + 0] = cArr2[((byte) (b18 >>> 4)) & 15];
                    }
                    b17 = new java.lang.String(cArr);
                }
            } finally {
                this.f50336c.a(a17);
            }
        }
        synchronized (this.f50335b) {
            this.f50335b.a(str, b17);
        }
        return b17;
    }

    private static java.lang.String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i17 = 0; i17 < bArr.length; i17++) {
            byte b17 = bArr[i17];
            int i18 = i17 * 2;
            char[] cArr2 = f50334a;
            cArr[i18 + 1] = cArr2[b17 & 15];
            cArr[i18 + 0] = cArr2[((byte) (b17 >>> 4)) & 15];
        }
        return new java.lang.String(cArr);
    }
}
