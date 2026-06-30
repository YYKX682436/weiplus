package wh1;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {
    public final long A;
    public java.lang.String B;
    public final java.lang.String C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HostIPHint H;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f527459e;

    /* renamed from: f, reason: collision with root package name */
    public final wh1.f f527460f;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f527463i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f527464m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f527465n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f527466o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f527467p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.Map f527468q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.Map f527469r;

    /* renamed from: t, reason: collision with root package name */
    public javax.net.ssl.SSLContext f527471t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.ArrayList f527472u;

    /* renamed from: v, reason: collision with root package name */
    public long f527473v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f527474w;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f527477z;

    /* renamed from: d, reason: collision with root package name */
    public int f527458d = 15;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f527461g = false;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f527462h = false;

    /* renamed from: s, reason: collision with root package name */
    public int f527470s = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;

    /* renamed from: x, reason: collision with root package name */
    public java.net.HttpURLConnection f527475x = null;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f527476y = null;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.HostIPHint hostIPHint, wh1.f fVar) {
        this.f527477z = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = true;
        this.H = null;
        this.f527459e = lVar;
        this.f527464m = str;
        this.f527463i = str2;
        this.f527465n = str3;
        this.f527466o = str4;
        this.f527467p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) ? "application/octet-stream" : str5;
        this.f527460f = fVar;
        this.A = java.lang.System.currentTimeMillis();
        this.C = str6;
        this.f527477z = z17;
        this.D = z18;
        this.E = z19;
        this.F = z27;
        this.G = z28;
        this.H = hostIPHint;
    }

    public void a() {
        this.f527461g = false;
        java.net.HttpURLConnection httpURLConnection = this.f527475x;
        if (httpURLConnection != null) {
            try {
                try {
                    httpURLConnection.getInputStream().close();
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandNetworkUploadWorker", e17, "abortTask IOException", new java.lang.Object[0]);
                }
                this.f527475x.disconnect();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandNetworkUploadWorker", e18, "abortTask Exception", new java.lang.Object[0]);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f527476y)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(this.f527476y);
    }

    public int b() {
        return (int) (java.lang.System.currentTimeMillis() - this.A);
    }

    public java.lang.String c() {
        return this.B;
    }

    public java.lang.String d() {
        return this.f527474w;
    }

    public java.lang.String e() {
        return this.f527464m;
    }

    public final void f(long j17, long j18) {
        if (j17 <= 0 || j18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "reportSpeed len:%d, time:%d return", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        } else {
            ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(436L, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 30 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 31 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 32 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 33 : 34, (long) ((j17 / j18) * 0.9765625d), false);
        }
    }

    public final void g(int i17) {
        ((ch1.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.a.class, true))).c(436L, (i17 < 100 || i17 >= 200) ? 200 == i17 ? 21 : (i17 <= 200 || i17 >= 300) ? 302 == i17 ? 23 : (i17 < 300 || i17 >= 400) ? 404 == i17 ? 25 : (i17 < 400 || i17 >= 500) ? i17 >= 500 ? 27 : 28 : 26 : 24 : 22 : 20, 1L, false);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    public final void h() {
        /*
            Method dump skipped, instructions count: 8418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh1.e.h():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01fb A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0233 A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TRY_ENTER, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x024e A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0347 A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x034e A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03ea A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x042a A[Catch: Exception -> 0x0461, UnsupportedEncodingException -> 0x0463, TryCatch #7 {UnsupportedEncodingException -> 0x0463, Exception -> 0x0461, blocks: (B:71:0x0415, B:75:0x042a, B:77:0x044a), top: B:64:0x03e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023c A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0207 A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh1.e.run():void");
    }
}
