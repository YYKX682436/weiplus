package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f166376a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f166377b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f166378c;

    public o3(java.lang.String session, java.util.Collection requestPkgInfoList, yz5.l onProgress) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestPkgInfoList, "requestPkgInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onProgress, "onProgress");
        this.f166376a = onProgress;
        this.f166377b = new java.util.LinkedList(requestPkgInfoList);
        this.f166378c = new java.util.HashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r7 > 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        r10 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f(r11, r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        r11 = a06.d.b((((float) r5) / ((float) r7)) * 100.0f);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 r10, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f r11) {
        /*
            r9 = this;
            java.lang.String r0 = "request"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.String r0 = "progress"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            java.util.LinkedList r0 = r9.f166377b
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L19
            yz5.l r10 = r9.f166376a
            r10.mo146xb9724478(r11)
            return
        L19:
            java.util.HashMap r0 = r9.f166378c
            monitor-enter(r0)
            java.util.HashMap r1 = r9.f166378c     // Catch: java.lang.Throwable -> L75
            r1.put(r10, r11)     // Catch: java.lang.Throwable -> L75
            java.util.HashMap r10 = r9.f166378c     // Catch: java.lang.Throwable -> L75
            java.util.Collection r10 = r10.values()     // Catch: java.lang.Throwable -> L75
            java.lang.String r11 = "<get-values>(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r11)     // Catch: java.lang.Throwable -> L75
            java.lang.Iterable r10 = (java.lang.Iterable) r10     // Catch: java.lang.Throwable -> L75
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L75
            r1 = 0
            r5 = r1
            r7 = r5
        L36:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L75
            if (r11 == 0) goto L55
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L75
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress r11 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f) r11     // Catch: java.lang.Throwable -> L75
            if (r11 == 0) goto L53
            long r3 = r11.f156928e     // Catch: java.lang.Throwable -> L75
            long r3 = java.lang.Math.max(r3, r1)     // Catch: java.lang.Throwable -> L75
            long r5 = r5 + r3
            long r3 = r11.f156929f     // Catch: java.lang.Throwable -> L75
            long r3 = java.lang.Math.max(r3, r1)     // Catch: java.lang.Throwable -> L75
            long r7 = r7 + r3
            goto L36
        L53:
            r10 = 0
            goto L6c
        L55:
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress r10 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress     // Catch: java.lang.Throwable -> L75
            int r11 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r11 > 0) goto L5d
            r11 = 0
            goto L67
        L5d:
            float r11 = (float) r5     // Catch: java.lang.Throwable -> L75
            float r1 = (float) r7     // Catch: java.lang.Throwable -> L75
            float r11 = r11 / r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 * r1
            int r11 = a06.d.b(r11)     // Catch: java.lang.Throwable -> L75
        L67:
            r4 = r11
            r3 = r10
            r3.<init>(r4, r5, r7)     // Catch: java.lang.Throwable -> L75
        L6c:
            monitor-exit(r0)
            if (r10 == 0) goto L74
            yz5.l r11 = r9.f166376a
            r11.mo146xb9724478(r10)
        L74:
            return
        L75:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o3.a(com.tencent.mm.plugin.appbrand.launching.o6, com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress):void");
    }
}
