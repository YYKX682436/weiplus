package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class m1 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i1 f216642d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i1(null);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f216643e = kz5.c0.i(18, 20);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f216644f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h1.f216104d);

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1 f216646b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f216645a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f216647c = new java.util.LinkedHashSet();

    public m1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(int i17, java.lang.String str) {
        r45.cl2 cl2Var;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216645a;
        for (java.util.Map.Entry entry : new java.util.HashMap(concurrentHashMap).entrySet()) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k1) entry.getKey()).f216444b == i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1) entry.getValue();
                if (j1Var.f216327f < 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdTraceMgr", "onFeedLoaderConsumeEnd unconsumed feed: " + j1Var + ", source: " + str);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("dispatchFeed", j1Var.a());
                    jSONObject.put("checkTime", java.lang.System.currentTimeMillis());
                    qc2.b bVar = qc2.b.f443042a;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = j1Var.f216322a;
                    long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
                    r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
                    long m75942xfb822ef2 = (m76806xdef68064 == null || (cl2Var = (r45.cl2) m76806xdef68064.m75936x14adae67(4)) == null) ? 0L : cl2Var.m75942xfb822ef2(1);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    qc2.b.a(bVar, 5, m76784x5db1b11, i17, m75942xfb822ef2, false, "unconsume", 0, 0, false, jSONObject2, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
                    this.f216647c.remove(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k1) entry.getKey()).f216443a));
                    concurrentHashMap.remove(entry.getKey());
                }
            }
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1 dispatchInfo) {
        r45.cl2 cl2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatchInfo, "dispatchInfo");
        int i17 = dispatchInfo.f216323b;
        if (f216643e.contains(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdTraceMgr", "onStreamCgiBack " + dispatchInfo);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = dispatchInfo.f216322a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k1 k1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k1(c19792x256d2725.m76784x5db1b11(), i17);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f216645a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1) concurrentHashMap.get(k1Var);
            if (j1Var != null) {
                if (j1Var.f216327f < 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdTraceMgr", "onStreamCgiBack prev=" + j1Var + " new=" + dispatchInfo);
                }
                this.f216647c.remove(java.lang.Long.valueOf(j1Var.f216322a.m76784x5db1b11()));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1 j1Var2 = this.f216646b;
            long j17 = 0;
            long j18 = j1Var2 != null ? j1Var2.f216328g : 0L;
            if (j1Var2 != null && dispatchInfo.f216328g - j18 < 5000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdTraceMgr", "onStreamCgiBack dispatch time too similar, lastDispatch=" + this.f216646b + " nowDispatch=" + dispatchInfo);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1 j1Var3 = this.f216646b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j1Var3);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("new", dispatchInfo.a());
                jSONObject.put("old", j1Var3.a());
                qc2.b bVar = qc2.b.f443042a;
                long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
                int i18 = dispatchInfo.f216323b;
                r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
                if (m76806xdef68064 != null && (cl2Var = (r45.cl2) m76806xdef68064.m75936x14adae67(4)) != null) {
                    j17 = cl2Var.m75942xfb822ef2(1);
                }
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                qc2.b.a(bVar, 5, m76784x5db1b11, i18, j17, false, "multidispatch", 0, 0, false, jSONObject2, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
            }
            concurrentHashMap.put(k1Var, dispatchInfo);
            this.f216646b = dispatchInfo;
        }
    }
}
