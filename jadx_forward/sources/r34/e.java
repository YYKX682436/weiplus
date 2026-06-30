package r34;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f450533c;

    /* renamed from: a, reason: collision with root package name */
    public static final r34.e f450531a = new r34.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f450532b = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static int f450534d = 50;

    public static /* synthetic */ void h(r34.e eVar, r34.b bVar, boolean z17, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateRecord$default", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage");
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        eVar.g(bVar, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateRecord$default", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage");
    }

    public final synchronized void a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteRecord", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        d();
        java.util.List list = f450532b;
        boolean c07 = pm0.v.c0(list, new r34.c(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdSession.SnsAdPositionStorage", "deleteRecord, snsId=" + ca4.z0.t0(j17) + ", totalTime=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + ", count=" + list.size() + ", delRet=" + c07);
        if (c07) {
            f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteRecord", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage");
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAccountAwareMMKV", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("sns_ad_local_records", gm0.j1.b().h(), 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(J2, "getAccountAwareMMKV(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAccountAwareMMKV", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage");
        return J2;
    }

    public final synchronized r34.b c(long j17) {
        java.lang.Object obj;
        r34.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecord", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage");
        d();
        java.util.Iterator it = f450532b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (j17 == ((r34.b) obj).e()) {
                break;
            }
        }
        bVar = (r34.b) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecord", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage");
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r34.e.d():void");
    }

    public final synchronized void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAccountRelease", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdSession.SnsAdPositionStorage", "onAccountRelease, isInited=" + f450533c + ", hash=" + hashCode());
        if (!f450533c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAccountRelease", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage");
            return;
        }
        f();
        ((java.util.ArrayList) f450532b).clear();
        f450533c = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAccountRelease", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage");
    }

    public final synchronized void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("save", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage");
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = ((java.util.ArrayList) f450532b).iterator();
            while (it.hasNext()) {
                jSONArray.put(((r34.b) it.next()).l());
            }
            java.lang.String jSONArray2 = jSONArray.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            r34.e eVar = f450531a;
            eVar.b().putString("key_ad_positions", jSONArray2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdSession.SnsAdPositionStorage", "save, totalTime=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + ", jsonTime=" + (elapsedRealtime2 - elapsedRealtime) + ", mmkvTime=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime2) + ", count=" + f450532b.size() + ", length=" + jSONArray2.length() + ", hash=" + eVar.hashCode());
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdSession_storage_save", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("save", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038 A[Catch: all -> 0x01e4, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0011, B:10:0x001b, B:12:0x002c, B:17:0x0038, B:18:0x0051, B:20:0x0057, B:25:0x0063, B:26:0x007c, B:27:0x0084, B:29:0x008b, B:36:0x00a5, B:38:0x00a9, B:40:0x00b6, B:42:0x00d3, B:43:0x00d9, B:45:0x00e3, B:46:0x00eb, B:48:0x00f5, B:49:0x0165, B:51:0x016b, B:53:0x0175, B:54:0x017d, B:57:0x01da, B:60:0x0185, B:61:0x00fe, B:63:0x010c, B:64:0x0116, B:66:0x0124, B:67:0x012c, B:69:0x0138, B:71:0x014f, B:73:0x0159), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[Catch: all -> 0x01e4, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0011, B:10:0x001b, B:12:0x002c, B:17:0x0038, B:18:0x0051, B:20:0x0057, B:25:0x0063, B:26:0x007c, B:27:0x0084, B:29:0x008b, B:36:0x00a5, B:38:0x00a9, B:40:0x00b6, B:42:0x00d3, B:43:0x00d9, B:45:0x00e3, B:46:0x00eb, B:48:0x00f5, B:49:0x0165, B:51:0x016b, B:53:0x0175, B:54:0x017d, B:57:0x01da, B:60:0x0185, B:61:0x00fe, B:63:0x010c, B:64:0x0116, B:66:0x0124, B:67:0x012c, B:69:0x0138, B:71:0x014f, B:73:0x0159), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b A[Catch: all -> 0x01e4, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0011, B:10:0x001b, B:12:0x002c, B:17:0x0038, B:18:0x0051, B:20:0x0057, B:25:0x0063, B:26:0x007c, B:27:0x0084, B:29:0x008b, B:36:0x00a5, B:38:0x00a9, B:40:0x00b6, B:42:0x00d3, B:43:0x00d9, B:45:0x00e3, B:46:0x00eb, B:48:0x00f5, B:49:0x0165, B:51:0x016b, B:53:0x0175, B:54:0x017d, B:57:0x01da, B:60:0x0185, B:61:0x00fe, B:63:0x010c, B:64:0x0116, B:66:0x0124, B:67:0x012c, B:69:0x0138, B:71:0x014f, B:73:0x0159), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9 A[Catch: all -> 0x01e4, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0011, B:10:0x001b, B:12:0x002c, B:17:0x0038, B:18:0x0051, B:20:0x0057, B:25:0x0063, B:26:0x007c, B:27:0x0084, B:29:0x008b, B:36:0x00a5, B:38:0x00a9, B:40:0x00b6, B:42:0x00d3, B:43:0x00d9, B:45:0x00e3, B:46:0x00eb, B:48:0x00f5, B:49:0x0165, B:51:0x016b, B:53:0x0175, B:54:0x017d, B:57:0x01da, B:60:0x0185, B:61:0x00fe, B:63:0x010c, B:64:0x0116, B:66:0x0124, B:67:0x012c, B:69:0x0138, B:71:0x014f, B:73:0x0159), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016b A[Catch: all -> 0x01e4, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0011, B:10:0x001b, B:12:0x002c, B:17:0x0038, B:18:0x0051, B:20:0x0057, B:25:0x0063, B:26:0x007c, B:27:0x0084, B:29:0x008b, B:36:0x00a5, B:38:0x00a9, B:40:0x00b6, B:42:0x00d3, B:43:0x00d9, B:45:0x00e3, B:46:0x00eb, B:48:0x00f5, B:49:0x0165, B:51:0x016b, B:53:0x0175, B:54:0x017d, B:57:0x01da, B:60:0x0185, B:61:0x00fe, B:63:0x010c, B:64:0x0116, B:66:0x0124, B:67:0x012c, B:69:0x0138, B:71:0x014f, B:73:0x0159), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe A[Catch: all -> 0x01e4, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0011, B:10:0x001b, B:12:0x002c, B:17:0x0038, B:18:0x0051, B:20:0x0057, B:25:0x0063, B:26:0x007c, B:27:0x0084, B:29:0x008b, B:36:0x00a5, B:38:0x00a9, B:40:0x00b6, B:42:0x00d3, B:43:0x00d9, B:45:0x00e3, B:46:0x00eb, B:48:0x00f5, B:49:0x0165, B:51:0x016b, B:53:0x0175, B:54:0x017d, B:57:0x01da, B:60:0x0185, B:61:0x00fe, B:63:0x010c, B:64:0x0116, B:66:0x0124, B:67:0x012c, B:69:0x0138, B:71:0x014f, B:73:0x0159), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(r34.b r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r34.e.g(r34.b, boolean):void");
    }
}
