package xd4;

/* loaded from: classes4.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xd4.i0 f535178d;

    public h0(xd4.i0 i0Var) {
        this.f535178d = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask$rptVideoPause$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getReporter$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        xd4.i0 i0Var = this.f535178d;
        ok4.c cVar = i0Var.f535183d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getReporter$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        long j17 = cVar.f427521l;
        if (j17 <= 0) {
            j17 = 0;
        }
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadTask", "no download not need to report");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask$rptVideoPause$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getReporter$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getReporter$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        ok4.b v17 = i0Var.f535183d.v();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getProvider$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getProvider$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.VideoRptStruct b17 = i0Var.f535184e.b();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6900xf90847b9 c6900xf90847b9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6900xf90847b9();
        c6900xf90847b9.f142192n = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        c6900xf90847b9.f142178g = 0L;
        c6900xf90847b9.K = 0L;
        c6900xf90847b9.f142176f = com.p314xaae8f345.mm.vfs.w6.k(b17.f248092f);
        c6900xf90847b9.N = c6900xf90847b9.b("SnsPublishid", b17.f248090d, true);
        c6900xf90847b9.f142172d = c6900xf90847b9.b("SnsVideoUrl", b17.f248091e, true);
        c6900xf90847b9.f142182i = v17.f427499a;
        long j18 = v17.f427500b;
        if (j18 < 0) {
            j18 = 0;
        }
        c6900xf90847b9.f142184j = j18;
        c6900xf90847b9.f142186k = v17.f427501c;
        c6900xf90847b9.f142188l = v17.f427502d;
        long j19 = v17.f427503e;
        c6900xf90847b9.f142190m = j19 >= 0 ? j19 : 0L;
        c6900xf90847b9.I = v17.f427504f;
        c6900xf90847b9.f142168J = v17.f427505g;
        c6900xf90847b9.V = b17.f248089c;
        c6900xf90847b9.W = c6900xf90847b9.b("AutoPlaySessionID", b17.f248088b, true);
        c6900xf90847b9.X = (int) b17.f248087a;
        c6900xf90847b9.f142201r0 = c6900xf90847b9.b("cdn_req_flag", b17.f248093g, true);
        c6900xf90847b9.f142203s0 = c6900xf90847b9.b("cdn_resp_flag", b17.f248094h, true);
        c6900xf90847b9.f142205t0 = c6900xf90847b9.b("switch_source_start_time", b17.f248095i, true);
        c6900xf90847b9.f142207u0 = c6900xf90847b9.b("switch_source_end_time", b17.f248096j, true);
        c6900xf90847b9.f142209v0 = b17.f248097k;
        c6900xf90847b9.f142211w0 = c6900xf90847b9.b("sns_video_multi_spec", b17.f248098l, true);
        try {
            bVar = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(i0Var.j(), true);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsVideoDownloadTask", "Failed to getMediaInfo");
            bVar = null;
        }
        if (bVar != null) {
            c6900xf90847b9.f142173d0 = bVar.f243917c;
            c6900xf90847b9.f142175e0 = bVar.f243918d;
            c6900xf90847b9.f142177f0 = bVar.f243919e;
            c6900xf90847b9.f142179g0 = v17.f427506h;
            int i17 = v17.f427507i;
            int i18 = 0;
            boolean z17 = (i17 & 1) != 0;
            boolean z18 = (i17 & 2) != 0;
            c6900xf90847b9.f142181h0 = c6900xf90847b9.f142188l;
            c6900xf90847b9.f142183i0 = c6900xf90847b9.f142190m;
            if (z17 && z18) {
                i18 = 3;
            } else if (z17) {
                i18 = 1;
            } else if (z18) {
                i18 = 2;
            }
            c6900xf90847b9.f142185j0 = i18;
            int i19 = bVar.f243915a;
            if (i19 != 0) {
                boolean z19 = v17.f427509k;
                long j27 = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
                if (!z19) {
                    j27 = java.lang.Math.min(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, (v17.f427508j * 10000) / i19);
                }
                c6900xf90847b9.f142187k0 = j27;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(bVar.f243917c);
            sb6.append('x');
            sb6.append(bVar.f243918d);
            c6900xf90847b9.f142193n0 = c6900xf90847b9.b("widthxheight", sb6.toString(), true);
        }
        c6900xf90847b9.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask$rptVideoPause$1");
    }
}
