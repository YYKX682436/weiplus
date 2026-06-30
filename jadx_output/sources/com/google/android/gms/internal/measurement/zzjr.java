package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public class zzjr implements com.google.android.gms.internal.measurement.zzec {
    private com.google.android.gms.internal.measurement.zzgl zzacw;
    com.google.android.gms.internal.measurement.zzgf zzaqa;
    com.google.android.gms.internal.measurement.zzfk zzaqb;
    private com.google.android.gms.internal.measurement.zzei zzaqc;
    private com.google.android.gms.internal.measurement.zzfp zzaqd;
    private com.google.android.gms.internal.measurement.zzjn zzaqe;
    private com.google.android.gms.internal.measurement.zzeb zzaqf;
    private boolean zzaqg;
    private long zzaqh;
    private java.util.List<java.lang.Runnable> zzaqi;
    private int zzaqj;
    private int zzaqk;
    private boolean zzaql;
    private boolean zzaqm;
    private boolean zzaqn;
    private java.nio.channels.FileLock zzaqo;
    private java.nio.channels.FileChannel zzaqp;
    private java.util.List<java.lang.Long> zzaqq;
    private java.util.List<java.lang.Long> zzaqr;
    long zzaqs;
    private boolean zzvo = false;

    private final int zza(java.nio.channels.FileChannel fileChannel) {
        zzab();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzge().zzim().log("Bad channel to read from");
            return 0;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int read = fileChannel.read(allocate);
            if (read == 4) {
                allocate.flip();
                return allocate.getInt();
            }
            if (read != -1) {
                zzge().zzip().zzg("Unexpected data length. Bytes read", java.lang.Integer.valueOf(read));
            }
            return 0;
        } catch (java.io.IOException e17) {
            zzge().zzim().zzg("Failed to read from channel", e17);
            return 0;
        }
    }

    private final void zzb(com.google.android.gms.internal.measurement.zzdy zzdyVar) {
        x.b bVar;
        zzab();
        if (android.text.TextUtils.isEmpty(zzdyVar.getGmpAppId())) {
            zzb(zzdyVar.zzah(), 204, null, null, null);
            return;
        }
        java.lang.String gmpAppId = zzdyVar.getGmpAppId();
        java.lang.String appInstanceId = zzdyVar.getAppInstanceId();
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        android.net.Uri.Builder encodedAuthority = builder.scheme(com.google.android.gms.internal.measurement.zzew.zzagm.get()).encodedAuthority(com.google.android.gms.internal.measurement.zzew.zzagn.get());
        java.lang.String valueOf = java.lang.String.valueOf(gmpAppId);
        encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new java.lang.String("config/app/")).appendQueryParameter("app_instance_id", appInstanceId).appendQueryParameter("platform", com.eclipsesource.mmv8.Platform.ANDROID).appendQueryParameter("gmp_version", "12451");
        java.lang.String uri = builder.build().toString();
        try {
            java.net.URL url = new java.net.URL(uri);
            zzge().zzit().zzg("Fetching remote configuration", zzdyVar.zzah());
            com.google.android.gms.internal.measurement.zzkk zzbu = zzkm().zzbu(zzdyVar.zzah());
            java.lang.String zzbv = zzkm().zzbv(zzdyVar.zzah());
            if (zzbu == null || android.text.TextUtils.isEmpty(zzbv)) {
                bVar = null;
            } else {
                bVar = new x.b();
                bVar.put("If-Modified-Since", zzbv);
            }
            this.zzaql = true;
            com.google.android.gms.internal.measurement.zzfk zzkn = zzkn();
            java.lang.String zzah = zzdyVar.zzah();
            com.google.android.gms.internal.measurement.zzjt zzjtVar = new com.google.android.gms.internal.measurement.zzjt(this);
            zzkn.zzab();
            zzkn.zzch();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(url);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjtVar);
            zzkn.zzgd().zzd(new com.google.android.gms.internal.measurement.zzfo(zzkn, zzah, url, null, bVar, zzjtVar));
        } catch (java.net.MalformedURLException unused) {
            zzge().zzim().zze("Failed to parse config URL. Not fetching. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(zzdyVar.zzah()), uri);
        }
    }

    private final java.lang.Boolean zzc(com.google.android.gms.internal.measurement.zzdy zzdyVar) {
        try {
            if (zzdyVar.zzgm() != -2147483648L) {
                if (zzdyVar.zzgm() == com.google.android.gms.common.wrappers.Wrappers.packageManager(getContext()).getPackageInfo(zzdyVar.zzah(), 0).versionCode) {
                    return java.lang.Boolean.TRUE;
                }
            } else {
                java.lang.String str = com.google.android.gms.common.wrappers.Wrappers.packageManager(getContext()).getPackageInfo(zzdyVar.zzah(), 0).versionName;
                if (zzdyVar.zzag() != null && zzdyVar.zzag().equals(str)) {
                    return java.lang.Boolean.TRUE;
                }
            }
            return java.lang.Boolean.FALSE;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzdy zzg(com.google.android.gms.internal.measurement.zzdz r8) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zzg(com.google.android.gms.internal.measurement.zzdz):com.google.android.gms.internal.measurement.zzdy");
    }

    private final com.google.android.gms.internal.measurement.zzgf zzkm() {
        zza(this.zzaqa);
        return this.zzaqa;
    }

    private final com.google.android.gms.internal.measurement.zzfp zzko() {
        com.google.android.gms.internal.measurement.zzfp zzfpVar = this.zzaqd;
        if (zzfpVar != null) {
            return zzfpVar;
        }
        throw new java.lang.IllegalStateException("Network broadcast receiver not created");
    }

    private final com.google.android.gms.internal.measurement.zzjn zzkp() {
        zza(this.zzaqe);
        return this.zzaqe;
    }

    private final long zzkr() {
        long currentTimeMillis = zzbt().currentTimeMillis();
        com.google.android.gms.internal.measurement.zzfr zzgf = zzgf();
        zzgf.zzch();
        zzgf.zzab();
        long j17 = zzgf.zzajy.get();
        if (j17 == 0) {
            j17 = zzgf.zzgb().zzlc().nextInt(com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER) + 1;
            zzgf.zzajy.set(j17);
        }
        return ((((currentTimeMillis + j17) / 1000) / 60) / 60) / 24;
    }

    private final boolean zzkt() {
        zzab();
        zzkq();
        return zzix().zzhs() || !android.text.TextUtils.isEmpty(zzix().zzhn());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzku() {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zzku():void");
    }

    private final void zzkv() {
        zzab();
        if (this.zzaql || this.zzaqm || this.zzaqn) {
            zzge().zzit().zzd("Not stopping services. fetch, network, upload", java.lang.Boolean.valueOf(this.zzaql), java.lang.Boolean.valueOf(this.zzaqm), java.lang.Boolean.valueOf(this.zzaqn));
            return;
        }
        zzge().zzit().log("Stopping uploading service(s)");
        java.util.List<java.lang.Runnable> list = this.zzaqi;
        if (list == null) {
            return;
        }
        java.util.Iterator<java.lang.Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.zzaqi.clear();
    }

    private final boolean zzkw() {
        com.google.android.gms.internal.measurement.zzfi zzim;
        java.lang.String str;
        zzab();
        try {
            java.nio.channels.FileChannel channel = new java.io.RandomAccessFile(new java.io.File(getContext().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzaqp = channel;
            java.nio.channels.FileLock tryLock = channel.tryLock();
            this.zzaqo = tryLock;
            if (tryLock != null) {
                zzge().zzit().log("Storage concurrent access okay");
                return true;
            }
            zzge().zzim().log("Storage concurrent data access panic");
            return false;
        } catch (java.io.FileNotFoundException e17) {
            e = e17;
            zzim = zzge().zzim();
            str = "Failed to acquire storage lock";
            zzim.zzg(str, e);
            return false;
        } catch (java.io.IOException e18) {
            e = e18;
            zzim = zzge().zzim();
            str = "Failed to access storage lock file";
            zzim.zzg(str, e);
            return false;
        }
    }

    private final boolean zzky() {
        zzab();
        zzkq();
        return this.zzaqg;
    }

    @Override // com.google.android.gms.internal.measurement.zzec
    public android.content.Context getContext() {
        return this.zzacw.getContext();
    }

    public void start() {
        zzab();
        zzix().zzhp();
        if (zzgf().zzaju.get() == 0) {
            zzgf().zzaju.set(zzbt().currentTimeMillis());
        }
        zzku();
    }

    public void zzab() {
        zzgd().zzab();
    }

    @Override // com.google.android.gms.internal.measurement.zzec
    public com.google.android.gms.common.util.Clock zzbt() {
        return this.zzacw.zzbt();
    }

    public final com.google.android.gms.internal.measurement.zzdz zzcb(java.lang.String str) {
        java.lang.String str2;
        com.google.android.gms.internal.measurement.zzfi zzfiVar;
        java.lang.Object obj;
        java.lang.String str3 = str;
        com.google.android.gms.internal.measurement.zzdy zzbc = zzix().zzbc(str3);
        if (zzbc == null || android.text.TextUtils.isEmpty(zzbc.zzag())) {
            str2 = "No app data available; dropping";
            obj = str3;
            zzfiVar = zzge().zzis();
        } else {
            java.lang.Boolean zzc = zzc(zzbc);
            if (zzc == null || zzc.booleanValue()) {
                return new com.google.android.gms.internal.measurement.zzdz(str, zzbc.getGmpAppId(), zzbc.zzag(), zzbc.zzgm(), zzbc.zzgn(), zzbc.zzgo(), zzbc.zzgp(), (java.lang.String) null, zzbc.isMeasurementEnabled(), false, zzbc.zzgj(), zzbc.zzhc(), 0L, 0, zzbc.zzhd(), zzbc.zzhe(), false);
            }
            com.google.android.gms.internal.measurement.zzfi zzim = zzge().zzim();
            str2 = "App version does not match; dropping. appId";
            obj = com.google.android.gms.internal.measurement.zzfg.zzbm(str);
            zzfiVar = zzim;
        }
        zzfiVar.zzg(str2, obj);
        return null;
    }

    public final void zzd(com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        if (this.zzaqq != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.zzaqr = arrayList;
            arrayList.addAll(this.zzaqq);
        }
        com.google.android.gms.internal.measurement.zzei zzix = zzix();
        java.lang.String str = zzdzVar.packageName;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzix.zzab();
        zzix.zzch();
        try {
            android.database.sqlite.SQLiteDatabase writableDatabase = zzix.getWritableDatabase();
            java.lang.String[] strArr = {str};
            int delete = writableDatabase.delete("apps", "app_id=?", strArr) + 0 + writableDatabase.delete("events", "app_id=?", strArr) + writableDatabase.delete("user_attributes", "app_id=?", strArr) + writableDatabase.delete("conditional_properties", "app_id=?", strArr) + writableDatabase.delete("raw_events", "app_id=?", strArr) + writableDatabase.delete("raw_events_metadata", "app_id=?", strArr) + writableDatabase.delete("queue", "app_id=?", strArr) + writableDatabase.delete("audience_filter_values", "app_id=?", strArr) + writableDatabase.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzix.zzge().zzit().zze("Reset analytics data. app, records", str, java.lang.Integer.valueOf(delete));
            }
        } catch (android.database.sqlite.SQLiteException e17) {
            zzix.zzge().zzim().zze("Error resetting analytics data. appId, error", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e17);
        }
        com.google.android.gms.internal.measurement.zzdz zza = zza(getContext(), zzdzVar.packageName, zzdzVar.zzadm, zzdzVar.zzadw, zzdzVar.zzady, zzdzVar.zzadz, zzdzVar.zzaem);
        if (!zzgg().zzaz(zzdzVar.packageName) || zzdzVar.zzadw) {
            zzf(zza);
        }
    }

    public final void zze(com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        zzab();
        zzkq();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzdzVar.packageName);
        zzg(zzdzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x03a0 A[Catch: all -> 0x03ca, TryCatch #2 {all -> 0x03ca, blocks: (B:25:0x0095, B:27:0x00a3, B:29:0x00a9, B:31:0x00b5, B:33:0x00db, B:35:0x0124, B:39:0x0137, B:41:0x014c, B:44:0x0159, B:46:0x0166, B:47:0x01ca, B:49:0x01cf, B:50:0x01d7, B:52:0x01eb, B:55:0x01fc, B:57:0x0247, B:59:0x024b, B:60:0x0250, B:62:0x025a, B:63:0x02fe, B:65:0x0319, B:66:0x031c, B:67:0x032d, B:68:0x0381, B:69:0x039c, B:70:0x03bb, B:75:0x026f, B:77:0x0297, B:79:0x029f, B:81:0x02a5, B:82:0x02ab, B:85:0x02b5, B:89:0x02c3, B:92:0x02ec, B:94:0x02f2, B:95:0x02f5, B:97:0x02fb, B:100:0x02d6, B:103:0x0280, B:106:0x0337, B:108:0x0368, B:110:0x036c, B:111:0x036f, B:112:0x03a0, B:114:0x03a4, B:116:0x01de, B:119:0x018d, B:121:0x0198, B:123:0x01a4), top: B:24:0x0095, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01eb A[Catch: all -> 0x03ca, TRY_LEAVE, TryCatch #2 {all -> 0x03ca, blocks: (B:25:0x0095, B:27:0x00a3, B:29:0x00a9, B:31:0x00b5, B:33:0x00db, B:35:0x0124, B:39:0x0137, B:41:0x014c, B:44:0x0159, B:46:0x0166, B:47:0x01ca, B:49:0x01cf, B:50:0x01d7, B:52:0x01eb, B:55:0x01fc, B:57:0x0247, B:59:0x024b, B:60:0x0250, B:62:0x025a, B:63:0x02fe, B:65:0x0319, B:66:0x031c, B:67:0x032d, B:68:0x0381, B:69:0x039c, B:70:0x03bb, B:75:0x026f, B:77:0x0297, B:79:0x029f, B:81:0x02a5, B:82:0x02ab, B:85:0x02b5, B:89:0x02c3, B:92:0x02ec, B:94:0x02f2, B:95:0x02f5, B:97:0x02fb, B:100:0x02d6, B:103:0x0280, B:106:0x0337, B:108:0x0368, B:110:0x036c, B:111:0x036f, B:112:0x03a0, B:114:0x03a4, B:116:0x01de, B:119:0x018d, B:121:0x0198, B:123:0x01a4), top: B:24:0x0095, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(com.google.android.gms.internal.measurement.zzdz r23) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zzf(com.google.android.gms.internal.measurement.zzdz):void");
    }

    public com.google.android.gms.internal.measurement.zzeo zzfw() {
        return this.zzacw.zzfw();
    }

    public com.google.android.gms.internal.measurement.zzfe zzga() {
        return this.zzacw.zzga();
    }

    public com.google.android.gms.internal.measurement.zzka zzgb() {
        return this.zzacw.zzgb();
    }

    @Override // com.google.android.gms.internal.measurement.zzec
    public com.google.android.gms.internal.measurement.zzgg zzgd() {
        return this.zzacw.zzgd();
    }

    @Override // com.google.android.gms.internal.measurement.zzec
    public com.google.android.gms.internal.measurement.zzfg zzge() {
        return this.zzacw.zzge();
    }

    public com.google.android.gms.internal.measurement.zzfr zzgf() {
        return this.zzacw.zzgf();
    }

    public com.google.android.gms.internal.measurement.zzef zzgg() {
        return this.zzacw.zzgg();
    }

    public final java.lang.String zzh(com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        try {
            return (java.lang.String) zzgd().zzb(new com.google.android.gms.internal.measurement.zzju(this, zzdzVar)).get(30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e17) {
            zzge().zzim().zze("Failed to get app instance id. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(zzdzVar.packageName), e17);
            return null;
        }
    }

    public final com.google.android.gms.internal.measurement.zzeb zziw() {
        zza(this.zzaqf);
        return this.zzaqf;
    }

    public final com.google.android.gms.internal.measurement.zzei zzix() {
        zza(this.zzaqc);
        return this.zzaqc;
    }

    public final com.google.android.gms.internal.measurement.zzfk zzkn() {
        zza(this.zzaqb);
        return this.zzaqb;
    }

    public final void zzkq() {
        if (!this.zzvo) {
            throw new java.lang.IllegalStateException("UploadController is not initialized");
        }
    }

    public final void zzks() {
        com.google.android.gms.internal.measurement.zzdy zzbc;
        java.lang.String str;
        com.google.android.gms.internal.measurement.zzfi zzit;
        java.lang.String str2;
        zzab();
        zzkq();
        this.zzaqn = true;
        try {
            java.lang.Boolean zzkf = this.zzacw.zzfx().zzkf();
            if (zzkf == null) {
                zzit = zzge().zzip();
                str2 = "Upload data called on the client side before use of service was decided";
            } else {
                if (!zzkf.booleanValue()) {
                    if (this.zzaqh <= 0) {
                        zzab();
                        if (this.zzaqq != null) {
                            zzit = zzge().zzit();
                            str2 = "Uploading requested multiple times";
                        } else {
                            if (zzkn().zzex()) {
                                long currentTimeMillis = zzbt().currentTimeMillis();
                                zzd(null, currentTimeMillis - com.google.android.gms.internal.measurement.zzef.zzhi());
                                long j17 = zzgf().zzaju.get();
                                if (j17 != 0) {
                                    zzge().zzis().zzg("Uploading events. Elapsed time since last upload attempt (ms)", java.lang.Long.valueOf(java.lang.Math.abs(currentTimeMillis - j17)));
                                }
                                java.lang.String zzhn = zzix().zzhn();
                                if (android.text.TextUtils.isEmpty(zzhn)) {
                                    this.zzaqs = -1L;
                                    java.lang.String zzab = zzix().zzab(currentTimeMillis - com.google.android.gms.internal.measurement.zzef.zzhi());
                                    if (!android.text.TextUtils.isEmpty(zzab) && (zzbc = zzix().zzbc(zzab)) != null) {
                                        zzb(zzbc);
                                    }
                                } else {
                                    if (this.zzaqs == -1) {
                                        this.zzaqs = zzix().zzhu();
                                    }
                                    java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzkq, java.lang.Long>> zzb = zzix().zzb(zzhn, zzgg().zzb(zzhn, com.google.android.gms.internal.measurement.zzew.zzago), java.lang.Math.max(0, zzgg().zzb(zzhn, com.google.android.gms.internal.measurement.zzew.zzagp)));
                                    if (!zzb.isEmpty()) {
                                        java.util.Iterator<android.util.Pair<com.google.android.gms.internal.measurement.zzkq, java.lang.Long>> it = zzb.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                str = null;
                                                break;
                                            }
                                            com.google.android.gms.internal.measurement.zzkq zzkqVar = (com.google.android.gms.internal.measurement.zzkq) it.next().first;
                                            if (!android.text.TextUtils.isEmpty(zzkqVar.zzatv)) {
                                                str = zzkqVar.zzatv;
                                                break;
                                            }
                                        }
                                        if (str != null) {
                                            int i17 = 0;
                                            while (true) {
                                                if (i17 >= zzb.size()) {
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzkq zzkqVar2 = (com.google.android.gms.internal.measurement.zzkq) zzb.get(i17).first;
                                                if (!android.text.TextUtils.isEmpty(zzkqVar2.zzatv) && !zzkqVar2.zzatv.equals(str)) {
                                                    zzb = zzb.subList(0, i17);
                                                    break;
                                                }
                                                i17++;
                                            }
                                        }
                                        com.google.android.gms.internal.measurement.zzkp zzkpVar = new com.google.android.gms.internal.measurement.zzkp();
                                        zzkpVar.zzatf = new com.google.android.gms.internal.measurement.zzkq[zzb.size()];
                                        java.util.ArrayList arrayList = new java.util.ArrayList(zzb.size());
                                        boolean z17 = com.google.android.gms.internal.measurement.zzef.zzhk() && zzgg().zzat(zzhn);
                                        int i18 = 0;
                                        while (true) {
                                            com.google.android.gms.internal.measurement.zzkq[] zzkqVarArr = zzkpVar.zzatf;
                                            if (i18 >= zzkqVarArr.length) {
                                                break;
                                            }
                                            zzkqVarArr[i18] = (com.google.android.gms.internal.measurement.zzkq) zzb.get(i18).first;
                                            arrayList.add((java.lang.Long) zzb.get(i18).second);
                                            zzkpVar.zzatf[i18].zzatu = 12451L;
                                            zzkpVar.zzatf[i18].zzatk = java.lang.Long.valueOf(currentTimeMillis);
                                            com.google.android.gms.internal.measurement.zzkq zzkqVar3 = zzkpVar.zzatf[i18];
                                            zzkqVar3.zzatz = java.lang.Boolean.FALSE;
                                            if (!z17) {
                                                zzkqVar3.zzauh = null;
                                            }
                                            i18++;
                                        }
                                        java.lang.String zza = zzge().isLoggable(2) ? zzga().zza(zzkpVar) : null;
                                        byte[] zzb2 = zzgb().zzb(zzkpVar);
                                        java.lang.String str3 = com.google.android.gms.internal.measurement.zzew.zzagy.get();
                                        try {
                                            java.net.URL url = new java.net.URL(str3);
                                            com.google.android.gms.common.internal.Preconditions.checkArgument(!arrayList.isEmpty());
                                            if (this.zzaqq != null) {
                                                zzge().zzim().log("Set uploading progress before finishing the previous upload");
                                            } else {
                                                this.zzaqq = new java.util.ArrayList(arrayList);
                                            }
                                            zzgf().zzajv.set(currentTimeMillis);
                                            com.google.android.gms.internal.measurement.zzkq[] zzkqVarArr2 = zzkpVar.zzatf;
                                            zzge().zzit().zzd("Uploading data. app, uncompressed size, data", zzkqVarArr2.length > 0 ? zzkqVarArr2[0].zzti : "?", java.lang.Integer.valueOf(zzb2.length), zza);
                                            this.zzaqm = true;
                                            com.google.android.gms.internal.measurement.zzfk zzkn = zzkn();
                                            com.google.android.gms.internal.measurement.zzjs zzjsVar = new com.google.android.gms.internal.measurement.zzjs(this, zzhn);
                                            zzkn.zzab();
                                            zzkn.zzch();
                                            com.google.android.gms.common.internal.Preconditions.checkNotNull(url);
                                            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzb2);
                                            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjsVar);
                                            zzkn.zzgd().zzd(new com.google.android.gms.internal.measurement.zzfo(zzkn, zzhn, url, zzb2, null, zzjsVar));
                                        } catch (java.net.MalformedURLException unused) {
                                            zzge().zzim().zze("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(zzhn), str3);
                                        }
                                    }
                                }
                            }
                            zzge().zzit().log("Network not connected, ignoring upload request");
                        }
                    }
                    zzku();
                }
                zzit = zzge().zzim();
                str2 = "Upload called in the client side when service should be used";
            }
            zzit.log(str2);
        } finally {
            this.zzaqn = false;
            zzkv();
        }
    }

    public final void zzkx() {
        com.google.android.gms.internal.measurement.zzfi zzim;
        java.lang.Integer valueOf;
        java.lang.Integer valueOf2;
        java.lang.String str;
        zzab();
        zzkq();
        if (this.zzaqg) {
            return;
        }
        zzge().zzir().log("This instance being marked as an uploader");
        zzab();
        zzkq();
        if (zzky() && zzkw()) {
            int zza = zza(this.zzaqp);
            int zzij = this.zzacw.zzfv().zzij();
            zzab();
            if (zza > zzij) {
                zzim = zzge().zzim();
                valueOf = java.lang.Integer.valueOf(zza);
                valueOf2 = java.lang.Integer.valueOf(zzij);
                str = "Panic: can't downgrade version. Previous, current version";
            } else if (zza < zzij) {
                if (zza(zzij, this.zzaqp)) {
                    zzim = zzge().zzit();
                    valueOf = java.lang.Integer.valueOf(zza);
                    valueOf2 = java.lang.Integer.valueOf(zzij);
                    str = "Storage version upgraded. Previous, current version";
                } else {
                    zzim = zzge().zzim();
                    valueOf = java.lang.Integer.valueOf(zza);
                    valueOf2 = java.lang.Integer.valueOf(zzij);
                    str = "Storage version upgrade failed. Previous, current version";
                }
            }
            zzim.zze(str, valueOf, valueOf2);
        }
        this.zzaqg = true;
        zzku();
    }

    public final void zzkz() {
        this.zzaqk++;
    }

    public final com.google.android.gms.internal.measurement.zzgl zzla() {
        return this.zzacw;
    }

    public final void zzm(boolean z17) {
        zzku();
    }

    /* JADX WARN: Code restructure failed: missing block: B:389:0x026f, code lost:
    
        if (r9 == null) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0623 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0639 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0655 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0636 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0773 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0785 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x07a3 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0276 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0282 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0ac9 A[Catch: all -> 0x0ae2, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0116 A[Catch: all -> 0x012c, SQLiteException -> 0x0131, TRY_ENTER, TRY_LEAVE, TryCatch #16 {SQLiteException -> 0x0131, all -> 0x012c, blocks: (B:348:0x0116, B:356:0x014d, B:360:0x0169), top: B:346:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0ade A[Catch: all -> 0x0ae2, TRY_ENTER, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:396:? A[Catch: all -> 0x0ae2, SYNTHETIC, TRY_LEAVE, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x054c A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0562 A[Catch: all -> 0x0ae2, TryCatch #3 {all -> 0x0ae2, blocks: (B:3:0x000b, B:18:0x0076, B:19:0x0272, B:21:0x0276, B:26:0x0282, B:27:0x029d, B:29:0x02a5, B:32:0x02bf, B:34:0x02ee, B:39:0x0302, B:41:0x030a, B:44:0x0588, B:46:0x032a, B:48:0x033c, B:54:0x052d, B:56:0x0537, B:58:0x053b, B:61:0x053f, B:63:0x054c, B:64:0x055e, B:65:0x0562, B:66:0x0582, B:68:0x056b, B:70:0x0356, B:72:0x035a, B:73:0x035f, B:78:0x0372, B:80:0x037e, B:82:0x039a, B:83:0x0389, B:85:0x0391, B:91:0x03a7, B:93:0x03ea, B:94:0x0422, B:97:0x0454, B:99:0x0459, B:103:0x0463, B:105:0x046c, B:107:0x0472, B:108:0x047a, B:101:0x047d, B:109:0x0482, B:112:0x048c, B:114:0x04bd, B:116:0x04da, B:120:0x04ef, B:121:0x04e6, B:129:0x04f6, B:131:0x0508, B:132:0x0514, B:137:0x0592, B:139:0x05a5, B:141:0x05b1, B:143:0x05bf, B:146:0x05c4, B:147:0x0602, B:148:0x061e, B:150:0x0623, B:154:0x062d, B:156:0x0639, B:159:0x0655, B:152:0x0633, B:162:0x05e7, B:163:0x066b, B:165:0x0687, B:167:0x06a0, B:170:0x06b0, B:172:0x06c3, B:173:0x06d2, B:175:0x06d6, B:177:0x06e2, B:178:0x06ef, B:180:0x06f3, B:182:0x06f9, B:183:0x070a, B:187:0x08e2, B:189:0x071a, B:193:0x072b, B:195:0x0735, B:199:0x0743, B:201:0x074b, B:203:0x074f, B:205:0x0757, B:207:0x075b, B:211:0x0773, B:213:0x0785, B:215:0x07a3, B:217:0x07ad, B:219:0x07bd, B:220:0x07f3, B:223:0x0803, B:225:0x080a, B:227:0x0814, B:229:0x0818, B:231:0x081c, B:233:0x0820, B:234:0x082c, B:236:0x0832, B:238:0x084d, B:239:0x0856, B:240:0x086a, B:242:0x0885, B:244:0x08b1, B:245:0x08bc, B:247:0x08cd, B:249:0x08d6, B:197:0x0765, B:258:0x08ee, B:260:0x08f3, B:261:0x08fb, B:262:0x0903, B:264:0x0909, B:266:0x091d, B:267:0x0931, B:269:0x0936, B:271:0x0948, B:272:0x094c, B:274:0x095c, B:276:0x0960, B:279:0x0963, B:281:0x0971, B:282:0x09e3, B:284:0x09e8, B:286:0x09f6, B:289:0x09fb, B:290:0x0a24, B:291:0x09fe, B:293:0x0a08, B:294:0x0a0f, B:295:0x0a2d, B:296:0x0a44, B:299:0x0a4c, B:301:0x0a51, B:304:0x0a61, B:306:0x0a7b, B:307:0x0a94, B:309:0x0a9c, B:310:0x0ab9, B:317:0x0aa8, B:318:0x0987, B:320:0x098c, B:322:0x0996, B:323:0x099c, B:328:0x09ae, B:329:0x09b4, B:333:0x0ac9, B:349:0x0127, B:369:0x01cb, B:394:0x0ade, B:395:0x0ae1, B:390:0x0233), top: B:2:0x000b, inners: #10 }] */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.measurement.zzjs] */
    /* JADX WARN: Type inference failed for: r4v108 */
    /* JADX WARN: Type inference failed for: r4v110 */
    /* JADX WARN: Type inference failed for: r4v118 */
    /* JADX WARN: Type inference failed for: r4v119, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v128 */
    /* JADX WARN: Type inference failed for: r4v130 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzd(java.lang.String r40, long r41) {
        /*
            Method dump skipped, instructions count: 2796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zzd(java.lang.String, long):boolean");
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzed zzedVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        com.google.android.gms.internal.measurement.zzfi zzim;
        java.lang.String str;
        java.lang.Object zzbm;
        java.lang.String zzbl;
        java.lang.Object value;
        com.google.android.gms.internal.measurement.zzfi zzim2;
        java.lang.String str2;
        java.lang.Object zzbm2;
        java.lang.String zzbl2;
        java.lang.Object obj;
        boolean z17;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzedVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzedVar.packageName);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzedVar.origin);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzedVar.zzaep);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzedVar.zzaep.name);
        zzab();
        zzkq();
        if (android.text.TextUtils.isEmpty(zzdzVar.zzadm)) {
            return;
        }
        if (!zzdzVar.zzadw) {
            zzg(zzdzVar);
            return;
        }
        com.google.android.gms.internal.measurement.zzed zzedVar2 = new com.google.android.gms.internal.measurement.zzed(zzedVar);
        boolean z18 = false;
        zzedVar2.active = false;
        zzix().beginTransaction();
        try {
            com.google.android.gms.internal.measurement.zzed zzi = zzix().zzi(zzedVar2.packageName, zzedVar2.zzaep.name);
            if (zzi != null && !zzi.origin.equals(zzedVar2.origin)) {
                zzge().zzip().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", zzga().zzbl(zzedVar2.zzaep.name), zzedVar2.origin, zzi.origin);
            }
            if (zzi != null && (z17 = zzi.active)) {
                zzedVar2.origin = zzi.origin;
                zzedVar2.creationTimestamp = zzi.creationTimestamp;
                zzedVar2.triggerTimeout = zzi.triggerTimeout;
                zzedVar2.triggerEventName = zzi.triggerEventName;
                zzedVar2.zzaer = zzi.zzaer;
                zzedVar2.active = z17;
                com.google.android.gms.internal.measurement.zzjx zzjxVar = zzedVar2.zzaep;
                zzedVar2.zzaep = new com.google.android.gms.internal.measurement.zzjx(zzjxVar.name, zzi.zzaep.zzaqz, zzjxVar.getValue(), zzi.zzaep.origin);
            } else if (android.text.TextUtils.isEmpty(zzedVar2.triggerEventName)) {
                com.google.android.gms.internal.measurement.zzjx zzjxVar2 = zzedVar2.zzaep;
                zzedVar2.zzaep = new com.google.android.gms.internal.measurement.zzjx(zzjxVar2.name, zzedVar2.creationTimestamp, zzjxVar2.getValue(), zzedVar2.zzaep.origin);
                z18 = true;
                zzedVar2.active = true;
            }
            if (zzedVar2.active) {
                com.google.android.gms.internal.measurement.zzjx zzjxVar3 = zzedVar2.zzaep;
                com.google.android.gms.internal.measurement.zzjz zzjzVar = new com.google.android.gms.internal.measurement.zzjz(zzedVar2.packageName, zzedVar2.origin, zzjxVar3.name, zzjxVar3.zzaqz, zzjxVar3.getValue());
                if (zzix().zza(zzjzVar)) {
                    zzim2 = zzge().zzis();
                    str2 = "User property updated immediately";
                    zzbm2 = zzedVar2.packageName;
                    zzbl2 = zzga().zzbl(zzjzVar.name);
                    obj = zzjzVar.value;
                } else {
                    zzim2 = zzge().zzim();
                    str2 = "(2)Too many active user properties, ignoring";
                    zzbm2 = com.google.android.gms.internal.measurement.zzfg.zzbm(zzedVar2.packageName);
                    zzbl2 = zzga().zzbl(zzjzVar.name);
                    obj = zzjzVar.value;
                }
                zzim2.zzd(str2, zzbm2, zzbl2, obj);
                if (z18 && zzedVar2.zzaer != null) {
                    zzc(new com.google.android.gms.internal.measurement.zzeu(zzedVar2.zzaer, zzedVar2.creationTimestamp), zzdzVar);
                }
            }
            if (zzix().zza(zzedVar2)) {
                zzim = zzge().zzis();
                str = "Conditional property added";
                zzbm = zzedVar2.packageName;
                zzbl = zzga().zzbl(zzedVar2.zzaep.name);
                value = zzedVar2.zzaep.getValue();
            } else {
                zzim = zzge().zzim();
                str = "Too many conditional properties, ignoring";
                zzbm = com.google.android.gms.internal.measurement.zzfg.zzbm(zzedVar2.packageName);
                zzbl = zzga().zzbl(zzedVar2.zzaep.name);
                value = zzedVar2.zzaep.getValue();
            }
            zzim.zzd(str, zzbm, zzbl, value);
            zzix().setTransactionSuccessful();
        } finally {
            zzix().endTransaction();
        }
    }

    public final void zzc(com.google.android.gms.internal.measurement.zzed zzedVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzedVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzedVar.packageName);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzedVar.zzaep);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzedVar.zzaep.name);
        zzab();
        zzkq();
        if (android.text.TextUtils.isEmpty(zzdzVar.zzadm)) {
            return;
        }
        if (!zzdzVar.zzadw) {
            zzg(zzdzVar);
            return;
        }
        zzix().beginTransaction();
        try {
            zzg(zzdzVar);
            com.google.android.gms.internal.measurement.zzed zzi = zzix().zzi(zzedVar.packageName, zzedVar.zzaep.name);
            if (zzi != null) {
                zzge().zzis().zze("Removing conditional user property", zzedVar.packageName, zzga().zzbl(zzedVar.zzaep.name));
                zzix().zzj(zzedVar.packageName, zzedVar.zzaep.name);
                if (zzi.active) {
                    zzix().zzg(zzedVar.packageName, zzedVar.zzaep.name);
                }
                com.google.android.gms.internal.measurement.zzeu zzeuVar = zzedVar.zzaes;
                if (zzeuVar != null) {
                    com.google.android.gms.internal.measurement.zzer zzerVar = zzeuVar.zzafq;
                    android.os.Bundle zzif = zzerVar != null ? zzerVar.zzif() : null;
                    com.google.android.gms.internal.measurement.zzka zzgb = zzgb();
                    com.google.android.gms.internal.measurement.zzeu zzeuVar2 = zzedVar.zzaes;
                    zzc(zzgb.zza(zzeuVar2.name, zzif, zzi.origin, zzeuVar2.zzagb, true, false), zzdzVar);
                }
            } else {
                zzge().zzip().zze("Conditional user property doesn't exist", com.google.android.gms.internal.measurement.zzfg.zzbm(zzedVar.packageName), zzga().zzbl(zzedVar.zzaep.name));
            }
            zzix().setTransactionSuccessful();
        } finally {
            zzix().endTransaction();
        }
    }

    public final void zzg(java.lang.Runnable runnable) {
        zzab();
        if (this.zzaqi == null) {
            this.zzaqi = new java.util.ArrayList();
        }
        this.zzaqi.add(runnable);
    }

    private final com.google.android.gms.internal.measurement.zzdz zza(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, boolean z19, long j17) {
        java.lang.String str3;
        int i17;
        java.lang.String str4;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            zzge().zzim().log("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str3 = packageManager.getInstallerPackageName(str);
        } catch (java.lang.IllegalArgumentException unused) {
            zzge().zzim().zzg("Error retrieving installer package name. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str));
            str3 = "Unknown";
        }
        if (str3 == null) {
            str3 = "manual_install";
        } else if ("com.android.vending".equals(str3)) {
            str3 = "";
        }
        java.lang.String str5 = str3;
        try {
            android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(str, 0);
            if (packageInfo != null) {
                java.lang.CharSequence applicationLabel = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationLabel(str);
                if (!android.text.TextUtils.isEmpty(applicationLabel)) {
                    applicationLabel.toString();
                }
                java.lang.String str6 = packageInfo.versionName;
                i17 = packageInfo.versionCode;
                str4 = str6;
            } else {
                i17 = Integer.MIN_VALUE;
                str4 = "Unknown";
            }
            return new com.google.android.gms.internal.measurement.zzdz(str, str2, str4, i17, str5, 12451L, zzgb().zzd(context, str), (java.lang.String) null, z17, false, "", 0L, zzgg().zzba(str) ? j17 : 0L, 0, z18, z19, false);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            zzge().zzim().zze("Error retrieving newly installed package info. appId, appName", com.google.android.gms.internal.measurement.zzfg.zzbm(str), "Unknown");
            return null;
        }
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzeu zzeuVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        java.util.List<com.google.android.gms.internal.measurement.zzed> zzb;
        java.util.List<com.google.android.gms.internal.measurement.zzed> zzb2;
        java.util.List<com.google.android.gms.internal.measurement.zzed> zzb3;
        com.google.android.gms.internal.measurement.zzfi zzim;
        java.lang.String str;
        java.lang.Object zzbm;
        java.lang.String zzbl;
        java.lang.Object obj;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzdzVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzdzVar.packageName);
        zzab();
        zzkq();
        java.lang.String str2 = zzdzVar.packageName;
        long j17 = zzeuVar.zzagb;
        zzgb();
        if (com.google.android.gms.internal.measurement.zzka.zzd(zzeuVar, zzdzVar)) {
            if (!zzdzVar.zzadw) {
                zzg(zzdzVar);
                return;
            }
            zzix().beginTransaction();
            try {
                com.google.android.gms.internal.measurement.zzei zzix = zzix();
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
                zzix.zzab();
                zzix.zzch();
                if (j17 < 0) {
                    zzix.zzge().zzip().zze("Invalid time querying timed out conditional properties", com.google.android.gms.internal.measurement.zzfg.zzbm(str2), java.lang.Long.valueOf(j17));
                    zzb = java.util.Collections.emptyList();
                } else {
                    zzb = zzix.zzb("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new java.lang.String[]{str2, java.lang.String.valueOf(j17)});
                }
                for (com.google.android.gms.internal.measurement.zzed zzedVar : zzb) {
                    if (zzedVar != null) {
                        zzge().zzis().zzd("User property timed out", zzedVar.packageName, zzga().zzbl(zzedVar.zzaep.name), zzedVar.zzaep.getValue());
                        if (zzedVar.zzaeq != null) {
                            zzc(new com.google.android.gms.internal.measurement.zzeu(zzedVar.zzaeq, j17), zzdzVar);
                        }
                        zzix().zzj(str2, zzedVar.zzaep.name);
                    }
                }
                com.google.android.gms.internal.measurement.zzei zzix2 = zzix();
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
                zzix2.zzab();
                zzix2.zzch();
                if (j17 < 0) {
                    zzix2.zzge().zzip().zze("Invalid time querying expired conditional properties", com.google.android.gms.internal.measurement.zzfg.zzbm(str2), java.lang.Long.valueOf(j17));
                    zzb2 = java.util.Collections.emptyList();
                } else {
                    zzb2 = zzix2.zzb("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new java.lang.String[]{str2, java.lang.String.valueOf(j17)});
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(zzb2.size());
                for (com.google.android.gms.internal.measurement.zzed zzedVar2 : zzb2) {
                    if (zzedVar2 != null) {
                        zzge().zzis().zzd("User property expired", zzedVar2.packageName, zzga().zzbl(zzedVar2.zzaep.name), zzedVar2.zzaep.getValue());
                        zzix().zzg(str2, zzedVar2.zzaep.name);
                        com.google.android.gms.internal.measurement.zzeu zzeuVar2 = zzedVar2.zzaes;
                        if (zzeuVar2 != null) {
                            arrayList.add(zzeuVar2);
                        }
                        zzix().zzj(str2, zzedVar2.zzaep.name);
                    }
                }
                int size = arrayList.size();
                int i17 = 0;
                while (i17 < size) {
                    java.lang.Object obj2 = arrayList.get(i17);
                    i17++;
                    zzc(new com.google.android.gms.internal.measurement.zzeu((com.google.android.gms.internal.measurement.zzeu) obj2, j17), zzdzVar);
                }
                com.google.android.gms.internal.measurement.zzei zzix3 = zzix();
                java.lang.String str3 = zzeuVar.name;
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
                zzix3.zzab();
                zzix3.zzch();
                if (j17 < 0) {
                    zzix3.zzge().zzip().zzd("Invalid time querying triggered conditional properties", com.google.android.gms.internal.measurement.zzfg.zzbm(str2), zzix3.zzga().zzbj(str3), java.lang.Long.valueOf(j17));
                    zzb3 = java.util.Collections.emptyList();
                } else {
                    zzb3 = zzix3.zzb("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new java.lang.String[]{str2, str3, java.lang.String.valueOf(j17)});
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(zzb3.size());
                for (com.google.android.gms.internal.measurement.zzed zzedVar3 : zzb3) {
                    if (zzedVar3 != null) {
                        com.google.android.gms.internal.measurement.zzjx zzjxVar = zzedVar3.zzaep;
                        com.google.android.gms.internal.measurement.zzjz zzjzVar = new com.google.android.gms.internal.measurement.zzjz(zzedVar3.packageName, zzedVar3.origin, zzjxVar.name, j17, zzjxVar.getValue());
                        if (zzix().zza(zzjzVar)) {
                            zzim = zzge().zzis();
                            str = "User property triggered";
                            zzbm = zzedVar3.packageName;
                            zzbl = zzga().zzbl(zzjzVar.name);
                            obj = zzjzVar.value;
                        } else {
                            zzim = zzge().zzim();
                            str = "Too many active user properties, ignoring";
                            zzbm = com.google.android.gms.internal.measurement.zzfg.zzbm(zzedVar3.packageName);
                            zzbl = zzga().zzbl(zzjzVar.name);
                            obj = zzjzVar.value;
                        }
                        zzim.zzd(str, zzbm, zzbl, obj);
                        com.google.android.gms.internal.measurement.zzeu zzeuVar3 = zzedVar3.zzaer;
                        if (zzeuVar3 != null) {
                            arrayList2.add(zzeuVar3);
                        }
                        zzedVar3.zzaep = new com.google.android.gms.internal.measurement.zzjx(zzjzVar);
                        zzedVar3.active = true;
                        zzix().zza(zzedVar3);
                    }
                }
                zzc(zzeuVar, zzdzVar);
                int size2 = arrayList2.size();
                int i18 = 0;
                while (i18 < size2) {
                    java.lang.Object obj3 = arrayList2.get(i18);
                    i18++;
                    zzc(new com.google.android.gms.internal.measurement.zzeu((com.google.android.gms.internal.measurement.zzeu) obj3, j17), zzdzVar);
                }
                zzix().setTransactionSuccessful();
            } finally {
                zzix().endTransaction();
            }
        }
    }

    public final void zzc(com.google.android.gms.internal.measurement.zzeu zzeuVar, java.lang.String str) {
        com.google.android.gms.internal.measurement.zzdy zzbc = zzix().zzbc(str);
        if (zzbc == null || android.text.TextUtils.isEmpty(zzbc.zzag())) {
            zzge().zzis().zzg("No app data available; dropping event", str);
            return;
        }
        java.lang.Boolean zzc = zzc(zzbc);
        if (zzc == null) {
            if (!"_ui".equals(zzeuVar.name)) {
                zzge().zzip().zzg("Could not find package. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str));
            }
        } else if (!zzc.booleanValue()) {
            zzge().zzim().zzg("App version does not match; dropping event. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str));
            return;
        }
        zzb(zzeuVar, new com.google.android.gms.internal.measurement.zzdz(str, zzbc.getGmpAppId(), zzbc.zzag(), zzbc.zzgm(), zzbc.zzgn(), zzbc.zzgo(), zzbc.zzgp(), (java.lang.String) null, zzbc.isMeasurementEnabled(), false, zzbc.zzgj(), zzbc.zzhc(), 0L, 0, zzbc.zzhd(), zzbc.zzhe(), false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0142, code lost:
    
        zzgf().zzajw.set(zzbt().currentTimeMillis());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(int r10, java.lang.Throwable r11, byte[] r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zza(int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzjq zzjqVar) {
        this.zzaqj++;
    }

    public final void zzc(com.google.android.gms.internal.measurement.zzjx zzjxVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        zzab();
        zzkq();
        if (android.text.TextUtils.isEmpty(zzdzVar.zzadm)) {
            return;
        }
        if (!zzdzVar.zzadw) {
            zzg(zzdzVar);
            return;
        }
        zzge().zzis().zzg("Removing user property", zzga().zzbl(zzjxVar.name));
        zzix().beginTransaction();
        try {
            zzg(zzdzVar);
            zzix().zzg(zzdzVar.packageName, zzjxVar.name);
            zzix().setTransactionSuccessful();
            zzge().zzis().zzg("User property removed", zzga().zzbl(zzjxVar.name));
        } finally {
            zzix().endTransaction();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0565, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzc(com.google.android.gms.internal.measurement.zzeu r34, com.google.android.gms.internal.measurement.zzdz r35) {
        /*
            Method dump skipped, instructions count: 1563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zzc(com.google.android.gms.internal.measurement.zzeu, com.google.android.gms.internal.measurement.zzdz):void");
    }

    public final void zza(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        this.zzacw = zzglVar;
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzjx zzjxVar, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        zzab();
        zzkq();
        if (android.text.TextUtils.isEmpty(zzdzVar.zzadm)) {
            return;
        }
        if (!zzdzVar.zzadw) {
            zzg(zzdzVar);
            return;
        }
        int zzcf = zzgb().zzcf(zzjxVar.name);
        int i17 = 0;
        if (zzcf != 0) {
            zzgb();
            java.lang.String zza = com.google.android.gms.internal.measurement.zzka.zza(zzjxVar.name, 24, true);
            java.lang.String str = zzjxVar.name;
            zzgb().zza(zzdzVar.packageName, zzcf, "_ev", zza, str != null ? str.length() : 0);
            return;
        }
        int zzi = zzgb().zzi(zzjxVar.name, zzjxVar.getValue());
        if (zzi != 0) {
            zzgb();
            java.lang.String zza2 = com.google.android.gms.internal.measurement.zzka.zza(zzjxVar.name, 24, true);
            java.lang.Object value = zzjxVar.getValue();
            if (value != null && ((value instanceof java.lang.String) || (value instanceof java.lang.CharSequence))) {
                i17 = java.lang.String.valueOf(value).length();
            }
            zzgb().zza(zzdzVar.packageName, zzi, "_ev", zza2, i17);
            return;
        }
        java.lang.Object zzj = zzgb().zzj(zzjxVar.name, zzjxVar.getValue());
        if (zzj == null) {
            return;
        }
        com.google.android.gms.internal.measurement.zzjz zzjzVar = new com.google.android.gms.internal.measurement.zzjz(zzdzVar.packageName, zzjxVar.origin, zzjxVar.name, zzjxVar.zzaqz, zzj);
        zzge().zzis().zze("Setting user property", zzga().zzbl(zzjzVar.name), zzj);
        zzix().beginTransaction();
        try {
            zzg(zzdzVar);
            boolean zza3 = zzix().zza(zzjzVar);
            zzix().setTransactionSuccessful();
            if (zza3) {
                zzge().zzis().zze("User property set", zzga().zzbl(zzjzVar.name), zzjzVar.value);
            } else {
                zzge().zzim().zze("Too many unique user properties are set. Ignoring user property", zzga().zzbl(zzjzVar.name), zzjzVar.value);
                zzgb().zza(zzdzVar.packageName, 9, (java.lang.String) null, (java.lang.String) null, 0);
            }
        } finally {
            zzix().endTransaction();
        }
    }

    private static void zza(com.google.android.gms.internal.measurement.zzjq zzjqVar) {
        if (zzjqVar == null) {
            throw new java.lang.IllegalStateException("Upload component not created");
        }
        if (zzjqVar.isInitialized()) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(zzjqVar.getClass());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 27);
        sb6.append("Component not initialized: ");
        sb6.append(valueOf);
        throw new java.lang.IllegalStateException(sb6.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        zzgf().zzajw.set(zzbt().currentTimeMillis());
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120 A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:5:0x0027, B:12:0x0043, B:13:0x0157, B:24:0x005d, B:31:0x00a4, B:32:0x00b5, B:35:0x00bd, B:37:0x00c9, B:39:0x00cf, B:43:0x00dc, B:46:0x010c, B:48:0x0120, B:49:0x0144, B:51:0x014e, B:53:0x0154, B:54:0x012e, B:55:0x00f3, B:57:0x00fd), top: B:4:0x0027, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:5:0x0027, B:12:0x0043, B:13:0x0157, B:24:0x005d, B:31:0x00a4, B:32:0x00b5, B:35:0x00bd, B:37:0x00c9, B:39:0x00cf, B:43:0x00dc, B:46:0x010c, B:48:0x0120, B:49:0x0144, B:51:0x014e, B:53:0x0154, B:54:0x012e, B:55:0x00f3, B:57:0x00fd), top: B:4:0x0027, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zzb(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void zza(com.google.android.gms.internal.measurement.zzjw zzjwVar) {
        zzab();
        com.google.android.gms.internal.measurement.zzei zzeiVar = new com.google.android.gms.internal.measurement.zzei(this.zzacw);
        zzeiVar.zzm();
        this.zzaqc = zzeiVar;
        zzgg().zza(this.zzaqa);
        com.google.android.gms.internal.measurement.zzeb zzebVar = new com.google.android.gms.internal.measurement.zzeb(this.zzacw);
        zzebVar.zzm();
        this.zzaqf = zzebVar;
        com.google.android.gms.internal.measurement.zzjn zzjnVar = new com.google.android.gms.internal.measurement.zzjn(this.zzacw);
        zzjnVar.zzm();
        this.zzaqe = zzjnVar;
        this.zzaqd = new com.google.android.gms.internal.measurement.zzfp(this.zzacw);
        if (this.zzaqj != this.zzaqk) {
            zzge().zzim().zze("Not all upload components initialized", java.lang.Integer.valueOf(this.zzaqj), java.lang.Integer.valueOf(this.zzaqk));
        }
        this.zzvo = true;
    }

    private final boolean zza(int i17, java.nio.channels.FileChannel fileChannel) {
        zzab();
        if (fileChannel == null || !fileChannel.isOpen()) {
            zzge().zzim().log("Bad channel to read from");
            return false;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.putInt(i17);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                zzge().zzim().zzg("Error writing to channel. Bytes written", java.lang.Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (java.io.IOException e17) {
            zzge().zzim().zzg("Failed to write to channel", e17);
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:15|(1:17)(1:33)|18|(2:20|(3:22|23|(1:25)))|26|27|28|29|23|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
    
        r0.zzge().zzim().zze("Error pruning currencies. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(r14), r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zza(java.lang.String r14, com.google.android.gms.internal.measurement.zzeu r15) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjr.zza(java.lang.String, com.google.android.gms.internal.measurement.zzeu):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte[] zza(com.google.android.gms.internal.measurement.zzeu zzeuVar, java.lang.String str) {
        com.google.android.gms.internal.measurement.zzjz zzjzVar;
        com.google.android.gms.internal.measurement.zzkq zzkqVar;
        com.google.android.gms.internal.measurement.zzkp zzkpVar;
        com.google.android.gms.internal.measurement.zzdy zzdyVar;
        byte[] bArr;
        android.os.Bundle bundle;
        long j17;
        com.google.android.gms.internal.measurement.zzfi zzip;
        java.lang.String str2;
        java.lang.Object zzbm;
        zzkq();
        zzab();
        com.google.android.gms.internal.measurement.zzgl.zzfr();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzeuVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzkp zzkpVar2 = new com.google.android.gms.internal.measurement.zzkp();
        zzix().beginTransaction();
        try {
            com.google.android.gms.internal.measurement.zzdy zzbc = zzix().zzbc(str);
            if (zzbc == null) {
                zzge().zzis().zzg("Log and bundle not available. package_name", str);
            } else {
                if (zzbc.isMeasurementEnabled()) {
                    if (("_iap".equals(zzeuVar.name) || ya.a.ECOMMERCE_PURCHASE.equals(zzeuVar.name)) && !zza(str, zzeuVar)) {
                        zzge().zzip().zzg("Failed to handle purchase event at single event bundle creation. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str));
                    }
                    boolean zzav = zzgg().zzav(str);
                    java.lang.Long l17 = 0L;
                    if (zzav && "_e".equals(zzeuVar.name)) {
                        com.google.android.gms.internal.measurement.zzer zzerVar = zzeuVar.zzafq;
                        if (zzerVar != null && zzerVar.size() != 0) {
                            if (zzeuVar.zzafq.getLong("_et") == null) {
                                zzip = zzge().zzip();
                                str2 = "The engagement event does not include duration. appId";
                                zzbm = com.google.android.gms.internal.measurement.zzfg.zzbm(str);
                                zzip.zzg(str2, zzbm);
                            } else {
                                l17 = zzeuVar.zzafq.getLong("_et");
                            }
                        }
                        zzip = zzge().zzip();
                        str2 = "The engagement event does not contain any parameters. appId";
                        zzbm = com.google.android.gms.internal.measurement.zzfg.zzbm(str);
                        zzip.zzg(str2, zzbm);
                    }
                    com.google.android.gms.internal.measurement.zzkq zzkqVar2 = new com.google.android.gms.internal.measurement.zzkq();
                    zzkpVar2.zzatf = new com.google.android.gms.internal.measurement.zzkq[]{zzkqVar2};
                    zzkqVar2.zzath = 1;
                    zzkqVar2.zzatp = com.eclipsesource.mmv8.Platform.ANDROID;
                    zzkqVar2.zzti = zzbc.zzah();
                    zzkqVar2.zzadt = zzbc.zzgn();
                    zzkqVar2.zzth = zzbc.zzag();
                    long zzgm = zzbc.zzgm();
                    zzkqVar2.zzaub = zzgm == -2147483648L ? null : java.lang.Integer.valueOf((int) zzgm);
                    zzkqVar2.zzatt = java.lang.Long.valueOf(zzbc.zzgo());
                    zzkqVar2.zzadm = zzbc.getGmpAppId();
                    zzkqVar2.zzatx = java.lang.Long.valueOf(zzbc.zzgp());
                    if (this.zzacw.isEnabled() && com.google.android.gms.internal.measurement.zzef.zzhk() && zzgg().zzat(zzkqVar2.zzti)) {
                        zzkqVar2.zzauh = null;
                    }
                    android.util.Pair<java.lang.String, java.lang.Boolean> zzbo = zzgf().zzbo(zzbc.zzah());
                    if (zzbc.zzhd() && zzbo != null && !android.text.TextUtils.isEmpty((java.lang.CharSequence) zzbo.first)) {
                        zzkqVar2.zzatv = (java.lang.String) zzbo.first;
                        zzkqVar2.zzatw = (java.lang.Boolean) zzbo.second;
                    }
                    zzfw().zzch();
                    zzkqVar2.zzatr = android.os.Build.MODEL;
                    zzfw().zzch();
                    zzkqVar2.zzatq = android.os.Build.VERSION.RELEASE;
                    zzkqVar2.zzats = java.lang.Integer.valueOf((int) zzfw().zzic());
                    zzkqVar2.zzafn = zzfw().zzid();
                    zzkqVar2.zzadl = zzbc.getAppInstanceId();
                    zzkqVar2.zzado = zzbc.zzgj();
                    java.util.List<com.google.android.gms.internal.measurement.zzjz> zzbb = zzix().zzbb(zzbc.zzah());
                    zzkqVar2.zzatj = new com.google.android.gms.internal.measurement.zzks[zzbb.size()];
                    if (zzav) {
                        zzjzVar = zzix().zzh(zzkqVar2.zzti, "_lte");
                        if (zzjzVar != null && zzjzVar.value != null) {
                            if (l17.longValue() > 0) {
                                zzjzVar = new com.google.android.gms.internal.measurement.zzjz(zzkqVar2.zzti, "auto", "_lte", zzbt().currentTimeMillis(), java.lang.Long.valueOf(((java.lang.Long) zzjzVar.value).longValue() + l17.longValue()));
                            }
                        }
                        zzjzVar = new com.google.android.gms.internal.measurement.zzjz(zzkqVar2.zzti, "auto", "_lte", zzbt().currentTimeMillis(), l17);
                    } else {
                        zzjzVar = null;
                    }
                    int i17 = 0;
                    com.google.android.gms.internal.measurement.zzks zzksVar = null;
                    while (i17 < zzbb.size()) {
                        com.google.android.gms.internal.measurement.zzks zzksVar2 = new com.google.android.gms.internal.measurement.zzks();
                        zzkqVar2.zzatj[i17] = zzksVar2;
                        zzksVar2.name = zzbb.get(i17).name;
                        com.google.android.gms.internal.measurement.zzdy zzdyVar2 = zzbc;
                        com.google.android.gms.internal.measurement.zzkp zzkpVar3 = zzkpVar2;
                        zzksVar2.zzaun = java.lang.Long.valueOf(zzbb.get(i17).zzaqz);
                        zzgb().zza(zzksVar2, zzbb.get(i17).value);
                        if (zzav && "_lte".equals(zzksVar2.name)) {
                            zzksVar2.zzate = (java.lang.Long) zzjzVar.value;
                            zzksVar2.zzaun = java.lang.Long.valueOf(zzbt().currentTimeMillis());
                            zzksVar = zzksVar2;
                        }
                        i17++;
                        zzkpVar2 = zzkpVar3;
                        zzbc = zzdyVar2;
                    }
                    com.google.android.gms.internal.measurement.zzdy zzdyVar3 = zzbc;
                    com.google.android.gms.internal.measurement.zzkp zzkpVar4 = zzkpVar2;
                    if (zzav && zzksVar == null) {
                        com.google.android.gms.internal.measurement.zzks zzksVar3 = new com.google.android.gms.internal.measurement.zzks();
                        zzksVar3.name = "_lte";
                        zzksVar3.zzaun = java.lang.Long.valueOf(zzbt().currentTimeMillis());
                        zzksVar3.zzate = (java.lang.Long) zzjzVar.value;
                        com.google.android.gms.internal.measurement.zzks[] zzksVarArr = zzkqVar2.zzatj;
                        com.google.android.gms.internal.measurement.zzks[] zzksVarArr2 = (com.google.android.gms.internal.measurement.zzks[]) java.util.Arrays.copyOf(zzksVarArr, zzksVarArr.length + 1);
                        zzkqVar2.zzatj = zzksVarArr2;
                        zzksVarArr2[zzksVarArr2.length - 1] = zzksVar3;
                    }
                    if (l17.longValue() > 0) {
                        zzix().zza(zzjzVar);
                    }
                    android.os.Bundle zzif = zzeuVar.zzafq.zzif();
                    if ("_iap".equals(zzeuVar.name)) {
                        zzif.putLong("_c", 1L);
                        zzge().zzis().log("Marking in-app purchase as real-time");
                        zzif.putLong("_r", 1L);
                    }
                    zzif.putString("_o", zzeuVar.origin);
                    if (zzgb().zzcj(zzkqVar2.zzti)) {
                        zzgb().zza(zzif, "_dbg", (java.lang.Object) 1L);
                        zzgb().zza(zzif, "_r", (java.lang.Object) 1L);
                    }
                    com.google.android.gms.internal.measurement.zzeq zzf = zzix().zzf(str, zzeuVar.name);
                    if (zzf == null) {
                        bArr = null;
                        zzkqVar = zzkqVar2;
                        zzdyVar = zzdyVar3;
                        zzkpVar = zzkpVar4;
                        bundle = zzif;
                        zzix().zza(new com.google.android.gms.internal.measurement.zzeq(str, zzeuVar.name, 1L, 0L, zzeuVar.zzagb, 0L, null, null, null));
                        j17 = 0;
                    } else {
                        zzkqVar = zzkqVar2;
                        zzkpVar = zzkpVar4;
                        zzdyVar = zzdyVar3;
                        bArr = null;
                        bundle = zzif;
                        long j18 = zzf.zzaft;
                        zzix().zza(zzf.zzac(zzeuVar.zzagb).zzie());
                        j17 = j18;
                    }
                    com.google.android.gms.internal.measurement.zzep zzepVar = new com.google.android.gms.internal.measurement.zzep(this.zzacw, zzeuVar.origin, str, zzeuVar.name, zzeuVar.zzagb, j17, bundle);
                    com.google.android.gms.internal.measurement.zzkn zzknVar = new com.google.android.gms.internal.measurement.zzkn();
                    com.google.android.gms.internal.measurement.zzkq zzkqVar3 = zzkqVar;
                    zzkqVar3.zzati = new com.google.android.gms.internal.measurement.zzkn[]{zzknVar};
                    zzknVar.zzatb = java.lang.Long.valueOf(zzepVar.timestamp);
                    zzknVar.name = zzepVar.name;
                    zzknVar.zzatc = java.lang.Long.valueOf(zzepVar.zzafp);
                    zzknVar.zzata = new com.google.android.gms.internal.measurement.zzko[zzepVar.zzafq.size()];
                    java.util.Iterator<java.lang.String> it = zzepVar.zzafq.iterator();
                    int i18 = 0;
                    while (it.hasNext()) {
                        java.lang.String next = it.next();
                        com.google.android.gms.internal.measurement.zzko zzkoVar = new com.google.android.gms.internal.measurement.zzko();
                        zzknVar.zzata[i18] = zzkoVar;
                        zzkoVar.name = next;
                        zzgb().zza(zzkoVar, zzepVar.zzafq.get(next));
                        i18++;
                    }
                    zzkqVar3.zzaua = zza(zzdyVar.zzah(), zzkqVar3.zzatj, zzkqVar3.zzati);
                    java.lang.Long l18 = zzknVar.zzatb;
                    zzkqVar3.zzatl = l18;
                    zzkqVar3.zzatm = l18;
                    long zzgl = zzdyVar.zzgl();
                    zzkqVar3.zzato = zzgl != 0 ? java.lang.Long.valueOf(zzgl) : bArr;
                    long zzgk = zzdyVar.zzgk();
                    if (zzgk != 0) {
                        zzgl = zzgk;
                    }
                    zzkqVar3.zzatn = zzgl != 0 ? java.lang.Long.valueOf(zzgl) : bArr;
                    zzdyVar.zzgt();
                    zzkqVar3.zzaty = java.lang.Integer.valueOf((int) zzdyVar.zzgq());
                    zzkqVar3.zzatu = 12451L;
                    zzkqVar3.zzatk = java.lang.Long.valueOf(zzbt().currentTimeMillis());
                    zzkqVar3.zzatz = java.lang.Boolean.TRUE;
                    com.google.android.gms.internal.measurement.zzdy zzdyVar4 = zzdyVar;
                    zzdyVar4.zzm(zzkqVar3.zzatl.longValue());
                    zzdyVar4.zzn(zzkqVar3.zzatm.longValue());
                    zzix().zza(zzdyVar4);
                    zzix().setTransactionSuccessful();
                    try {
                        int zzvm = zzkpVar.zzvm();
                        byte[] bArr2 = new byte[zzvm];
                        com.google.android.gms.internal.measurement.zzabw zzb = com.google.android.gms.internal.measurement.zzabw.zzb(bArr2, 0, zzvm);
                        zzkpVar.zza(zzb);
                        zzb.zzve();
                        return zzgb().zza(bArr2);
                    } catch (java.io.IOException e17) {
                        zzge().zzim().zze("Data loss. Failed to bundle and serialize. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e17);
                        return bArr;
                    }
                }
                zzge().zzis().zzg("Log and bundle disabled. package_name", str);
            }
            return new byte[0];
        } finally {
            zzix().endTransaction();
        }
    }

    private final com.google.android.gms.internal.measurement.zzkm[] zza(java.lang.String str, com.google.android.gms.internal.measurement.zzks[] zzksVarArr, com.google.android.gms.internal.measurement.zzkn[] zzknVarArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        return zziw().zza(str, zzknVarArr, zzksVarArr);
    }
}
