package cc1;

/* loaded from: classes7.dex */
public final class m {
    public m(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final synchronized java.security.KeyStore a() {
        java.security.KeyStore keyStore = cc1.p.f121981n;
        if (keyStore != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(keyStore);
            return keyStore;
        }
        java.security.KeyStore keyStore2 = java.security.KeyStore.getInstance("AndroidKeyStore");
        keyStore2.load(null);
        cc1.p.f121981n = keyStore2;
        return keyStore2;
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, java.lang.String wxaKeyAlias) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaKeyAlias, "wxaKeyAlias");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String mo48798x74292566 = env.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        sb6.append("com.tencent.mm.plugin.appbrand.jsapi.crypto." + mo48798x74292566 + ".key.");
        sb6.append(wxaKeyAlias);
        return sb6.toString();
    }

    public final java.security.KeyStore.Entry c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, java.lang.String keyAlias) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyAlias, "keyAlias");
        java.security.KeyStore.Entry entry = a().getEntry(b(env, keyAlias), null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entry, "getEntry(...)");
        return entry;
    }

    public final java.util.List d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        java.security.KeyStore a17 = a();
        java.lang.String mo48798x74292566 = env.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        java.lang.String str2 = "com.tencent.mm.plugin.appbrand.jsapi.crypto." + mo48798x74292566 + ".key.";
        java.util.Enumeration<java.lang.String> aliases = a17.aliases();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(aliases, "aliases(...)");
        java.util.ArrayList<java.lang.String> list = java.util.Collections.list(aliases);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (java.lang.String str3 : list) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            if (r26.i0.y(str3, str2, false)) {
                str = str3.substring(str2.length());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return kz5.n0.V(arrayList);
    }

    public final java.security.KeyStore.PrivateKeyEntry e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, java.lang.String keyAlias) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyAlias, "keyAlias");
        java.security.KeyStore.Entry c17 = c(env, keyAlias);
        if (c17 instanceof java.security.KeyStore.PrivateKeyEntry) {
            return (java.security.KeyStore.PrivateKeyEntry) c17;
        }
        throw new cc1.n(-1, "fail:keyalias not mapped to private key");
    }

    public final java.security.PrivateKey f(java.lang.String algorithm, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(algorithm, "algorithm");
        java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance(algorithm);
        if (obj instanceof java.nio.ByteBuffer) {
            java.security.PrivateKey generatePrivate = keyFactory.generatePrivate(new java.security.spec.X509EncodedKeySpec(ik1.f.a((java.nio.ByteBuffer) obj)));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(generatePrivate);
            return generatePrivate;
        }
        if (!(obj instanceof java.lang.String)) {
            throw new java.lang.IllegalArgumentException();
        }
        byte[] bytes = ((java.lang.String) obj).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.security.PrivateKey generatePrivate2 = keyFactory.generatePrivate(new java.security.spec.X509EncodedKeySpec(bytes));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(generatePrivate2);
        return generatePrivate2;
    }

    public final java.security.PublicKey g(java.lang.String algorithm, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(algorithm, "algorithm");
        java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance(algorithm);
        if (obj instanceof java.nio.ByteBuffer) {
            java.security.PublicKey generatePublic = keyFactory.generatePublic(new java.security.spec.X509EncodedKeySpec(ik1.f.a((java.nio.ByteBuffer) obj)));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(generatePublic);
            return generatePublic;
        }
        if (!(obj instanceof java.lang.String)) {
            throw new java.lang.IllegalArgumentException();
        }
        byte[] bytes = ((java.lang.String) obj).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.security.PublicKey generatePublic2 = keyFactory.generatePublic(new java.security.spec.X509EncodedKeySpec(bytes));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(generatePublic2);
        return generatePublic2;
    }
}
