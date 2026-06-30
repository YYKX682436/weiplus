package com.tencent.mm.plugin.base.stub;

/* loaded from: classes7.dex */
public final class r implements com.tencent.mm.ui.cd, j45.k {
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0077 A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // com.tencent.mm.ui.ad, j45.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(android.content.Context r3, java.lang.String r4, android.content.Intent r5, int r6, com.tencent.mm.ui.x7 r7) {
        /*
            r2 = this;
            r6 = 1
            r7 = 0
            if (r4 == 0) goto Le
            java.lang.String r0 = ".ui.LauncherUI"
            boolean r4 = r26.i0.n(r4, r0, r7)
            if (r4 != r6) goto Le
            r4 = r6
            goto Lf
        Le:
            r4 = r7
        Lf:
            if (r4 == 0) goto Ld7
            boolean r4 = com.tencent.mm.plugin.base.stub.e0.g()
            if (r4 == 0) goto Ld7
            if (r5 != 0) goto L1b
            goto Ld7
        L1b:
            com.tencent.mm.app.w r4 = com.tencent.mm.app.w.INSTANCE
            boolean r4 = r4.f53889n
            if (r4 != 0) goto L34
            com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner r4 = com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE
            boolean r4 = r4.isForeground()
            if (r4 != 0) goto L34
            com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner r4 = com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE
            boolean r4 = r4.isForeground()
            if (r4 == 0) goto L32
            goto L34
        L32:
            r4 = r7
            goto L35
        L34:
            r4 = r6
        L35:
            if (r4 == 0) goto Ld7
            java.lang.String r4 = "android.intent.action.MAIN"
            java.lang.String r0 = r5.getAction()
            boolean r4 = kotlin.jvm.internal.o.b(r4, r0)
            if (r4 == 0) goto Ld7
            java.util.Set r4 = r5.getCategories()
            if (r4 != 0) goto L4b
            kz5.r0 r4 = kz5.r0.f314002d
        L4b:
            java.lang.String r5 = "android.intent.category.LAUNCHER"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto Ld7
            com.tencent.mm.ui.LauncherUI r4 = com.tencent.mm.ui.LauncherUI.getInstance()
            if (r4 != 0) goto L5a
            return r7
        L5a:
            if (r3 != 0) goto L5e
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
        L5e:
            java.lang.Class<android.app.ActivityManager> r5 = android.app.ActivityManager.class
            java.lang.Object r3 = b3.l.getSystemService(r3, r5)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            if (r3 != 0) goto L69
            return r7
        L69:
            int r4 = r4.getTaskId()
            java.util.List r3 = r3.getAppTasks()
            if (r3 == 0) goto Ld7
            java.util.Iterator r3 = r3.iterator()
        L77:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Ld7
            java.lang.Object r5 = r3.next()
            android.app.ActivityManager$AppTask r5 = (android.app.ActivityManager.AppTask) r5
            kotlin.jvm.internal.o.d(r5)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L99
            android.app.ActivityManager$RecentTaskInfo r0 = r5.getTaskInfo()
            if (r0 == 0) goto La6
            int r0 = r0.taskId
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto La7
        L99:
            android.app.ActivityManager$RecentTaskInfo r0 = r5.getTaskInfo()
            if (r0 == 0) goto La6
            int r0 = r0.id
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto La7
        La6:
            r0 = 0
        La7:
            if (r0 != 0) goto Laa
            goto L77
        Laa:
            int r0 = r0.intValue()
            if (r0 == r4) goto Lb1
            goto L77
        Lb1:
            android.app.ActivityManager$RecentTaskInfo r3 = r5.getTaskInfo()
            if (r3 != 0) goto Lb8
            return r7
        Lb8:
            android.content.ComponentName r3 = r3.topActivity
            if (r3 == 0) goto Lcc
            java.lang.String r3 = r3.getClassName()
            if (r3 == 0) goto Lcc
            java.lang.String r4 = ".base.stub.WXBizEntryActivity"
            boolean r3 = r26.i0.n(r3, r4, r7)
            if (r3 != r6) goto Lcc
            r3 = r6
            goto Lcd
        Lcc:
            r3 = r7
        Lcd:
            if (r3 == 0) goto Ld7
            java.lang.String r3 = "MicroMsg.WXBizEntryPluginInterceptor"
            java.lang.String r4 = "interrupt new LauncherUI creation because both WXBizEntryActivity and LauncherUI are in foreground task"
            com.tencent.mars.xlog.Log.i(r3, r4)
            return r6
        Ld7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.base.stub.r.b(android.content.Context, java.lang.String, android.content.Intent, int, com.tencent.mm.ui.x7):boolean");
    }
}
