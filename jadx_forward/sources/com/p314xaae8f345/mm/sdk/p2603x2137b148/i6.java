package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class i6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f274272a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f274273b;

    /* renamed from: c, reason: collision with root package name */
    public final int f274274c;

    /* renamed from: d, reason: collision with root package name */
    public final int f274275d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f274276e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f274277f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Vector f274278g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f274279h;

    public i6(int i17, java.lang.String str, int i18) {
        this(i17, str, i18, android.os.Looper.myLooper());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r6.f274274c > r7.size()) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "QueueWorkerThread.QueueWorkerThread"
            if (r7 != 0) goto Lb
            java.lang.String r7 = "add empty thread object"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r7)
            r7 = -1
            return r7
        Lb:
            r1 = 0
            java.util.concurrent.LinkedBlockingQueue r2 = r6.f274272a
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L3f
            r4 = 1
            boolean r7 = r2.offer(r7, r4, r3)     // Catch: java.lang.Exception -> L3f
            if (r7 != 0) goto L1f
            java.lang.String r7 = "add To Queue failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r7)     // Catch: java.lang.Exception -> L3f
            r7 = -2
            return r7
        L1f:
            java.util.Vector r7 = r6.f274278g
            int r0 = r7.size()
            if (r0 == 0) goto L35
            int r0 = r2.size()
            if (r0 <= 0) goto L3e
            int r7 = r7.size()
            int r0 = r6.f274274c
            if (r0 <= r7) goto L3e
        L35:
            com.tencent.mm.sdk.platformtools.h6 r7 = new com.tencent.mm.sdk.platformtools.h6
            r0 = 0
            r7.<init>(r6, r0)
            r7.start()
        L3e:
            return r1
        L3f:
            r7 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "add To Queue failed :"
            r2.<init>(r3)
            java.lang.String r3 = r7.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r2)
            java.lang.String r2 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r7, r2, r1)
            r7 = -3
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.i6.a(com.tencent.mm.sdk.platformtools.g6):int");
    }

    public i6(int i17, java.lang.String str, int i18, android.os.Looper looper) {
        this.f274272a = new java.util.concurrent.LinkedBlockingQueue();
        this.f274273b = false;
        this.f274274c = 1;
        this.f274275d = 1;
        this.f274276e = "";
        this.f274277f = new byte[0];
        this.f274278g = new java.util.Vector();
        this.f274274c = i18;
        this.f274276e = str;
        this.f274275d = i17;
        if (looper == null && android.os.Looper.getMainLooper() != null) {
            looper = android.os.Looper.getMainLooper();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("QueueWorkerThread.QueueWorkerThread", "looper is null use MainLooper!");
        }
        this.f274279h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.f6(this, looper);
    }
}
