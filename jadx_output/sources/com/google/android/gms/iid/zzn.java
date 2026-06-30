package com.google.android.gms.iid;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzn {
    private static com.google.android.gms.iid.zzo zzd(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        java.lang.String string = sharedPreferences.getString(com.google.android.gms.iid.zzak.zzh(str, "|P|"), null);
        java.lang.String string2 = sharedPreferences.getString(com.google.android.gms.iid.zzak.zzh(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new com.google.android.gms.iid.zzo(zzg(string, string2), zze(sharedPreferences, str));
    }

    private static long zze(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        java.lang.String string = sharedPreferences.getString(com.google.android.gms.iid.zzak.zzh(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return java.lang.Long.parseLong(string);
        } catch (java.lang.NumberFormatException unused) {
            return 0L;
        }
    }

    private static java.security.KeyPair zzg(java.lang.String str, java.lang.String str2) {
        try {
            byte[] decode = android.util.Base64.decode(str, 8);
            byte[] decode2 = android.util.Base64.decode(str2, 8);
            try {
                java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("RSA");
                return new java.security.KeyPair(keyFactory.generatePublic(new java.security.spec.X509EncodedKeySpec(decode)), keyFactory.generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(decode2)));
            } catch (java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException e17) {
                new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 19);
                throw new com.google.android.gms.iid.zzp(e17);
            }
        } catch (java.lang.IllegalArgumentException e18) {
            throw new com.google.android.gms.iid.zzp(e18);
        }
    }

    private final com.google.android.gms.iid.zzo zzh(android.content.Context context, java.lang.String str) {
        com.google.android.gms.iid.zzo zzi;
        try {
            zzi = zzi(context, str);
        } catch (com.google.android.gms.iid.zzp e17) {
            e = e17;
        }
        if (zzi != null) {
            zze(context, str, zzi);
            return zzi;
        }
        e = null;
        try {
            com.google.android.gms.iid.zzo zzd = zzd(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
            if (zzd != null) {
                zzd(context, str, zzd);
                return zzd;
            }
        } catch (com.google.android.gms.iid.zzp e18) {
            e = e18;
        }
        if (e == null) {
            return null;
        }
        throw e;
    }

    private final com.google.android.gms.iid.zzo zzi(android.content.Context context, java.lang.String str) {
        java.io.File zzj = zzj(context, str);
        if (!zzj.exists()) {
            return null;
        }
        try {
            return zzd(zzj);
        } catch (java.io.IOException e17) {
            if (android.util.Log.isLoggable("InstanceID", 3)) {
                new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 40);
            }
            try {
                return zzd(zzj);
            } catch (java.io.IOException e18) {
                new java.lang.StringBuilder(java.lang.String.valueOf(e18).length() + 45);
                throw new com.google.android.gms.iid.zzp(e18);
            }
        }
    }

    private static java.io.File zzj(android.content.Context context) {
        java.io.File noBackupFilesDir = b3.l.getNoBackupFilesDir(context);
        return (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) ? context.getFilesDir() : noBackupFilesDir;
    }

    public final com.google.android.gms.iid.zzo zzf(android.content.Context context, java.lang.String str) {
        com.google.android.gms.iid.zzo zzoVar = new com.google.android.gms.iid.zzo(com.google.android.gms.iid.zzd.zzk(), java.lang.System.currentTimeMillis());
        try {
            com.google.android.gms.iid.zzo zzh = zzh(context, str);
            if (zzh != null) {
                android.util.Log.isLoggable("InstanceID", 3);
                return zzh;
            }
        } catch (com.google.android.gms.iid.zzp unused) {
        }
        android.util.Log.isLoggable("InstanceID", 3);
        zzd(context, str, zzoVar);
        zze(context, str, zzoVar);
        return zzoVar;
    }

    private static com.google.android.gms.iid.zzo zzd(java.io.File file) {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            java.util.Properties properties = new java.util.Properties();
            properties.load(fileInputStream);
            java.lang.String property = properties.getProperty("pub");
            java.lang.String property2 = properties.getProperty("pri");
            if (property != null && property2 != null) {
                try {
                    com.google.android.gms.iid.zzo zzoVar = new com.google.android.gms.iid.zzo(zzg(property, property2), java.lang.Long.parseLong(properties.getProperty("cre")));
                    zzd((java.lang.Throwable) null, fileInputStream);
                    return zzoVar;
                } catch (java.lang.NumberFormatException e17) {
                    throw new com.google.android.gms.iid.zzp(e17);
                }
            }
            zzd((java.lang.Throwable) null, fileInputStream);
            return null;
        } finally {
        }
    }

    public static void zzg(android.content.Context context, java.lang.String str) {
        java.io.File zzj = zzj(context, str);
        if (zzj.exists()) {
            zzj.delete();
        }
    }

    public static void zzi(android.content.Context context) {
        for (java.io.File file : zzj(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    private static java.io.File zzj(android.content.Context context, java.lang.String str) {
        java.lang.String sb6;
        if (android.text.TextUtils.isEmpty(str)) {
            sb6 = "com.google.InstanceId.properties";
        } else {
            try {
                java.lang.String encodeToString = android.util.Base64.encodeToString(str.getBytes(com.tencent.mapsdk.internal.rv.f51270c), 11);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(encodeToString).length() + 33);
                sb7.append("com.google.InstanceId_");
                sb7.append(encodeToString);
                sb7.append(".properties");
                sb6 = sb7.toString();
            } catch (java.io.UnsupportedEncodingException e17) {
                throw new java.lang.AssertionError(e17);
            }
        }
        return new java.io.File(zzj(context), sb6);
    }

    public final com.google.android.gms.iid.zzo zze(android.content.Context context, java.lang.String str) {
        com.google.android.gms.iid.zzo zzh = zzh(context, str);
        return zzh != null ? zzh : zzf(context, str);
    }

    private static void zzd(android.content.Context context, java.lang.String str, com.google.android.gms.iid.zzo zzoVar) {
        java.lang.String zzo;
        java.lang.String zzp;
        long j17;
        try {
            android.util.Log.isLoggable("InstanceID", 3);
            java.io.File zzj = zzj(context, str);
            zzj.createNewFile();
            java.util.Properties properties = new java.util.Properties();
            zzo = zzoVar.zzo();
            properties.setProperty("pub", zzo);
            zzp = zzoVar.zzp();
            properties.setProperty("pri", zzp);
            j17 = zzoVar.zzbx;
            properties.setProperty("cre", java.lang.String.valueOf(j17));
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(zzj);
            try {
                properties.store(fileOutputStream, (java.lang.String) null);
                zzd((java.lang.Throwable) null, fileOutputStream);
            } finally {
            }
        } catch (java.io.IOException e17) {
            new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 21);
        }
    }

    private final void zze(android.content.Context context, java.lang.String str, com.google.android.gms.iid.zzo zzoVar) {
        java.lang.String zzo;
        java.lang.String zzp;
        long j17;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (zzoVar.equals(zzd(sharedPreferences, str))) {
                return;
            }
        } catch (com.google.android.gms.iid.zzp unused) {
        }
        android.util.Log.isLoggable("InstanceID", 3);
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        java.lang.String zzh = com.google.android.gms.iid.zzak.zzh(str, "|P|");
        zzo = zzoVar.zzo();
        edit.putString(zzh, zzo);
        java.lang.String zzh2 = com.google.android.gms.iid.zzak.zzh(str, "|K|");
        zzp = zzoVar.zzp();
        edit.putString(zzh2, zzp);
        java.lang.String zzh3 = com.google.android.gms.iid.zzak.zzh(str, "cre");
        j17 = zzoVar.zzbx;
        edit.putString(zzh3, java.lang.String.valueOf(j17));
        edit.commit();
    }

    private static /* synthetic */ void zzd(java.lang.Throwable th6, java.io.FileInputStream fileInputStream) {
        if (th6 == null) {
            fileInputStream.close();
            return;
        }
        try {
            fileInputStream.close();
        } catch (java.lang.Throwable th7) {
            com.google.android.gms.internal.gcm.zzf.zzd(th6, th7);
        }
    }

    private static /* synthetic */ void zzd(java.lang.Throwable th6, java.io.FileOutputStream fileOutputStream) {
        if (th6 == null) {
            fileOutputStream.close();
            return;
        }
        try {
            fileOutputStream.close();
        } catch (java.lang.Throwable th7) {
            com.google.android.gms.internal.gcm.zzf.zzd(th6, th7);
        }
    }
}
