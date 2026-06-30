package h82;

/* loaded from: classes8.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public boolean f361074c;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.s0 f361076e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.concurrent.Future f361077f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f361078g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f361072a = new java.util.concurrent.ConcurrentLinkedDeque();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f361073b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f361075d = true;

    public i() {
        h82.f fVar = new h82.f(this);
        this.f361076e = fVar;
        this.f361078g = new h82.h(this);
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_fav_web_cache_open, 0) == 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.offline.FavOfflineService", "fav offline switch is close");
            return;
        }
        this.f361074c = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        gm0.j1.n().a(fVar);
        e();
    }

    public static java.lang.String a(java.lang.String str) {
        java.lang.String g17 = kk.k.g(str.getBytes());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wcf://favoffline");
        int length = g17.length();
        int i17 = 0;
        while (i17 < length) {
            sb6.append('/');
            int i18 = i17 + 20;
            if (i18 < length) {
                sb6.append(g17.substring(i17, i18));
                i17 = i18;
            } else {
                sb6.append(g17.substring(i17, length));
                i17 = length;
            }
        }
        sb6.append("/");
        if (g17.length() > 20) {
            sb6.append(g17.substring(0, 20));
        } else {
            sb6.append(g17);
        }
        return sb6.toString();
    }

    public static void b(h82.i iVar, java.lang.String str) {
        iVar.getClass();
        i82.a z07 = ((e82.e) i95.n0.c(e82.e.class)).Ai().z0(str);
        if (z07 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.offline.FavOfflineService", "addUnfinishedTask url:%s", str);
            iVar.f361072a.add(str);
            iVar.f361073b.put(str, z07);
            iVar.f();
        }
    }

    public static java.lang.String d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "null";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = str.length();
        int i17 = 0;
        while (i17 < length) {
            sb6.append("/");
            int i18 = i17 + 20;
            if (i18 < length) {
                sb6.append(str.substring(i17, i18));
                i17 = i18;
            } else {
                sb6.append(str.substring(i17, length));
                i17 = length;
            }
        }
        return sb6.length() > 1 ? sb6.substring(1) : "null";
    }

    public void c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_fav_web_cache_open, 0) == 1;
        boolean p17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(str);
        boolean z18 = ((e82.e) i95.n0.c(e82.e.class)).Ai().z0(str) != null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.offline.FavOfflineService", "add isOpen:%s isMpUrl:%s isOffline:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(p17), java.lang.Boolean.valueOf(z18));
        if (z17 && p17 && !z18) {
            i82.a aVar = new i82.a();
            aVar.f67788x4b6e88aa = str;
            aVar.f67780x347afa43 = c01.id.c();
            ((e82.e) i95.n0.c(e82.e.class)).Ai().mo880xb970c2b9(aVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.offline.FavOfflineService", "add url:%s", str);
            i82.a z07 = ((e82.e) i95.n0.c(e82.e.class)).Ai().z0(str);
            if (z07 != null) {
                this.f361072a.add(str);
                this.f361073b.put(str, z07);
                f();
            }
        }
    }

    public final void e() {
        android.database.Cursor E = ((e82.e) i95.n0.c(e82.e.class)).Ai().f371165d.E("FavOffline", i82.a.G.f398487c, "status!=? and failNum<?", new java.lang.String[]{"2", "5"}, null, null, "rowid");
        java.util.ArrayList<i82.a> arrayList = null;
        if (E != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (E.moveToNext()) {
                i82.a aVar = new i82.a();
                aVar.mo9015xbf5d97fd(E);
                arrayList2.add(aVar);
            }
            if (arrayList2.size() != 0) {
                arrayList = arrayList2;
            }
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f361072a;
        if (arrayList != null && arrayList.size() > 0) {
            for (i82.a aVar2 : arrayList) {
                if (aVar2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar2.f67788x4b6e88aa)) {
                    concurrentLinkedDeque.add(aVar2.f67788x4b6e88aa);
                    this.f361073b.put(aVar2.f67788x4b6e88aa, aVar2);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.offline.FavOfflineService", "resetDownloadTask downloadUrlList.size:%s", java.lang.Integer.valueOf(concurrentLinkedDeque.size()));
        f();
    }

    public void f() {
        if (this.f361072a.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.offline.FavOfflineService", "run() downloadUrlList is empty!");
            return;
        }
        java.util.concurrent.Future future = this.f361077f;
        if (future == null || future.isDone()) {
            this.f361077f = ((ku5.t0) ku5.t0.f394148d).g(this.f361078g);
        }
    }
}
