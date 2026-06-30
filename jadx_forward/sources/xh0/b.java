package xh0;

/* loaded from: classes11.dex */
public class b extends l75.n0 {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f536004p = {l75.n0.m145250x3fdc6f77(dm.w1.M, "ChatBotConfig")};

    /* renamed from: q, reason: collision with root package name */
    public static volatile xh0.b f536005q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.Map f536006r = new java.util.HashMap(32);

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f536007d;

    /* renamed from: e, reason: collision with root package name */
    public final xh0.d f536008e;

    /* renamed from: f, reason: collision with root package name */
    public final xh0.d f536009f;

    /* renamed from: g, reason: collision with root package name */
    public final xh0.d f536010g;

    /* renamed from: h, reason: collision with root package name */
    public final xh0.d f536011h;

    /* renamed from: i, reason: collision with root package name */
    public final xh0.d f536012i;

    /* renamed from: m, reason: collision with root package name */
    public final xh0.d f536013m;

    /* renamed from: n, reason: collision with root package name */
    public final xh0.d f536014n;

    /* renamed from: o, reason: collision with root package name */
    public final xh0.d f536015o;

    public b(l75.k0 k0Var) {
        super(k0Var, dm.w1.M, "ChatBotConfig", f536004p);
        this.f536008e = new xh0.d(this, dm.w1.f322253s, null);
        this.f536009f = new xh0.d(this, dm.w1.f322254t, null);
        this.f536010g = new xh0.d(this, dm.w1.f322255u, null);
        this.f536011h = new xh0.d(this, dm.w1.f322256v, null);
        this.f536012i = new xh0.d(this, dm.w1.f322257w, null);
        this.f536013m = new xh0.d(this, dm.w1.f322258x, null);
        this.f536014n = new xh0.d(this, dm.w1.f322259y, null);
        this.f536015o = new xh0.d(this, dm.w1.f322260z, null);
        this.f536007d = k0Var;
    }

    public static xh0.b J0() {
        if (f536005q == null) {
            synchronized (xh0.b.class) {
                if (f536005q == null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(1570978641, new xh0.C30731x2d183f());
                    gm0.b0 u17 = gm0.j1.u();
                    u17.b(u17.f354686f, hashMap, false);
                    f536005q = new xh0.b(u17.f354686f);
                }
            }
        }
        return f536005q;
    }

    public java.util.Set D0() {
        java.util.List list;
        java.util.HashSet hashSet = new java.util.HashSet();
        try {
            list = dm.w1.f322251q.h(dm.w1.f322252r).a().k(this.f536007d, dm.w1.class);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatBotConfigStorage", th6, "getAllChatbots maybe timeout", new java.lang.Object[0]);
            list = null;
        }
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatBotConfigStorage", "[-] fail to getAllChatbots from db.");
            hashSet.add("wxid_wi_1d142z0zdj03");
            return hashSet;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) ((dm.w1) it.next()).t0().get(dm.w1.f322252r.f434158a);
            if (!android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotConfigStorage", "[+] get getAllChatbots from db, value: %s", str);
                hashSet.add(str);
            }
        }
        hashSet.add("wxid_wi_1d142z0zdj03");
        return hashSet;
    }
}
