package m93;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static int f406574a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f406575b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f406576c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f406577d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static int f406578e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f406579f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static int f406580g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f406581h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static int f406582i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.HashMap f406583j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public static int f406584k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.HashMap f406585l = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static int f406586m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.HashMap f406587n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public static int f406588o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.HashMap f406589p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public static int f406590q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.HashMap f406591r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public static int f406592s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.HashMap f406593t = new java.util.HashMap();

    /* renamed from: u, reason: collision with root package name */
    public static int f406594u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.HashMap f406595v = new java.util.HashMap();

    /* renamed from: w, reason: collision with root package name */
    public static int f406596w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.HashMap f406597x = new java.util.HashMap();

    /* renamed from: y, reason: collision with root package name */
    public static int f406598y = 0;

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.HashMap f406599z = new java.util.HashMap();
    public static int A = 0;
    public static final java.util.HashMap B = new java.util.HashMap();
    public static int C = 0;
    public static final java.util.HashMap D = new java.util.HashMap();
    public static int E = 0;
    public static final java.util.HashMap F = new java.util.HashMap();
    public static int G = 0;
    public static final java.util.HashMap H = new java.util.HashMap();
    public static int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public static final java.util.HashMap f406573J = new java.util.HashMap();
    public static int K = 0;
    public static final java.util.HashMap L = new java.util.HashMap();
    public static int M = 0;
    public static final java.util.HashMap N = new java.util.HashMap();
    public static int O = 0;
    public static final java.util.HashMap P = new java.util.HashMap();
    public static int Q = 0;
    public static final java.util.HashMap R = new java.util.HashMap();

    public static int a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p pVar) {
        int i17 = f406574a + 1;
        f406574a = i17;
        f406575b.put(java.lang.Integer.valueOf(i17), pVar);
        return f406574a;
    }

    public static void b(int i17, boolean z17) {
        java.util.HashMap hashMap = f406583j;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p) hashMap.get(java.lang.Integer.valueOf(i17));
        if (pVar == null) {
            return;
        }
        pVar.r(z17);
        hashMap.remove(java.lang.Integer.valueOf(i17));
    }

    public static void c(int i17, boolean z17) {
        java.util.HashMap hashMap = f406585l;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p) hashMap.get(java.lang.Integer.valueOf(i17));
        if (pVar == null) {
            return;
        }
        pVar.s(z17);
        hashMap.remove(java.lang.Integer.valueOf(i17));
    }

    public static void d(int i17, int i18, int i19, android.content.Intent intent) {
        java.util.HashMap hashMap = f406575b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p) hashMap.get(java.lang.Integer.valueOf(i17));
        if (pVar == null) {
            return;
        }
        if (i19 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                ((dk5.s5) tg3.t1.a()).Ui(stringExtra2, stringExtra);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).Ai().g(stringExtra);
        }
        pVar.x(i18, i19, intent);
        hashMap.remove(java.lang.Integer.valueOf(i17));
    }

    public static void e(int i17, int i18, int i19, android.content.Intent intent) {
        java.util.HashMap hashMap = F;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p) hashMap.get(java.lang.Integer.valueOf(i17));
        if (pVar == null) {
            return;
        }
        pVar.y(i18, i19, intent);
        hashMap.remove(java.lang.Integer.valueOf(i17));
    }
}
