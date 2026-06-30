package uy1;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f513440a;

    /* renamed from: b, reason: collision with root package name */
    public static final wy1.b f513441b = new wy1.b();

    /* renamed from: c, reason: collision with root package name */
    public static final wy1.a f513442c = new wy1.a();

    public static void a(hz1.a aVar) {
        if (aVar == null) {
            return;
        }
        wy1.b bVar = f513441b;
        bVar.getClass();
        java.lang.String str = aVar.f367823d + "_" + aVar.f367820a;
        if (u46.l.e(str)) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) bVar.f532164a;
        if (concurrentHashMap.containsKey(str)) {
            vy1.b bVar2 = (vy1.b) concurrentHashMap.remove(str);
            if (bVar2 != null) {
                bVar2.a();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageDataEntityStorage", "[clear] page : " + aVar + ", mPageDataMap size : " + concurrentHashMap.size());
        }
    }

    public static int b(java.lang.Object obj) {
        vy1.b j17 = j(obj, false);
        if (j17 == null) {
            return 0;
        }
        return j17.f522958d;
    }

    public static boolean c(java.lang.Object obj, java.lang.String str, boolean z17) {
        if (obj != null && !u46.l.e(str)) {
            vy1.b j17 = j(obj, false);
            java.lang.Object obj2 = (j17 == null || u46.l.e(str)) ? null : ((java.util.concurrent.ConcurrentHashMap) j17.f522965k).get(str);
            if (obj2 != null && (obj2 instanceof java.lang.Boolean)) {
                return ((java.lang.Boolean) obj2).booleanValue();
            }
        }
        return z17;
    }

    public static boolean d(java.lang.Object obj, java.lang.String str, boolean z17) {
        java.lang.Object a17;
        return (obj == null || u46.l.e(str) || (a17 = xy1.b.a(l(obj, false), str)) == null || !(a17 instanceof java.lang.Boolean)) ? z17 : ((java.lang.Boolean) a17).booleanValue();
    }

    public static double e(java.lang.Object obj, java.lang.String str, double d17) {
        java.lang.Object a17;
        return (obj == null || u46.l.e(str) || (a17 = xy1.b.a(l(obj, false), str)) == null || !(a17 instanceof java.lang.Double)) ? d17 : ((java.lang.Double) a17).doubleValue();
    }

    public static int f(java.lang.Object obj, java.lang.String str, int i17) {
        java.lang.Object a17;
        return (obj == null || u46.l.e(str) || (a17 = xy1.b.a(l(obj, false), str)) == null || !(a17 instanceof java.lang.Integer)) ? i17 : ((java.lang.Integer) a17).intValue();
    }

    public static long g(java.lang.Object obj, java.lang.String str, long j17) {
        java.lang.Object a17;
        return (obj == null || u46.l.e(str) || (a17 = xy1.b.a(l(obj, false), str)) == null || !(a17 instanceof java.lang.Long)) ? j17 : ((java.lang.Long) a17).longValue();
    }

    public static vy1.a h(java.lang.Object obj, boolean z17) {
        if (obj == null) {
            return null;
        }
        wy1.a aVar = f513442c;
        vy1.a aVar2 = (vy1.a) ((java.util.WeakHashMap) aVar.f532163a).get(obj);
        if (aVar2 != null || !z17) {
            return aVar2;
        }
        vy1.a aVar3 = new vy1.a();
        aVar.getClass();
        ((java.util.WeakHashMap) aVar.f532163a).put(obj, aVar3);
        return aVar3;
    }

    public static java.util.Map i(java.lang.Object obj, java.lang.String str) {
        java.lang.Object obj2;
        java.util.HashMap hashMap = null;
        if (obj != null && !u46.l.e(str)) {
            vy1.a h17 = h(obj, false);
            if (h17 == null) {
                return null;
            }
            java.util.List list = h17.f522951c;
            if (list != null && ((java.util.concurrent.CopyOnWriteArrayList) list).size() > 0) {
                hashMap = new java.util.HashMap();
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
                while (it.hasNext()) {
                    ly1.a aVar = (ly1.a) it.next();
                    java.util.Map hashMap2 = new java.util.HashMap();
                    try {
                        hashMap2 = aVar.b(str);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.DataEntityOperator", "[getObjectDynamicParams] getDynamicParams throw Exception : " + e17.getMessage());
                    }
                    if (hashMap2 != null && hashMap2.size() > 0) {
                        for (java.lang.String str2 : hashMap2.keySet()) {
                            if (!u46.l.e(str2) && (obj2 = hashMap2.get(str2)) != null) {
                                hashMap.put(str2, obj2);
                            }
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public static vy1.b j(java.lang.Object obj, boolean z17) {
        vy1.b bVar = null;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof hz1.a)) {
            obj = new hz1.a(obj);
        }
        wy1.b bVar2 = f513441b;
        bVar2.getClass();
        if (obj instanceof hz1.a) {
            hz1.a aVar = (hz1.a) obj;
            java.lang.String str = aVar.f367823d + "_" + aVar.f367820a;
            if (!u46.l.e(str)) {
                bVar = (vy1.b) ((java.util.concurrent.ConcurrentHashMap) bVar2.f532164a).get(str);
            }
        }
        if (bVar == null && z17) {
            bVar = new vy1.b();
            bVar2.getClass();
            if (obj instanceof hz1.a) {
                hz1.a aVar2 = (hz1.a) obj;
                java.lang.String str2 = aVar2.f367823d + "_" + aVar2.f367820a;
                if (!u46.l.e(str2)) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) bVar2.f532164a;
                    concurrentHashMap.put(str2, bVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PageDataEntityStorage", "[save] page : " + aVar2 + ", mPageDataMap size : " + concurrentHashMap.size());
                }
            }
        }
        return bVar;
    }

    public static int k(java.lang.Object obj) {
        vy1.b j17 = j(obj, false);
        if (j17 == null) {
            return 0;
        }
        return j17.f522955a;
    }

    public static vy1.c l(java.lang.Object obj, boolean z17) {
        vy1.c cVar = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof android.view.View) {
            try {
                java.lang.Object tag = ((android.view.View) obj).getTag(com.p314xaae8f345.mm.R.id.p1e);
                if (tag instanceof vy1.c) {
                    cVar = (vy1.c) tag;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        if (cVar == null && z17) {
            cVar = new vy1.c();
            if (obj instanceof android.view.View) {
                try {
                    ((android.view.View) obj).setTag(com.p314xaae8f345.mm.R.id.p1e, cVar);
                } catch (java.lang.Throwable unused2) {
                }
            }
        }
        return cVar;
    }

    public static java.lang.String m(java.lang.Object obj) {
        vy1.c l17 = l(obj, false);
        if (l17 == null) {
            return null;
        }
        return l17.f522976a;
    }

    public static int n(java.lang.Object obj) {
        int i17 = 0;
        vy1.c l17 = l(obj, false);
        if (l17 != null) {
            java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) l17.f522984i).keySet().iterator();
            while (it.hasNext()) {
                i17 |= ((java.lang.Integer) it.next()).intValue();
            }
        }
        return i17;
    }

    public static boolean o(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return !u46.l.e(m(obj));
    }

    public static void p(java.lang.Object obj) {
        final vy1.b j17;
        if (obj == null || (j17 = j(obj, false)) == null) {
            return;
        }
        final java.util.HashMap hashMap = new java.util.HashMap();
        final java.util.HashMap hashMap2 = new java.util.HashMap();
        final java.util.HashMap hashMap3 = new java.util.HashMap();
        java.util.List a17 = xy1.a.a(j(obj, false));
        if (a17 != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) a17;
            if (arrayList.size() > 0) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ly1.a aVar = (ly1.a) it.next();
                    hashMap.putAll(aVar.b("biz_out"));
                    hashMap2.putAll(aVar.b("session_out"));
                    hashMap3.putAll(aVar.b("page_out"));
                }
            }
        }
        sz1.i.b(new java.lang.Runnable() { // from class: uy1.a$$a
            @Override // java.lang.Runnable
            public final void run() {
                vy1.b bVar = vy1.b.this;
                ((java.util.concurrent.ConcurrentHashMap) bVar.f522973s).clear();
                java.util.Map map = hashMap;
                for (java.lang.String str : map.keySet()) {
                    java.lang.Object obj2 = map.get(str);
                    if (obj2 != null) {
                        ((java.util.concurrent.ConcurrentHashMap) bVar.f522973s).put(str, obj2);
                    }
                }
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) bVar.f522974t;
                concurrentHashMap.clear();
                java.util.Map map2 = hashMap2;
                for (java.lang.String str2 : map2.keySet()) {
                    java.lang.Object obj3 = map2.get(str2);
                    if (obj3 != null) {
                        concurrentHashMap.put(str2, obj3);
                    }
                }
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) bVar.f522975u;
                concurrentHashMap2.clear();
                java.util.Map map3 = hashMap3;
                for (java.lang.String str3 : map3.keySet()) {
                    java.lang.Object obj4 = map3.get(str3);
                    if (obj4 != null) {
                        concurrentHashMap2.put(str3, obj4);
                    }
                }
            }
        });
    }

    public static void q(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        xy1.b.c(l(obj, true), str, obj2);
    }

    public static void r(java.lang.Object obj, java.lang.String str) {
        if (obj == null || u46.l.e(str)) {
            return;
        }
        if (u46.l.c(str, "view_clk")) {
            q(obj, "view_clk_count", 0);
        } else if (u46.l.c(str, "view_exp")) {
            q(obj, "view_exp_count", 0);
        } else if (u46.l.c(str, "view_unexp")) {
            q(obj, "view_unexp_count", 0);
        }
    }

    public static void s(java.lang.Object obj, java.util.Map map) {
        vy1.b j17 = j(obj, true);
        if (j17 == null) {
            return;
        }
        java.util.Map map2 = j17.f522959e;
        if (map == null || map.size() <= 0) {
            ((java.util.concurrent.ConcurrentHashMap) map2).clear();
            return;
        }
        for (java.lang.String str : map.keySet()) {
            if (!u46.l.e(str)) {
                java.lang.Object obj2 = map.get(str);
                if (obj2 != null) {
                    ((java.util.concurrent.ConcurrentHashMap) map2).put(str, obj2);
                } else {
                    ((java.util.concurrent.ConcurrentHashMap) map2).remove(str);
                }
            }
        }
    }

    public static void t(java.lang.Object obj, int i17, int i18, int i19, boolean z17, boolean z18) {
        java.util.List b17;
        boolean z19;
        vy1.b j17 = j(obj, true);
        if (j17 == null || (b17 = sz1.g.b(i17)) == null) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        if (arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Integer) it.next()).intValue();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) j17.f522966l;
                java.util.List list = (java.util.List) concurrentHashMap.get(java.lang.Integer.valueOf(intValue));
                if (list == null) {
                    list = new java.util.ArrayList();
                    concurrentHashMap.put(java.lang.Integer.valueOf(intValue), list);
                }
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        z19 = false;
                        break;
                    }
                    ky1.d dVar = (ky1.d) it6.next();
                    if (dVar.f395032a == i18 && dVar.f395033b == i19 && dVar.f395034c == z17 && dVar.f395035d == z18) {
                        z19 = true;
                        break;
                    }
                }
                if (!z19) {
                    ky1.d dVar2 = new ky1.d();
                    dVar2.f395032a = i18;
                    dVar2.f395033b = i19;
                    dVar2.f395034c = z17;
                    dVar2.f395035d = z18;
                    list.add(dVar2);
                }
            }
        }
    }

    public static void u(java.lang.Object obj, java.lang.String str, long j17) {
        vy1.c l17;
        if (obj == null || u46.l.e(str) || j17 < 0 || (l17 = l(obj, true)) == null) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) l17.f522986k).put(str, java.lang.Long.valueOf(j17));
    }

    public static void v(java.lang.Object obj, java.lang.String str) {
        if (obj == null || u46.l.e(str)) {
            return;
        }
        if (u46.l.c(str, "view_clk")) {
            q(obj, "view_clk_count", java.lang.Integer.valueOf(f(obj, "view_clk_count", 0) + 1));
        } else if (u46.l.c(str, "view_exp")) {
            q(obj, "view_exp_count", java.lang.Integer.valueOf(f(obj, "view_exp_count", 0) + 1));
        } else if (u46.l.c(str, "view_unexp")) {
            q(obj, "view_unexp_count", java.lang.Integer.valueOf(f(obj, "view_unexp_count", 0) + 1));
        }
    }
}
