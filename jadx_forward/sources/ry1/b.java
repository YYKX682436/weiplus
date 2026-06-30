package ry1;

/* loaded from: classes13.dex */
public abstract class b {
    public static ry1.a a(java.lang.String str, java.lang.Object obj) {
        hz1.a c17;
        java.util.Map map;
        if (u46.l.e(str) || obj == null || (c17 = sz1.a.c(obj)) == null) {
            return null;
        }
        ry1.a aVar = new ry1.a();
        aVar.f482895a = java.lang.String.valueOf(uy1.a.k(c17));
        vy1.b j17 = uy1.a.j(c17, false);
        if (j17 != null) {
            java.lang.String str2 = j17.f522956b;
            if (str2 == null) {
                str2 = "";
            }
            aVar.a("page_name", str2);
            java.lang.String str3 = j17.f522957c;
            if (str3 == null) {
                str3 = "";
            }
            aVar.a("page_title", str3);
            aVar.a("biz_group_id", java.lang.Integer.valueOf(j17.f522958d));
            aVar.a("page_stp", java.lang.Integer.valueOf(j17.f522969o));
            if (c17.f367825f) {
                sy1.f fVar = cy1.a.Ui().f306223m;
                if (fVar != null) {
                    vy1.b j18 = uy1.a.j(fVar.f495380b, false);
                    aVar.a("source_view_id", j18 == null ? "" : j18.f522972r);
                }
            } else {
                aVar.a("source_view_id", j17.f522972r);
            }
            java.util.Map map2 = j17.f522959e;
            if (map2 != null && ((java.util.concurrent.ConcurrentHashMap) map2).size() > 0) {
                aVar.b(map2);
            }
            java.util.Map map3 = j17.f522962h;
            if (map3 != null && (map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map3).get(str)) != null && map.size() > 0) {
                aVar.b(map);
            }
        }
        java.util.Map b17 = xy1.a.b(str, uy1.a.j(c17, false));
        if (b17 != null && ((java.util.HashMap) b17).size() > 0) {
            aVar.b(b17);
        }
        vy1.b j19 = uy1.a.j(c17, false);
        vy1.b bVar = j19 == null ? null : j19.f522960f;
        if (bVar != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("page_id", java.lang.Integer.valueOf(bVar.f522955a));
            hashMap.put("biz_group_id", java.lang.Integer.valueOf(bVar.f522958d));
            java.lang.String str4 = bVar.f522956b;
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("page_name", str4);
            java.lang.String str5 = bVar.f522957c;
            if (str5 == null) {
                str5 = "";
            }
            hashMap.put("page_title", str5);
            hashMap.put("page_stp", java.lang.Integer.valueOf(bVar.f522969o));
            hashMap.put("in_time", java.lang.Long.valueOf(bVar.f522970p));
            java.util.Map map4 = bVar.f522959e;
            if (map4 != null && ((java.util.concurrent.ConcurrentHashMap) map4).size() > 0) {
                hashMap.putAll(map4);
            }
            java.util.Map b18 = xy1.a.b(str, bVar);
            if (b18 != null && ((java.util.HashMap) b18).size() > 0) {
                hashMap.putAll(b18);
            }
            aVar.a("ref_page", hashMap);
        }
        vy1.b j27 = uy1.a.j(c17, false);
        vy1.b bVar2 = j27 != null ? j27.f522961g : null;
        if (bVar2 != null) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("page_id", java.lang.Integer.valueOf(bVar2.f522955a));
            hashMap2.put("biz_group_id", java.lang.Integer.valueOf(bVar2.f522958d));
            java.lang.String str6 = bVar2.f522956b;
            if (str6 == null) {
                str6 = "";
            }
            hashMap2.put("page_name", str6);
            java.lang.String str7 = bVar2.f522957c;
            hashMap2.put("page_title", str7 != null ? str7 : "");
            hashMap2.put("page_stp", java.lang.Integer.valueOf(bVar2.f522969o));
            hashMap2.put("in_time", java.lang.Long.valueOf(bVar2.f522971q));
            java.util.Map map5 = bVar2.f522959e;
            if (map5 != null && ((java.util.concurrent.ConcurrentHashMap) map5).size() > 0) {
                hashMap2.putAll(map5);
            }
            java.util.Map b19 = xy1.a.b(str, bVar2);
            if (b19 != null && ((java.util.HashMap) b19).size() > 0) {
                hashMap2.putAll(b19);
            }
            aVar.a("source_page", hashMap2);
        }
        return aVar;
    }

    public static java.util.List b(java.lang.String str, java.lang.Object obj) {
        java.util.ArrayList<vy1.c> arrayList;
        java.lang.ref.WeakReference weakReference;
        java.util.Map map;
        java.util.Map map2;
        if (!u46.l.e(str) && obj != null && sz1.a.n(obj)) {
            if (obj instanceof android.view.View) {
                arrayList = new java.util.ArrayList();
                android.view.View view = (android.view.View) obj;
                for (int i17 = 0; i17 < 100; i17++) {
                    vy1.c l17 = uy1.a.l(view, false);
                    if (uy1.a.o(view)) {
                        arrayList.add(l17);
                    }
                    java.lang.Object obj2 = (l17 == null || (weakReference = l17.f522980e) == null) ? null : (android.view.View) weakReference.get();
                    if (obj2 == null) {
                        obj2 = view.getParent();
                    }
                    if (obj2 == null || !(obj2 instanceof android.view.View)) {
                        break;
                    }
                    view = (android.view.View) obj2;
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (vy1.c cVar : arrayList) {
                    java.lang.String str2 = cVar == null ? null : cVar.f522976a;
                    if (!u46.l.e(str2)) {
                        ry1.a aVar = new ry1.a();
                        aVar.f482895a = str2;
                        if (cVar == null || (map = cVar.f522978c) == null) {
                            map = null;
                        }
                        if (map != null && ((java.util.concurrent.ConcurrentHashMap) map).size() > 0) {
                            aVar.b(map);
                        }
                        java.util.Map map3 = (cVar == null || (map2 = cVar.f522979d) == null) ? null : (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map2).get(str);
                        if (map3 != null && map3.size() > 0) {
                            aVar.b(map3);
                        }
                        java.util.Map b17 = xy1.b.b(str, cVar);
                        if (b17 != null && ((java.util.HashMap) b17).size() > 0) {
                            aVar.b(b17);
                        }
                        aVar.a("view_unique_id", cVar == null ? null : cVar.f522977b);
                        aVar.a("app_in_time", java.lang.Long.valueOf(uy1.a.g(obj, "view_expose_app_in_time", 0L)));
                        double e17 = uy1.a.e(obj, "view_expose_rate_max", 0.0d);
                        if (e17 > 0.0d) {
                            aVar.a("expose_max_rate", java.math.BigDecimal.valueOf(e17).setScale(2, java.math.RoundingMode.HALF_UP).toString());
                        }
                        arrayList2.add(aVar);
                    }
                }
                return arrayList2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if ((uy1.a.k(r1) > 0) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static hz1.a c(java.lang.Object r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            hz1.a r5 = sz1.a.c(r5)
            cy1.a r1 = cy1.a.Ui()
            sy1.f r1 = r1.f306223m
            if (r1 == 0) goto L46
            if (r5 == 0) goto L46
            java.util.Map r1 = r1.f495382d
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r3 = r2.next()
            hz1.a r3 = (hz1.a) r3
            boolean r4 = r5.d(r3)
            if (r4 == 0) goto L1e
            java.lang.Object r1 = r1.get(r3)
            hz1.a r1 = (hz1.a) r1
            goto L38
        L37:
            r1 = r0
        L38:
            if (r1 == 0) goto L46
            int r2 = uy1.a.k(r1)
            if (r2 <= 0) goto L42
            r2 = 1
            goto L43
        L42:
            r2 = 0
        L43:
            if (r2 == 0) goto L46
            goto L47
        L46:
            r1 = r0
        L47:
            if (r5 == 0) goto L5b
            ty1.a r2 = ty1.a.a()
            boolean r2 = r2.c(r5)
            if (r2 != 0) goto L5b
            boolean r0 = r5.f367824e
            if (r0 == 0) goto L5a
            if (r1 == 0) goto L5a
            return r1
        L5a:
            return r5
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ry1.b.c(java.lang.Object):hz1.a");
    }

    public static hz1.a d(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        hz1.a c17 = c(obj);
        if (c17 != null) {
            return c17;
        }
        sy1.f fVar = cy1.a.Ui().f306223m;
        if (fVar != null) {
            return fVar.f495380b;
        }
        return null;
    }
}
