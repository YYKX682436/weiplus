package ba0;

/* loaded from: classes9.dex */
public final class f extends g31.l {
    public f(k31.h hVar) {
        super(hVar);
    }

    @Override // e31.k
    public void b(android.content.Context context, int i17, java.lang.String bizUsername, java.lang.String nickname, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI.class);
        intent.putExtra("key_biz_username", bizUsername);
        intent.putExtra("key_biz_nickname", nickname);
        intent.putExtra("key_biz_presenter_class", "com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter");
        intent.putExtra("key_need_update", true);
        intent.putExtra("key_need_load_from_remote", true);
        intent.putExtra("key_enter_scene", i17);
        j45.l.u(context, "com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI", intent, null);
    }
}
