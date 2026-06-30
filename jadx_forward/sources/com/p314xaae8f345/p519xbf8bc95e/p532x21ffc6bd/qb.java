package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class qb extends android.os.AsyncTask<java.lang.Object, java.lang.Void, java.lang.Void> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f132405a = 10000;

    /* renamed from: b, reason: collision with root package name */
    final android.os.Handler f132406b = new android.os.Handler(android.os.Looper.getMainLooper()) { // from class: com.tencent.mapsdk.internal.qb.1
        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            super.handleMessage(message);
            if (message.what != 10000) {
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb qbVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb.this.f132407c, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb.this.f132408d, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb.this.f132409e, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb.this.f132410f, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb.this.f132412h);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb.this.f132412h.add(qbVar);
            qbVar.execute(new java.lang.Object[0]);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final android.os.Handler f132407c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.String f132408d;

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.String f132409e;

    /* renamed from: f, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.qb.c f132410f;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.mapsdk.internal.qb.b f132411g;

    /* renamed from: h, reason: collision with root package name */
    private final java.util.List<android.os.AsyncTask> f132412h;

    /* renamed from: com.tencent.mapsdk.internal.qb$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass2 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f132414a;

        public AnonymousClass2(org.json.JSONObject jSONObject) {
            this.f132414a = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb.this.f132410f.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb.this.f132411g, this.f132414a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.qb$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass3 implements java.lang.Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb.this.f132410f.c();
        }
    }

    /* loaded from: classes6.dex */
    public enum a {
        NETWORK_ERROR(1000),
        INTERNAL_ERROR(1001);


        /* renamed from: c, reason: collision with root package name */
        public final int f132420c;

        a(int i17) {
            this.f132420c = i17;
        }
    }

    /* loaded from: classes13.dex */
    public static class b implements com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347 {

        /* renamed from: a, reason: collision with root package name */
        public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx f132421a;

        /* renamed from: b, reason: collision with root package name */
        public org.json.JSONArray f132422b;

        /* renamed from: c, reason: collision with root package name */
        public org.json.JSONObject f132423c;

        /* renamed from: d, reason: collision with root package name */
        public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qg f132424d;

        /* renamed from: e, reason: collision with root package name */
        public int f132425e = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa.f132845c;

        /* renamed from: f, reason: collision with root package name */
        public boolean f132426f;

        /* renamed from: g, reason: collision with root package name */
        public org.json.JSONObject f132427g;

        @Override // com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347
        /* renamed from: parse */
        public void mo35867x6581ab3(org.json.JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("cfg");
            this.f132427g = optJSONObject;
            if (optJSONObject != null) {
                this.f132422b = optJSONObject.optJSONObject("custom_map_style").optJSONArray("style_list");
                org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("indoor_map");
                if (optJSONObject2 != null) {
                    int optInt = optJSONObject2.optInt("enable", -1);
                    int optInt2 = optJSONObject2.optInt("type", -1);
                    if (optInt != -1 && optInt2 != -1) {
                        this.f132421a = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx(optInt, optInt2, optJSONObject2.optJSONArray("building_list"));
                    }
                }
                org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("custom_layer");
                if (optJSONObject3 != null) {
                    this.f132424d = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qg) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(optJSONObject3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qg.class, new java.lang.Object[0]);
                }
                org.json.JSONObject optJSONObject4 = optJSONObject.optJSONObject("event_map");
                if (optJSONObject4 != null) {
                    this.f132425e = optJSONObject4.optInt("enable", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa.f132845c);
                }
                this.f132423c = optJSONObject.optJSONObject("data_layer");
                org.json.JSONObject optJSONObject5 = optJSONObject.optJSONObject("l4_render");
                if (optJSONObject5 != null) {
                    this.f132426f = optJSONObject5.optInt("enable", -1) == 1;
                }
            }
        }
    }

    /* loaded from: classes13.dex */
    public interface c extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnAuthResultCallback {
        void a(com.tencent.mapsdk.internal.qb.b bVar, org.json.JSONObject jSONObject);

        void c();
    }

    public qb(android.os.Handler handler, java.lang.String str, java.lang.String str2, com.tencent.mapsdk.internal.qb.c cVar, java.util.List<android.os.AsyncTask> list) {
        this.f132407c = handler;
        this.f132410f = cVar;
        this.f132408d = android.text.TextUtils.isEmpty(str) ? "" : str;
        this.f132409e = android.text.TextUtils.isEmpty(str2) ? "" : str2;
        this.f132412h = list;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ java.lang.Void doInBackground(java.lang.Object[] objArr) {
        this.f132407c.post(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb.AnonymousClass3());
        boolean a17 = a();
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131343i == 2) {
            this.f132406b.sendEmptyMessageDelayed(10000, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        }
        if (a17 || this.f132407c == null) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga gaVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga();
        gaVar.f131086f = 3;
        this.f132407c.sendMessage(this.f132407c.obtainMessage(3, gaVar));
        return null;
    }

    private boolean a() {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dk dkVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dk) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dk.class);
        if (dkVar == null) {
            this.f132410f.mo36922xfa7237e5(com.tencent.mapsdk.internal.qb.a.INTERNAL_ERROR.f132420c, "Native environment not ready");
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cx cxVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cx) dkVar.i();
        java.lang.String a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.a();
        java.lang.String str3 = this.f132408d;
        java.lang.String m17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.m();
        java.lang.String str4 = this.f132409e;
        java.lang.String h17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.h();
        java.lang.String d17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.d();
        int j17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.j();
        java.lang.String k17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.k();
        java.lang.String n17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.n();
        java.lang.String c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.c();
        java.lang.String g17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.g();
        if (android.text.TextUtils.isEmpty(g17)) {
            str = "0";
        } else {
            str = "wifi".equals(g17) ? "2" : "1";
        }
        com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m36684x17b972d0 = cxVar.m36684x17b972d0(a17, str3, m17, str4, h17, d17, j17, k17, n17, c17, str);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131344j = java.util.Calendar.getInstance().get(1);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131345k = java.util.Calendar.getInstance().get(2);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131346l = java.util.Calendar.getInstance().get(5);
        if (m36684x17b972d0 != null) {
            java.lang.String str5 = m36684x17b972d0.f16974x2c0d614c;
            if (m36684x17b972d0.f16979x139cb015 != 0) {
                this.f132410f.mo36922xfa7237e5(com.tencent.mapsdk.internal.qb.a.NETWORK_ERROR.f132420c, "Network resp error[" + m36684x17b972d0.f16979x139cb015 + "]:" + m36684x17b972d0.f16981x584fd04f);
                return false;
            }
            byte[] bArr = m36684x17b972d0.f16977x2eefaa;
            if (bArr != null && bArr.length > 0) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, str5));
                    org.json.JSONObject optJSONObject = jSONObject.optJSONObject("info");
                    if (optJSONObject != null) {
                        i17 = optJSONObject.optInt("error");
                        str2 = optJSONObject.optString("msg");
                    } else {
                        str2 = null;
                        i17 = 0;
                    }
                    if (i17 != 0) {
                        a(i17, str2);
                        if (i17 < -400) {
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131343i = -1;
                        } else {
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131343i = 1;
                        }
                        this.f132410f.mo36922xfa7237e5(i17, str2);
                    } else if (optJSONObject != null) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131343i = 0;
                        this.f132410f.mo36923x833155dc();
                    } else {
                        this.f132410f.mo36922xfa7237e5(com.tencent.mapsdk.internal.qb.a.NETWORK_ERROR.f132420c, "Network environment error");
                    }
                    this.f132411g = (com.tencent.mapsdk.internal.qb.b) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(jSONObject.optJSONObject("detail"), com.tencent.mapsdk.internal.qb.b.class, new java.lang.Object[0]);
                    this.f132407c.post(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb.AnonymousClass2(jSONObject));
                    return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131343i == 0;
                } catch (java.lang.Exception e17) {
                    this.f132410f.mo36922xfa7237e5(com.tencent.mapsdk.internal.qb.a.INTERNAL_ERROR.f132420c, "Internal error exception: " + e17.fillInStackTrace().getMessage());
                    return false;
                }
            }
            this.f132410f.mo36922xfa7237e5(com.tencent.mapsdk.internal.qb.a.NETWORK_ERROR.f132420c, "Network resp data null or 0");
            return false;
        }
        this.f132410f.mo36922xfa7237e5(com.tencent.mapsdk.internal.qb.a.NETWORK_ERROR.f132420c, "Network resp null");
        return false;
    }

    private static java.lang.String b() {
        java.lang.String g17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.g();
        return android.text.TextUtils.isEmpty(g17) ? "0" : "wifi".equals(g17) ? "2" : "1";
    }

    private java.lang.Void c() {
        this.f132407c.post(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb.AnonymousClass3());
        boolean a17 = a();
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131343i == 2) {
            this.f132406b.sendEmptyMessageDelayed(10000, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        }
        if (a17 || this.f132407c == null) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga gaVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga();
        gaVar.f131086f = 3;
        this.f132407c.sendMessage(this.f132407c.obtainMessage(3, gaVar));
        return null;
    }

    private android.os.Handler d() {
        return this.f132406b;
    }

    private void e() {
        if (this.f132407c != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga gaVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga();
            gaVar.f131086f = 3;
            this.f132407c.sendMessage(this.f132407c.obtainMessage(3, gaVar));
        }
    }

    private void b(org.json.JSONObject jSONObject) {
        this.f132411g = (com.tencent.mapsdk.internal.qb.b) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(jSONObject.optJSONObject("detail"), com.tencent.mapsdk.internal.qb.b.class, new java.lang.Object[0]);
        this.f132407c.post(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qb.AnonymousClass2(jSONObject));
    }

    private void a(org.json.JSONObject jSONObject) {
        java.lang.String str;
        int i17;
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("info");
        if (optJSONObject != null) {
            i17 = optJSONObject.optInt("error");
            str = optJSONObject.optString("msg");
        } else {
            str = null;
            i17 = 0;
        }
        if (i17 == 0) {
            if (optJSONObject != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131343i = 0;
                this.f132410f.mo36923x833155dc();
                return;
            } else {
                this.f132410f.mo36922xfa7237e5(com.tencent.mapsdk.internal.qb.a.NETWORK_ERROR.f132420c, "Network environment error");
                return;
            }
        }
        a(i17, str);
        if (i17 < -400) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131343i = -1;
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131343i = 1;
        }
        this.f132410f.mo36922xfa7237e5(i17, str);
    }

    private static void a(int i17, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add("腾讯地图鉴权失败，请访问 lbs.qq.com 检查 key 配置");
        arrayList.add("错误码：".concat(java.lang.String.valueOf(i17)));
        arrayList.add("错误信息：".concat(java.lang.String.valueOf(str)));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
        char[] cArr = new char[81];
        java.util.Arrays.fill(cArr, '*');
        cArr[80] = '\n';
        sb6.append(cArr);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
        }
        sb6.append(cArr);
    }
}
