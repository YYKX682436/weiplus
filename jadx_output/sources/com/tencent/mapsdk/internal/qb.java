package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qb extends android.os.AsyncTask<java.lang.Object, java.lang.Void, java.lang.Void> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f50872a = 10000;

    /* renamed from: b, reason: collision with root package name */
    final android.os.Handler f50873b = new android.os.Handler(android.os.Looper.getMainLooper()) { // from class: com.tencent.mapsdk.internal.qb.1
        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            super.handleMessage(message);
            if (message.what != 10000) {
                return;
            }
            com.tencent.mapsdk.internal.qb qbVar = new com.tencent.mapsdk.internal.qb(com.tencent.mapsdk.internal.qb.this.f50874c, com.tencent.mapsdk.internal.qb.this.f50875d, com.tencent.mapsdk.internal.qb.this.f50876e, com.tencent.mapsdk.internal.qb.this.f50877f, com.tencent.mapsdk.internal.qb.this.f50879h);
            com.tencent.mapsdk.internal.qb.this.f50879h.add(qbVar);
            qbVar.execute(new java.lang.Object[0]);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final android.os.Handler f50874c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.String f50875d;

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.String f50876e;

    /* renamed from: f, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.qb.c f50877f;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.mapsdk.internal.qb.b f50878g;

    /* renamed from: h, reason: collision with root package name */
    private final java.util.List<android.os.AsyncTask> f50879h;

    /* renamed from: com.tencent.mapsdk.internal.qb$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass2 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f50881a;

        public AnonymousClass2(org.json.JSONObject jSONObject) {
            this.f50881a = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.internal.qb.this.f50877f.a(com.tencent.mapsdk.internal.qb.this.f50878g, this.f50881a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.qb$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass3 implements java.lang.Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.internal.qb.this.f50877f.c();
        }
    }

    /* loaded from: classes6.dex */
    public enum a {
        NETWORK_ERROR(1000),
        INTERNAL_ERROR(1001);


        /* renamed from: c, reason: collision with root package name */
        public final int f50887c;

        a(int i17) {
            this.f50887c = i17;
        }
    }

    /* loaded from: classes13.dex */
    public static class b implements com.tencent.map.tools.json.JsonParser {

        /* renamed from: a, reason: collision with root package name */
        public com.tencent.mapsdk.internal.fx f50888a;

        /* renamed from: b, reason: collision with root package name */
        public org.json.JSONArray f50889b;

        /* renamed from: c, reason: collision with root package name */
        public org.json.JSONObject f50890c;

        /* renamed from: d, reason: collision with root package name */
        public com.tencent.mapsdk.internal.qg f50891d;

        /* renamed from: e, reason: collision with root package name */
        public int f50892e = com.tencent.mapsdk.internal.sa.f51312c;

        /* renamed from: f, reason: collision with root package name */
        public boolean f50893f;

        /* renamed from: g, reason: collision with root package name */
        public org.json.JSONObject f50894g;

        @Override // com.tencent.map.tools.json.JsonParser
        public void parse(org.json.JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("cfg");
            this.f50894g = optJSONObject;
            if (optJSONObject != null) {
                this.f50889b = optJSONObject.optJSONObject("custom_map_style").optJSONArray("style_list");
                org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("indoor_map");
                if (optJSONObject2 != null) {
                    int optInt = optJSONObject2.optInt("enable", -1);
                    int optInt2 = optJSONObject2.optInt("type", -1);
                    if (optInt != -1 && optInt2 != -1) {
                        this.f50888a = new com.tencent.mapsdk.internal.fx(optInt, optInt2, optJSONObject2.optJSONArray("building_list"));
                    }
                }
                org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("custom_layer");
                if (optJSONObject3 != null) {
                    this.f50891d = (com.tencent.mapsdk.internal.qg) com.tencent.map.tools.json.JsonUtils.parseToModel(optJSONObject3, com.tencent.mapsdk.internal.qg.class, new java.lang.Object[0]);
                }
                org.json.JSONObject optJSONObject4 = optJSONObject.optJSONObject("event_map");
                if (optJSONObject4 != null) {
                    this.f50892e = optJSONObject4.optInt("enable", com.tencent.mapsdk.internal.sa.f51312c);
                }
                this.f50890c = optJSONObject.optJSONObject("data_layer");
                org.json.JSONObject optJSONObject5 = optJSONObject.optJSONObject("l4_render");
                if (optJSONObject5 != null) {
                    this.f50893f = optJSONObject5.optInt("enable", -1) == 1;
                }
            }
        }
    }

    /* loaded from: classes13.dex */
    public interface c extends com.tencent.tencentmap.mapsdk.maps.TencentMap.OnAuthResultCallback {
        void a(com.tencent.mapsdk.internal.qb.b bVar, org.json.JSONObject jSONObject);

        void c();
    }

    public qb(android.os.Handler handler, java.lang.String str, java.lang.String str2, com.tencent.mapsdk.internal.qb.c cVar, java.util.List<android.os.AsyncTask> list) {
        this.f50874c = handler;
        this.f50877f = cVar;
        this.f50875d = android.text.TextUtils.isEmpty(str) ? "" : str;
        this.f50876e = android.text.TextUtils.isEmpty(str2) ? "" : str2;
        this.f50879h = list;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ java.lang.Void doInBackground(java.lang.Object[] objArr) {
        this.f50874c.post(new com.tencent.mapsdk.internal.qb.AnonymousClass3());
        boolean a17 = a();
        if (com.tencent.mapsdk.internal.hn.f49810i == 2) {
            this.f50873b.sendEmptyMessageDelayed(10000, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        }
        if (a17 || this.f50874c == null) {
            return null;
        }
        com.tencent.mapsdk.internal.ga gaVar = new com.tencent.mapsdk.internal.ga();
        gaVar.f49553f = 3;
        this.f50874c.sendMessage(this.f50874c.obtainMessage(3, gaVar));
        return null;
    }

    private boolean a() {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        com.tencent.mapsdk.internal.dk dkVar = (com.tencent.mapsdk.internal.dk) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dk.class);
        if (dkVar == null) {
            this.f50877f.onAuthFail(com.tencent.mapsdk.internal.qb.a.INTERNAL_ERROR.f50887c, "Native environment not ready");
            return false;
        }
        com.tencent.mapsdk.internal.cx cxVar = (com.tencent.mapsdk.internal.cx) dkVar.i();
        java.lang.String a17 = com.tencent.mapsdk.internal.hn.a();
        java.lang.String str3 = this.f50875d;
        java.lang.String m17 = com.tencent.mapsdk.internal.hn.m();
        java.lang.String str4 = this.f50876e;
        java.lang.String h17 = com.tencent.mapsdk.internal.hn.h();
        java.lang.String d17 = com.tencent.mapsdk.internal.hn.d();
        int j17 = com.tencent.mapsdk.internal.hn.j();
        java.lang.String k17 = com.tencent.mapsdk.internal.hn.k();
        java.lang.String n17 = com.tencent.mapsdk.internal.hn.n();
        java.lang.String c17 = com.tencent.mapsdk.internal.hn.c();
        java.lang.String g17 = com.tencent.mapsdk.internal.hn.g();
        if (android.text.TextUtils.isEmpty(g17)) {
            str = "0";
        } else {
            str = "wifi".equals(g17) ? "2" : "1";
        }
        com.tencent.map.tools.net.NetResponse checkAuth = cxVar.checkAuth(a17, str3, m17, str4, h17, d17, j17, k17, n17, c17, str);
        com.tencent.mapsdk.internal.hn.f49811j = java.util.Calendar.getInstance().get(1);
        com.tencent.mapsdk.internal.hn.f49812k = java.util.Calendar.getInstance().get(2);
        com.tencent.mapsdk.internal.hn.f49813l = java.util.Calendar.getInstance().get(5);
        if (checkAuth != null) {
            java.lang.String str5 = checkAuth.charset;
            if (checkAuth.errorCode != 0) {
                this.f50877f.onAuthFail(com.tencent.mapsdk.internal.qb.a.NETWORK_ERROR.f50887c, "Network resp error[" + checkAuth.errorCode + "]:" + checkAuth.exception);
                return false;
            }
            byte[] bArr = checkAuth.data;
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
                            com.tencent.mapsdk.internal.hn.f49810i = -1;
                        } else {
                            com.tencent.mapsdk.internal.hn.f49810i = 1;
                        }
                        this.f50877f.onAuthFail(i17, str2);
                    } else if (optJSONObject != null) {
                        com.tencent.mapsdk.internal.hn.f49810i = 0;
                        this.f50877f.onAuthSuccess();
                    } else {
                        this.f50877f.onAuthFail(com.tencent.mapsdk.internal.qb.a.NETWORK_ERROR.f50887c, "Network environment error");
                    }
                    this.f50878g = (com.tencent.mapsdk.internal.qb.b) com.tencent.map.tools.json.JsonUtils.parseToModel(jSONObject.optJSONObject("detail"), com.tencent.mapsdk.internal.qb.b.class, new java.lang.Object[0]);
                    this.f50874c.post(new com.tencent.mapsdk.internal.qb.AnonymousClass2(jSONObject));
                    return com.tencent.mapsdk.internal.hn.f49810i == 0;
                } catch (java.lang.Exception e17) {
                    this.f50877f.onAuthFail(com.tencent.mapsdk.internal.qb.a.INTERNAL_ERROR.f50887c, "Internal error exception: " + e17.fillInStackTrace().getMessage());
                    return false;
                }
            }
            this.f50877f.onAuthFail(com.tencent.mapsdk.internal.qb.a.NETWORK_ERROR.f50887c, "Network resp data null or 0");
            return false;
        }
        this.f50877f.onAuthFail(com.tencent.mapsdk.internal.qb.a.NETWORK_ERROR.f50887c, "Network resp null");
        return false;
    }

    private static java.lang.String b() {
        java.lang.String g17 = com.tencent.mapsdk.internal.hn.g();
        return android.text.TextUtils.isEmpty(g17) ? "0" : "wifi".equals(g17) ? "2" : "1";
    }

    private java.lang.Void c() {
        this.f50874c.post(new com.tencent.mapsdk.internal.qb.AnonymousClass3());
        boolean a17 = a();
        if (com.tencent.mapsdk.internal.hn.f49810i == 2) {
            this.f50873b.sendEmptyMessageDelayed(10000, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        }
        if (a17 || this.f50874c == null) {
            return null;
        }
        com.tencent.mapsdk.internal.ga gaVar = new com.tencent.mapsdk.internal.ga();
        gaVar.f49553f = 3;
        this.f50874c.sendMessage(this.f50874c.obtainMessage(3, gaVar));
        return null;
    }

    private android.os.Handler d() {
        return this.f50873b;
    }

    private void e() {
        if (this.f50874c != null) {
            com.tencent.mapsdk.internal.ga gaVar = new com.tencent.mapsdk.internal.ga();
            gaVar.f49553f = 3;
            this.f50874c.sendMessage(this.f50874c.obtainMessage(3, gaVar));
        }
    }

    private void b(org.json.JSONObject jSONObject) {
        this.f50878g = (com.tencent.mapsdk.internal.qb.b) com.tencent.map.tools.json.JsonUtils.parseToModel(jSONObject.optJSONObject("detail"), com.tencent.mapsdk.internal.qb.b.class, new java.lang.Object[0]);
        this.f50874c.post(new com.tencent.mapsdk.internal.qb.AnonymousClass2(jSONObject));
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
                com.tencent.mapsdk.internal.hn.f49810i = 0;
                this.f50877f.onAuthSuccess();
                return;
            } else {
                this.f50877f.onAuthFail(com.tencent.mapsdk.internal.qb.a.NETWORK_ERROR.f50887c, "Network environment error");
                return;
            }
        }
        a(i17, str);
        if (i17 < -400) {
            com.tencent.mapsdk.internal.hn.f49810i = -1;
        } else {
            com.tencent.mapsdk.internal.hn.f49810i = 1;
        }
        this.f50877f.onAuthFail(i17, str);
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
