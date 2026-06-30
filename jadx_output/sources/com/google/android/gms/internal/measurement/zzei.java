package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzei extends com.google.android.gms.internal.measurement.zzjq {
    private static final java.lang.String[] zzaev = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};
    private static final java.lang.String[] zzaew = {ya.b.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final java.lang.String[] zzaex = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;"};
    private static final java.lang.String[] zzaey = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final java.lang.String[] zzaez = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final java.lang.String[] zzafa = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final com.google.android.gms.internal.measurement.zzel zzafb;
    private final com.google.android.gms.internal.measurement.zzjm zzafc;

    public zzei(com.google.android.gms.internal.measurement.zzjr zzjrVar) {
        super(zzjrVar);
        this.zzafc = new com.google.android.gms.internal.measurement.zzjm(zzbt());
        this.zzafb = new com.google.android.gms.internal.measurement.zzel(this, getContext(), "google_app_measurement.db");
    }

    private final boolean zzhv() {
        return getContext().getDatabasePath("google_app_measurement.db").exists();
    }

    public final void beginTransaction() {
        zzch();
        getWritableDatabase().beginTransaction();
    }

    public final void endTransaction() {
        zzch();
        getWritableDatabase().endTransaction();
    }

    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        zzab();
        try {
            return this.zzafb.getWritableDatabase();
        } catch (android.database.sqlite.SQLiteException e17) {
            zzge().zzip().zzg("Error opening database", e17);
            throw e17;
        }
    }

    public final void setTransactionSuccessful() {
        zzch();
        getWritableDatabase().setTransactionSuccessful();
    }

    public final long zza(com.google.android.gms.internal.measurement.zzkq zzkqVar) {
        long zzc;
        zzab();
        zzch();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkqVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzkqVar.zzti);
        try {
            int zzvm = zzkqVar.zzvm();
            byte[] bArr = new byte[zzvm];
            com.google.android.gms.internal.measurement.zzabw zzb = com.google.android.gms.internal.measurement.zzabw.zzb(bArr, 0, zzvm);
            zzkqVar.zza(zzb);
            zzb.zzve();
            com.google.android.gms.internal.measurement.zzka zzgb = zzgb();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
            zzgb.zzab();
            java.security.MessageDigest messageDigest = com.google.android.gms.internal.measurement.zzka.getMessageDigest("MD5");
            if (messageDigest == null) {
                zzgb.zzge().zzim().log("Failed to get MD5");
                zzc = 0;
            } else {
                zzc = com.google.android.gms.internal.measurement.zzka.zzc(messageDigest.digest(bArr));
            }
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, zzkqVar.zzti);
            contentValues.put("metadata_fingerprint", java.lang.Long.valueOf(zzc));
            contentValues.put("metadata", bArr);
            try {
                getWritableDatabase().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                return zzc;
            } catch (android.database.sqlite.SQLiteException e17) {
                zzge().zzim().zze("Error storing raw event metadata. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(zzkqVar.zzti), e17);
                throw e17;
            }
        } catch (java.io.IOException e18) {
            zzge().zzim().zze("Data loss. Failed to serialize event metadata. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(zzkqVar.zzti), e18);
            throw e18;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzab(long r5) {
        /*
            r4 = this;
            r4.zzab()
            r4.zzch()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            if (r1 != 0) goto L32
            com.google.android.gms.internal.measurement.zzfg r6 = r4.zzge()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            com.google.android.gms.internal.measurement.zzfi r6 = r6.zzit()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.log(r1)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r0
        L32:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r6
        L3a:
            r6 = move-exception
            goto L40
        L3c:
            r6 = move-exception
            goto L55
        L3e:
            r6 = move-exception
            r5 = r0
        L40:
            com.google.android.gms.internal.measurement.zzfg r1 = r4.zzge()     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzim()     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "Error selecting expired configs"
            r1.zzg(r2, r6)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L52
            r5.close()
        L52:
            return r0
        L53:
            r6 = move-exception
            r0 = r5
        L55:
            if (r0 == 0) goto L5a
            r0.close()
        L5a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzab(long):java.lang.String");
    }

    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzkq, java.lang.Long>> zzb(java.lang.String str, int i17, int i18) {
        byte[] zzb;
        zzab();
        zzch();
        com.google.android.gms.common.internal.Preconditions.checkArgument(i17 > 0);
        com.google.android.gms.common.internal.Preconditions.checkArgument(i18 > 0);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor query = getWritableDatabase().query("queue", new java.lang.String[]{"rowid", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "retry_count"}, "app_id=?", new java.lang.String[]{str}, null, null, "rowid", java.lang.String.valueOf(i17));
                if (!query.moveToFirst()) {
                    java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzkq, java.lang.Long>> emptyList = java.util.Collections.emptyList();
                    query.close();
                    return emptyList;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i19 = 0;
                do {
                    long j17 = query.getLong(0);
                    try {
                        zzb = zzgb().zzb(query.getBlob(1));
                    } catch (java.io.IOException e17) {
                        zzge().zzim().zze("Failed to unzip queued bundle. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e17);
                    }
                    if (!arrayList.isEmpty() && zzb.length + i19 > i18) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzabv zza = com.google.android.gms.internal.measurement.zzabv.zza(zzb, 0, zzb.length);
                    com.google.android.gms.internal.measurement.zzkq zzkqVar = new com.google.android.gms.internal.measurement.zzkq();
                    try {
                        zzkqVar.zzb(zza);
                        if (!query.isNull(2)) {
                            zzkqVar.zzauj = java.lang.Integer.valueOf(query.getInt(2));
                        }
                        i19 += zzb.length;
                        arrayList.add(android.util.Pair.create(zzkqVar, java.lang.Long.valueOf(j17)));
                    } catch (java.io.IOException e18) {
                        zzge().zzim().zze("Failed to merge queued bundle. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e18);
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } while (i19 <= i18);
                query.close();
                return arrayList;
            } catch (android.database.sqlite.SQLiteException e19) {
                zzge().zzim().zze("Error querying bundles. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e19);
                java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzkq, java.lang.Long>> emptyList2 = java.util.Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (java.lang.Throwable th6) {
            if (0 != 0) {
                cursor.close();
            }
            throw th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.internal.measurement.zzjz> zzbb(java.lang.String r17) {
        /*
            r16 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r17)
            r16.zzab()
            r16.zzch()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r16.getWritableDatabase()     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r17}     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L88 android.database.sqlite.SQLiteException -> L8c
            if (r3 != 0) goto L46
            r2.close()
            return r0
        L46:
            java.lang.String r7 = r2.getString(r11)     // Catch: java.lang.Throwable -> L88 android.database.sqlite.SQLiteException -> L8c
            java.lang.String r3 = r2.getString(r12)     // Catch: java.lang.Throwable -> L88 android.database.sqlite.SQLiteException -> L8c
            if (r3 != 0) goto L52
            java.lang.String r3 = ""
        L52:
            r6 = r3
            long r8 = r2.getLong(r13)     // Catch: java.lang.Throwable -> L88 android.database.sqlite.SQLiteException -> L8c
            r3 = r16
            java.lang.Object r10 = r3.zza(r2, r14)     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            if (r10 != 0) goto L71
            com.google.android.gms.internal.measurement.zzfg r4 = r16.zzge()     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzim()     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            java.lang.String r5 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzfg.zzbm(r17)     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            r4.zzg(r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            goto L7c
        L71:
            com.google.android.gms.internal.measurement.zzjz r15 = new com.google.android.gms.internal.measurement.zzjz     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            r4 = r15
            r5 = r17
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            r0.add(r15)     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
        L7c:
            boolean r4 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            if (r4 != 0) goto L46
            r2.close()
            return r0
        L86:
            r0 = move-exception
            goto L98
        L88:
            r0 = move-exception
            r3 = r16
            goto Lb0
        L8c:
            r0 = move-exception
            r3 = r16
            goto L98
        L90:
            r0 = move-exception
            r3 = r16
            goto Lb1
        L94:
            r0 = move-exception
            r3 = r16
            r2 = r1
        L98:
            com.google.android.gms.internal.measurement.zzfg r4 = r16.zzge()     // Catch: java.lang.Throwable -> Laf
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzim()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "Error querying user properties. appId"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzfg.zzbm(r17)     // Catch: java.lang.Throwable -> Laf
            r4.zze(r5, r6, r0)     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto Lae
            r2.close()
        Lae:
            return r1
        Laf:
            r0 = move-exception
        Lb0:
            r1 = r2
        Lb1:
            if (r1 == 0) goto Lb6
            r1.close()
        Lb6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzbb(java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d6 A[Catch: SQLiteException -> 0x01fe, all -> 0x022d, TryCatch #5 {all -> 0x022d, blocks: (B:13:0x00ce, B:16:0x00d6, B:18:0x012c, B:22:0x0136, B:25:0x0180, B:28:0x01b6, B:30:0x01c1, B:34:0x01cb, B:36:0x01d6, B:38:0x01dd, B:40:0x01e9, B:46:0x01b2, B:47:0x017b, B:50:0x0216), top: B:12:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e9 A[Catch: SQLiteException -> 0x01fe, all -> 0x022d, TRY_LEAVE, TryCatch #5 {all -> 0x022d, blocks: (B:13:0x00ce, B:16:0x00d6, B:18:0x012c, B:22:0x0136, B:25:0x0180, B:28:0x01b6, B:30:0x01c1, B:34:0x01cb, B:36:0x01d6, B:38:0x01dd, B:40:0x01e9, B:46:0x01b2, B:47:0x017b, B:50:0x0216), top: B:12:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b2 A[Catch: SQLiteException -> 0x01fe, all -> 0x022d, TryCatch #5 {all -> 0x022d, blocks: (B:13:0x00ce, B:16:0x00d6, B:18:0x012c, B:22:0x0136, B:25:0x0180, B:28:0x01b6, B:30:0x01c1, B:34:0x01cb, B:36:0x01d6, B:38:0x01dd, B:40:0x01e9, B:46:0x01b2, B:47:0x017b, B:50:0x0216), top: B:12:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017b A[Catch: SQLiteException -> 0x01fe, all -> 0x022d, TryCatch #5 {all -> 0x022d, blocks: (B:13:0x00ce, B:16:0x00d6, B:18:0x012c, B:22:0x0136, B:25:0x0180, B:28:0x01b6, B:30:0x01c1, B:34:0x01cb, B:36:0x01d6, B:38:0x01dd, B:40:0x01e9, B:46:0x01b2, B:47:0x017b, B:50:0x0216), top: B:12:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzdy zzbc(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzbc(java.lang.String):com.google.android.gms.internal.measurement.zzdy");
    }

    public final long zzbd(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzab();
        zzch();
        try {
            return getWritableDatabase().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new java.lang.String[]{str, java.lang.String.valueOf(java.lang.Math.max(0, java.lang.Math.min(1000000, zzgg().zzb(str, com.google.android.gms.internal.measurement.zzew.zzagx))))});
        } catch (android.database.sqlite.SQLiteException e17) {
            zzge().zzim().zze("Error deleting over the limit events. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e17);
            return 0L;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006c: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:23:0x006c */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] zzbe(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            r10.zzab()
            r10.zzch()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getWritableDatabase()     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            java.lang.String r2 = "apps"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            java.lang.String r4 = "remote_config"
            r9 = 0
            r3[r9] = r4     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
            if (r2 != 0) goto L2f
            r1.close()
            return r0
        L2f:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
            if (r3 == 0) goto L4a
            com.google.android.gms.internal.measurement.zzfg r3 = r10.zzge()     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzfg.zzbm(r11)     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
            r3.zzg(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
        L4a:
            r1.close()
            return r2
        L4e:
            r2 = move-exception
            goto L54
        L50:
            r11 = move-exception
            goto L6d
        L52:
            r2 = move-exception
            r1 = r0
        L54:
            com.google.android.gms.internal.measurement.zzfg r3 = r10.zzge()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.internal.measurement.zzfg.zzbm(r11)     // Catch: java.lang.Throwable -> L6b
            r3.zze(r4, r11, r2)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L6a
            r1.close()
        L6a:
            return r0
        L6b:
            r11 = move-exception
            r0 = r1
        L6d:
            if (r0 == 0) goto L72
            r0.close()
        L72:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzbe(java.lang.String):byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzkr> zzbf(java.lang.String r12) {
        /*
            r11 = this;
            r11.zzch()
            r11.zzab()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.getWritableDatabase()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r3 = "audience_id"
            r9 = 0
            r2[r9] = r3     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r3 = "current_results"
            r10 = 1
            r2[r10] = r3     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r3 = "app_id=?"
            java.lang.String[] r4 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7a
            boolean r1 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            if (r1 != 0) goto L34
            r0.close()
            return r8
        L34:
            x.b r1 = new x.b     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            r1.<init>()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
        L39:
            int r2 = r0.getInt(r9)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            byte[] r3 = r0.getBlob(r10)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            int r4 = r3.length     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            com.google.android.gms.internal.measurement.zzabv r3 = com.google.android.gms.internal.measurement.zzabv.zza(r3, r9, r4)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            com.google.android.gms.internal.measurement.zzkr r4 = new com.google.android.gms.internal.measurement.zzkr     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            r4.zzb(r3)     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            r1.put(r2, r4)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            goto L6c
        L56:
            r3 = move-exception
            com.google.android.gms.internal.measurement.zzfg r4 = r11.zzge()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzim()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzfg.zzbm(r12)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            r4.zzd(r5, r6, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
        L6c:
            boolean r2 = r0.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            if (r2 != 0) goto L39
            r0.close()
            return r1
        L76:
            r1 = move-exception
            goto L7d
        L78:
            r12 = move-exception
            goto L96
        L7a:
            r0 = move-exception
            r1 = r0
            r0 = r8
        L7d:
            com.google.android.gms.internal.measurement.zzfg r2 = r11.zzge()     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzim()     // Catch: java.lang.Throwable -> L94
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.internal.measurement.zzfg.zzbm(r12)     // Catch: java.lang.Throwable -> L94
            r2.zze(r3, r12, r1)     // Catch: java.lang.Throwable -> L94
            if (r0 == 0) goto L93
            r0.close()
        L93:
            return r8
        L94:
            r12 = move-exception
            r8 = r0
        L96:
            if (r8 == 0) goto L9b
            r8.close()
        L9b:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzbf(java.lang.String):java.util.Map");
    }

    public final long zzbg(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new java.lang.String[]{str}, 0L);
    }

    public final java.util.List<com.google.android.gms.internal.measurement.zzed> zzc(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzab();
        zzch();
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("app_id=?");
        if (!android.text.TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb6.append(" and origin=?");
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            arrayList.add(java.lang.String.valueOf(str3).concat("*"));
            sb6.append(" and name glob ?");
        }
        return zzb(sb6.toString(), (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzeq zzf(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzf(java.lang.String, java.lang.String):com.google.android.gms.internal.measurement.zzeq");
    }

    public final void zzg(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzab();
        zzch();
        try {
            zzge().zzit().zzg("Deleted user attribute rows", java.lang.Integer.valueOf(getWritableDatabase().delete("user_attributes", "app_id=? and name=?", new java.lang.String[]{str, str2})));
        } catch (android.database.sqlite.SQLiteException e17) {
            zzge().zzim().zzd("Error deleting user attribute. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), zzga().zzbl(str2), e17);
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0091: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:23:0x0091 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzjz zzh(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15)
            r13.zzab()
            r13.zzch()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.getWritableDatabase()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r3 = "user_attributes"
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r0 = "set_timestamp"
            r10 = 0
            r4[r10] = r0     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r0 = "value"
            r11 = 1
            r4[r11] = r0     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r0 = "origin"
            r12 = 2
            r4[r12] = r0     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r14, r15}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            boolean r0 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            if (r0 != 0) goto L3c
            r2.close()
            return r1
        L3c:
            long r7 = r2.getLong(r10)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            java.lang.Object r9 = r13.zza(r2, r11)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            java.lang.String r5 = r2.getString(r12)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzjz r0 = new com.google.android.gms.internal.measurement.zzjz     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            r3 = r0
            r4 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            boolean r3 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            if (r3 == 0) goto L67
            com.google.android.gms.internal.measurement.zzfg r3 = r13.zzge()     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzfg.zzbm(r14)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            r3.zzg(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
        L67:
            r2.close()
            return r0
        L6b:
            r0 = move-exception
            goto L71
        L6d:
            r0 = move-exception
            goto L92
        L6f:
            r0 = move-exception
            r2 = r1
        L71:
            com.google.android.gms.internal.measurement.zzfg r3 = r13.zzge()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzfg.zzbm(r14)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzfe r6 = r13.zzga()     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = r6.zzbl(r15)     // Catch: java.lang.Throwable -> L90
            r3.zzd(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L90
            if (r2 == 0) goto L8f
            r2.close()
        L8f:
            return r1
        L90:
            r0 = move-exception
            r1 = r2
        L92:
            if (r1 == 0) goto L97
            r1.close()
        L97:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzh(java.lang.String, java.lang.String):com.google.android.gms.internal.measurement.zzjz");
    }

    @Override // com.google.android.gms.internal.measurement.zzjq
    public final boolean zzhf() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzhn() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.getWritableDatabase()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L25
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L27
        L20:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3b
        L25:
            r2 = move-exception
            r0 = r1
        L27:
            com.google.android.gms.internal.measurement.zzfg r3 = r6.zzge()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zzg(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
        L3b:
            if (r0 == 0) goto L40
            r0.close()
        L40:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzhn():java.lang.String");
    }

    public final boolean zzho() {
        return zza("select count(1) > 0 from queue where has_realtime = 1", (java.lang.String[]) null) != 0;
    }

    public final void zzhp() {
        int delete;
        zzab();
        zzch();
        if (zzhv()) {
            long j17 = zzgf().zzajx.get();
            long elapsedRealtime = zzbt().elapsedRealtime();
            if (java.lang.Math.abs(elapsedRealtime - j17) > com.google.android.gms.internal.measurement.zzew.zzahg.get().longValue()) {
                zzgf().zzajx.set(elapsedRealtime);
                zzab();
                zzch();
                if (!zzhv() || (delete = getWritableDatabase().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new java.lang.String[]{java.lang.String.valueOf(zzbt().currentTimeMillis()), java.lang.String.valueOf(com.google.android.gms.internal.measurement.zzef.zzhh())})) <= 0) {
                    return;
                }
                zzge().zzit().zzg("Deleted stale rows. rowsDeleted", java.lang.Integer.valueOf(delete));
            }
        }
    }

    public final long zzhq() {
        return zza("select max(bundle_end_timestamp) from queue", (java.lang.String[]) null, 0L);
    }

    public final long zzhr() {
        return zza("select max(timestamp) from raw_events", (java.lang.String[]) null, 0L);
    }

    public final boolean zzhs() {
        return zza("select count(1) > 0 from raw_events", (java.lang.String[]) null) != 0;
    }

    public final boolean zzht() {
        return zza("select count(1) > 0 from raw_events where realtime = 1", (java.lang.String[]) null) != 0;
    }

    public final long zzhu() {
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = getWritableDatabase().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                long j17 = cursor.getLong(0);
                cursor.close();
                return j17;
            } catch (android.database.sqlite.SQLiteException e17) {
                zzge().zzim().zzg("Error querying raw events", e17);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (java.lang.Throwable th6) {
            if (cursor != null) {
                cursor.close();
            }
            throw th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzed zzi(java.lang.String r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzi(java.lang.String, java.lang.String):com.google.android.gms.internal.measurement.zzed");
    }

    public final int zzj(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzab();
        zzch();
        try {
            return getWritableDatabase().delete("conditional_properties", "app_id=? and name=?", new java.lang.String[]{str, str2});
        } catch (android.database.sqlite.SQLiteException e17) {
            zzge().zzim().zzd("Error deleting conditional property", com.google.android.gms.internal.measurement.zzfg.zzbm(str), zzga().zzbl(str2), e17);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzke>> zzk(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.zzch()
            r12.zzab()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            x.b r0 = new x.b
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.getWritableDatabase()
            r9 = 0
            java.lang.String r2 = "event_filters"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r4 = "audience_id"
            r10 = 0
            r3[r10] = r4     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r4 = "data"
            r11 = 1
            r3[r11] = r4     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r4 = "app_id=? AND event_name=?"
            java.lang.String[] r5 = new java.lang.String[]{r13, r14}     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            if (r1 != 0) goto L40
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r14.close()
            return r13
        L40:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            int r2 = r1.length     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            com.google.android.gms.internal.measurement.zzabv r1 = com.google.android.gms.internal.measurement.zzabv.zza(r1, r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            com.google.android.gms.internal.measurement.zzke r2 = new com.google.android.gms.internal.measurement.zzke     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r2.zzb(r1)     // Catch: android.database.sqlite.SQLiteException -> L71 java.io.IOException -> L73 java.lang.Throwable -> Lab
            int r1 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.lang.Object r3 = r0.getOrDefault(r3, r9)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            if (r3 != 0) goto L6d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r0.put(r1, r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
        L6d:
            r3.add(r2)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            goto L85
        L71:
            r0 = move-exception
            goto L94
        L73:
            r1 = move-exception
            com.google.android.gms.internal.measurement.zzfg r2 = r12.zzge()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzim()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzfg.zzbm(r13)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r2.zze(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
        L85:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            if (r1 != 0) goto L40
            r14.close()
            return r0
        L8f:
            r13 = move-exception
            goto Lad
        L91:
            r14 = move-exception
            r0 = r14
            r14 = r9
        L94:
            com.google.android.gms.internal.measurement.zzfg r1 = r12.zzge()     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzim()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.internal.measurement.zzfg.zzbm(r13)     // Catch: java.lang.Throwable -> Lab
            r1.zze(r2, r13, r0)     // Catch: java.lang.Throwable -> Lab
            if (r14 == 0) goto Laa
            r14.close()
        Laa:
            return r9
        Lab:
            r13 = move-exception
            r9 = r14
        Lad:
            if (r9 == 0) goto Lb2
            r9.close()
        Lb2:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzk(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzkh>> zzl(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.zzch()
            r12.zzab()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            x.b r0 = new x.b
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.getWritableDatabase()
            r9 = 0
            java.lang.String r2 = "property_filters"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r4 = "audience_id"
            r10 = 0
            r3[r10] = r4     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r4 = "data"
            r11 = 1
            r3[r11] = r4     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r4 = "app_id=? AND property_name=?"
            java.lang.String[] r5 = new java.lang.String[]{r13, r14}     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            if (r1 != 0) goto L40
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r14.close()
            return r13
        L40:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            int r2 = r1.length     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            com.google.android.gms.internal.measurement.zzabv r1 = com.google.android.gms.internal.measurement.zzabv.zza(r1, r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            com.google.android.gms.internal.measurement.zzkh r2 = new com.google.android.gms.internal.measurement.zzkh     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r2.zzb(r1)     // Catch: android.database.sqlite.SQLiteException -> L71 java.io.IOException -> L73 java.lang.Throwable -> Lab
            int r1 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.lang.Object r3 = r0.getOrDefault(r3, r9)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            if (r3 != 0) goto L6d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r0.put(r1, r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
        L6d:
            r3.add(r2)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            goto L85
        L71:
            r0 = move-exception
            goto L94
        L73:
            r1 = move-exception
            com.google.android.gms.internal.measurement.zzfg r2 = r12.zzge()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzim()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzfg.zzbm(r13)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r2.zze(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
        L85:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            if (r1 != 0) goto L40
            r14.close()
            return r0
        L8f:
            r13 = move-exception
            goto Lad
        L91:
            r14 = move-exception
            r0 = r14
            r14 = r9
        L94:
            com.google.android.gms.internal.measurement.zzfg r1 = r12.zzge()     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.measurement.zzfi r1 = r1.zzim()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.internal.measurement.zzfg.zzbm(r13)     // Catch: java.lang.Throwable -> Lab
            r1.zze(r2, r13, r0)     // Catch: java.lang.Throwable -> Lab
            if (r14 == 0) goto Laa
            r14.close()
        Laa:
            return r9
        Lab:
            r13 = move-exception
            r9 = r14
        Lad:
            if (r9 == 0) goto Lb2
            r9.close()
        Lb2:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzl(java.lang.String, java.lang.String):java.util.Map");
    }

    public final long zzm(java.lang.String str, java.lang.String str2) {
        long zza;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzab();
        zzch();
        android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        long j17 = 0;
        try {
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 32);
                sb6.append("select ");
                sb6.append(str2);
                sb6.append(" from app2 where app_id=?");
                zza = zza(sb6.toString(), new java.lang.String[]{str}, -1L);
                if (zza == -1) {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, str);
                    contentValues.put("first_open_count", (java.lang.Integer) 0);
                    contentValues.put("previous_install_count", (java.lang.Integer) 0);
                    if (writableDatabase.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzge().zzim().zze("Failed to insert column (got -1). appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), str2);
                        return -1L;
                    }
                    zza = 0;
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (android.database.sqlite.SQLiteException e17) {
            e = e17;
        }
        try {
            android.content.ContentValues contentValues2 = new android.content.ContentValues();
            contentValues2.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, str);
            contentValues2.put(str2, java.lang.Long.valueOf(1 + zza));
            if (writableDatabase.update("app2", contentValues2, "app_id = ?", new java.lang.String[]{str}) == 0) {
                zzge().zzim().zze("Failed to update column (got 0). appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), str2);
                return -1L;
            }
            writableDatabase.setTransactionSuccessful();
            return zza;
        } catch (android.database.sqlite.SQLiteException e18) {
            long j18 = zza;
            e = e18;
            j17 = j18;
            zzge().zzim().zzd("Error inserting column. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), str2, e);
            writableDatabase.endTransaction();
            return j17;
        }
    }

    private final long zza(java.lang.String str, java.lang.String[] strArr) {
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor rawQuery = getWritableDatabase().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new android.database.sqlite.SQLiteException("Database returned empty set");
                }
                long j17 = rawQuery.getLong(0);
                rawQuery.close();
                return j17;
            } catch (android.database.sqlite.SQLiteException e17) {
                zzge().zzim().zze("Database error", str, e17);
                throw e17;
            }
        } catch (java.lang.Throwable th6) {
            if (0 != 0) {
                cursor.close();
            }
            throw th6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0098, code lost:
    
        zzge().zzim().zzg("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.internal.measurement.zzjz> zzb(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzb(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void zzc(java.util.List<java.lang.Long> list) {
        zzab();
        zzch();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        com.google.android.gms.common.internal.Preconditions.checkNotZero(list.size());
        if (zzhv()) {
            java.lang.String join = android.text.TextUtils.join(",", list);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(join).length() + 2);
            sb6.append("(");
            sb6.append(join);
            sb6.append(")");
            java.lang.String sb7 = sb6.toString();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(sb7).length() + 80);
            sb8.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb8.append(sb7);
            sb8.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zza(sb8.toString(), (java.lang.String[]) null) > 0) {
                zzge().zzip().log("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder(java.lang.String.valueOf(sb7).length() + 127);
                sb9.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb9.append(sb7);
                sb9.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                writableDatabase.execSQL(sb9.toString());
            } catch (android.database.sqlite.SQLiteException e17) {
                zzge().zzim().zzg("Error incrementing retry count. error", e17);
            }
        }
    }

    private final long zza(java.lang.String str, java.lang.String[] strArr, long j17) {
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = getWritableDatabase().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j17;
                }
                long j18 = cursor.getLong(0);
                cursor.close();
                return j18;
            } catch (android.database.sqlite.SQLiteException e17) {
                zzge().zzim().zze("Database error", str, e17);
                throw e17;
            }
        } catch (java.lang.Throwable th6) {
            if (cursor != null) {
                cursor.close();
            }
            throw th6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        zzge().zzim().zzg("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.internal.measurement.zzed> zzb(java.lang.String r40, java.lang.String[] r41) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzb(java.lang.String, java.lang.String[]):java.util.List");
    }

    private static java.util.Set<java.lang.String> zzb(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 22);
        sb6.append("SELECT * FROM ");
        sb6.append(str);
        sb6.append(" LIMIT 0");
        android.database.Cursor rawQuery = sQLiteDatabase.rawQuery(sb6.toString(), null);
        try {
            java.util.Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0086: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:29:0x0086 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzkn, java.lang.Long> zza(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.zzab()
            r7.zzch()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.getWritableDatabase()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L70
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L70
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L70
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L70
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L70
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L70
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            if (r2 != 0) goto L35
            com.google.android.gms.internal.measurement.zzfg r8 = r7.zzge()     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            com.google.android.gms.internal.measurement.zzfi r8 = r8.zzit()     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            java.lang.String r9 = "Main event not found"
            r8.log(r9)     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            r1.close()
            return r0
        L35:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            long r5 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            int r5 = r2.length     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            com.google.android.gms.internal.measurement.zzabv r2 = com.google.android.gms.internal.measurement.zzabv.zza(r2, r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            com.google.android.gms.internal.measurement.zzkn r4 = new com.google.android.gms.internal.measurement.zzkn     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            r4.zzb(r2)     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            android.util.Pair r8 = android.util.Pair.create(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            r1.close()
            return r8
        L56:
            r2 = move-exception
            com.google.android.gms.internal.measurement.zzfg r3 = r7.zzge()     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzfg.zzbm(r8)     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            r3.zzd(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            r1.close()
            return r0
        L6c:
            r8 = move-exception
            goto L72
        L6e:
            r8 = move-exception
            goto L87
        L70:
            r8 = move-exception
            r1 = r0
        L72:
            com.google.android.gms.internal.measurement.zzfg r9 = r7.zzge()     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.internal.measurement.zzfi r9 = r9.zzim()     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "Error selecting main event"
            r9.zzg(r2, r8)     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L84
            r1.close()
        L84:
            return r0
        L85:
            r8 = move-exception
            r0 = r1
        L87:
            if (r0 == 0) goto L8c
            r0.close()
        L8c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzej zza(long r23, java.lang.String r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zza(long, java.lang.String, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.measurement.zzej");
    }

    private final java.lang.Object zza(android.database.Cursor cursor, int i17) {
        int type = cursor.getType(i17);
        if (type == 0) {
            zzge().zzim().log("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return java.lang.Long.valueOf(cursor.getLong(i17));
        }
        if (type == 2) {
            return java.lang.Double.valueOf(cursor.getDouble(i17));
        }
        if (type == 3) {
            return cursor.getString(i17);
        }
        if (type != 4) {
            zzge().zzim().zzg("Loaded invalid unknown value type, ignoring it", java.lang.Integer.valueOf(type));
            return null;
        }
        zzge().zzim().log("Loaded invalid blob type value, ignoring it");
        return null;
    }

    private static void zza(android.content.ContentValues contentValues, java.lang.String str, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
        if (obj instanceof java.lang.String) {
            contentValues.put(str, (java.lang.String) obj);
        } else if (obj instanceof java.lang.Long) {
            contentValues.put(str, (java.lang.Long) obj);
        } else {
            if (!(obj instanceof java.lang.Double)) {
                throw new java.lang.IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (java.lang.Double) obj);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdy zzdyVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzdyVar);
        zzab();
        zzch();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, zzdyVar.zzah());
        contentValues.put("app_instance_id", zzdyVar.getAppInstanceId());
        contentValues.put("gmp_app_id", zzdyVar.getGmpAppId());
        contentValues.put("resettable_device_id_hash", zzdyVar.zzgi());
        contentValues.put("last_bundle_index", java.lang.Long.valueOf(zzdyVar.zzgq()));
        contentValues.put("last_bundle_start_timestamp", java.lang.Long.valueOf(zzdyVar.zzgk()));
        contentValues.put("last_bundle_end_timestamp", java.lang.Long.valueOf(zzdyVar.zzgl()));
        contentValues.put("app_version", zzdyVar.zzag());
        contentValues.put("app_store", zzdyVar.zzgn());
        contentValues.put("gmp_version", java.lang.Long.valueOf(zzdyVar.zzgo()));
        contentValues.put("dev_cert_hash", java.lang.Long.valueOf(zzdyVar.zzgp()));
        contentValues.put("measurement_enabled", java.lang.Boolean.valueOf(zzdyVar.isMeasurementEnabled()));
        contentValues.put("day", java.lang.Long.valueOf(zzdyVar.zzgu()));
        contentValues.put("daily_public_events_count", java.lang.Long.valueOf(zzdyVar.zzgv()));
        contentValues.put("daily_events_count", java.lang.Long.valueOf(zzdyVar.zzgw()));
        contentValues.put("daily_conversions_count", java.lang.Long.valueOf(zzdyVar.zzgx()));
        contentValues.put("config_fetched_time", java.lang.Long.valueOf(zzdyVar.zzgr()));
        contentValues.put("failed_config_fetch_time", java.lang.Long.valueOf(zzdyVar.zzgs()));
        contentValues.put("app_version_int", java.lang.Long.valueOf(zzdyVar.zzgm()));
        contentValues.put("firebase_instance_id", zzdyVar.zzgj());
        contentValues.put("daily_error_events_count", java.lang.Long.valueOf(zzdyVar.zzgz()));
        contentValues.put("daily_realtime_events_count", java.lang.Long.valueOf(zzdyVar.zzgy()));
        contentValues.put("health_monitor_sample", zzdyVar.zzha());
        contentValues.put("android_id", java.lang.Long.valueOf(zzdyVar.zzhc()));
        contentValues.put("adid_reporting_enabled", java.lang.Boolean.valueOf(zzdyVar.zzhd()));
        contentValues.put("ssaid_reporting_enabled", java.lang.Boolean.valueOf(zzdyVar.zzhe()));
        try {
            android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase.update("apps", contentValues, "app_id = ?", new java.lang.String[]{zzdyVar.zzah()}) == 0 && writableDatabase.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzge().zzim().zzg("Failed to insert/update app (got -1). appId", com.google.android.gms.internal.measurement.zzfg.zzbm(zzdyVar.zzah()));
            }
        } catch (android.database.sqlite.SQLiteException e17) {
            zzge().zzim().zze("Error storing app. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(zzdyVar.zzah()), e17);
        }
    }

    public final void zza(com.google.android.gms.internal.measurement.zzeq zzeqVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzeqVar);
        zzab();
        zzch();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, zzeqVar.zzti);
        contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, zzeqVar.name);
        contentValues.put("lifetime_count", java.lang.Long.valueOf(zzeqVar.zzafr));
        contentValues.put("current_bundle_count", java.lang.Long.valueOf(zzeqVar.zzafs));
        contentValues.put("last_fire_timestamp", java.lang.Long.valueOf(zzeqVar.zzaft));
        contentValues.put("last_bundled_timestamp", java.lang.Long.valueOf(zzeqVar.zzafu));
        contentValues.put("last_sampled_complex_event_id", zzeqVar.zzafv);
        contentValues.put("last_sampling_rate", zzeqVar.zzafw);
        java.lang.Boolean bool = zzeqVar.zzafx;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (getWritableDatabase().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzge().zzim().zzg("Failed to insert/update event aggregates (got -1). appId", com.google.android.gms.internal.measurement.zzfg.zzbm(zzeqVar.zzti));
            }
        } catch (android.database.sqlite.SQLiteException e17) {
            zzge().zzim().zze("Error storing event aggregates. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(zzeqVar.zzti), e17);
        }
    }

    public static void zza(com.google.android.gms.internal.measurement.zzfg zzfgVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (zzfgVar == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        java.io.File file = new java.io.File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            zzfgVar.zzip().log("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzfgVar.zzip().log("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzfgVar.zzip().log("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzfgVar.zzip().log("Failed to turn on database write permission for owner");
    }

    public static void zza(com.google.android.gms.internal.measurement.zzfg zzfgVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        if (zzfgVar == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        if (!zza(zzfgVar, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            java.util.Set<java.lang.String> zzb = zzb(sQLiteDatabase, str);
            for (java.lang.String str4 : str3.split(",")) {
                if (!zzb.remove(str4)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 35 + java.lang.String.valueOf(str4).length());
                    sb6.append("Table ");
                    sb6.append(str);
                    sb6.append(" is missing required column: ");
                    sb6.append(str4);
                    throw new android.database.sqlite.SQLiteException(sb6.toString());
                }
            }
            if (strArr != null) {
                for (int i17 = 0; i17 < strArr.length; i17 += 2) {
                    if (!zzb.remove(strArr[i17])) {
                        sQLiteDatabase.execSQL(strArr[i17 + 1]);
                    }
                }
            }
            if (zzb.isEmpty()) {
                return;
            }
            zzfgVar.zzip().zze("Table has extra columns. table, columns", str, android.text.TextUtils.join(", ", zzb));
        } catch (android.database.sqlite.SQLiteException e17) {
            zzfgVar.zzim().zzg("Failed to verify columns on table that was just created", str);
            throw e17;
        }
    }

    public final void zza(java.lang.String str, com.google.android.gms.internal.measurement.zzkd[] zzkdVarArr) {
        boolean z17;
        com.google.android.gms.internal.measurement.zzfi zzip;
        java.lang.String str2;
        java.lang.Object zzbm;
        java.lang.Object obj;
        zzch();
        zzab();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkdVarArr);
        android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            zzch();
            zzab();
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            android.database.sqlite.SQLiteDatabase writableDatabase2 = getWritableDatabase();
            writableDatabase2.delete("property_filters", "app_id=?", new java.lang.String[]{str});
            writableDatabase2.delete("event_filters", "app_id=?", new java.lang.String[]{str});
            for (com.google.android.gms.internal.measurement.zzkd zzkdVar : zzkdVarArr) {
                zzch();
                zzab();
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkdVar);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkdVar.zzarn);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkdVar.zzarm);
                java.lang.Integer num = zzkdVar.zzarl;
                if (num != null) {
                    int intValue = num.intValue();
                    com.google.android.gms.internal.measurement.zzke[] zzkeVarArr = zzkdVar.zzarn;
                    int length = zzkeVarArr.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length) {
                            for (com.google.android.gms.internal.measurement.zzkh zzkhVar : zzkdVar.zzarm) {
                                if (zzkhVar.zzarp == null) {
                                    zzip = zzge().zzip();
                                    str2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                    zzbm = com.google.android.gms.internal.measurement.zzfg.zzbm(str);
                                    obj = zzkdVar.zzarl;
                                }
                            }
                            com.google.android.gms.internal.measurement.zzke[] zzkeVarArr2 = zzkdVar.zzarn;
                            int length2 = zzkeVarArr2.length;
                            int i18 = 0;
                            while (true) {
                                if (i18 >= length2) {
                                    z17 = true;
                                    break;
                                } else {
                                    if (!zza(str, intValue, zzkeVarArr2[i18])) {
                                        z17 = false;
                                        break;
                                    }
                                    i18++;
                                }
                            }
                            if (z17) {
                                com.google.android.gms.internal.measurement.zzkh[] zzkhVarArr = zzkdVar.zzarm;
                                int length3 = zzkhVarArr.length;
                                int i19 = 0;
                                while (true) {
                                    if (i19 >= length3) {
                                        break;
                                    }
                                    if (!zza(str, intValue, zzkhVarArr[i19])) {
                                        z17 = false;
                                        break;
                                    }
                                    i19++;
                                }
                            }
                            if (!z17) {
                                zzch();
                                zzab();
                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                                android.database.sqlite.SQLiteDatabase writableDatabase3 = getWritableDatabase();
                                writableDatabase3.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{str, java.lang.String.valueOf(intValue)});
                                writableDatabase3.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{str, java.lang.String.valueOf(intValue)});
                            }
                        } else {
                            if (zzkeVarArr[i17].zzarp == null) {
                                zzip = zzge().zzip();
                                str2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                zzbm = com.google.android.gms.internal.measurement.zzfg.zzbm(str);
                                obj = zzkdVar.zzarl;
                                break;
                            }
                            i17++;
                        }
                    }
                    zzip.zze(str2, zzbm, obj);
                    break;
                } else {
                    zzge().zzip().zzg("Audience with no ID. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str));
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.google.android.gms.internal.measurement.zzkd zzkdVar2 : zzkdVarArr) {
                arrayList.add(zzkdVar2.zzarl);
            }
            zza(str, arrayList);
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final boolean zza(com.google.android.gms.internal.measurement.zzed zzedVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzedVar);
        zzab();
        zzch();
        if (zzh(zzedVar.packageName, zzedVar.zzaep.name) == null && zza("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new java.lang.String[]{zzedVar.packageName}) >= 1000) {
            return false;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, zzedVar.packageName);
        contentValues.put(ya.b.ORIGIN, zzedVar.origin);
        contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, zzedVar.zzaep.name);
        zza(contentValues, "value", zzedVar.zzaep.getValue());
        contentValues.put("active", java.lang.Boolean.valueOf(zzedVar.active));
        contentValues.put("trigger_event_name", zzedVar.triggerEventName);
        contentValues.put("trigger_timeout", java.lang.Long.valueOf(zzedVar.triggerTimeout));
        zzgb();
        contentValues.put("timed_out_event", com.google.android.gms.internal.measurement.zzka.zza(zzedVar.zzaeq));
        contentValues.put("creation_timestamp", java.lang.Long.valueOf(zzedVar.creationTimestamp));
        zzgb();
        contentValues.put("triggered_event", com.google.android.gms.internal.measurement.zzka.zza(zzedVar.zzaer));
        contentValues.put("triggered_timestamp", java.lang.Long.valueOf(zzedVar.zzaep.zzaqz));
        contentValues.put("time_to_live", java.lang.Long.valueOf(zzedVar.timeToLive));
        zzgb();
        contentValues.put("expired_event", com.google.android.gms.internal.measurement.zzka.zza(zzedVar.zzaes));
        try {
            if (getWritableDatabase().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzge().zzim().zzg("Failed to insert/update conditional user property (got -1)", com.google.android.gms.internal.measurement.zzfg.zzbm(zzedVar.packageName));
            return true;
        } catch (android.database.sqlite.SQLiteException e17) {
            zzge().zzim().zze("Error storing conditional user property", com.google.android.gms.internal.measurement.zzfg.zzbm(zzedVar.packageName), e17);
            return true;
        }
    }

    public final boolean zza(com.google.android.gms.internal.measurement.zzep zzepVar, long j17, boolean z17) {
        com.google.android.gms.internal.measurement.zzfi zzim;
        java.lang.Object zzbm;
        java.lang.String str;
        android.content.ContentValues contentValues;
        zzab();
        zzch();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzepVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzepVar.zzti);
        com.google.android.gms.internal.measurement.zzkn zzknVar = new com.google.android.gms.internal.measurement.zzkn();
        zzknVar.zzatc = java.lang.Long.valueOf(zzepVar.zzafp);
        zzknVar.zzata = new com.google.android.gms.internal.measurement.zzko[zzepVar.zzafq.size()];
        java.util.Iterator<java.lang.String> it = zzepVar.zzafq.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.String next = it.next();
            com.google.android.gms.internal.measurement.zzko zzkoVar = new com.google.android.gms.internal.measurement.zzko();
            zzknVar.zzata[i17] = zzkoVar;
            zzkoVar.name = next;
            zzgb().zza(zzkoVar, zzepVar.zzafq.get(next));
            i17++;
        }
        try {
            int zzvm = zzknVar.zzvm();
            byte[] bArr = new byte[zzvm];
            com.google.android.gms.internal.measurement.zzabw zzb = com.google.android.gms.internal.measurement.zzabw.zzb(bArr, 0, zzvm);
            zzknVar.zza(zzb);
            zzb.zzve();
            zzge().zzit().zze("Saving event, name, data size", zzga().zzbj(zzepVar.name), java.lang.Integer.valueOf(zzvm));
            contentValues = new android.content.ContentValues();
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, zzepVar.zzti);
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, zzepVar.name);
            contentValues.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(zzepVar.timestamp));
            contentValues.put("metadata_fingerprint", java.lang.Long.valueOf(j17));
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, bArr);
            contentValues.put("realtime", java.lang.Integer.valueOf(z17 ? 1 : 0));
        } catch (java.io.IOException e17) {
            e = e17;
            zzim = zzge().zzim();
            zzbm = com.google.android.gms.internal.measurement.zzfg.zzbm(zzepVar.zzti);
            str = "Data loss. Failed to serialize event params/data. appId";
        }
        try {
            if (getWritableDatabase().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzge().zzim().zzg("Failed to insert raw event (got -1). appId", com.google.android.gms.internal.measurement.zzfg.zzbm(zzepVar.zzti));
            return false;
        } catch (android.database.sqlite.SQLiteException e18) {
            e = e18;
            zzim = zzge().zzim();
            zzbm = com.google.android.gms.internal.measurement.zzfg.zzbm(zzepVar.zzti);
            str = "Error storing raw event. appId";
            zzim.zze(str, zzbm, e);
            return false;
        }
    }

    private static boolean zza(com.google.android.gms.internal.measurement.zzfg zzfgVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        if (zzfgVar == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new java.lang.String[]{com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME}, "name=?", new java.lang.String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                return moveToFirst;
            } catch (android.database.sqlite.SQLiteException e17) {
                zzfgVar.zzip().zze("Error querying for table", str, e17);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (java.lang.Throwable th6) {
            if (cursor != null) {
                cursor.close();
            }
            throw th6;
        }
    }

    public final boolean zza(com.google.android.gms.internal.measurement.zzjz zzjzVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjzVar);
        zzab();
        zzch();
        if (zzh(zzjzVar.zzti, zzjzVar.name) == null) {
            if (com.google.android.gms.internal.measurement.zzka.zzcc(zzjzVar.name)) {
                if (zza("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new java.lang.String[]{zzjzVar.zzti}) >= 25) {
                    return false;
                }
            } else if (zza("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new java.lang.String[]{zzjzVar.zzti, zzjzVar.origin}) >= 25) {
                return false;
            }
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, zzjzVar.zzti);
        contentValues.put(ya.b.ORIGIN, zzjzVar.origin);
        contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, zzjzVar.name);
        contentValues.put("set_timestamp", java.lang.Long.valueOf(zzjzVar.zzaqz));
        zza(contentValues, "value", zzjzVar.value);
        try {
            if (getWritableDatabase().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzge().zzim().zzg("Failed to insert/update user property (got -1). appId", com.google.android.gms.internal.measurement.zzfg.zzbm(zzjzVar.zzti));
            return true;
        } catch (android.database.sqlite.SQLiteException e17) {
            zzge().zzim().zze("Error storing user property. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(zzjzVar.zzti), e17);
            return true;
        }
    }

    public final boolean zza(com.google.android.gms.internal.measurement.zzkq zzkqVar, boolean z17) {
        com.google.android.gms.internal.measurement.zzfi zzim;
        java.lang.Object zzbm;
        java.lang.String str;
        android.content.ContentValues contentValues;
        zzab();
        zzch();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkqVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzkqVar.zzti);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkqVar.zzatm);
        zzhp();
        long currentTimeMillis = zzbt().currentTimeMillis();
        if (zzkqVar.zzatm.longValue() < currentTimeMillis - com.google.android.gms.internal.measurement.zzef.zzhh() || zzkqVar.zzatm.longValue() > com.google.android.gms.internal.measurement.zzef.zzhh() + currentTimeMillis) {
            zzge().zzip().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", com.google.android.gms.internal.measurement.zzfg.zzbm(zzkqVar.zzti), java.lang.Long.valueOf(currentTimeMillis), zzkqVar.zzatm);
        }
        try {
            int zzvm = zzkqVar.zzvm();
            byte[] bArr = new byte[zzvm];
            com.google.android.gms.internal.measurement.zzabw zzb = com.google.android.gms.internal.measurement.zzabw.zzb(bArr, 0, zzvm);
            zzkqVar.zza(zzb);
            zzb.zzve();
            byte[] zza = zzgb().zza(bArr);
            zzge().zzit().zzg("Saving bundle, size", java.lang.Integer.valueOf(zza.length));
            contentValues = new android.content.ContentValues();
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, zzkqVar.zzti);
            contentValues.put("bundle_end_timestamp", zzkqVar.zzatm);
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, zza);
            contentValues.put("has_realtime", java.lang.Integer.valueOf(z17 ? 1 : 0));
            java.lang.Integer num = zzkqVar.zzauj;
            if (num != null) {
                contentValues.put("retry_count", num);
            }
        } catch (java.io.IOException e17) {
            e = e17;
            zzim = zzge().zzim();
            zzbm = com.google.android.gms.internal.measurement.zzfg.zzbm(zzkqVar.zzti);
            str = "Data loss. Failed to serialize bundle. appId";
        }
        try {
            if (getWritableDatabase().insert("queue", null, contentValues) != -1) {
                return true;
            }
            zzge().zzim().zzg("Failed to insert bundle (got -1). appId", com.google.android.gms.internal.measurement.zzfg.zzbm(zzkqVar.zzti));
            return false;
        } catch (android.database.sqlite.SQLiteException e18) {
            e = e18;
            zzim = zzge().zzim();
            zzbm = com.google.android.gms.internal.measurement.zzfg.zzbm(zzkqVar.zzti);
            str = "Error storing bundle. appId";
            zzim.zze(str, zzbm, e);
            return false;
        }
    }

    private final boolean zza(java.lang.String str, int i17, com.google.android.gms.internal.measurement.zzke zzkeVar) {
        zzch();
        zzab();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkeVar);
        if (android.text.TextUtils.isEmpty(zzkeVar.zzarq)) {
            zzge().zzip().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), java.lang.Integer.valueOf(i17), java.lang.String.valueOf(zzkeVar.zzarp));
            return false;
        }
        try {
            int zzvm = zzkeVar.zzvm();
            byte[] bArr = new byte[zzvm];
            com.google.android.gms.internal.measurement.zzabw zzb = com.google.android.gms.internal.measurement.zzabw.zzb(bArr, 0, zzvm);
            zzkeVar.zza(zzb);
            zzb.zzve();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, str);
            contentValues.put("audience_id", java.lang.Integer.valueOf(i17));
            contentValues.put("filter_id", zzkeVar.zzarp);
            contentValues.put("event_name", zzkeVar.zzarq);
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, bArr);
            try {
                if (getWritableDatabase().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                zzge().zzim().zzg("Failed to insert event filter (got -1). appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str));
                return true;
            } catch (android.database.sqlite.SQLiteException e17) {
                zzge().zzim().zze("Error storing event filter. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e17);
                return false;
            }
        } catch (java.io.IOException e18) {
            zzge().zzim().zze("Configuration loss. Failed to serialize event filter. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e18);
            return false;
        }
    }

    private final boolean zza(java.lang.String str, int i17, com.google.android.gms.internal.measurement.zzkh zzkhVar) {
        zzch();
        zzab();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzkhVar);
        if (android.text.TextUtils.isEmpty(zzkhVar.zzasf)) {
            zzge().zzip().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), java.lang.Integer.valueOf(i17), java.lang.String.valueOf(zzkhVar.zzarp));
            return false;
        }
        try {
            int zzvm = zzkhVar.zzvm();
            byte[] bArr = new byte[zzvm];
            com.google.android.gms.internal.measurement.zzabw zzb = com.google.android.gms.internal.measurement.zzabw.zzb(bArr, 0, zzvm);
            zzkhVar.zza(zzb);
            zzb.zzve();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, str);
            contentValues.put("audience_id", java.lang.Integer.valueOf(i17));
            contentValues.put("filter_id", zzkhVar.zzarp);
            contentValues.put("property_name", zzkhVar.zzasf);
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, bArr);
            try {
                if (getWritableDatabase().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                zzge().zzim().zzg("Failed to insert property filter (got -1). appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str));
                return false;
            } catch (android.database.sqlite.SQLiteException e17) {
                zzge().zzim().zze("Error storing property filter. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e17);
                return false;
            }
        } catch (java.io.IOException e18) {
            zzge().zzim().zze("Configuration loss. Failed to serialize property filter. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e18);
            return false;
        }
    }

    public final boolean zza(java.lang.String str, java.lang.Long l17, long j17, com.google.android.gms.internal.measurement.zzkn zzknVar) {
        zzab();
        zzch();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzknVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l17);
        try {
            int zzvm = zzknVar.zzvm();
            byte[] bArr = new byte[zzvm];
            com.google.android.gms.internal.measurement.zzabw zzb = com.google.android.gms.internal.measurement.zzabw.zzb(bArr, 0, zzvm);
            zzknVar.zza(zzb);
            zzb.zzve();
            zzge().zzit().zze("Saving complex main event, appId, data size", zzga().zzbj(str), java.lang.Integer.valueOf(zzvm));
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, str);
            contentValues.put("event_id", l17);
            contentValues.put("children_to_process", java.lang.Long.valueOf(j17));
            contentValues.put("main_event", bArr);
            try {
                if (getWritableDatabase().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                    return true;
                }
                zzge().zzim().zzg("Failed to insert complex main event (got -1). appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str));
                return false;
            } catch (android.database.sqlite.SQLiteException e17) {
                zzge().zzim().zze("Error storing complex main event. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e17);
                return false;
            }
        } catch (java.io.IOException e18) {
            zzge().zzim().zzd("Data loss. Failed to serialize event params/data. appId, eventId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), l17, e18);
            return false;
        }
    }

    private final boolean zza(java.lang.String str, java.util.List<java.lang.Integer> list) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzch();
        zzab();
        android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            long zza = zza("select count(1) from audience_filter_values where app_id=?", new java.lang.String[]{str});
            int max = java.lang.Math.max(0, java.lang.Math.min(2000, zzgg().zzb(str, com.google.android.gms.internal.measurement.zzew.zzahn)));
            if (zza <= max) {
                return false;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < list.size(); i17++) {
                java.lang.Integer num = list.get(i17);
                if (num == null) {
                    return false;
                }
                arrayList.add(java.lang.Integer.toString(num.intValue()));
            }
            java.lang.String join = android.text.TextUtils.join(",", arrayList);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(join).length() + 2);
            sb6.append("(");
            sb6.append(join);
            sb6.append(")");
            java.lang.String sb7 = sb6.toString();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(sb7).length() + 140);
            sb8.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb8.append(sb7);
            sb8.append(" order by rowid desc limit -1 offset ?)");
            return writableDatabase.delete("audience_filter_values", sb8.toString(), new java.lang.String[]{str, java.lang.Integer.toString(max)}) > 0;
        } catch (android.database.sqlite.SQLiteException e17) {
            zzge().zzim().zze("Database error querying filters. appId", com.google.android.gms.internal.measurement.zzfg.zzbm(str), e17);
            return false;
        }
    }
}
