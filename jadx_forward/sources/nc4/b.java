package nc4;

/* loaded from: classes4.dex */
public final class b implements nc4.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f417653a;

    public b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f417653a = context;
    }

    @Override // nc4.c
    public db5.h4 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        int mo149391x368f3a = mo149391x368f3a();
        android.content.Context context = this.f417653a;
        db5.h4 h4Var = new db5.h4(context, mo149391x368f3a, 0);
        h4Var.f309901i = i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571948uc);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        return h4Var;
    }

    @Override // nc4.c
    public java.lang.Object b(yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        boolean l17 = gm0.j1.u().l();
        jz5.f0 f0Var = jz5.f0.f384359a;
        android.content.Context context = this.f417653a;
        if (!l17) {
            db5.t7.k(context, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
            return f0Var;
        }
        lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        if (r26.i0.p(context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getString("gallery", "1"), "0", true)) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.h((android.app.Activity) context, 2, null);
        } else {
            int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsCanPickVideoFromAlbum", 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumEntrance", "takeVideo %d", new java.lang.Integer(b17));
            boolean z17 = x51.o1.f533575a;
            int i18 = b17 != 0 ? 3 : 1;
            android.content.Intent intent = new android.content.Intent();
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_enable_vlog, false);
            ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
            boolean h17 = ez0.o.f339368a.h();
            boolean a17 = pc4.e.f434959a.a();
            intent.putExtra("Gallery_LivePhoto_Need_Query", a17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumEntrance", "enableSnsTemplate: " + h17 + " canPostLivePhoto: " + a17);
            if (h17) {
                i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_num, 20);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + i17);
            } else {
                i17 = 9;
            }
            int i19 = i17;
            intent.putExtra("key_can_select_video_and_pic", !(gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || fj6 || h17));
            intent.putExtra("key_edit_video_max_time_length", d11.s.fj().nj().f152728h);
            intent.putExtra("key_sns_publish_template", h17);
            intent.putExtra("key_filter_hdr_video", h17);
            intent.putExtra("gallery_report_tag", 4);
            intent.putExtra("key_check_third_party_video", true);
            intent.putExtra("KSnsFrom", 1);
            intent.putExtra("record_video_is_sight_capture", true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a.c(14);
            android.app.Activity activity = (android.app.Activity) context;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCancelCameraSheet", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
            boolean h18 = ih.a.h("clicfg_sns_cancel_camera_sheet", false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCancelCameraSheet", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c(activity, 14, i19, 4, i18, h18, intent);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCancelCameraSheet", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
            boolean h19 = ih.a.h("clicfg_sns_cancel_camera_sheet", false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCancelCameraSheet", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
            if (h19) {
                activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        return f0Var;
    }

    @Override // nc4.c
    /* renamed from: onActivityResult */
    public void mo149389x9d4787cb(int i17, int i18, android.content.Intent intent) {
        android.graphics.Bitmap frameAtTime;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        if (i18 != -1 || intent == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
            return;
        }
        if (i17 == 14) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.i0 i0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a;
            android.content.Context context = this.f417653a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            i0Var.f(activity);
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.class);
            intent2.putExtra("KSnsFrom", 14);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(nc4.a.f417651d);
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
            ca4.z0.C0(intent.getStringExtra("KSEGMENTMEDIAEDITID"));
            if ((stringArrayListExtra != null && stringArrayListExtra.size() > 0) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(intent.getStringExtra("K_SEGMENTVIDEOPATH"))) {
                java.lang.String stringExtra = (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) ? intent.getStringExtra("K_SEGMENTVIDEOPATH") : stringArrayListExtra.get(0);
                java.lang.String stringExtra2 = intent.getStringExtra("KSEGMENTVIDEOTHUMBPATH");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2) || !com.p314xaae8f345.mm.vfs.w6.j(stringExtra2)) {
                    java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ni() + com.p314xaae8f345.mm.vfs.w6.p(stringExtra);
                    gp.d dVar = new gp.d();
                    try {
                        try {
                            dVar.setDataSource(stringExtra);
                            zj0.a aVar = new zj0.a();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            aVar.c(0L);
                            yj0.a.d(dVar, aVar.b(), "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                            zj0.c.f554818a.set(aVar);
                            long longValue = ((java.lang.Long) aVar.a(0)).longValue();
                            zj0.c.a();
                            frameAtTime = dVar.getFrameAtTime(longValue);
                            yj0.a.e(dVar, frameAtTime, "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlbumEntrance", "savebitmap error %s", e17.getMessage());
                        }
                        if (frameAtTime == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlbumEntrance", "get bitmap error");
                            try {
                                dVar.release();
                            } catch (java.lang.Exception unused) {
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
                            return;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumEntrance", "getBitmap1 %d %d", java.lang.Integer.valueOf(frameAtTime.getWidth()), java.lang.Integer.valueOf(frameAtTime.getHeight()));
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(frameAtTime, 80, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                            android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumEntrance", "getBitmap2 %d %d", java.lang.Integer.valueOf(n07.outWidth), java.lang.Integer.valueOf(n07.outHeight));
                            try {
                                dVar.release();
                            } catch (java.lang.Exception unused2) {
                            }
                            stringExtra2 = str;
                        }
                    } catch (java.lang.Throwable th6) {
                        try {
                            dVar.release();
                        } catch (java.lang.Exception unused3) {
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
                        throw th6;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumEntrance", "video path %s thumb path %s and %s %s ", stringExtra, stringExtra2, java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(stringExtra)), java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(stringExtra2)));
                intent2.putExtra("key_extra_data", intent.getBundleExtra("key_extra_data"));
                intent2.putExtra("KSightPath", stringExtra);
                intent2.putExtra("KSightThumbPath", stringExtra2);
                intent2.putExtra("sight_md5", com.p314xaae8f345.mm.vfs.w6.p(stringExtra));
                intent2.putExtra("KSnsPostManu", true);
                intent2.putExtra("KTouchCameraTime", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                intent2.putExtra("Ksnsupload_type", 14);
                intent2.putExtra("KSnsVideoTempalteInfo", intent.getByteArrayExtra("key_video_template_info"));
                if (intent.hasExtra("key_extra_data")) {
                    android.os.Bundle bundleExtra = intent.getBundleExtra("key_extra_data");
                    if (bundleExtra != null && bundleExtra.containsKey("key_composition_info")) {
                        intent2.putExtra("key_composition_info", bundleExtra.getByteArray("key_composition_info"));
                    }
                    if (bundleExtra != null && bundleExtra.containsKey("key_edit_video_bgm_listen_id") && bundleExtra.containsKey("key_edit_video_bgm_is_major_owned")) {
                        intent2.putExtra("key_edit_video_bgm_listen_id", bundleExtra.getString("key_edit_video_bgm_listen_id"));
                        intent2.putExtra("key_edit_video_bgm_is_major_owned", bundleExtra.getBoolean("key_edit_video_bgm_is_major_owned"));
                    }
                }
                intent2.putExtra("Kis_take_photo", false);
                dw3.u0.f325816a.b(intent2, intent);
                android.content.Context context2 = this.f417653a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
                return;
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("CropImage_OutputPath_List");
            java.util.ArrayList<? extends android.os.Parcelable> mediaList = intent.getParcelableArrayListExtra("key_select_multi_pic_item");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("imagePathSize: ");
            sb6.append(stringArrayListExtra2 != null ? java.lang.Integer.valueOf(stringArrayListExtra2.size()) : null);
            sb6.append(" liveItemList: ");
            sb6.append(mediaList != null ? java.lang.Integer.valueOf(mediaList.size()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumEntrance", sb6.toString());
            if (stringArrayListExtra2 == null || stringArrayListExtra2.isEmpty()) {
                if (mediaList == null || mediaList.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumEntrance", "no image selected");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
                    return;
                }
            }
            if (!(stringArrayListExtra2 == null || stringArrayListExtra2.isEmpty())) {
                i0Var.e(stringArrayListExtra2);
            }
            if (!(mediaList == null || mediaList.isEmpty())) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportYuanBaoEvent", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
                ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.f0(mediaList));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportYuanBaoEvent", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            }
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
            intent2.putExtra("KSnsPostManu", true);
            intent2.putExtra("KTouchCameraTime", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
            int intExtra = intent.getIntExtra("CropImage_filterId", 0);
            intent2.putExtra("sns_kemdia_path_list", stringArrayListExtra2);
            if (pc4.d.f434943a.B()) {
                intent2.putParcelableArrayListExtra("KMulti_Pic_Item_List", mediaList);
            }
            intent2.putExtra("KFilterId", intExtra);
            intent2.putStringArrayListExtra("sns_media_latlong_list", arrayList2);
            intent2.getIntExtra("Ksnsupload_type", -1);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(6);
            arrayList3.add(intent2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.k(activity, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
    }

    @Override // nc4.c
    /* renamed from: show */
    public boolean mo149390x35dafd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        return true;
    }

    @Override // nc4.c
    /* renamed from: type */
    public int mo149391x368f3a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        int h17 = nc4.d.f417657f.h();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        return h17;
    }
}
