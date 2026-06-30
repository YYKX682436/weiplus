package pc0;

@j95.b
/* loaded from: classes4.dex */
public final class g extends i95.w implements ci0.r {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f434790d = jz5.h.b(pc0.f.f434783d);

    /* renamed from: e, reason: collision with root package name */
    public final pc0.e f434791e = new pc0.e(this);

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordVideo.CameraEditorReportFeatureService", "onAccountInitialized");
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).Zi(this.f434791e);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        jz5.g gVar = this.f434790d;
        long q17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).q("setting_image_video_status_last_report_time_ms", 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordVideo.CameraEditorReportFeatureService", "reportImageVideoSaveSettingStatusIfNeed lastReportTimeMs:" + q17 + " currentTimeMs:" + currentTimeMillis);
        if (q17 > 0 && currentTimeMillis - q17 <= 43200000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordVideo.CameraEditorReportFeatureService", "reportImageVideoSaveSettingStatusIfNeed skip, lastReportTimeMs:" + q17);
            return;
        }
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
        boolean o18 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true);
        int i17 = ((u24.h) ((ct.c3) i95.n0.c(ct.c3.class))).wi() ? 2 : 1;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("setting_image_video_status_polling", kz5.c1.k(new jz5.l("setting_general_image_status", java.lang.Integer.valueOf(o17 ? 1 : 0)), new jz5.l("setting_general_video_status", java.lang.Integer.valueOf(o18 ? 1 : 0)), new jz5.l("ui_version", java.lang.Integer.valueOf(i17))), 33328);
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).B("setting_image_video_status_last_report_time_ms", currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordVideo.CameraEditorReportFeatureService", "reportImageVideoSaveSettingStatus storedReportTimeMs:" + currentTimeMillis + " imageStatus:" + (o17 ? 1 : 0) + " videoStatus:" + (o18 ? 1 : 0) + " uiVersion:" + i17);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordVideo.CameraEditorReportFeatureService", "onAccountReleased");
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).mj(this.f434791e);
    }

    public void wi(java.lang.String videoPath, long j17, java.lang.String toUserName, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUserName, "toUserName");
        nu3.e eVar = nu3.e.f421731a;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(toUserName);
        eVar.e(toUserName);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6356x1502e0ef d17 = eVar.d(2, j17, toUserName, i17);
        d17.f137069i = i18 > 0 ? 1 : 0;
        if (d17.f137067g == 3) {
            nu3.e.f421735e = eVar.c(videoPath);
        }
        nu3.b bVar = nu3.e.f421735e;
        if (bVar != null) {
            d17.f137077q = d17.b("OriginalContentInformation", bVar.g(), true);
        }
        nu3.b bVar2 = nu3.e.f421736f;
        if (bVar2 != null) {
            d17.p(bVar2.g());
        }
        d17.f137079s = d17.b("SendContentInformation", eVar.c(videoPath).g(), true);
        d17.k();
        eVar.a();
    }
}
