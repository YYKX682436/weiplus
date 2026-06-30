package ws0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ws0.a f530486a = new ws0.a();

    /* renamed from: b, reason: collision with root package name */
    public static int f530487b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static int f530488c = 40;

    /* renamed from: d, reason: collision with root package name */
    public static int f530489d = 40;

    /* renamed from: e, reason: collision with root package name */
    public static yz5.p f530490e;

    public final void a(java.lang.String type, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VendorConfig", "setConfig: " + type + ", " + i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("vendor_effect_config");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(type, ya.b.f77487x44fa364)) {
            f530487b = i17;
            M.putInt("vendor_fb_level", i17);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(type, "skin")) {
            f530488c = i17;
            M.putInt("vendor_skin_rate", i17);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(type, "slim")) {
            f530489d = i17;
            M.putInt("vendor_slim_rate", i17);
        }
        yz5.p pVar = f530490e;
        if (pVar != null) {
            pVar.mo149xb9724478(type, java.lang.Integer.valueOf(i17));
        }
    }
}
