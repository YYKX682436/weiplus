package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class o5 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.tencent.mm.plugin.appbrand.jsapi.l r6, java.lang.String r7, java.lang.String r8, int r9, com.tencent.mm.plugin.appbrand.utils.q2 r10) {
        /*
            java.lang.String r0 = "component"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.String r0 = "pathResolveListener"
            kotlin.jvm.internal.o.g(r10, r0)
            r0 = r9 & 1
            r1 = 0
            r2 = 1
            if (r2 != r0) goto L17
            r0 = r2
            goto L18
        L17:
            r0 = r1
        L18:
            java.lang.String r3 = "https://"
            java.lang.String r4 = "http://"
            if (r0 == 0) goto L2a
            boolean r0 = r26.i0.y(r7, r4, r1)
            if (r0 != 0) goto L46
            boolean r0 = r26.i0.y(r7, r3, r1)
            if (r0 != 0) goto L46
        L2a:
            r0 = r9 & 2
            r5 = 2
            if (r5 != r0) goto L31
            r0 = r2
            goto L32
        L31:
            r0 = r1
        L32:
            if (r0 == 0) goto L3d
            java.lang.String r0 = "wxfile://"
            boolean r0 = r26.i0.y(r7, r0, r1)
            if (r0 != 0) goto L46
        L3d:
            r0 = 4
            r9 = r9 & r0
            if (r0 != r9) goto L43
            r9 = r2
            goto L44
        L43:
            r9 = r1
        L44:
            if (r9 == 0) goto L48
        L46:
            r9 = r2
            goto L49
        L48:
            r9 = r1
        L49:
            r0 = 0
            if (r9 != 0) goto L50
            r10.a(r0, r1)
            return
        L50:
            boolean r9 = r26.i0.y(r7, r4, r1)
            if (r9 != 0) goto La2
            boolean r9 = r26.i0.y(r7, r3, r1)
            if (r9 == 0) goto L5d
            goto La2
        L5d:
            com.tencent.mm.plugin.appbrand.appstorage.u1 r6 = r6.getFileSystem()
            if (r6 == 0) goto L6e
            com.tencent.mm.vfs.r6 r6 = r6.getAbsoluteFile(r7)
            if (r6 == 0) goto L6e
            java.lang.String r6 = r6.o()
            goto L6f
        L6e:
            r6 = r0
        L6f:
            if (r6 == 0) goto L7a
            int r7 = r6.length()
            if (r7 != 0) goto L78
            goto L7a
        L78:
            r7 = r1
            goto L7b
        L7a:
            r7 = r2
        L7b:
            if (r7 == 0) goto L7e
            goto L7f
        L7e:
            r0 = r6
        L7f:
            if (r0 == 0) goto L9e
            com.tencent.mm.vfs.r6 r6 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r7 = com.tencent.mm.vfs.z7.a(r0)
            r6.<init>(r7)
            java.lang.String r6 = r6.r()
            if (r6 == 0) goto L9a
            java.lang.String r7 = "_xdir"
            boolean r6 = r26.i0.n(r6, r7, r1)
            if (r2 != r6) goto L9a
            r6 = r2
            goto L9b
        L9a:
            r6 = r1
        L9b:
            if (r6 == 0) goto L9e
            r1 = r2
        L9e:
            r10.a(r0, r1)
            return
        La2:
            com.tencent.mm.plugin.appbrand.utils.n5 r9 = new com.tencent.mm.plugin.appbrand.utils.n5
            r9.<init>(r10)
            com.tencent.mm.plugin.appbrand.utils.d0.c(r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.utils.o5.a(com.tencent.mm.plugin.appbrand.jsapi.l, java.lang.String, java.lang.String, int, com.tencent.mm.plugin.appbrand.utils.q2):void");
    }

    public static final void b(com.tencent.mm.plugin.appbrand.jsapi.l component, java.lang.String path, java.lang.String str, com.tencent.mm.plugin.appbrand.utils.q2 pathResolveListener) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(pathResolveListener, "pathResolveListener");
        a(component, path, str, 7, pathResolveListener);
    }
}
