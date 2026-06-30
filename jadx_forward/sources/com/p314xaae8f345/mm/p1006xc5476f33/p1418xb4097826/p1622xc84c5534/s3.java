package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s3 f206878a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s3();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.ArrayMap f206879b = new android.util.ArrayMap();

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4 f206880c;

    public static org.json.JSONObject c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s3 s3Var, java.lang.String contextId, java.lang.String str, int i17, java.lang.Object obj) {
        org.json.JSONArray b17;
        if ((i17 & 1) != 0) {
            contextId = "";
        }
        if ((i17 & 2) != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4 n4Var = f206880c;
            str = pm0.v.u(n4Var != null ? n4Var.f206686a : 0L);
        }
        s3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("referrer_feed_id", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s3 s3Var2 = f206878a;
        synchronized (s3Var2) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SearchFeedInfoCollector", "reportBatch count:10", null);
            java.util.Collection values = f206879b.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            b17 = s3Var2.b(kz5.n0.K0(kz5.n0.F0(values, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r3()), 10));
        }
        jSONObject.put("finderInfo", b17);
        if (!android.text.TextUtils.isEmpty(contextId)) {
            jSONObject.put("contextID", contextId);
        }
        return jSONObject;
    }

    public final synchronized void a(java.util.LinkedList status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        long c17 = c01.id.c();
        java.util.Iterator it = status.iterator();
        while (it.hasNext()) {
            r45.vd6 vd6Var = (r45.vd6) it.next();
            r45.yw6 yw6Var = (r45.yw6) vd6Var.m75936x14adae67(2);
            long m75942xfb822ef2 = yw6Var != null ? yw6Var.m75942xfb822ef2(2) : 0L;
            r45.yw6 yw6Var2 = (r45.yw6) vd6Var.m75936x14adae67(2);
            long m75942xfb822ef22 = yw6Var2 != null ? yw6Var2.m75942xfb822ef2(6) : 0L;
            if (m75942xfb822ef2 == 0 && m75942xfb822ef22 > 0) {
                m75942xfb822ef2 = c17 - m75942xfb822ef22;
            }
            long j17 = m75942xfb822ef2;
            long m75942xfb822ef23 = vd6Var.m75942xfb822ef2(0);
            java.lang.String u17 = pm0.v.u(m75942xfb822ef23);
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SearchFeedInfoCollector", "stayTimeMs:" + j17 + " id:" + u17, null);
            android.util.ArrayMap arrayMap = f206879b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q3 q3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q3) arrayMap.get(java.lang.Long.valueOf(m75942xfb822ef23));
            if (q3Var == null) {
            } else if (q3Var.f206799b < j17) {
                q3Var.f206799b = j17;
                q3Var.f206800c = m75942xfb822ef22;
            }
        }
    }

    public final org.json.JSONArray b(java.util.Collection collection) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q3 q3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q3) it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feed_id", q3Var.f206798a);
                jSONObject.put("start_play_time_ms", q3Var.f206800c);
                jSONObject.put("stay_time_ms", q3Var.f206799b);
                jSONArray.put(jSONObject);
            }
        } catch (java.lang.Exception e17) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.SearchFeedInfoCollector", e17, "report", new java.lang.Object[0]);
        }
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SearchFeedInfoCollector", "report:" + jSONArray, null);
        return jSONArray;
    }
}
