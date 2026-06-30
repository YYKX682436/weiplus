package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class v0 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.i9 a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.String r0 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.k(r7)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 r1 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a
            com.tencent.mm.sdk.platformtools.v3 r1 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94438d
            java.lang.Object r1 = r1.d(r0)
            com.tencent.mm.sdk.platformtools.o4 r1 = (com.tencent.mm.sdk.platformtools.o4) r1
            r2 = 0
            if (r1 == 0) goto L47
            boolean r3 = r1.f(r0)
            if (r3 == 0) goto L47
            byte[] r1 = r1.j(r0)
            if (r1 == 0) goto L47
            int r3 = r1.length
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L2a
            r3 = r4
            goto L2b
        L2a:
            r3 = r5
        L2b:
            r3 = r3 ^ r4
            if (r3 == 0) goto L47
            java.lang.Class<r45.i9> r3 = r45.i9.class
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.Exception -> L3d
            r4 = r3
            com.tencent.mm.protobuf.f r4 = (com.tencent.mm.protobuf.f) r4     // Catch: java.lang.Exception -> L3d
            r4.parseFrom(r1)     // Catch: java.lang.Exception -> L3d
            com.tencent.mm.protobuf.f r3 = (com.tencent.mm.protobuf.f) r3     // Catch: java.lang.Exception -> L3d
            goto L48
        L3d:
            r1 = move-exception
            java.lang.String r3 = "decode ProtoBuffer"
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r5 = "MultiProcessMMKV.decodeProtoBuffer"
            com.tencent.mars.xlog.Log.printErrStackTrace(r5, r1, r3, r4)
        L47:
            r3 = r2
        L48:
            r45.i9 r3 = (r45.i9) r3
            java.lang.String r1 = "MicroMsg.Preload.BizAppMsgContextCache"
            if (r3 == 0) goto L6c
            r3.f376822d = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "found:"
            r7.<init>(r2)
            r7.append(r0)
            java.lang.String r0 = " last modify:"
            r7.append(r0)
            int r0 = r3.f376826h
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.i(r1, r7)
            return r3
        L6c:
            java.lang.String r7 = "not found:"
            java.lang.String r7 = r7.concat(r0)
            com.tencent.mars.xlog.Log.i(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.v0.a(java.lang.String):r45.i9");
    }

    public final boolean b(java.lang.String url, int i17) {
        boolean z17;
        kotlin.jvm.internal.o.g(url, "url");
        r45.i9 a17 = a(url);
        boolean z18 = false;
        if (a17 == null) {
            return false;
        }
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
        int j17 = t1Var.j(a17.f376833r);
        if (j17 != -1) {
            i17 = j17;
        }
        if (t1Var.f(a17, i17)) {
            if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0.a().getBoolean("preload_data_noexpire", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Preload.BizAppMsgContextCache", "checkValid: debug to expire");
            } else {
                java.lang.String Url = a17.f376822d;
                kotlin.jvm.internal.o.f(Url, "Url");
                java.lang.String l17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.l(Url);
                com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94438d.d(l17);
                if (o4Var != null) {
                    z17 = com.tencent.mm.sdk.platformtools.y3.b(o4Var.getLong(l17, 0L), a17.f376824f * 1000);
                } else {
                    z17 = true;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Preload.BizAppMsgContextCache", "checkValid: expire for " + a17.f376824f);
                }
            }
            z18 = true;
        }
        if (!z18) {
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.k(url);
        }
        return z18;
    }

    public final void c(java.lang.String url, r45.i9 i9Var) {
        kotlin.jvm.internal.o.g(url, "url");
        if (i9Var != null) {
            java.lang.String str = i9Var.f376823e;
            if (!(str == null || r26.n0.N(str))) {
                java.lang.String k17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.k(url);
                java.lang.String str2 = i9Var.f376823e;
                try {
                    r45.i9 i9Var2 = new r45.i9();
                    i9Var2.parseFrom(i9Var.toByteArray());
                    i9Var2.f376823e = null;
                    byte[] byteArray = i9Var2.toByteArray();
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
                    com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94438d.i();
                    o4Var.H(k17, byteArray);
                    com.tencent.mm.sdk.platformtools.g3 g3Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94439e;
                    java.lang.String contentId = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.d(url);
                    kotlin.jvm.internal.o.g(g3Var, "<this>");
                    kotlin.jvm.internal.o.g(contentId, "contentId");
                    com.tencent.mm.vfs.r6 f17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.f((com.tencent.mm.vfs.r6) g3Var.i(), contentId);
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.b(f17);
                    kotlin.jvm.internal.o.d(str2);
                    com.tencent.mm.vfs.s6.d(f17, str2, null, 2, null);
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.w.c(o4Var, com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.l(url));
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Preload.BizAppMsgContextCache", e17, "save " + k17, new java.lang.Object[0]);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Preload.BizAppMsgContextCache", "saveInfo " + k17 + " last modify:" + java.lang.Integer.valueOf(i9Var.f376826h));
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Preload.BizAppMsgContextCache", "save fail, appMsgContext is null");
    }
}
