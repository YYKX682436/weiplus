package com.tencent.mm.plugin.downloader.event;

/* loaded from: classes8.dex */
public class a extends android.content.BroadcastReceiver {
    public a(com.tencent.mm.plugin.downloader.event.DownloadEventBus$1 downloadEventBus$1) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        if (r5.moveToFirst() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        r1 = new h02.a();
        r1.convertFrom(r5);
        r6.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        if (r5.moveToNext() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        r5.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            if (r5 == 0) goto Lf4
            if (r6 != 0) goto L6
            goto Lf4
        L6:
            java.lang.String r5 = r6.getAction()
            java.lang.String r0 = "MicroMsg.DownloadEventBus"
            com.tencent.mars.xlog.Log.i(r0, r5)
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r5)
            if (r1 == 0) goto L1b
            java.lang.String r5 = "action is null or nill, ignore"
            com.tencent.mars.xlog.Log.e(r0, r5)
            return
        L1b:
            java.lang.String r1 = "android.intent.action.PACKAGE_ADDED"
            boolean r1 = r5.equals(r1)
            java.lang.String r2 = "android.intent.action.PACKAGE_REPLACED"
            if (r1 != 0) goto L2c
            boolean r1 = r5.equals(r2)
            if (r1 != 0) goto L2c
            return
        L2c:
            java.lang.String r6 = r6.getDataString()     // Catch: java.lang.Exception -> L31
            goto L41
        L31:
            r6 = move-exception
            java.lang.String r6 = com.tencent.mm.sdk.platformtools.z3.c(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r1 = "%s"
            com.tencent.mars.xlog.Log.e(r0, r1, r6)
            java.lang.String r6 = ""
        L41:
            java.lang.String r1 = "get added package name : %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r6}
            com.tencent.mars.xlog.Log.i(r0, r1, r3)
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            if (r1 == 0) goto L56
            java.lang.String r5 = "get installed broadcast, while the package name is null or nil"
            com.tencent.mars.xlog.Log.e(r0, r5)
            return
        L56:
            java.lang.String r1 = "package:"
            boolean r1 = r6.startsWith(r1)
            if (r1 == 0) goto L65
            r1 = 8
            java.lang.String r6 = r6.substring(r1)
        L65:
            boolean r1 = gm0.j1.a()
            if (r1 == 0) goto Lee
            boolean r1 = gm0.m.r()
            if (r1 == 0) goto L73
            goto Lee
        L73:
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L83
            com.tencent.mm.plugin.downloader.event.a$$a r5 = new com.tencent.mm.plugin.downloader.event.a$$a
            r5.<init>()
            java.lang.Class<vz.h1> r0 = vz.h1.class
            fs.g.b(r0, r5)
        L83:
            h02.b r5 = com.tencent.mm.plugin.downloader.model.m0.g()
            r0 = 0
            if (r5 != 0) goto L8b
            goto L98
        L8b:
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            if (r1 == 0) goto L9a
            java.lang.String r5 = "MicroMsg.FileDownloadInfoStorage"
            java.lang.String r6 = "Null or nil PakcageName"
            com.tencent.mars.xlog.Log.e(r5, r6)
        L98:
            r6 = r0
            goto Lc7
        L9a:
            java.lang.String r1 = "select * from FileDownloadInfo where packageName=? order by downloadId desc"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            android.database.Cursor r5 = r5.rawQuery(r1, r6)
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            if (r5 != 0) goto Lad
            goto Lc7
        Lad:
            boolean r1 = r5.moveToFirst()
            if (r1 == 0) goto Lc4
        Lb3:
            h02.a r1 = new h02.a
            r1.<init>()
            r1.convertFrom(r5)
            r6.add(r1)
            boolean r1 = r5.moveToNext()
            if (r1 != 0) goto Lb3
        Lc4:
            r5.close()
        Lc7:
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.L0(r6)
            if (r5 == 0) goto Lce
            return
        Lce:
            java.util.Iterator r5 = r6.iterator()
        Ld2:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Le4
            java.lang.Object r6 = r5.next()
            h02.a r6 = (h02.a) r6
            int r1 = r6.field_fileType
            r2 = 1
            if (r1 != r2) goto Ld2
            r0 = r6
        Le4:
            if (r0 == 0) goto Led
            long r5 = r0.field_downloadId
            r0 = 9
            com.tencent.mm.plugin.downloader.event.c.a(r0, r5)
        Led:
            return
        Lee:
            java.lang.String r5 = "no user login"
            com.tencent.mars.xlog.Log.e(r0, r5)
        Lf4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.downloader.event.a.onReceive(android.content.Context, android.content.Intent):void");
    }
}
