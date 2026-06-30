package cb;

/* loaded from: classes13.dex */
public final class g0 {
    public static cb.h0 a(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        long parseLong;
        java.lang.String string = sharedPreferences.getString(cb.p.d(str, "|P|"), null);
        java.lang.String string2 = sharedPreferences.getString(cb.p.d(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        java.security.KeyPair f17 = f(string, string2);
        java.lang.String string3 = sharedPreferences.getString(cb.p.d(str, "cre"), null);
        if (string3 != null) {
            try {
                parseLong = java.lang.Long.parseLong(string3);
            } catch (java.lang.NumberFormatException unused) {
            }
            return new cb.h0(f17, parseLong);
        }
        parseLong = 0;
        return new cb.h0(f17, parseLong);
    }

    public static cb.h0 b(java.io.File file) {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            java.util.Properties properties = new java.util.Properties();
            properties.load(fileInputStream);
            java.lang.String property = properties.getProperty("pub");
            java.lang.String property2 = properties.getProperty("pri");
            if (property != null && property2 != null) {
                try {
                    cb.h0 h0Var = new cb.h0(f(property, property2), java.lang.Long.parseLong(properties.getProperty("cre")));
                    fileInputStream.close();
                    return h0Var;
                } catch (java.lang.NumberFormatException e17) {
                    throw new cb.i0(e17);
                }
            }
            fileInputStream.close();
            return null;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                try {
                    fileInputStream.close();
                } catch (java.lang.Throwable th8) {
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc.zzh.zza(th6, th8);
                }
                throw th7;
            }
        }
    }

    public static void c(android.content.Context context, java.lang.String str, cb.h0 h0Var) {
        try {
            android.util.Log.isLoggable("FirebaseInstanceId", 3);
            java.io.File i17 = i(context, str);
            i17.createNewFile();
            java.util.Properties properties = new java.util.Properties();
            properties.setProperty("pub", android.util.Base64.encodeToString(h0Var.f121660a.getPublic().getEncoded(), 11));
            properties.setProperty("pri", android.util.Base64.encodeToString(h0Var.f121660a.getPrivate().getEncoded(), 11));
            properties.setProperty("cre", java.lang.String.valueOf(h0Var.f121661b));
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(i17);
            try {
                properties.store(fileOutputStream, (java.lang.String) null);
                fileOutputStream.close();
            } finally {
            }
        } catch (java.io.IOException e17) {
            new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 21);
        }
    }

    public static java.security.KeyPair f(java.lang.String str, java.lang.String str2) {
        try {
            byte[] decode = android.util.Base64.decode(str, 8);
            byte[] decode2 = android.util.Base64.decode(str2, 8);
            try {
                java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("RSA");
                return new java.security.KeyPair(keyFactory.generatePublic(new java.security.spec.X509EncodedKeySpec(decode)), keyFactory.generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(decode2)));
            } catch (java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException e17) {
                new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 19);
                throw new cb.i0(e17);
            }
        } catch (java.lang.IllegalArgumentException e18) {
            throw new cb.i0(e18);
        }
    }

    public static java.io.File i(android.content.Context context, java.lang.String str) {
        java.lang.String sb6;
        if (android.text.TextUtils.isEmpty(str)) {
            sb6 = "com.google.InstanceId.properties";
        } else {
            try {
                java.lang.String encodeToString = android.util.Base64.encodeToString(str.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), 11);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(encodeToString).length() + 33);
                sb7.append("com.google.InstanceId_");
                sb7.append(encodeToString);
                sb7.append(".properties");
                sb6 = sb7.toString();
            } catch (java.io.UnsupportedEncodingException e17) {
                throw new java.lang.AssertionError(e17);
            }
        }
        java.io.File m9711xb657be0f = b3.l.m9711xb657be0f(context);
        if (m9711xb657be0f == null || !m9711xb657be0f.isDirectory()) {
            m9711xb657be0f = context.getFilesDir();
        }
        return new java.io.File(m9711xb657be0f, sb6);
    }

    public final void d(android.content.Context context, java.lang.String str, cb.h0 h0Var) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (h0Var.m14588xb2c87fbf(a(sharedPreferences, str))) {
                return;
            }
        } catch (cb.i0 unused) {
        }
        android.util.Log.isLoggable("FirebaseInstanceId", 3);
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(cb.p.d(str, "|P|"), android.util.Base64.encodeToString(h0Var.f121660a.getPublic().getEncoded(), 11));
        edit.putString(cb.p.d(str, "|K|"), android.util.Base64.encodeToString(h0Var.f121660a.getPrivate().getEncoded(), 11));
        edit.putString(cb.p.d(str, "cre"), java.lang.String.valueOf(h0Var.f121661b));
        edit.commit();
    }

    public final cb.h0 e(android.content.Context context, java.lang.String str) {
        try {
            java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            cb.h0 h0Var = new cb.h0(keyPairGenerator.generateKeyPair(), java.lang.System.currentTimeMillis());
            try {
                cb.h0 g17 = g(context, str);
                if (g17 != null) {
                    android.util.Log.isLoggable("FirebaseInstanceId", 3);
                    return g17;
                }
            } catch (cb.i0 unused) {
            }
            android.util.Log.isLoggable("FirebaseInstanceId", 3);
            c(context, str, h0Var);
            d(context, str, h0Var);
            return h0Var;
        } catch (java.security.NoSuchAlgorithmException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    public final cb.h0 g(android.content.Context context, java.lang.String str) {
        cb.h0 h17;
        try {
            h17 = h(context, str);
        } catch (cb.i0 e17) {
            e = e17;
        }
        if (h17 != null) {
            d(context, str, h17);
            return h17;
        }
        e = null;
        try {
            cb.h0 a17 = a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
            if (a17 != null) {
                c(context, str, a17);
                return a17;
            }
        } catch (cb.i0 e18) {
            e = e18;
        }
        if (e == null) {
            return null;
        }
        throw e;
    }

    public final cb.h0 h(android.content.Context context, java.lang.String str) {
        java.io.File i17 = i(context, str);
        if (!i17.exists()) {
            return null;
        }
        try {
            return b(i17);
        } catch (java.io.IOException e17) {
            if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 40);
            }
            try {
                return b(i17);
            } catch (java.io.IOException e18) {
                new java.lang.StringBuilder(java.lang.String.valueOf(e18).length() + 45);
                throw new cb.i0(e18);
            }
        }
    }
}
