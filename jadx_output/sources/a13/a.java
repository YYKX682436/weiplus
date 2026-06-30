package a13;

/* loaded from: classes11.dex */
public final class a implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.flutter_voip.RouterPluginApi, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f533d;

    @Override // com.tencent.pigeon.flutter_voip.RouterPluginApi
    public void launchDoubleLinkSettings() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchDoubleLinkSettings()");
        android.content.Intent intent = new android.content.Intent();
        android.app.Activity activity = this.f533d;
        if (activity == null) {
            return;
        }
        intent.setClassName(activity, "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera");
        intent.putExtra("activity_caller_params", 1);
        intent.setFlags(268435456);
        android.app.Activity activity2 = this.f533d;
        if (activity2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterRouterPlugin", "launchDoubleLinkSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity2, "com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterRouterPlugin", "launchDoubleLinkSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.tencent.pigeon.flutter_voip.RouterPluginApi
    public void launchFinderFeed(com.tencent.pigeon.flutter_voip.FinderFeedLaunchRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchFinderFeed(" + request.getFeedId() + ", " + request.getNonceId() + ')');
        android.app.Activity activity = this.f533d;
        if (activity == null) {
            return;
        }
        if (request.getFromRingtone()) {
            gq4.a aVar = gq4.v.Bi().f176559b;
            java.lang.String str = aVar != null ? ((com.tencent.mm.plugin.voip.model.d0) aVar).f176383p : null;
            mx3.f0 f0Var = mx3.f0.f332548a;
            vx3.i iVar = (vx3.i) mx3.f0.f332551d.getValue();
            if (str == null || iVar == null) {
                return;
            }
            mx3.s.a(mx3.u.f332620f, activity, 2, str, 9, false, iVar, 16, null);
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

    @Override // com.tencent.pigeon.flutter_voip.RouterPluginApi
    public void launchSnsPost(com.tencent.pigeon.flutter_voip.SnsPostLaunchRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchUserProfile(" + request.getUsername() + ", " + request.getLocalId() + ')');
        android.app.Activity activity = this.f533d;
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
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterRouterPlugin", "launchSnsPost", "(Lcom/tencent/pigeon/flutter_voip/SnsPostLaunchRequest;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // com.tencent.pigeon.flutter_voip.RouterPluginApi
    public void launchUserProfile(com.tencent.pigeon.flutter_voip.UserProfileLaunchRequest request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterRouterPlugin", "launchUserProfile(" + request.getUsername() + ')');
        android.app.Activity activity = this.f533d;
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
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterRouterPlugin", "launchUserProfile", "(Lcom/tencent/pigeon/flutter_voip/UserProfileLaunchRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterRouterPlugin", "launchUserProfile", "(Lcom/tencent/pigeon/flutter_voip/UserProfileLaunchRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f533d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.flutter_voip.RouterPluginApi.Companion companion = com.tencent.pigeon.flutter_voip.RouterPluginApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_voip.RouterPluginApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f533d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f533d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f533d = binding.getActivity();
    }
}
