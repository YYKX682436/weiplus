package p05;

/* loaded from: classes14.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.q4 f432194a = new p05.q4();

    /* renamed from: b, reason: collision with root package name */
    public static int f432195b = 65;

    /* renamed from: c, reason: collision with root package name */
    public static int f432196c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f432197d = 60;

    /* renamed from: e, reason: collision with root package name */
    public static int f432198e = 100;

    /* renamed from: f, reason: collision with root package name */
    public static int f432199f = 30;

    /* renamed from: g, reason: collision with root package name */
    public static int f432200g;

    /* renamed from: h, reason: collision with root package name */
    public static int f432201h;

    /* renamed from: i, reason: collision with root package name */
    public static yz5.p f432202i;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("xlab_effect_config");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffectConfig", "config is : " + f432195b + ", " + f432196c + ", " + f432197d + ", " + f432198e + ", " + f432199f);
        f432200g = M.getInt("start_count", f432200g);
        f432201h = M.getInt("end_count", f432201h);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("count track is : ");
        sb6.append(f432200g);
        sb6.append(", ");
        sb6.append(f432201h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffectConfig", sb6.toString());
    }

    public final void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffectConfig", "setConfig: " + i17 + ", " + i18);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("xlab_effect_config");
        if (i17 == 0) {
            f432195b = i18;
            M.putInt("skin_smooth", i18);
        } else if (i17 == 1) {
            f432196c = i18;
            M.putInt("eye_morph", i18);
        } else if (i17 == 2) {
            f432197d = i18;
            M.putInt("face_morph", i18);
        } else if (i17 == 3) {
            f432198e = i18;
            M.putInt("skin_bright", i18);
        } else if (i17 == 4) {
            f432199f = i18;
            M.putInt("eye_bright", i18);
        }
        yz5.p pVar = f432202i;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }
}
