package su4;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f494357a;

    /* renamed from: b, reason: collision with root package name */
    public int f494358b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f494359c;

    /* renamed from: d, reason: collision with root package name */
    public long f494360d;

    /* renamed from: e, reason: collision with root package name */
    public long f494361e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f494362f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f494363g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f494364h = null;

    public static java.lang.String a(java.lang.String str, int i17, int i18, boolean z17) {
        com.p314xaae8f345.mm.vfs.z7 z7Var;
        java.lang.String str2 = "FTS_BizCacheObj" + i17 + "-" + i18;
        java.lang.String str3 = str2 + "-" + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (z17) {
            return str3;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = str == null ? null : com.p314xaae8f345.mm.vfs.z7.a(str);
        if (a17 == null) {
            z7Var = new com.p314xaae8f345.mm.vfs.z7(null, null, com.p314xaae8f345.mm.vfs.e8.l(str3, false, false), null, null);
        } else {
            boolean isEmpty = str3.isEmpty();
            java.lang.String str4 = a17.f294812f;
            if (!isEmpty) {
                str4 = com.p314xaae8f345.mm.vfs.e8.l(str4 + '/' + str3, false, false);
            }
            z7Var = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, str4, a17.f294813g, a17.f294814h);
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
        return m17.a() ? m17.f294799a.F(m17.f294800b) : false ? str3 : str2;
    }

    public java.lang.String b() {
        if (this.f494364h == null) {
            this.f494364h = "";
            try {
                org.json.JSONArray optJSONArray = new org.json.JSONObject(this.f494359c).optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306).optJSONObject("hotwords").optJSONArray("items");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    arrayList.add(android.net.Uri.encode(optJSONArray.optJSONObject(i17).optString("hotword")));
                }
                this.f494364h = android.text.TextUtils.join("|", arrayList);
            } catch (java.lang.Exception unused) {
            }
        }
        return this.f494364h;
    }

    public boolean c() {
        return (this.f494363g || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f494359c) || (java.lang.System.currentTimeMillis() / 1000) - this.f494361e > this.f494360d) ? false : true;
    }

    public void d(java.lang.String str, int i17, int i18) {
        r45.qh4 qh4Var = new r45.qh4();
        java.lang.String a17 = a(str, i17, i18, false);
        if (!a17.equals(a(str, i17, i18, true))) {
            this.f494363g = true;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str, a17);
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(r6Var.o(), 0, (int) r6Var.C());
        if (N != null) {
            try {
                qh4Var.mo11468x92b714fd(N);
                this.f494357a = qh4Var.f465528d;
                this.f494359c = qh4Var.f465529e;
                this.f494360d = qh4Var.f465530f;
                this.f494361e = qh4Var.f465531g;
                this.f494362f = qh4Var.f465532h;
                this.f494358b = qh4Var.f465533i;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BizCacheObj", "load bizCacheFile %s %d", r6Var.o(), java.lang.Integer.valueOf(N.length));
            } catch (java.io.IOException unused) {
            }
        }
    }
}
