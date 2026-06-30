package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes7.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h1 f269353a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f269354b = new java.util.concurrent.ConcurrentHashMap();

    public static final void a(java.lang.String url, java.util.LinkedList linkedList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (linkedList != null) {
            java.lang.String c17 = f269353a.c(url);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebComptCache", "addJSAPIWebCompt " + linkedList.size());
            if (c17 != null) {
                ((java.util.concurrent.ConcurrentHashMap) f269354b).put(c17, linkedList);
            }
        }
    }

    public final java.util.LinkedList b(java.lang.String url, org.json.JSONArray list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.lang.String c17 = c(url);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList<r45.d24> linkedList2 = (java.util.LinkedList) ((java.util.concurrent.ConcurrentHashMap) f269354b).get(c17);
        if (linkedList2 != null) {
            for (r45.d24 d24Var : linkedList2) {
                int length = list.length();
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        break;
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0((java.lang.String) list.get(i17), d24Var.f453539d)) {
                        linkedList.add(d24Var);
                        break;
                    }
                    i17++;
                }
            }
        }
        return linkedList;
    }

    public final java.lang.String c(java.lang.String url) {
        if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(url)) {
            return url;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.n(url);
    }
}
