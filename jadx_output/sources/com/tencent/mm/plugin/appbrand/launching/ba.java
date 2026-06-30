package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/ba;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/plugin/appbrand/launching/ModularizingPkgBatchLoadTransaction$IPCCallArgs;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class ba implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallArgs, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x001d A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:9:0x0008, B:11:0x000d, B:19:0x001d, B:22:0x0048, B:23:0x0053, B:25:0x0059, B:27:0x0089, B:28:0x008f, B:30:0x0095, B:32:0x009f), top: B:8:0x0008 }] */
    @Override // com.tencent.mm.ipcinvoker.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.Object r14, com.tencent.mm.ipcinvoker.r r15) {
        /*
            r13 = this;
            com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallArgs r14 = (com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallArgs) r14
            if (r14 != 0) goto L8
            if (r15 == 0) goto La7
            goto La4
        L8:
            java.util.List r0 = r14.f84443s     // Catch: java.lang.Throwable -> La8
            r1 = 1
            if (r0 == 0) goto L16
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> La8
            if (r2 == 0) goto L14
            goto L16
        L14:
            r2 = 0
            goto L17
        L16:
            r2 = r1
        L17:
            if (r2 == 0) goto L1d
            if (r15 == 0) goto La7
            goto La4
        L1d:
            u65.a r9 = new u65.a     // Catch: java.lang.Throwable -> La8
            int r2 = r0.size()     // Catch: java.lang.Throwable -> La8
            com.tencent.mm.plugin.appbrand.launching.aa r3 = new com.tencent.mm.plugin.appbrand.launching.aa     // Catch: java.lang.Throwable -> La8
            r3.<init>(r14)     // Catch: java.lang.Throwable -> La8
            r9.<init>(r2, r3)     // Catch: java.lang.Throwable -> La8
            com.tencent.mm.plugin.appbrand.launching.ta r10 = new com.tencent.mm.plugin.appbrand.launching.ta     // Catch: java.lang.Throwable -> La8
            r10.<init>()     // Catch: java.lang.Throwable -> La8
            com.tencent.mm.plugin.appbrand.launching.t9 r11 = new com.tencent.mm.plugin.appbrand.launching.t9     // Catch: java.lang.Throwable -> La8
            r45.y50 r2 = new r45.y50     // Catch: java.lang.Throwable -> La8
            r2.<init>()     // Catch: java.lang.Throwable -> La8
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r3 = r14.f84462p     // Catch: java.lang.Throwable -> La8
            int r3 = r3.f88138h     // Catch: java.lang.Throwable -> La8
            r2.f390797d = r3     // Catch: java.lang.Throwable -> La8
            boolean r3 = r14.f84463q     // Catch: java.lang.Throwable -> La8
            r2.f390798e = r3     // Catch: java.lang.Throwable -> La8
            boolean r3 = r14.f84464r     // Catch: java.lang.Throwable -> La8
            if (r3 == 0) goto L46
            goto L48
        L46:
            r1 = 101(0x65, float:1.42E-43)
        L48:
            r2.f390799f = r1     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = r14.f84444t     // Catch: java.lang.Throwable -> La8
            r11.<init>(r2, r1)     // Catch: java.lang.Throwable -> La8
            java.util.Iterator r12 = r0.iterator()     // Catch: java.lang.Throwable -> La8
        L53:
            boolean r0 = r12.hasNext()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L89
            java.lang.Object r0 = r12.next()     // Catch: java.lang.Throwable -> La8
            com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallModuleItem r0 = (com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallModuleItem) r0     // Catch: java.lang.Throwable -> La8
            java.lang.String r1 = r0.f84445d     // Catch: java.lang.Throwable -> La8
            com.tencent.luggage.sdk.launching.h r0 = r0.f84446e     // Catch: java.lang.Throwable -> La8
            int r2 = com.tencent.mm.plugin.appbrand.launching.ka.f84720a     // Catch: java.lang.Throwable -> La8
            com.tencent.mm.plugin.appbrand.launching.ga r2 = com.tencent.mm.plugin.appbrand.launching.ga.f84629a     // Catch: java.lang.Throwable -> La8
            com.tencent.mm.plugin.appbrand.launching.u3 r3 = com.tencent.mm.plugin.appbrand.launching.u3.f85212a     // Catch: java.lang.Throwable -> La8
            java.util.List r4 = kz5.b0.c(r1)     // Catch: java.lang.Throwable -> La8
            com.tencent.mm.plugin.appbrand.launching.x9 r5 = new com.tencent.mm.plugin.appbrand.launching.x9     // Catch: java.lang.Throwable -> La8
            r5.<init>(r0, r9)     // Catch: java.lang.Throwable -> La8
            com.tencent.mm.plugin.appbrand.launching.y9 r6 = new com.tencent.mm.plugin.appbrand.launching.y9     // Catch: java.lang.Throwable -> La8
            r6.<init>(r0)     // Catch: java.lang.Throwable -> La8
            com.tencent.mm.plugin.appbrand.launching.z9 r7 = new com.tencent.mm.plugin.appbrand.launching.z9     // Catch: java.lang.Throwable -> La8
            r7.<init>(r0, r14, r9)     // Catch: java.lang.Throwable -> La8
            r0 = r2
            r1 = r3
            r2 = r14
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r8 = r11
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La8
            goto L53
        L89:
            java.util.LinkedList r14 = r10.f85166d     // Catch: java.lang.Throwable -> La8
            java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> La8
        L8f:
            boolean r0 = r14.hasNext()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r14.next()     // Catch: java.lang.Throwable -> La8
            wu5.c r0 = (wu5.c) r0     // Catch: java.lang.Throwable -> La8
            r0.get()     // Catch: java.lang.Throwable -> La8
            goto L8f
        L9f:
            r11.b()     // Catch: java.lang.Throwable -> La8
            if (r15 == 0) goto La7
        La4:
            uk0.a.a(r15)
        La7:
            return
        La8:
            r14 = move-exception
            if (r15 == 0) goto Lae
            uk0.a.a(r15)
        Lae:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.ba.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.r):void");
    }
}
