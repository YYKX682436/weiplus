package n25;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f415850a = "";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f415851b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f415852c = "";

    /* renamed from: d, reason: collision with root package name */
    public static long f415853d;

    public static java.lang.String a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f415850a)) {
            f415850a = gm0.m.v().getString("message_channel_id", "message_channel_new_id");
        }
        return f415850a;
    }

    public static java.lang.String b() {
        boolean z17;
        if (fp.h.c(26)) {
            android.text.format.Time time = new android.text.format.Time();
            time.setToNow();
            if (ip.b.q(time.hour, time.minute, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                z17 = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NotificationHelper", "no shake & sound notification during background deactive time");
                z17 = true;
            }
            if (z17) {
                return "message_dnd_mode_channel_id";
            }
        }
        return a();
    }
}
