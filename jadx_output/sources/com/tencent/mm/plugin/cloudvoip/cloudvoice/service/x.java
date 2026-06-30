package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y f96126d;

    public x(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y yVar) {
        this.f96126d = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y r0 = r8.f96126d
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a0 r0 = r0.f96131d
            long r1 = r0.f95820d
            r3 = 1
            long r1 = r1 + r3
            r0.f95820d = r1
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 r0 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2 r0 = r0.f96024o
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2 r1 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2.InRoom
            if (r0 != r1) goto Lc9
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y r1 = r8.f96126d
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a0 r1 = r1.f96131d
            java.util.ArrayList r1 = r1.f95817a
            java.util.Iterator r1 = r1.iterator()
        L23:
            boolean r2 = r1.hasNext()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()
            fw1.d r2 = (fw1.d) r2
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 r5 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE
            r5.getClass()
            int r5 = r2.f267069a
            com.tencent.wxmm.v2conference r6 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g0.f95910c
            int r5 = r6.GetVoiceActivity(r5)
            if (r5 <= 0) goto L41
            r3 = r4
        L41:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y r4 = r8.f96126d
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a0 r4 = r4.f96131d
            long r4 = r4.f95820d
            r6 = 5
            long r4 = r4 % r6
            if (r3 == 0) goto L23
            r0.add(r2)
            goto L23
        L50:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r1 = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w
            r1.<init>(r8)
            java.util.Collections.sort(r0, r1)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y r1 = r8.f96126d
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a0 r1 = r1.f96131d
            java.util.ArrayList r2 = r1.f95819c
            if (r2 != 0) goto L61
            goto L8d
        L61:
            int r2 = r0.size()
            java.util.ArrayList r5 = r1.f95819c
            int r5 = r5.size()
            if (r2 == r5) goto L6e
            goto L8e
        L6e:
            r2 = r3
        L6f:
            int r5 = r0.size()
            if (r2 >= r5) goto L8d
            java.lang.Object r5 = r0.get(r2)
            fw1.d r5 = (fw1.d) r5
            int r5 = r5.f267069a
            java.util.ArrayList r6 = r1.f95819c
            java.lang.Object r6 = r6.get(r2)
            fw1.d r6 = (fw1.d) r6
            int r6 = r6.f267069a
            if (r5 == r6) goto L8a
            goto L8e
        L8a:
            int r2 = r2 + 1
            goto L6f
        L8d:
            r3 = r4
        L8e:
            if (r3 != 0) goto Lc2
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y r1 = r8.f96126d
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a0 r1 = r1.f96131d
            java.util.ArrayList r1 = r1.f95821e
            monitor-enter(r1)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y r2 = r8.f96126d     // Catch: java.lang.Throwable -> Lbf
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a0 r2 = r2.f96131d     // Catch: java.lang.Throwable -> Lbf
            java.util.ArrayList r2 = r2.f95821e     // Catch: java.lang.Throwable -> Lbf
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lbf
        La1:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lbf
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lbf
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.z r3 = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.z) r3     // Catch: java.lang.Throwable -> Lbf
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g1 r3 = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g1) r3     // Catch: java.lang.Throwable -> Lbf
            r3.getClass()     // Catch: java.lang.Throwable -> Lbf
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f1 r4 = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f1     // Catch: java.lang.Throwable -> Lbf
            r4.<init>(r3, r0)     // Catch: java.lang.Throwable -> Lbf
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 r3 = r3.f95911a     // Catch: java.lang.Throwable -> Lbf
            r3.n(r4)     // Catch: java.lang.Throwable -> Lbf
            goto La1
        Lbd:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbf
            goto Lc2
        Lbf:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbf
            throw r0
        Lc2:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y r1 = r8.f96126d
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a0 r1 = r1.f96131d
            r1.f95819c = r0
            goto Ld0
        Lc9:
            java.lang.String r0 = "MicroMsg.OpenVoice.OpenVoiceMemberMgr"
            java.lang.String r1 = "hy: not in room, ignore speaker change"
            com.tencent.mars.xlog.Log.w(r0, r1)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.x.run():void");
    }
}
