package xd;

/* loaded from: classes7.dex */
public class b extends xd.h {

    /* renamed from: a, reason: collision with root package name */
    public int f535141a;

    /* renamed from: b, reason: collision with root package name */
    public int f535142b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535143c;

    /* renamed from: d, reason: collision with root package name */
    public final xd.f f535144d;

    public b(xd.f fVar) {
        super(fVar);
        uh1.a aVar;
        uh1.a aVar2;
        uh1.a aVar3;
        this.f535141a = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        this.f535142b = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        this.f535144d = fVar;
        wd.e eVar = (wd.e) fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) eVar.f526216a.get();
        int i17 = 0;
        int i18 = (c11510xdd90c2f2 == null || (aVar = (uh1.a) c11510xdd90c2f2.b(uh1.a.class)) == null) ? 0 : aVar.f509277h;
        java.lang.ref.WeakReference weakReference = eVar.f526216a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) weakReference.get();
        if (c11510xdd90c2f22 != null && (aVar3 = (uh1.a) c11510xdd90c2f22.b(uh1.a.class)) != null) {
            i17 = aVar3.f509277h;
        }
        if (i18 > 0 && i17 > 0) {
            this.f535141a = i18;
            this.f535142b = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandImageHttpFetcher", "Http Timeout Set: connection[%d] read[%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f23 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) weakReference.get();
        this.f535143c = (c11510xdd90c2f23 == null || (aVar2 = (uh1.a) c11510xdd90c2f23.b(uh1.a.class)) == null) ? "" : aVar2.B;
    }

    @Override // h8.c
    public java.lang.String a() {
        return "http";
    }

    @Override // h8.c
    /* renamed from: accept */
    public boolean mo127722xab27b508(java.lang.Object obj) {
        if (!(obj instanceof java.lang.String)) {
            return false;
        }
        java.lang.String str = (java.lang.String) obj;
        return str.startsWith("http://") || str.startsWith("https://");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(5:5|(3:7|(2:10|(1:12)(2:13|(1:15)))|9)|(3:17|(2:19|(1:21)(2:22|(1:24)))|25)|26|(6:28|29|30|(2:34|35)|37|38))(1:44))|45|29|30|(3:32|34|35)|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppBrandImageHttpFetcher", "ImageFetch Timeout! path[%s] connectionTimeout[%d] readTimeout[%d] error[%s]", r9, java.lang.Integer.valueOf(r8.f535141a), java.lang.Integer.valueOf(r8.f535142b), r10.toString());
        r1.f361045b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a1a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppBrandImageHttpFetcher", "fetch error. path = [%s], error = [%s]", r9, r10.toString());
        r1.f361045b = java.lang.String.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a19), r10.toString());
     */
    @Override // h8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h8.b b(java.lang.Object r9, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab r10) {
        /*
            r8 = this;
            java.lang.String r0 = "AppBrandImageHttpFetcher"
            h8.b r1 = new h8.b
            r1.<init>()
            com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r2 = r10.f5279x6c8843fe
            xd.f r3 = r8.f535144d
            wd.e r3 = (wd.e) r3
            java.lang.ref.WeakReference r3 = r3.f526216a
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) r3
            r4 = 0
            if (r3 == 0) goto L6d
            java.lang.Class<sd1.a> r5 = sd1.a.class
            nd.b r5 = nd.f.a(r5)
            sd1.a r5 = (sd1.a) r5
            if (r5 == 0) goto L66
            com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r6 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab.ReferrerPolicy.NOT_SET
            if (r2 != r6) goto L42
            com.tencent.mm.plugin.appbrand.e9 r2 = r3.C0()
            r7 = r5
            com.tencent.mm.plugin.appbrand.utils.p5 r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p5) r7
            sd1.c r2 = r7.b(r2)
            if (r2 != 0) goto L35
        L33:
            r2 = r6
            goto L42
        L35:
            sd1.c r7 = sd1.c.f488210e
            if (r2 != r7) goto L3c
            com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r2 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab.ReferrerPolicy.NO_REFERRER
            goto L42
        L3c:
            sd1.c r7 = sd1.c.f488209d
            if (r2 != r7) goto L33
            com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r2 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab.ReferrerPolicy.ORIGIN
        L42:
            if (r2 != r6) goto L57
            sd1.c r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p5.f172063e
            if (r2 != 0) goto L49
            goto L56
        L49:
            sd1.c r7 = sd1.c.f488210e
            if (r2 != r7) goto L50
            com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r6 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab.ReferrerPolicy.NO_REFERRER
            goto L56
        L50:
            sd1.c r7 = sd1.c.f488209d
            if (r2 != r7) goto L56
            com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r6 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab.ReferrerPolicy.ORIGIN
        L56:
            r2 = r6
        L57:
            com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r6 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab.ReferrerPolicy.ORIGIN
            if (r2 != r6) goto L6d
            com.tencent.mm.plugin.appbrand.e9 r2 = r3.C0()
            com.tencent.mm.plugin.appbrand.utils.p5 r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p5) r5
            java.lang.String r2 = r5.e(r2)
            goto L6e
        L66:
            java.lang.String r2 = "MicroMsg.ImageFetcherConfigImp"
            java.lang.String r3 = "referrer helper is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r3)
        L6d:
            r2 = r4
        L6e:
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L8a java.net.SocketTimeoutException -> Lb0
            java.net.HttpURLConnection r10 = r8.c(r3, r2, r10, r1)     // Catch: java.lang.Exception -> L8a java.net.SocketTimeoutException -> Lb0
            if (r10 == 0) goto Ld5
            java.lang.String r2 = r1.f361045b     // Catch: java.lang.Exception -> L8a java.net.SocketTimeoutException -> Lb0
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L8a java.net.SocketTimeoutException -> Lb0
            if (r2 == 0) goto Ld5
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L8a java.net.SocketTimeoutException -> Lb0
            java.io.InputStream r10 = r10.getInputStream()     // Catch: java.lang.Exception -> L8a java.net.SocketTimeoutException -> Lb0
            r2.<init>(r10)     // Catch: java.lang.Exception -> L8a java.net.SocketTimeoutException -> Lb0
            r4 = r2
            goto Ld5
        L8a:
            r10 = move-exception
            java.lang.String r2 = r10.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r2}
            java.lang.String r2 = "fetch error. path = [%s], error = [%s]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r2, r9)
            android.content.Context r9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r0 = 2131756424(0x7f100588, float:1.9143755E38)
            java.lang.String r9 = r9.getString(r0)
            java.lang.String r10 = r10.toString()
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r9 = java.lang.String.format(r9, r10)
            r1.f361045b = r9
            goto Ld5
        Lb0:
            r10 = move-exception
            int r2 = r8.f535141a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.f535142b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r10 = r10.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r2, r3, r10}
            java.lang.String r10 = "ImageFetch Timeout! path[%s] connectionTimeout[%d] readTimeout[%d] error[%s]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r10, r9)
            android.content.Context r9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r10 = 2131756426(0x7f10058a, float:1.914376E38)
            java.lang.String r9 = r9.getString(r10)
            r1.f361045b = r9
        Ld5:
            r1.f361044a = r4
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.b.b(java.lang.Object, com.github.henryye.nativeiv.ImageDecodeConfig):h8.b");
    }

    public final java.net.HttpURLConnection c(java.lang.String str, java.lang.String str2, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.C1592x888963ab c1592x888963ab, h8.b bVar) {
        int i17 = 0;
        while (true) {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            if (c1592x888963ab != null && !android.text.TextUtils.isEmpty(str2)) {
                httpURLConnection.addRequestProperty("Referer", str2);
            }
            httpURLConnection.setRequestProperty("User-Agent", this.f535143c);
            httpURLConnection.setReadTimeout(this.f535142b);
            httpURLConnection.setConnectTimeout(this.f535141a);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 301 && responseCode != 302) {
                if (responseCode < 200 || responseCode >= 300) {
                    bVar.f361045b = java.lang.String.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a18), java.lang.Integer.valueOf(responseCode));
                }
                return httpURLConnection;
            }
            java.lang.String headerField = httpURLConnection.getHeaderField(ya.b.f77489x9ff58fb5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandImageHttpFetcher", "redirect from[%s] to[%s]", str, headerField);
            httpURLConnection.disconnect();
            if (headerField == null) {
                return null;
            }
            int i18 = i17 + 1;
            if (i17 >= 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppBrandImageHttpFetcher", "too much redirection!");
                bVar.f361045b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a1_);
                return null;
            }
            i17 = i18;
            str = headerField;
        }
    }
}
