package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class r0 {
    public r0(kotlin.jvm.internal.i iVar) {
    }

    public final synchronized java.lang.String a(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        if (com.tencent.mm.minigame.u0.f69148f.isEmpty()) {
            com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_c411ffeb", com.tencent.shadow.core.common.HostConstants.FRAMEWORK_APPID);
            if (Ui == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WVAFrameworkUDRConfig", "resetCrashInfo framework resource is null");
                return "";
            }
            java.util.LinkedList<com.tencent.wechat.aff.udr.u> linkedList = Ui.f217606x;
            kotlin.jvm.internal.o.d(linkedList);
            for (com.tencent.wechat.aff.udr.u uVar : linkedList) {
                java.util.Map map = com.tencent.mm.minigame.u0.f69148f;
                java.lang.String key2 = uVar.getKey();
                kotlin.jvm.internal.o.f(key2, "getKey(...)");
                java.lang.String value = uVar.getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                map.put(key2, value);
            }
        }
        return java.lang.String.valueOf(((java.util.LinkedHashMap) com.tencent.mm.minigame.u0.f69148f).get(key));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.tencent.mm.minigame.q0
            if (r0 == 0) goto L13
            r0 = r6
            com.tencent.mm.minigame.q0 r0 = (com.tencent.mm.minigame.q0) r0
            int r1 = r0.f69136f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f69136f = r1
            goto L18
        L13:
            com.tencent.mm.minigame.q0 r0 = new com.tencent.mm.minigame.q0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f69134d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f69136f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Class<com.tencent.mm.udr.d0> r6 = com.tencent.mm.udr.d0.class
            i95.m r6 = i95.n0.c(r6)
            com.tencent.mm.udr.d0 r6 = (com.tencent.mm.udr.d0) r6
            r0.f69136f = r3
            fa5.j r6 = (fa5.j) r6
            java.lang.String r2 = "ilinkres_c411ffeb"
            java.lang.String r4 = "framework"
            java.lang.Object r6 = r6.Bi(r2, r4, r3, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            kotlin.jvm.internal.o.d(r6)
            com.tencent.mm.vfs.r6 r6 = (com.tencent.mm.vfs.r6) r6
            com.tencent.mm.vfs.r6 r0 = new com.tencent.mm.vfs.r6
            java.lang.String r6 = r6.o()
            java.lang.String r1 = "unzip"
            r0.<init>(r6, r1)
            java.lang.String r6 = r0.o()
            java.lang.String r0 = "getAbsolutePath(...)"
            kotlin.jvm.internal.o.f(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.minigame.r0.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
