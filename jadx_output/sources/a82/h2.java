package a82;

/* loaded from: classes12.dex */
public class h2 implements com.tencent.mm.modelbase.u0, o72.x4 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f2009i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Set f2010m = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public boolean f2011d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f2012e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2013f = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Queue f2014g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f2015h = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new a82.k2(this), false);

    public h2() {
        gm0.j1.d().a(401, this);
    }

    public static boolean a(a82.h2 h2Var) {
        o72.r2 r2Var;
        java.util.List<o72.r2> ke6;
        boolean z17;
        h2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavSendService", "tryStartNetscene");
        h2Var.f2012e = java.lang.System.currentTimeMillis();
        boolean z18 = h2Var.f2013f;
        java.util.Queue queue = h2Var.f2014g;
        java.util.Map map = f2009i;
        if (!z18) {
            java.util.LinkedList linkedList = (java.util.LinkedList) queue;
            if (linkedList.size() == 0 && (ke6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().ke()) != null && ke6.size() != 0) {
                for (o72.r2 r2Var2 : ke6) {
                    java.util.Iterator it = l82.a.a(r2Var2.field_localId).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z17 = true;
                            break;
                        }
                        o72.e2 e2Var = (o72.e2) it.next();
                        if (e2Var.field_type == 0 && e2Var.field_status != 3) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavSendService", "cdnInfo is not upload end %s", e2Var.field_dataId);
                            z17 = false;
                            break;
                        }
                    }
                    if (!z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavSendService", "cdn info is not upload end");
                    } else if (((java.util.HashSet) f2010m).contains(java.lang.Long.valueOf(r2Var2.field_localId))) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavSendService", "info has existed, id %d, localId %d, sourceType %d, sourceId %s", java.lang.Integer.valueOf(r2Var2.field_id), java.lang.Long.valueOf(r2Var2.field_localId), java.lang.Integer.valueOf(r2Var2.field_sourceType), r2Var2.field_sourceId);
                    } else {
                        java.util.HashMap hashMap = (java.util.HashMap) map;
                        if (hashMap.containsKey(java.lang.Long.valueOf(r2Var2.field_localId))) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavSendService", "File is Already running:" + r2Var2.field_localId);
                        } else {
                            linkedList.add(r2Var2);
                            hashMap.put(java.lang.Long.valueOf(r2Var2.field_localId), null);
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavSendService", "klem GetNeedRun procing:" + ((java.util.HashMap) map).size() + ",send:" + linkedList.size() + "]");
                linkedList.size();
            }
        }
        if (h2Var.f2013f || ((java.util.LinkedList) queue).size() > 0) {
            java.util.LinkedList linkedList2 = (java.util.LinkedList) queue;
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavSendService", "Has Data, start service %d", java.lang.Integer.valueOf(linkedList2.size()));
            if (!h2Var.f2013f && linkedList2.size() > 0 && (r2Var = (o72.r2) linkedList2.poll()) != null && r2Var.field_localId > 0) {
                h2Var.f2013f = true;
                o72.h5 h5Var = new o72.h5(r2Var);
                h5Var.f343347g = false;
                gm0.j1.d().g(h5Var);
                return true;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavSendService", "on finish");
            ((java.util.LinkedList) queue).clear();
            ((java.util.HashMap) map).clear();
            h2Var.f2011d = false;
            h2Var.f2013f = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavSendService", "klem No Data Any More , Stop Service");
        }
        return false;
    }

    public void b() {
        if (com.tencent.mars.xlog.Log.isDebug()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
        }
        gm0.j1.e().j(new a82.j2(this));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavSendService", "on scene end, errType %d, errCode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        gm0.j1.e().j(new a82.i2(this, m1Var, i17, i18, str));
    }
}
