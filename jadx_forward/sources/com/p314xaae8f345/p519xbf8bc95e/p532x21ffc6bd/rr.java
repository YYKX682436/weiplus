package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class rr {

    /* renamed from: a, reason: collision with root package name */
    public static final int f132785a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f132786b = 11;

    /* renamed from: g, reason: collision with root package name */
    private static final java.lang.String f132787g = "[{\"id\":0,\"index\":0,\"order\":1},{\"id\":-1,\"index\":1,\"order\":-1},{\"id\":-1,\"index\":2,\"order\":-1},{\"id\":-1,\"index\":3,\"order\":-1},{\"id\":-1,\"index\":4,\"order\":-1},{\"id\":-1,\"index\":5,\"order\":-1},{\"id\":-1,\"index\":6,\"order\":-1},{\"id\":-1,\"index\":7,\"order\":-1},{\"id\":16,\"index\":8,\"order\":-1},{\"id\":9,\"index\":9,\"order\":-1},{\"id\":10,\"index\":10,\"order\":-1},{\"id\":5,\"index\":11,\"order\":-1},{\"id\":4,\"index\":12,\"order\":-1},{\"id\":6,\"index\":13,\"order\":-1},{\"id\":7,\"index\":14,\"order\":-1},{\"id\":8,\"index\":15,\"order\":-1}]";

    /* renamed from: c, reason: collision with root package name */
    public volatile java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rq> f132788c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f132789d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv f132790e;

    /* renamed from: f, reason: collision with root package name */
    public int f132791f;

    public rr(android.content.Context context, java.lang.String str) {
        java.lang.Object obj = new java.lang.Object();
        this.f132789d = obj;
        this.f132791f = -1;
        if (str == null) {
            this.f132790e = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(context);
        } else {
            this.f132790e = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mx.a(context, str);
        }
        this.f132788c = new java.util.concurrent.CopyOnWriteArrayList();
        java.lang.String a17 = this.f132790e.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.A);
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(a17 == null ? f132787g : a17);
            synchronized (obj) {
                this.f132788c.addAll(a(jSONArray));
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rq> a(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (int i17 = 0; i17 < length; i17++) {
            try {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                arrayList.add(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rq(jSONObject.getInt(ya.b.f77479x42930b2), jSONObject.getInt(dm.i4.f66865x76d1ec5a), jSONObject.getInt("order")));
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    private void b() {
        this.f132788c = new java.util.concurrent.CopyOnWriteArrayList();
        java.lang.String a17 = this.f132790e.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.A);
        if (a17 == null) {
            a17 = f132787g;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(a17);
            synchronized (this.f132789d) {
                this.f132788c.addAll(a(jSONArray));
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private void b(org.json.JSONArray jSONArray) {
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rq> a17;
        org.json.JSONArray m35878x7ace8163 = com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35878x7ace8163(this.f132790e.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.A));
        if (jSONArray == null || (a17 = a(jSONArray)) == null) {
            return;
        }
        synchronized (this.f132789d) {
            this.f132788c.clear();
            this.f132788c.addAll(a17);
        }
        boolean z17 = true;
        try {
            z17 = true ^ com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35871xd41ebd0c(jSONArray, m35878x7ace8163);
        } catch (java.lang.Throwable unused) {
        }
        if (z17) {
            this.f132790e.a();
            this.f132790e.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.A, jSONArray.toString());
        }
    }

    public final java.lang.String a() {
        if (this.f132788c == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rq rqVar : this.f132788c) {
            if (rqVar.f132783b != -1) {
                if (sb6.length() == 0) {
                    sb6.append(rqVar.f132783b);
                } else {
                    sb6.append(",");
                    sb6.append(rqVar.f132783b);
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
        synchronized (this.f132789d) {
            if (this.f132788c != null && this.f132788c.size() != 0 && i17 >= 0) {
                if ((i17 >= 8 && i17 <= 19) || this.f132791f >= 1000) {
                    return i17 + 1000;
                }
                if (i17 > 19 && i17 < 1000) {
                    return i17 - 11;
                }
                for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rq rqVar : this.f132788c) {
                    if (i17 == rqVar.f132782a) {
                        if (i17 == 0 && rqVar.f132783b == 0 && this.f132791f <= 0) {
                            return 1000;
                        }
                        return rqVar.f132784c;
                    }
                }
                return i17;
            }
            return i17;
        }
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rq a(int i17) {
        int i18;
        synchronized (this.f132789d) {
            if (this.f132788c != null && this.f132788c.size() != 0 && i17 >= 0 && i17 - 1000 < this.f132788c.size()) {
                this.f132791f = i17;
                if (i17 >= 1000) {
                    return this.f132788c.get(i18);
                }
                if (i17 > 8 && i17 < 989) {
                    int i19 = i17 + 11;
                    if (i19 >= this.f132788c.size()) {
                        return null;
                    }
                    return this.f132788c.get(i19);
                }
                for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rq rqVar : this.f132788c) {
                    if (rqVar.f132784c == i17) {
                        return rqVar;
                    }
                }
                return this.f132788c.get(0);
            }
            return null;
        }
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rq a17;
        if (neVar == null || (a17 = a(this.f132791f)) == null) {
            return;
        }
        neVar.f132041h.b(a17.f132782a);
    }
}
