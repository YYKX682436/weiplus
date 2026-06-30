package b5;

/* loaded from: classes13.dex */
public class r extends m4.a {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f99413c;

    public r(android.content.Context context, int i17, int i18) {
        super(i17, i18);
        this.f99413c = context;
    }

    @Override // m4.a
    public void a(p4.b bVar) {
        if (this.f404928b < 10) {
            this.f99413c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        } else {
            ((q4.c) bVar).f441540d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new java.lang.Object[]{"reschedule_needed", 1});
        }
    }
}
