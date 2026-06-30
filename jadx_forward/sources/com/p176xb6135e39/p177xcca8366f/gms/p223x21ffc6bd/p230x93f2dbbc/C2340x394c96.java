package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzka */
/* loaded from: classes16.dex */
public final class C2340x394c96 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40 {

    /* renamed from: zzard */
    private static final java.lang.String[] f7034x6f02313 = {"firebase_", "google_", "ga_"};

    /* renamed from: zzare */
    private java.security.SecureRandom f7035x6f02314;

    /* renamed from: zzarf */
    private final java.util.concurrent.atomic.AtomicLong f7036x6f02315;

    /* renamed from: zzarg */
    private int f7037x6f02316;

    /* renamed from: zzarh */
    private java.lang.Integer f7038x6f02317;

    public C2340x394c96(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        super(c2247x394c25);
        this.f7038x6f02317 = null;
        this.f7036x6f02315 = new java.util.concurrent.atomic.AtomicLong(0L);
    }

    /* renamed from: getMessageDigest */
    public static java.security.MessageDigest m19279x4657e4f5(java.lang.String str) {
        java.security.MessageDigest messageDigest;
        for (int i17 = 0; i17 < 2; i17++) {
            try {
                messageDigest = java.security.MessageDigest.getInstance(str);
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static java.lang.Object zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3 c2353x394ca3, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4 zza = zza(c2353x394ca3, str);
        if (zza == null) {
            return null;
        }
        java.lang.String str2 = zza.f7096x6f0221d;
        if (str2 != null) {
            return str2;
        }
        java.lang.Long l17 = zza.f7099x6f02352;
        if (l17 != null) {
            return l17;
        }
        java.lang.Double d17 = zza.f7098x6f02312;
        if (d17 != null) {
            return d17;
        }
        return null;
    }

    public static long zzc(byte[] bArr) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(bArr);
        int i17 = 0;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18220xe071d469(bArr.length > 0);
        long j17 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j17 += (bArr[length] & 255) << i17;
            i17 += 8;
        }
        return j17;
    }

    /* renamed from: zzcc */
    public static boolean m19280x394ba0(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: zzch */
    private static int m19281x394ba5(java.lang.String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    /* renamed from: zzci */
    public static boolean m19282x394ba6(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: zzck */
    public static boolean m19283x394ba8(java.lang.String str) {
        return str != null && str.matches("(\\+|-)?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: zzcl */
    public static boolean m19284x394ba9(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case 94660:
                if (str.equals("_in")) {
                    c17 = 0;
                    break;
                }
                break;
            case 95025:
                if (str.equals("_ug")) {
                    c17 = 1;
                    break;
                }
                break;
            case 95027:
                if (str.equals("_ui")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    private final boolean zze(android.content.Context context, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19108x394c64;
        java.lang.String str2;
        android.content.pm.Signature[] signatureArr;
        javax.security.auth.x500.X500Principal x500Principal = new javax.security.auth.x500.X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            android.content.pm.PackageInfo m18639xffec0de = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(context).m18639xffec0de(str, 64);
            if (m18639xffec0de == null || (signatureArr = m18639xffec0de.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            e = e17;
            m19108x394c64 = mo18976x394c1e().m19108x394c64();
            str2 = "Package name not found";
            m19108x394c64.zzg(str2, e);
            return true;
        } catch (java.security.cert.CertificateException e18) {
            e = e18;
            m19108x394c64 = mo18976x394c1e().m19108x394c64();
            str2 = "Error obtaining certificate";
            m19108x394c64.zzg(str2, e);
            return true;
        }
    }

    public static java.lang.Object zzf(java.lang.Object obj) {
        java.io.ObjectInputStream objectInputStream;
        java.io.ObjectOutputStream objectOutputStream;
        try {
            if (obj == null) {
                return null;
            }
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(obj);
                    objectOutputStream.flush();
                    objectInputStream = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    try {
                        java.lang.Object readObject = objectInputStream.readObject();
                        objectOutputStream.close();
                        objectInputStream.close();
                        return readObject;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    objectInputStream = null;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                objectInputStream = null;
                objectOutputStream = null;
            }
        } catch (java.io.IOException | java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    private final boolean zzr(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            mo18976x394c1e().m19108x394c64().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            mo18976x394c1e().m19108x394c64().zzg("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!java.lang.Character.isLetter(codePointAt) && codePointAt != 95) {
            mo18976x394c1e().m19108x394c64().zze("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = java.lang.Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !java.lang.Character.isLetterOrDigit(codePointAt2)) {
                mo18976x394c1e().m19108x394c64().zze("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += java.lang.Character.charCount(codePointAt2);
        }
        return true;
    }

    public static boolean zzs(java.lang.String str, java.lang.String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: getContext */
    public final /* bridge */ /* synthetic */ android.content.Context mo18960x76847179() {
        return super.mo18960x76847179();
    }

    public final android.os.Bundle zza(android.net.Uri uri) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            if (android.text.TextUtils.isEmpty(str) && android.text.TextUtils.isEmpty(str2) && android.text.TextUtils.isEmpty(str3) && android.text.TextUtils.isEmpty(str4)) {
                return null;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            if (!android.text.TextUtils.isEmpty(str)) {
                bundle.putString(ya.b.f77465x264ef110, str);
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                bundle.putString(ya.b.f77502x92235c1b, str2);
            }
            if (!android.text.TextUtils.isEmpty(str3)) {
                bundle.putString(ya.b.f77490x87518375, str3);
            }
            if (!android.text.TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            java.lang.String queryParameter = uri.getQueryParameter("utm_term");
            if (!android.text.TextUtils.isEmpty(queryParameter)) {
                bundle.putString(ya.b.f77505x273c6c, queryParameter);
            }
            java.lang.String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!android.text.TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            java.lang.String queryParameter3 = uri.getQueryParameter(ya.b.f77463x3b39305);
            if (!android.text.TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(ya.b.f77463x3b39305, queryParameter3);
            }
            java.lang.String queryParameter4 = uri.getQueryParameter(ya.b.CP1);
            if (!android.text.TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(ya.b.CP1, queryParameter4);
            }
            java.lang.String queryParameter5 = uri.getQueryParameter("anid");
            if (!android.text.TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (java.lang.UnsupportedOperationException e17) {
            mo18976x394c1e().m19111x394c67().zzg("Install referrer url isn't a hierarchical URI", e17);
            return null;
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzab */
    public final /* bridge */ /* synthetic */ void mo18961x394b61() {
        super.mo18961x394b61();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzbt */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee mo18962x394b92() {
        return super.mo18962x394b92();
    }

    /* renamed from: zzcd */
    public final int m19285x394ba1(java.lang.String str) {
        if (!zzr("event", str)) {
            return 2;
        }
        if (zza("event", com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Event.f7356x6f02156, str)) {
            return !zza("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    /* renamed from: zzce */
    public final int m19286x394ba2(java.lang.String str) {
        if (!zzq("user property", str)) {
            return 6;
        }
        if (zza("user property", com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.UserProperty.f7364x6f0215f, str)) {
            return !zza("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    /* renamed from: zzcf */
    public final int m19287x394ba3(java.lang.String str) {
        if (!zzr("user property", str)) {
            return 6;
        }
        if (zza("user property", com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.UserProperty.f7364x6f0215f, str)) {
            return !zza("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    /* renamed from: zzcg */
    public final boolean m19288x394ba4(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            mo18976x394c1e().m19108x394c64().log("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        mo18976x394c1e().m19108x394c64().zzg("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", str);
        return false;
    }

    /* renamed from: zzcj */
    public final boolean m19289x394ba7(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return mo18978x394c20().m19035x394c42().equals(str);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0067 -> B:8:0x0074). Please report as a decompilation issue!!! */
    public final long zzd(android.content.Context context, java.lang.String str) {
        mo18961x394b61();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.security.MessageDigest m19279x4657e4f5 = m19279x4657e4f5("MD5");
        long j17 = -1;
        if (m19279x4657e4f5 == null) {
            mo18976x394c1e().m19108x394c64().log("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                    mo18976x394c1e().m19108x394c64().zzg("Package name not found", e17);
                }
                if (!zze(context, str)) {
                    android.content.pm.Signature[] signatureArr = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(context).m18639xffec0de(mo18960x76847179().getPackageName(), 64).signatures;
                    if (signatureArr == null || signatureArr.length <= 0) {
                        mo18976x394c1e().m19111x394c67().log("Could not get signatures");
                    } else {
                        j17 = zzc(m19279x4657e4f5.digest(signatureArr[0].toByteArray()));
                    }
                }
            }
            j17 = 0;
        }
        return j17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfr */
    public final /* bridge */ /* synthetic */ void mo18963x394c0c() {
        super.mo18963x394c0c();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfs */
    public final /* bridge */ /* synthetic */ void mo18964x394c0d() {
        super.mo18964x394c0d();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzft */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2178x394bd1 mo18965x394c0e() {
        return super.mo18965x394c0e();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfu */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 mo18966x394c0f() {
        return super.mo18966x394c0f();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfv */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2211x394bfc mo18967x394c10() {
        return super.mo18967x394c10();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfw */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2198x394bea mo18968x394c11() {
        return super.mo18968x394c11();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfx */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 mo18969x394c12() {
        return super.mo18969x394c12();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfy */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2293x394c5d mo18970x394c13() {
        return super.mo18970x394c13();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzfz */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2212x394bfd mo18971x394c14() {
        return super.mo18971x394c14();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzga */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2214x394bff mo18972x394c1a() {
        return super.mo18972x394c1a();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgb */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96 mo18973x394c1b() {
        return super.mo18973x394c1b();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgc */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2321x394c7e mo18974x394c1c() {
        return super.mo18974x394c1c();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzgd */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 mo18975x394c1d() {
        return super.mo18975x394c1d();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2186x394bde
    /* renamed from: zzge */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 mo18976x394c1e() {
        return super.mo18976x394c1e();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgf */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c mo18977x394c1f() {
        return super.mo18977x394c1f();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f
    /* renamed from: zzgg */
    public final /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2189x394be1 mo18978x394c20() {
        return super.mo18978x394c20();
    }

    public final java.lang.Object zzh(java.lang.String str, java.lang.Object obj) {
        boolean z17;
        if ("_ev".equals(str)) {
            z17 = true;
        } else {
            r1 = m19282x394ba6(str) ? 256 : 100;
            z17 = false;
        }
        return zza(r1, obj, z17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40
    /* renamed from: zzhf */
    public final boolean mo19069x394c3e() {
        return true;
    }

    public final int zzi(java.lang.String str, java.lang.Object obj) {
        return "_ldl".equals(str) ? zza("user property referrer", str, m19281x394ba5(str), obj, false) : zza("user property", str, m19281x394ba5(str), obj, false) ? 0 : 7;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2269x394c40
    /* renamed from: zzih */
    public final void mo19093x394c5f() {
        mo18961x394b61();
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo18976x394c1e().m19111x394c67().log("Utils falling back to Random for random id");
            }
        }
        this.f7036x6f02315.set(nextLong);
    }

    public final java.lang.Object zzj(java.lang.String str, java.lang.Object obj) {
        return zza(m19281x394ba5(str), obj, "_ldl".equals(str));
    }

    /* renamed from: zzlb */
    public final long m19290x394cb6() {
        long andIncrement;
        long j17;
        if (this.f7036x6f02315.get() != 0) {
            synchronized (this.f7036x6f02315) {
                this.f7036x6f02315.compareAndSet(-1L, 1L);
                andIncrement = this.f7036x6f02315.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f7036x6f02315) {
            long nextLong = new java.util.Random(java.lang.System.nanoTime() ^ mo18962x394b92().mo18536x5cbba1cc()).nextLong();
            int i17 = this.f7037x6f02316 + 1;
            this.f7037x6f02316 = i17;
            j17 = nextLong + i17;
        }
        return j17;
    }

    /* renamed from: zzlc */
    public final java.security.SecureRandom m19291x394cb7() {
        mo18961x394b61();
        if (this.f7035x6f02314 == null) {
            this.f7035x6f02314 = new java.security.SecureRandom();
        }
        return this.f7035x6f02314;
    }

    /* renamed from: zzld */
    public final int m19292x394cb8() {
        if (this.f7038x6f02317 == null) {
            this.f7038x6f02317 = java.lang.Integer.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a.m17641x9cf0d20b().m17643x3f509b12(mo18960x76847179()) / 1000);
        }
        return this.f7038x6f02317.intValue();
    }

    public final boolean zzq(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            mo18976x394c1e().m19108x394c64().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            mo18976x394c1e().m19108x394c64().zzg("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!java.lang.Character.isLetter(codePointAt)) {
            mo18976x394c1e().m19108x394c64().zze("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = java.lang.Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !java.lang.Character.isLetterOrDigit(codePointAt2)) {
                mo18976x394c1e().m19108x394c64().zze("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += java.lang.Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean zzx(java.lang.String str) {
        mo18961x394b61();
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p220x84170e40.C2020x87f17260.m18642x2e2c3887(mo18960x76847179()).m18634x2890b1ba(str) == 0) {
            return true;
        }
        mo18976x394c1e().m19114x394c6a().zzg("Permission not granted", str);
        return false;
    }

    public static boolean zzc(android.content.Context context, java.lang.String str) {
        android.content.pm.ServiceInfo serviceInfo;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new android.content.ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static android.os.Bundle[] zze(java.lang.Object obj) {
        java.lang.Object[] array;
        if (obj instanceof android.os.Bundle) {
            return new android.os.Bundle[]{(android.os.Bundle) obj};
        }
        if (obj instanceof android.os.Parcelable[]) {
            android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
            array = java.util.Arrays.copyOf(parcelableArr, parcelableArr.length, android.os.Bundle[].class);
        } else {
            if (!(obj instanceof java.util.ArrayList)) {
                return null;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            array = arrayList.toArray(new android.os.Bundle[arrayList.size()]);
        }
        return (android.os.Bundle[]) array;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x004c, code lost:
    
        if (zza("event param", 40, r14) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zza(java.lang.String r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zza(java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    public final byte[] zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2355x394ca5 c2355x394ca5) {
        try {
            int m18953x394df7 = c2355x394ca5.m18953x394df7();
            byte[] bArr = new byte[m18953x394df7];
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(bArr, 0, m18953x394df7);
            c2355x394ca5.zza(zzb);
            zzb.m18920x394def();
            return bArr;
        } catch (java.io.IOException e17) {
            mo18976x394c1e().m19108x394c64().zzg("Data loss. Failed to serialize batch", e17);
            return null;
        }
    }

    public final android.os.Bundle zzd(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle != null) {
            for (java.lang.String str : bundle.keySet()) {
                java.lang.Object zzh = zzh(str, bundle.get(str));
                if (zzh == null) {
                    mo18976x394c1e().m19111x394c67().zzg("Param value can't be null", mo18972x394c1a().m19102x394b89(str));
                } else {
                    zza(bundle2, str, zzh);
                }
            }
        }
        return bundle2;
    }

    public static boolean zzd(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public final <T extends android.os.Parcelable> T zza(byte[] bArr, android.os.Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1938x1676c679.ParseException unused) {
            mo18976x394c1e().m19108x394c64().log("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final byte[] zzb(byte[] bArr) {
        try {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            java.util.zip.GZIPInputStream gZIPInputStream = new java.util.zip.GZIPInputStream(byteArrayInputStream);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (java.io.IOException e17) {
            mo18976x394c1e().m19108x394c64().zzg("Failed to ungzip content", e17);
            throw e17;
        }
    }

    public static boolean zzd(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf0, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2204x394bf0);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2183x394bd6);
        return !android.text.TextUtils.isEmpty(c2183x394bd6.f6456x6f0216a);
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 zza(java.lang.String str, android.os.Bundle bundle, java.lang.String str2, long j17, boolean z17, boolean z18) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (m19285x394ba1(str) != 0) {
            mo18976x394c1e().m19108x394c64().zzg("Invalid conditional property event name", mo18972x394c1a().m19103x394b8a(str));
            throw new java.lang.IllegalArgumentException();
        }
        android.os.Bundle bundle2 = bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle();
        bundle2.putString("_o", str2);
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0(str, new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed(zzd(zza(str, bundle2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1992x33b9c93.m18542xbe490b15("_o"), false, false))), str2, j17);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4 zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3 c2353x394ca3, java.lang.String str) {
        for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4 c2354x394ca4 : c2353x394ca3.f7091x6f0234e) {
            if (c2354x394ca4.f7095x337a8b.equals(str)) {
                return c2354x394ca4;
            }
        }
        return null;
    }

    private static java.lang.Object zza(int i17, java.lang.Object obj, boolean z17) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof java.lang.Long) || (obj instanceof java.lang.Double)) {
            return obj;
        }
        if (obj instanceof java.lang.Integer) {
            return java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
        }
        if (obj instanceof java.lang.Byte) {
            return java.lang.Long.valueOf(((java.lang.Byte) obj).byteValue());
        }
        if (obj instanceof java.lang.Short) {
            return java.lang.Long.valueOf(((java.lang.Short) obj).shortValue());
        }
        if (obj instanceof java.lang.Boolean) {
            return java.lang.Long.valueOf(((java.lang.Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Double.valueOf(((java.lang.Float) obj).doubleValue());
        }
        if ((obj instanceof java.lang.String) || (obj instanceof java.lang.Character) || (obj instanceof java.lang.CharSequence)) {
            return zza(java.lang.String.valueOf(obj), i17, z17);
        }
        return null;
    }

    public static java.lang.String zza(java.lang.String str, int i17, boolean z17) {
        if (str.codePointCount(0, str.length()) <= i17) {
            return str;
        }
        if (z17) {
            return java.lang.String.valueOf(str.substring(0, str.offsetByCodePoints(0, i17))).concat("...");
        }
        return null;
    }

    public static java.lang.String zza(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(strArr);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(strArr2);
        int min = java.lang.Math.min(strArr.length, strArr2.length);
        for (int i17 = 0; i17 < min; i17++) {
            if (zzs(str, strArr[i17])) {
                return strArr2[i17];
            }
        }
        return null;
    }

    public final void zza(int i17, java.lang.String str, java.lang.String str2, int i18) {
        zza((java.lang.String) null, i17, str, str2, i18);
    }

    private static void zza(android.os.Bundle bundle, java.lang.Object obj) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(bundle);
        if (obj != null) {
            if ((obj instanceof java.lang.String) || (obj instanceof java.lang.CharSequence)) {
                bundle.putLong("_el", java.lang.String.valueOf(obj).length());
            }
        }
    }

    public final void zza(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof java.lang.Long) {
            bundle.putLong(str, ((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.String) {
            bundle.putString(str, java.lang.String.valueOf(obj));
        } else if (obj instanceof java.lang.Double) {
            bundle.putDouble(str, ((java.lang.Double) obj).doubleValue());
        } else if (str != null) {
            mo18976x394c1e().m19112x394c68().zze("Not putting event parameter. Invalid value type. name, type", mo18972x394c1a().m19102x394b89(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4 c2354x394ca4, java.lang.Object obj) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(obj);
        c2354x394ca4.f7096x6f0221d = null;
        c2354x394ca4.f7099x6f02352 = null;
        c2354x394ca4.f7098x6f02312 = null;
        if (obj instanceof java.lang.String) {
            c2354x394ca4.f7096x6f0221d = (java.lang.String) obj;
            return;
        }
        if (obj instanceof java.lang.Long) {
            c2354x394ca4.f7099x6f02352 = (java.lang.Long) obj;
        } else if (obj instanceof java.lang.Double) {
            c2354x394ca4.f7098x6f02312 = (java.lang.Double) obj;
        } else {
            mo18976x394c1e().m19108x394c64().zzg("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2358x394ca8 c2358x394ca8, java.lang.Object obj) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(obj);
        c2358x394ca8.f7143x6f0221d = null;
        c2358x394ca8.f7146x6f02352 = null;
        c2358x394ca8.f7145x6f02312 = null;
        if (obj instanceof java.lang.String) {
            c2358x394ca8.f7143x6f0221d = (java.lang.String) obj;
            return;
        }
        if (obj instanceof java.lang.Long) {
            c2358x394ca8.f7146x6f02352 = (java.lang.Long) obj;
        } else if (obj instanceof java.lang.Double) {
            c2358x394ca8.f7145x6f02312 = (java.lang.Double) obj;
        } else {
            mo18976x394c1e().m19108x394c64().zzg("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void zza(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
        android.os.Bundle bundle = new android.os.Bundle();
        zza(bundle, i17);
        if (!android.text.TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i17 == 6 || i17 == 7 || i17 == 2) {
            bundle.putLong("_el", i18);
        }
        this.f6815x6f02155.m19166x394c0f().m19195x769949b6("auto", "_err", bundle);
    }

    public final boolean zza(long j17, long j18) {
        return j17 == 0 || j18 <= 0 || java.lang.Math.abs(mo18962x394b92().mo18536x5cbba1cc() - j17) > j18;
    }

    private static boolean zza(android.os.Bundle bundle, int i17) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i17);
        return true;
    }

    public final boolean zza(java.lang.String str, int i17, java.lang.String str2) {
        if (str2 == null) {
            mo18976x394c1e().m19108x394c64().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i17) {
            return true;
        }
        mo18976x394c1e().m19108x394c64().zzd("Name is too long. Type, maximum supported length, name", str, java.lang.Integer.valueOf(i17), str2);
        return false;
    }

    private final boolean zza(java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj, boolean z17) {
        if (obj != null && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Float) && !(obj instanceof java.lang.Integer) && !(obj instanceof java.lang.Byte) && !(obj instanceof java.lang.Short) && !(obj instanceof java.lang.Boolean) && !(obj instanceof java.lang.Double)) {
            if (!(obj instanceof java.lang.String) && !(obj instanceof java.lang.Character) && !(obj instanceof java.lang.CharSequence)) {
                if ((obj instanceof android.os.Bundle) && z17) {
                    return true;
                }
                if ((obj instanceof android.os.Parcelable[]) && z17) {
                    for (android.os.Parcelable parcelable : (android.os.Parcelable[]) obj) {
                        if (!(parcelable instanceof android.os.Bundle)) {
                            mo18976x394c1e().m19111x394c67().zze("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
                if (!(obj instanceof java.util.ArrayList) || !z17) {
                    return false;
                }
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                int size = arrayList.size();
                int i18 = 0;
                while (i18 < size) {
                    java.lang.Object obj2 = arrayList.get(i18);
                    i18++;
                    if (!(obj2 instanceof android.os.Bundle)) {
                        mo18976x394c1e().m19111x394c67().zze("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                        return false;
                    }
                }
                return true;
            }
            java.lang.String valueOf = java.lang.String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i17) {
                mo18976x394c1e().m19111x394c67().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, java.lang.Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean zza(java.lang.String str, java.lang.String[] strArr, java.lang.String str2) {
        boolean z17;
        boolean z18;
        if (str2 == null) {
            mo18976x394c1e().m19108x394c64().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str2);
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr2 = f7034x6f02313;
            if (i17 >= strArr2.length) {
                z17 = false;
                break;
            }
            if (str2.startsWith(strArr2[i17])) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (z17) {
            mo18976x394c1e().m19108x394c64().zze("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(strArr);
            int i18 = 0;
            while (true) {
                if (i18 >= strArr.length) {
                    z18 = false;
                    break;
                }
                if (zzs(str2, strArr[i18])) {
                    z18 = true;
                    break;
                }
                i18++;
            }
            if (z18) {
                mo18976x394c1e().m19108x394c64().zze("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    public static boolean zza(long[] jArr, int i17) {
        if (i17 >= (jArr.length << 6)) {
            return false;
        }
        return ((1 << (i17 % 64)) & jArr[i17 / 64]) != 0;
    }

    public static byte[] zza(android.os.Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final byte[] zza(byte[] bArr) {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e17) {
            mo18976x394c1e().m19108x394c64().zzg("Failed to gzip content", e17);
            throw e17;
        }
    }

    public static long[] zza(java.util.BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        for (int i17 = 0; i17 < length; i17++) {
            jArr[i17] = 0;
            for (int i18 = 0; i18 < 64; i18++) {
                int i19 = (i17 << 6) + i18;
                if (i19 < bitSet.length()) {
                    if (bitSet.get(i19)) {
                        jArr[i17] = jArr[i17] | (1 << i18);
                    }
                }
            }
        }
        return jArr;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[] zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[] c2354x394ca4Arr, java.lang.String str, java.lang.Object obj) {
        for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4 c2354x394ca4 : c2354x394ca4Arr) {
            if (str.equals(c2354x394ca4.f7095x337a8b)) {
                c2354x394ca4.f7099x6f02352 = null;
                c2354x394ca4.f7096x6f0221d = null;
                c2354x394ca4.f7098x6f02312 = null;
                if (obj instanceof java.lang.Long) {
                    c2354x394ca4.f7099x6f02352 = (java.lang.Long) obj;
                } else if (obj instanceof java.lang.String) {
                    c2354x394ca4.f7096x6f0221d = (java.lang.String) obj;
                } else if (obj instanceof java.lang.Double) {
                    c2354x394ca4.f7098x6f02312 = (java.lang.Double) obj;
                }
                return c2354x394ca4Arr;
            }
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[] c2354x394ca4Arr2 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[c2354x394ca4Arr.length + 1];
        java.lang.System.arraycopy(c2354x394ca4Arr, 0, c2354x394ca4Arr2, 0, c2354x394ca4Arr.length);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4 c2354x394ca42 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4();
        c2354x394ca42.f7095x337a8b = str;
        if (obj instanceof java.lang.Long) {
            c2354x394ca42.f7099x6f02352 = (java.lang.Long) obj;
        } else if (obj instanceof java.lang.String) {
            c2354x394ca42.f7096x6f0221d = (java.lang.String) obj;
        } else if (obj instanceof java.lang.Double) {
            c2354x394ca42.f7098x6f02312 = (java.lang.Double) obj;
        }
        c2354x394ca4Arr2[c2354x394ca4Arr.length] = c2354x394ca42;
        return c2354x394ca4Arr2;
    }
}
