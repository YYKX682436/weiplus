package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* loaded from: classes13.dex */
public final class zzd {
    public static java.security.KeyPair zzk() {
        try {
            java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            return keyPairGenerator.generateKeyPair();
        } catch (java.security.NoSuchAlgorithmException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }
}
