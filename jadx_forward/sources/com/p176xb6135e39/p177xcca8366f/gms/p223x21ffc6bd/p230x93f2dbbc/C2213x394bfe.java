package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzfd */
/* loaded from: classes16.dex */
public final class C2213x394bfe extends android.database.sqlite.SQLiteOpenHelper {

    /* renamed from: zzaii */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2212x394bfd f6600x6f02201;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2213x394bfe(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2212x394bfd c2212x394bfd, android.content.Context context, java.lang.String str) {
        super(context, str, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        this.f6600x6f02201 = c2212x394bfd;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (android.database.sqlite.SQLiteDatabaseLockedException e17) {
            throw e17;
        } catch (android.database.sqlite.SQLiteException unused) {
            this.f6600x6f02201.mo18976x394c1e().m19108x394c64().log("Opening the local database failed, dropping and recreating it");
            if (!this.f6600x6f02201.mo18960x76847179().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f6600x6f02201.mo18976x394c1e().m19108x394c64().zzg("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (android.database.sqlite.SQLiteException e18) {
                this.f6600x6f02201.mo18976x394c1e().m19108x394c64().zzg("Failed to open local database. Events will bypass local storage", e18);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.zza(this.f6600x6f02201.mo18976x394c1e(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i17, int i18) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2192x394be4.zza(this.f6600x6f02201.mo18976x394c1e(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i17, int i18) {
    }
}
