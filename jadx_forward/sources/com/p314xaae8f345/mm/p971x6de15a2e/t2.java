package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes7.dex */
public final class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f153675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153676f;

    public t2(java.lang.String str, int i17, java.lang.String str2) {
        this.f153674d = str;
        this.f153675e = i17;
        this.f153676f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = r1.f153674d
            int r3 = r1.f153675e
            java.util.concurrent.atomic.AtomicInteger r0 = com.p314xaae8f345.mm.p971x6de15a2e.u2.f153682a
            r0.incrementAndGet()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 0
            r7 = 0
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            java.lang.String r8 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r8)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            r8 = r0
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            java.lang.String r0 = "GET"
            r8.setRequestMethod(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L42
            int r0 = r3 * 1000
            r8.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L42
            int r0 = r3 * 1000
            r8.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L42
            r8.setUseCaches(r6)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L42
            int r0 = r8.getResponseCode()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L42
            r8.disconnect()
            java.lang.String r7 = ""
            goto L59
        L3e:
            r0 = move-exception
            r7 = r8
            goto Le0
        L42:
            r0 = move-exception
            r7 = r8
            goto L49
        L45:
            r0 = move-exception
            goto Le0
        L48:
            r0 = move-exception
        L49:
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch: java.lang.Throwable -> L45
            java.lang.String r8 = "getLocalizedMessage(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r8)     // Catch: java.lang.Throwable -> L45
            if (r7 == 0) goto L57
            r7.disconnect()
        L57:
            r7 = r0
            r0 = r6
        L59:
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r4
            android.content.Context r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            boolean r4 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(r4)
            java.lang.String r10 = r1.f153676f
            java.lang.String r11 = ","
            java.lang.String r12 = ";"
            r13 = 0
            r14 = 4
            r15 = 0
            java.lang.String r5 = r26.i0.v(r10, r11, r12, r13, r14, r15)
            java.lang.String r10 = ","
            java.lang.String r11 = ";"
            java.lang.String r7 = r26.i0.t(r7, r10, r11, r6)
            int r10 = r7.length()
            if (r10 != 0) goto L81
            r10 = 1
            goto L82
        L81:
            r10 = r6
        L82:
            if (r10 == 0) goto L85
            goto L86
        L85:
            r6 = -1
        L86:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            r5 = 44
            r10.append(r5)
            r10.append(r2)
            r10.append(r5)
            r10.append(r3)
            r10.append(r5)
            r10.append(r6)
            r10.append(r5)
            r10.append(r7)
            r10.append(r5)
            r10.append(r0)
            r10.append(r5)
            r10.append(r8)
            java.lang.String r0 = ",HTTP,"
            r10.append(r0)
            r10.append(r4)
            java.lang.String r0 = r10.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "http check result:"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MMNetCheck"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            jx3.f r2 = jx3.f.INSTANCE
            r3 = 26167(0x6637, float:3.6668E-41)
            r2.mo68478xbd3cda5f(r3, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = com.p314xaae8f345.mm.p971x6de15a2e.u2.f153682a
            r0.decrementAndGet()
            return
        Le0:
            if (r7 == 0) goto Le5
            r7.disconnect()
        Le5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p971x6de15a2e.t2.run():void");
    }
}
