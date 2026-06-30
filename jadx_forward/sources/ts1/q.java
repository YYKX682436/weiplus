package ts1;

/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final ts1.q f503147a = new ts1.q();

    public final r45.o97 a(java.lang.String webId, java.lang.String str) {
        byte[] j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webId, "webId");
        ts1.p pVar = ts1.p.f503145a;
        boolean z17 = str == null || str.length() == 0;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = ts1.p.f503146b;
        if (!z17 && !v3Var.m(webId)) {
            webId = "";
            java.lang.String s17 = v3Var.s(str, "");
            if (s17 != null) {
                webId = s17;
            }
        }
        java.lang.Object obj = null;
        if (!(webId.length() > 0)) {
            return null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) v3Var.d(webId);
        if (o4Var != null && o4Var.f(webId) && (j17 = o4Var.j(webId)) != null) {
            if (!(j17.length == 0)) {
                try {
                    java.lang.Object newInstance = r45.o97.class.newInstance();
                    ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance).mo11468x92b714fd(j17);
                    obj = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                }
            }
        }
        return (r45.o97) obj;
    }

    public final java.lang.String b(java.lang.String url, java.lang.String str, boolean z17) {
        java.util.List urlQueryList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherCacheManager", "getPrefetchInfoId urlQueryKeys: " + str + ", readUrlQueryKeysFromLocal: " + z17);
        if ((str == null || str.length() == 0) || z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = ts1.u.f503151a;
            java.util.ArrayList arrayList = null;
            if (!(url.length() == 0)) {
                java.lang.String a17 = ts1.u.a(url);
                if (!(a17.length() == 0)) {
                    java.lang.String s17 = ts1.u.f503151a.s(a17, "");
                    java.lang.String str2 = s17 == null ? "" : s17;
                    if (str2.length() > 0) {
                        java.util.List f07 = r26.n0.f0(str2, new java.lang.String[]{","}, false, 0, 6, null);
                        arrayList = new java.util.ArrayList(kz5.d0.q(f07, 10));
                        java.util.Iterator it = f07.iterator();
                        while (it.hasNext()) {
                            arrayList.add(java.net.URLDecoder.decode((java.lang.String) it.next()));
                        }
                    }
                }
            }
            urlQueryList = arrayList;
        } else {
            urlQueryList = r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
        }
        if (urlQueryList == null || urlQueryList.isEmpty()) {
            return "";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var2 = ts1.u.f503151a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(urlQueryList, "urlQueryList");
        if (!urlQueryList.isEmpty()) {
            try {
                android.net.Uri parse = android.net.Uri.parse(url);
                android.net.Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                java.util.Set<java.lang.String> queryParameterNames = parse.getQueryParameterNames();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(queryParameterNames, "getQueryParameterNames(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : queryParameterNames) {
                    java.lang.String str3 = (java.lang.String) obj;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                    if ((str3.length() > 0) && urlQueryList.contains(str3)) {
                        arrayList2.add(obj);
                    }
                }
                java.util.List<java.lang.String> D0 = kz5.n0.D0(arrayList2);
                for (java.lang.String str4 : D0) {
                    java.lang.String queryParameter = parse.getQueryParameter(str4);
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    clearQuery.appendQueryParameter(str4, queryParameter);
                }
                java.lang.String builder = clearQuery.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(builder, "toString(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherUrlQueryManager", "filterUrl url: " + url + ", newUrl: " + builder + ", queryKeyList: " + D0);
                url = builder;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebPrefetcherUrlQueryManager", e17, "filterUrl exception", new java.lang.Object[0]);
            }
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.i(url, false);
    }
}
