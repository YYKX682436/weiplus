package ox;

@j95.b
/* loaded from: classes11.dex */
public final class z extends i95.w implements tk.r {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f431071e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f431072f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f431073g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile int f431074h;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f431075d = jz5.h.b(ox.u.f431055d);

    static {
        new ox.t(null);
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_IMAGE_H5_ENTRY;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 h2Var2 = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_IMAGE_TOPBAR_ENTRY;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 h2Var3 = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_TOPIC_AGGREGATION;
        f431071e = kz5.z.D0(new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2[]{h2Var, h2Var2, h2Var3});
        f431072f = kz5.c1.k(new jz5.l("image_h5_entry", h2Var), new jz5.l("image_topbar_entry", h2Var2), new jz5.l("underline_forward", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_UNDERLINE_FORWARD), new jz5.l("comment_forward", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_COMMENT_FORWARD), new jz5.l("underline_comment_forward", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_UNDERLINE_COMMENT_FORWARD), new jz5.l("comment_register", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_COMMENT_REGISTER), new jz5.l("order_register", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_ORDER_REGISTER), new jz5.l("topic_aggregation", h2Var3), new jz5.l("weapp_image", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_WEAPP_IMAGE), new jz5.l("weapp_sync_content", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_WEAPP_SYNC_CONTENT), new jz5.l("weapp_topic_entry", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_WEAPP_TOPIC_ENTRY), new jz5.l("traffic_boost", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_TRAFFIC_BOOST), new jz5.l("annual_2025", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_ANNUAL_2025), new jz5.l("gold_comment_register", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_GOLD_COMMENT_REGISTER), new jz5.l("redpacket_add_decoration", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_REDPACKET_ADD_DECORATION), new jz5.l("redpacket_share_cover", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_REDPACKET_SHARE_COVER), new jz5.l("change_identity_register", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_CHANGE_IDENTITY_REGISTER), new jz5.l("preview_publish", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PREVIEW_PUBLISH), new jz5.l("biz_sys_image_share", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_BIZ_SYS_IMAGE_SHARE), new jz5.l("comment_img_tips", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_COMMENT_IMG_TIPS), new jz5.l("growth_footprints", com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_GROWTH_FOOTPRINTS));
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x0519, code lost:
    
        if ((r4[r1] ? r3.f299445o : new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w3()).f300285d == 0) goto L184;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b2 wi(ox.z r26, l81.b1 r27) {
        /*
            Method dump skipped, instructions count: 2235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox.z.wi(ox.z, l81.b1):com.tencent.wechat.mm.biz.b2");
    }

    public boolean Ai(android.content.Context context, l81.b1 openBundle, rv.e3 e3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openBundle, "openBundle");
        tk.a Bi = Bi(openBundle);
        boolean z17 = Bi.f501390a;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 h2Var = Bi.f501391b;
        if (!z17) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b5 Zi = Zi(h2Var);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6694x88b1294c c6694x88b1294c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6694x88b1294c();
            c6694x88b1294c.f140316d = 1002;
            c6694x88b1294c.f140320h = h2Var.f299668d;
            c6694x88b1294c.f140324l = Zi.f299460d;
            c6694x88b1294c.k();
            return false;
        }
        new java.lang.Thread(new ox.x(this, openBundle, context, e3Var)).start();
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b5 Zi2 = Zi(h2Var);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6694x88b1294c c6694x88b1294c2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6694x88b1294c();
        c6694x88b1294c2.f140316d = 1001;
        c6694x88b1294c2.f140320h = h2Var.f299668d;
        c6694x88b1294c2.f140324l = Zi2.f299460d;
        c6694x88b1294c2.k();
        return true;
    }

    public tk.a Bi(l81.b1 openBundle) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openBundle, "openBundle");
        boolean z17 = false;
        tk.a aVar = new tk.a(false, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_UNKNOWN);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(openBundle.f398547b, "wx0b2ec076ec39c786")) {
            java.lang.String enterPath = openBundle.f398555f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enterPath, "enterPath");
            if (r26.i0.y(enterPath, "pages/image_editor/image_editor.html", false)) {
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 bj6 = bj(openBundle);
                tk.a aVar2 = new tk.a(aVar.f501390a, bj6);
                if (!kz5.c0.i(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PERSONAL_CENTER, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PROFILE, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_WECHAT_ME_ENTRY, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PHOTO_ACCOUNT_PERSONAL_CENTER, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PHOTO_ACCOUNT_PROFILE, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_OFFICIAL_ACCOUNT_LOOK, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PHOTO_ACCOUNT_ME_TAB, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_IMAGE_H5_ENTRY, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_IMAGE_TOPBAR_ENTRY, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_UNDERLINE_FORWARD, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_COMMENT_FORWARD, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_UNDERLINE_COMMENT_FORWARD, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PUBLISH_BAR_FAIL, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_TOPIC_AGGREGATION, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_MOMENTS_POI_ENTRY, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PRODUCT_REVIEW_SYNC, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PUBLISH_BAR_FAIL_ONCE, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_APP_MODIFY, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_MOMENTS_POI_DETAIL, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_LANDING_PAGE_MODIFY, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_BIZ_SYS_IMAGE_SHARE).contains(bj6)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "checkUseNewImageEditorWithOpenBundle, scene not allowed:" + bj6);
                    return aVar2;
                }
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                    if (!f431073g) {
                        f431073g = true;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                            try {
                                o4Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("biz_publish_debug");
                            } catch (java.lang.Throwable unused) {
                                o4Var = null;
                            }
                            if (o4Var != null) {
                                try {
                                    i17 = o4Var.getInt("k_native_editor_debug_mode", 0);
                                } catch (java.lang.Throwable th6) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizPublishRichEditorService", "debugNativeEditorMode: lazy restore error=" + th6);
                                }
                            } else {
                                i17 = 0;
                            }
                            f431074h = i17;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "debugNativeEditorMode: lazy restored from MMKV=" + f431074h);
                        }
                    }
                    int i18 = f431074h;
                    if (i18 == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "checkNewImageEditorExpt: debug force enabled, scene " + bj6);
                        z17 = true;
                        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 scene = aVar2.f501391b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
                        tk.a aVar3 = new tk.a(z17, scene);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "scene " + bj6 + ", isEnabled: " + z17);
                        return aVar3;
                    }
                    if (i18 == 2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "checkNewImageEditorExpt: debug force disabled, scene " + bj6);
                        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 scene2 = aVar2.f501391b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene2, "scene");
                        tk.a aVar32 = new tk.a(z17, scene2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "scene " + bj6 + ", isEnabled: " + z17);
                        return aVar32;
                    }
                }
                java.util.List list = ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).f431008h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "checkNewImageEditorExpt: enabledSceneExpt=" + list + ", scene=" + bj6 + ", scene.value=" + bj6.f299668d);
                if (!list.contains(java.lang.Integer.valueOf(bj6.f299668d))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "checkNewImageEditorExpt: scene " + bj6.f299668d + " is not enabled");
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 scene22 = aVar2.f501391b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene22, "scene");
                    tk.a aVar322 = new tk.a(z17, scene22);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "scene " + bj6 + ", isEnabled: " + z17);
                    return aVar322;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "checkNewImageEditorExpt: scene " + bj6.f299668d + " is enabled");
                z17 = true;
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 scene222 = aVar2.f501391b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene222, "scene");
                tk.a aVar3222 = new tk.a(z17, scene222);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "scene " + bj6 + ", isEnabled: " + z17);
                return aVar3222;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "checkUseNewImageEditorWithOpenBundle: appid or path not match");
        return aVar;
    }

    public boolean Di(java.lang.String sceneSubPath, int i17, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneSubPath, "sceneSubPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        int i18 = f431071e.contains(scene) ? 1 : i17;
        boolean a17 = com.p314xaae8f345.p3133xd0ce8b26.iam.biz.o0.f299296b.a(sceneSubPath, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPublishRichEditorService", "hasDraft: " + a17 + ", sceneSubPath: " + sceneSubPath + ", bizType: " + i17 + ", scene： " + scene + ", effectiveBizType: " + i18);
        return a17;
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 Ni(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("from", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (optString.length() == 0) {
                return null;
            }
            return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2) f431072f.get(optString);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4 A[Catch: Exception -> 0x01d8, TryCatch #0 {Exception -> 0x01d8, blocks: (B:17:0x00c2, B:19:0x00d6, B:25:0x00e4, B:27:0x00f9, B:29:0x011a, B:30:0x0120, B:31:0x0171, B:33:0x0181, B:38:0x018d, B:40:0x0193, B:41:0x0197, B:42:0x019c, B:45:0x01a7, B:46:0x01ab, B:48:0x01b7, B:49:0x01b9, B:56:0x0127, B:58:0x013d, B:63:0x0149, B:65:0x014f, B:70:0x015b, B:72:0x0161, B:74:0x0167, B:75:0x016d), top: B:16:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018d A[Catch: Exception -> 0x01d8, TryCatch #0 {Exception -> 0x01d8, blocks: (B:17:0x00c2, B:19:0x00d6, B:25:0x00e4, B:27:0x00f9, B:29:0x011a, B:30:0x0120, B:31:0x0171, B:33:0x0181, B:38:0x018d, B:40:0x0193, B:41:0x0197, B:42:0x019c, B:45:0x01a7, B:46:0x01ab, B:48:0x01b7, B:49:0x01b9, B:56:0x0127, B:58:0x013d, B:63:0x0149, B:65:0x014f, B:70:0x015b, B:72:0x0161, B:74:0x0167, B:75:0x016d), top: B:16:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a7 A[Catch: Exception -> 0x01d8, TRY_ENTER, TryCatch #0 {Exception -> 0x01d8, blocks: (B:17:0x00c2, B:19:0x00d6, B:25:0x00e4, B:27:0x00f9, B:29:0x011a, B:30:0x0120, B:31:0x0171, B:33:0x0181, B:38:0x018d, B:40:0x0193, B:41:0x0197, B:42:0x019c, B:45:0x01a7, B:46:0x01ab, B:48:0x01b7, B:49:0x01b9, B:56:0x0127, B:58:0x013d, B:63:0x0149, B:65:0x014f, B:70:0x015b, B:72:0x0161, B:74:0x0167, B:75:0x016d), top: B:16:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b7 A[Catch: Exception -> 0x01d8, TryCatch #0 {Exception -> 0x01d8, blocks: (B:17:0x00c2, B:19:0x00d6, B:25:0x00e4, B:27:0x00f9, B:29:0x011a, B:30:0x0120, B:31:0x0171, B:33:0x0181, B:38:0x018d, B:40:0x0193, B:41:0x0197, B:42:0x019c, B:45:0x01a7, B:46:0x01ab, B:48:0x01b7, B:49:0x01b9, B:56:0x0127, B:58:0x013d, B:63:0x0149, B:65:0x014f, B:70:0x015b, B:72:0x0161, B:74:0x0167, B:75:0x016d), top: B:16:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127 A[Catch: Exception -> 0x01d8, TryCatch #0 {Exception -> 0x01d8, blocks: (B:17:0x00c2, B:19:0x00d6, B:25:0x00e4, B:27:0x00f9, B:29:0x011a, B:30:0x0120, B:31:0x0171, B:33:0x0181, B:38:0x018d, B:40:0x0193, B:41:0x0197, B:42:0x019c, B:45:0x01a7, B:46:0x01ab, B:48:0x01b7, B:49:0x01b9, B:56:0x0127, B:58:0x013d, B:63:0x0149, B:65:0x014f, B:70:0x015b, B:72:0x0161, B:74:0x0167, B:75:0x016d), top: B:16:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149 A[Catch: Exception -> 0x01d8, TryCatch #0 {Exception -> 0x01d8, blocks: (B:17:0x00c2, B:19:0x00d6, B:25:0x00e4, B:27:0x00f9, B:29:0x011a, B:30:0x0120, B:31:0x0171, B:33:0x0181, B:38:0x018d, B:40:0x0193, B:41:0x0197, B:42:0x019c, B:45:0x01a7, B:46:0x01ab, B:48:0x01b7, B:49:0x01b9, B:56:0x0127, B:58:0x013d, B:63:0x0149, B:65:0x014f, B:70:0x015b, B:72:0x0161, B:74:0x0167, B:75:0x016d), top: B:16:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b A[Catch: Exception -> 0x01d8, TryCatch #0 {Exception -> 0x01d8, blocks: (B:17:0x00c2, B:19:0x00d6, B:25:0x00e4, B:27:0x00f9, B:29:0x011a, B:30:0x0120, B:31:0x0171, B:33:0x0181, B:38:0x018d, B:40:0x0193, B:41:0x0197, B:42:0x019c, B:45:0x01a7, B:46:0x01ab, B:48:0x01b7, B:49:0x01b9, B:56:0x0127, B:58:0x013d, B:63:0x0149, B:65:0x014f, B:70:0x015b, B:72:0x0161, B:74:0x0167, B:75:0x016d), top: B:16:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0161 A[Catch: Exception -> 0x01d8, TryCatch #0 {Exception -> 0x01d8, blocks: (B:17:0x00c2, B:19:0x00d6, B:25:0x00e4, B:27:0x00f9, B:29:0x011a, B:30:0x0120, B:31:0x0171, B:33:0x0181, B:38:0x018d, B:40:0x0193, B:41:0x0197, B:42:0x019c, B:45:0x01a7, B:46:0x01ab, B:48:0x01b7, B:49:0x01b9, B:56:0x0127, B:58:0x013d, B:63:0x0149, B:65:0x014f, B:70:0x015b, B:72:0x0161, B:74:0x0167, B:75:0x016d), top: B:16:0x00c2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ri(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b2 r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox.z.Ri(com.tencent.wechat.mm.biz.b2, java.lang.String):void");
    }

    public final void Ui(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b2 b2Var) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w4 oj6 = ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).oj();
        if (oj6 == null) {
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p1 p1Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.p1();
        p1Var.f299975d = oj6.f300290d;
        boolean[] zArr = p1Var.f299977f;
        zArr[1] = true;
        p1Var.f299976e = oj6.f300291e;
        zArr[2] = true;
        b2Var.f299447q = p1Var;
        b2Var.f299449s[11] = true;
    }

    public final java.lang.String Vi() {
        return (java.lang.String) ((jz5.n) this.f431075d).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b5 Zi(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 h2Var) {
        int ordinal = h2Var.ordinal();
        if (ordinal != 1 && ordinal != 2) {
            if (ordinal != 18) {
                if (ordinal != 21) {
                    switch (ordinal) {
                        case 29:
                        case 30:
                        case 31:
                            break;
                        default:
                            return com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b5.PUBLISH_BIZ_TYPE_DEFAULT;
                    }
                }
            }
            return com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b5.PUBLISH_BIZ_TYPE_PHOTO;
        }
        return com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b5.PUBLISH_BIZ_TYPE_SUBSCRIBE;
    }

    public final org.json.JSONObject aj(com.p314xaae8f345.p2845xc516c4b6.biz.C23224xb35c11ea c23224xb35c11ea, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String m85433xb3b46542 = c23224xb35c11ea.m85433xb3b46542();
        if (m85433xb3b46542 != null) {
            jSONObject.put(str, m85433xb3b46542);
        }
        java.lang.Long m85434x755bd410 = c23224xb35c11ea.m85434x755bd410();
        if (m85434x755bd410 != null) {
            jSONObject.put("width", m85434x755bd410.longValue());
        }
        java.lang.Long m85432x1c4fb41d = c23224xb35c11ea.m85432x1c4fb41d();
        if (m85432x1c4fb41d != null) {
            jSONObject.put("height", m85432x1c4fb41d.longValue());
        }
        return jSONObject;
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 bj(l81.b1 b1Var) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 h2Var;
        java.lang.String str = b1Var.f398555f;
        if (str == null) {
            str = "";
        }
        if (r26.n0.B(str, "from=app_modify", false) || r26.n0.B(str, "from=landPage_modify", false)) {
            return com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_APP_MODIFY;
        }
        if (r26.n0.B(str, "from=publish_bar_fail", false)) {
            return com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PUBLISH_BAR_FAIL;
        }
        int i17 = b1Var.f398565k;
        if (i17 == 1069) {
            h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_WECHAT_OPENSDK_ENTRY;
        } else if (i17 == 1396) {
            h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_WECHAT_ME_ENTRY;
        } else if (i17 == 1401) {
            h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_IMAGE_SHARE_MENU;
        } else if (i17 == 1338) {
            h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PROFILE;
        } else if (i17 == 1339) {
            h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PERSONAL_CENTER;
        } else if (i17 == 1384) {
            h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_OFFICIAL_ACCOUNT_LOOK;
        } else if (i17 == 1385) {
            h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_MOMENTS_POI_ENTRY;
        } else if (i17 == 1388) {
            h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_GAME_CIRCLE_SYNC;
        } else if (i17 == 1389) {
            h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PRODUCT_REVIEW_SYNC;
        } else if (i17 == 1410) {
            h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_MOMENTS_POI_WATERFALL;
        } else if (i17 == 1411) {
            h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_MOMENTS_POI_DETAIL;
        } else if (i17 == 1418) {
            h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_REDPACKET_COVER_SHARE;
        } else if (i17 != 1419) {
            switch (i17) {
                case 1413:
                    h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PHOTO_ACCOUNT_PERSONAL_CENTER;
                    break;
                case 1414:
                    h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PHOTO_ACCOUNT_PROFILE;
                    break;
                case 1415:
                    h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_PHOTO_ACCOUNT_ME_TAB;
                    break;
                case 1416:
                    h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_REDPACKET_STICKER_SELECTOR;
                    break;
                default:
                    h2Var = null;
                    break;
            }
        } else {
            h2Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_REDPACKET_DECORATION_SELECTION;
        }
        if (h2Var != null) {
            return h2Var;
        }
        l81.p0 p0Var = b1Var.f398561i;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 Ni = Ni(p0Var != null ? p0Var.a() : null);
        if (Ni != null) {
            return Ni;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = b1Var.f398574s;
        if (c11812xa040dc98 != null) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 Ni2 = Ni(c11812xa040dc98.f158857f);
            if (Ni2 != null) {
                return Ni2;
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2 Ni3 = Ni(c11812xa040dc98.f158858g);
            if (Ni3 != null) {
                return Ni3;
            }
        }
        return com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h2.PUBLISH_SCENE_UNKNOWN;
    }
}
