package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.a f246359a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.a();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 provider, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealRecordEntrance", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        if (i17 == 1) {
            provider.a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout");
        } else if (i17 == 2) {
            provider.a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveShieldCameraKitPluginLayout");
        } else if (i17 == 3) {
            provider.a(0, "com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout");
        } else if (i17 == 4) {
            provider.a(0, "com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout");
            provider.M.putInt("key_camera_light_type", 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealRecordEntrance", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
    }

    public final boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableUseMusicPickerV2", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        boolean z17 = false;
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_EDIT_VIDEO_EDIT_MUSIC_V2_INT_SYNC, 0);
        if (r17 != 1) {
            if (r17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_musicdrawer_v2, true);
            } else {
                z17 = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoCompositionConfig", "enableUseMusicPickerV2 " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableUseMusicPickerV2", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return z17;
    }

    public final boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAlbumVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Media_SnsAlbumUseVideoComposition_Int, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoCompositionConfig", "getSnsAlbumVideoCompositionSwitch: true, repairConfig: " + g17);
        if (g17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAlbumVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return true;
        }
        boolean z17 = g17 == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAlbumVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return z17;
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 provider) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsRecordVideoCompositionProvider", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        int i17 = i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoCompositionConfig", "getSnsRecordVideoCompositionProvider >> " + i17);
        fu3.e eVar = fu3.e.f348413a;
        if (i17 > 0) {
            a(provider, i17);
            provider.M.putInt("key_camera_instance", f());
            provider.M.putBoolean("key_record_keep_ratio", true);
            provider.M.putInt("key_maas_template_scene", 7);
            provider.a(2, "com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout");
            if (eVar.a()) {
                provider.a(1, "com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveRecordEditPhotoPluginLayout");
            } else {
                provider.a(1, "com.tencent.mm.plugin.recordvideo.plugin.parent.RecordEditPhotoPluginLayout");
            }
        } else {
            if (t94.a.f498116a.a()) {
                provider.a(0, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2218xc8466c51.C18381x7c15b666.class.getName());
                na4.g gVar = na4.g.f417522a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateResolutionRadioConfig$default", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                na4.a a17 = gVar.a(-1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateResolutionRadioConfig$default", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                na4.g.f417523b = a17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            }
            if (e()) {
                provider.a(2, "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout");
            }
            if (eVar.a()) {
                provider.a(1, "com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsRecordVideoCompositionProvider", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
    }

    public final boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsRecordVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Media_SnsRecordUseVideoComposition_Int, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoCompositionConfig", "SnsRecordVideoCompositionSwitch: true, repairConfig: " + g17);
        if (g17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsRecordVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return true;
        }
        boolean z17 = g17 == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsRecordVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return z17;
    }

    public final int f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("improveUseCameraKitInstance", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        java.lang.Object b17 = bm5.o1.f104252a.b(bm5.h0.RepairerConfig_Camera_CameraKitImproveInstance_Int, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) b17).intValue();
        if (intValue == 0) {
            intValue = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_camera_improve_camera_instance, 3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("improveUseCameraKitInstance", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return intValue;
    }

    public final boolean g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsAlbumBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        boolean c17 = c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoCompositionConfig", "isSnsAlbumBackgroundRemux >> videoCompositionSwitch " + c17);
        if (!c17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsAlbumBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAlbumVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_album_video_remux_background_v2, true);
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Media_SnsAlbumBackgroundRemux_Int, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoCompositionConfig", "getSnsAlbumVideoRemuxBackgroundSwitch: " + fj6 + ", repairConfig: " + g17);
        if (g17 != 0) {
            boolean z17 = g17 == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAlbumVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            fj6 = z17;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAlbumVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoCompositionConfig", "isSnsAlbumBackgroundRemux >> backGroundSwitch " + fj6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsAlbumBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return fj6;
    }

    public final boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsRecordBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        boolean e17 = e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoCompositionConfig", "isSnsRecordBackgroundRemux >> videoCompositionSwitch " + e17);
        if (!e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsRecordBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsRecordVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_record_video_remux_background_v2, true);
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Media_SnsRecordBackgroundRemux_Int, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoCompositionConfig", "getSnsAlbumVideoRemuxBackgroundSwitch: " + fj6 + ", repairConfig: " + g17);
        if (g17 != 0) {
            boolean z17 = g17 == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsRecordVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            fj6 = z17;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsRecordVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoCompositionConfig", "isSnsRecordBackgroundRemux >> backGroundSwitch " + fj6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsRecordBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return fj6;
    }

    public final int i() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useProfessionalRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        java.lang.Object b17 = bm5.o1.f104252a.b(bm5.h0.RepairerConfig_Camera_CameraKitIsUseImproveILayout_Int, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) b17).intValue();
        int i17 = 2;
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useProfessionalRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
                return intValue;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useProfessionalRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return 0;
        }
        if (com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useProfessionalRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return 0;
        }
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.g.f246385b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkModelIsInBlackList", "com.tencent.mm.plugin.sns.statistics.ImproveCameraDeviceUtil");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.g.f246386c || currentTimeMillis - com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.g.f246384a >= 3600000) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeBlackModelsWithConfig", "com.tencent.mm.plugin.sns.statistics.ImproveCameraDeviceUtil");
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_camerakit_black_model, "", true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Zi, "getExpt(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveCameraDeviceUtil", "changeBlackModelsWithConfig ".concat(Zi));
            if (Zi.length() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.g.f246385b = r26.n0.f0(Zi, new java.lang.String[]{";"}, false, 0, 6, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeBlackModelsWithConfig", "com.tencent.mm.plugin.sns.statistics.ImproveCameraDeviceUtil");
            java.lang.String str = android.os.Build.MANUFACTURER;
            java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.g.f246385b.iterator();
            while (it.hasNext()) {
                if (r26.i0.p((java.lang.String) it.next(), str, true)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.g.f246387d = true;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.g.f246386c = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.g.f246384a = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveCameraDeviceUtil", "checkModelIsInBlackList >> " + str + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.g.f246387d);
            z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.g.f246387d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkModelIsInBlackList", "com.tencent.mm.plugin.sns.statistics.ImproveCameraDeviceUtil");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveCameraDeviceUtil", "checkModelIsInBlackList >> isCheck " + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.g.f246387d);
            z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.g.f246387d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkModelIsInBlackList", "com.tencent.mm.plugin.sns.statistics.ImproveCameraDeviceUtil");
        }
        if (!z17 && nr0.a.f420597a.a()) {
            i17 = 1;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_camerakit_use_professional, false);
        int i18 = fj6 ? z17 ? 4 : 3 : i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoCompositionConfig", "useProfessionalRecord >> " + z17 + ' ' + i17 + ' ' + fj6 + ' ' + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useProfessionalRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return i18;
    }
}
