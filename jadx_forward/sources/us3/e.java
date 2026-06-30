package us3;

@j95.b
/* loaded from: classes9.dex */
public class e extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f512101d = null;

    public static us3.e Ai() {
        return (us3.e) i95.n0.c(us3.e.class);
    }

    public static vs3.a Di() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return new vs3.a(str, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxw), 3);
    }

    public java.util.List Bi() {
        java.util.List list = this.f512101d;
        if (list != null) {
            return list;
        }
        this.f512101d = new java.util.LinkedList();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(270337, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRecharge", "empty history");
            return this.f512101d;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i17 = 0; i17 < java.lang.Math.min(jSONArray.length(), 100); i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                java.lang.String optString2 = jSONObject.optString("record");
                vs3.a aVar = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) ? new vs3.a(optString2, optString, jSONObject.optString(ya.b.f77489x9ff58fb5), 2) : null;
                if (aVar != null) {
                    this.f512101d.add(aVar);
                }
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCoreRecharge", e17, "", new java.lang.Object[0]);
            java.lang.String[] split = str.split("&");
            if (split != null && split.length > 0) {
                for (int i18 = 0; i18 < java.lang.Math.min(split.length, 100); i18++) {
                    java.lang.String[] split2 = split[i18].split("=");
                    if (split2.length == 2) {
                        this.f512101d.add(new vs3.a(split2[0], split2[1], 2));
                    } else if (split2.length == 1) {
                        this.f512101d.add(new vs3.a(split2[0], "", 2));
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRecharge", "getMobileHistory : " + this.f512101d.size());
        return this.f512101d;
    }

    public void Ni(java.util.List list) {
        this.f512101d = list;
        if (list == null || list.size() == 0) {
            this.f512101d = new java.util.LinkedList();
        } else if (list.size() > 10) {
            for (int size = list.size() - 1; size >= 10; size--) {
                list.remove(size);
            }
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (vs3.a aVar : this.f512101d) {
            aVar.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                java.lang.String str = aVar.f521408a;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("record", str);
                java.lang.String str2 = aVar.f521409b;
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str2);
                java.lang.String str3 = aVar.f521410c;
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject.put(ya.b.f77489x9ff58fb5, str3);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MallInputRecord", e17, "", new java.lang.Object[0]);
                jSONObject = null;
            }
            jSONArray.put(jSONObject);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreRecharge", "number: %s", aVar.f521409b);
        }
        jSONArray.toString();
        gm0.j1.u().c().w(270337, jSONArray.toString());
        gm0.j1.u().c().i(true);
    }

    public boolean wi(vs3.a aVar) {
        if (aVar != null) {
            java.lang.String str = aVar.f521408a;
            if (android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(str)) {
                java.util.List Bi = Bi();
                java.util.Iterator it = Bi.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    vs3.a aVar2 = (vs3.a) it.next();
                    if (str.equals(aVar2.f521408a)) {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f521409b)) {
                            aVar.f521409b = aVar2.f521409b;
                        }
                        Bi.remove(aVar2);
                    }
                }
                Bi.add(0, aVar);
                Ni(Bi);
                return true;
            }
        }
        return false;
    }
}
