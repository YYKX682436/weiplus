package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class b0 implements com.tencent.mm.plugin.appbrand.backgroundrunning.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f76953a = new java.util.LinkedList();

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cc, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandForegroundNotificationManager", "onBackgroundRunningAppChanged, update notification by usage changes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r7.f76953a.isEmpty() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r0 = (java.lang.Class) r7.f76953a.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e4, code lost:
    
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e6, code lost:
    
        a((java.util.ArrayList) r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ec, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandForegroundNotificationManager", "onBackgroundRunningAppChanged, update notification but foregroundServiceClass is null, ignored");
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x001b, B:22:0x0071, B:24:0x0080, B:26:0x008b, B:29:0x0091, B:30:0x0099, B:31:0x00a6, B:33:0x00ac, B:40:0x00b4, B:36:0x00bb, B:43:0x00c3, B:44:0x0038, B:46:0x003c, B:48:0x0041, B:50:0x0053, B:51:0x0064, B:53:0x00cc, B:55:0x00db, B:57:0x00e6, B:60:0x00ec, B:61:0x00f4, B:62:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x001b, B:22:0x0071, B:24:0x0080, B:26:0x008b, B:29:0x0091, B:30:0x0099, B:31:0x00a6, B:33:0x00ac, B:40:0x00b4, B:36:0x00bb, B:43:0x00c3, B:44:0x0038, B:46:0x003c, B:48:0x0041, B:50:0x0053, B:51:0x0064, B:53:0x00cc, B:55:0x00db, B:57:0x00e6, B:60:0x00ec, B:61:0x00f4, B:62:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0053 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x001b, B:22:0x0071, B:24:0x0080, B:26:0x008b, B:29:0x0091, B:30:0x0099, B:31:0x00a6, B:33:0x00ac, B:40:0x00b4, B:36:0x00bb, B:43:0x00c3, B:44:0x0038, B:46:0x003c, B:48:0x0041, B:50:0x0053, B:51:0x0064, B:53:0x00cc, B:55:0x00db, B:57:0x00e6, B:60:0x00ec, B:61:0x00f4, B:62:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0064 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x001b, B:22:0x0071, B:24:0x0080, B:26:0x008b, B:29:0x0091, B:30:0x0099, B:31:0x00a6, B:33:0x00ac, B:40:0x00b4, B:36:0x00bb, B:43:0x00c3, B:44:0x0038, B:46:0x003c, B:48:0x0041, B:50:0x0053, B:51:0x0064, B:53:0x00cc, B:55:0x00db, B:57:0x00e6, B:60:0x00ec, B:61:0x00f4, B:62:0x0024), top: B:2:0x0001 }] */
    @Override // com.tencent.mm.plugin.appbrand.backgroundrunning.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void A(java.util.List r8, com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel r9, int r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.backgroundrunning.b0.A(java.util.List, com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel, int):void");
    }

    public final void a(java.util.ArrayList arrayList, java.lang.Class cls) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, cls);
        intent.putParcelableArrayListExtra("key_apps", arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandForegroundNotificationManager", "onBackgroundRunningAppChanged, start foreground service:%s", cls);
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.startService(intent);
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandForegroundNotificationManager", e17, "", new java.lang.Object[0]);
        }
    }

    public final void b(java.util.ArrayList arrayList, java.lang.Class cls) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, cls);
        intent.putParcelableArrayListExtra("key_apps", arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandForegroundNotificationManager", "onBackgroundRunningAppChanged, stop foreground service:%s", cls);
        com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(intent);
    }
}
