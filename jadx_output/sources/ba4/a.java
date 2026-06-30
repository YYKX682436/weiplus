package ba4;

/* loaded from: classes4.dex */
public final class a implements v94.i {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct f18696a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18697b;

    public final void a(java.lang.String info) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCoverInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = this.f18696a;
        if (snsCoverReportStruct != null) {
            snsCoverReportStruct.p(r26.i0.t(info, ",", ";", false));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCoverInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public void b(java.lang.String info) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addImageInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = this.f18696a;
        if (snsCoverReportStruct != null) {
            snsCoverReportStruct.f60523j = snsCoverReportStruct.b("ImageInfo", r26.i0.t(info, ",", ";", false), true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addImageInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public void c(java.lang.String info) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addVideoInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = this.f18696a;
        if (snsCoverReportStruct != null) {
            snsCoverReportStruct.f60524k = snsCoverReportStruct.b("VideoInfo", r26.i0.t(info, ",", ";", false), true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addVideoInfo", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markFirstFrameLoad", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = this.f18696a;
        if ((snsCoverReportStruct != null ? snsCoverReportStruct.f60534u : 0L) <= 0 && snsCoverReportStruct != null) {
            snsCoverReportStruct.f60534u = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFirstFrameLoad", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markFirstPlay", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = this.f18696a;
        if ((snsCoverReportStruct != null ? snsCoverReportStruct.f60536w : 0L) <= 0 && snsCoverReportStruct != null) {
            snsCoverReportStruct.f60536w = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFirstPlay", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markFold", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = this.f18696a;
        if ((snsCoverReportStruct != null ? snsCoverReportStruct.f60529p : 0) <= 0) {
            if (snsCoverReportStruct != null) {
                snsCoverReportStruct.f60529p = 1;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFold", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        } else {
            if (snsCoverReportStruct != null) {
                snsCoverReportStruct.f60529p = snsCoverReportStruct != null ? snsCoverReportStruct.f60529p : 1;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFold", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        }
    }

    public void g(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markIsLocal", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = this.f18696a;
        if (snsCoverReportStruct != null) {
            snsCoverReportStruct.f60526m = z17 ? 1 : -1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markIsLocal", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public final void h(java.lang.Boolean bool) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markLikeClick", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = this.f18696a;
            if (snsCoverReportStruct != null) {
                snsCoverReportStruct.f60530q = bool.booleanValue() ? 1 : 0;
            }
            com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct2 = this.f18696a;
            if (snsCoverReportStruct2 != null) {
                snsCoverReportStruct2.f60531r = this.f18697b != booleanValue ? 1 : 0;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markLikeClick", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public final void i(com.tencent.mm.plugin.sns.storage.x1 coverInfo, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markPageIn", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        kotlin.jvm.internal.o.g(coverInfo, "coverInfo");
        if (this.f18696a != null) {
            j(z17);
        }
        this.f18697b = coverInfo.field_isLike;
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct();
        this.f18696a = snsCoverReportStruct;
        snsCoverReportStruct.f60517d = 2;
        snsCoverReportStruct.f60519f = snsCoverReportStruct.b("UserName", coverInfo.getUserName(), true);
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct2 = this.f18696a;
        if (snsCoverReportStruct2 != null) {
            snsCoverReportStruct2.f60520g = kotlin.jvm.internal.o.b(coverInfo.getUserName(), gm0.j1.u().c().l(2, null)) ? 1 : 0;
        }
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct3 = this.f18696a;
        if (snsCoverReportStruct3 != null) {
            snsCoverReportStruct3.f60521h = coverInfo.field_type;
        }
        if (snsCoverReportStruct3 != null) {
            java.lang.Long u07 = coverInfo.u0();
            kotlin.jvm.internal.o.f(u07, "getSnsObjId(...)");
            snsCoverReportStruct3.f60522i = u07.longValue();
        }
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct4 = this.f18696a;
        if (snsCoverReportStruct4 != null) {
            snsCoverReportStruct4.f60532s = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markPageIn", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }

    public final void j(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableCoverPreviewReport", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_cover_preview_report_enable, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverConfig", "enableUserPageReport:" + fj6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableCoverPreviewReport", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        if (fj6) {
            com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = this.f18696a;
            if (snsCoverReportStruct != null) {
                snsCoverReportStruct.f60518e = z17 ? 1 : 2;
            }
            if (snsCoverReportStruct != null) {
                snsCoverReportStruct.f60533t = java.lang.System.currentTimeMillis();
            }
            com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct2 = this.f18696a;
            if (snsCoverReportStruct2 != null) {
                snsCoverReportStruct2.k();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverPageReporter");
    }
}
