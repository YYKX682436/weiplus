package sy;

/* loaded from: classes5.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f495319a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f495320b;

    /* renamed from: c, reason: collision with root package name */
    public long f495321c;

    /* renamed from: d, reason: collision with root package name */
    public long f495322d;

    /* renamed from: e, reason: collision with root package name */
    public long f495323e;

    public c0(java.lang.String str) {
        this.f495319a = str;
    }

    public void a() {
        java.lang.Object[] objArr = new java.lang.Object[5];
        java.lang.String str = this.f495319a;
        objArr[0] = str;
        objArr[1] = this.f495320b ? "true" : "false";
        objArr[2] = java.lang.Long.valueOf(this.f495321c);
        objArr[3] = java.lang.Long.valueOf(this.f495322d);
        objArr[4] = java.lang.Long.valueOf(this.f495323e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginMsgReporter", "report %s isMute:%s, recvMsgCount:%d, unreadMsgCount:%d, time:%d", objArr);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("plugin_type", str);
        hashMap.put("mute_type", java.lang.Integer.valueOf(this.f495320b ? 1 : 0));
        hashMap.put("receive_msg_cnt", java.lang.Long.valueOf(this.f495321c));
        hashMap.put("unread_msg_cnt", java.lang.Long.valueOf(this.f495322d));
        hashMap.put("out_background_ts", java.lang.Long.valueOf(this.f495323e));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("app_out_background", hashMap, 35186);
    }
}
