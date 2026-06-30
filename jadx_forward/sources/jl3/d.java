package jl3;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final b21.r f381745e;

    /* renamed from: f, reason: collision with root package name */
    public final jl3.a f381746f;

    /* renamed from: g, reason: collision with root package name */
    public float f381747g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f381749i;

    /* renamed from: q, reason: collision with root package name */
    public jl3.c f381754q;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381744d = null;

    /* renamed from: h, reason: collision with root package name */
    public long f381748h = 307200;

    /* renamed from: m, reason: collision with root package name */
    public boolean f381750m = true;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f381751n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f381752o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f381753p = 0;

    public d(b21.r rVar, jl3.a aVar) {
        this.f381745e = rVar;
        this.f381746f = aVar;
        if (((aVar.f381735a > 0L ? 1 : (aVar.f381735a == 0L ? 0 : -1)) == 0 && (aVar.f381736b > 0L ? 1 : (aVar.f381736b == 0L ? 0 : -1)) == 0 && aVar.f381737c == 0) && ((aVar.f381738d > 0L ? 1 : (aVar.f381738d == 0L ? 0 : -1)) == 0 && (aVar.f381740f > 0L ? 1 : (aVar.f381740f == 0L ? 0 : -1)) == 0 && aVar.f381739e == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDownloadTask", "downloadInfo is invalid");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicDownloadTask", "downloadInfo is valid");
        }
        this.f381749i = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    public final long[] a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            java.lang.String[] split = str.replace("bytes", "").trim().split("-");
            long longValue = java.lang.Long.valueOf(split[0]).longValue();
            java.lang.String[] split2 = split[1].split("/");
            return new long[]{longValue, java.lang.Long.valueOf(split2[0]).longValue(), java.lang.Long.valueOf(split2[1]).longValue()};
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final java.net.HttpURLConnection b(java.lang.String str, java.util.Map map) {
        boolean z17;
        if (!android.text.TextUtils.isEmpty(this.f381744d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicDownloadTask", "use previous temp redirect URL to download , avoid to request source url and than redirect to 302 resp code");
            str = this.f381744d;
        }
        int i17 = 0;
        java.net.HttpURLConnection httpURLConnection = null;
        while (true) {
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.getInputStream().close();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDownloadTask", e17.getMessage());
                }
                httpURLConnection.disconnect();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicDownloadTask", "getUrlConnect, downloadUrl:%s", str);
            kl3.e l17 = kl3.t.l();
            java.net.URL url = new java.net.URL(str);
            java.lang.String host = url.getHost();
            if (l17 == null || (url = l17.v(str)) == null || str.equalsIgnoreCase(url.toString())) {
                z17 = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicDownloadTask", "getRedirectURL, srcUrl:%s", url.toString());
                z17 = true;
            }
            httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(25000);
            httpURLConnection.setInstanceFollowRedirects(false);
            for (java.util.Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            if (z17 && !android.text.TextUtils.isEmpty(host)) {
                httpURLConnection.setRequestProperty("Host", host);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicDownloadTask", "use host :%s", host);
            }
            int responseCode = httpURLConnection.getResponseCode();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicDownloadTask", "getUrlConnect response:%d, redirectCount:%d", java.lang.Integer.valueOf(responseCode), java.lang.Integer.valueOf(i17));
            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307) {
                if (responseCode != 200 && responseCode != 206) {
                    this.f381744d = null;
                }
                return httpURLConnection;
            }
            f(responseCode);
            java.lang.String requestMethod = httpURLConnection.getRequestMethod();
            if (responseCode == 307 && !requestMethod.equals("GET") && !requestMethod.equals("HEAD")) {
                return httpURLConnection;
            }
            java.lang.String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDownloadTask", "Invalid redirect,  response:%d", java.lang.Integer.valueOf(responseCode));
                return httpURLConnection;
            }
            java.net.URL url2 = new java.net.URL(httpURLConnection.getURL(), headerField);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicDownloadTask", "location:%s", headerField);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicDownloadTask", "tempUrl:%s", url2.toString());
            if (!url2.getProtocol().equals("https") && !url2.getProtocol().equals("http")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDownloadTask", "Unsupported protocol redirect,  response:%d", java.lang.Integer.valueOf(responseCode));
                return httpURLConnection;
            }
            i17++;
            if (i17 > 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicDownloadTask", "Too many redirects: " + i17);
                return httpURLConnection;
            }
            str = url2.toString();
            this.f381744d = str;
        }
    }

    public final void c(long j17) {
        boolean z17 = this.f381749i;
        b21.r rVar = this.f381745e;
        jl3.a aVar = this.f381746f;
        if (z17) {
            aVar.f381738d = j17;
            aVar.f381739e = 1;
            aVar.f381740f = j17;
            gl3.e.e(rVar.f98879e, aVar);
        } else {
            aVar.f381735a = j17;
            aVar.f381737c = 1;
            aVar.f381736b = j17;
            gl3.e.e(rVar.f98879e, aVar);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new jl3.b(this, 2));
    }

    public final void d(int i17) {
        this.f381744d = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new jl3.b(this, i17));
    }

    public final void e(long j17, long j18) {
        boolean z17 = this.f381749i;
        b21.r rVar = this.f381745e;
        jl3.a aVar = this.f381746f;
        if (z17) {
            aVar.f381738d = j17;
            aVar.f381739e = 0;
            aVar.f381740f = j18;
            gl3.e.e(rVar.f98879e, aVar);
        } else {
            aVar.f381735a = j17;
            aVar.f381737c = 0;
            aVar.f381736b = j18;
            gl3.e.e(rVar.f98879e, aVar);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new jl3.b(this, 3));
    }

    public final void f(int i17) {
        kl3.h hVar = (kl3.h) sl3.b.b(kl3.h.class);
        if (hVar != null) {
            ((pl3.e) hVar).f438238c.getClass();
            if (i17 == 300 || i17 == 301 || i17 == 302 || i17 == 303) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c344.m40330x4c144dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.h.f34390x366c91de);
                c4582x424c344.m40331x936762bd(15);
                c4582x424c344.m40332x57b2b64f(1L);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(c4582x424c344);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
            }
        }
    }

    public final void g(long j17, long j18) {
        boolean z17 = this.f381749i;
        jl3.a aVar = this.f381746f;
        if (z17) {
            aVar.f381738d = j17;
            aVar.f381740f = j18;
        } else {
            aVar.f381735a = j17;
            aVar.f381736b = j18;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 10 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 13 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 14 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 16 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 8 */
    @Override // java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instructions count: 5638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jl3.d.run():void");
    }
}
