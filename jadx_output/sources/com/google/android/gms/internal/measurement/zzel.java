package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzel extends android.database.sqlite.SQLiteOpenHelper {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzei zzafi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(com.google.android.gms.internal.measurement.zzei zzeiVar, android.content.Context context, java.lang.String str) {
        super(context, str, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        this.zzafi = zzeiVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        com.google.android.gms.internal.measurement.zzjm zzjmVar;
        com.google.android.gms.internal.measurement.zzjm zzjmVar2;
        com.google.android.gms.internal.measurement.zzjm zzjmVar3;
        zzjmVar = this.zzafi.zzafc;
        if (!zzjmVar.zzj(3600000L)) {
            throw new android.database.sqlite.SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (android.database.sqlite.SQLiteException unused) {
            zzjmVar2 = this.zzafi.zzafc;
            zzjmVar2.start();
            this.zzafi.zzge().zzim().log("Opening the database failed, dropping and recreating it");
            if (!this.zzafi.getContext().getDatabasePath("google_app_measurement.db").delete()) {
                this.zzafi.zzge().zzim().zzg("Failed to delete corrupted db file", "google_app_measurement.db");
            }
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = super.getWritableDatabase();
                zzjmVar3 = this.zzafi.zzafc;
                zzjmVar3.clear();
                return writableDatabase;
            } catch (android.database.sqlite.SQLiteException e17) {
                this.zzafi.zzge().zzim().zzg("Failed to open freshly created database", e17);
                throw e17;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        com.google.android.gms.internal.measurement.zzei.zza(this.zzafi.zzge(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i17, int i18) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        java.lang.String[] strArr3;
        java.lang.String[] strArr4;
        java.lang.String[] strArr5;
        java.lang.String[] strArr6;
        com.google.android.gms.internal.measurement.zzfg zzge = this.zzafi.zzge();
        strArr = com.google.android.gms.internal.measurement.zzei.zzaev;
        com.google.android.gms.internal.measurement.zzei.zza(zzge, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", strArr);
        com.google.android.gms.internal.measurement.zzei.zza(this.zzafi.zzge(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        com.google.android.gms.internal.measurement.zzfg zzge2 = this.zzafi.zzge();
        strArr2 = com.google.android.gms.internal.measurement.zzei.zzaew;
        com.google.android.gms.internal.measurement.zzei.zza(zzge2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", strArr2);
        com.google.android.gms.internal.measurement.zzfg zzge3 = this.zzafi.zzge();
        strArr3 = com.google.android.gms.internal.measurement.zzei.zzaex;
        com.google.android.gms.internal.measurement.zzei.zza(zzge3, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", strArr3);
        com.google.android.gms.internal.measurement.zzfg zzge4 = this.zzafi.zzge();
        strArr4 = com.google.android.gms.internal.measurement.zzei.zzaez;
        com.google.android.gms.internal.measurement.zzei.zza(zzge4, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", strArr4);
        com.google.android.gms.internal.measurement.zzei.zza(this.zzafi.zzge(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        com.google.android.gms.internal.measurement.zzfg zzge5 = this.zzafi.zzge();
        strArr5 = com.google.android.gms.internal.measurement.zzei.zzaey;
        com.google.android.gms.internal.measurement.zzei.zza(zzge5, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", strArr5);
        com.google.android.gms.internal.measurement.zzei.zza(this.zzafi.zzge(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", null);
        com.google.android.gms.internal.measurement.zzei.zza(this.zzafi.zzge(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", null);
        com.google.android.gms.internal.measurement.zzei.zza(this.zzafi.zzge(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        com.google.android.gms.internal.measurement.zzfg zzge6 = this.zzafi.zzge();
        strArr6 = com.google.android.gms.internal.measurement.zzei.zzafa;
        com.google.android.gms.internal.measurement.zzei.zza(zzge6, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", strArr6);
        com.google.android.gms.internal.measurement.zzei.zza(this.zzafi.zzge(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i17, int i18) {
    }
}
