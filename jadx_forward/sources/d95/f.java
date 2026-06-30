package d95;

/* loaded from: classes12.dex */
public class f implements com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79, com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d {

    /* renamed from: j, reason: collision with root package name */
    public static final android.content.SharedPreferences f309197j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f309198k;

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26939xfb49cfa8 f309200m;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f309202o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f309203p;

    /* renamed from: q, reason: collision with root package name */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79 f309204q;

    /* renamed from: r, reason: collision with root package name */
    public static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79 f309205r;

    /* renamed from: s, reason: collision with root package name */
    public static final jx3.b f309206s;

    /* renamed from: t, reason: collision with root package name */
    public static f95.e f309207t;

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f309208u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.regex.Pattern f309209v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f309210w;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 f309211a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 f309212b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f309213c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.String f309214d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f309215e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f309193f = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.ThreadLocal f309194g = new java.lang.ThreadLocal();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f309195h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f309196i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: l, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 f309199l = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2().m107400xa9cc75b2(1024).m107401x4c1f4da1(1);

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e1 f309201n = new l75.e1();

    static {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26961x60ffeeef.m107775x141073bf();
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.m107753x61ff776a(0);
        com.p314xaae8f345.p3121x37984a.C26876xa70fd706.m106191x6f03b811(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61514x5b76a9cd);
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("db_config", 0);
        f309197j = sharedPreferences;
        f309198k = sharedPreferences.getInt("flags", 0);
        sharedPreferences.getInt("acp", 100);
        f309200m = new d95.g(null, 1, Integer.MAX_VALUE, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).getClass();
        mm.d0.f410008a.b(new d95.h());
        f309206s = new jx3.b(463);
        f309208u = new int[]{27, 39, 24, 36, 27, 39, 48, 54, 33, 45, 30, 42, 33, 45, 51, 57};
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        f309209v = z65.c.a() ? java.util.regex.Pattern.compile("^\\s*create\\s+(?:unique\\s+)?index\\s+(?:if\\s+not\\s+exists\\s+)?(\\S+)\\s+on\\s+(\\S+)\\s*\\(", 66) : null;
        f309210w = new java.lang.String[]{"messagecreatetaklertimeindex", "messagecreatetaklertypetimeindex", "messagecreatetimeindex", "messageidindex", "messagemessagetalkerflagmsgseqindex", "messagemessagetalkermsgseqindex", "messagesendcreatetimeindex", "messagesvridindex", "messagetalkercreatetimeissendindex", "messagetalkeridtypeindex", "messagetalkerstatusindex", "messagetalkersvridindex", "messagetalkertypeindex"};
    }

    public f() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        this.f309215e = z65.c.a() ? new java.util.HashMap() : null;
    }

    public static void a() {
        final java.lang.Throwable m107746x951c1508 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.m107746x951c1508();
        if (m107746x951c1508 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMDataBase", m107746x951c1508, "Database corrupted, force crash.", new java.lang.Object[0]);
        try {
            ((ku5.t0) ku5.t0.f394148d).m(new java.util.concurrent.Callable() { // from class: d95.f$$a
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    java.lang.Throwable th6 = m107746x951c1508;
                    if (th6 instanceof java.lang.RuntimeException) {
                        throw ((java.lang.RuntimeException) th6);
                    }
                    throw new java.lang.RuntimeException(th6);
                }
            }, 1500L).get();
        } catch (java.lang.Exception unused) {
        }
    }

    public static void d(d95.f fVar) {
        d95.l lVar = new d95.l(fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "vacuumedSet = " + f309193f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "db.getPath() = " + fVar.k());
        ((ku5.t0) ku5.t0.f394148d).l(new d95.m(fVar, lVar), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, "vacuum-task");
    }

    public static boolean m(java.lang.String str) {
        boolean z17 = false;
        if (!str.endsWith("EnMicroMsg.db")) {
            return false;
        }
        boolean z18 = true;
        if (!com.p314xaae8f345.mm.vfs.w6.j(lp0.b.e0() + "/AsyncCP.flag")) {
            int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getInt("clicfg_wcdb_async_checkpoint", 0);
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(str.concat("-wal"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "Async value: %d, WAL size: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(k17));
            if (k17 > 33554432) {
                com.p314xaae8f345.mm.app.p5.b(21019, 0, java.lang.Long.valueOf(k17), 66001);
            }
            if (i17 == 1 || (i17 == 2 && k17 > 33554432)) {
                z17 = true;
            }
            z18 = z17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "Async checkpoint enabled: " + z18);
        return z18;
    }

    public static boolean n() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static void q() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "markCorruptIgnore, thread: " + java.lang.Thread.currentThread());
        f309194g.set(java.lang.Boolean.TRUE);
    }

    public static void r(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.z7 z7Var;
        com.p314xaae8f345.mm.vfs.z7 z7Var2;
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        com.p314xaae8f345.mm.vfs.r6 s17 = r6Var.s();
        java.lang.String m82467xfb82e301 = r6Var.m82467xfb82e301();
        com.p314xaae8f345.mm.vfs.r6 s18 = r6Var.s();
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l("corrupted", false, true);
        com.p314xaae8f345.mm.vfs.z7 z7Var3 = s18 == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : s18.f294699d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str2 = z7Var3.f294812f;
            z7Var3 = new com.p314xaae8f345.mm.vfs.z7(z7Var3.f294810d, z7Var3.f294811e, str2 + '/' + l17, z7Var3.f294813g, z7Var3.f294814h);
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var3, null);
        if (m18.a()) {
            m18.f294799a.r(m18.f294800b);
        }
        java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(m82467xfb82e301, false, true);
        if (l18 == null || l18.isEmpty()) {
            z7Var = z7Var3;
        } else {
            java.lang.String str3 = z7Var3.f294812f;
            z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var3.f294810d, z7Var3.f294811e, str3 + '/' + l18, z7Var3.f294813g, z7Var3.f294814h);
        }
        long C = r6Var.C();
        com.p314xaae8f345.mm.vfs.z2 m19 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
        long j17 = 0;
        if (m19.a() && (m17 = m19.f294799a.m(m19.f294800b)) != null) {
            j17 = m17.f294766c;
        }
        long B = r6Var.B();
        try {
            B = java.lang.Math.min(android.system.Os.stat(str).st_atime * 1000, B);
        } catch (android.system.ErrnoException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDataBase", "Cannot get access time: %s", e17);
        }
        java.lang.String[] strArr = {"", "-journal", "-wal", ".ini", ".sm", ".li"};
        if (C < j17 && C < 8388608 && java.lang.System.currentTimeMillis() - B < 259200000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDataBase", "Repeated corruption detected, delete corrupted. baseSize: %d, targetSize: %d, createTime: %d", java.lang.Long.valueOf(C), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(B));
            for (int i17 = 0; i17 < 6; i17++) {
                java.lang.String l19 = com.p314xaae8f345.mm.vfs.e8.l(m82467xfb82e301 + strArr[i17], false, true);
                com.p314xaae8f345.mm.vfs.z7 z7Var4 = s17 == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : s17.f294699d;
                if (l19 != null && !l19.isEmpty()) {
                    java.lang.String str4 = z7Var4.f294812f;
                    z7Var4 = new com.p314xaae8f345.mm.vfs.z7(z7Var4.f294810d, z7Var4.f294811e, str4 + '/' + l19, z7Var4.f294813g, z7Var4.f294814h);
                }
                com.p314xaae8f345.mm.vfs.C22735xee348ee4.c(3, z7Var4);
                com.p314xaae8f345.mm.vfs.z2 m27 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var4, null);
                if (m27.a()) {
                    m27.f294799a.d(m27.f294800b);
                }
                com.p314xaae8f345.mm.vfs.C22735xee348ee4.e(3);
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "Not repeated corruption, move and backup. baseSize: %d, targetSize: %d", java.lang.Long.valueOf(C), java.lang.Long.valueOf(j17));
        int i18 = 0;
        for (int i19 = 6; i18 < i19; i19 = 6) {
            java.lang.String str5 = strArr[i18];
            java.lang.String l27 = com.p314xaae8f345.mm.vfs.e8.l(m82467xfb82e301 + str5, false, true);
            com.p314xaae8f345.mm.vfs.z7 z7Var5 = s17 == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : s17.f294699d;
            if (l27 != null && !l27.isEmpty()) {
                java.lang.String str6 = z7Var5.f294812f;
                z7Var5 = new com.p314xaae8f345.mm.vfs.z7(z7Var5.f294810d, z7Var5.f294811e, str6 + '/' + l27, z7Var5.f294813g, z7Var5.f294814h);
            }
            com.p314xaae8f345.mm.vfs.C22735xee348ee4.c(9, z7Var5);
            java.lang.String l28 = com.p314xaae8f345.mm.vfs.e8.l(m82467xfb82e301 + str5, false, true);
            if (l28 == null || l28.isEmpty()) {
                z7Var2 = z7Var3;
            } else {
                java.lang.String str7 = z7Var3.f294812f;
                z7Var2 = new com.p314xaae8f345.mm.vfs.z7(z7Var3.f294810d, z7Var3.f294811e, str7 + '/' + l28, z7Var3.f294813g, z7Var3.f294814h);
            }
            com.p314xaae8f345.mm.vfs.z2 m28 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var5, null);
            com.p314xaae8f345.mm.vfs.z2 m29 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var2, null);
            if (m28.a() && m29.a()) {
                try {
                    m29.f294799a.t(m29.f294800b, m28.f294799a, m28.f294800b);
                } catch (java.io.IOException unused) {
                }
            }
            com.p314xaae8f345.mm.vfs.C22735xee348ee4.e(9);
            i18++;
        }
    }

    public static d95.f s(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        byte[] bytes;
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26940xf23b9b2 c26940xf23b9b2;
        int i18;
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str + "-vfslog");
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(str + "-vfslo1");
            if (r6Var.m() && r6Var.C() > 256) {
                r6Var.l();
            }
            if (r6Var2.m() && r6Var2.C() > 256) {
                r6Var2.l();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMDataBase", th6, "", new java.lang.Object[0]);
        }
        d95.f fVar = new d95.f();
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f.f58244x57107208 : str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            bytes = null;
            c26940xf23b9b2 = null;
        } else {
            bytes = str2.getBytes();
            c26940xf23b9b2 = f309199l;
        }
        if (z17 && d95.b.f309133a) {
            i18 = 805306368;
        } else {
            if (!d95.b.f309133a) {
                com.p314xaae8f345.mm.vfs.w6.h(str + "-shm");
            }
            i18 = 268435456;
        }
        int i19 = i18;
        try {
            if (str3.endsWith("EnMicroMsg.db")) {
                fVar.f309211a = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.m107635xfef9b1e5(str3, bytes, c26940xf23b9b2, null, i19, fVar, 32);
            } else {
                fVar.f309211a = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.m107634xfef9b1e5(str3, bytes, c26940xf23b9b2, null, i19, fVar);
            }
            fVar.f309211a.m107728x2c558368(fVar);
            if (m(str)) {
                fVar.f309211a.m107720x7b5cb5ef(f309200m);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "Enable async checkpointer for DB: " + fVar.k());
            }
            ((java.util.concurrent.ConcurrentHashMap) f309195h).put(fVar.k(), fVar);
            d(fVar);
            if (fVar.f309211a == null) {
                return null;
            }
            return fVar;
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
            jx3.f fVar2 = jx3.f.INSTANCE;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DB (");
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str3);
            java.lang.String str4 = a17.f294812f;
            if (str4 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            java.lang.String str5 = a17.f294812f;
            int lastIndexOf = str5.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str5 = str5.substring(lastIndexOf + 1);
            }
            sb6.append(str5);
            sb6.append(") can't open: ");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            fVar2.i("DBCantOpen", sb6.toString(), null);
            throw e17;
        }
    }

    public static d95.f t(java.lang.String str, boolean z17) {
        int i17;
        d95.f fVar = new d95.f();
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107618xaf65a0fc = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.m107618xaf65a0fc(null);
            fVar.f309212b = m107618xaf65a0fc;
            if (m107618xaf65a0fc == null) {
                return null;
            }
            return fVar;
        }
        if (z17 && d95.b.f309133a) {
            i17 = 805306368;
        } else {
            if (!d95.b.f309133a) {
                com.p314xaae8f345.mm.vfs.w6.h(str.concat("-shm"));
            }
            i17 = 268435456;
        }
        try {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107632xfef9b1e5 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.m107632xfef9b1e5(str, null, i17, fVar);
            fVar.f309212b = m107632xfef9b1e5;
            m107632xfef9b1e5.m107728x2c558368(fVar);
            if (m(str)) {
                fVar.f309212b.m107720x7b5cb5ef(f309200m);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "Enable async checkpointer for DB: " + fVar.k());
            }
            ((java.util.concurrent.ConcurrentHashMap) f309196i).put(fVar.k(), fVar);
            d(fVar);
            if (fVar.f309212b == null) {
                return null;
            }
            return fVar;
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
            jx3.f fVar2 = jx3.f.INSTANCE;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DB (");
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            java.lang.String str3 = a17.f294812f;
            int lastIndexOf = str3.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str3 = str3.substring(lastIndexOf + 1);
            }
            sb6.append(str3);
            sb6.append(") can't open: ");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            fVar2.i("DBCantOpen", sb6.toString(), null);
            throw e17;
        }
    }

    public static void w() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "removeCorruptIgnore, thread: " + java.lang.Thread.currentThread());
        f309194g.remove();
    }

    public void b() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f309211a;
        if (c26948xabb259c7 == null) {
            c26948xabb259c7 = this.f309212b;
        }
        if (n()) {
            f309201n.c(c26948xabb259c7, 32769, "BEGIN TRANSACTION;");
        }
        try {
            c26948xabb259c7.m107659xb2c12e75();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
        }
    }

    public void c() {
        try {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f309211a;
            if (c26948xabb259c7 != null && c26948xabb259c7.m107697xb9a70294()) {
                this.f309211a.close();
                this.f309211a = null;
            }
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c72 = this.f309212b;
            if (c26948xabb259c72 != null && c26948xabb259c72.m107697xb9a70294()) {
                this.f309212b.close();
                this.f309212b = null;
            }
            ((java.util.concurrent.ConcurrentHashMap) f309195h).remove(k());
            ((java.util.concurrent.ConcurrentHashMap) f309196i).remove(k());
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDataBase", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    public void e() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f309211a;
        if (c26948xabb259c7 == null) {
            c26948xabb259c7 = this.f309212b;
        }
        if (n()) {
            f309201n.c(c26948xabb259c7, 32769, "COMMIT;");
        }
        try {
            c26948xabb259c7.m107729x576b60d6();
            c26948xabb259c7.m107670x7d3c6b03();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
        }
    }

    public void f(java.lang.String str) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f309211a;
        if (c26948xabb259c7 == null) {
            c26948xabb259c7 = this.f309212b;
        }
        if (n()) {
            f309201n.c(c26948xabb259c7, 32769, str);
        }
        c26948xabb259c7.m107671xb158737d(str);
    }

    public long g() {
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(k());
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) {
            return m17.f294766c;
        }
        return 0L;
    }

    public long h() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f309211a;
        if (c26948xabb259c7 == null) {
            c26948xabb259c7 = this.f309212b;
        }
        long j17 = -1;
        if (c26948xabb259c7 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDataBase", "getFreeListSize db is null");
            return -1L;
        }
        try {
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107710x1d3f4980 = c26948xabb259c7.m107710x1d3f4980("PRAGMA freelist_count", null);
            while (m107710x1d3f4980.moveToNext()) {
                j17 = m107710x1d3f4980.getLong(0);
            }
            m107710x1d3f4980.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "getFreeListCount, count = " + j17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDataBase", "getFreeListSize error, t = " + th6.getMessage());
        }
        return j17 * j();
    }

    public final java.lang.String i(java.lang.String str, java.lang.String str2) {
        boolean z17 = false;
        for (java.lang.String str3 : str.split(" ")) {
            java.lang.String trim = str3.trim();
            if (z17 && !trim.isEmpty()) {
                return str3;
            }
            if (trim.equalsIgnoreCase(str2)) {
                z17 = true;
            }
        }
        return "";
    }

    public long j() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f309211a;
        if (c26948xabb259c7 == null) {
            c26948xabb259c7 = this.f309212b;
        }
        if (c26948xabb259c7 == null) {
            return -1L;
        }
        try {
            return c26948xabb259c7.m107681xaf1414a6();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDataBase", "getPageSize error : " + th6.getMessage());
            return -1L;
        }
    }

    public java.lang.String k() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f309211a;
        if (c26948xabb259c7 != null) {
            return c26948xabb259c7.m107682xfb83cc9b();
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c72 = this.f309212b;
        return c26948xabb259c72 != null ? c26948xabb259c72.m107682xfb83cc9b() : "";
    }

    public final java.lang.String l() {
        android.content.SharedPreferences sharedPreferences = f309197j;
        int i17 = sharedPreferences.getInt("acp", 100);
        return java.lang.String.format("flags: 0x%04x\nacp: %d / %d", java.lang.Integer.valueOf(sharedPreferences.getInt("flags", 0)), java.lang.Integer.valueOf(i17 >>> 16), java.lang.Integer.valueOf(i17 & 65535));
    }

    public boolean o() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f309211a;
        if (c26948xabb259c7 != null) {
            return c26948xabb259c7.m107697xb9a70294();
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c72 = this.f309212b;
        if (c26948xabb259c72 != null) {
            return c26948xabb259c72.m107697xb9a70294();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79
    /* renamed from: onConnectionObtained */
    public void mo8835x65fe6d41(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, long j17, boolean z17) {
        if (c26948xabb259c7.m107682xfb83cc9b().endsWith("EnMicroMsg.db")) {
            int i17 = f309208u[(c26948xabb259c7.m107699xbf891bee() ? 2 : 0) + (c26948xabb259c7.m107675x10d98073() ? 4 : 0) + (z17 ? 8 : 0) + 1];
            f309206s.b(i17 + 1, i17 + 2, (int) j17);
        }
        if (n()) {
            f309201n.c(c26948xabb259c7, (z17 ? 32768 : 0) | 3, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79
    /* renamed from: onConnectionPoolBusy */
    public void mo8836x7591c572(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, long j17, boolean z17, java.util.List list, java.util.List list2) {
        java.lang.String str2;
        if (z65.c.f551991d) {
            return;
        }
        int i17 = 0;
        if (n()) {
            f309201n.c(c26948xabb259c7, (z17 ? 32768 : 0) | 2, str);
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c26948xabb259c7.m107682xfb83cc9b());
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!a17.f294812f.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str4 = a17.f294812f;
        int lastIndexOf = str4.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str4 = str4.substring(lastIndexOf + 1);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(2048);
        sb6.append(str4);
        sb6.append("\n");
        char c17 = '\n';
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo traceInfo = (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo) it.next();
                sb6.append("[RUNNING] ");
                sb6.append((java.lang.String) traceInfo.f58353x3164ae);
                sb6.append('\n');
            }
            sb6.append('\n');
        }
        java.lang.String str5 = "  at ";
        if (list2 != null && !list2.isEmpty()) {
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo traceInfo2 = (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo) it6.next();
                sb6.append("[TRANSACTION]\n");
                java.lang.StackTraceElement[] stackTraceElementArr = (java.lang.StackTraceElement[]) traceInfo2.f58353x3164ae;
                int length = stackTraceElementArr.length;
                for (int i18 = i17; i18 < length; i18++) {
                    java.lang.StackTraceElement stackTraceElement = stackTraceElementArr[i18];
                    sb6.append("  at ");
                    sb6.append(stackTraceElement.toString());
                    sb6.append('\n');
                }
                sb6.append('\n');
                i17 = 0;
            }
        }
        java.lang.String sb7 = sb6.toString();
        if (this.f309214d.equals(sb7)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMDataBase", "Database connection pool busy: " + str4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMDataBase", "[REQUEST primary: " + z17 + "] " + str);
        if (list == null || list.isEmpty()) {
            str2 = "  at ";
        } else {
            java.util.Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo traceInfo3 = (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo) it7.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMDataBase", "[RUNNING tid: %d (%d ms)] %s", java.lang.Integer.valueOf(traceInfo3.tid), java.lang.Long.valueOf(currentTimeMillis - traceInfo3.f58354x3652cd), traceInfo3.f58353x3164ae);
                str5 = str5;
                c17 = '\n';
            }
            str2 = str5;
            sb6.append(c17);
        }
        if (list2 != null && !list2.isEmpty()) {
            java.util.Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo traceInfo4 = (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo) it8.next();
                sb6.setLength(0);
                sb6.append(java.lang.String.format("[TRANSACTION tid: %d (%d ms)]\n", java.lang.Integer.valueOf(traceInfo4.tid), java.lang.Long.valueOf(currentTimeMillis - traceInfo4.f58354x3652cd)));
                java.lang.StackTraceElement[] stackTraceElementArr2 = (java.lang.StackTraceElement[]) traceInfo4.f58353x3164ae;
                int length2 = stackTraceElementArr2.length;
                int i19 = 0;
                while (i19 < length2) {
                    java.lang.StackTraceElement stackTraceElement2 = stackTraceElementArr2[i19];
                    sb6.append(str2);
                    sb6.append(stackTraceElement2.toString());
                    sb6.append('\n');
                    i19++;
                    it8 = it8;
                }
                sb6.append('\n');
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMDataBase", sb6.toString());
                it8 = it8;
            }
        }
        sb6.setLength(0);
        c26948xabb259c7.m107667x2f39f4(new d95.i(this, sb6), false);
        java.lang.String sb8 = sb6.toString();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("SQL", str);
        linkedHashMap.put("dump", sb8);
        linkedHashMap.put("settings", l());
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.i("DBPoolBusy", sb7, linkedHashMap);
        this.f309214d = sb7;
        fVar.mo68477x336bdfd8(463L, 6L, 1L, false);
        try {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            if (list == null) {
                return;
            }
            java.util.Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                sb9.append(((java.lang.String) ((com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79.TraceInfo) it9.next()).f58353x3164ae) + "\n");
            }
            z65.c.f551994g = sb9.toString();
            boolean z18 = com.p314xaae8f345.mm.app.w.INSTANCE.f135422n;
            boolean n17 = n();
            jx3.f fVar2 = jx3.f.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[7];
            objArr[0] = str;
            objArr[1] = java.lang.Long.valueOf(j17);
            objArr[2] = java.lang.Integer.valueOf(z17 ? 1 : 0);
            objArr[3] = sb9.toString();
            objArr[4] = java.lang.Integer.valueOf(z18 ? 1 : 0);
            objArr[5] = java.lang.Integer.valueOf(n17 ? 1 : 0);
            objArr[6] = str4;
            fVar2.d(20584, objArr);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDataBase", "report db busy failed = " + th6.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d
    /* renamed from: onCorruption */
    public void mo63526x28043a1a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7) {
        if (java.lang.Boolean.TRUE.equals(f309194g.get())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "needIgnoreCorrupt, thread: " + java.lang.Thread.currentThread());
            return;
        }
        boolean m107697xb9a70294 = c26948xabb259c7.m107697xb9a70294();
        java.lang.String m107682xfb83cc9b = c26948xabb259c7.m107682xfb83cc9b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDataBase", "Database corrupted, isOpen: %s, path: %s", java.lang.Boolean.toString(m107697xb9a70294), m107682xfb83cc9b);
        java.util.List<android.util.Pair<java.lang.String, java.lang.String>> m107676xad58423b = c26948xabb259c7.m107676xad58423b();
        if (m107697xb9a70294) {
            if (!this.f309213c) {
                this.f309213c = true;
            }
            try {
                jx3.f.INSTANCE.mo68477x336bdfd8(181L, !c26948xabb259c7.m107699xbf891bee() ? 42 : c26948xabb259c7.m107675x10d98073() ? 43 : 41, 1L, true);
                x(c26948xabb259c7);
                c26948xabb259c7.close();
                if (m107676xad58423b == null) {
                    r(m107682xfb83cc9b);
                } else {
                    java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> it = m107676xad58423b.iterator();
                    while (it.hasNext()) {
                        r((java.lang.String) it.next().second);
                    }
                }
                if (m107682xfb83cc9b.contains("EnMicroMsg.db")) {
                    a();
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79
    /* renamed from: onDatabaseCorrupted */
    public void mo8837x81d6f812(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79
    /* renamed from: onSQLExecuted */
    public void mo8838xcc78f01e(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, int i17, long j17) {
        java.lang.String str2;
        java.lang.String i18;
        if (str == null) {
            return;
        }
        if (c26948xabb259c7.m107682xfb83cc9b().endsWith("EnMicroMsg.db")) {
            int i19 = f309208u[(c26948xabb259c7.m107699xbf891bee() ? 2 : 0) + (c26948xabb259c7.m107675x10d98073() ? 4 : 0) + (i17 != 1 ? 8 : 0)];
            f309206s.b(i19 + 1, i19 + 2, (int) j17);
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper());
            if (f309207t == null) {
                synchronized (d95.f.class) {
                    if (f309207t == null) {
                        f309207t = new f95.e();
                    }
                }
            }
            f309207t.c(c26948xabb259c7.m107682xfb83cc9b(), str, i17, j17, b17);
            if (str.startsWith("select") || str.startsWith("SELECT") || str.startsWith("delete") || str.startsWith("DELETE")) {
                i18 = i(str, "from");
            } else if (str.startsWith("update") || str.startsWith("UPDATE")) {
                i18 = i(str, "update");
            } else if (str.startsWith("insert") || str.startsWith("INSERT")) {
                i18 = i(str, "into");
                if (i18.contains("(")) {
                    i18 = i18.substring(i18.indexOf("(") + 1);
                }
            } else {
                i18 = "";
            }
            if (i18.equalsIgnoreCase("rconversation") && str.toLowerCase().contains("delete from")) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                java.lang.Throwable th6 = new java.lang.Throwable();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "delete rconversation, type: %d, sql: %s, stack: %s", valueOf, str, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
            }
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26973xda906c79 interfaceC26973xda906c79 = f309204q;
        if (interfaceC26973xda906c79 != null) {
            interfaceC26973xda906c79.mo8838xcc78f01e(c26948xabb259c7, str, i17, j17);
        }
        if (n()) {
            l75.e1 e1Var = f309201n;
            synchronized (e1Var) {
                e1Var.f398491b = 0;
                e1Var.f398493d = 0L;
            }
        }
        if (this.f309215e != null && i17 == 8) {
            java.util.regex.Matcher matcher = f309209v.matcher(str);
            if (matcher.find()) {
                java.lang.String group = matcher.group(1);
                java.lang.String group2 = matcher.group(2);
                synchronized (this.f309215e) {
                    str2 = (java.lang.String) this.f309215e.put(group, str);
                    if (str2 == null || str2.equals(str)) {
                        str2 = null;
                    } else {
                        this.f309215e.put(group, str2);
                    }
                }
                if (str2 != null) {
                    throw new java.lang.AssertionError(java.lang.String.format("Duplicated index created: %s, SQL: %s, existing: %s", group, str, str2));
                }
                if (group2.equalsIgnoreCase(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7) && java.util.Arrays.binarySearch(f309210w, group.toLowerCase(java.util.Locale.ENGLISH)) < 0) {
                    throw new java.lang.AssertionError(java.lang.String.format("New index for message table found: %s, SQL: %s", group, str));
                }
            }
        }
        if (f309205r == null || !c26948xabb259c7.m107682xfb83cc9b().endsWith("SnsMicroMsg.db")) {
            return;
        }
        f309205r.mo8838xcc78f01e(c26948xabb259c7, str, i17, j17);
    }

    public boolean p() {
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            android.os.StatFs statFs2 = new android.os.StatFs(lp0.b.e0());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes();
            long g17 = g();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "dataFreeSpace = " + availableBytes + ", sdcardFreeSpace = " + availableBytes2 + ", dbFileSize = " + g17);
            long j17 = g17 * 2;
            return availableBytes > j17 && availableBytes2 > j17;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public android.database.Cursor u(java.lang.String str, java.lang.String[] strArr) {
        return v(str, strArr, 0, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.database.Cursor v(java.lang.String r9, java.lang.String[] r10, int r11, boolean r12, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab r13) {
        /*
            r8 = this;
            com.tencent.wcdb.database.SQLiteDatabase r0 = r8.f309211a
            if (r0 == 0) goto L5
            goto L7
        L5:
            com.tencent.wcdb.database.SQLiteDatabase r0 = r8.f309212b
        L7:
            r1 = r0
            int r0 = d95.f.f309198k
            r2 = 2
            r0 = r0 & r2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L12
            r0 = r4
            goto L13
        L12:
            r0 = r3
        L13:
            r7 = 4
            r5 = 0
            if (r11 != r7) goto L1b
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r0 = e95.m.f331958r
        L19:
            r2 = r0
            goto L3a
        L1b:
            r6 = 100
            if (r11 != r6) goto L22
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r0 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea
            goto L19
        L22:
            boolean r6 = z65.c.a()
            if (r6 != 0) goto L2d
            if (r0 == 0) goto L2b
            goto L2d
        L2b:
            r2 = r5
            goto L3a
        L2d:
            if (r11 == 0) goto L2b
            if (r11 == r4) goto L37
            if (r11 == r2) goto L34
            goto L2b
        L34:
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r0 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea
            goto L19
        L37:
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r0 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26945x5aacfea2.f58198xe9b6bcea
            goto L19
        L3a:
            boolean r0 = n()
            if (r0 == 0) goto L55
            int r0 = com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106264x37a81591(r9)
            if (r0 != r4) goto L48
            r0 = r4
            goto L49
        L48:
            r0 = r3
        L49:
            if (r0 == 0) goto L4e
            r3 = 32768(0x8000, float:4.5918E-41)
        L4e:
            r0 = r3 | 1
            l75.e1 r3 = d95.f.f309201n
            r3.c(r1, r0, r9)
        L55:
            if (r12 == 0) goto L77
            if (r13 == 0) goto L5a
            goto L5f
        L5a:
            com.tencent.wcdb.support.CancellationSignal r13 = new com.tencent.wcdb.support.CancellationSignal
            r13.<init>()
        L5f:
            r5 = 0
            r3 = r9
            r4 = r10
            r6 = r13
            com.tencent.wcdb.Cursor r10 = r1.m107713x46d43bc4(r2, r3, r4, r5, r6)
            if (r11 == 0) goto L71
            if (r11 == r7) goto L71
            d95.o r11 = new d95.o
            r11.<init>(r10, r9, r13)
            goto L76
        L71:
            d95.n r11 = new d95.n
            r11.<init>(r10, r13)
        L76:
            return r11
        L77:
            com.tencent.wcdb.Cursor r10 = r1.m107712x46d43bc4(r2, r9, r10, r5)
            if (r11 == 0) goto L85
            if (r11 == r7) goto L85
            d95.p r11 = new d95.p
            r11.<init>(r10, r9)
            r10 = r11
        L85:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d95.f.v(java.lang.String, java.lang.String[], int, boolean, com.tencent.wcdb.support.CancellationSignal):android.database.Cursor");
    }

    public final void x(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7) {
        int m107747x660c8470 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.m107747x660c8470();
        java.lang.String l17 = l();
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c26948xabb259c7.m107682xfb83cc9b());
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l18)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l18, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str2 = a17.f294812f;
        int lastIndexOf = str2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str2 = str2.substring(lastIndexOf + 1);
        }
        jx3.f.INSTANCE.d(22323, str2, java.lang.Integer.valueOf(f309197j.getInt("flags", 0)), l17, 0, java.lang.Integer.valueOf(m107747x660c8470), android.os.Build.FINGERPRINT);
    }

    public void y() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f309211a;
        if (c26948xabb259c7 == null) {
            c26948xabb259c7 = this.f309212b;
        }
        if (n()) {
            f309201n.c(c26948xabb259c7, 32769, "ROLLBACK;");
        }
        try {
            c26948xabb259c7.m107670x7d3c6b03();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
        }
    }

    public synchronized boolean z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "vacuum, dbPath = " + k());
        if (f309202o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "isVacuuming");
            return false;
        }
        if (!p()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDataBase", "isStorageAvailableSatisfyVacuum = false");
            return false;
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f309211a;
        if (c26948xabb259c7 == null) {
            c26948xabb259c7 = this.f309212b;
        }
        if (c26948xabb259c7 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDataBase", "getFreeListSize db is null");
            return false;
        }
        f309202o = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "Vacuum Start");
        try {
            c26948xabb259c7.m107671xb158737d("vacuum");
            f309202o = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "Vacuum Done");
            return true;
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDataBase", "vacuum error, t = " + th6.getMessage());
                return false;
            } finally {
                f309202o = false;
            }
        }
    }
}
