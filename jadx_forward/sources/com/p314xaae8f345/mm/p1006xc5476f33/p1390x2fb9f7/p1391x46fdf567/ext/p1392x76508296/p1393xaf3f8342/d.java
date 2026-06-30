package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.d f181324b;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f181325a;

    public d() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f181325a = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5997x26bcc452>(a0Var) { // from class: com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig$1
            {
                this.f39173x3fe91575 = 1791753826;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5997x26bcc452 c5997x26bcc452) {
                int i17;
                nm5.d dVar;
                org.json.JSONArray jSONArray;
                int i18;
                org.json.JSONArray jSONArray2;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5997x26bcc452 c5997x26bcc4522 = c5997x26bcc452;
                if (c5997x26bcc4522 == null) {
                    return false;
                }
                am.st stVar = c5997x26bcc4522.f136291g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionCloudConfig", "mSessionConfigChangeEvent callback json: %s", stVar.f89466a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionCloudConfig", "mSessionConfigChangeEvent callback isDel: %b", stVar.f89468c);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionCloudConfig", "mSessionConfigChangeEvent callback: %b", stVar.f89467b);
                if (stVar.f89468c.booleanValue()) {
                    r45.v06 a17 = x52.b.a();
                    if (a17 == null) {
                        a17 = new r45.v06();
                    }
                    a17.f469318d = true;
                    a17.f469319e = false;
                    x52.b.b(a17);
                    return false;
                }
                r45.v06 v06Var = new r45.v06();
                v06Var.f469318d = false;
                v06Var.f469319e = stVar.f89467b.booleanValue();
                java.lang.String str = stVar.f89466a;
                if (str == null || str.isEmpty()) {
                    return false;
                }
                java.lang.String str2 = stVar.f89466a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.d.this.getClass();
                try {
                    org.json.JSONArray optJSONArray = new org.json.JSONObject(str2).optJSONArray("sessions");
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    java.util.LinkedList linkedList3 = new java.util.LinkedList();
                    int length = optJSONArray.length();
                    int i19 = 0;
                    r45.w06 w06Var = null;
                    while (i19 < length) {
                        try {
                            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i19);
                            if (optJSONObject == null) {
                                jSONArray = optJSONArray;
                            } else {
                                java.lang.String sid = optJSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54540x542b1a21);
                                jSONArray = optJSONArray;
                                if (com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.f181316a.h(sid)) {
                                    r45.u06 u06Var = new r45.u06();
                                    u06Var.f468445d = sid;
                                    u06Var.f468446e = optJSONObject.optString("prePage");
                                    u06Var.f468447f = optJSONObject.optString("pageName");
                                    org.json.JSONArray optJSONArray2 = optJSONObject.optJSONArray("sessionParams");
                                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                                        u06Var.f468448g = optJSONArray2.optJSONObject(0).optString("expect");
                                    }
                                    linkedList2.add(u06Var);
                                } else {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sid, "sid");
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("131", sid)) {
                                        w06Var = new r45.w06();
                                        w06Var.f470300d = sid;
                                        w06Var.f470301e = optJSONObject.optString("prePage");
                                        w06Var.f470302f = optJSONObject.optString("pageName");
                                        org.json.JSONArray optJSONArray3 = optJSONObject.optJSONArray("sessionParams");
                                        if (optJSONArray3 != null && optJSONArray3.length() > 1) {
                                            org.json.JSONObject optJSONObject2 = optJSONArray3.optJSONObject(0);
                                            org.json.JSONObject optJSONObject3 = optJSONArray3.optJSONObject(1);
                                            w06Var.f470303g = optJSONObject2.optString("expect");
                                            w06Var.f470304h = optJSONObject3.optString("expect");
                                        }
                                    } else {
                                        org.json.JSONArray optJSONArray4 = optJSONObject.optJSONArray("sessionParams");
                                        if (optJSONArray4 == null || optJSONArray4.length() <= 0) {
                                            r45.x06 x06Var = new r45.x06();
                                            x06Var.f471153d = sid;
                                            x06Var.f471154e = optJSONObject.optString("prePage");
                                            x06Var.f471155f = optJSONObject.optString("pageName");
                                            linkedList.add(x06Var);
                                        } else {
                                            r45.z06 z06Var = new r45.z06();
                                            z06Var.f473105d = sid;
                                            z06Var.f473106e = optJSONObject.optString("prePage");
                                            z06Var.f473107f = optJSONObject.optString("pageName");
                                            int length2 = optJSONArray4.length();
                                            java.util.ArrayList arrayList = new java.util.ArrayList();
                                            int i27 = 0;
                                            while (i27 < length2) {
                                                org.json.JSONObject optJSONObject4 = optJSONArray4.optJSONObject(i27);
                                                if (optJSONObject4 == null) {
                                                    i18 = length2;
                                                    jSONArray2 = optJSONArray4;
                                                } else {
                                                    i18 = length2;
                                                    r45.y06 y06Var = new r45.y06();
                                                    jSONArray2 = optJSONArray4;
                                                    y06Var.f472219d = optJSONObject4.optString("className");
                                                    y06Var.f472220e = optJSONObject4.optString("dataPath");
                                                    y06Var.f472221f = optJSONObject4.optString("expect");
                                                    arrayList.add(y06Var);
                                                }
                                                i27++;
                                                length2 = i18;
                                                optJSONArray4 = jSONArray2;
                                            }
                                            if (!arrayList.isEmpty()) {
                                                z06Var.f473108g.addAll(arrayList);
                                            }
                                            linkedList3.add(z06Var);
                                        }
                                    }
                                }
                            }
                            i19++;
                            optJSONArray = jSONArray;
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionCloudConfig", e17, "SessionConfigJson parse2 crash", new java.lang.Object[0]);
                            i17 = 0;
                            dVar = null;
                            return dVar == null ? false : false;
                        }
                    }
                    dVar = nm5.j.e(linkedList, linkedList2, w06Var, linkedList3);
                    i17 = 0;
                } catch (org.json.JSONException e18) {
                    i17 = 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionCloudConfig", e18, "SessionConfigJson parse1 crash", new java.lang.Object[0]);
                }
                if (dVar == null && dVar.h() > 0) {
                    v06Var.f469320f.addAll((java.util.Collection) dVar.a(i17));
                    v06Var.f469321g.addAll((java.util.Collection) dVar.a(1));
                    v06Var.f469322h = (r45.w06) dVar.a(2);
                    v06Var.f469323i.addAll((java.util.Collection) dVar.a(3));
                    x52.b.b(v06Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionCloudConfig", "mSessionConfigChangeEvent callback: END");
                    return false;
                }
            }
        };
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.d a() {
        if (f181324b == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.d.class) {
                if (f181324b == null) {
                    f181324b = new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.d();
                }
            }
        }
        return f181324b;
    }
}
