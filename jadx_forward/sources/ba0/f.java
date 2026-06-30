package ba0;

/* loaded from: classes9.dex */
public final class f extends g31.l {
    public f(k31.h hVar) {
        super(hVar);
    }

    @Override // e31.k
    public void b(android.content.Context context, int i17, java.lang.String bizUsername, java.lang.String nickname, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11164x65f4bfb7.class);
        intent.putExtra("key_biz_username", bizUsername);
        intent.putExtra("key_biz_nickname", nickname);
        intent.putExtra("key_biz_presenter_class", "com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter");
        intent.putExtra("key_need_update", true);
        intent.putExtra("key_need_load_from_remote", true);
        intent.putExtra("key_enter_scene", i17);
        j45.l.u(context, "com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI", intent, null);
    }
}
