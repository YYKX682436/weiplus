package a13;

/* loaded from: classes11.dex */
public final class a implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24121xc81ac47e, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f82066d;

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24121xc81ac47e
    /* renamed from: launchDoubleLinkSettings */
    public void mo256x287c4dc1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchDoubleLinkSettings()");
        android.content.Intent intent = new android.content.Intent();
        android.app.Activity activity = this.f82066d;
        if (activity == null) {
            return;
        }
        intent.setClassName(activity, "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera");
        intent.putExtra("activity_caller_params", 1);
        intent.setFlags(268435456);
        android.app.Activity activity2 = this.f82066d;
        if (activity2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterRouterPlugin", "launchDoubleLinkSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity2, "com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterRouterPlugin", "launchDoubleLinkSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24121xc81ac47e
    /* renamed from: launchFinderFeed */
    public void mo257xfe8a8af7(com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24116xaf7f72b8 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchFinderFeed(" + request.m89363x18e4224f() + ", " + request.m89365xbc613d34() + ')');
        android.app.Activity activity = this.f82066d;
        if (activity == null) {
            return;
        }
        if (request.m89364x86b2ffe2()) {
            gq4.a aVar = gq4.v.Bi().f258092b;
            java.lang.String str = aVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0) aVar).f257916p : null;
            mx3.f0 f0Var = mx3.f0.f414081a;
            vx3.i iVar = (vx3.i) mx3.f0.f414084d.mo3195x754a37bb();
            if (str == null || iVar == null) {
                return;
            }
            mx3.s.a(mx3.u.f414153f, activity, 2, str, 9, false, iVar, 16, null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_user", c01.z1.r());
        intent.putExtra("feed_object_id", request.m89363x18e4224f());
        intent.putExtra("feed_object_nonceId", request.m89365xbc613d34());
        intent.putExtra("key_session_id", c01.id.a());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(33, 2, 25, intent);
        intent.putExtra("key_comment_scene", 25);
        intent.putExtra("key_extra_info", "");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.b(ya2.e1.f542005a, activity, intent, false, 4, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24121xc81ac47e
    /* renamed from: launchSnsPost */
    public void mo258x70c305(com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24128x6b5e5824 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchUserProfile(" + request.m89430x6c03c64c() + ", " + request.m89429x51f8f5b0() + ')');
        android.app.Activity activity = this.f82066d;
        if (activity == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(activity, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        intent.putExtra("INTENT_TALKER", request.m89430x6c03c64c());
        intent.putExtra("INTENT_SNS_LOCAL_ID", request.m89429x51f8f5b0());
        intent.putExtra("INTENT_FROMGALLERY", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(1);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterRouterPlugin", "launchSnsPost", "(Lcom/tencent/pigeon/flutter_voip/SnsPostLaunchRequest;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24121xc81ac47e
    /* renamed from: launchUserProfile */
    public void mo259x3a53b1ab(com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24131x7cb638be request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterRouterPlugin", "launchUserProfile(" + request.m89474x6c03c64c() + ')');
        android.app.Activity activity = this.f82066d;
        if (activity == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.U;
        intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.class);
        intent.putExtra("Contact_User", request.m89474x6c03c64c());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterRouterPlugin", "launchUserProfile", "(Lcom/tencent/pigeon/flutter_voip/UserProfileLaunchRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/flutter/voip/flutterplugin/FlutterRouterPlugin", "launchUserProfile", "(Lcom/tencent/pigeon/flutter_voip/UserProfileLaunchRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f82066d = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24121xc81ac47e.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24121xc81ac47e.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24121xc81ac47e.Companion.m89418x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f82066d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f82066d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f82066d = binding.mo137508x19263085();
    }
}
