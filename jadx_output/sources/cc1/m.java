package cc1;

/* loaded from: classes7.dex */
public final class m {
    public m(kotlin.jvm.internal.i iVar) {
    }

    public final synchronized java.security.KeyStore a() {
        java.security.KeyStore keyStore = cc1.p.f40448n;
        if (keyStore != null) {
            kotlin.jvm.internal.o.d(keyStore);
            return keyStore;
        }
        java.security.KeyStore keyStore2 = java.security.KeyStore.getInstance("AndroidKeyStore");
        keyStore2.load(null);
        cc1.p.f40448n = keyStore2;
        return keyStore2;
    }

    public final java.lang.String b(com.tencent.mm.plugin.appbrand.jsapi.l env, java.lang.String wxaKeyAlias) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(wxaKeyAlias, "wxaKeyAlias");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String appId = env.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        sb6.append("com.tencent.mm.plugin.appbrand.jsapi.crypto." + appId + ".key.");
        sb6.append(wxaKeyAlias);
        return sb6.toString();
    }

    public final java.security.KeyStore.Entry c(com.tencent.mm.plugin.appbrand.jsapi.l env, java.lang.String keyAlias) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(keyAlias, "keyAlias");
        java.security.KeyStore.Entry entry = a().getEntry(b(env, keyAlias), null);
        kotlin.jvm.internal.o.f(entry, "getEntry(...)");
        return entry;
    }

    public final java.util.List d(com.tencent.mm.plugin.appbrand.jsapi.l env) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(env, "env");
        java.security.KeyStore a17 = a();
        java.lang.String appId = env.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        java.lang.String str2 = "com.tencent.mm.plugin.appbrand.jsapi.crypto." + appId + ".key.";
        java.util.Enumeration<java.lang.String> aliases = a17.aliases();
        kotlin.jvm.internal.o.f(aliases, "aliases(...)");
        java.util.ArrayList<java.lang.String> list = java.util.Collections.list(aliases);
        kotlin.jvm.internal.o.f(list, "list(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (java.lang.String str3 : list) {
            kotlin.jvm.internal.o.d(str3);
            if (r26.i0.y(str3, str2, false)) {
                str = str3.substring(str2.length());
                kotlin.jvm.internal.o.f(str, "substring(...)");
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return kz5.n0.V(arrayList);
    }

    public final java.security.KeyStore.PrivateKeyEntry e(com.tencent.mm.plugin.appbrand.jsapi.l env, java.lang.String keyAlias) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(keyAlias, "keyAlias");
        java.security.KeyStore.Entry c17 = c(env, keyAlias);
        if (c17 instanceof java.security.KeyStore.PrivateKeyEntry) {
            return (java.security.KeyStore.PrivateKeyEntry) c17;
        }
        throw new cc1.n(-1, "fail:keyalias not mapped to private key");
    }

    public final java.security.PrivateKey f(java.lang.String algorithm, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(algorithm, "algorithm");
        java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance(algorithm);
        if (obj instanceof java.nio.ByteBuffer) {
            java.security.PrivateKey generatePrivate = keyFactory.generatePrivate(new java.security.spec.X509EncodedKeySpec(ik1.f.a((java.nio.ByteBuffer) obj)));
            kotlin.jvm.internal.o.d(generatePrivate);
            return generatePrivate;
        }
        if (!(obj instanceof java.lang.String)) {
            throw new java.lang.IllegalArgumentException();
        }
        byte[] bytes = ((java.lang.String) obj).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.security.PrivateKey generatePrivate2 = keyFactory.generatePrivate(new java.security.spec.X509EncodedKeySpec(bytes));
        kotlin.jvm.internal.o.d(generatePrivate2);
        return generatePrivate2;
    }

    public final java.security.PublicKey g(java.lang.String algorithm, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(algorithm, "algorithm");
        java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance(algorithm);
        if (obj instanceof java.nio.ByteBuffer) {
            java.security.PublicKey generatePublic = keyFactory.generatePublic(new java.security.spec.X509EncodedKeySpec(ik1.f.a((java.nio.ByteBuffer) obj)));
            kotlin.jvm.internal.o.d(generatePublic);
            return generatePublic;
        }
        if (!(obj instanceof java.lang.String)) {
            throw new java.lang.IllegalArgumentException();
        }
        byte[] bytes = ((java.lang.String) obj).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.security.PublicKey generatePublic2 = keyFactory.generatePublic(new java.security.spec.X509EncodedKeySpec(bytes));
        kotlin.jvm.internal.o.d(generatePublic2);
        return generatePublic2;
    }
}
