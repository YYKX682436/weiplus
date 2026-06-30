package ta4;

/* loaded from: classes15.dex */
public class u implements jj.e {

    /* renamed from: a, reason: collision with root package name */
    public static final ta4.u f498369a = new ta4.u();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f498370b;

    @Override // jj.e
    public void a(java.lang.String str, long[] jArr, int[] iArr, int[] iArr2, float f17, float f18, float f19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFrameMetricsAvailable", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        try {
            int i17 = oj.d.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f427215d;
            int i18 = iArr[0];
            int i19 = iArr[1];
            int i27 = iArr[2];
            int i28 = iArr[3];
            int i29 = iArr[4];
            float f27 = i19 + i27 + i28 + i29;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6892x625bf53a c6892x625bf53a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6892x625bf53a();
            c6892x625bf53a.f142076d = (int) (100.0f * f19);
            c6892x625bf53a.f142077e = i17;
            c6892x625bf53a.f142078f = i18;
            c6892x625bf53a.f142079g = i19;
            c6892x625bf53a.f142080h = i27;
            c6892x625bf53a.f142081i = i28;
            c6892x625bf53a.f142082j = i29;
            c6892x625bf53a.f142083k = (int) ((((i19 * 1.0f) / f27) + ((i27 * 14.0f) / f27) + ((i28 * 25.0f) / f27) + ((i29 * 60.0f) / f27)) * 100.0d);
            c6892x625bf53a.k();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SnsDropFrameReporter", e17, "avgDroppedFrame: %d, avgRefreshRate: %.2f, avgFps: %.2f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f19));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFrameMetricsAvailable", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
    }

    @Override // jj.e
    public boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("skipFirstFrame", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("skipFirstFrame", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        return false;
    }

    @Override // jj.e
    public int c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIntervalMs", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIntervalMs", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        return 10000;
    }

    @Override // jj.e
    public int d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getThreshold", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThreshold", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        return 0;
    }

    @Override // jj.e
    /* renamed from: getName */
    public java.lang.String mo141031xfb82e301() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getName", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getName", "com.tencent.mm.plugin.sns.report.SnsDropFrameReporter");
        return "";
    }
}
