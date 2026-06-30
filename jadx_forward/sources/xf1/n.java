package xf1;

/* loaded from: classes7.dex */
public final class n {
    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final xf1.o a(org.json.JSONObject json) {
        xf1.o mVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        if (json.has("subMetas")) {
            try {
                org.json.JSONArray jSONArray = json.getJSONArray("subMetas");
                e06.k m17 = e06.p.m(0, jSONArray.length());
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
                java.util.Iterator it = m17.iterator();
                while (((e06.j) it).hasNext()) {
                    arrayList.add(jSONArray.getJSONObject(((kz5.x0) it).b()));
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    org.json.JSONObject jSONObject = (org.json.JSONObject) it6.next();
                    xf1.n nVar = xf1.o.f535779c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject);
                    xf1.o a17 = nVar.a(jSONObject);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                    arrayList2.add(a17);
                }
                java.lang.String string = json.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                long j17 = json.getLong("lastModified");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                mVar = new xf1.m(string, j17, arrayList2, null);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandResCacheChecker", "DirMetaData#fromJsonFile, fail since " + e17);
                return null;
            }
        } else {
            try {
                java.lang.String string2 = json.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                long j18 = json.getLong("lastModified");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
                mVar = new xf1.o(string2, j18);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandResCacheChecker", "FileMetaData#fromJsonFile, fail since " + e18);
                return null;
            }
        }
        return mVar;
    }
}
