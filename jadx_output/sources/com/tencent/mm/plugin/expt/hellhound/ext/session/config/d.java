package com.tencent.mm.plugin.expt.hellhound.ext.session.config;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.expt.hellhound.ext.session.config.d f99791b;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f99792a;

    public d() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f99792a = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SessionConfigChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionCloudConfig$1
            {
                this.__eventId = 1791753826;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SessionConfigChangeEvent sessionConfigChangeEvent) {
                int i17;
                nm5.d dVar;
                org.json.JSONArray jSONArray;
                int i18;
                org.json.JSONArray jSONArray2;
                com.tencent.mm.autogen.events.SessionConfigChangeEvent sessionConfigChangeEvent2 = sessionConfigChangeEvent;
                if (sessionConfigChangeEvent2 == null) {
                    return false;
                }
                am.st stVar = sessionConfigChangeEvent2.f54758g;
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionCloudConfig", "mSessionConfigChangeEvent callback json: %s", stVar.f7933a);
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionCloudConfig", "mSessionConfigChangeEvent callback isDel: %b", stVar.f7935c);
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionCloudConfig", "mSessionConfigChangeEvent callback: %b", stVar.f7934b);
                if (stVar.f7935c.booleanValue()) {
                    r45.v06 a17 = x52.b.a();
                    if (a17 == null) {
                        a17 = new r45.v06();
                    }
                    a17.f387785d = true;
                    a17.f387786e = false;
                    x52.b.b(a17);
                    return false;
                }
                r45.v06 v06Var = new r45.v06();
                v06Var.f387785d = false;
                v06Var.f387786e = stVar.f7934b.booleanValue();
                java.lang.String str = stVar.f7933a;
                if (str == null || str.isEmpty()) {
                    return false;
                }
                java.lang.String str2 = stVar.f7933a;
                com.tencent.mm.plugin.expt.hellhound.ext.session.config.d.this.getClass();
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
                                java.lang.String sid = optJSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_STREAM_ID);
                                jSONArray = optJSONArray;
                                if (com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99783a.h(sid)) {
                                    r45.u06 u06Var = new r45.u06();
                                    u06Var.f386912d = sid;
                                    u06Var.f386913e = optJSONObject.optString("prePage");
                                    u06Var.f386914f = optJSONObject.optString("pageName");
                                    org.json.JSONArray optJSONArray2 = optJSONObject.optJSONArray("sessionParams");
                                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                                        u06Var.f386915g = optJSONArray2.optJSONObject(0).optString("expect");
                                    }
                                    linkedList2.add(u06Var);
                                } else {
                                    kotlin.jvm.internal.o.g(sid, "sid");
                                    if (kotlin.jvm.internal.o.b("131", sid)) {
                                        w06Var = new r45.w06();
                                        w06Var.f388767d = sid;
                                        w06Var.f388768e = optJSONObject.optString("prePage");
                                        w06Var.f388769f = optJSONObject.optString("pageName");
                                        org.json.JSONArray optJSONArray3 = optJSONObject.optJSONArray("sessionParams");
                                        if (optJSONArray3 != null && optJSONArray3.length() > 1) {
                                            org.json.JSONObject optJSONObject2 = optJSONArray3.optJSONObject(0);
                                            org.json.JSONObject optJSONObject3 = optJSONArray3.optJSONObject(1);
                                            w06Var.f388770g = optJSONObject2.optString("expect");
                                            w06Var.f388771h = optJSONObject3.optString("expect");
                                        }
                                    } else {
                                        org.json.JSONArray optJSONArray4 = optJSONObject.optJSONArray("sessionParams");
                                        if (optJSONArray4 == null || optJSONArray4.length() <= 0) {
                                            r45.x06 x06Var = new r45.x06();
                                            x06Var.f389620d = sid;
                                            x06Var.f389621e = optJSONObject.optString("prePage");
                                            x06Var.f389622f = optJSONObject.optString("pageName");
                                            linkedList.add(x06Var);
                                        } else {
                                            r45.z06 z06Var = new r45.z06();
                                            z06Var.f391572d = sid;
                                            z06Var.f391573e = optJSONObject.optString("prePage");
                                            z06Var.f391574f = optJSONObject.optString("pageName");
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
                                                    y06Var.f390686d = optJSONObject4.optString("className");
                                                    y06Var.f390687e = optJSONObject4.optString("dataPath");
                                                    y06Var.f390688f = optJSONObject4.optString("expect");
                                                    arrayList.add(y06Var);
                                                }
                                                i27++;
                                                length2 = i18;
                                                optJSONArray4 = jSONArray2;
                                            }
                                            if (!arrayList.isEmpty()) {
                                                z06Var.f391575g.addAll(arrayList);
                                            }
                                            linkedList3.add(z06Var);
                                        }
                                    }
                                }
                            }
                            i19++;
                            optJSONArray = jSONArray;
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionCloudConfig", e17, "SessionConfigJson parse2 crash", new java.lang.Object[0]);
                            i17 = 0;
                            dVar = null;
                            return dVar == null ? false : false;
                        }
                    }
                    dVar = nm5.j.e(linkedList, linkedList2, w06Var, linkedList3);
                    i17 = 0;
                } catch (org.json.JSONException e18) {
                    i17 = 0;
                    com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionCloudConfig", e18, "SessionConfigJson parse1 crash", new java.lang.Object[0]);
                }
                if (dVar == null && dVar.h() > 0) {
                    v06Var.f387787f.addAll((java.util.Collection) dVar.a(i17));
                    v06Var.f387788g.addAll((java.util.Collection) dVar.a(1));
                    v06Var.f387789h = (r45.w06) dVar.a(2);
                    v06Var.f387790i.addAll((java.util.Collection) dVar.a(3));
                    x52.b.b(v06Var);
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionCloudConfig", "mSessionConfigChangeEvent callback: END");
                    return false;
                }
            }
        };
    }

    public static com.tencent.mm.plugin.expt.hellhound.ext.session.config.d a() {
        if (f99791b == null) {
            synchronized (com.tencent.mm.plugin.expt.hellhound.ext.session.config.d.class) {
                if (f99791b == null) {
                    f99791b = new com.tencent.mm.plugin.expt.hellhound.ext.session.config.d();
                }
            }
        }
        return f99791b;
    }
}
