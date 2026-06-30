package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzei */
/* loaded from: classes16.dex */
public final class C2192x394be4 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2330x394c87 {

    /* renamed from: zzaev */
    private static final java.lang.String[] f6487x6f02192 = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};

    /* renamed from: zzaew */
    private static final java.lang.String[] f6488x6f02193 = {ya.b.f77495x8b74a326, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: zzaex */
    private static final java.lang.String[] f6489x6f02194 = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;"};

    /* renamed from: zzaey */
    private static final java.lang.String[] f6490x6f02195 = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: zzaez */
    private static final java.lang.String[] f6491x6f02196 = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: zzafa */
    private static final java.lang.String[] f6492x6f0219c = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: zzafb */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2195x394be7 f6493x6f0219d;

    /* renamed from: zzafc */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2326x394c83 f6494x6f0219e;

    public C2192x394be4(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88 c2331x394c88) {
        super(c2331x394c88);
        this.f6494x6f0219e = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2326x394c83(mo18962x394b92());
        this.f6493x6f0219d = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2195x394be7(this, mo18960x76847179(), "google_app_measurement.db");
    }

    /* renamed from: zzhv */
    private final boolean m19040x394c4e() {
        return mo18960x76847179().getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: beginTransaction */
    public final void m19047xb2c12e75() {
        m19257x394ba5();
        m19049x240d90b1().beginTransaction();
    }

    /* renamed from: endTransaction */
    public final void m19048x7d3c6b03() {
        m19257x394ba5();
        m19049x240d90b1().endTransaction();
    }

    /* renamed from: getWritableDatabase */
    public final android.database.sqlite.SQLiteDatabase m19049x240d90b1() {
        mo18961x394b61();
        try {
            return this.f6493x6f0219d.getWritableDatabase();
        } catch (android.database.sqlite.SQLiteException e17) {
            mo18976x394c1e().m19111x394c67().zzg("Error opening database", e17);
            throw e17;
        }
    }

    /* renamed from: setTransactionSuccessful */
    public final void m19050x576b60d6() {
        m19257x394ba5();
        m19049x240d90b1().setTransactionSuccessful();
    }

    public final long zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 c2356x394ca6) {
        long zzc;
        mo18961x394b61();
        m19257x394ba5();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2356x394ca6);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(c2356x394ca6.f7138x394db5);
        try {
            int m18953x394df7 = c2356x394ca6.m18953x394df7();
            byte[] bArr = new byte[m18953x394df7];
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(bArr, 0, m18953x394df7);
            c2356x394ca6.zza(zzb);
            zzb.m18920x394def();
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96 mo18973x394c1b = mo18973x394c1b();
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(bArr);
            mo18973x394c1b.mo18961x394b61();
            java.security.MessageDigest m19279x4657e4f5 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.m19279x4657e4f5("MD5");
            if (m19279x4657e4f5 == null) {
                mo18973x394c1b.mo18976x394c1e().m19108x394c64().log("Failed to get MD5");
                zzc = 0;
            } else {
                zzc = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzc(m19279x4657e4f5.digest(bArr));
            }
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, c2356x394ca6.f7138x394db5);
            contentValues.put("metadata_fingerprint", java.lang.Long.valueOf(zzc));
            contentValues.put("metadata", bArr);
            try {
                m19049x240d90b1().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                return zzc;
            } catch (android.database.sqlite.SQLiteException e17) {
                mo18976x394c1e().m19108x394c64().zze("Error storing raw event metadata. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2356x394ca6.f7138x394db5), e17);
                throw e17;
            }
        } catch (java.io.IOException e18) {
            mo18976x394c1e().m19108x394c64().zze("Data loss. Failed to serialize event metadata. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2356x394ca6.f7138x394db5), e18);
            throw e18;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* renamed from: zzab */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m19051x394b61(long r5) {
        /*
            r4 = this;
            r4.mo18961x394b61()
            r4.m19257x394ba5()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.m19049x240d90b1()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            if (r1 != 0) goto L32
            com.google.android.gms.internal.measurement.zzfg r6 = r4.mo18976x394c1e()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            com.google.android.gms.internal.measurement.zzfi r6 = r6.m19115x394c6b()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
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
            com.google.android.gms.internal.measurement.zzfg r1 = r4.mo18976x394c1e()     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.internal.measurement.zzfi r1 = r1.m19108x394c64()     // Catch: java.lang.Throwable -> L53
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.m19051x394b61(long):java.lang.String");
    }

    public final java.util.List<android.util.Pair<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6, java.lang.Long>> zzb(java.lang.String str, int i17, int i18) {
        byte[] zzb;
        mo18961x394b61();
        m19257x394ba5();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18197x312c1fe5(i17 > 0);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18197x312c1fe5(i18 > 0);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor query = m19049x240d90b1().query("queue", new java.lang.String[]{"rowid", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "retry_count"}, "app_id=?", new java.lang.String[]{str}, null, null, "rowid", java.lang.String.valueOf(i17));
                if (!query.moveToFirst()) {
                    java.util.List<android.util.Pair<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6, java.lang.Long>> emptyList = java.util.Collections.emptyList();
                    query.close();
                    return emptyList;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i19 = 0;
                do {
                    long j17 = query.getLong(0);
                    try {
                        zzb = mo18973x394c1b().zzb(query.getBlob(1));
                    } catch (java.io.IOException e17) {
                        mo18976x394c1e().m19108x394c64().zze("Failed to unzip queued bundle. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e17);
                    }
                    if (!arrayList.isEmpty() && zzb.length + i19 > i18) {
                        break;
                    }
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 zza = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135.zza(zzb, 0, zzb.length);
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 c2356x394ca6 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6();
                    try {
                        c2356x394ca6.zzb(zza);
                        if (!query.isNull(2)) {
                            c2356x394ca6.f7136x6f02376 = java.lang.Integer.valueOf(query.getInt(2));
                        }
                        i19 += zzb.length;
                        arrayList.add(android.util.Pair.create(c2356x394ca6, java.lang.Long.valueOf(j17)));
                    } catch (java.io.IOException e18) {
                        mo18976x394c1e().m19108x394c64().zze("Failed to merge queued bundle. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e18);
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } while (i19 <= i18);
                query.close();
                return arrayList;
            } catch (android.database.sqlite.SQLiteException e19) {
                mo18976x394c1e().m19108x394c64().zze("Error querying bundles. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e19);
                java.util.List<android.util.Pair<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6, java.lang.Long>> emptyList2 = java.util.Collections.emptyList();
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
    /* renamed from: zzbb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90> m19052x394b80(java.lang.String r17) {
        /*
            r16 = this;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(r17)
            r16.mo18961x394b61()
            r16.m19257x394ba5()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r16.m19049x240d90b1()     // Catch: java.lang.Throwable -> L90 android.database.sqlite.SQLiteException -> L94
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
            com.google.android.gms.internal.measurement.zzfg r4 = r16.mo18976x394c1e()     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            com.google.android.gms.internal.measurement.zzfi r4 = r4.m19108x394c64()     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
            java.lang.String r5 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r6 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(r17)     // Catch: android.database.sqlite.SQLiteException -> L86 java.lang.Throwable -> Laf
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
            com.google.android.gms.internal.measurement.zzfg r4 = r16.mo18976x394c1e()     // Catch: java.lang.Throwable -> Laf
            com.google.android.gms.internal.measurement.zzfi r4 = r4.m19108x394c64()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "Error querying user properties. appId"
            java.lang.Object r6 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(r17)     // Catch: java.lang.Throwable -> Laf
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.m19052x394b80(java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d6 A[Catch: SQLiteException -> 0x01fe, all -> 0x022d, TryCatch #5 {all -> 0x022d, blocks: (B:13:0x00ce, B:16:0x00d6, B:18:0x012c, B:22:0x0136, B:25:0x0180, B:28:0x01b6, B:30:0x01c1, B:34:0x01cb, B:36:0x01d6, B:38:0x01dd, B:40:0x01e9, B:46:0x01b2, B:47:0x017b, B:50:0x0216), top: B:12:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e9 A[Catch: SQLiteException -> 0x01fe, all -> 0x022d, TRY_LEAVE, TryCatch #5 {all -> 0x022d, blocks: (B:13:0x00ce, B:16:0x00d6, B:18:0x012c, B:22:0x0136, B:25:0x0180, B:28:0x01b6, B:30:0x01c1, B:34:0x01cb, B:36:0x01d6, B:38:0x01dd, B:40:0x01e9, B:46:0x01b2, B:47:0x017b, B:50:0x0216), top: B:12:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b2 A[Catch: SQLiteException -> 0x01fe, all -> 0x022d, TryCatch #5 {all -> 0x022d, blocks: (B:13:0x00ce, B:16:0x00d6, B:18:0x012c, B:22:0x0136, B:25:0x0180, B:28:0x01b6, B:30:0x01c1, B:34:0x01cb, B:36:0x01d6, B:38:0x01dd, B:40:0x01e9, B:46:0x01b2, B:47:0x017b, B:50:0x0216), top: B:12:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017b A[Catch: SQLiteException -> 0x01fe, all -> 0x022d, TryCatch #5 {all -> 0x022d, blocks: (B:13:0x00ce, B:16:0x00d6, B:18:0x012c, B:22:0x0136, B:25:0x0180, B:28:0x01b6, B:30:0x01c1, B:34:0x01cb, B:36:0x01d6, B:38:0x01dd, B:40:0x01e9, B:46:0x01b2, B:47:0x017b, B:50:0x0216), top: B:12:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0229  */
    /* renamed from: zzbc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2182x394bd5 m19053x394b81(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.m19053x394b81(java.lang.String):com.google.android.gms.internal.measurement.zzdy");
    }

    /* renamed from: zzbd */
    public final long m19054x394b82(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        mo18961x394b61();
        m19257x394ba5();
        try {
            return m19049x240d90b1().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new java.lang.String[]{str, java.lang.String.valueOf(java.lang.Math.max(0, java.lang.Math.min(1000000, mo18978x394c20().zzb(str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6555x6f021d2))))});
        } catch (android.database.sqlite.SQLiteException e17) {
            mo18976x394c1e().m19108x394c64().zze("Error deleting over the limit events. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e17);
            return 0L;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006c: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:23:0x006c */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* renamed from: zzbe */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] m19055x394b83(java.lang.String r11) {
        /*
            r10 = this;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(r11)
            r10.mo18961x394b61()
            r10.m19257x394ba5()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.m19049x240d90b1()     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L52
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
            com.google.android.gms.internal.measurement.zzfg r3 = r10.mo18976x394c1e()     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
            com.google.android.gms.internal.measurement.zzfi r3 = r3.m19108x394c64()     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(r11)     // Catch: android.database.sqlite.SQLiteException -> L4e java.lang.Throwable -> L6b
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
            com.google.android.gms.internal.measurement.zzfg r3 = r10.mo18976x394c1e()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.measurement.zzfi r3 = r3.m19108x394c64()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(r11)     // Catch: java.lang.Throwable -> L6b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.m19055x394b83(java.lang.String):byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* renamed from: zzbf */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.Integer, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2357x394ca7> m19056x394b84(java.lang.String r12) {
        /*
            r11 = this;
            r11.m19257x394ba5()
            r11.mo18961x394b61()
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.m19049x240d90b1()
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
            com.google.android.gms.internal.measurement.zzabv r3 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135.zza(r3, r9, r4)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            com.google.android.gms.internal.measurement.zzkr r4 = new com.google.android.gms.internal.measurement.zzkr     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            r4.zzb(r3)     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            r1.put(r2, r4)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            goto L6c
        L56:
            r3 = move-exception
            com.google.android.gms.internal.measurement.zzfg r4 = r11.mo18976x394c1e()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            com.google.android.gms.internal.measurement.zzfi r4 = r4.m19108x394c64()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(r12)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> L94
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
            com.google.android.gms.internal.measurement.zzfg r2 = r11.mo18976x394c1e()     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.internal.measurement.zzfi r2 = r2.m19108x394c64()     // Catch: java.lang.Throwable -> L94
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(r12)     // Catch: java.lang.Throwable -> L94
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.m19056x394b84(java.lang.String):java.util.Map");
    }

    /* renamed from: zzbg */
    public final long m19057x394b85(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new java.lang.String[]{str}, 0L);
    }

    public final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf> zzc(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        mo18961x394b61();
        m19257x394ba5();
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
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2200x394bec zzf(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.zzf(java.lang.String, java.lang.String):com.google.android.gms.internal.measurement.zzeq");
    }

    public final void zzg(java.lang.String str, java.lang.String str2) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str2);
        mo18961x394b61();
        m19257x394ba5();
        try {
            mo18976x394c1e().m19115x394c6b().zzg("Deleted user attribute rows", java.lang.Integer.valueOf(m19049x240d90b1().delete("user_attributes", "app_id=? and name=?", new java.lang.String[]{str, str2})));
        } catch (android.database.sqlite.SQLiteException e17) {
            mo18976x394c1e().m19108x394c64().zzd("Error deleting user attribute. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), mo18972x394c1a().m19103x394b8a(str2), e17);
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0091: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:23:0x0091 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90 zzh(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(r14)
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(r15)
            r13.mo18961x394b61()
            r13.m19257x394ba5()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.m19049x240d90b1()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
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
            com.google.android.gms.internal.measurement.zzfg r3 = r13.mo18976x394c1e()     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzfi r3 = r3.m19108x394c64()     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(r14)     // Catch: android.database.sqlite.SQLiteException -> L6b java.lang.Throwable -> L90
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
            com.google.android.gms.internal.measurement.zzfg r3 = r13.mo18976x394c1e()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzfi r3 = r3.m19108x394c64()     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r5 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(r14)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzfe r6 = r13.mo18972x394c1a()     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = r6.m19103x394b8a(r15)     // Catch: java.lang.Throwable -> L90
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.zzh(java.lang.String, java.lang.String):com.google.android.gms.internal.measurement.zzjz");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2330x394c87
    /* renamed from: zzhf */
    public final boolean mo19018x394c3e() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /* renamed from: zzhn */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m19058x394c46() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m19049x240d90b1()
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
            com.google.android.gms.internal.measurement.zzfg r3 = r6.mo18976x394c1e()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.measurement.zzfi r3 = r3.m19108x394c64()     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.m19058x394c46():java.lang.String");
    }

    /* renamed from: zzho */
    public final boolean m19059x394c47() {
        return zza("select count(1) > 0 from queue where has_realtime = 1", (java.lang.String[]) null) != 0;
    }

    /* renamed from: zzhp */
    public final void m19060x394c48() {
        int delete;
        mo18961x394b61();
        m19257x394ba5();
        if (m19040x394c4e()) {
            long j17 = mo18977x394c1f().f6651x6f0222f.get();
            long mo18537x79952707 = mo18962x394b92().mo18537x79952707();
            if (java.lang.Math.abs(mo18537x79952707 - j17) > com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6564x6f021e0.get().longValue()) {
                mo18977x394c1f().f6651x6f0222f.set(mo18537x79952707);
                mo18961x394b61();
                m19257x394ba5();
                if (!m19040x394c4e() || (delete = m19049x240d90b1().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new java.lang.String[]{java.lang.String.valueOf(mo18962x394b92().mo18536x5cbba1cc()), java.lang.String.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2189x394be1.m19020x394c40())})) <= 0) {
                    return;
                }
                mo18976x394c1e().m19115x394c6b().zzg("Deleted stale rows. rowsDeleted", java.lang.Integer.valueOf(delete));
            }
        }
    }

    /* renamed from: zzhq */
    public final long m19061x394c49() {
        return zza("select max(bundle_end_timestamp) from queue", (java.lang.String[]) null, 0L);
    }

    /* renamed from: zzhr */
    public final long m19062x394c4a() {
        return zza("select max(timestamp) from raw_events", (java.lang.String[]) null, 0L);
    }

    /* renamed from: zzhs */
    public final boolean m19063x394c4b() {
        return zza("select count(1) > 0 from raw_events", (java.lang.String[]) null) != 0;
    }

    /* renamed from: zzht */
    public final boolean m19064x394c4c() {
        return zza("select count(1) > 0 from raw_events where realtime = 1", (java.lang.String[]) null) != 0;
    }

    /* renamed from: zzhu */
    public final long m19065x394c4d() {
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = m19049x240d90b1().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                long j17 = cursor.getLong(0);
                cursor.close();
                return j17;
            } catch (android.database.sqlite.SQLiteException e17) {
                mo18976x394c1e().m19108x394c64().zzg("Error querying raw events", e17);
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
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf zzi(java.lang.String r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.zzi(java.lang.String, java.lang.String):com.google.android.gms.internal.measurement.zzed");
    }

    public final int zzj(java.lang.String str, java.lang.String str2) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str2);
        mo18961x394b61();
        m19257x394ba5();
        try {
            return m19049x240d90b1().delete("conditional_properties", "app_id=? and name=?", new java.lang.String[]{str, str2});
        } catch (android.database.sqlite.SQLiteException e17) {
            mo18976x394c1e().m19108x394c64().zzd("Error deleting conditional property", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), mo18972x394c1a().m19103x394b8a(str2), e17);
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
    public final java.util.Map<java.lang.Integer, java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a>> zzk(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.m19257x394ba5()
            r12.mo18961x394b61()
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(r13)
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(r14)
            x.b r0 = new x.b
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.m19049x240d90b1()
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
            com.google.android.gms.internal.measurement.zzabv r1 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135.zza(r1, r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            com.google.android.gms.internal.measurement.zzke r2 = new com.google.android.gms.internal.measurement.zzke     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r2.zzb(r1)     // Catch: android.database.sqlite.SQLiteException -> L71 java.io.IOException -> L73 java.lang.Throwable -> Lab
            int r1 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.lang.Object r3 = r0.m174751x4aabfc28(r3, r9)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
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
            com.google.android.gms.internal.measurement.zzfg r2 = r12.mo18976x394c1e()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            com.google.android.gms.internal.measurement.zzfi r2 = r2.m19108x394c64()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(r13)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
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
            com.google.android.gms.internal.measurement.zzfg r1 = r12.mo18976x394c1e()     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.measurement.zzfi r1 = r1.m19108x394c64()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(r13)     // Catch: java.lang.Throwable -> Lab
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.zzk(java.lang.String, java.lang.String):java.util.Map");
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
    public final java.util.Map<java.lang.Integer, java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d>> zzl(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.m19257x394ba5()
            r12.mo18961x394b61()
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(r13)
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(r14)
            x.b r0 = new x.b
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.m19049x240d90b1()
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
            com.google.android.gms.internal.measurement.zzabv r1 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135.zza(r1, r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            com.google.android.gms.internal.measurement.zzkh r2 = new com.google.android.gms.internal.measurement.zzkh     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            r2.zzb(r1)     // Catch: android.database.sqlite.SQLiteException -> L71 java.io.IOException -> L73 java.lang.Throwable -> Lab
            int r1 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.lang.Object r3 = r0.m174751x4aabfc28(r3, r9)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
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
            com.google.android.gms.internal.measurement.zzfg r2 = r12.mo18976x394c1e()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            com.google.android.gms.internal.measurement.zzfi r2 = r2.m19108x394c64()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(r13)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> Lab
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
            com.google.android.gms.internal.measurement.zzfg r1 = r12.mo18976x394c1e()     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.internal.measurement.zzfi r1 = r1.m19108x394c64()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(r13)     // Catch: java.lang.Throwable -> Lab
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.zzl(java.lang.String, java.lang.String):java.util.Map");
    }

    public final long zzm(java.lang.String str, java.lang.String str2) {
        long zza;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str2);
        mo18961x394b61();
        m19257x394ba5();
        android.database.sqlite.SQLiteDatabase m19049x240d90b1 = m19049x240d90b1();
        m19049x240d90b1.beginTransaction();
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
                    contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, str);
                    contentValues.put("first_open_count", (java.lang.Integer) 0);
                    contentValues.put("previous_install_count", (java.lang.Integer) 0);
                    if (m19049x240d90b1.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        mo18976x394c1e().m19108x394c64().zze("Failed to insert column (got -1). appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), str2);
                        return -1L;
                    }
                    zza = 0;
                }
            } finally {
                m19049x240d90b1.endTransaction();
            }
        } catch (android.database.sqlite.SQLiteException e17) {
            e = e17;
        }
        try {
            android.content.ContentValues contentValues2 = new android.content.ContentValues();
            contentValues2.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, str);
            contentValues2.put(str2, java.lang.Long.valueOf(1 + zza));
            if (m19049x240d90b1.update("app2", contentValues2, "app_id = ?", new java.lang.String[]{str}) == 0) {
                mo18976x394c1e().m19108x394c64().zze("Failed to update column (got 0). appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), str2);
                return -1L;
            }
            m19049x240d90b1.setTransactionSuccessful();
            return zza;
        } catch (android.database.sqlite.SQLiteException e18) {
            long j18 = zza;
            e = e18;
            j17 = j18;
            mo18976x394c1e().m19108x394c64().zzd("Error inserting column. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), str2, e);
            m19049x240d90b1.endTransaction();
            return j17;
        }
    }

    private final long zza(java.lang.String str, java.lang.String[] strArr) {
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor rawQuery = m19049x240d90b1().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new android.database.sqlite.SQLiteException("Database returned empty set");
                }
                long j17 = rawQuery.getLong(0);
                rawQuery.close();
                return j17;
            } catch (android.database.sqlite.SQLiteException e17) {
                mo18976x394c1e().m19108x394c64().zze("Database error", str, e17);
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
    
        mo18976x394c1e().m19108x394c64().zzg("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90> zzb(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.zzb(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void zzc(java.util.List<java.lang.Long> list) {
        mo18961x394b61();
        m19257x394ba5();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(list);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18216x7b46f5f3(list.size());
        if (m19040x394c4e()) {
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
                mo18976x394c1e().m19111x394c67().log("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                android.database.sqlite.SQLiteDatabase m19049x240d90b1 = m19049x240d90b1();
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder(java.lang.String.valueOf(sb7).length() + 127);
                sb9.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb9.append(sb7);
                sb9.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                m19049x240d90b1.execSQL(sb9.toString());
            } catch (android.database.sqlite.SQLiteException e17) {
                mo18976x394c1e().m19108x394c64().zzg("Error incrementing retry count. error", e17);
            }
        }
    }

    private final long zza(java.lang.String str, java.lang.String[] strArr, long j17) {
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = m19049x240d90b1().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j17;
                }
                long j18 = cursor.getLong(0);
                cursor.close();
                return j18;
            } catch (android.database.sqlite.SQLiteException e17) {
                mo18976x394c1e().m19108x394c64().zze("Database error", str, e17);
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
    
        mo18976x394c1e().m19108x394c64().zzg("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf> zzb(java.lang.String r40, java.lang.String[] r41) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.zzb(java.lang.String, java.lang.String[]):java.util.List");
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
    public final android.util.Pair<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3, java.lang.Long> zza(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.mo18961x394b61()
            r7.m19257x394ba5()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.m19049x240d90b1()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L70
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
            com.google.android.gms.internal.measurement.zzfg r8 = r7.mo18976x394c1e()     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            com.google.android.gms.internal.measurement.zzfi r8 = r8.m19115x394c6b()     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            java.lang.String r9 = "Main event not found"
            r8.log(r9)     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            r1.close()
            return r0
        L35:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            long r5 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            int r5 = r2.length     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            com.google.android.gms.internal.measurement.zzabv r2 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135.zza(r2, r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            com.google.android.gms.internal.measurement.zzkn r4 = new com.google.android.gms.internal.measurement.zzkn     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            r4.zzb(r2)     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            android.util.Pair r8 = android.util.Pair.create(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            r1.close()
            return r8
        L56:
            r2 = move-exception
            com.google.android.gms.internal.measurement.zzfg r3 = r7.mo18976x394c1e()     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            com.google.android.gms.internal.measurement.zzfi r3 = r3.m19108x394c64()     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(r8)     // Catch: android.database.sqlite.SQLiteException -> L6c java.lang.Throwable -> L85
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
            com.google.android.gms.internal.measurement.zzfg r9 = r7.mo18976x394c1e()     // Catch: java.lang.Throwable -> L85
            com.google.android.gms.internal.measurement.zzfi r9 = r9.m19108x394c64()     // Catch: java.lang.Throwable -> L85
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2193x394be5 zza(long r23, java.lang.String r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.zza(long, java.lang.String, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.measurement.zzej");
    }

    private final java.lang.Object zza(android.database.Cursor cursor, int i17) {
        int type = cursor.getType(i17);
        if (type == 0) {
            mo18976x394c1e().m19108x394c64().log("Loaded invalid null value from database");
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
            mo18976x394c1e().m19108x394c64().zzg("Loaded invalid unknown value type, ignoring it", java.lang.Integer.valueOf(type));
            return null;
        }
        mo18976x394c1e().m19108x394c64().log("Loaded invalid blob type value, ignoring it");
        return null;
    }

    private static void zza(android.content.ContentValues contentValues, java.lang.String str, java.lang.Object obj) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(obj);
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

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2182x394bd5 c2182x394bd5) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2182x394bd5);
        mo18961x394b61();
        m19257x394ba5();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, c2182x394bd5.m18986x394b67());
        contentValues.put("app_instance_id", c2182x394bd5.m18979x4b6169db());
        contentValues.put("gmp_app_id", c2182x394bd5.m18980x9061da68());
        contentValues.put("resettable_device_id_hash", c2182x394bd5.m18994x394c22());
        contentValues.put("last_bundle_index", java.lang.Long.valueOf(c2182x394bd5.m19002x394c2a()));
        contentValues.put("last_bundle_start_timestamp", java.lang.Long.valueOf(c2182x394bd5.m18996x394c24()));
        contentValues.put("last_bundle_end_timestamp", java.lang.Long.valueOf(c2182x394bd5.m18997x394c25()));
        contentValues.put("app_version", c2182x394bd5.m18985x394b66());
        contentValues.put("app_store", c2182x394bd5.m18999x394c27());
        contentValues.put("gmp_version", java.lang.Long.valueOf(c2182x394bd5.m19000x394c28()));
        contentValues.put("dev_cert_hash", java.lang.Long.valueOf(c2182x394bd5.m19001x394c29()));
        contentValues.put("measurement_enabled", java.lang.Boolean.valueOf(c2182x394bd5.m18981x38846eaf()));
        contentValues.put("day", java.lang.Long.valueOf(c2182x394bd5.m19006x394c2e()));
        contentValues.put("daily_public_events_count", java.lang.Long.valueOf(c2182x394bd5.m19007x394c2f()));
        contentValues.put("daily_events_count", java.lang.Long.valueOf(c2182x394bd5.m19008x394c30()));
        contentValues.put("daily_conversions_count", java.lang.Long.valueOf(c2182x394bd5.m19009x394c31()));
        contentValues.put("config_fetched_time", java.lang.Long.valueOf(c2182x394bd5.m19003x394c2b()));
        contentValues.put("failed_config_fetch_time", java.lang.Long.valueOf(c2182x394bd5.m19004x394c2c()));
        contentValues.put("app_version_int", java.lang.Long.valueOf(c2182x394bd5.m18998x394c26()));
        contentValues.put("firebase_instance_id", c2182x394bd5.m18995x394c23());
        contentValues.put("daily_error_events_count", java.lang.Long.valueOf(c2182x394bd5.m19011x394c33()));
        contentValues.put("daily_realtime_events_count", java.lang.Long.valueOf(c2182x394bd5.m19010x394c32()));
        contentValues.put("health_monitor_sample", c2182x394bd5.m19012x394c39());
        contentValues.put("android_id", java.lang.Long.valueOf(c2182x394bd5.m19014x394c3b()));
        contentValues.put("adid_reporting_enabled", java.lang.Boolean.valueOf(c2182x394bd5.m19015x394c3c()));
        contentValues.put("ssaid_reporting_enabled", java.lang.Boolean.valueOf(c2182x394bd5.m19016x394c3d()));
        try {
            android.database.sqlite.SQLiteDatabase m19049x240d90b1 = m19049x240d90b1();
            if (m19049x240d90b1.update("apps", contentValues, "app_id = ?", new java.lang.String[]{c2182x394bd5.m18986x394b67()}) == 0 && m19049x240d90b1.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                mo18976x394c1e().m19108x394c64().zzg("Failed to insert/update app (got -1). appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2182x394bd5.m18986x394b67()));
            }
        } catch (android.database.sqlite.SQLiteException e17) {
            mo18976x394c1e().m19108x394c64().zze("Error storing app. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2182x394bd5.m18986x394b67()), e17);
        }
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2200x394bec c2200x394bec) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2200x394bec);
        mo18961x394b61();
        m19257x394ba5();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, c2200x394bec.f6524x394db5);
        contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c2200x394bec.f6516x337a8b);
        contentValues.put("lifetime_count", java.lang.Long.valueOf(c2200x394bec.f6517x6f021ad));
        contentValues.put("current_bundle_count", java.lang.Long.valueOf(c2200x394bec.f6518x6f021ae));
        contentValues.put("last_fire_timestamp", java.lang.Long.valueOf(c2200x394bec.f6519x6f021af));
        contentValues.put("last_bundled_timestamp", java.lang.Long.valueOf(c2200x394bec.f6520x6f021b0));
        contentValues.put("last_sampled_complex_event_id", c2200x394bec.f6521x6f021b1);
        contentValues.put("last_sampling_rate", c2200x394bec.f6522x6f021b2);
        java.lang.Boolean bool = c2200x394bec.f6523x6f021b3;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m19049x240d90b1().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                mo18976x394c1e().m19108x394c64().zzg("Failed to insert/update event aggregates (got -1). appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2200x394bec.f6524x394db5));
            }
        } catch (android.database.sqlite.SQLiteException e17) {
            mo18976x394c1e().m19108x394c64().zze("Error storing event aggregates. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2200x394bec.f6524x394db5), e17);
        }
    }

    public static void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 c2216x394c01, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (c2216x394c01 == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        java.io.File file = new java.io.File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            c2216x394c01.m19111x394c67().log("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c2216x394c01.m19111x394c67().log("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c2216x394c01.m19111x394c67().log("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c2216x394c01.m19111x394c67().log("Failed to turn on database write permission for owner");
    }

    public static void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 c2216x394c01, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        if (c2216x394c01 == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        if (!zza(c2216x394c01, sQLiteDatabase, str)) {
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
            c2216x394c01.m19111x394c67().zze("Table has extra columns. table, columns", str, android.text.TextUtils.join(", ", zzb));
        } catch (android.database.sqlite.SQLiteException e17) {
            c2216x394c01.m19108x394c64().zzg("Failed to verify columns on table that was just created", str);
            throw e17;
        }
    }

    public final void zza(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99[] c2343x394c99Arr) {
        boolean z17;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19111x394c67;
        java.lang.String str2;
        java.lang.Object m19104x394b8b;
        java.lang.Object obj;
        m19257x394ba5();
        mo18961x394b61();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2343x394c99Arr);
        android.database.sqlite.SQLiteDatabase m19049x240d90b1 = m19049x240d90b1();
        m19049x240d90b1.beginTransaction();
        try {
            m19257x394ba5();
            mo18961x394b61();
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
            android.database.sqlite.SQLiteDatabase m19049x240d90b12 = m19049x240d90b1();
            m19049x240d90b12.delete("property_filters", "app_id=?", new java.lang.String[]{str});
            m19049x240d90b12.delete("event_filters", "app_id=?", new java.lang.String[]{str});
            for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99 c2343x394c99 : c2343x394c99Arr) {
                m19257x394ba5();
                mo18961x394b61();
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2343x394c99);
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2343x394c99.f7044x6f0231d);
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2343x394c99.f7043x6f0231c);
                java.lang.Integer num = c2343x394c99.f7042x6f0231b;
                if (num != null) {
                    int intValue = num.intValue();
                    com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a[] c2344x394c9aArr = c2343x394c99.f7044x6f0231d;
                    int length = c2344x394c9aArr.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length) {
                            for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d c2347x394c9d : c2343x394c99.f7043x6f0231c) {
                                if (c2347x394c9d.f7062x6f0231f == null) {
                                    m19111x394c67 = mo18976x394c1e().m19111x394c67();
                                    str2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                    m19104x394b8b = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str);
                                    obj = c2343x394c99.f7042x6f0231b;
                                }
                            }
                            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a[] c2344x394c9aArr2 = c2343x394c99.f7044x6f0231d;
                            int length2 = c2344x394c9aArr2.length;
                            int i18 = 0;
                            while (true) {
                                if (i18 >= length2) {
                                    z17 = true;
                                    break;
                                } else {
                                    if (!zza(str, intValue, c2344x394c9aArr2[i18])) {
                                        z17 = false;
                                        break;
                                    }
                                    i18++;
                                }
                            }
                            if (z17) {
                                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d[] c2347x394c9dArr = c2343x394c99.f7043x6f0231c;
                                int length3 = c2347x394c9dArr.length;
                                int i19 = 0;
                                while (true) {
                                    if (i19 >= length3) {
                                        break;
                                    }
                                    if (!zza(str, intValue, c2347x394c9dArr[i19])) {
                                        z17 = false;
                                        break;
                                    }
                                    i19++;
                                }
                            }
                            if (!z17) {
                                m19257x394ba5();
                                mo18961x394b61();
                                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
                                android.database.sqlite.SQLiteDatabase m19049x240d90b13 = m19049x240d90b1();
                                m19049x240d90b13.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{str, java.lang.String.valueOf(intValue)});
                                m19049x240d90b13.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{str, java.lang.String.valueOf(intValue)});
                            }
                        } else {
                            if (c2344x394c9aArr[i17].f7046x6f0231f == null) {
                                m19111x394c67 = mo18976x394c1e().m19111x394c67();
                                str2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                m19104x394b8b = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str);
                                obj = c2343x394c99.f7042x6f0231b;
                                break;
                            }
                            i17++;
                        }
                    }
                    m19111x394c67.zze(str2, m19104x394b8b, obj);
                    break;
                } else {
                    mo18976x394c1e().m19111x394c67().zzg("Audience with no ID. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str));
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2343x394c99 c2343x394c992 : c2343x394c99Arr) {
                arrayList.add(c2343x394c992.f7042x6f0231b);
            }
            zza(str, arrayList);
            m19049x240d90b1.setTransactionSuccessful();
        } finally {
            m19049x240d90b1.endTransaction();
        }
    }

    public final boolean zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf c2187x394bdf) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2187x394bdf);
        mo18961x394b61();
        m19257x394ba5();
        if (zzh(c2187x394bdf.f6476x362a8ff1, c2187x394bdf.f6480x6f0218c.f7021x337a8b) == null && zza("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new java.lang.String[]{c2187x394bdf.f6476x362a8ff1}) >= 1000) {
            return false;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, c2187x394bdf.f6476x362a8ff1);
        contentValues.put(ya.b.f77495x8b74a326, c2187x394bdf.f6475xc3e1af26);
        contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c2187x394bdf.f6480x6f0218c.f7021x337a8b);
        zza(contentValues, "value", c2187x394bdf.f6480x6f0218c.m19277x754a37bb());
        contentValues.put("active", java.lang.Boolean.valueOf(c2187x394bdf.f6473xab2f7f06));
        contentValues.put("trigger_event_name", c2187x394bdf.f6478xed343d6d);
        contentValues.put("trigger_timeout", java.lang.Long.valueOf(c2187x394bdf.f6479xbe733089));
        mo18973x394c1b();
        contentValues.put("timed_out_event", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zza(c2187x394bdf.f6481x6f0218d));
        contentValues.put("creation_timestamp", java.lang.Long.valueOf(c2187x394bdf.f6474xe9ef24f7));
        mo18973x394c1b();
        contentValues.put("triggered_event", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zza(c2187x394bdf.f6482x6f0218e));
        contentValues.put("triggered_timestamp", java.lang.Long.valueOf(c2187x394bdf.f6480x6f0218c.f7025x6f0230a));
        contentValues.put("time_to_live", java.lang.Long.valueOf(c2187x394bdf.f6477x30a5af34));
        mo18973x394c1b();
        contentValues.put("expired_event", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zza(c2187x394bdf.f6483x6f0218f));
        try {
            if (m19049x240d90b1().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            mo18976x394c1e().m19108x394c64().zzg("Failed to insert/update conditional user property (got -1)", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2187x394bdf.f6476x362a8ff1));
            return true;
        } catch (android.database.sqlite.SQLiteException e17) {
            mo18976x394c1e().m19108x394c64().zze("Error storing conditional user property", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2187x394bdf.f6476x362a8ff1), e17);
            return true;
        }
    }

    public final boolean zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2199x394beb c2199x394beb, long j17, boolean z17) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19108x394c64;
        java.lang.Object m19104x394b8b;
        java.lang.String str;
        android.content.ContentValues contentValues;
        mo18961x394b61();
        m19257x394ba5();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2199x394beb);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(c2199x394beb.f6515x394db5);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3 c2353x394ca3 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3();
        c2353x394ca3.f7093x6f02350 = java.lang.Long.valueOf(c2199x394beb.f6513x6f021ab);
        c2353x394ca3.f7091x6f0234e = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4[c2199x394beb.f6514x6f021ac.m19079x35e001()];
        java.util.Iterator<java.lang.String> it = c2199x394beb.f6514x6f021ac.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.String next = it.next();
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4 c2354x394ca4 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2354x394ca4();
            c2353x394ca3.f7091x6f0234e[i17] = c2354x394ca4;
            c2354x394ca4.f7095x337a8b = next;
            mo18973x394c1b().zza(c2354x394ca4, c2199x394beb.f6514x6f021ac.get(next));
            i17++;
        }
        try {
            int m18953x394df7 = c2353x394ca3.m18953x394df7();
            byte[] bArr = new byte[m18953x394df7];
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(bArr, 0, m18953x394df7);
            c2353x394ca3.zza(zzb);
            zzb.m18920x394def();
            mo18976x394c1e().m19115x394c6b().zze("Saving event, name, data size", mo18972x394c1a().m19101x394b88(c2199x394beb.f6510x337a8b), java.lang.Integer.valueOf(m18953x394df7));
            contentValues = new android.content.ContentValues();
            contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, c2199x394beb.f6515x394db5);
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c2199x394beb.f6510x337a8b);
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(c2199x394beb.f6512x3492916));
            contentValues.put("metadata_fingerprint", java.lang.Long.valueOf(j17));
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, bArr);
            contentValues.put("realtime", java.lang.Integer.valueOf(z17 ? 1 : 0));
        } catch (java.io.IOException e17) {
            e = e17;
            m19108x394c64 = mo18976x394c1e().m19108x394c64();
            m19104x394b8b = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2199x394beb.f6515x394db5);
            str = "Data loss. Failed to serialize event params/data. appId";
        }
        try {
            if (m19049x240d90b1().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            mo18976x394c1e().m19108x394c64().zzg("Failed to insert raw event (got -1). appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2199x394beb.f6515x394db5));
            return false;
        } catch (android.database.sqlite.SQLiteException e18) {
            e = e18;
            m19108x394c64 = mo18976x394c1e().m19108x394c64();
            m19104x394b8b = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2199x394beb.f6515x394db5);
            str = "Error storing raw event. appId";
            m19108x394c64.zze(str, m19104x394b8b, e);
            return false;
        }
    }

    private static boolean zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 c2216x394c01, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        if (c2216x394c01 == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new java.lang.String[]{com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d}, "name=?", new java.lang.String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                return moveToFirst;
            } catch (android.database.sqlite.SQLiteException e17) {
                c2216x394c01.m19111x394c67().zze("Error querying for table", str, e17);
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

    public final boolean zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2339x394c90 c2339x394c90) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2339x394c90);
        mo18961x394b61();
        m19257x394ba5();
        if (zzh(c2339x394c90.f7033x394db5, c2339x394c90.f7029x337a8b) == null) {
            if (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.m19280x394ba0(c2339x394c90.f7029x337a8b)) {
                if (zza("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new java.lang.String[]{c2339x394c90.f7033x394db5}) >= 25) {
                    return false;
                }
            } else if (zza("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new java.lang.String[]{c2339x394c90.f7033x394db5, c2339x394c90.f7030xc3e1af26}) >= 25) {
                return false;
            }
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, c2339x394c90.f7033x394db5);
        contentValues.put(ya.b.f77495x8b74a326, c2339x394c90.f7030xc3e1af26);
        contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c2339x394c90.f7029x337a8b);
        contentValues.put("set_timestamp", java.lang.Long.valueOf(c2339x394c90.f7032x6f0230a));
        zza(contentValues, "value", c2339x394c90.f7031x6ac9171);
        try {
            if (m19049x240d90b1().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            mo18976x394c1e().m19108x394c64().zzg("Failed to insert/update user property (got -1). appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2339x394c90.f7033x394db5));
            return true;
        } catch (android.database.sqlite.SQLiteException e17) {
            mo18976x394c1e().m19108x394c64().zze("Error storing user property. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2339x394c90.f7033x394db5), e17);
            return true;
        }
    }

    public final boolean zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2356x394ca6 c2356x394ca6, boolean z17) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2218x394c03 m19108x394c64;
        java.lang.Object m19104x394b8b;
        java.lang.String str;
        android.content.ContentValues contentValues;
        mo18961x394b61();
        m19257x394ba5();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2356x394ca6);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(c2356x394ca6.f7138x394db5);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2356x394ca6.f7113x6f0235a);
        m19060x394c48();
        long mo18536x5cbba1cc = mo18962x394b92().mo18536x5cbba1cc();
        if (c2356x394ca6.f7113x6f0235a.longValue() < mo18536x5cbba1cc - com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2189x394be1.m19020x394c40() || c2356x394ca6.f7113x6f0235a.longValue() > com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2189x394be1.m19020x394c40() + mo18536x5cbba1cc) {
            mo18976x394c1e().m19111x394c67().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2356x394ca6.f7138x394db5), java.lang.Long.valueOf(mo18536x5cbba1cc), c2356x394ca6.f7113x6f0235a);
        }
        try {
            int m18953x394df7 = c2356x394ca6.m18953x394df7();
            byte[] bArr = new byte[m18953x394df7];
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(bArr, 0, m18953x394df7);
            c2356x394ca6.zza(zzb);
            zzb.m18920x394def();
            byte[] zza = mo18973x394c1b().zza(bArr);
            mo18976x394c1e().m19115x394c6b().zzg("Saving bundle, size", java.lang.Integer.valueOf(zza.length));
            contentValues = new android.content.ContentValues();
            contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, c2356x394ca6.f7138x394db5);
            contentValues.put("bundle_end_timestamp", c2356x394ca6.f7113x6f0235a);
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, zza);
            contentValues.put("has_realtime", java.lang.Integer.valueOf(z17 ? 1 : 0));
            java.lang.Integer num = c2356x394ca6.f7136x6f02376;
            if (num != null) {
                contentValues.put("retry_count", num);
            }
        } catch (java.io.IOException e17) {
            e = e17;
            m19108x394c64 = mo18976x394c1e().m19108x394c64();
            m19104x394b8b = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2356x394ca6.f7138x394db5);
            str = "Data loss. Failed to serialize bundle. appId";
        }
        try {
            if (m19049x240d90b1().insert("queue", null, contentValues) != -1) {
                return true;
            }
            mo18976x394c1e().m19108x394c64().zzg("Failed to insert bundle (got -1). appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2356x394ca6.f7138x394db5));
            return false;
        } catch (android.database.sqlite.SQLiteException e18) {
            e = e18;
            m19108x394c64 = mo18976x394c1e().m19108x394c64();
            m19104x394b8b = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(c2356x394ca6.f7138x394db5);
            str = "Error storing bundle. appId";
            m19108x394c64.zze(str, m19104x394b8b, e);
            return false;
        }
    }

    private final boolean zza(java.lang.String str, int i17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2344x394c9a c2344x394c9a) {
        m19257x394ba5();
        mo18961x394b61();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2344x394c9a);
        if (android.text.TextUtils.isEmpty(c2344x394c9a.f7047x6f02320)) {
            mo18976x394c1e().m19111x394c67().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), java.lang.Integer.valueOf(i17), java.lang.String.valueOf(c2344x394c9a.f7046x6f0231f));
            return false;
        }
        try {
            int m18953x394df7 = c2344x394c9a.m18953x394df7();
            byte[] bArr = new byte[m18953x394df7];
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(bArr, 0, m18953x394df7);
            c2344x394c9a.zza(zzb);
            zzb.m18920x394def();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, str);
            contentValues.put("audience_id", java.lang.Integer.valueOf(i17));
            contentValues.put("filter_id", c2344x394c9a.f7046x6f0231f);
            contentValues.put("event_name", c2344x394c9a.f7047x6f02320);
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, bArr);
            try {
                if (m19049x240d90b1().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                mo18976x394c1e().m19108x394c64().zzg("Failed to insert event filter (got -1). appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str));
                return true;
            } catch (android.database.sqlite.SQLiteException e17) {
                mo18976x394c1e().m19108x394c64().zze("Error storing event filter. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e17);
                return false;
            }
        } catch (java.io.IOException e18) {
            mo18976x394c1e().m19108x394c64().zze("Configuration loss. Failed to serialize event filter. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e18);
            return false;
        }
    }

    private final boolean zza(java.lang.String str, int i17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2347x394c9d c2347x394c9d) {
        m19257x394ba5();
        mo18961x394b61();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2347x394c9d);
        if (android.text.TextUtils.isEmpty(c2347x394c9d.f7063x6f02334)) {
            mo18976x394c1e().m19111x394c67().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), java.lang.Integer.valueOf(i17), java.lang.String.valueOf(c2347x394c9d.f7062x6f0231f));
            return false;
        }
        try {
            int m18953x394df7 = c2347x394c9d.m18953x394df7();
            byte[] bArr = new byte[m18953x394df7];
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(bArr, 0, m18953x394df7);
            c2347x394c9d.zza(zzb);
            zzb.m18920x394def();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, str);
            contentValues.put("audience_id", java.lang.Integer.valueOf(i17));
            contentValues.put("filter_id", c2347x394c9d.f7062x6f0231f);
            contentValues.put("property_name", c2347x394c9d.f7063x6f02334);
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, bArr);
            try {
                if (m19049x240d90b1().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                mo18976x394c1e().m19108x394c64().zzg("Failed to insert property filter (got -1). appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str));
                return false;
            } catch (android.database.sqlite.SQLiteException e17) {
                mo18976x394c1e().m19108x394c64().zze("Error storing property filter. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e17);
                return false;
            }
        } catch (java.io.IOException e18) {
            mo18976x394c1e().m19108x394c64().zze("Configuration loss. Failed to serialize property filter. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e18);
            return false;
        }
    }

    public final boolean zza(java.lang.String str, java.lang.Long l17, long j17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2353x394ca3 c2353x394ca3) {
        mo18961x394b61();
        m19257x394ba5();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2353x394ca3);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(l17);
        try {
            int m18953x394df7 = c2353x394ca3.m18953x394df7();
            byte[] bArr = new byte[m18953x394df7];
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136.zzb(bArr, 0, m18953x394df7);
            c2353x394ca3.zza(zzb);
            zzb.m18920x394def();
            mo18976x394c1e().m19115x394c6b().zze("Saving complex main event, appId, data size", mo18972x394c1a().m19101x394b88(str), java.lang.Integer.valueOf(m18953x394df7));
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, str);
            contentValues.put("event_id", l17);
            contentValues.put("children_to_process", java.lang.Long.valueOf(j17));
            contentValues.put("main_event", bArr);
            try {
                if (m19049x240d90b1().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                    return true;
                }
                mo18976x394c1e().m19108x394c64().zzg("Failed to insert complex main event (got -1). appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str));
                return false;
            } catch (android.database.sqlite.SQLiteException e17) {
                mo18976x394c1e().m19108x394c64().zze("Error storing complex main event. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e17);
                return false;
            }
        } catch (java.io.IOException e18) {
            mo18976x394c1e().m19108x394c64().zzd("Data loss. Failed to serialize event params/data. appId, eventId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), l17, e18);
            return false;
        }
    }

    private final boolean zza(java.lang.String str, java.util.List<java.lang.Integer> list) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        m19257x394ba5();
        mo18961x394b61();
        android.database.sqlite.SQLiteDatabase m19049x240d90b1 = m19049x240d90b1();
        try {
            long zza = zza("select count(1) from audience_filter_values where app_id=?", new java.lang.String[]{str});
            int max = java.lang.Math.max(0, java.lang.Math.min(2000, mo18978x394c20().zzb(str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6571x6f021e7)));
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
            return m19049x240d90b1.delete("audience_filter_values", sb8.toString(), new java.lang.String[]{str, java.lang.Integer.toString(max)}) > 0;
        } catch (android.database.sqlite.SQLiteException e17) {
            mo18976x394c1e().m19108x394c64().zze("Database error querying filters. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str), e17);
            return false;
        }
    }
}
