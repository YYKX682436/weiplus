package ta4;

/* loaded from: classes4.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta4.b1 f498258a = new ta4.b1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f498259b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f498260c = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String sourcePath, java.lang.String targetPath) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addPathMapping", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourcePath, "sourcePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetPath, "targetPath");
        if (pc4.d.f434943a.j()) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f498260c;
            concurrentHashMap.clear();
            if (sourcePath.length() > 0) {
                if (targetPath.length() > 0) {
                    java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(targetPath, false);
                    if (i17 != null) {
                        targetPath = i17;
                    }
                    java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(sourcePath, false);
                    if (i18 != null) {
                        sourcePath = i18;
                    }
                    concurrentHashMap.put(targetPath, sourcePath);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addPathMapping", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
    }

    public final void b(int i17, java.util.List pathList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addVideoSource", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathList, "pathList");
        if (pc4.d.f434943a.j()) {
            org.p3343x72743996.p3344x2e06d1.Log.i("MicroMsg.SnsPostMediaMetaDataReporter", "addVideoSource >> " + i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = pathList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
                if (i18 != null) {
                    str = i18;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                java.lang.String str2 = (java.lang.String) f498260c.remove(str);
                if (str2 != null) {
                    str = str2;
                }
                arrayList.add(str);
            }
            f498259b.put(java.lang.Integer.valueOf(i17), new ta4.c1(4, arrayList));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addVideoSource", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
    }
}
