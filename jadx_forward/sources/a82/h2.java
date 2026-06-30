package a82;

/* loaded from: classes12.dex */
public class h2 implements com.p314xaae8f345.mm.p944x882e457a.u0, o72.x4 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f83542i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Set f83543m = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public boolean f83544d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f83545e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f83546f = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Queue f83547g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f83548h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new a82.k2(this), false);

    public h2() {
        gm0.j1.d().a(401, this);
    }

    public static boolean a(a82.h2 h2Var) {
        o72.r2 r2Var;
        java.util.List<o72.r2> ke6;
        boolean z17;
        h2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavSendService", "tryStartNetscene");
        h2Var.f83545e = java.lang.System.currentTimeMillis();
        boolean z18 = h2Var.f83546f;
        java.util.Queue queue = h2Var.f83547g;
        java.util.Map map = f83542i;
        if (!z18) {
            java.util.LinkedList linkedList = (java.util.LinkedList) queue;
            if (linkedList.size() == 0 && (ke6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().ke()) != null && ke6.size() != 0) {
                for (o72.r2 r2Var2 : ke6) {
                    java.util.Iterator it = l82.a.a(r2Var2.f67645x88be67a1).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z17 = true;
                            break;
                        }
                        o72.e2 e2Var = (o72.e2) it.next();
                        if (e2Var.f67095x2262335f == 0 && e2Var.f67093x10a0fed7 != 3) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavSendService", "cdnInfo is not upload end %s", e2Var.f67085xf604e54a);
                            z17 = false;
                            break;
                        }
                    }
                    if (!z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavSendService", "cdn info is not upload end");
                    } else if (((java.util.HashSet) f83543m).contains(java.lang.Long.valueOf(r2Var2.f67645x88be67a1))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavSendService", "info has existed, id %d, localId %d, sourceType %d, sourceId %s", java.lang.Integer.valueOf(r2Var2.f67643xc8a07680), java.lang.Long.valueOf(r2Var2.f67645x88be67a1), java.lang.Integer.valueOf(r2Var2.f67651x76e81a5a), r2Var2.f67650x85d9e03b);
                    } else {
                        java.util.HashMap hashMap = (java.util.HashMap) map;
                        if (hashMap.containsKey(java.lang.Long.valueOf(r2Var2.f67645x88be67a1))) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavSendService", "File is Already running:" + r2Var2.f67645x88be67a1);
                        } else {
                            linkedList.add(r2Var2);
                            hashMap.put(java.lang.Long.valueOf(r2Var2.f67645x88be67a1), null);
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavSendService", "klem GetNeedRun procing:" + ((java.util.HashMap) map).size() + ",send:" + linkedList.size() + "]");
                linkedList.size();
            }
        }
        if (h2Var.f83546f || ((java.util.LinkedList) queue).size() > 0) {
            java.util.LinkedList linkedList2 = (java.util.LinkedList) queue;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavSendService", "Has Data, start service %d", java.lang.Integer.valueOf(linkedList2.size()));
            if (!h2Var.f83546f && linkedList2.size() > 0 && (r2Var = (o72.r2) linkedList2.poll()) != null && r2Var.f67645x88be67a1 > 0) {
                h2Var.f83546f = true;
                o72.h5 h5Var = new o72.h5(r2Var);
                h5Var.f424880g = false;
                gm0.j1.d().g(h5Var);
                return true;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavSendService", "on finish");
            ((java.util.LinkedList) queue).clear();
            ((java.util.HashMap) map).clear();
            h2Var.f83544d = false;
            h2Var.f83546f = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavSendService", "klem No Data Any More , Stop Service");
        }
        return false;
    }

    public void b() {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        }
        gm0.j1.e().j(new a82.j2(this));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavSendService", "on scene end, errType %d, errCode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        gm0.j1.e().j(new a82.i2(this, m1Var, i17, i18, str));
    }
}
