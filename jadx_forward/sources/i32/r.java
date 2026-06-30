package i32;

/* loaded from: classes13.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static i32.r f369670b;

    /* renamed from: a, reason: collision with root package name */
    public long f369671a;

    public r() {
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("exdevice_pref", 0);
        long j17 = 0;
        if (sharedPreferences != null) {
            j17 = sharedPreferences.getLong("local_message_seq", 0L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.Util", "lasted seq id is %d", java.lang.Long.valueOf(j17));
        }
        this.f369671a = j17;
    }
}
