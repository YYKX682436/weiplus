package i11;

/* loaded from: classes15.dex */
public class g implements com.p314xaae8f345.mm.p944x882e457a.u0, u60.f {

    /* renamed from: i, reason: collision with root package name */
    public static i11.g f368618i;

    /* renamed from: d, reason: collision with root package name */
    public u60.h f368619d = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f368620e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f368621f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f368622g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i6(1, "addr_worker", 1);

    /* renamed from: h, reason: collision with root package name */
    public boolean f368623h = true;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.f573825fy3);
    }

    public final void a(com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f1011) {
        u60.h hVar = this.f368619d;
        if (hVar == null) {
            return;
        }
        if (c11121x1f1011 == null) {
            c11121x1f1011 = new com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011();
        }
        java.lang.Object obj = hVar.f506406f;
        if (obj == null) {
            obj = new java.lang.Object();
        }
        c11121x1f1011.f152760w = obj;
        c11121x1f1011.f152757t = (float) hVar.f506401a;
        c11121x1f1011.f152758u = (float) hVar.f506402b;
        java.util.HashMap hashMap = this.f368621f;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) hashMap.get(hVar.m167631x9616526c());
        if (copyOnWriteArrayList != null) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                if (weakReference != null && weakReference.get() != null) {
                    ((u60.e) weakReference.get()).mo24721x71c058c5(c11121x1f1011);
                }
            }
        }
        hashMap.remove(this.f368619d.m167631x9616526c());
        hashMap.size();
        this.f368619d = null;
        d();
        if (this.f368619d != null || this.f368620e.size() <= 0) {
            return;
        }
        gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.t.f33750x366c91de, this);
        gm0.j1.d().q(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7528x16eb0541, this);
    }

    public boolean b(u60.h hVar, u60.e eVar) {
        boolean z17;
        java.lang.Object obj;
        java.lang.Object obj2 = hVar.f506406f;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f368620e;
        if (obj2 != null) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                u60.h hVar2 = (u60.h) it.next();
                if (hVar2 != null && (obj = hVar2.f506406f) != null && obj.equals(obj2)) {
                    copyOnWriteArrayList.remove(hVar2);
                    break;
                }
            }
        }
        java.util.HashMap hashMap = this.f368621f;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = (java.util.concurrent.CopyOnWriteArrayList) hashMap.get(hVar.m167631x9616526c());
        if (copyOnWriteArrayList2 == null) {
            copyOnWriteArrayList2 = new java.util.concurrent.CopyOnWriteArrayList();
        }
        java.util.Iterator it6 = copyOnWriteArrayList2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                z17 = false;
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it6.next();
            if (weakReference != null && weakReference.get() != null && ((u60.e) weakReference.get()).equals(eVar)) {
                z17 = true;
                break;
            }
        }
        if (!z17) {
            copyOnWriteArrayList2.add(new java.lang.ref.WeakReference(eVar));
        }
        hashMap.put(hVar.m167631x9616526c(), copyOnWriteArrayList2);
        java.util.Iterator it7 = copyOnWriteArrayList.iterator();
        while (it7.hasNext()) {
            if (((u60.h) it7.next()).m167630xb2c87fbf(hVar)) {
                d();
                return false;
            }
        }
        u60.h hVar3 = this.f368619d;
        if (hVar3 != null && hVar.m167630xb2c87fbf(hVar3)) {
            return false;
        }
        copyOnWriteArrayList.add(hVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationAddr", "push task size %d listeners %d", java.lang.Integer.valueOf(copyOnWriteArrayList.size()), java.lang.Integer.valueOf(hashMap.size()));
        while (copyOnWriteArrayList.size() > 30) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationAddr", "force remove task");
            u60.h hVar4 = (u60.h) copyOnWriteArrayList.remove(0);
            if (hVar4 != null) {
                hashMap.remove(hVar4.m167631x9616526c());
            }
        }
        d();
        return true;
    }

    public boolean c(u60.e eVar) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.HashMap hashMap = this.f368621f;
        for (java.lang.String str : hashMap.keySet()) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) hashMap.get(str);
            if (copyOnWriteArrayList != null) {
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                    if (weakReference != null && weakReference.get() != null && ((u60.e) weakReference.get()).equals(eVar)) {
                        copyOnWriteArrayList.remove(weakReference);
                        break;
                    }
                }
            }
            hashMap.put(str, copyOnWriteArrayList);
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
                linkedList2.add(str);
            }
        }
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            hashMap.remove((java.lang.String) it6.next());
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = this.f368620e;
        java.util.Iterator it7 = copyOnWriteArrayList2.iterator();
        while (it7.hasNext()) {
            u60.h hVar = (u60.h) it7.next();
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList3 = (java.util.concurrent.CopyOnWriteArrayList) hashMap.get(hVar.m167631x9616526c());
            if (copyOnWriteArrayList3 == null || copyOnWriteArrayList3.size() == 0) {
                linkedList.add(hVar);
                hashMap.remove(hVar.m167631x9616526c());
            }
        }
        java.util.Iterator it8 = linkedList.iterator();
        while (it8.hasNext()) {
            copyOnWriteArrayList2.remove((u60.h) it8.next());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationAddr", "remove taskLists %d listeners size %d", java.lang.Integer.valueOf(copyOnWriteArrayList2.size()), java.lang.Integer.valueOf(hashMap.size()));
        return true;
    }

    public final void d() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.f368619d != null || (copyOnWriteArrayList = this.f368620e) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        this.f368619d = (u60.h) copyOnWriteArrayList.remove(0);
        gm0.j1.d().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.t.f33750x366c91de, this);
        gm0.j1.d().a(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7528x16eb0541, this);
        if (!this.f368619d.f506407g) {
            gm0.j1.d().g(new i11.q(this.f368619d));
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        u60.h hVar = this.f368619d;
        d17.g(new i11.r(hVar.f506401a, hVar.f506402b, hVar.f506403c));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f1011 = null;
        try {
            if (m1Var.mo808xfb85f7b0() == 4005) {
                i11.r rVar = (i11.r) m1Var;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f368679f)) {
                    com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f10112 = new com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011();
                    org.json.JSONObject jSONObject = new org.json.JSONObject(rVar.f368679f);
                    c11121x1f10112.f152756s = jSONObject.optString("request_id");
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                    org.json.JSONObject optJSONObject3 = jSONObject2.optJSONObject("address_component");
                    if (optJSONObject3 != null) {
                        c11121x1f10112.f152745e = optJSONObject3.optString(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16280x1473c11);
                        c11121x1f10112.f152746f = optJSONObject3.optString("province", optJSONObject3.optString("ad_level_1"));
                        c11121x1f10112.f152747g = optJSONObject3.optString("city", optJSONObject3.optString("ad_level_2"));
                        c11121x1f10112.f152749i = optJSONObject3.optString("district");
                        c11121x1f10112.f152750m = "";
                        c11121x1f10112.f152751n = optJSONObject3.optString("street");
                        c11121x1f10112.f152752o = optJSONObject3.optString("street_number");
                    }
                    org.json.JSONObject optJSONObject4 = jSONObject2.optJSONObject("formatted_addresses");
                    if (optJSONObject4 != null) {
                        c11121x1f10112.f152744d = optJSONObject4.optString("recommend");
                        c11121x1f10112.f152754q = optJSONObject4.optString("rough");
                    } else {
                        org.json.JSONObject optJSONObject5 = jSONObject2.optJSONObject("address_component");
                        if (optJSONObject5 != null) {
                            java.lang.String optString = optJSONObject5.optString("street_number");
                            c11121x1f10112.f152744d = optString;
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                                c11121x1f10112.f152744d = optJSONObject5.optString("street");
                            }
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11121x1f10112.f152744d)) {
                                c11121x1f10112.f152744d = optJSONObject5.optString("ad_level_3");
                            }
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11121x1f10112.f152744d)) {
                                c11121x1f10112.f152744d = optJSONObject5.optString("ad_level_2");
                            }
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11121x1f10112.f152744d)) {
                                c11121x1f10112.f152744d = optJSONObject5.optString("ad_level_1");
                            }
                        }
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11121x1f10112.f152752o)) {
                        c11121x1f10112.f152751n = "";
                    }
                    org.json.JSONObject optJSONObject6 = jSONObject2.optJSONObject("address_reference");
                    if (optJSONObject6 != null && (optJSONObject2 = optJSONObject6.optJSONObject("town")) != null) {
                        c11121x1f10112.f152753p = optJSONObject2.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                        c11121x1f10112.f152759v = optJSONObject2.optString(dm.i4.f66865x76d1ec5a);
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11121x1f10112.f152759v) && (optJSONObject = jSONObject2.optJSONObject("ad_info")) != null) {
                        c11121x1f10112.f152759v = optJSONObject.optString("adcode");
                    }
                    org.json.JSONObject optJSONObject7 = jSONObject2.optJSONObject("ad_info");
                    if (optJSONObject7 != null) {
                        c11121x1f10112.A = optJSONObject7.optString("nation_code");
                        c11121x1f10112.C = optJSONObject7.optString("adcode");
                    }
                    c11121x1f1011 = c11121x1f10112;
                }
            } else if (m1Var.mo808xfb85f7b0() == 655) {
                i11.q qVar = (i11.q) m1Var;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f368676f)) {
                    com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f10113 = new com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011();
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject(qVar.f368676f);
                    c11121x1f10113.f152756s = jSONObject3.optString("request_id");
                    org.json.JSONArray jSONArray = jSONObject3.getJSONArray("results");
                    org.json.JSONObject jSONObject4 = jSONArray.getJSONObject(1);
                    c11121x1f10113.f152744d = jSONObject4.getString("address_name");
                    c11121x1f10113.f152761x = jSONObject4.getString("address_name_id");
                    c11121x1f10113.B = jSONObject4.getJSONObject("second_landmark").getString("uid");
                    org.json.JSONObject jSONObject5 = jSONArray.getJSONObject(0);
                    c11121x1f10113.f152746f = jSONObject5.getString("p");
                    c11121x1f10113.f152762y = jSONObject5.getString("city_code");
                    c11121x1f10113.f152747g = jSONObject5.getString("c");
                    c11121x1f10113.f152749i = jSONObject5.getString("d");
                    c11121x1f10113.f152763z = jSONObject5.getString("adcode");
                    c11121x1f10113.f152750m = "";
                    c11121x1f10113.f152751n = "";
                    c11121x1f10113.f152752o = "";
                    for (int i19 = 0; i19 < jSONArray.length(); i19++) {
                        try {
                            org.json.JSONObject jSONObject6 = jSONArray.getJSONObject(i19);
                            java.lang.String string = jSONObject6.getString("dtype");
                            if ("ST".equals(string)) {
                                c11121x1f10113.f152751n = jSONObject6.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                            } else if ("ST_NO".equals(string)) {
                                c11121x1f10113.f152752o = jSONObject6.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                            }
                            if ("FORMAT_ADDRESS".equals(string)) {
                                c11121x1f10113.f152754q = jSONObject6.getString("rough_address_name");
                            }
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11121x1f10113.f152752o)) {
                        c11121x1f10113.f152751n = "";
                    }
                    c11121x1f1011 = c11121x1f10113;
                }
            }
        } catch (java.lang.Exception unused2) {
        }
        if (c11121x1f1011 == null || (str2 = c11121x1f1011.f152744d) == null || str2.equals("")) {
            this.f368622g.a(new i11.f(this));
        } else {
            a(c11121x1f1011);
        }
    }
}
