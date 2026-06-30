package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzka extends com.google.android.gms.internal.measurement.zzhh {
    private static final java.lang.String[] zzard = {"firebase_", "google_", "ga_"};
    private java.security.SecureRandom zzare;
    private final java.util.concurrent.atomic.AtomicLong zzarf;
    private int zzarg;
    private java.lang.Integer zzarh;

    public zzka(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        super(zzglVar);
        this.zzarh = null;
        this.zzarf = new java.util.concurrent.atomic.AtomicLong(0L);
    }

    public static java.security.MessageDigest getMessageDigest(java.lang.String str) {
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

    public static java.lang.Object zzb(com.google.android.gms.internal.measurement.zzkn zzknVar, java.lang.String str) {
        com.google.android.gms.internal.measurement.zzko zza = zza(zzknVar, str);
        if (zza == null) {
            return null;
        }
        java.lang.String str2 = zza.zzajf;
        if (str2 != null) {
            return str2;
        }
        java.lang.Long l17 = zza.zzate;
        if (l17 != null) {
            return l17;
        }
        java.lang.Double d17 = zza.zzarc;
        if (d17 != null) {
            return d17;
        }
        return null;
    }

    public static long zzc(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        int i17 = 0;
        com.google.android.gms.common.internal.Preconditions.checkState(bArr.length > 0);
        long j17 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j17 += (bArr[length] & 255) << i17;
            i17 += 8;
        }
        return j17;
    }

    public static boolean zzcc(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private static int zzch(java.lang.String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    public static boolean zzci(java.lang.String str) {
        return !android.text.TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean zzck(java.lang.String str) {
        return str != null && str.matches("(\\+|-)?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean zzcl(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
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
        com.google.android.gms.internal.measurement.zzfi zzim;
        java.lang.String str2;
        android.content.pm.Signature[] signatureArr;
        javax.security.auth.x500.X500Principal x500Principal = new javax.security.auth.x500.X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            e = e17;
            zzim = zzge().zzim();
            str2 = "Package name not found";
            zzim.zzg(str2, e);
            return true;
        } catch (java.security.cert.CertificateException e18) {
            e = e18;
            zzim = zzge().zzim();
            str2 = "Error obtaining certificate";
            zzim.zzg(str2, e);
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
            zzge().zzim().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzge().zzim().zzg("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!java.lang.Character.isLetter(codePointAt) && codePointAt != 95) {
            zzge().zzim().zze("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = java.lang.Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !java.lang.Character.isLetterOrDigit(codePointAt2)) {
                zzge().zzim().zze("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
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

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
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
                bundle.putString(ya.b.CAMPAIGN, str);
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                bundle.putString(ya.b.SOURCE, str2);
            }
            if (!android.text.TextUtils.isEmpty(str3)) {
                bundle.putString(ya.b.MEDIUM, str3);
            }
            if (!android.text.TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            java.lang.String queryParameter = uri.getQueryParameter("utm_term");
            if (!android.text.TextUtils.isEmpty(queryParameter)) {
                bundle.putString(ya.b.TERM, queryParameter);
            }
            java.lang.String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!android.text.TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            java.lang.String queryParameter3 = uri.getQueryParameter(ya.b.ACLID);
            if (!android.text.TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(ya.b.ACLID, queryParameter3);
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
            zzge().zzip().zzg("Install referrer url isn't a hierarchical URI", e17);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzbt() {
        return super.zzbt();
    }

    public final int zzcd(java.lang.String str) {
        if (!zzr("event", str)) {
            return 2;
        }
        if (zza("event", com.google.android.gms.measurement.AppMeasurement.Event.zzacx, str)) {
            return !zza("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    public final int zzce(java.lang.String str) {
        if (!zzq("user property", str)) {
            return 6;
        }
        if (zza("user property", com.google.android.gms.measurement.AppMeasurement.UserProperty.zzadb, str)) {
            return !zza("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    public final int zzcf(java.lang.String str) {
        if (!zzr("user property", str)) {
            return 6;
        }
        if (zza("user property", com.google.android.gms.measurement.AppMeasurement.UserProperty.zzadb, str)) {
            return !zza("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    public final boolean zzcg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            zzge().zzim().log("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        zzge().zzim().zzg("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", str);
        return false;
    }

    public final boolean zzcj(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return zzgg().zzhj().equals(str);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0067 -> B:8:0x0074). Please report as a decompilation issue!!! */
    public final long zzd(android.content.Context context, java.lang.String str) {
        zzab();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        java.security.MessageDigest messageDigest = getMessageDigest("MD5");
        long j17 = -1;
        if (messageDigest == null) {
            zzge().zzim().log("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                    zzge().zzim().zzg("Package name not found", e17);
                }
                if (!zze(context, str)) {
                    android.content.pm.Signature[] signatureArr = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(getContext().getPackageName(), 64).signatures;
                    if (signatureArr == null || signatureArr.length <= 0) {
                        zzge().zzip().log("Could not get signatures");
                    } else {
                        j17 = zzc(messageDigest.digest(signatureArr[0].toByteArray()));
                    }
                }
            }
            j17 = 0;
        }
        return j17;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzfr() {
        super.zzfr();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzfs() {
        super.zzfs();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzdu zzft() {
        return super.zzft();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzfu() {
        return super.zzfu();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzfv() {
        return super.zzfv();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzeo zzfw() {
        return super.zzfw();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzii zzfx() {
        return super.zzfx();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzif zzfy() {
        return super.zzfy();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfc zzfz() {
        return super.zzfz();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfe zzga() {
        return super.zzga();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzka zzgb() {
        return super.zzgb();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzjh zzgc() {
        return super.zzgc();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzgg zzgd() {
        return super.zzgd();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfg zzge() {
        return super.zzge();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfr zzgf() {
        return super.zzgf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzef zzgg() {
        return super.zzgg();
    }

    public final java.lang.Object zzh(java.lang.String str, java.lang.Object obj) {
        boolean z17;
        if ("_ev".equals(str)) {
            z17 = true;
        } else {
            r1 = zzci(str) ? 256 : 100;
            z17 = false;
        }
        return zza(r1, obj, z17);
    }

    @Override // com.google.android.gms.internal.measurement.zzhh
    public final boolean zzhf() {
        return true;
    }

    public final int zzi(java.lang.String str, java.lang.Object obj) {
        return "_ldl".equals(str) ? zza("user property referrer", str, zzch(str), obj, false) : zza("user property", str, zzch(str), obj, false) ? 0 : 7;
    }

    @Override // com.google.android.gms.internal.measurement.zzhh
    public final void zzih() {
        zzab();
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzge().zzip().log("Utils falling back to Random for random id");
            }
        }
        this.zzarf.set(nextLong);
    }

    public final java.lang.Object zzj(java.lang.String str, java.lang.Object obj) {
        return zza(zzch(str), obj, "_ldl".equals(str));
    }

    public final long zzlb() {
        long andIncrement;
        long j17;
        if (this.zzarf.get() != 0) {
            synchronized (this.zzarf) {
                this.zzarf.compareAndSet(-1L, 1L);
                andIncrement = this.zzarf.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.zzarf) {
            long nextLong = new java.util.Random(java.lang.System.nanoTime() ^ zzbt().currentTimeMillis()).nextLong();
            int i17 = this.zzarg + 1;
            this.zzarg = i17;
            j17 = nextLong + i17;
        }
        return j17;
    }

    public final java.security.SecureRandom zzlc() {
        zzab();
        if (this.zzare == null) {
            this.zzare = new java.security.SecureRandom();
        }
        return this.zzare;
    }

    public final int zzld() {
        if (this.zzarh == null) {
            this.zzarh = java.lang.Integer.valueOf(com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getApkVersion(getContext()) / 1000);
        }
        return this.zzarh.intValue();
    }

    public final boolean zzq(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            zzge().zzim().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzge().zzim().zzg("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!java.lang.Character.isLetter(codePointAt)) {
            zzge().zzim().zze("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = java.lang.Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !java.lang.Character.isLetterOrDigit(codePointAt2)) {
                zzge().zzim().zze("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += java.lang.Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean zzx(java.lang.String str) {
        zzab();
        if (com.google.android.gms.common.wrappers.Wrappers.packageManager(getContext()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzge().zzis().zzg("Permission not granted", str);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzka.zza(java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    public final byte[] zzb(com.google.android.gms.internal.measurement.zzkp zzkpVar) {
        try {
            int zzvm = zzkpVar.zzvm();
            byte[] bArr = new byte[zzvm];
            com.google.android.gms.internal.measurement.zzabw zzb = com.google.android.gms.internal.measurement.zzabw.zzb(bArr, 0, zzvm);
            zzkpVar.zza(zzb);
            zzb.zzve();
            return bArr;
        } catch (java.io.IOException e17) {
            zzge().zzim().zzg("Data loss. Failed to serialize batch", e17);
            return null;
        }
    }

    public final android.os.Bundle zzd(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (bundle != null) {
            for (java.lang.String str : bundle.keySet()) {
                java.lang.Object zzh = zzh(str, bundle.get(str));
                if (zzh == null) {
                    zzge().zzip().zzg("Param value can't be null", zzga().zzbk(str));
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
        } catch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException unused) {
            zzge().zzim().log("Failed to load parcelable from buffer");
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
            zzge().zzim().zzg("Failed to ungzip content", e17);
            throw e17;
        }
    }

    public static boolean zzd(com.google.android.gms.internal.measurement.zzeu zzeuVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzeuVar);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzdzVar);
        return !android.text.TextUtils.isEmpty(zzdzVar.zzadm);
    }

    public final com.google.android.gms.internal.measurement.zzeu zza(java.lang.String str, android.os.Bundle bundle, java.lang.String str2, long j17, boolean z17, boolean z18) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (zzcd(str) != 0) {
            zzge().zzim().zzg("Invalid conditional property event name", zzga().zzbl(str));
            throw new java.lang.IllegalArgumentException();
        }
        android.os.Bundle bundle2 = bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle();
        bundle2.putString("_o", str2);
        return new com.google.android.gms.internal.measurement.zzeu(str, new com.google.android.gms.internal.measurement.zzer(zzd(zza(str, bundle2, com.google.android.gms.common.util.CollectionUtils.listOf("_o"), false, false))), str2, j17);
    }

    public static com.google.android.gms.internal.measurement.zzko zza(com.google.android.gms.internal.measurement.zzkn zzknVar, java.lang.String str) {
        for (com.google.android.gms.internal.measurement.zzko zzkoVar : zzknVar.zzata) {
            if (zzkoVar.name.equals(str)) {
                return zzkoVar;
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
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr2);
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
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
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
            zzge().zziq().zze("Not putting event parameter. Invalid value type. name, type", zzga().zzbk(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzko zzkoVar, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
        zzkoVar.zzajf = null;
        zzkoVar.zzate = null;
        zzkoVar.zzarc = null;
        if (obj instanceof java.lang.String) {
            zzkoVar.zzajf = (java.lang.String) obj;
            return;
        }
        if (obj instanceof java.lang.Long) {
            zzkoVar.zzate = (java.lang.Long) obj;
        } else if (obj instanceof java.lang.Double) {
            zzkoVar.zzarc = (java.lang.Double) obj;
        } else {
            zzge().zzim().zzg("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzks zzksVar, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
        zzksVar.zzajf = null;
        zzksVar.zzate = null;
        zzksVar.zzarc = null;
        if (obj instanceof java.lang.String) {
            zzksVar.zzajf = (java.lang.String) obj;
            return;
        }
        if (obj instanceof java.lang.Long) {
            zzksVar.zzate = (java.lang.Long) obj;
        } else if (obj instanceof java.lang.Double) {
            zzksVar.zzarc = (java.lang.Double) obj;
        } else {
            zzge().zzim().zzg("Ignoring invalid (type) user attribute value", obj);
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
        this.zzacw.zzfu().logEvent("auto", "_err", bundle);
    }

    public final boolean zza(long j17, long j18) {
        return j17 == 0 || j18 <= 0 || java.lang.Math.abs(zzbt().currentTimeMillis() - j17) > j18;
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
            zzge().zzim().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i17) {
            return true;
        }
        zzge().zzim().zzd("Name is too long. Type, maximum supported length, name", str, java.lang.Integer.valueOf(i17), str2);
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
                            zzge().zzip().zze("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
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
                        zzge().zzip().zze("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                        return false;
                    }
                }
                return true;
            }
            java.lang.String valueOf = java.lang.String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i17) {
                zzge().zzip().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, java.lang.Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean zza(java.lang.String str, java.lang.String[] strArr, java.lang.String str2) {
        boolean z17;
        boolean z18;
        if (str2 == null) {
            zzge().zzim().zzg("Name is required and can't be null. Type", str);
            return false;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str2);
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr2 = zzard;
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
            zzge().zzim().zze("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
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
                zzge().zzim().zze("Name is reserved. Type, name", str, str2);
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
            zzge().zzim().zzg("Failed to gzip content", e17);
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

    public static com.google.android.gms.internal.measurement.zzko[] zza(com.google.android.gms.internal.measurement.zzko[] zzkoVarArr, java.lang.String str, java.lang.Object obj) {
        for (com.google.android.gms.internal.measurement.zzko zzkoVar : zzkoVarArr) {
            if (str.equals(zzkoVar.name)) {
                zzkoVar.zzate = null;
                zzkoVar.zzajf = null;
                zzkoVar.zzarc = null;
                if (obj instanceof java.lang.Long) {
                    zzkoVar.zzate = (java.lang.Long) obj;
                } else if (obj instanceof java.lang.String) {
                    zzkoVar.zzajf = (java.lang.String) obj;
                } else if (obj instanceof java.lang.Double) {
                    zzkoVar.zzarc = (java.lang.Double) obj;
                }
                return zzkoVarArr;
            }
        }
        com.google.android.gms.internal.measurement.zzko[] zzkoVarArr2 = new com.google.android.gms.internal.measurement.zzko[zzkoVarArr.length + 1];
        java.lang.System.arraycopy(zzkoVarArr, 0, zzkoVarArr2, 0, zzkoVarArr.length);
        com.google.android.gms.internal.measurement.zzko zzkoVar2 = new com.google.android.gms.internal.measurement.zzko();
        zzkoVar2.name = str;
        if (obj instanceof java.lang.Long) {
            zzkoVar2.zzate = (java.lang.Long) obj;
        } else if (obj instanceof java.lang.String) {
            zzkoVar2.zzajf = (java.lang.String) obj;
        } else if (obj instanceof java.lang.Double) {
            zzkoVar2.zzarc = (java.lang.Double) obj;
        }
        zzkoVarArr2[zzkoVarArr.length] = zzkoVar2;
        return zzkoVarArr2;
    }
}
