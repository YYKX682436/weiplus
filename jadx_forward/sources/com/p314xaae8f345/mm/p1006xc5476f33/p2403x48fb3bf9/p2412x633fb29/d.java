package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
            org.json.JSONArray optJSONArray = su4.o2.d("AISummary").optJSONArray("mpPrefixes");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                java.util.ArrayList arrayList = new java.util.ArrayList(length);
                for (int i17 = 0; i17 < length; i17++) {
                    arrayList.add(optJSONArray.optString(i17));
                }
                if (!arrayList.isEmpty()) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        if (r26.i0.y(url, str, false)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(url)) {
            return true;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        return hy4.i.k(url);
    }
}
