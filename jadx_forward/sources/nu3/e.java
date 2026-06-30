package nu3;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f421732b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f421733c;

    /* renamed from: d, reason: collision with root package name */
    public static long f421734d;

    /* renamed from: e, reason: collision with root package name */
    public static nu3.b f421735e;

    /* renamed from: f, reason: collision with root package name */
    public static nu3.b f421736f;

    /* renamed from: g, reason: collision with root package name */
    public static java.util.List f421737g;

    /* renamed from: a, reason: collision with root package name */
    public static final nu3.e f421731a = new nu3.e();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f421738h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f421739i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.List f421740j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f421741k = "sns_ready_to_send_video";

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f421742l = jz5.h.b(nu3.d.f421730d);

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordVideo.CameraEditorReporter", "cleanReportStorage");
        f421732b = false;
        f421733c = false;
        f421734d = 0L;
        f421735e = null;
        f421736f = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordVideo.CameraEditorReporter", "cleanSnsOriginPathAndEditPath");
        ((java.util.ArrayList) f421738h).clear();
        ((java.util.ArrayList) f421739i).clear();
        ((java.util.ArrayList) f421740j).clear();
        nu3.f.f421744b = null;
        nu3.f.f421745c = "";
        nu3.f.f421746d = "";
        nu3.f.f421747e = "";
        nu3.f.f421748f = 0;
        nu3.i.f421751a.m(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
    
        if (r26.n0.B(r2, "gif", false) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nu3.b b(java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nu3.e.b(java.lang.String):nu3.b");
    }

    public final nu3.b c(java.lang.String str) {
        gp.d dVar;
        nu3.b bVar = new nu3.b(0L, 0L, 0L, null, 0L, 31, null);
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordVideo.CameraEditorReporter", "video filePath empty");
            return bVar;
        }
        android.media.MediaMetadataRetriever mediaMetadataRetriever = null;
        gp.d dVar2 = null;
        try {
            try {
                dVar = new gp.d();
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            dVar.setDataSource(str);
            java.lang.String extractMetadata = dVar.extractMetadata(12);
            nu3.b bVar2 = new nu3.b(com.p314xaae8f345.mm.vfs.w6.k(str), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(18), 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(19), 0), extractMetadata != null ? r26.i0.t(extractMetadata, "video/", "", false) : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(9), 0));
            try {
                dVar.release();
            } catch (java.io.IOException unused) {
            }
            bVar = bVar2;
            mediaMetadataRetriever = extractMetadata;
        } catch (java.lang.Exception e18) {
            e = e18;
            dVar2 = dVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordVideo.CameraEditorReporter", "getVideoInfo error: %s", e.toString());
            mediaMetadataRetriever = dVar2;
            if (dVar2 != null) {
                try {
                    dVar2.release();
                    mediaMetadataRetriever = dVar2;
                } catch (java.io.IOException unused2) {
                }
            }
            return bVar;
        } catch (java.lang.Throwable th7) {
            th = th7;
            mediaMetadataRetriever = dVar;
            if (mediaMetadataRetriever != null) {
                try {
                    mediaMetadataRetriever.release();
                } catch (java.io.IOException unused3) {
                }
            }
            throw th;
        }
        return bVar;
    }

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6356x1502e0ef d(int i17, long j17, java.lang.String str, int i18) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6356x1502e0ef c6356x1502e0ef = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6356x1502e0ef();
        c6356x1502e0ef.f137064d = 1;
        boolean z17 = f421732b;
        c6356x1502e0ef.f137065e = z17 ? 1 : 0;
        c6356x1502e0ef.f137066f = f421733c ? 1 : 0;
        c6356x1502e0ef.f137067g = z17 ? 1 : i18 == 0 ? 2 : 3;
        c6356x1502e0ef.f137068h = i17;
        if (z17) {
            c6356x1502e0ef.f137070j = c6356x1502e0ef.b("CameraEnterSessionID", nu3.f.f421746d, true);
            c6356x1502e0ef.f137071k = c6356x1502e0ef.b("CameraSessionID", nu3.f.f421745c, true);
        }
        c6356x1502e0ef.f137072l = c6356x1502e0ef.b("EditSessionID", java.lang.String.valueOf(f421734d), true);
        c6356x1502e0ef.f137073m = c6356x1502e0ef.b("ChatUserName", str, true);
        c6356x1502e0ef.f137074n = e(str);
        c6356x1502e0ef.f137075o = c6356x1502e0ef.b("SvrMsgID", java.lang.String.valueOf(j17), true);
        return c6356x1502e0ef;
    }

    public final int e(java.lang.String str) {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            return ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0086 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.List r10) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nu3.e.f(java.util.List):void");
    }
}
