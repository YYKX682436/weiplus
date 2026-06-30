package vi1;

/* loaded from: classes7.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final vi1.o0 f518949a = new vi1.o0();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f518950b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.PhoneItemsManager");

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 phoneItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phoneItem, "phoneItem");
        java.util.ArrayList arrayList = (java.util.ArrayList) b();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) it.next()).f168940o = false;
        }
        if (arrayList.contains(phoneItem)) {
            arrayList.set(arrayList.indexOf(phoneItem), phoneItem);
        } else {
            arrayList.add(phoneItem);
        }
        d(arrayList);
    }

    public final java.util.List b() {
        org.json.JSONArray jSONArray;
        try {
            jSONArray = new org.json.JSONArray(f518950b.getString("PhoneItemsManager#PhoneItems", "{}"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneItemsManager", "e:%s", e17);
            jSONArray = null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                vi1.m0 m0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581.f168931q;
                java.lang.String string = jSONArray.getString(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 a17 = m0Var.a(string);
                if (a17 != null) {
                    arrayList.add(a17);
                }
            }
        }
        java.lang.String.valueOf(jSONArray);
        return arrayList;
    }

    public final java.util.List c(java.util.List list, java.util.List list2) {
        boolean z17;
        if (list == null) {
            return null;
        }
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) it.next();
                if (c12542x3a17e581.f168940o) {
                    java.util.Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e5812 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) it6.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c12542x3a17e581.f168932d, c12542x3a17e5812.f168932d)) {
                            c12542x3a17e5812.f168940o = true;
                            z17 = true;
                            break;
                        }
                    }
                }
            }
        }
        z17 = false;
        if (!z17 && list.size() >= 1) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) list.get(0)).f168940o = true;
        }
        return list;
    }

    public final void d(java.util.List list) {
        if (list == null) {
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) it.next();
            c12542x3a17e581.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("mobile", c12542x3a17e581.f168932d);
            jSONObject.put("show_mobile", c12542x3a17e581.f168933e);
            jSONObject.put("need_auth", c12542x3a17e581.f168937i);
            jSONObject.put("allow_send_sms", c12542x3a17e581.f168938m);
            jSONObject.put("encryptedData", c12542x3a17e581.f168934f);
            jSONObject.put("iv", c12542x3a17e581.f168935g);
            jSONObject.put("cloud_id", c12542x3a17e581.f168936h);
            jSONObject.put("is_wechat", c12542x3a17e581.f168939n);
            jSONObject.put("is_check", c12542x3a17e581.f168940o);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, c12542x3a17e581.f168941p);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            jSONArray.put(jSONObject2);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f518950b;
        o4Var.putString("PhoneItemsManager#PhoneItems", jSONArray2);
        o4Var.getClass();
        jSONArray.toString();
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581) {
        java.util.List b17 = b();
        if (c12542x3a17e581 != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) b17;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) it.next()).f168940o = false;
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e5812 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) it6.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c12542x3a17e581.f168932d, c12542x3a17e5812.f168932d)) {
                    c12542x3a17e5812.f168940o = true;
                }
            }
        }
        d(b17);
    }
}
