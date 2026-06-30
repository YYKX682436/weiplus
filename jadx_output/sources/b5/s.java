package b5;

/* loaded from: classes13.dex */
public class s extends m4.a {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f17881c;

    public s(android.content.Context context) {
        super(9, 10);
        this.f17881c = context;
    }

    @Override // m4.a
    public void a(p4.b bVar) {
        q4.c cVar = (q4.c) bVar;
        cVar.c("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        android.content.Context context = this.f17881c;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        boolean contains = sharedPreferences.contains("reschedule_needed");
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = cVar.f360007d;
        if (contains || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j17 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j18 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            cVar.a();
            try {
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new java.lang.Object[]{"last_cancel_all_time_ms", java.lang.Long.valueOf(j17)});
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new java.lang.Object[]{"reschedule_needed", java.lang.Long.valueOf(j18)});
                sharedPreferences.edit().clear().apply();
                cVar.j();
            } finally {
            }
        }
        android.content.SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i17 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i18 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            cVar.a();
            try {
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new java.lang.Object[]{"next_job_scheduler_id", java.lang.Integer.valueOf(i17)});
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new java.lang.Object[]{"next_alarm_manager_id", java.lang.Integer.valueOf(i18)});
                sharedPreferences2.edit().clear().apply();
                cVar.j();
            } finally {
            }
        }
    }
}
