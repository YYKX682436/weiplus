package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class rr {

    /* renamed from: a, reason: collision with root package name */
    public static final int f51252a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f51253b = 11;

    /* renamed from: g, reason: collision with root package name */
    private static final java.lang.String f51254g = "[{\"id\":0,\"index\":0,\"order\":1},{\"id\":-1,\"index\":1,\"order\":-1},{\"id\":-1,\"index\":2,\"order\":-1},{\"id\":-1,\"index\":3,\"order\":-1},{\"id\":-1,\"index\":4,\"order\":-1},{\"id\":-1,\"index\":5,\"order\":-1},{\"id\":-1,\"index\":6,\"order\":-1},{\"id\":-1,\"index\":7,\"order\":-1},{\"id\":16,\"index\":8,\"order\":-1},{\"id\":9,\"index\":9,\"order\":-1},{\"id\":10,\"index\":10,\"order\":-1},{\"id\":5,\"index\":11,\"order\":-1},{\"id\":4,\"index\":12,\"order\":-1},{\"id\":6,\"index\":13,\"order\":-1},{\"id\":7,\"index\":14,\"order\":-1},{\"id\":8,\"index\":15,\"order\":-1}]";

    /* renamed from: c, reason: collision with root package name */
    public volatile java.util.List<com.tencent.mapsdk.internal.rq> f51255c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f51256d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mapsdk.internal.mv f51257e;

    /* renamed from: f, reason: collision with root package name */
    public int f51258f;

    public rr(android.content.Context context, java.lang.String str) {
        java.lang.Object obj = new java.lang.Object();
        this.f51256d = obj;
        this.f51258f = -1;
        if (str == null) {
            this.f51257e = com.tencent.mapsdk.internal.my.a(context);
        } else {
            this.f51257e = com.tencent.mapsdk.internal.mx.a(context, str);
        }
        this.f51255c = new java.util.concurrent.CopyOnWriteArrayList();
        java.lang.String a17 = this.f51257e.a(com.tencent.mapsdk.internal.er.A);
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(a17 == null ? f51254g : a17);
            synchronized (obj) {
                this.f51255c.addAll(a(jSONArray));
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static java.util.List<com.tencent.mapsdk.internal.rq> a(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (int i17 = 0; i17 < length; i17++) {
            try {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                arrayList.add(new com.tencent.mapsdk.internal.rq(jSONObject.getInt(ya.b.INDEX), jSONObject.getInt(dm.i4.COL_ID), jSONObject.getInt("order")));
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    private void b() {
        this.f51255c = new java.util.concurrent.CopyOnWriteArrayList();
        java.lang.String a17 = this.f51257e.a(com.tencent.mapsdk.internal.er.A);
        if (a17 == null) {
            a17 = f51254g;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(a17);
            synchronized (this.f51256d) {
                this.f51255c.addAll(a(jSONArray));
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private void b(org.json.JSONArray jSONArray) {
        java.util.List<com.tencent.mapsdk.internal.rq> a17;
        org.json.JSONArray parseToJsonArray = com.tencent.map.tools.json.JsonUtils.parseToJsonArray(this.f51257e.a(com.tencent.mapsdk.internal.er.A));
        if (jSONArray == null || (a17 = a(jSONArray)) == null) {
            return;
        }
        synchronized (this.f51256d) {
            this.f51255c.clear();
            this.f51255c.addAll(a17);
        }
        boolean z17 = true;
        try {
            z17 = true ^ com.tencent.map.tools.json.JsonUtils.jsonArrayEqualsIgnoreOrder(jSONArray, parseToJsonArray);
        } catch (java.lang.Throwable unused) {
        }
        if (z17) {
            this.f51257e.a();
            this.f51257e.a(com.tencent.mapsdk.internal.er.A, jSONArray.toString());
        }
    }

    public final java.lang.String a() {
        if (this.f51255c == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        for (com.tencent.mapsdk.internal.rq rqVar : this.f51255c) {
            if (rqVar.f51250b != -1) {
                if (sb6.length() == 0) {
                    sb6.append(rqVar.f51250b);
                } else {
                    sb6.append(",");
                    sb6.append(rqVar.f51250b);
                }
            } else if (sb6.length() == 0) {
                sb6.append(0);
            } else {
                sb6.append(",");
            }
        }
        return sb6.toString();
    }

    public final int b(int i17) {
        synchronized (this.f51256d) {
            if (this.f51255c != null && this.f51255c.size() != 0 && i17 >= 0) {
                if ((i17 >= 8 && i17 <= 19) || this.f51258f >= 1000) {
                    return i17 + 1000;
                }
                if (i17 > 19 && i17 < 1000) {
                    return i17 - 11;
                }
                for (com.tencent.mapsdk.internal.rq rqVar : this.f51255c) {
                    if (i17 == rqVar.f51249a) {
                        if (i17 == 0 && rqVar.f51250b == 0 && this.f51258f <= 0) {
                            return 1000;
                        }
                        return rqVar.f51251c;
                    }
                }
                return i17;
            }
            return i17;
        }
    }

    public final com.tencent.mapsdk.internal.rq a(int i17) {
        int i18;
        synchronized (this.f51256d) {
            if (this.f51255c != null && this.f51255c.size() != 0 && i17 >= 0 && i17 - 1000 < this.f51255c.size()) {
                this.f51258f = i17;
                if (i17 >= 1000) {
                    return this.f51255c.get(i18);
                }
                if (i17 > 8 && i17 < 989) {
                    int i19 = i17 + 11;
                    if (i19 >= this.f51255c.size()) {
                        return null;
                    }
                    return this.f51255c.get(i19);
                }
                for (com.tencent.mapsdk.internal.rq rqVar : this.f51255c) {
                    if (rqVar.f51251c == i17) {
                        return rqVar;
                    }
                }
                return this.f51255c.get(0);
            }
            return null;
        }
    }

    private void a(com.tencent.mapsdk.internal.ne neVar) {
        com.tencent.mapsdk.internal.rq a17;
        if (neVar == null || (a17 = a(this.f51258f)) == null) {
            return;
        }
        neVar.f50508h.b(a17.f51249a);
    }
}
