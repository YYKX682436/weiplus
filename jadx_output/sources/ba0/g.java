package ba0;

/* loaded from: classes9.dex */
public final class g extends g31.l {
    public g(k31.h hVar) {
        super(hVar);
    }

    @Override // e31.k
    public void b(android.content.Context context, int i17, java.lang.String bizUsername, java.lang.String nickname, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgFeatureService", "goToSettingManagerUI bizUsername: %s, nickname: %s", bizUsername, nickname);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI.class);
        intent.putExtra("key_biz_username", bizUsername);
        intent.putExtra("key_biz_nickname", nickname);
        intent.putExtra("key_enter_scene", i17);
        intent.putExtra("service_notify_session_id", str);
        intent.putExtra("key_biz_presenter_class", i31.i.class.getName());
        if (!(context instanceof android.app.Activity)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/msgsubscription/SubscribeMsgFeatureService$createInstanceForWxa$1", "goToSettingManagerUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/msgsubscription/SubscribeMsgFeatureService$createInstanceForWxa$1", "goToSettingManagerUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(100);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/feature/msgsubscription/SubscribeMsgFeatureService$createInstanceForWxa$1", "goToSettingManagerUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
