package h52;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static volatile h52.c f360571b;

    /* renamed from: a, reason: collision with root package name */
    public final h52.a f360572a = new h52.d();

    public c() {
        if (b52.b.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.ActivityDao_MMKV", "ActivityDao_MMKV reset");
            c52.c.d("hell_aty_action_mmkv_key", new byte[0]);
        }
    }

    public static h52.c a() {
        if (f360571b == null) {
            synchronized (h52.c.class) {
                if (f360571b == null) {
                    f360571b = new h52.c();
                }
            }
        }
        return f360571b;
    }
}
