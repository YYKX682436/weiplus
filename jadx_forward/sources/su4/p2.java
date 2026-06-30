package su4;

/* loaded from: classes.dex */
public abstract class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static r45.ww5 f494570a;

    public static r45.ww5 a() {
        if (f494570a == null) {
            java.lang.String str = "key_pb_history_list" + c01.z1.r();
            f494570a = new r45.ww5();
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("fts_history_search_sp", 0).getString(str, "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                try {
                    f494570a.mo11468x92b714fd(android.util.Base64.decode(string.getBytes(), 0));
                } catch (java.io.IOException unused) {
                }
            }
        }
        return f494570a;
    }
}
