package nu3;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static long f421764c;

    /* renamed from: a, reason: collision with root package name */
    public static final nu3.m f421762a = new nu3.m();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db f421763b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.ArrayList f421765d = new java.util.ArrayList();

    public final void a() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db = f421763b;
        c6874x68a054db.f141929m = c6874x68a054db.b("RouterLog", b(), true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "videoWidgetReporter doReport >> " + f421764c + ", " + f421763b.n());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db2 = f421763b;
        if (c6874x68a054db2.H != 0 && f421764c != 0) {
            c6874x68a054db2.k();
        }
        f421764c = 0L;
    }

    public final java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = f421765d.iterator();
        while (it.hasNext()) {
            sb6.append((java.lang.String) it.next());
            sb6.append("#");
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return r26.i0.t(sb7, ",", ";", false);
    }

    public final void c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setABAPramsUseDaemon >> " + i17);
        f421763b.f141932p = i17;
    }

    public final void d(cl0.g gVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCameraDataJSON >> ");
        sb6.append(gVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", sb6.toString());
        if (gVar == null) {
            return;
        }
        f421763b.f141925i = gVar.optBoolean("isUseCamera2") ? 2 : 1;
        f421763b.f141939w = gVar.optInt("CameraOpenCost");
        f421763b.f141940x = gVar.optInt("CameraFirstFrameCost");
        f421763b.f141941y = gVar.optInt("HighRecordStopWaitTime");
        f421763b.f141942z = gVar.optInt("LowRecordStopWaitTime");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db = f421763b;
        c6874x68a054db.A = c6874x68a054db.b("RecordMuxerType", gVar.optBoolean("RecordMuxerType") ? "ffmpeg" : "mp4v2", true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db2 = f421763b;
        long j17 = c6874x68a054db2.I;
        if (j17 == 0) {
            j17 = gVar.optLong("OpenCameraTimeStamp");
        }
        c6874x68a054db2.I = j17;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db3 = f421763b;
        long j18 = c6874x68a054db3.f141919J;
        if (j18 == 0) {
            j18 = gVar.optLong("StartPreviewTimeStamp");
        }
        c6874x68a054db3.f141919J = j18;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db4 = f421763b;
        long j19 = c6874x68a054db4.K;
        if (j19 == 0) {
            j19 = gVar.optLong("PreviewSuccessTImeStamp");
        }
        c6874x68a054db4.K = j19;
    }

    public final void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setCaptureHevcEncode:" + i17);
        f421763b.R = (long) i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setConfigProvider");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db = f421763b;
        if (c16993xacc19624 == null || (str = c16993xacc19624.A) == null) {
            str = "";
        }
        c6874x68a054db.f141930n = c6874x68a054db.b("EditPathList", str, true);
        f421763b.f141934r = (c16993xacc19624 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c16993xacc19624.f237216u, java.lang.Boolean.TRUE) : 0) ^ 1;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db2 = f421763b;
        c6874x68a054db2.E = c6874x68a054db2.b("ConfigParam", java.lang.String.valueOf(c16993xacc19624 != null ? c16993xacc19624.f237209n : null), true);
    }

    public final void g(int... editMaterials) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editMaterials, "editMaterials");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setEditElementList");
        cl0.g gVar = new cl0.g();
        gVar.o("emoji", editMaterials[0]);
        gVar.o(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, editMaterials[1]);
        gVar.o("music", editMaterials[2]);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db = f421763b;
        c6874x68a054db.f141931o = c6874x68a054db.b("EditElementList", r26.i0.t(gVar2, ",", ";", false), true);
    }

    public final void h(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setEnterScene >> " + i17);
        f421763b.f141921e = i17;
    }

    public final void i(int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "exitType: " + i17 + ", sendType: " + j17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db = f421763b;
        c6874x68a054db.f141938v = i17;
        c6874x68a054db.D = j17;
    }

    public final void j(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setFinishRecordTimeStamp >> " + j17);
        f421763b.M = j17;
    }

    public final void k(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setInitRouterTimeStamp >> timeStamp: " + j17);
        if (f421764c != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "videoWidgetReporter doReport In setInitRouterTImeStamp");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db = f421763b;
            c6874x68a054db.f141929m = c6874x68a054db.b("RouterLog", b(), true);
            f421763b.k();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "videoWidgetReporter doReset");
        f421763b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db();
        f421765d.clear();
        f421764c = j17;
        f421763b.H = j17;
    }

    public final void l(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setJumpToThirdApp >> " + i17);
        f421763b.f141937u = i17;
    }

    public final void m(java.lang.String videoPath) {
        java.lang.String m69267x9616526c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setMixVideoInfo >> ".concat(videoPath));
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(videoPath, true);
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(videoPath) / 1024;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setMixVideoInfo >> fileSize: " + k17 + " KB");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db = f421763b;
        c6874x68a054db.G = c6874x68a054db.b("MixVideoInfo", (d17 == null || (m69267x9616526c = d17.m69267x9616526c()) == null) ? "" : r26.i0.t(m69267x9616526c, ",", ";", false), true);
        f421763b.V = k17;
    }

    public final void n(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setMuxResult >> " + i17);
        f421763b.f141935s = i17;
        i(1, 1L);
    }

    public final void o(java.lang.String videoPath) {
        java.lang.String m69267x9616526c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setPhotoAlbumVideoInfo >> ".concat(videoPath));
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(videoPath, true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db = f421763b;
        c6874x68a054db.F = c6874x68a054db.b("PhotoAlbumVideoInfo", (d17 == null || (m69267x9616526c = d17.m69267x9616526c()) == null) ? "" : r26.i0.t(m69267x9616526c, ",", ";", false), true);
    }

    public final void p(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setRecordCameraRet >> type: " + z17);
        f421763b.f141926j = !z17 ? 1 : 0;
    }

    public final void q(java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setRecordHighBitrateVideo >> filePath: " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db = f421763b;
        if (d17 == null || (str2 = d17.m69267x9616526c()) == null) {
            str2 = "";
        }
        c6874x68a054db.f141927k = c6874x68a054db.b("RecordHighBitrateVideo", str2, true);
    }

    public final void r(java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setRecordLowBitrateVideo >> filePath: " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db = f421763b;
        if (d17 == null || (str2 = d17.m69267x9616526c()) == null) {
            str2 = "";
        }
        c6874x68a054db.f141928l = c6874x68a054db.b("RecordLowBitrateVideo", str2, true);
    }

    public final void s(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setSNSDoubleCheck >> " + i17);
        f421763b.f141936t = i17;
    }

    public final void t(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setStartRecordTimeStamp >> " + j17);
        f421763b.L = j17;
    }

    public final void u(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setTecEnterScene >> type: " + i17);
        f421763b.T = i17;
    }

    public final void v(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setUseDaemon >> " + i17);
        f421763b.f141933q = i17;
    }
}
