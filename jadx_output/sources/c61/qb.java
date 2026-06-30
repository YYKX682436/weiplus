package c61;

/* loaded from: classes11.dex */
public final class qb implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.mm_foundation.RouterPluginApi, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f39271d;

    @Override // com.tencent.pigeon.mm_foundation.RouterPluginApi
    public void launchAppChooser(com.tencent.pigeon.mm_foundation.AppChooserLaunchRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchAppChooser(filePath=" + request.getFilePath() + ", fileExt=" + request.getFileExt() + ", fileName=" + request.getFileName() + ')');
        android.app.Activity activity = this.f39271d;
        if (activity == null) {
            return;
        }
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        java.lang.String fileName = request.getFileName();
        if (fileName == null) {
            fileName = "";
        }
        java.lang.String str = fileName;
        if (!(str.length() > 0)) {
            ((ht.a) vVar).wi(activity, request.getFilePath(), request.getFileExt(), 1);
            return;
        }
        java.lang.String filePath = request.getFilePath();
        java.lang.String fileExt = request.getFileExt();
        ((ht.a) vVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.f.i(activity, 0L, "", filePath, fileExt, str, 1);
    }

    @Override // com.tencent.pigeon.mm_foundation.RouterPluginApi
    public void launchBizArticle(com.tencent.pigeon.mm_foundation.BizArticleLaunchRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchBizArticle(url=" + request.getUrl() + ", username=" + request.getUsername() + ", srcUsername=" + request.getSrcUsername() + ", appId=" + request.getAppId() + ", itemShowType=" + request.getItemShowType() + ')');
        android.app.Activity activity = this.f39271d;
        if (activity == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", request.getUrl());
        java.lang.String srcUsername = request.getSrcUsername();
        if (!(srcUsername == null || srcUsername.length() == 0)) {
            intent.putExtra("srcUsername", request.getSrcUsername());
            java.lang.String srcDisplayName = request.getSrcDisplayName();
            if (srcDisplayName == null) {
                srcDisplayName = "";
            }
            intent.putExtra("srcDisplayname", srcDisplayName);
        }
        java.lang.String appId = request.getAppId();
        if (!(appId == null || appId.length() == 0)) {
            intent.putExtra("KAppId", request.getAppId());
        }
        java.lang.Long itemShowType = request.getItemShowType();
        int longValue = (int) (itemShowType != null ? itemShowType.longValue() : -1L);
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        ((yq1.z) a0Var).getClass();
        if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(3)) {
            if (((yq1.z) a0Var).E(activity, request.getUrl(), longValue, false, 3, 0, intent)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchBizArticle: jump to TmplWebview (preloaded)");
                return;
            }
        }
        j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.pigeon.mm_foundation.RouterPluginApi
    public void launchBizTimeline() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchBizTimeline()");
        ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Zi();
    }

    @Override // com.tencent.pigeon.mm_foundation.RouterPluginApi
    public void launchDoubleLinkSettings() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchDoubleLinkSettings()");
        android.content.Intent intent = new android.content.Intent();
        android.app.Activity activity = this.f39271d;
        if (activity == null) {
            return;
        }
        intent.setClassName(activity, "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera");
        intent.putExtra("activity_caller_params", 1);
        intent.setFlags(268435456);
        android.app.Activity activity2 = this.f39271d;
        if (activity2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/plugin/FlutterRouterPlugin", "launchDoubleLinkSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity2, "com/tencent/mm/plugin/FlutterRouterPlugin", "launchDoubleLinkSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.tencent.pigeon.mm_foundation.RouterPluginApi
    public void launchFinderFeed(com.tencent.pigeon.mm_foundation.FinderFeedLaunchRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchFinderFeed(" + request.getFeedId() + ", " + request.getNonceId() + ')');
        android.app.Activity activity = this.f39271d;
        if (activity == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_user", c01.z1.r());
        intent.putExtra("feed_object_id", request.getFeedId());
        intent.putExtra("feed_object_nonceId", request.getNonceId());
        intent.putExtra("key_session_id", c01.id.a());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(33, 2, 25, intent);
        intent.putExtra("key_comment_scene", 25);
        intent.putExtra("key_extra_info", "");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.b(ya2.e1.f460472a, activity, intent, false, 4, null);
    }

    @Override // com.tencent.pigeon.mm_foundation.RouterPluginApi
    public void launchFinderProfile(com.tencent.pigeon.mm_foundation.FinderProfileLaunchRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchFinderProfile(" + request.getFinderUsername() + ')');
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("action", com.tencent.mm.plugin.appbrand.jsapi.finder.h0.NAME);
            jSONObject2.put("finderUserName", request.getFinderUsername());
            jSONObject.put("extInfo", jSONObject2);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f460472a;
            android.app.Activity activity = this.f39271d;
            if (activity == null) {
                return;
            }
            e1Var.F(activity, jSONObject.toString(), null, null);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterRouterPlugin", "launchFinderProfile failed: " + e17.getMessage());
        }
    }

    @Override // com.tencent.pigeon.mm_foundation.RouterPluginApi
    public void launchFinderTimeline() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchFinderTimeline()");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        android.app.Activity activity = this.f39271d;
        if (activity == null) {
            return;
        }
        e1Var.C(activity, null);
    }

    @Override // com.tencent.pigeon.mm_foundation.RouterPluginApi
    public void launchGallery(com.tencent.pigeon.mm_foundation.FlutterGalleryLaunchRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchGallery(mediaItems.size=" + request.getMediaItems().size() + ')');
        android.app.Activity activity = this.f39271d;
        if (activity == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : request.getMediaItems()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem flutterGalleryMediaItem = (com.tencent.pigeon.mm_foundation.FlutterGalleryMediaItem) obj;
            if (flutterGalleryMediaItem != null) {
                com.tencent.mm.feature.gallery.api.GalleryParams galleryParams = new com.tencent.mm.feature.gallery.api.GalleryParams();
                e60.v0 v0Var = new e60.v0(flutterGalleryMediaItem.getFilePath(), "", 0, null);
                java.lang.String mediaId = flutterGalleryMediaItem.getMediaId();
                kotlin.jvm.internal.o.g(mediaId, "<set-?>");
                galleryParams.f67106e = mediaId;
                galleryParams.f67107f = ((zh5.l0) ((e60.d1) i95.n0.c(e60.d1.class))).wi(v0Var);
                int i19 = c61.pb.f39234a[flutterGalleryMediaItem.getMediaType().ordinal()];
                int i27 = 1;
                if (i19 == 1) {
                    i27 = 0;
                } else if (i19 != 2) {
                    i27 = -1;
                }
                galleryParams.f67105d = i27;
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "Gallery media i=" + i17 + ", mediaId=" + flutterGalleryMediaItem.getMediaId() + ", type=" + galleryParams.f67105d + ", mediaUri=" + galleryParams.f67107f);
                arrayList.add(galleryParams);
            }
            i17 = i18;
        }
        com.tencent.pigeon.mm_foundation.FlutterGalleryMediaRect enterRect = request.getEnterRect();
        e60.t0 t0Var = new e60.t0(null, 0, 0, (int) request.getEnterIndex(), false, false, new e60.u0((int) enterRect.getLeft(), (int) enterRect.getTop(), (int) (enterRect.getRight() - enterRect.getLeft()), (int) (enterRect.getBottom() - enterRect.getTop())), 55, null);
        ((zh5.l0) ((e60.d1) i95.n0.c(e60.d1.class))).getClass();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.media.MediaGalleryContainerUI.class);
        intent.putParcelableArrayListExtra("key_media_gallery_data", new java.util.ArrayList<>(arrayList));
        intent.putExtra("key_media_gallery_config", t0Var);
        pf5.j0.a(intent, ei5.a.class);
        e60.u0 u0Var = t0Var.f249739m;
        intent.putExtra("img_gallery_left", u0Var.f249740d);
        intent.putExtra("img_gallery_top", u0Var.f249741e);
        intent.putExtra("img_gallery_width", u0Var.f249742f);
        intent.putExtra("img_gallery_height", u0Var.f249743g);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/ui/media/common/MediaGalleryServiceImpl", "openFlutterGallery", "(Landroid/content/Context;Lcom/tencent/mm/feature/gallery/api/GalleryConfig;Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/media/common/MediaGalleryServiceImpl", "openFlutterGallery", "(Landroid/content/Context;Lcom/tencent/mm/feature/gallery/api/GalleryConfig;Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.pigeon.mm_foundation.RouterPluginApi
    public void launchSnsPost(com.tencent.pigeon.mm_foundation.SnsPostLaunchRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchUserProfile(" + request.getUsername() + ", " + request.getLocalId() + ')');
        android.app.Activity activity = this.f39271d;
        if (activity == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(activity, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        intent.putExtra("INTENT_TALKER", request.getUsername());
        intent.putExtra("INTENT_SNS_LOCAL_ID", request.getLocalId());
        intent.putExtra("INTENT_FROMGALLERY", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(1);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/FlutterRouterPlugin", "launchSnsPost", "(Lcom/tencent/pigeon/mm_foundation/SnsPostLaunchRequest;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // com.tencent.pigeon.mm_foundation.RouterPluginApi
    public void launchTingCategory(com.tencent.pigeon.mm_foundation.TingCategoryLaunchRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchTingCategory(data size=" + request.getCategoryItemData().length + ')');
        android.app.Activity activity = this.f39271d;
        if (activity == null) {
            return;
        }
        bw5.o50 parseFrom = new bw5.o50().parseFrom(request.getCategoryItemData());
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        kotlin.jvm.internal.o.d(parseFrom);
        qk.f9.c(aj6, activity, parseFrom, null, null, null, 28, null);
    }

    @Override // com.tencent.pigeon.mm_foundation.RouterPluginApi
    public boolean launchTingForFile(com.tencent.pigeon.mm_foundation.TingForFileLaunchRequest request) {
        int i17;
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchTingForFile(filePath=" + request.getFilePath() + ", fileExt=" + request.getFileExt() + ", fileName=" + request.getFileName() + ", tingScene=" + request.getTingScene() + ')');
        android.app.Activity activity = this.f39271d;
        if (activity == null) {
            return false;
        }
        java.lang.String i18 = com.tencent.mm.vfs.w6.i(request.getFilePath(), false);
        if (!com.tencent.mm.vfs.w6.j(i18)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterRouterPlugin", "launchTingForFile filePath not exist: " + i18);
            return false;
        }
        ef0.f2 f2Var = (ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class));
        if (f2Var.Ai(request.getFileExt())) {
            bw5.l80 wi6 = f2Var.wi(request.getFilePath(), request.getFileExt(), request.getFileName(), null);
            java.lang.Long tingScene = request.getTingScene();
            if (tingScene != null) {
                i17 = (int) tingScene.longValue();
            } else {
                bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                i17 = 0;
            }
            if (f2Var.Ni(wi6, new il4.e(null, 0, i17, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554419, null))) {
                return true;
            }
        }
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        java.lang.String fileName = request.getFileName();
        if (fileName == null) {
            fileName = "";
        }
        java.lang.String str = fileName;
        if (str.length() > 0) {
            java.lang.String filePath = request.getFilePath();
            java.lang.String fileExt = request.getFileExt();
            ((ht.a) vVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.f.i(activity, 0L, "", filePath, fileExt, str, 1);
        } else {
            ((ht.a) vVar).wi(activity, request.getFilePath(), request.getFileExt(), 1);
        }
        return true;
    }

    @Override // com.tencent.pigeon.mm_foundation.RouterPluginApi
    public void launchTingPlayer(com.tencent.pigeon.mm_foundation.TingPlayerLaunchRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchTingPlayer(autoPlay=" + request.getAutoPlay() + ", data size=" + request.getTingItemData().length + ')');
        android.app.Activity activity = this.f39271d;
        if (activity == null) {
            return;
        }
        qk.f9.b(((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj(), activity, request.getAutoPlay(), new bw5.lp0().parseFrom(request.getTingItemData()), new il4.e(null, 0, 1300, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554419, null), null, null, bw5.ar0.TingScene_Chat, null, 176, null);
    }

    @Override // com.tencent.pigeon.mm_foundation.RouterPluginApi
    public void launchUserProfile(com.tencent.pigeon.mm_foundation.UserProfileLaunchRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchUserProfile(" + request.getUsername() + ')');
        android.app.Activity activity = this.f39271d;
        if (activity == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        java.util.Map map = com.tencent.mm.plugin.profile.ui.ContactInfoUI.U;
        intent.setClass(activity, com.tencent.mm.plugin.profile.ui.ContactInfoUI.class);
        intent.putExtra("Contact_User", request.getUsername());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/FlutterRouterPlugin", "launchUserProfile", "(Lcom/tencent/pigeon/mm_foundation/UserProfileLaunchRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/FlutterRouterPlugin", "launchUserProfile", "(Lcom/tencent/pigeon/mm_foundation/UserProfileLaunchRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f39271d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.RouterPluginApi.Companion companion = com.tencent.pigeon.mm_foundation.RouterPluginApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.RouterPluginApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f39271d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f39271d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.RouterPluginApi.Companion companion = com.tencent.pigeon.mm_foundation.RouterPluginApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.RouterPluginApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f39271d = binding.getActivity();
    }
}
