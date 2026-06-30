package com.tencent.mm.magicbrush.plugin.scl.jsapi.touch;

/* loaded from: classes7.dex */
public final class f extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "setGestureRects";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // lc3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(lc3.a0 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "bizName"
            java.lang.String r0 = r8.optString(r0)
            java.lang.String r1 = "frameSetId"
            java.lang.String r1 = r8.optString(r1)
            java.lang.String r2 = "canvasId"
            int r2 = r8.optInt(r2)
            java.lang.String r3 = "rects"
            java.lang.String r8 = r8.optString(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "bizName:"
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = ",canvasId:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ",frameSetId:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ", rects:"
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.MBJsApiSetGestureRects"
            com.tencent.mars.xlog.Log.i(r4, r3)
            if (r1 == 0) goto L53
            int r3 = r1.length()
            if (r3 != 0) goto L51
            goto L53
        L51:
            r3 = 0
            goto L54
        L53:
            r3 = 1
        L54:
            lc3.z r5 = lc3.x.f317937d
            if (r3 == 0) goto L69
            java.lang.String r8 = "frameSetId is null"
            com.tencent.mars.xlog.Log.e(r4, r8)
            yz5.l r0 = r7.s()
            lc3.a0 r8 = r7.j(r5, r8)
            r0.invoke(r8)
            return
        L69:
            lc3.e r3 = r7.f317890a
            fq0.i r3 = (fq0.i) r3
            r6 = 0
            if (r3 == 0) goto L80
            kotlin.jvm.internal.o.d(r0)
            fq0.c0 r3 = (fq0.c0) r3
            jc3.b0 r3 = r3.f265445e
            if (r3 == 0) goto L80
            rc3.f1 r3 = (rc3.f1) r3
            java.lang.String r0 = r3.d(r0)
            goto L81
        L80:
            r0 = r6
        L81:
            if (r0 == 0) goto L9a
            com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCData r3 = new com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCData
            kotlin.jvm.internal.o.d(r1)
            kotlin.jvm.internal.o.d(r8)
            r3.<init>(r1, r2, r8)
            com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.e r8 = new com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.e
            r8.<init>(r7)
            java.lang.Class<com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.d> r1 = com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.d.class
            com.tencent.mm.ipcinvoker.extension.l.a(r0, r3, r1, r8)
            jz5.f0 r6 = jz5.f0.f302826a
        L9a:
            if (r6 != 0) goto Lac
            java.lang.String r8 = "processName is null"
            com.tencent.mars.xlog.Log.e(r4, r8)
            yz5.l r0 = r7.s()
            lc3.a0 r8 = r7.j(r5, r8)
            r0.invoke(r8)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.f.t(lc3.a0):void");
    }
}
