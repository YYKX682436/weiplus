package mc;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public jc.a f407030a;

    /* renamed from: b, reason: collision with root package name */
    public jc.b f407031b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f407032c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f407033d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f407034e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f407035f;

    /* renamed from: g, reason: collision with root package name */
    public mc.r f407036g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.SparseArray f407037h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.HashMap f407038i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0 f407039j;

    /* renamed from: k, reason: collision with root package name */
    public int f407040k;

    /* renamed from: l, reason: collision with root package name */
    public int f407041l;

    /* renamed from: m, reason: collision with root package name */
    public int f407042m;

    /* renamed from: n, reason: collision with root package name */
    public int f407043n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508 f407044o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f407045p;

    public c() {
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9 enumC2922xcddc5fa9 = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9.PREPARE;
        this.f407032c = false;
        this.f407044o = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2924x2fe19508.NONE;
        this.f407045p = false;
        this.f407033d = new int[]{com.p314xaae8f345.mm.R.C30867xcad56011.f81490xec737fa2, com.p314xaae8f345.mm.R.C30867xcad56011.f81488x2368725, com.p314xaae8f345.mm.R.C30867xcad56011.f81499x6786c610, com.p314xaae8f345.mm.R.C30867xcad56011.f81492x862a3570, com.p314xaae8f345.mm.R.C30867xcad56011.f81496x5a72a025, com.p314xaae8f345.mm.R.C30867xcad56011.f81489xec723d8f, com.p314xaae8f345.mm.R.C30867xcad56011.f81493xa265bc22, com.p314xaae8f345.mm.R.C30867xcad56011.f81494xec775918, com.p314xaae8f345.mm.R.C30867xcad56011.f81491xca857cbe, com.p314xaae8f345.mm.R.C30867xcad56011.f81495xc0da6769, com.p314xaae8f345.mm.R.C30867xcad56011.f81497x6f9222ef, com.p314xaae8f345.mm.R.C30867xcad56011.f81498xe2b669ef, com.p314xaae8f345.mm.R.C30867xcad56011.f81503x7c86903a, com.p314xaae8f345.mm.R.C30867xcad56011.f81502x746262f1, com.p314xaae8f345.mm.R.C30867xcad56011.f81529x96f795c7, com.p314xaae8f345.mm.R.C30867xcad56011.f81502x746262f1, com.p314xaae8f345.mm.R.C30867xcad56011.f575377pb4, com.p314xaae8f345.mm.R.C30867xcad56011.f81485x46f104d6};
        this.f407034e = new int[]{com.p314xaae8f345.mm.R.C30867xcad56011.f81480x828d9d36, com.p314xaae8f345.mm.R.C30867xcad56011.f81484x5d9410f8, com.p314xaae8f345.mm.R.C30867xcad56011.f81486x57d355df, com.p314xaae8f345.mm.R.C30867xcad56011.f81483x11af29c2, com.p314xaae8f345.mm.R.C30867xcad56011.f81500xe64a463a};
        this.f407035f = new int[]{com.p314xaae8f345.mm.R.C30867xcad56011.f81521x571c9c56, com.p314xaae8f345.mm.R.C30867xcad56011.f81520xca8123a9, com.p314xaae8f345.mm.R.C30867xcad56011.f81531xf6913df1, com.p314xaae8f345.mm.R.C30867xcad56011.f81517x9a9e6cc4, com.p314xaae8f345.mm.R.C30867xcad56011.f81514xe34e69a8, com.p314xaae8f345.mm.R.C30867xcad56011.f81515xcf47bc18, com.p314xaae8f345.mm.R.C30867xcad56011.f81510x7bb3b721, com.p314xaae8f345.mm.R.C30867xcad56011.f81516x656541b0, com.p314xaae8f345.mm.R.C30867xcad56011.f81509x728d525a, com.p314xaae8f345.mm.R.C30867xcad56011.f81512x9d2cd47d, com.p314xaae8f345.mm.R.C30867xcad56011.f81513x9d3194c3, com.p314xaae8f345.mm.R.C30867xcad56011.f81511x2cb6e41};
        android.util.SparseArray sparseArray = this.f407037h;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81500xe64a463a);
        if (sparseArray == null) {
            android.util.SparseArray sparseArray2 = new android.util.SparseArray(20);
            this.f407037h = sparseArray2;
            sparseArray2.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81484x5d9410f8, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.ACT_OPEN_MOUTH);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81480x828d9d36, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.ACT_BLINK);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81483x11af29c2, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.ACT_NOD_HEAD);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81486x57d355df, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.ACT_SHAKE_HEAD);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81485x46f104d6, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.ACT_SCREEN_SHAKING);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81490xec737fa2, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_FACE);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81492x862a3570, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_LEFT_FACE);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81496x5a72a025, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_RIGHT_FACE);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81489xec723d8f, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_CHIN);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81493xa265bc22, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_MOUTH);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81494xec775918, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_NOSE);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81491xca857cbe, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_LEFT_EYE);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81495xc0da6769, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NO_RIGHT_EYE);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81500xe64a463a, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.POSE_KEEP);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81488x2368725, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.INCOMPLETE_FACE);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81497x6f9222ef, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.POSE_CLOSER);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81498xe2b669ef, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.POSE_FARTHER);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81499x6786c610, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.POSE_INCORRECT);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81503x7c86903a, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.TOO_MANY_FACE);
            this.f407037h.put(com.p314xaae8f345.mm.R.C30867xcad56011.f81502x746262f1, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.POSE_OPEN_EYE);
        }
        if (this.f407038i == null) {
            java.util.HashMap hashMap = new java.util.HashMap(30);
            this.f407038i = hashMap;
            hashMap.put("0", valueOf);
            this.f407038i.put("1", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81530x559a8e3d));
            this.f407038i.put("10000", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81490xec737fa2));
            this.f407038i.put("10001", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81503x7c86903a));
            this.f407038i.put("10002", valueOf);
            this.f407038i.put("10005", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81499x6786c610));
            this.f407038i.put("10006", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81502x746262f1));
            this.f407038i.put("10007", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81529x96f795c7));
            this.f407038i.put("10010", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81488x2368725));
            this.f407038i.put("10012", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81498xe2b669ef));
            this.f407038i.put("10013", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81497x6f9222ef));
            this.f407038i.put("10014", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81493xa265bc22));
            this.f407038i.put("10015", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81495xc0da6769));
            this.f407038i.put("10016", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81491xca857cbe));
            this.f407038i.put("10017", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81496x5a72a025));
            this.f407038i.put("10018", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81492x862a3570));
            this.f407038i.put("10019", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81489xec723d8f));
            this.f407038i.put("10020", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81494xec775918));
            this.f407038i.put("20006", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81485x46f104d6));
            this.f407038i.put("20001", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81480x828d9d36));
            this.f407038i.put("20002", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81484x5d9410f8));
            this.f407038i.put("20003", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81486x57d355df));
            this.f407038i.put("20004", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f81483x11af29c2));
            this.f407038i.put("20005", valueOf);
        }
        this.f407039j = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NONE;
    }

    public static boolean b(int i17, int[] iArr) {
        for (int i18 : iArr) {
            if (i17 == i18) {
                return true;
            }
        }
        return false;
    }

    public final void a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2922xcddc5fa9 enumC2922xcddc5fa9, java.lang.Object obj) {
        jc.a aVar = this.f407030a;
        if (aVar != null) {
            ((lc.f) aVar).a(enumC2922xcddc5fa9, obj);
        }
    }
}
