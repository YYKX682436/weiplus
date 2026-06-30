package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class rp {

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f132778c = "https://confinfo.map.qq.com/confinfo?";

    /* renamed from: a, reason: collision with root package name */
    android.content.Context f132779a;

    /* renamed from: b, reason: collision with root package name */
    java.lang.ref.WeakReference<com.tencent.mapsdk.internal.rp.a> f132780b;

    /* loaded from: classes6.dex */
    public interface a {
        void f();
    }

    /* loaded from: classes13.dex */
    public class b extends android.os.AsyncTask<android.content.Context, java.lang.Void, java.lang.Void> {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
        
            if (r9 != null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
        
            r9.f();
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
        
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00e8, code lost:
        
            if (r9 != null) goto L29;
         */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Void doInBackground(android.content.Context... r9) {
            /*
                r8 = this;
                int r0 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rm.a()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "https://confinfo.map.qq.com/confinfo?apiKey="
                r1.<init>(r2)
                r2 = 0
                if (r9 == 0) goto L1e
                int r3 = r9.length
                if (r3 <= 0) goto L1e
                r9 = r9[r2]
                android.content.Context r9 = r9.getApplicationContext()
                java.lang.String r9 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rp.a(r9)
                r1.append(r9)
            L1e:
                com.tencent.map.tools.net.NetManager r9 = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b()
                com.tencent.map.tools.net.NetRequest$NetRequestBuilder r9 = r9.m35934xdc3ef9b()
                java.lang.String r1 = r1.toString()
                com.tencent.map.tools.net.NetRequest$NetRequestBuilder r9 = r9.url(r1)
                r1 = 3000(0xbb8, float:4.204E-42)
                com.tencent.map.tools.net.NetRequest$NetRequestBuilder r9 = r9.m36012xb1aed541(r1)
                com.tencent.map.tools.net.NetResponse r9 = r9.m35998x180373eb()
                r1 = 1
                r3 = 0
                java.io.InputStream r4 = r9.f16978x4c1d43ca     // Catch: java.lang.Throwable -> Lbf
                byte[] r5 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.b(r4)     // Catch: java.lang.Throwable -> Lc0
                if (r5 == 0) goto L93
                int r6 = r5.length     // Catch: java.lang.Throwable -> Lc0
                if (r6 != 0) goto L46
                goto L93
            L46:
                java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> Lc0
                r6.<init>(r5)     // Catch: java.lang.Throwable -> Lc0
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc0
                r5.<init>(r6)     // Catch: java.lang.Throwable -> Lc0
                java.lang.String r6 = "error"
                r7 = -1
                int r6 = r5.optInt(r6, r7)     // Catch: java.lang.Throwable -> Lc0
                if (r6 != 0) goto L67
                java.lang.String r6 = "info"
                org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch: java.lang.Throwable -> Lc0
                if (r5 == 0) goto L67
                java.lang.String r6 = "scenic"
                int r0 = r5.optInt(r6, r0)     // Catch: java.lang.Throwable -> Lc0
            L67:
                if (r4 == 0) goto L6c
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(r4)
            L6c:
                java.io.InputStream r9 = r9.f16978x4c1d43ca
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(r9)
                int r9 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rm.a()
                if (r0 == r9) goto L78
                r2 = r1
            L78:
                if (r2 == 0) goto Leb
                com.tencent.mapsdk.internal.rp r9 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rp.this
                android.content.Context r9 = r9.f132779a
                if (r9 == 0) goto Leb
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rm.a(r9, r0)
                com.tencent.mapsdk.internal.rp r9 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rp.this
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.rp$a> r9 = r9.f132780b
                java.lang.Object r9 = r9.get()
                com.tencent.mapsdk.internal.rp$a r9 = (com.tencent.mapsdk.internal.rp.a) r9
                if (r9 == 0) goto Leb
            L8f:
                r9.f()
                goto Leb
            L93:
                if (r4 == 0) goto L98
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(r4)
            L98:
                java.io.InputStream r9 = r9.f16978x4c1d43ca
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(r9)
                int r9 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rm.a()
                if (r0 == r9) goto La4
                r2 = r1
            La4:
                if (r2 == 0) goto Lbe
                com.tencent.mapsdk.internal.rp r9 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rp.this
                android.content.Context r9 = r9.f132779a
                if (r9 == 0) goto Lbe
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rm.a(r9, r0)
                com.tencent.mapsdk.internal.rp r9 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rp.this
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.rp$a> r9 = r9.f132780b
                java.lang.Object r9 = r9.get()
                com.tencent.mapsdk.internal.rp$a r9 = (com.tencent.mapsdk.internal.rp.a) r9
                if (r9 == 0) goto Lbe
                r9.f()
            Lbe:
                return r3
            Lbf:
                r4 = r3
            Lc0:
                if (r4 == 0) goto Lc5
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(r4)
            Lc5:
                if (r9 == 0) goto Lcc
                java.io.InputStream r9 = r9.f16978x4c1d43ca
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(r9)
            Lcc:
                int r9 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rm.a()
                if (r0 == r9) goto Ld3
                r2 = r1
            Ld3:
                if (r2 == 0) goto Leb
                com.tencent.mapsdk.internal.rp r9 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rp.this
                android.content.Context r9 = r9.f132779a
                if (r9 == 0) goto Leb
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rm.a(r9, r0)
                com.tencent.mapsdk.internal.rp r9 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rp.this
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.rp$a> r9 = r9.f132780b
                java.lang.Object r9 = r9.get()
                com.tencent.mapsdk.internal.rp$a r9 = (com.tencent.mapsdk.internal.rp.a) r9
                if (r9 == 0) goto Leb
                goto L8f
            Leb:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.rp.b.doInBackground(android.content.Context[]):java.lang.Void");
        }

        public /* synthetic */ b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rp rpVar, byte b17) {
            this();
        }
    }

    public rp(android.content.Context context, com.tencent.mapsdk.internal.rp.a aVar) {
        this.f132779a = context;
        this.f132780b = new java.lang.ref.WeakReference<>(aVar);
    }

    private void a() {
        new com.tencent.mapsdk.internal.rp.b(this, (byte) 0).execute(this.f132779a);
    }

    private static int a(java.lang.String str, int i17) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        return (jSONObject.optInt("error", -1) != 0 || (optJSONObject = jSONObject.optJSONObject("info")) == null) ? i17 : optJSONObject.optInt("scenic", i17);
    }

    private static /* synthetic */ int b(java.lang.String str, int i17) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        return (jSONObject.optInt("error", -1) != 0 || (optJSONObject = jSONObject.optJSONObject("info")) == null) ? i17 : optJSONObject.optInt("scenic", i17);
    }

    public static java.lang.String a(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo;
        android.os.Bundle bundle;
        if (context == null) {
            return "";
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (applicationInfo == null || (bundle = applicationInfo.metaData) == null) ? "" : bundle.getString("TencentMapSDK");
    }
}
