package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes4.dex */
public final class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f267491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f267492f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f267493g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267494h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap[] f267495i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f267496m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f267497n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267498o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267499p;

    public b2(java.lang.String str, int i17, int i18, float f17, java.lang.String str2, java.util.HashMap[] hashMapArr, int i19, java.util.concurrent.atomic.AtomicInteger atomicInteger, nw4.k kVar, nw4.y2 y2Var, long j17) {
        this.f267490d = str;
        this.f267491e = i17;
        this.f267492f = i18;
        this.f267493g = f17;
        this.f267494h = str2;
        this.f267495i = hashMapArr;
        this.f267496m = i19;
        this.f267497n = atomicInteger;
        this.f267498o = kVar;
        this.f267499p = y2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            java.lang.String r0 = r6.f267494h
            java.lang.String r1 = r6.f267490d
            java.lang.String r2 = ""
            int r3 = r6.f267491e     // Catch: java.lang.Exception -> L53
            int r4 = r6.f267492f     // Catch: java.lang.Exception -> L53
            android.graphics.Bitmap r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.N(r1, r3, r4)     // Catch: java.lang.Exception -> L53
            if (r3 == 0) goto L74
            boolean r4 = r3.isRecycled()     // Catch: java.lang.Exception -> L53
            if (r4 != 0) goto L74
            int r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(r1)     // Catch: java.lang.Exception -> L53
            float r1 = (float) r1     // Catch: java.lang.Exception -> L53
            android.graphics.Bitmap r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(r3, r1)     // Catch: java.lang.Exception -> L53
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L53
            r3.<init>()     // Catch: java.lang.Exception -> L53
            float r4 = r6.f267493g     // Catch: java.lang.Exception -> L53
            r5 = 100
            float r5 = (float) r5     // Catch: java.lang.Exception -> L53
            float r4 = r4 * r5
            int r4 = (int) r4     // Catch: java.lang.Exception -> L53
            r5 = 10
            if (r4 >= r5) goto L30
            r4 = r5
        L30:
            r5 = 99
            if (r4 <= r5) goto L35
            r4 = r5
        L35:
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L53
            r1.compress(r5, r4, r3)     // Catch: java.lang.Exception -> L53
            byte[] r4 = r3.toByteArray()     // Catch: java.lang.Exception -> L53
            r5 = 2
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)     // Catch: java.lang.Exception -> L53
            java.lang.String r5 = "encodeToString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)     // Catch: java.lang.Exception -> L53
            r3.close()     // Catch: java.lang.Exception -> L4b
        L4b:
            r1.recycle()     // Catch: java.lang.Exception -> L50
            r2 = r4
            goto L74
        L50:
            r1 = move-exception
            r2 = r4
            goto L54
        L53:
            r1 = move-exception
        L54:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getLocalImgData batch fail for "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = ": %s"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r4 = "MicroMsg.JsApiGetLocalImgData"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r3, r1)
        L74:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r3 = "localId"
            r1.put(r3, r0)
            java.lang.String r0 = "localData"
            r1.put(r0, r2)
            int r0 = r6.f267496m
            java.util.HashMap[] r2 = r6.f267495i
            r2[r0] = r1
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f267497n
            int r0 = r0.decrementAndGet()
            if (r0 != 0) goto Lc6
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r2.length
            r1.<init>(r3)
            int r3 = r2.length
            r4 = 0
        La0:
            if (r4 >= r3) goto Lb1
            r5 = r2[r4]
            if (r5 != 0) goto Lab
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        Lab:
            r1.add(r5)
            int r4 = r4 + 1
            goto La0
        Lb1:
            java.lang.String r2 = "dataList"
            r0.put(r2, r1)
            nw4.k r1 = r6.f267498o
            nw4.g r1 = r1.f422396d
            nw4.y2 r2 = r6.f267499p
            java.lang.String r2 = r2.f422546c
            java.lang.String r3 = "getLocalImgData:ok"
            r1.e(r2, r3, r0)
            java.lang.System.currentTimeMillis()
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.b2.run():void");
    }
}
