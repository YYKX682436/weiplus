package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

/* loaded from: classes12.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f271226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v f271227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271228f;

    public p(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.s sVar, java.util.List list, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar, java.lang.String str) {
        this.f271226d = list;
        this.f271227e = vVar;
        this.f271228f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r18 = this;
            r0 = r18
            java.util.List r1 = r0.f271226d
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La4
            java.lang.Object r2 = r1.next()
            com.tencent.mm.pluginsdk.res.downloader.model.h r2 = (com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.h) r2
            r2.getClass()
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            java.lang.String r2 = "CheckResUpdate"
            com.tencent.mm.pluginsdk.res.downloader.model.v r3 = r0.f271227e
            java.lang.String r4 = r3.f271261f
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L8
            java.lang.String r2 = r0.f271228f
            java.lang.Object[] r4 = new java.lang.Object[]{r2}
            java.lang.String r5 = "MicroMsg.ResDownloader.CheckResUpdateHelper"
            java.lang.String r6 = "networkEventListener.onFailed: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r6, r4)
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.a(r2)
            com.tencent.mm.pluginsdk.res.downloader.model.l0 r4 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a
            com.tencent.mm.pluginsdk.res.downloader.model.n0 r2 = r4.e(r2)
            if (r2 != 0) goto L3f
            goto L8
        L3f:
            r4 = 0
            if (r3 == 0) goto L5f
            java.lang.Exception r3 = r3.f271263h
            if (r3 == 0) goto L5f
            boolean r5 = r3 instanceof n35.a
            if (r5 == 0) goto L52
            long r5 = r2.f68791x44eeb14
            r7 = 7
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(r5, r7)
            goto L5d
        L52:
            boolean r3 = r3 instanceof n35.c
            if (r3 == 0) goto L5f
            long r5 = r2.f68791x44eeb14
            r7 = 16
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(r5, r7)
        L5d:
            r3 = r4
            goto L60
        L5f:
            r3 = 1
        L60:
            if (r3 == 0) goto L69
            long r5 = r2.f68791x44eeb14
            r7 = 11
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(r5, r7)
        L69:
            long r5 = r2.f68791x44eeb14
            r7 = 44
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(r5, r7)
            int r9 = r2.f68792xb5ef19b5
            int r10 = r2.f68796x5334f55
            java.lang.String r11 = r2.f68797x4b6e88aa
            java.lang.String r3 = r2.f68780xf1e133f7
            int r12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r3, r4)
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.d0 r13 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.d0.FAIL
            r14 = 0
            java.lang.String r3 = "NewXml"
            java.lang.String r5 = r2.f68782x3bf12d1d
            boolean r15 = r3.equalsIgnoreCase(r5)
            r16 = 0
            java.lang.String r3 = r2.f68794x9383c60a
            r17 = r3
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.c(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            int r3 = r2.f68792xb5ef19b5
            int r5 = r2.f68796x5334f55
            java.lang.String r6 = r2.f68780xf1e133f7
            int r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r6, r4)
            long r6 = r2.f68791x44eeb14
            int r2 = (int) r6
            r6 = 78
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.e(r3, r5, r4, r2, r6)
            goto L8
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.p.run():void");
    }
}
